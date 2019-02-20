package App.Checker;

import java.util.List;

import App.Planet;

public interface IChain {

		void setNextChain(IChain nextChain);
		
		void check(List<Planet> cur);
}
