package Dao;

import java.util.List;

import Model.art;
import Model.artComment;
import Model.artRecomment;
import Model.pay;

public interface artDao {

	public List<art>	searchArt(String searchWord, int type);
	public List<art>	selectTopArt(String genre);
	public List<art>	selectRecentArt(String genre);
	public art	selectOneArt(int no);
	public int	insertArtPay(pay pay);
	public int	insertArtComment(artComment artComment);
	public int	insertArtRecomment(artRecomment artRecomment);
	public List<artComment>	selectArtComment(int no);
	public List<artRecomment>	selectArtRecomment(int commentNo);

	
}
