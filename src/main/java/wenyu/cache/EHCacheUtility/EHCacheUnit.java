package wenyu.cache.EHCacheUtility;

import net.sf.ehcache.store.MemoryStoreEvictionPolicy;

public class EHCacheUnit {
	String cacheName = null;
	int maxEnrty = 0;
	MemoryStoreEvictionPolicy policy = null;
	long timeToLive = 0;
	long timeToIdle = 0;
	Refresher ref = null;
	
	public EHCacheUnit(String name, int maxEtry, MemoryStoreEvictionPolicy policy, long timeToLive, long timeToIdle, Refresher ref) {
		this.cacheName = name;
		this.maxEnrty = maxEtry;
		this.policy = policy;
		this.timeToLive = timeToLive;
		this.timeToIdle = timeToIdle;
		this.ref = ref;
	}
}
