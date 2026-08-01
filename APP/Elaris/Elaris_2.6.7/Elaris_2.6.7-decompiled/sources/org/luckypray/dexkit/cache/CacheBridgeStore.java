package org.luckypray.dexkit.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0241h2;
import p000.AbstractC0260i5;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0021b4;
import p000.C0249ha;
import p000.C0409pc;
import p000.C0425qc;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeStore {
    private static final String CACHE_NON_UNIQUE = "CACHE_NON_UNIQUE";
    private static final String CACHE_NO_RESULT = "CACHE_NO_RESULT";
    public static final CacheBridgeStore INSTANCE = new CacheBridgeStore();

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class LoadResult<T> {
        private final Object result;
        private final DexKitCacheBridge.ResultSource source;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public LoadResult(DexKitCacheBridge.ResultSource resultSource, Object obj) {
            resultSource.getClass();
            this.source = resultSource;
            this.result = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ LoadResult copy$default(LoadResult loadResult, DexKitCacheBridge.ResultSource resultSource, C0425qc c0425qc, int i, Object obj) {
            if ((i & 1) != 0) {
                resultSource = loadResult.source;
            }
            if ((i & 2) != 0) {
                c0425qc = new C0425qc(loadResult.result);
            }
            return loadResult.copy(resultSource, c0425qc.f766a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexKitCacheBridge.ResultSource component1() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: component2-d1pmJ48, reason: not valid java name */
        public final Object m1229component2d1pmJ48() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final LoadResult<T> copy(DexKitCacheBridge.ResultSource resultSource, Object obj) {
            resultSource.getClass();
            return new LoadResult<>(resultSource, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadResult)) {
                return false;
            }
            LoadResult loadResult = (LoadResult) obj;
            return this.source == loadResult.source && AbstractC0260i5.m643p(this.result, loadResult.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: getResult-d1pmJ48, reason: not valid java name */
        public final Object m1230getResultd1pmJ48() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexKitCacheBridge.ResultSource getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            Object obj = this.result;
            return (obj == null ? 0 : obj.hashCode()) + iHashCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "LoadResult(source=" + this.source + ", result=" + C0425qc.m820b(this.result) + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public enum SingleResolveMode {
        REQUIRED,
        NULLABLE
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            int[] iArr = new int[DexKitCacheBridge.CacheFailurePolicy.values().length];
            try {
                iArr[DexKitCacheBridge.CacheFailurePolicy.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DexKitCacheBridge.CacheFailurePolicy.QUERY_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DexKitCacheBridge.CacheFailurePolicy.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SingleResolveMode.values().length];
            try {
                iArr2[SingleResolveMode.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SingleResolveMode.REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private CacheBridgeStore() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final <U extends ISerializable> C0425qc getCachedList$innerGet$10(DexKitCacheBridge.Cache cache, String str, boolean z) {
        List<String> stringList = cache.getStringList(str, null);
        if (stringList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(stringList));
        Iterator<T> it = stringList.iterator();
        while (it.hasNext()) {
            arrayList.add(ISerializable.Companion.deserializeAs((String) it.next()));
        }
        if (!arrayList.isEmpty() || z) {
            return new C0425qc(arrayList);
        }
        return new C0425qc(new C0409pc(new IllegalStateException("cached empty for key: " + str + " but empty not allowed")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ LoadResult getCachedMap$default(CacheBridgeStore cacheBridgeStore, DexKitCacheBridge.Cache cache, ReentrantReadWriteLock reentrantReadWriteLock, DexKitCacheBridge.CachePolicy cachePolicy, String str, InterfaceC0279j5 interfaceC0279j5, InterfaceC0279j5 interfaceC0279j52, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC0279j52 = null;
        }
        return cacheBridgeStore.getCachedMap(cache, reentrantReadWriteLock, cachePolicy, str, interfaceC0279j5, interfaceC0279j52);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x006d */
    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r5v6. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [pc] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    private static final <U extends ISerializable> Map<String, List<U>> getCachedMap$innerGetMap(DexKitCacheBridge.Cache cache, String str) {
        List<String> stringList;
        ?? c0409pc;
        List<String> stringList2 = cache.getStringList(CacheBridgeKeys.INSTANCE.mapGroupsKey(str), null);
        if (stringList2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(stringList2.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(stringList2.size());
            for (String str2 : stringList2) {
                if (linkedHashSet.add(str2) && (stringList = cache.getStringList(CacheBridgeKeys.INSTANCE.mapGroupKey(str, str2), null)) != null) {
                    try {
                        c0409pc = new ArrayList(AbstractC0276j2.m703i2(stringList));
                        Iterator it = stringList.iterator();
                        while (it.hasNext()) {
                            c0409pc.add(ISerializable.Companion.deserializeAs((String) it.next()));
                        }
                    } catch (Throwable th) {
                        c0409pc = new C0409pc(th);
                    }
                    if (C0425qc.m819a(c0409pc) == null) {
                        linkedHashMap.put(str2, (List) c0409pc);
                    }
                }
            }
            return linkedHashMap;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final <U extends ISerializable> SingleOutcome<U> getCachedSingle$innerGet(DexKitCacheBridge.Cache cache, String str) {
        String string = cache.getString(str, null);
        if (string != null) {
            return INSTANCE.parseSingleOutcome(string);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ISerializable> SingleOutcome<T> parseSingleOutcome(String str) {
        int i = 1;
        NoResultException noResultException = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (AbstractC0260i5.m643p(str, CACHE_NO_RESULT)) {
            return new SingleOutcome.NoResult(noResultException, i, objArr3 == true ? 1 : 0);
        }
        if (AbstractC0260i5.m643p(str, CACHE_NON_UNIQUE)) {
            return new SingleOutcome.NonUnique(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        ISerializable iSerializableDeserializeAs = ISerializable.Companion.deserializeAs(str);
        iSerializableDeserializeAs.getClass();
        return new SingleOutcome.Value(iSerializableDeserializeAs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: resolveSingleOutcome-gIAlu-s, reason: not valid java name */
    private final <T extends ISerializable> Object m1228resolveSingleOutcomegIAlus(SingleOutcome<? extends T> singleOutcome, SingleResolveMode singleResolveMode) {
        if (singleOutcome instanceof SingleOutcome.Value) {
            return ((SingleOutcome.Value) singleOutcome).getValue();
        }
        if (singleOutcome instanceof SingleOutcome.NoResult) {
            int i = WhenMappings.$EnumSwitchMapping$1[singleResolveMode.ordinal()];
            if (i == 1) {
                return null;
            }
            if (i != 2) {
                throw new C0249ha();
            }
            NoResultException exception = ((SingleOutcome.NoResult) singleOutcome).getException();
            exception.getClass();
            return new C0409pc(exception);
        }
        if (!(singleOutcome instanceof SingleOutcome.NonUnique)) {
            throw new C0249ha();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[singleResolveMode.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 != 2) {
            throw new C0249ha();
        }
        NonUniqueResultException exception2 = ((SingleOutcome.NonUnique) singleOutcome).getException();
        exception2.getClass();
        return new C0409pc(exception2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T extends ISerializable> LoadResult<List<T>> getCachedList(DexKitCacheBridge.Cache cache, ReentrantReadWriteLock reentrantReadWriteLock, DexKitCacheBridge.CachePolicy cachePolicy, String str, boolean z, InterfaceC0279j5 interfaceC0279j5, InterfaceC0279j5 interfaceC0279j52) {
        Object c0409pc;
        Object c0409pc2;
        cache.getClass();
        reentrantReadWriteLock.getClass();
        cachePolicy.getClass();
        str.getClass();
        interfaceC0279j5.getClass();
        interfaceC0279j5.invoke();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            C0425qc cachedList$innerGet$10 = getCachedList$innerGet$10(cache, str, z);
            if (cachedList$innerGet$10 != null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, cachedList$innerGet$10.f766a);
            }
            if (interfaceC0279j52 == null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, new C0409pc(new NoSuchElementException("no found cache for key: ".concat(str))));
            }
            try {
                c0409pc = (List) interfaceC0279j52.invoke();
            } catch (Throwable th) {
                c0409pc = new C0409pc(th);
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C0425qc cachedList$innerGet$102 = getCachedList$innerGet$10(cache, str, z);
                if (cachedList$innerGet$102 != null) {
                    LoadResult<List<T>> loadResult = new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, cachedList$innerGet$102.f766a);
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    return loadResult;
                }
                DexKitCacheBridge.ResultSource resultSource = DexKitCacheBridge.ResultSource.QUERY;
                Throwable thM819a = C0425qc.m819a(c0409pc);
                if (thM819a == null) {
                    List list = (List) c0409pc;
                    if (!list.isEmpty() || z) {
                        c0409pc2 = list;
                        if (cachePolicy.getCacheSuccess()) {
                            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ISerializable) it.next()).serialize());
                            }
                            cache.putStringList(str, arrayList);
                            c0409pc2 = list;
                        }
                    } else {
                        c0409pc2 = new C0409pc(new IllegalStateException("query returned empty for key: " + str + " but empty not allowed"));
                    }
                } else {
                    c0409pc2 = new C0409pc(thM819a);
                }
                LoadResult<List<T>> loadResult2 = new LoadResult<>(resultSource, c0409pc2);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return loadResult2;
            } catch (Throwable th2) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th2;
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:92:0x0146 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, org.luckypray.dexkit.DexKitCacheBridge$Cache] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final <T extends ISerializable> LoadResult<Map<String, List<T>>> getCachedMap(DexKitCacheBridge.Cache cache, ReentrantReadWriteLock reentrantReadWriteLock, DexKitCacheBridge.CachePolicy cachePolicy, String str, InterfaceC0279j5 interfaceC0279j5, InterfaceC0279j5 interfaceC0279j52) {
        Object c0409pc;
        Object c0409pc2;
        cache.getClass();
        reentrantReadWriteLock.getClass();
        cachePolicy.getClass();
        str.getClass();
        interfaceC0279j5.getClass();
        interfaceC0279j5.invoke();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            Map cachedMap$innerGetMap = getCachedMap$innerGetMap(cache, str);
            if (cachedMap$innerGetMap != null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, cachedMap$innerGetMap);
            }
            if (interfaceC0279j52 == null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, new C0409pc(new NoSuchElementException("no found cache for key: ".concat(str))));
            }
            try {
                c0409pc = (Map) interfaceC0279j52.invoke();
            } catch (Throwable th) {
                c0409pc = new C0409pc(th);
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                Map cachedMap$innerGetMap2 = getCachedMap$innerGetMap(cache, str);
                if (cachedMap$innerGetMap2 != null) {
                    LoadResult<Map<String, List<T>>> loadResult = new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, cachedMap$innerGetMap2);
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    return loadResult;
                }
                DexKitCacheBridge.ResultSource resultSource = DexKitCacheBridge.ResultSource.QUERY;
                Throwable thM819a = C0425qc.m819a(c0409pc);
                if (thM819a == null) {
                    Map map = (Map) c0409pc;
                    List<String> stringList = cache.getStringList(CacheBridgeKeys.INSTANCE.mapGroupsKey(str), null);
                    ?? arrayList = C0021b4.f57a;
                    ?? r2 = stringList;
                    if (stringList == null) {
                        r2 = arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    c0409pc2 = map;
                    if (cachePolicy.getCacheSuccess()) {
                        for (Map.Entry entry : map.entrySet()) {
                            String str2 = (String) entry.getKey();
                            List list = (List) entry.getValue();
                            arrayList2.add(str2);
                            String strMapGroupKey = CacheBridgeKeys.INSTANCE.mapGroupKey(str, str2);
                            ArrayList arrayList3 = new ArrayList(AbstractC0276j2.m703i2(list));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((ISerializable) it.next()).serialize());
                            }
                            cache.putStringList(strMapGroupKey, arrayList3);
                        }
                        Set setM471n2 = AbstractC0241h2.m471n2(arrayList2);
                        if (setM471n2.isEmpty()) {
                            int size = r2.size();
                            if (size != 0) {
                                arrayList = size != 1 ? new ArrayList((Collection) r2) : AbstractC0260i5.m567S0(r2.get(0));
                            }
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj : r2) {
                                if (!setM471n2.contains(obj)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            cache.remove(CacheBridgeKeys.INSTANCE.mapGroupKey(str, (String) it2.next()));
                        }
                        cache.putStringList(CacheBridgeKeys.INSTANCE.mapGroupsKey(str), arrayList2);
                        c0409pc2 = map;
                    }
                } else {
                    c0409pc2 = new C0409pc(thM819a);
                }
                LoadResult<Map<String, List<T>>> loadResult2 = new LoadResult<>(resultSource, c0409pc2);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return loadResult2;
            } catch (Throwable th2) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th2;
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T extends ISerializable> LoadResult<T> getCachedSingle(DexKitCacheBridge.Cache cache, ReentrantReadWriteLock reentrantReadWriteLock, DexKitCacheBridge.CachePolicy cachePolicy, String str, SingleResolveMode singleResolveMode, boolean z, InterfaceC0279j5 interfaceC0279j5, InterfaceC0279j5 interfaceC0279j52) {
        Object c0409pc;
        Object c0409pc2;
        cache.getClass();
        reentrantReadWriteLock.getClass();
        cachePolicy.getClass();
        str.getClass();
        singleResolveMode.getClass();
        interfaceC0279j5.getClass();
        interfaceC0279j5.invoke();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            SingleOutcome<? extends T> cachedSingle$innerGet = getCachedSingle$innerGet(cache, str);
            if (cachedSingle$innerGet != null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, INSTANCE.m1228resolveSingleOutcomegIAlus(cachedSingle$innerGet, singleResolveMode));
            }
            if (interfaceC0279j52 == null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, new C0409pc(new NoSuchElementException("no found cache for key: ".concat(str))));
            }
            try {
                c0409pc = (SingleOutcome) interfaceC0279j52.invoke();
            } catch (Throwable th) {
                c0409pc = new C0409pc(th);
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                SingleOutcome<? extends T> cachedSingle$innerGet2 = getCachedSingle$innerGet(cache, str);
                if (cachedSingle$innerGet2 != null) {
                    return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, INSTANCE.m1228resolveSingleOutcomegIAlus(cachedSingle$innerGet2, singleResolveMode));
                }
                DexKitCacheBridge.ResultSource resultSource = DexKitCacheBridge.ResultSource.QUERY;
                Throwable thM819a = C0425qc.m819a(c0409pc);
                if (thM819a == null) {
                    SingleOutcome<? extends T> singleOutcome = (SingleOutcome) c0409pc;
                    if (singleOutcome instanceof SingleOutcome.Value) {
                        if (cachePolicy.getCacheSuccess()) {
                            cache.putString(str, ((SingleOutcome.Value) singleOutcome).getValue().serialize());
                        }
                    } else if (singleOutcome instanceof SingleOutcome.NoResult) {
                        if (z) {
                            cache.putString(str, CACHE_NO_RESULT);
                        }
                    } else if ((singleOutcome instanceof SingleOutcome.NonUnique) && z) {
                        cache.putString(str, CACHE_NON_UNIQUE);
                    }
                    c0409pc2 = INSTANCE.m1228resolveSingleOutcomegIAlus(singleOutcome, singleResolveMode);
                } else {
                    c0409pc2 = new C0409pc(thM819a);
                }
                LoadResult<T> loadResult = new LoadResult<>(resultSource, c0409pc2);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return loadResult;
            } finally {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shouldCacheFailure(DexKitCacheBridge.CachePolicy cachePolicy, boolean z) {
        cachePolicy.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[cachePolicy.getFailurePolicy().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return z;
        }
        if (i == 3) {
            return true;
        }
        throw new C0249ha();
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public interface SingleOutcome<T extends ISerializable> {

        /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
        public static final class Value<T extends ISerializable> implements SingleOutcome<T> {
            private final T value;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Value(T t) {
                t.getClass();
                this.value = t;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Value copy$default(Value value, ISerializable iSerializable, int i, Object obj) {
                if ((i & 1) != 0) {
                    iSerializable = value.value;
                }
                return value.copy(iSerializable);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final T component1() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Value<T> copy(T t) {
                t.getClass();
                return new Value<>(t);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Value) && AbstractC0260i5.m643p(this.value, ((Value) obj).value);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final T getValue() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public int hashCode() {
                return this.value.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return "Value(value=" + this.value + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
        public static final class NoResult implements SingleOutcome {
            private final NoResultException exception;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:org.luckypray.dexkit.exceptions.NoResultException:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (wrap:org.luckypray.dexkit.exceptions.NoResultException:0x0008: CONSTRUCTOR ("No result found for query") A[MD:(java.lang.String):void (m), WRAPPED] (LINE:9) call: org.luckypray.dexkit.exceptions.NoResultException.<init>(java.lang.String):void type: CONSTRUCTOR) : (r1v0 org.luckypray.dexkit.exceptions.NoResultException))
 A[MD:(org.luckypray.dexkit.exceptions.NoResultException):void (m)] (LINE:12) call: org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult.<init>(org.luckypray.dexkit.exceptions.NoResultException):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ NoResult(NoResultException noResultException, int i, AbstractC0431r2 abstractC0431r2) {
                this((i & 1) != 0 ? new NoResultException("No result found for query") : noResultException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public static /* synthetic */ NoResult copy$default(NoResult noResult, NoResultException noResultException, int i, Object obj) {
                if ((i & 1) != 0) {
                    noResultException = noResult.exception;
                }
                return noResult.copy(noResultException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final NoResultException component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final NoResult copy(NoResultException noResultException) {
                noResultException.getClass();
                return new NoResult(noResultException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NoResult) && AbstractC0260i5.m643p(this.exception, ((NoResult) obj).exception);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final NoResultException getException() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public int hashCode() {
                return this.exception.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return "NoResult(exception=" + this.exception + ")";
            }

            public NoResult(NoResultException noResultException) {
                noResultException.getClass();
                this.exception = noResultException;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public NoResult() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
        public static final class NonUnique implements SingleOutcome {
            private final NonUniqueResultException exception;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:org.luckypray.dexkit.exceptions.NonUniqueResultException:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (wrap:org.luckypray.dexkit.exceptions.NonUniqueResultException:0x0008: CONSTRUCTOR ("query did not return a unique result") A[MD:(java.lang.String):void (m), WRAPPED] (LINE:9) call: org.luckypray.dexkit.exceptions.NonUniqueResultException.<init>(java.lang.String):void type: CONSTRUCTOR) : (r1v0 org.luckypray.dexkit.exceptions.NonUniqueResultException))
 A[MD:(org.luckypray.dexkit.exceptions.NonUniqueResultException):void (m)] (LINE:12) call: org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique.<init>(org.luckypray.dexkit.exceptions.NonUniqueResultException):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ NonUnique(NonUniqueResultException nonUniqueResultException, int i, AbstractC0431r2 abstractC0431r2) {
                this((i & 1) != 0 ? new NonUniqueResultException("query did not return a unique result") : nonUniqueResultException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public static /* synthetic */ NonUnique copy$default(NonUnique nonUnique, NonUniqueResultException nonUniqueResultException, int i, Object obj) {
                if ((i & 1) != 0) {
                    nonUniqueResultException = nonUnique.exception;
                }
                return nonUnique.copy(nonUniqueResultException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final NonUniqueResultException component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final NonUnique copy(NonUniqueResultException nonUniqueResultException) {
                nonUniqueResultException.getClass();
                return new NonUnique(nonUniqueResultException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NonUnique) && AbstractC0260i5.m643p(this.exception, ((NonUnique) obj).exception);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final NonUniqueResultException getException() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public int hashCode() {
                return this.exception.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return "NonUnique(exception=" + this.exception + ")";
            }

            public NonUnique(NonUniqueResultException nonUniqueResultException) {
                nonUniqueResultException.getClass();
                this.exception = nonUniqueResultException;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public NonUnique() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }
}
