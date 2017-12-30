package cn.et.lesson03.food.utils;

import java.util.List;


public class PageTools {

   public PageTools(Integer curPage,Integer totalCount,Integer pageCount){
       this.curPage=curPage;
       this.total=totalCount;
       this.pageCount=pageCount==null?this.pageCount:pageCount;
       this.prePage=(curPage==1?1:curPage-1);
       this.totalPage=totalCount%this.pageCount==0?totalCount/this.pageCount:totalCount/this.pageCount+1;
       this.nextPage=(curPage==totalPage)?totalPage:(curPage+1);
       this.startIndex=(curPage-1)*this.pageCount+1;
       this.endIndex=curPage*this.pageCount ; 
   }
 
   private Integer curPage;

   private Integer pageCount=10;

   private Integer prePage;

   private Integer nextPage;

   private Integer totalPage;
  
   private Integer total;
   
   private Integer startIndex;
   
   private Integer endIndex;
   
   
   private List rows;
   
    public Integer getCurPage() {
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getPrePage() {
		return prePage;
	}

	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}
	
	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
    * 2017锟斤拷10锟斤拷11锟斤拷  Administrator
    * select * from ()
    * 
    * 
    * 
    **/
    public static void main(String[] args) {
        int curPage=3;
        int totalCount=26;
        int pageCount=5;
        PageTools pt=new PageTools(curPage, totalCount, pageCount);
        
        System.out.println(pt.getNextPage());
        System.out.println(pt.getPrePage());
        System.out.println(pt.getTotalPage());
        System.out.println(pt.getStartIndex());
        System.out.println(pt.getEndIndex());
        
    }
   
   
    
}
