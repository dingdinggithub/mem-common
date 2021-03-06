package com.kevin.common.domain.response;


import com.kevin.common.exception.BaseExceptionCode;

import java.util.List;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:26
 * @Description 分页查询的时候使用
 */
public class PageQueryResponse<T> extends BaseResponse<List<T>> {

    private static final long serialVersionUID = -8937008601803151631L;
    /**
     * 页号（页码）
     */
    private int pageIndex;

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 页面大小
     */
    private int pageSize;

    /**
     * 设置成功的分页查询结果(非静态方法)
     *
     * @param model      业务数据
     * @param pageIndex  页号
     * @param totalCount 总记录数
     * @param pageSize   页面大小
     * @return
     */
    public PageQueryResponse<T> successPage(List<T> model, int pageIndex, int totalCount, int pageSize) {
        this.setSuccess(true);
        this.setModel(model);
        this.setPageIndex(pageIndex);
        this.setTotalCount(totalCount);
        this.setPageSize(pageSize);
        return this;
    }

    /**
     * 创建成功的分页结果静态方法
     *
     * @param model 业务参数
     * @param <T>
     * @return
     */
    public static <T> PageQueryResponse<T> createSuccessResult(List<T> model) {
        PageQueryResponse<T> rt = new PageQueryResponse<T>();
        return (PageQueryResponse<T>) rt.success(model);
    }


    /**
     * 创建成功的分页结果静态方法
     *
     * @param model      业务参数
     * @param pageIndex  页号
     * @param totalCount 总记录数
     * @param pageSize   页面大小
     * @param <T>
     * @return
     */
    public static <T> PageQueryResponse<T> createSuccessResult(List<T> model, int pageIndex, int totalCount, int pageSize) {
        PageQueryResponse<T> rt = new PageQueryResponse<T>();
        return rt.successPage(model, pageIndex, totalCount, pageSize);
    }

    /**
     * 创建失败的分页结果静态方法
     *
     * @param model
     * @param errorCode 错误码
     * @param errorMsg
     * @param isRetry   是否重试
     * @param <T>
     * @return
     */
    public static <T> PageQueryResponse<T> createPageFailResult(List<T> model, BaseExceptionCode errorCode, String errorMsg) {
        PageQueryResponse<T> rt = new PageQueryResponse<T>();
        rt.setModel(model);
        rt.fail(errorCode, errorMsg);
        return rt;
    }

    /**
     * 创建失败的分页结果静态方法
     *
     * @param errorCode 错误码
     * @param isRetry   是否重试
     * @return
     */
    public static <T> PageQueryResponse<T> createPageFailResult(BaseExceptionCode errorCode, boolean isRetry) {
        PageQueryResponse<T> rt = new PageQueryResponse<T>();
        return (PageQueryResponse<T>) rt.fail(errorCode);
    }

    /**
     * 创建失败的分页结果静态方法
     *
     * @param errorCode 错误码
     * @param isRetry   是否重试
     * @return
     */
    public static <T> PageQueryResponse<T> createPageFailResult(BaseExceptionCode errorCode, String errorMsg, boolean isRetry) {
        PageQueryResponse<T> rt = new PageQueryResponse<T>();
        rt.setModel(null);
        return (PageQueryResponse<T>) rt.fail(errorCode, errorMsg);
    }


    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return pageIndex < 1 ? 1 : pageIndex;
    }


    public boolean hasNext() {
        int useCount = (getCurrentPage() - 1) * getPageSize() + getSize();
        return totalCount > useCount;
    }

    public int getTotalPage() {
        if (pageSize == 0) {
            return 0;
        }
        return ((totalCount - 1) / pageSize) + 1;
    }

    private int getSize() {
        List<T> page = getModel();
        if (page == null) {
            return 0;
        } else {
            return page.size();
        }
    }


}
