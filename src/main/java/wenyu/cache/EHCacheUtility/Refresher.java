package wenyu.cache.EHCacheUtility;

public interface Refresher {
	public abstract Object refresh(String key);
}