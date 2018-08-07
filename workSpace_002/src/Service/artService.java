package Service;

import java.util.List;

import Model.art;
import Model.artComment;
import Model.artRecomment;
import Model.pay;

public interface artService {

	public	List<art>	searchArt	(String searchWord, int type);
	public	List<art>	selectTopArt	(String genre);
	public	List<art>	selectRecentArt	(String genre);
	public	art	selectOneArt	(int no);
	public	int	insertArtPay	(pay pay);
	public	int	insertArtComment	(int no);
	public	int	insertArtRecomment	(int commentNo);
	public	List<artComment>	selectArtComment	(int no);
	public	List<artRecomment>	selectArtRecomment	(int commentNo);

	
	
}
