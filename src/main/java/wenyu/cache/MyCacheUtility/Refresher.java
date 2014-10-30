package wenyu.cache.MyCacheUtility;

public interface Refresher {
	public abstract Object refresh(String key);
}