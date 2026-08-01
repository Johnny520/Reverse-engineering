package org.luckypray.dexkit;

import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.cache.CacheBridgeKeys;
import org.luckypray.dexkit.cache.CacheBridgeRegistry;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.cache.CacheBridgeStore;
import org.luckypray.dexkit.query.BatchFindClassUsingStrings;
import org.luckypray.dexkit.query.BatchFindMethodUsingStrings;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.wrap.DexClass;
import org.luckypray.dexkit.wrap.DexField;
import org.luckypray.dexkit.wrap.DexMethod;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0619pl;
import p000.C0921xc;
import p000.InterfaceC0298hw;
import p000.InterfaceC0742sw;
import p000.InterfaceC0904ww;
import p000.ThreadFactoryC0325in;
import p000.c50;
import p000.cv0;
import p000.p30;
import p000.r41;
import p000.u60;
import p000.w60;
import p000.z60;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge {
    private static final ReentrantReadWriteLock cacheLock;
    private static CachePolicy cachePolicy;
    private static long idleTimeoutMillis;
    private static final CopyOnWriteArraySet<CacheBridgeListener> listeners;
    private static final ScheduledThreadPoolExecutor reaperScheduler;
    public static final DexKitCacheBridge INSTANCE = new DexKitCacheBridge();
    private static final AtomicReference<Cache> cacheRef = new AtomicReference<>(null);

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public interface Cache {
        void clearAll();

        Collection<String> getAllKeys();

        String getString(String str, String str2);

        List<String> getStringList(String str, List<String> list);

        void putString(String str, String str2);

        void putStringList(String str, List<String> list);

        void remove(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static class CacheBridgeListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onBridgeCreated(String str) {
            str.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onBridgeDestroyed(String str) {
            str.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onBridgeReleased(String str) {
            str.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onQueryFailure(QueryFailureEvent queryFailureEvent) {
            queryFailureEvent.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onQuerySuccess(QuerySuccessEvent querySuccessEvent) {
            querySuccessEvent.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public enum CacheFailurePolicy {
        NONE,
        QUERY_ONLY,
        ALL
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class QueryFailureEvent {
        private final String appTag;
        private final Throwable error;
        private final QueryKind queryKind;
        private final String requestKey;
        private final ResultSource source;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public QueryFailureEvent(String str, QueryKind queryKind, String str2, ResultSource resultSource, Throwable th) {
            str.getClass();
            queryKind.getClass();
            resultSource.getClass();
            th.getClass();
            this.appTag = str;
            this.queryKind = queryKind;
            this.requestKey = str2;
            this.source = resultSource;
            this.error = th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ QueryFailureEvent copy$default(QueryFailureEvent queryFailureEvent, String str, QueryKind queryKind, String str2, ResultSource resultSource, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = queryFailureEvent.appTag;
            }
            if ((i & 2) != 0) {
                queryKind = queryFailureEvent.queryKind;
            }
            if ((i & 4) != 0) {
                str2 = queryFailureEvent.requestKey;
            }
            if ((i & 8) != 0) {
                resultSource = queryFailureEvent.source;
            }
            if ((i & 16) != 0) {
                th = queryFailureEvent.error;
            }
            Throwable th2 = th;
            String str3 = str2;
            return queryFailureEvent.copy(str, queryKind, str3, resultSource, th2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String component1() {
            return this.appTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final QueryKind component2() {
            return this.queryKind;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String component3() {
            return this.requestKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ResultSource component4() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Throwable component5() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final QueryFailureEvent copy(String str, QueryKind queryKind, String str2, ResultSource resultSource, Throwable th) {
            str.getClass();
            queryKind.getClass();
            resultSource.getClass();
            th.getClass();
            return new QueryFailureEvent(str, queryKind, str2, resultSource, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueryFailureEvent)) {
                return false;
            }
            QueryFailureEvent queryFailureEvent = (QueryFailureEvent) obj;
            return p30.m3002l(this.appTag, queryFailureEvent.appTag) && this.queryKind == queryFailureEvent.queryKind && p30.m3002l(this.requestKey, queryFailureEvent.requestKey) && this.source == queryFailureEvent.source && p30.m3002l(this.error, queryFailureEvent.error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getAppTag() {
            return this.appTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Throwable getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final QueryKind getQueryKind() {
            return this.queryKind;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getRequestKey() {
            return this.requestKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ResultSource getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            int iHashCode = (this.queryKind.hashCode() + (this.appTag.hashCode() * 31)) * 31;
            String str = this.requestKey;
            return this.error.hashCode() + ((this.source.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "QueryFailureEvent(appTag=" + this.appTag + ", queryKind=" + this.queryKind + ", requestKey=" + this.requestKey + ", source=" + this.source + ", error=" + this.error + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public enum QueryKind {
        METHOD_SINGLE,
        CLASS_SINGLE,
        FIELD_SINGLE,
        METHOD_LIST,
        CLASS_LIST,
        FIELD_LIST,
        METHOD_BATCH,
        CLASS_BATCH
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class QuerySuccessEvent {
        private final String appTag;
        private final int matchCount;
        private final QueryKind queryKind;
        private final String requestKey;
        private final ResultSource source;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public QuerySuccessEvent(String str, QueryKind queryKind, String str2, ResultSource resultSource, int i) {
            str.getClass();
            queryKind.getClass();
            resultSource.getClass();
            this.appTag = str;
            this.queryKind = queryKind;
            this.requestKey = str2;
            this.source = resultSource;
            this.matchCount = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ QuerySuccessEvent copy$default(QuerySuccessEvent querySuccessEvent, String str, QueryKind queryKind, String str2, ResultSource resultSource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = querySuccessEvent.appTag;
            }
            if ((i2 & 2) != 0) {
                queryKind = querySuccessEvent.queryKind;
            }
            if ((i2 & 4) != 0) {
                str2 = querySuccessEvent.requestKey;
            }
            if ((i2 & 8) != 0) {
                resultSource = querySuccessEvent.source;
            }
            if ((i2 & 16) != 0) {
                i = querySuccessEvent.matchCount;
            }
            int i3 = i;
            String str3 = str2;
            return querySuccessEvent.copy(str, queryKind, str3, resultSource, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String component1() {
            return this.appTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final QueryKind component2() {
            return this.queryKind;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String component3() {
            return this.requestKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ResultSource component4() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component5() {
            return this.matchCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final QuerySuccessEvent copy(String str, QueryKind queryKind, String str2, ResultSource resultSource, int i) {
            str.getClass();
            queryKind.getClass();
            resultSource.getClass();
            return new QuerySuccessEvent(str, queryKind, str2, resultSource, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuerySuccessEvent)) {
                return false;
            }
            QuerySuccessEvent querySuccessEvent = (QuerySuccessEvent) obj;
            return p30.m3002l(this.appTag, querySuccessEvent.appTag) && this.queryKind == querySuccessEvent.queryKind && p30.m3002l(this.requestKey, querySuccessEvent.requestKey) && this.source == querySuccessEvent.source && this.matchCount == querySuccessEvent.matchCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getAppTag() {
            return this.appTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getMatchCount() {
            return this.matchCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final QueryKind getQueryKind() {
            return this.queryKind;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getRequestKey() {
            return this.requestKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ResultSource getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            int iHashCode = (this.queryKind.hashCode() + (this.appTag.hashCode() * 31)) * 31;
            String str = this.requestKey;
            return Integer.hashCode(this.matchCount) + ((this.source.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "QuerySuccessEvent(appTag=" + this.appTag + ", queryKind=" + this.queryKind + ", requestKey=" + this.requestKey + ", source=" + this.source + ", matchCount=" + this.matchCount + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public enum ResultSource {
        CACHE,
        QUERY
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05841 extends c50 implements InterfaceC0298hw {
        final /* synthetic */ String $appTag;
        final /* synthetic */ String $path;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05841(String str, String str2) {
            super(0);
            this.$appTag = str;
            this.$path = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0298hw
        public final RecyclableBridge invoke() {
            return RecyclableBridge.Companion.create$dexkit_android_release(this.$appTag, this.$path);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$2 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05852 extends c50 implements InterfaceC0298hw {
        final /* synthetic */ String $appTag;
        final /* synthetic */ byte[][] $dexArray;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05852(String str, byte[][] bArr) {
            super(0);
            this.$appTag = str;
            this.$dexArray = bArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0298hw
        public final RecyclableBridge invoke() {
            return RecyclableBridge.Companion.create$dexkit_android_release(this.$appTag, this.$dexArray);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$3 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05863 extends c50 implements InterfaceC0298hw {
        final /* synthetic */ String $appTag;
        final /* synthetic */ ClassLoader $classLoader;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05863(String str, ClassLoader classLoader) {
            super(0);
            this.$appTag = str;
            this.$classLoader = classLoader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0298hw
        public final RecyclableBridge invoke() {
            return RecyclableBridge.Companion.create$dexkit_android_release(this.$appTag, this.$classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0325in());
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        reaperScheduler = scheduledThreadPoolExecutor;
        cacheLock = new ReentrantReadWriteLock();
        listeners = new CopyOnWriteArraySet<>();
        idleTimeoutMillis = 5000L;
        cachePolicy = new CachePolicy(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DexKitCacheBridge() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void addListener(CacheBridgeListener cacheBridgeListener) {
        cacheBridgeListener.getClass();
        listeners.add(cacheBridgeListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void clearAllCache() {
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            INSTANCE.getCache().clearAll();
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void clearCache(String str) {
        str.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            String str2 = CacheBridgeKeys.INSTANCE.cachePrefixOf(str) + ":";
            for (String str3 : INSTANCE.getCache().getAllKeys()) {
                if (r41.m3382S(str3, str2, false)) {
                    INSTANCE.getCache().remove(str3);
                }
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void clearListeners() {
        listeners.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final RecyclableBridge create(String str, String str2) {
        str.getClass();
        str2.getClass();
        INSTANCE.getCache();
        return CacheBridgeRegistry.INSTANCE.obtainBridge(str, new C05841(str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final Cache getCache() {
        Cache cache = cacheRef.get();
        if (cache != null) {
            return cache;
        }
        C0921xc.m5134o("Wrapper must be init(cache) first");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CachePolicy getCachePolicy() {
        return cachePolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long getIdleTimeoutMillis() {
        return idleTimeoutMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void init(Cache cache) {
        cache.getClass();
        AtomicReference<Cache> atomicReference = cacheRef;
        while (!atomicReference.compareAndSet(null, cache)) {
            if (atomicReference.get() != null) {
                C0921xc.m5134o("DexKitCacheBridge.init(cache) can only be called once");
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void notifyListeners(InterfaceC0742sw interfaceC0742sw) {
        for (CacheBridgeListener cacheBridgeListener : listeners) {
            try {
                cacheBridgeListener.getClass();
                interfaceC0742sw.invoke(cacheBridgeListener);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread reaperScheduler$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "DexKit-Reaper");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void removeListener(CacheBridgeListener cacheBridgeListener) {
        cacheBridgeListener.getClass();
        listeners.remove(cacheBridgeListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void setCachePolicy(CachePolicy cachePolicy2) {
        cachePolicy2.getClass();
        cachePolicy = cachePolicy2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void setIdleTimeoutMillis(long j) {
        idleTimeoutMillis = j;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class RecyclableBridge implements Closeable {
        public static final Companion Companion = new Companion(null);
        private final String appTag;
        private final ClassLoader classLoader;
        private final byte[][] dexArray;
        private final String path;
        private final u60 runtime$delegate;

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BatchFindClassUsingStringsBuilder {
            void build(BatchFindClassUsingStrings batchFindClassUsingStrings);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BatchFindMethodUsingStringsBuilder {
            void build(BatchFindMethodUsingStrings batchFindMethodUsingStrings);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BridgeClassBuilder {
            ClassData build(DexKitBridge dexKitBridge);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BridgeClassesBuilder {
            List<ClassData> build(DexKitBridge dexKitBridge);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BridgeFieldBuilder {
            FieldData build(DexKitBridge dexKitBridge);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BridgeFieldsBuilder {
            List<FieldData> build(DexKitBridge dexKitBridge);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BridgeFunction {
            void apply(DexKitBridge dexKitBridge);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BridgeMethodBuilder {
            MethodData build(DexKitBridge dexKitBridge);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface BridgeMethodsBuilder {
            List<MethodData> build(DexKitBridge dexKitBridge);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface FindClassBuilder {
            void build(FindClass findClass);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface FindFieldBuilder {
            void build(FindField findField);
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public interface FindMethodBuilder {
            void build(FindMethod findMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private RecyclableBridge(String str, String str2, byte[][] bArr, ClassLoader classLoader) {
            this.appTag = str;
            this.path = str2;
            this.dexArray = bArr;
            this.classLoader = classLoader;
            this.runtime$delegate = z60.m5422I(new DexKitCacheBridge$RecyclableBridge$runtime$2(this));
        }

        /* JADX DEBUG: Class process forced to load method for inline: org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(org.luckypray.dexkit.cache.CacheBridgeRuntime):void */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final <R> R acquireBridge(InterfaceC0742sw interfaceC0742sw) {
            DexKitBridge dexKitBridge;
            boolean z;
            CacheBridgeRuntime runtime = getRuntime();
            runtime.beginUse();
            try {
                synchronized (runtime.lifecycleLock) {
                    dexKitBridge = runtime.bridge;
                    if (dexKitBridge == null) {
                        Object objInvoke = runtime.createBridge.invoke();
                        runtime.bridge = (DexKitBridge) objInvoke;
                        dexKitBridge = (DexKitBridge) objInvoke;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    runtime.notifyBridgeCreated.invoke();
                }
                R r = (R) interfaceC0742sw.invoke(dexKitBridge);
                runtime.endUse();
                return r;
            } catch (Throwable th) {
                runtime.endUse();
                throw th;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final DexKitBridge createBridge() {
            String str = this.path;
            if (str != null) {
                return DexKitBridge.Companion.create(str);
            }
            byte[][] bArr = this.dexArray;
            if (bArr != null) {
                return DexKitBridge.Companion.create(bArr);
            }
            ClassLoader classLoader = this.classLoader;
            if (classLoader != null) {
                return DexKitBridge.Companion.create(classLoader, true);
            }
            C0921xc.m5134o("init fail");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void ensureUsable() {
            getRuntime().ensureUsable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Map getBatchUsingStringsClasses$default(RecyclableBridge recyclableBridge, String str, BatchFindClassUsingStringsBuilder batchFindClassUsingStringsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindClassUsingStringsBuilder = null;
            }
            return recyclableBridge.getBatchUsingStringsClasses(str, batchFindClassUsingStringsBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Map getBatchUsingStringsMethods$default(RecyclableBridge recyclableBridge, String str, BatchFindMethodUsingStringsBuilder batchFindMethodUsingStringsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindMethodUsingStringsBuilder = null;
            }
            return recyclableBridge.getBatchUsingStringsMethods(str, batchFindMethodUsingStringsBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexClass getClass$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClass(str, findClassBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexClass getClassDirect$default(RecyclableBridge recyclableBridge, String str, BridgeClassBuilder bridgeClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassBuilder = null;
            }
            return recyclableBridge.getClassDirect(str, bridgeClassBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexClass getClassDirectOrNull$default(RecyclableBridge recyclableBridge, String str, BridgeClassBuilder bridgeClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassBuilder = null;
            }
            return recyclableBridge.getClassDirectOrNull(str, bridgeClassBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexClass getClassOrNull$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClassOrNull(str, findClassBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getClasses$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClasses(str, findClassBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getClassesDirect$default(RecyclableBridge recyclableBridge, String str, BridgeClassesBuilder bridgeClassesBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassesBuilder = null;
            }
            return recyclableBridge.getClassesDirect(str, bridgeClassesBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getClassesDirectOrEmpty$default(RecyclableBridge recyclableBridge, String str, BridgeClassesBuilder bridgeClassesBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassesBuilder = null;
            }
            return recyclableBridge.getClassesDirectOrEmpty(str, bridgeClassesBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getClassesOrEmpty$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClassesOrEmpty(str, findClassBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: getDirectInternalList-yxL6bBk, reason: not valid java name */
        private final <D, R extends ISerializable> Object m5644getDirectInternalListyxL6bBk(QueryKind queryKind, String str, boolean z, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", str, null, 8, null), z, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), interfaceC0742sw != null ? new C0570x87bd6f8e(this, interfaceC0742sw, interfaceC0742sw2) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            return objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: getDirectInternalSingle-yxL6bBk, reason: not valid java name */
        private final <D, R extends ISerializable> Object m5645getDirectInternalSingleyxL6bBk(QueryKind queryKind, String str, CacheBridgeStore.SingleResolveMode singleResolveMode, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", str, null, 8, null);
            C0571x95b222e4 c0571x95b222e4 = interfaceC0742sw != null ? new C0571x95b222e4(this, interfaceC0742sw, interfaceC0742sw2) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c0571x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            return objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexField getField$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getField(str, findFieldBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexField getFieldDirect$default(RecyclableBridge recyclableBridge, String str, BridgeFieldBuilder bridgeFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldBuilder = null;
            }
            return recyclableBridge.getFieldDirect(str, bridgeFieldBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexField getFieldDirectOrNull$default(RecyclableBridge recyclableBridge, String str, BridgeFieldBuilder bridgeFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldBuilder = null;
            }
            return recyclableBridge.getFieldDirectOrNull(str, bridgeFieldBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexField getFieldOrNull$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getFieldOrNull(str, findFieldBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getFields$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getFields(str, findFieldBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getFieldsDirect$default(RecyclableBridge recyclableBridge, String str, BridgeFieldsBuilder bridgeFieldsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldsBuilder = null;
            }
            return recyclableBridge.getFieldsDirect(str, bridgeFieldsBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getFieldsDirectOrEmpty$default(RecyclableBridge recyclableBridge, String str, BridgeFieldsBuilder bridgeFieldsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldsBuilder = null;
            }
            return recyclableBridge.getFieldsDirectOrEmpty(str, bridgeFieldsBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getFieldsOrEmpty$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getFieldsOrEmpty(str, findFieldBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: getInternalList-hUnOzRk, reason: not valid java name */
        private final <Q extends BaseFinder, D, R extends ISerializable> Object m5646getInternalListhUnOzRk(QueryKind queryKind, String str, boolean z, InterfaceC0298hw interfaceC0298hw, InterfaceC0904ww interfaceC0904ww, InterfaceC0742sw interfaceC0742sw) {
            BaseFinder baseFinder = interfaceC0298hw != null ? (BaseFinder) interfaceC0298hw.invoke() : null;
            String str2 = str;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", str2, baseFinder), z, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, interfaceC0904ww, baseFinder, interfaceC0742sw) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str2, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            return objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: getInternalMap-yxL6bBk, reason: not valid java name */
        private final <Q extends BaseFinder, D, R extends ISerializable> Object m5647getInternalMapyxL6bBk(QueryKind queryKind, String str, InterfaceC0298hw interfaceC0298hw, InterfaceC0904ww interfaceC0904ww, InterfaceC0742sw interfaceC0742sw) {
            BaseFinder baseFinder = interfaceC0298hw != null ? (BaseFinder) interfaceC0298hw.invoke() : null;
            String str2 = str;
            CacheBridgeStore.LoadResult cachedMap = CacheBridgeStore.INSTANCE.getCachedMap(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "b", str2, baseFinder), new DexKitCacheBridge$RecyclableBridge$getInternalMap$1(this), baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(this, interfaceC0904ww, baseFinder, interfaceC0742sw) : null);
            ResultSource source = cachedMap.getSource();
            Object objM5661getResultd1pmJ48 = cachedMap.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        String str3 = this.appTag;
                        Iterator it = ((Map) objM5661getResultd1pmJ48).values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((List) it.next()).size();
                        }
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(str3, queryKind, str2, source, size));
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            return objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: getInternalSingle-hUnOzRk, reason: not valid java name */
        private final <Q extends BaseFinder, D, R extends ISerializable> Object m5648getInternalSinglehUnOzRk(QueryKind queryKind, String str, CacheBridgeStore.SingleResolveMode singleResolveMode, InterfaceC0298hw interfaceC0298hw, InterfaceC0904ww interfaceC0904ww, InterfaceC0742sw interfaceC0742sw) {
            String str2 = str;
            BaseFinder baseFinder = interfaceC0298hw != null ? (BaseFinder) interfaceC0298hw.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", str2, baseFinder);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, interfaceC0904ww, baseFinder, interfaceC0742sw) : null;
            boolean z = str2 == null && baseFinder != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str2, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            return objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexMethod getMethod$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethod(str, findMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexMethod getMethodDirect$default(RecyclableBridge recyclableBridge, String str, BridgeMethodBuilder bridgeMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodBuilder = null;
            }
            return recyclableBridge.getMethodDirect(str, bridgeMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexMethod getMethodDirectOrNull$default(RecyclableBridge recyclableBridge, String str, BridgeMethodBuilder bridgeMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodBuilder = null;
            }
            return recyclableBridge.getMethodDirectOrNull(str, bridgeMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexMethod getMethodOrNull$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethodOrNull(str, findMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getMethods$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethods(str, findMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getMethodsDirect$default(RecyclableBridge recyclableBridge, String str, BridgeMethodsBuilder bridgeMethodsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodsBuilder = null;
            }
            return recyclableBridge.getMethodsDirect(str, bridgeMethodsBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getMethodsDirectOrEmpty$default(RecyclableBridge recyclableBridge, String str, BridgeMethodsBuilder bridgeMethodsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodsBuilder = null;
            }
            return recyclableBridge.getMethodsDirectOrEmpty(str, bridgeMethodsBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List getMethodsOrEmpty$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethodsOrEmpty(str, findMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final CacheBridgeRuntime getRuntime() {
            return (CacheBridgeRuntime) this.runtime$delegate.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Map<String, List<DexClass>> innerGetBatchUsingStringsClasses(String str, BatchFindClassUsingStrings batchFindClassUsingStrings) {
            QueryKind queryKind = QueryKind.CLASS_BATCH;
            C0572xab6759f c0572xab6759f = batchFindClassUsingStrings != null ? new C0572xab6759f(batchFindClassUsingStrings) : null;
            C0573xd5638d93 c0573xd5638d93 = C0573xd5638d93.INSTANCE;
            C0574xd5638d94 c0574xd5638d94 = C0574xd5638d94.INSTANCE;
            BaseFinder baseFinder = c0572xab6759f != null ? (BaseFinder) c0572xab6759f.invoke() : null;
            String str2 = str;
            CacheBridgeStore.LoadResult cachedMap = CacheBridgeStore.INSTANCE.getCachedMap(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "b", str2, baseFinder), new DexKitCacheBridge$RecyclableBridge$getInternalMap$1(this), baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(this, c0573xd5638d93, baseFinder, c0574xd5638d94) : null);
            ResultSource source = cachedMap.getSource();
            Object objM5661getResultd1pmJ48 = cachedMap.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        String str3 = this.appTag;
                        Iterator it = ((Map) objM5661getResultd1pmJ48).values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((List) it.next()).size();
                        }
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(str3, queryKind, str2, source, size));
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (Map) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Map innerGetBatchUsingStringsClasses$default(RecyclableBridge recyclableBridge, String str, BatchFindClassUsingStrings batchFindClassUsingStrings, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindClassUsingStrings = null;
            }
            return recyclableBridge.innerGetBatchUsingStringsClasses(str, batchFindClassUsingStrings);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Map<String, List<DexMethod>> innerGetBatchUsingStringsMethods(String str, BatchFindMethodUsingStrings batchFindMethodUsingStrings) {
            QueryKind queryKind = QueryKind.METHOD_BATCH;
            C0575xe2bce32b c0575xe2bce32b = batchFindMethodUsingStrings != null ? new C0575xe2bce32b(batchFindMethodUsingStrings) : null;
            C0576xa2ffee1f c0576xa2ffee1f = C0576xa2ffee1f.INSTANCE;
            C0577xa2ffee20 c0577xa2ffee20 = C0577xa2ffee20.INSTANCE;
            BaseFinder baseFinder = c0575xe2bce32b != null ? (BaseFinder) c0575xe2bce32b.invoke() : null;
            String str2 = str;
            CacheBridgeStore.LoadResult cachedMap = CacheBridgeStore.INSTANCE.getCachedMap(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "b", str2, baseFinder), new DexKitCacheBridge$RecyclableBridge$getInternalMap$1(this), baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(this, c0576xa2ffee1f, baseFinder, c0577xa2ffee20) : null);
            ResultSource source = cachedMap.getSource();
            Object objM5661getResultd1pmJ48 = cachedMap.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        String str3 = this.appTag;
                        Iterator it = ((Map) objM5661getResultd1pmJ48).values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((List) it.next()).size();
                        }
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(str3, queryKind, str2, source, size));
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (Map) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Map innerGetBatchUsingStringsMethods$default(RecyclableBridge recyclableBridge, String str, BatchFindMethodUsingStrings batchFindMethodUsingStrings, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindMethodUsingStrings = null;
            }
            return recyclableBridge.innerGetBatchUsingStringsMethods(str, batchFindMethodUsingStrings);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final DexClass innerGetClass(String str, boolean z, FindClass findClass) {
            String str2;
            QueryKind queryKind = QueryKind.CLASS_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = z ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 dexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 = findClass != null ? new DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1(findClass) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetClass$2 dexKitCacheBridge$RecyclableBridge$innerGetClass$2 = DexKitCacheBridge$RecyclableBridge$innerGetClass$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetClass$3 dexKitCacheBridge$RecyclableBridge$innerGetClass$3 = DexKitCacheBridge$RecyclableBridge$innerGetClass$3.INSTANCE;
            BaseFinder baseFinder = dexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 != null ? (BaseFinder) dexKitCacheBridge$RecyclableBridge$innerGetClass$1$1.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", str, baseFinder);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetClass$2, baseFinder, dexKitCacheBridge$RecyclableBridge$innerGetClass$3) : null;
            boolean z2 = str == null && baseFinder != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z2), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        str2 = str;
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str2, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        str2 = str;
                    }
                    str = str2;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused3) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (DexClass) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexClass innerGetClass$default(RecyclableBridge recyclableBridge, String str, boolean z, FindClass findClass, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findClass = null;
            }
            return recyclableBridge.innerGetClass(str, z, findClass);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final DexClass innerGetClassDirect(String str, boolean z, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind = QueryKind.CLASS_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = z ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1 dexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1 = DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1.INSTANCE;
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", str, null, 8, null);
            C0571x95b222e4 c0571x95b222e4 = interfaceC0742sw != null ? new C0571x95b222e4(this, interfaceC0742sw, dexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c0571x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (DexClass) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexClass innerGetClassDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC0742sw interfaceC0742sw, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC0742sw = null;
            }
            return recyclableBridge.innerGetClassDirect(str, z, interfaceC0742sw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<DexClass> innerGetClasses(String str, boolean z, FindClass findClass) {
            QueryKind queryKind = QueryKind.CLASS_LIST;
            DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 dexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 = findClass != null ? new DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1(findClass) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetClasses$2 dexKitCacheBridge$RecyclableBridge$innerGetClasses$2 = DexKitCacheBridge$RecyclableBridge$innerGetClasses$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetClasses$3 dexKitCacheBridge$RecyclableBridge$innerGetClasses$3 = DexKitCacheBridge$RecyclableBridge$innerGetClasses$3.INSTANCE;
            BaseFinder baseFinder = dexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 != null ? (BaseFinder) dexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1.invoke() : null;
            String str2 = str;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", str2, baseFinder), z, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetClasses$2, baseFinder, dexKitCacheBridge$RecyclableBridge$innerGetClasses$3) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str2, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (List) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List innerGetClasses$default(RecyclableBridge recyclableBridge, String str, boolean z, FindClass findClass, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findClass = null;
            }
            return recyclableBridge.innerGetClasses(str, z, findClass);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<DexClass> innerGetClassesDirect(String str, boolean z, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind = QueryKind.CLASS_LIST;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", str, null, 8, null), z, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), interfaceC0742sw != null ? new C0570x87bd6f8e(this, interfaceC0742sw, DexKitCacheBridge$RecyclableBridge$innerGetClassesDirect$1.INSTANCE) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (List) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List innerGetClassesDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC0742sw interfaceC0742sw, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC0742sw = null;
            }
            return recyclableBridge.innerGetClassesDirect(str, z, interfaceC0742sw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final DexField innerGetField(String str, boolean z, FindField findField) {
            String str2;
            QueryKind queryKind = QueryKind.FIELD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = z ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetField$1$1 dexKitCacheBridge$RecyclableBridge$innerGetField$1$1 = findField != null ? new DexKitCacheBridge$RecyclableBridge$innerGetField$1$1(findField) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetField$2 dexKitCacheBridge$RecyclableBridge$innerGetField$2 = DexKitCacheBridge$RecyclableBridge$innerGetField$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetField$3 dexKitCacheBridge$RecyclableBridge$innerGetField$3 = DexKitCacheBridge$RecyclableBridge$innerGetField$3.INSTANCE;
            BaseFinder baseFinder = dexKitCacheBridge$RecyclableBridge$innerGetField$1$1 != null ? (BaseFinder) dexKitCacheBridge$RecyclableBridge$innerGetField$1$1.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", str, baseFinder);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetField$2, baseFinder, dexKitCacheBridge$RecyclableBridge$innerGetField$3) : null;
            boolean z2 = str == null && baseFinder != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z2), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        str2 = str;
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str2, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        str2 = str;
                    }
                    str = str2;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused3) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (DexField) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexField innerGetField$default(RecyclableBridge recyclableBridge, String str, boolean z, FindField findField, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findField = null;
            }
            return recyclableBridge.innerGetField(str, z, findField);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final DexField innerGetFieldDirect(String str, boolean z, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind = QueryKind.FIELD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = z ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 dexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 = DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1.INSTANCE;
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", str, null, 8, null);
            C0571x95b222e4 c0571x95b222e4 = interfaceC0742sw != null ? new C0571x95b222e4(this, interfaceC0742sw, dexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c0571x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (DexField) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexField innerGetFieldDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC0742sw interfaceC0742sw, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC0742sw = null;
            }
            return recyclableBridge.innerGetFieldDirect(str, z, interfaceC0742sw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<DexField> innerGetFields(String str, boolean z, FindField findField) {
            QueryKind queryKind = QueryKind.FIELD_LIST;
            DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1 dexKitCacheBridge$RecyclableBridge$innerGetFields$1$1 = findField != null ? new DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1(findField) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetFields$2 dexKitCacheBridge$RecyclableBridge$innerGetFields$2 = DexKitCacheBridge$RecyclableBridge$innerGetFields$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetFields$3 dexKitCacheBridge$RecyclableBridge$innerGetFields$3 = DexKitCacheBridge$RecyclableBridge$innerGetFields$3.INSTANCE;
            BaseFinder baseFinder = dexKitCacheBridge$RecyclableBridge$innerGetFields$1$1 != null ? (BaseFinder) dexKitCacheBridge$RecyclableBridge$innerGetFields$1$1.invoke() : null;
            String str2 = str;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", str2, baseFinder), z, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetFields$2, baseFinder, dexKitCacheBridge$RecyclableBridge$innerGetFields$3) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str2, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (List) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List innerGetFields$default(RecyclableBridge recyclableBridge, String str, boolean z, FindField findField, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findField = null;
            }
            return recyclableBridge.innerGetFields(str, z, findField);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<DexField> innerGetFieldsDirect(String str, boolean z, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind = QueryKind.FIELD_LIST;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", str, null, 8, null), z, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), interfaceC0742sw != null ? new C0570x87bd6f8e(this, interfaceC0742sw, DexKitCacheBridge$RecyclableBridge$innerGetFieldsDirect$1.INSTANCE) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (List) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List innerGetFieldsDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC0742sw interfaceC0742sw, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC0742sw = null;
            }
            return recyclableBridge.innerGetFieldsDirect(str, z, interfaceC0742sw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final DexMethod innerGetMethod(String str, boolean z, FindMethod findMethod) {
            QueryKind queryKind;
            String str2 = str;
            DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1 dexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1 = findMethod != null ? new DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1(findMethod) : null;
            QueryKind queryKind2 = QueryKind.METHOD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = z ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 dexKitCacheBridge$RecyclableBridge$innerGetMethod$1 = DexKitCacheBridge$RecyclableBridge$innerGetMethod$1.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetMethod$2 dexKitCacheBridge$RecyclableBridge$innerGetMethod$2 = DexKitCacheBridge$RecyclableBridge$innerGetMethod$2.INSTANCE;
            BaseFinder baseFinder = dexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1 != null ? (BaseFinder) dexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", str2, baseFinder);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetMethod$1, baseFinder, dexKitCacheBridge$RecyclableBridge$innerGetMethod$2) : null;
            boolean z2 = str2 == null && baseFinder != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z2), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        queryKind = queryKind2;
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str2, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        queryKind = queryKind2;
                    }
                    str2 = str;
                    queryKind2 = queryKind;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind2, str, source, thM604a));
                    } catch (Throwable unused3) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (DexMethod) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexMethod innerGetMethod$default(RecyclableBridge recyclableBridge, String str, boolean z, FindMethod findMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findMethod = null;
            }
            return recyclableBridge.innerGetMethod(str, z, findMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final DexMethod innerGetMethodDirect(String str, boolean z, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind = QueryKind.METHOD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = z ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1 dexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1 = DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1.INSTANCE;
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", str, null, 8, null);
            C0571x95b222e4 c0571x95b222e4 = interfaceC0742sw != null ? new C0571x95b222e4(this, interfaceC0742sw, dexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c0571x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM5661getResultd1pmJ48 = cachedSingle.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((ISerializable) objM5661getResultd1pmJ48) == null ? 0 : 1));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (DexMethod) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ DexMethod innerGetMethodDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC0742sw interfaceC0742sw, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC0742sw = null;
            }
            return recyclableBridge.innerGetMethodDirect(str, z, interfaceC0742sw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<DexMethod> innerGetMethods(String str, boolean z, FindMethod findMethod) {
            C0578x24931bbd c0578x24931bbd = findMethod != null ? new C0578x24931bbd(findMethod) : null;
            QueryKind queryKind = QueryKind.METHOD_LIST;
            DexKitCacheBridge$RecyclableBridge$innerGetMethods$1 dexKitCacheBridge$RecyclableBridge$innerGetMethods$1 = DexKitCacheBridge$RecyclableBridge$innerGetMethods$1.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetMethods$2 dexKitCacheBridge$RecyclableBridge$innerGetMethods$2 = DexKitCacheBridge$RecyclableBridge$innerGetMethods$2.INSTANCE;
            BaseFinder baseFinder = c0578x24931bbd != null ? (BaseFinder) c0578x24931bbd.invoke() : null;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", str, baseFinder), z, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), baseFinder != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetMethods$1, baseFinder, dexKitCacheBridge$RecyclableBridge$innerGetMethods$2) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (List) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List innerGetMethods$default(RecyclableBridge recyclableBridge, String str, boolean z, FindMethod findMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findMethod = null;
            }
            return recyclableBridge.innerGetMethods(str, z, findMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<DexMethod> innerGetMethodsDirect(String str, boolean z, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind = QueryKind.METHOD_LIST;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", str, null, 8, null), z, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), interfaceC0742sw != null ? new C0570x87bd6f8e(this, interfaceC0742sw, DexKitCacheBridge$RecyclableBridge$innerGetMethodsDirect$1.INSTANCE) : null);
            ResultSource source = cachedList.getSource();
            Object objM5661getResultd1pmJ48 = cachedList.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, str, source, ((List) objM5661getResultd1pmJ48).size()));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused2) {
                    }
                }
            }
            w60.m4891M(objM5661getResultd1pmJ48);
            return (List) objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ List innerGetMethodsDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC0742sw interfaceC0742sw, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC0742sw = null;
            }
            return recyclableBridge.innerGetMethodsDirect(str, z, interfaceC0742sw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: notifyQueryResult-nnTlf9I, reason: not valid java name */
        private final <T> Object m5649notifyQueryResultnnTlf9I(QueryKind queryKind, String str, ResultSource resultSource, Object obj, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind2;
            String str2;
            ResultSource resultSource2;
            Throwable thM604a = cv0.m604a(obj);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        QueryKind queryKind3 = queryKind;
                        String str3 = str;
                        ResultSource resultSource3 = resultSource;
                        try {
                            queryKind2 = queryKind3;
                            str2 = str3;
                            resultSource2 = resultSource3;
                            try {
                                cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind3, str3, resultSource3, ((Number) interfaceC0742sw.invoke(obj)).intValue()));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            queryKind2 = queryKind3;
                            str2 = str3;
                            resultSource2 = resultSource3;
                        }
                    } catch (Throwable unused3) {
                        queryKind2 = queryKind;
                        str2 = str;
                        resultSource2 = resultSource;
                    }
                    queryKind = queryKind2;
                    str = str2;
                    resultSource = resultSource2;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, resultSource, thM604a));
                    } catch (Throwable unused4) {
                    }
                }
            }
            return obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: observeLoad-BWLJW6A, reason: not valid java name */
        private final <T> Object m5650observeLoadBWLJW6A(QueryKind queryKind, String str, CacheBridgeStore.LoadResult<T> loadResult, InterfaceC0742sw interfaceC0742sw) {
            QueryKind queryKind2;
            String str2;
            ResultSource source = loadResult.getSource();
            Object objM5661getResultd1pmJ48 = loadResult.m5661getResultd1pmJ48();
            Throwable thM604a = cv0.m604a(objM5661getResultd1pmJ48);
            if (thM604a == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener.getClass();
                        queryKind2 = queryKind;
                        str2 = str;
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind2, str2, source, ((Number) interfaceC0742sw.invoke(objM5661getResultd1pmJ48)).intValue()));
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        queryKind2 = queryKind;
                        str2 = str;
                    }
                    queryKind = queryKind2;
                    str = str2;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        cacheBridgeListener2.getClass();
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, str, source, thM604a));
                    } catch (Throwable unused3) {
                    }
                }
            }
            return objM5661getResultd1pmJ48;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final InterfaceC0742sw toBridgeQuery(BridgeMethodBuilder bridgeMethodBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$1(bridgeMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final FindMethod toQuery(FindMethodBuilder findMethodBuilder) {
            FindMethod findMethod = new FindMethod();
            findMethodBuilder.build(findMethod);
            return findMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            getRuntime().close();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void destroy() {
            getRuntime().destroy();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ Map getBatchUsingStringsClasses(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
            interfaceC0742sw.invoke(batchFindClassUsingStrings);
            return innerGetBatchUsingStringsClasses(str, batchFindClassUsingStrings);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ Map getBatchUsingStringsMethods(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
            interfaceC0742sw.invoke(batchFindMethodUsingStrings);
            return innerGetBatchUsingStringsMethods(str, batchFindMethodUsingStrings);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ DexClass getClass(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            DexClass dexClassInnerGetClass = innerGetClass(str, false, findClass);
            dexClassInnerGetClass.getClass();
            return dexClassInnerGetClass;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexClass getClassDirect(String str, BridgeClassBuilder bridgeClassBuilder) {
            str.getClass();
            DexClass dexClassInnerGetClassDirect = innerGetClassDirect(str, false, bridgeClassBuilder != null ? toBridgeQuery(bridgeClassBuilder) : null);
            dexClassInnerGetClassDirect.getClass();
            return dexClassInnerGetClassDirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexClass getClassDirectOrNull(String str, BridgeClassBuilder bridgeClassBuilder) {
            str.getClass();
            return innerGetClassDirect(str, true, bridgeClassBuilder != null ? toBridgeQuery(bridgeClassBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ DexClass getClassOrNull(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            return innerGetClass(str, true, findClass);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ List getClasses(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            return innerGetClasses(str, false, findClass);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<DexClass> getClassesDirect(String str, BridgeClassesBuilder bridgeClassesBuilder) {
            str.getClass();
            return innerGetClassesDirect(str, false, bridgeClassesBuilder != null ? toBridgeQuery(bridgeClassesBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<DexClass> getClassesDirectOrEmpty(String str, BridgeClassesBuilder bridgeClassesBuilder) {
            str.getClass();
            return innerGetClassesDirect(str, true, bridgeClassesBuilder != null ? toBridgeQuery(bridgeClassesBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ List getClassesOrEmpty(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            return innerGetClasses(str, true, findClass);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ DexField getField(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            DexField dexFieldInnerGetField = innerGetField(str, false, findField);
            dexFieldInnerGetField.getClass();
            return dexFieldInnerGetField;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexField getFieldDirect(String str, BridgeFieldBuilder bridgeFieldBuilder) {
            str.getClass();
            DexField dexFieldInnerGetFieldDirect = innerGetFieldDirect(str, false, bridgeFieldBuilder != null ? toBridgeQuery(bridgeFieldBuilder) : null);
            dexFieldInnerGetFieldDirect.getClass();
            return dexFieldInnerGetFieldDirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexField getFieldDirectOrNull(String str, BridgeFieldBuilder bridgeFieldBuilder) {
            str.getClass();
            return innerGetFieldDirect(str, true, bridgeFieldBuilder != null ? toBridgeQuery(bridgeFieldBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ DexField getFieldOrNull(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            return innerGetField(str, true, findField);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ List getFields(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            return innerGetFields(str, false, findField);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<DexField> getFieldsDirect(String str, BridgeFieldsBuilder bridgeFieldsBuilder) {
            str.getClass();
            return innerGetFieldsDirect(str, false, bridgeFieldsBuilder != null ? toBridgeQuery(bridgeFieldsBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<DexField> getFieldsDirectOrEmpty(String str, BridgeFieldsBuilder bridgeFieldsBuilder) {
            str.getClass();
            return innerGetFieldsDirect(str, true, bridgeFieldsBuilder != null ? toBridgeQuery(bridgeFieldsBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ List getFieldsOrEmpty(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            return innerGetFields(str, true, findField);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ DexMethod getMethod(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            DexMethod dexMethodInnerGetMethod = innerGetMethod(str, false, findMethod);
            dexMethodInnerGetMethod.getClass();
            return dexMethodInnerGetMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexMethod getMethodDirect(String str, BridgeMethodBuilder bridgeMethodBuilder) {
            str.getClass();
            DexMethod dexMethodInnerGetMethodDirect = innerGetMethodDirect(str, false, bridgeMethodBuilder != null ? toBridgeQuery(bridgeMethodBuilder) : null);
            dexMethodInnerGetMethodDirect.getClass();
            return dexMethodInnerGetMethodDirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexMethod getMethodDirectOrNull(String str, BridgeMethodBuilder bridgeMethodBuilder) {
            str.getClass();
            return innerGetMethodDirect(str, true, bridgeMethodBuilder != null ? toBridgeQuery(bridgeMethodBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ DexMethod getMethodOrNull(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            return innerGetMethod(str, true, findMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ List getMethods(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            return innerGetMethods(str, false, findMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<DexMethod> getMethodsDirect(String str, BridgeMethodsBuilder bridgeMethodsBuilder) {
            str.getClass();
            return innerGetMethodsDirect(str, false, bridgeMethodsBuilder != null ? toBridgeQuery(bridgeMethodsBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<DexMethod> getMethodsDirectOrEmpty(String str, BridgeMethodsBuilder bridgeMethodsBuilder) {
            str.getClass();
            return innerGetMethodsDirect(str, true, bridgeMethodsBuilder != null ? toBridgeQuery(bridgeMethodsBuilder) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final /* synthetic */ List getMethodsOrEmpty(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            return innerGetMethods(str, true, findMethod);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean isRetired() {
            return getRuntime().isDestroyed();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void withBridge(BridgeFunction bridgeFunction) {
            DexKitBridge dexKitBridge;
            boolean z;
            bridgeFunction.getClass();
            CacheBridgeRuntime runtime = getRuntime();
            runtime.beginUse();
            try {
                synchronized (runtime.lifecycleLock) {
                    dexKitBridge = runtime.bridge;
                    if (dexKitBridge == null) {
                        Object objInvoke = runtime.createBridge.invoke();
                        runtime.bridge = (DexKitBridge) objInvoke;
                        dexKitBridge = (DexKitBridge) objInvoke;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    runtime.notifyBridgeCreated.invoke();
                }
                bridgeFunction.apply(dexKitBridge);
                runtime.endUse();
            } catch (Throwable th) {
                runtime.endUse();
                throw th;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final /* synthetic */ RecyclableBridge create$dexkit_android_release(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new RecyclableBridge(str, str2, null, null, null);
            }

            private Companion() {
            }

            public final /* synthetic */ RecyclableBridge create$dexkit_android_release(String str, byte[][] bArr) {
                str.getClass();
                bArr.getClass();
                return new RecyclableBridge(str, null, bArr, null, null);
            }

            public final /* synthetic */ RecyclableBridge create$dexkit_android_release(String str, ClassLoader classLoader) {
                str.getClass();
                classLoader.getClass();
                return new RecyclableBridge(str, null, null, classLoader, null);
            }
        }

        private final InterfaceC0742sw toBridgeQuery(BridgeClassBuilder bridgeClassBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2(bridgeClassBuilder);
        }

        private final InterfaceC0742sw toBridgeQuery(BridgeFieldBuilder bridgeFieldBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3(bridgeFieldBuilder);
        }

        private final InterfaceC0742sw toBridgeQuery(BridgeMethodsBuilder bridgeMethodsBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4(bridgeMethodsBuilder);
        }

        private final InterfaceC0742sw toBridgeQuery(BridgeClassesBuilder bridgeClassesBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$5(bridgeClassesBuilder);
        }

        private final FindClass toQuery(FindClassBuilder findClassBuilder) {
            FindClass findClass = new FindClass();
            findClassBuilder.build(findClass);
            return findClass;
        }

        private final InterfaceC0742sw toBridgeQuery(BridgeFieldsBuilder bridgeFieldsBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6(bridgeFieldsBuilder);
        }

        private final FindField toQuery(FindFieldBuilder findFieldBuilder) {
            FindField findField = new FindField();
            findFieldBuilder.build(findField);
            return findField;
        }

        private final BatchFindMethodUsingStrings toQuery(BatchFindMethodUsingStringsBuilder batchFindMethodUsingStringsBuilder) {
            BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
            batchFindMethodUsingStringsBuilder.build(batchFindMethodUsingStrings);
            return batchFindMethodUsingStrings;
        }

        private final BatchFindClassUsingStrings toQuery(BatchFindClassUsingStringsBuilder batchFindClassUsingStringsBuilder) {
            BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
            batchFindClassUsingStringsBuilder.build(batchFindClassUsingStrings);
            return batchFindClassUsingStrings;
        }

        public final DexClass getClassDirectOrNull(String str) {
            str.getClass();
            return getClassDirectOrNull$default(this, str, null, 2, null);
        }

        public final List<DexClass> getClassesDirect(String str) {
            str.getClass();
            return getClassesDirect$default(this, str, null, 2, null);
        }

        public final List<DexClass> getClassesDirectOrEmpty(String str) {
            str.getClass();
            return getClassesDirectOrEmpty$default(this, str, null, 2, null);
        }

        public final DexField getFieldDirectOrNull(String str) {
            str.getClass();
            return getFieldDirectOrNull$default(this, str, null, 2, null);
        }

        public final List<DexField> getFieldsDirect(String str) {
            str.getClass();
            return getFieldsDirect$default(this, str, null, 2, null);
        }

        public final List<DexField> getFieldsDirectOrEmpty(String str) {
            str.getClass();
            return getFieldsDirectOrEmpty$default(this, str, null, 2, null);
        }

        public final DexMethod getMethodDirectOrNull(String str) {
            str.getClass();
            return getMethodDirectOrNull$default(this, str, null, 2, null);
        }

        public final List<DexMethod> getMethodsDirect(String str) {
            str.getClass();
            return getMethodsDirect$default(this, str, null, 2, null);
        }

        public final List<DexMethod> getMethodsDirectOrEmpty(String str) {
            str.getClass();
            return getMethodsDirectOrEmpty$default(this, str, null, 2, null);
        }

        public final /* synthetic */ DexClass getClassDirectOrNull(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetClassDirect(str, true, interfaceC0742sw);
        }

        public final /* synthetic */ List getClassesDirect(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetClassesDirect(str, false, interfaceC0742sw);
        }

        public final /* synthetic */ List getClassesDirectOrEmpty(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetClassesDirect(str, true, interfaceC0742sw);
        }

        public final /* synthetic */ DexField getFieldDirectOrNull(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetFieldDirect(str, true, interfaceC0742sw);
        }

        public final /* synthetic */ List getFieldsDirect(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetFieldsDirect(str, false, interfaceC0742sw);
        }

        public final /* synthetic */ List getFieldsDirectOrEmpty(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetFieldsDirect(str, true, interfaceC0742sw);
        }

        public final /* synthetic */ DexMethod getMethodDirectOrNull(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetMethodDirect(str, true, interfaceC0742sw);
        }

        public final /* synthetic */ List getMethodsDirect(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetMethodsDirect(str, false, interfaceC0742sw);
        }

        public final /* synthetic */ List getMethodsDirectOrEmpty(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            return innerGetMethodsDirect(str, true, interfaceC0742sw);
        }

        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(BatchFindClassUsingStringsBuilder batchFindClassUsingStringsBuilder) {
            batchFindClassUsingStringsBuilder.getClass();
            return innerGetBatchUsingStringsClasses(null, toQuery(batchFindClassUsingStringsBuilder));
        }

        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(BatchFindMethodUsingStringsBuilder batchFindMethodUsingStringsBuilder) {
            batchFindMethodUsingStringsBuilder.getClass();
            return innerGetBatchUsingStringsMethods(null, toQuery(batchFindMethodUsingStringsBuilder));
        }

        public final DexClass getClassDirect(String str) {
            str.getClass();
            return getClassDirect$default(this, str, null, 2, null);
        }

        public final DexClass getClassOrNull(FindClassBuilder findClassBuilder) {
            findClassBuilder.getClass();
            return innerGetClass(null, true, toQuery(findClassBuilder));
        }

        public final List<DexClass> getClasses(FindClassBuilder findClassBuilder) {
            findClassBuilder.getClass();
            return innerGetClasses(null, false, toQuery(findClassBuilder));
        }

        public final List<DexClass> getClassesOrEmpty(String str, FindClassBuilder findClassBuilder) {
            str.getClass();
            return innerGetClasses(str, true, findClassBuilder != null ? toQuery(findClassBuilder) : null);
        }

        public final DexField getFieldDirect(String str) {
            str.getClass();
            return getFieldDirect$default(this, str, null, 2, null);
        }

        public final DexField getFieldOrNull(FindFieldBuilder findFieldBuilder) {
            findFieldBuilder.getClass();
            return innerGetField(null, true, toQuery(findFieldBuilder));
        }

        public final List<DexField> getFields(FindFieldBuilder findFieldBuilder) {
            findFieldBuilder.getClass();
            return innerGetFields(null, false, toQuery(findFieldBuilder));
        }

        public final List<DexField> getFieldsOrEmpty(String str, FindFieldBuilder findFieldBuilder) {
            str.getClass();
            return innerGetFields(str, true, findFieldBuilder != null ? toQuery(findFieldBuilder) : null);
        }

        public final DexMethod getMethodDirect(String str) {
            str.getClass();
            return getMethodDirect$default(this, str, null, 2, null);
        }

        public final DexMethod getMethodOrNull(FindMethodBuilder findMethodBuilder) {
            findMethodBuilder.getClass();
            return innerGetMethod(null, true, toQuery(findMethodBuilder));
        }

        public final List<DexMethod> getMethods(FindMethodBuilder findMethodBuilder) {
            findMethodBuilder.getClass();
            return innerGetMethods(null, false, toQuery(findMethodBuilder));
        }

        public final List<DexMethod> getMethodsOrEmpty(String str, FindMethodBuilder findMethodBuilder) {
            str.getClass();
            return innerGetMethods(str, true, findMethodBuilder != null ? toQuery(findMethodBuilder) : null);
        }

        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(String str, BatchFindClassUsingStringsBuilder batchFindClassUsingStringsBuilder) {
            str.getClass();
            return innerGetBatchUsingStringsClasses(str, batchFindClassUsingStringsBuilder != null ? toQuery(batchFindClassUsingStringsBuilder) : null);
        }

        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(String str, BatchFindMethodUsingStringsBuilder batchFindMethodUsingStringsBuilder) {
            str.getClass();
            return innerGetBatchUsingStringsMethods(str, batchFindMethodUsingStringsBuilder != null ? toQuery(batchFindMethodUsingStringsBuilder) : null);
        }

        public final /* synthetic */ DexClass getClassDirect(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            DexClass dexClassInnerGetClassDirect = innerGetClassDirect(str, false, interfaceC0742sw);
            dexClassInnerGetClassDirect.getClass();
            return dexClassInnerGetClassDirect;
        }

        public final /* synthetic */ DexField getFieldDirect(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            DexField dexFieldInnerGetFieldDirect = innerGetFieldDirect(str, false, interfaceC0742sw);
            dexFieldInnerGetFieldDirect.getClass();
            return dexFieldInnerGetFieldDirect;
        }

        public final /* synthetic */ DexMethod getMethodDirect(String str, InterfaceC0742sw interfaceC0742sw) {
            str.getClass();
            interfaceC0742sw.getClass();
            DexMethod dexMethodInnerGetMethodDirect = innerGetMethodDirect(str, false, interfaceC0742sw);
            dexMethodInnerGetMethodDirect.getClass();
            return dexMethodInnerGetMethodDirect;
        }

        public final DexClass getClassOrNull(String str, FindClassBuilder findClassBuilder) {
            str.getClass();
            return innerGetClass(str, true, findClassBuilder != null ? toQuery(findClassBuilder) : null);
        }

        public final List<DexClass> getClasses(String str, FindClassBuilder findClassBuilder) {
            str.getClass();
            return innerGetClasses(str, false, findClassBuilder != null ? toQuery(findClassBuilder) : null);
        }

        public final List<DexClass> getClassesOrEmpty(FindClass findClass) {
            findClass.getClass();
            return innerGetClasses(null, true, findClass);
        }

        public final DexField getFieldOrNull(String str, FindFieldBuilder findFieldBuilder) {
            str.getClass();
            return innerGetField(str, true, findFieldBuilder != null ? toQuery(findFieldBuilder) : null);
        }

        public final List<DexField> getFields(String str, FindFieldBuilder findFieldBuilder) {
            str.getClass();
            return innerGetFields(str, false, findFieldBuilder != null ? toQuery(findFieldBuilder) : null);
        }

        public final List<DexField> getFieldsOrEmpty(FindField findField) {
            findField.getClass();
            return innerGetFields(null, true, findField);
        }

        public final DexMethod getMethodOrNull(String str, FindMethodBuilder findMethodBuilder) {
            str.getClass();
            return innerGetMethod(str, true, findMethodBuilder != null ? toQuery(findMethodBuilder) : null);
        }

        public final List<DexMethod> getMethods(String str, FindMethodBuilder findMethodBuilder) {
            str.getClass();
            return innerGetMethods(str, false, findMethodBuilder != null ? toQuery(findMethodBuilder) : null);
        }

        public final List<DexMethod> getMethodsOrEmpty(FindMethod findMethod) {
            findMethod.getClass();
            return innerGetMethods(null, true, findMethod);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 byte[][]), (r4v0 java.lang.ClassLoader) A[MD:(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void (m)] (LINE:24) call: org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.<init>(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void type: THIS */
        public /* synthetic */ RecyclableBridge(String str, String str2, byte[][] bArr, ClassLoader classLoader, AbstractC0619pl abstractC0619pl) {
            this(str, str2, bArr, classLoader);
        }

        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(BatchFindClassUsingStrings batchFindClassUsingStrings) {
            batchFindClassUsingStrings.getClass();
            return innerGetBatchUsingStringsClasses(null, batchFindClassUsingStrings);
        }

        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(BatchFindMethodUsingStrings batchFindMethodUsingStrings) {
            batchFindMethodUsingStrings.getClass();
            return innerGetBatchUsingStringsMethods(null, batchFindMethodUsingStrings);
        }

        public final DexClass getClass(FindClassBuilder findClassBuilder) {
            findClassBuilder.getClass();
            DexClass dexClassInnerGetClass = innerGetClass(null, false, toQuery(findClassBuilder));
            dexClassInnerGetClass.getClass();
            return dexClassInnerGetClass;
        }

        public final List<DexClass> getClassesOrEmpty(String str, FindClass findClass) {
            str.getClass();
            findClass.getClass();
            return innerGetClasses(str, true, findClass);
        }

        public final DexField getField(FindFieldBuilder findFieldBuilder) {
            findFieldBuilder.getClass();
            DexField dexFieldInnerGetField = innerGetField(null, false, toQuery(findFieldBuilder));
            dexFieldInnerGetField.getClass();
            return dexFieldInnerGetField;
        }

        public final List<DexField> getFieldsOrEmpty(String str, FindField findField) {
            str.getClass();
            findField.getClass();
            return innerGetFields(str, true, findField);
        }

        public final DexMethod getMethod(FindMethodBuilder findMethodBuilder) {
            findMethodBuilder.getClass();
            DexMethod dexMethodInnerGetMethod = innerGetMethod(null, false, toQuery(findMethodBuilder));
            dexMethodInnerGetMethod.getClass();
            return dexMethodInnerGetMethod;
        }

        public final List<DexMethod> getMethodsOrEmpty(String str, FindMethod findMethod) {
            str.getClass();
            findMethod.getClass();
            return innerGetMethods(str, true, findMethod);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:byte[][]:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null byte[][]) : (r4v0 byte[][]))
  (wrap:java.lang.ClassLoader:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ClassLoader) : (r5v0 java.lang.ClassLoader))
 A[MD:(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void (m)] (LINE:25) call: org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.<init>(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void type: THIS */
        public /* synthetic */ RecyclableBridge(String str, String str2, byte[][] bArr, ClassLoader classLoader, int i, AbstractC0619pl abstractC0619pl) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? null : classLoader);
        }

        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(String str, BatchFindClassUsingStrings batchFindClassUsingStrings) {
            str.getClass();
            batchFindClassUsingStrings.getClass();
            return innerGetBatchUsingStringsClasses(str, batchFindClassUsingStrings);
        }

        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(String str, BatchFindMethodUsingStrings batchFindMethodUsingStrings) {
            str.getClass();
            batchFindMethodUsingStrings.getClass();
            return innerGetBatchUsingStringsMethods(str, batchFindMethodUsingStrings);
        }

        public final DexClass getClassOrNull(FindClass findClass) {
            findClass.getClass();
            return innerGetClass(null, true, findClass);
        }

        public final List<DexClass> getClasses(FindClass findClass) {
            findClass.getClass();
            return innerGetClasses(null, false, findClass);
        }

        public final /* synthetic */ List getClassesOrEmpty(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            return innerGetClasses(null, true, findClass);
        }

        public final DexField getFieldOrNull(FindField findField) {
            findField.getClass();
            return innerGetField(null, true, findField);
        }

        public final List<DexField> getFields(FindField findField) {
            findField.getClass();
            return innerGetFields(null, false, findField);
        }

        public final /* synthetic */ List getFieldsOrEmpty(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            return innerGetFields(null, true, findField);
        }

        public final DexMethod getMethodOrNull(FindMethod findMethod) {
            findMethod.getClass();
            return innerGetMethod(null, true, findMethod);
        }

        public final List<DexMethod> getMethods(FindMethod findMethod) {
            findMethod.getClass();
            return innerGetMethods(null, false, findMethod);
        }

        public final /* synthetic */ List getMethodsOrEmpty(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            return innerGetMethods(null, true, findMethod);
        }

        public final /* synthetic */ Map getBatchUsingStringsClasses(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
            interfaceC0742sw.invoke(batchFindClassUsingStrings);
            return innerGetBatchUsingStringsClasses(null, batchFindClassUsingStrings);
        }

        public final /* synthetic */ Map getBatchUsingStringsMethods(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
            interfaceC0742sw.invoke(batchFindMethodUsingStrings);
            return innerGetBatchUsingStringsMethods(null, batchFindMethodUsingStrings);
        }

        public final DexClass getClass(String str, FindClassBuilder findClassBuilder) {
            str.getClass();
            DexClass dexClassInnerGetClass = innerGetClass(str, false, findClassBuilder != null ? toQuery(findClassBuilder) : null);
            dexClassInnerGetClass.getClass();
            return dexClassInnerGetClass;
        }

        public final DexClass getClassOrNull(String str, FindClass findClass) {
            str.getClass();
            findClass.getClass();
            return innerGetClass(str, true, findClass);
        }

        public final List<DexClass> getClasses(String str, FindClass findClass) {
            str.getClass();
            findClass.getClass();
            return innerGetClasses(str, false, findClass);
        }

        public final DexField getField(String str, FindFieldBuilder findFieldBuilder) {
            str.getClass();
            DexField dexFieldInnerGetField = innerGetField(str, false, findFieldBuilder != null ? toQuery(findFieldBuilder) : null);
            dexFieldInnerGetField.getClass();
            return dexFieldInnerGetField;
        }

        public final DexField getFieldOrNull(String str, FindField findField) {
            str.getClass();
            findField.getClass();
            return innerGetField(str, true, findField);
        }

        public final List<DexField> getFields(String str, FindField findField) {
            str.getClass();
            findField.getClass();
            return innerGetFields(str, false, findField);
        }

        public final DexMethod getMethod(String str, FindMethodBuilder findMethodBuilder) {
            str.getClass();
            DexMethod dexMethodInnerGetMethod = innerGetMethod(str, false, findMethodBuilder != null ? toQuery(findMethodBuilder) : null);
            dexMethodInnerGetMethod.getClass();
            return dexMethodInnerGetMethod;
        }

        public final DexMethod getMethodOrNull(String str, FindMethod findMethod) {
            str.getClass();
            findMethod.getClass();
            return innerGetMethod(str, true, findMethod);
        }

        public final List<DexMethod> getMethods(String str, FindMethod findMethod) {
            str.getClass();
            findMethod.getClass();
            return innerGetMethods(str, false, findMethod);
        }

        public final /* synthetic */ DexClass getClassOrNull(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            return innerGetClass(null, true, findClass);
        }

        public final /* synthetic */ List getClasses(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            return innerGetClasses(null, false, findClass);
        }

        public final List<DexClass> getClassesOrEmpty(FindClassBuilder findClassBuilder) {
            findClassBuilder.getClass();
            return innerGetClasses(null, true, toQuery(findClassBuilder));
        }

        public final /* synthetic */ DexField getFieldOrNull(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            return innerGetField(null, true, findField);
        }

        public final /* synthetic */ List getFields(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            return innerGetFields(null, false, findField);
        }

        public final List<DexField> getFieldsOrEmpty(FindFieldBuilder findFieldBuilder) {
            findFieldBuilder.getClass();
            return innerGetFields(null, true, toQuery(findFieldBuilder));
        }

        public final /* synthetic */ DexMethod getMethodOrNull(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            return innerGetMethod(null, true, findMethod);
        }

        public final /* synthetic */ List getMethods(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            return innerGetMethods(null, false, findMethod);
        }

        public final List<DexMethod> getMethodsOrEmpty(FindMethodBuilder findMethodBuilder) {
            findMethodBuilder.getClass();
            return innerGetMethods(null, true, toQuery(findMethodBuilder));
        }

        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(String str) {
            str.getClass();
            return getBatchUsingStringsClasses$default(this, str, null, 2, null);
        }

        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(String str) {
            str.getClass();
            return getBatchUsingStringsMethods$default(this, str, null, 2, null);
        }

        public final DexClass getClass(FindClass findClass) {
            findClass.getClass();
            DexClass dexClassInnerGetClass = innerGetClass(null, false, findClass);
            dexClassInnerGetClass.getClass();
            return dexClassInnerGetClass;
        }

        public final DexField getField(FindField findField) {
            findField.getClass();
            DexField dexFieldInnerGetField = innerGetField(null, false, findField);
            dexFieldInnerGetField.getClass();
            return dexFieldInnerGetField;
        }

        public final DexMethod getMethod(FindMethod findMethod) {
            findMethod.getClass();
            DexMethod dexMethodInnerGetMethod = innerGetMethod(null, false, findMethod);
            dexMethodInnerGetMethod.getClass();
            return dexMethodInnerGetMethod;
        }

        public final DexClass getClass(String str, FindClass findClass) {
            str.getClass();
            findClass.getClass();
            DexClass dexClassInnerGetClass = innerGetClass(str, false, findClass);
            dexClassInnerGetClass.getClass();
            return dexClassInnerGetClass;
        }

        public final DexClass getClassOrNull(String str) {
            str.getClass();
            return getClassOrNull$default(this, str, null, 2, null);
        }

        public final List<DexClass> getClasses(String str) {
            str.getClass();
            return getClasses$default(this, str, null, 2, null);
        }

        public final DexField getField(String str, FindField findField) {
            str.getClass();
            findField.getClass();
            DexField dexFieldInnerGetField = innerGetField(str, false, findField);
            dexFieldInnerGetField.getClass();
            return dexFieldInnerGetField;
        }

        public final DexField getFieldOrNull(String str) {
            str.getClass();
            return getFieldOrNull$default(this, str, null, 2, null);
        }

        public final List<DexField> getFields(String str) {
            str.getClass();
            return getFields$default(this, str, null, 2, null);
        }

        public final DexMethod getMethod(String str, FindMethod findMethod) {
            str.getClass();
            findMethod.getClass();
            DexMethod dexMethodInnerGetMethod = innerGetMethod(str, false, findMethod);
            dexMethodInnerGetMethod.getClass();
            return dexMethodInnerGetMethod;
        }

        public final DexMethod getMethodOrNull(String str) {
            str.getClass();
            return getMethodOrNull$default(this, str, null, 2, null);
        }

        public final List<DexMethod> getMethods(String str) {
            str.getClass();
            return getMethods$default(this, str, null, 2, null);
        }

        public final /* synthetic */ DexClass getClass(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindClass findClass = new FindClass();
            interfaceC0742sw.invoke(findClass);
            DexClass dexClassInnerGetClass = innerGetClass(null, false, findClass);
            dexClassInnerGetClass.getClass();
            return dexClassInnerGetClass;
        }

        public final /* synthetic */ DexField getField(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindField findField = new FindField();
            interfaceC0742sw.invoke(findField);
            DexField dexFieldInnerGetField = innerGetField(null, false, findField);
            dexFieldInnerGetField.getClass();
            return dexFieldInnerGetField;
        }

        public final /* synthetic */ DexMethod getMethod(InterfaceC0742sw interfaceC0742sw) {
            interfaceC0742sw.getClass();
            FindMethod findMethod = new FindMethod();
            interfaceC0742sw.invoke(findMethod);
            DexMethod dexMethodInnerGetMethod = innerGetMethod(null, false, findMethod);
            dexMethodInnerGetMethod.getClass();
            return dexMethodInnerGetMethod;
        }

        public final DexClass getClass(String str) {
            str.getClass();
            return getClass$default(this, str, null, 2, null);
        }

        public final DexField getField(String str) {
            str.getClass();
            return getField$default(this, str, null, 2, null);
        }

        public final DexMethod getMethod(String str) {
            str.getClass();
            return getMethod$default(this, str, null, 2, null);
        }

        public final /* synthetic */ void withBridge(InterfaceC0742sw interfaceC0742sw) {
            DexKitBridge dexKitBridge;
            boolean z;
            interfaceC0742sw.getClass();
            CacheBridgeRuntime runtime = getRuntime();
            runtime.beginUse();
            try {
                synchronized (runtime.lifecycleLock) {
                    dexKitBridge = runtime.bridge;
                    if (dexKitBridge == null) {
                        Object objInvoke = runtime.createBridge.invoke();
                        runtime.bridge = (DexKitBridge) objInvoke;
                        dexKitBridge = (DexKitBridge) objInvoke;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    runtime.notifyBridgeCreated.invoke();
                }
                interfaceC0742sw.invoke(dexKitBridge);
                runtime.endUse();
            } catch (Throwable th) {
                runtime.endUse();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class CachePolicy {
        private final boolean cacheSuccess;
        private final CacheFailurePolicy failurePolicy;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? true : (r1v0 boolean))
  (wrap:org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED] (LINE:6)) != (0 int)) ? (wrap:org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy:0x0009: SGET  A[WRAPPED] (LINE:10) org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.NONE org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy) : (r2v0 org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy))
 A[MD:(boolean, org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy):void (m)] (LINE:12) call: org.luckypray.dexkit.DexKitCacheBridge.CachePolicy.<init>(boolean, org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ CachePolicy(boolean z, CacheFailurePolicy cacheFailurePolicy, int i, AbstractC0619pl abstractC0619pl) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? CacheFailurePolicy.NONE : cacheFailurePolicy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ CachePolicy copy$default(CachePolicy cachePolicy, boolean z, CacheFailurePolicy cacheFailurePolicy, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cachePolicy.cacheSuccess;
            }
            if ((i & 2) != 0) {
                cacheFailurePolicy = cachePolicy.failurePolicy;
            }
            return cachePolicy.copy(z, cacheFailurePolicy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean component1() {
            return this.cacheSuccess;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final CacheFailurePolicy component2() {
            return this.failurePolicy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final CachePolicy copy(boolean z, CacheFailurePolicy cacheFailurePolicy) {
            cacheFailurePolicy.getClass();
            return new CachePolicy(z, cacheFailurePolicy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachePolicy)) {
                return false;
            }
            CachePolicy cachePolicy = (CachePolicy) obj;
            return this.cacheSuccess == cachePolicy.cacheSuccess && this.failurePolicy == cachePolicy.failurePolicy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getCacheSuccess() {
            return this.cacheSuccess;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final CacheFailurePolicy getFailurePolicy() {
            return this.failurePolicy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.failurePolicy.hashCode() + (Boolean.hashCode(this.cacheSuccess) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "CachePolicy(cacheSuccess=" + this.cacheSuccess + ", failurePolicy=" + this.failurePolicy + ")";
        }

        public CachePolicy(boolean z, CacheFailurePolicy cacheFailurePolicy) {
            cacheFailurePolicy.getClass();
            this.cacheSuccess = z;
            this.failurePolicy = cacheFailurePolicy;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public CachePolicy() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    public static final RecyclableBridge create(String str, byte[][] bArr) {
        str.getClass();
        bArr.getClass();
        INSTANCE.getCache();
        return CacheBridgeRegistry.INSTANCE.obtainBridge(str, new C05852(str, bArr));
    }

    public static final RecyclableBridge create(String str, ClassLoader classLoader) {
        str.getClass();
        classLoader.getClass();
        INSTANCE.getCache();
        return CacheBridgeRegistry.INSTANCE.obtainBridge(str, new C05863(str, classLoader));
    }

    public static /* synthetic */ void getCachePolicy$annotations() {
    }

    public static /* synthetic */ void getIdleTimeoutMillis$annotations() {
    }
}
