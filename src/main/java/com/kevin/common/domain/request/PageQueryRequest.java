package com.kevin.common.domain.request;

import com.kevin.common.domain.query.BaseQuery;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:25
 * @Description 支持分页查询
 */
public class PageQueryRequest<T> extends BaseQuery<T> {

    /**
     * 默认页面大小
     */
    private static final int DEFAULT_PAGE_SIZE = 20; //

    /**
     * 默认页号
     */
    private static final int DEFAULT_PAGE_INDEX = 1; //

    /**
     * 页面大小最大值
     */
    public static final int MAX_PAGE_SIZE = 500; //

    /**
     * 初始化大小
     */
    private int pageIndex = DEFAULT_PAGE_INDEX;

    /**
     * 默认初始化大小
     */
    private int pageSize = DEFAULT_PAGE_SIZE;

    private boolean queryCount = true; //是否查询总记录数

    /**
     * 页面偏移量
     */
    private int start;

    public int getPageIndex() {
        return this.pageIndex <= 0 ? DEFAULT_PAGE_INDEX : this.pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex <= 0 ? DEFAULT_PAGE_INDEX : pageIndex;
    }

    public int getPageSize() {
        return this.pageSize > 0 && this.pageSize <= MAX_PAGE_SIZE ? this.pageSize : DEFAULT_PAGE_SIZE;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize <= 0 ? DEFAULT_PAGE_SIZE : pageSize;
    }

    public int getStartPos() {
        return (this.getPageIndex() - 1) * this.getPageSize();
    }

    public boolean isQueryCount() {
        return queryCount;
    }

    public void setQueryCount(boolean queryCount) {
        this.queryCount = queryCount;
    }

    public boolean getQueryCount() {
        return this.queryCount;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
