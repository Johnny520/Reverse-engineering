package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C2954;
import Yue.C4335;
import Yue.C4750;
import Yue.C5437;
import Yue.C5499;
import Yue.C5689;
import Yue.C5696;
import Yue.C6659;
import Yue.C7148;
import Yue.C7149;
import Yue.C7627;
import Yue.C8107;
import Yue.EnumC5692;
import Yue.InterfaceC5122;
import Yue.InterfaceC5124;
import Yue.InterfaceC5138;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.annotations.DexKitExperimentalApi;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001:\tBCDEFGHIJB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u0003J)\u0010\u0012\u001a\u00020\u00062\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0010H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u0018\u0010\u001dJ\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u0018\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010\u0003R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R(\u00101\u001a\u0002008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\u0003\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00109\u001a\u0002088\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010\u0003\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006K"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;", "cache", "LYue/ۥۣۢ۠ۤ;", "init", "(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;)V", "Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;", "listener", "addListener", "(Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;)V", "removeListener", "clearListeners", "Lkotlin/Function1;", "LYue/ۥ۠ۡۥۧ;", "block", "notifyListeners", "(LYue/ۥۣ۠ۡ۟;)V", "", "appTag", "path", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "create", "(Ljava/lang/String;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "", "", "dexArray", "(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "Ljava/lang/ClassLoader;", "classLoader", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "clearCache", "(Ljava/lang/String;)V", "clearAllCache", "Ljava/util/concurrent/atomic/AtomicReference;", "cacheRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "reaperScheduler", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "idleTimeoutMillis", "J", "getIdleTimeoutMillis", "()J", "setIdleTimeoutMillis", "(J)V", "getIdleTimeoutMillis$annotations", "Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;", "cachePolicy", "Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;", "getCachePolicy", "()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;", "setCachePolicy", "(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;)V", "getCachePolicy$annotations", "getCache", "()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;", "Cache", "CacheBridgeListener", "CacheFailurePolicy", "CachePolicy", "QueryFailureEvent", "QueryKind", "QuerySuccessEvent", "RecyclableBridge", "ResultSource", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
@InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n1849#2:1820\n1850#2:1822\n1849#2,2:1823\n1#3:1821\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n*L\n145#1:1820\n145#1:1822\n178#1:1823,2\n*E\n"})
@DexKitExperimentalApi
public final class DexKitCacheBridge {

    @InterfaceC6399
    private static final ReentrantReadWriteLock cacheLock;

    @InterfaceC6399
    private static CachePolicy cachePolicy;
    private static long idleTimeoutMillis;

    @InterfaceC6399
    private static final CopyOnWriteArraySet<CacheBridgeListener> listeners;

    @InterfaceC6399
    private static final ScheduledThreadPoolExecutor reaperScheduler;

    @InterfaceC6399
    public static final DexKitCacheBridge INSTANCE = new DexKitCacheBridge();

    @InterfaceC6399
    private static final AtomicReference<Cache> cacheRef = new AtomicReference<>(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;", "", "", C6659.f17103, "default", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "value", "LYue/ۥۣۢ۠ۤ;", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getStringList", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "putStringList", "(Ljava/lang/String;Ljava/util/List;)V", "remove", "(Ljava/lang/String;)V", "", "getAllKeys", "()Ljava/util/Collection;", "clearAll", "()V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public interface Cache {
        void clearAll();

        @InterfaceC6399
        Collection<String> getAllKeys();

        @InterfaceC6489
        String getString(@InterfaceC6399 String key, @InterfaceC6489 String str);

        @InterfaceC6489
        List<String> getStringList(@InterfaceC6399 String key, @InterfaceC6489 List<String> list);

        void putString(@InterfaceC6399 String key, @InterfaceC6399 String value);

        void putStringList(@InterfaceC6399 String key, @InterfaceC6399 List<String> value);

        void remove(@InterfaceC6399 String key);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;", "info", "LYue/ۥۣۢ۠ۤ;", "onQuerySuccess", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V", "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;", "onQueryFailure", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V", "", "appTag", "onBridgeCreated", "(Ljava/lang/String;)V", "onBridgeReleased", "onBridgeDestroyed", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static class CacheBridgeListener {
        public void onBridgeCreated(@InterfaceC6399 String appTag) {
            C5499.m17103(appTag, "appTag");
        }

        public void onBridgeDestroyed(@InterfaceC6399 String appTag) {
            C5499.m17103(appTag, "appTag");
        }

        public void onBridgeReleased(@InterfaceC6399 String appTag) {
            C5499.m17103(appTag, "appTag");
        }

        public void onQueryFailure(@InterfaceC6399 QueryFailureEvent info) {
            C5499.m17103(info, "info");
        }

        public void onQuerySuccess(@InterfaceC6399 QuerySuccessEvent info) {
            C5499.m17103(info, "info");
        }
    }

    @InterfaceC6211(m2698d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;", "", "(Ljava/lang/String;I)V", "NONE", "QUERY_ONLY", "ALL", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public enum CacheFailurePolicy {
        NONE,
        QUERY_ONLY,
        ALL
    }

    @InterfaceC6211(m2698d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;", "", "cacheSuccess", "", "failurePolicy", "Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;", "(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;)V", "getCacheSuccess", "()Z", "getFailurePolicy", "()Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class CachePolicy {
        private final boolean cacheSuccess;

        @InterfaceC6399
        private final CacheFailurePolicy failurePolicy;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public CachePolicy() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CachePolicy copy$default(CachePolicy cachePolicy, boolean z, CacheFailurePolicy cacheFailurePolicy, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cachePolicy.cacheSuccess;
            }
            if ((i & 2) != 0) {
                cacheFailurePolicy = cachePolicy.failurePolicy;
            }
            return cachePolicy.copy(z, cacheFailurePolicy);
        }

        public final boolean component1() {
            return this.cacheSuccess;
        }

        @InterfaceC6399
        public final CacheFailurePolicy component2() {
            return this.failurePolicy;
        }

        @InterfaceC6399
        public final CachePolicy copy(boolean z, @InterfaceC6399 CacheFailurePolicy cacheFailurePolicy) {
            C5499.m17103(cacheFailurePolicy, "failurePolicy");
            return new CachePolicy(z, cacheFailurePolicy);
        }

        public boolean equals(@InterfaceC6489 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachePolicy)) {
                return false;
            }
            CachePolicy cachePolicy = (CachePolicy) obj;
            return this.cacheSuccess == cachePolicy.cacheSuccess && this.failurePolicy == cachePolicy.failurePolicy;
        }

        public final boolean getCacheSuccess() {
            return this.cacheSuccess;
        }

        @InterfaceC6399
        public final CacheFailurePolicy getFailurePolicy() {
            return this.failurePolicy;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.cacheSuccess) * 31) + this.failurePolicy.hashCode();
        }

        @InterfaceC6399
        public String toString() {
            return "CachePolicy(cacheSuccess=" + this.cacheSuccess + ", failurePolicy=" + this.failurePolicy + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public CachePolicy(boolean z, @InterfaceC6399 CacheFailurePolicy cacheFailurePolicy) {
            C5499.m17103(cacheFailurePolicy, "failurePolicy");
            this.cacheSuccess = z;
            this.failurePolicy = cacheFailurePolicy;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy:0x0009: SGET  A[WRAPPED] (LINE:5) org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.NONE org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy) : (r2v0 org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy))
 A[MD:(boolean, org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy):void (m)] (LINE:6) call: org.luckypray.dexkit.DexKitCacheBridge.CachePolicy.<init>(boolean, org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy):void type: THIS */
        public /* synthetic */ CachePolicy(boolean z, CacheFailurePolicy cacheFailurePolicy, int i, C4335 c4335) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? CacheFailurePolicy.NONE : cacheFailurePolicy);
        }
    }

    @InterfaceC6211(m2698d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;", "", "appTag", "", "queryKind", "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;", "requestKey", "source", "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "error", "", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V", "getAppTag", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "getQueryKind", "()Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;", "getRequestKey", "getSource", "()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class QueryFailureEvent {

        @InterfaceC6399
        private final String appTag;

        @InterfaceC6399
        private final Throwable error;

        @InterfaceC6399
        private final QueryKind queryKind;

        @InterfaceC6489
        private final String requestKey;

        @InterfaceC6399
        private final ResultSource source;

        public QueryFailureEvent(@InterfaceC6399 String str, @InterfaceC6399 QueryKind queryKind, @InterfaceC6489 String str2, @InterfaceC6399 ResultSource resultSource, @InterfaceC6399 Throwable th) {
            C5499.m17103(str, "appTag");
            C5499.m17103(queryKind, "queryKind");
            C5499.m17103(resultSource, "source");
            C5499.m17103(th, "error");
            this.appTag = str;
            this.queryKind = queryKind;
            this.requestKey = str2;
            this.source = resultSource;
            this.error = th;
        }

        public static /* synthetic */ QueryFailureEvent copy$default(QueryFailureEvent queryFailureEvent, String str, QueryKind queryKind, String str2, ResultSource resultSource, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = queryFailureEvent.appTag;
            }
            if ((i & 2) != 0) {
                queryKind = queryFailureEvent.queryKind;
            }
            QueryKind queryKind2 = queryKind;
            if ((i & 4) != 0) {
                str2 = queryFailureEvent.requestKey;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                resultSource = queryFailureEvent.source;
            }
            ResultSource resultSource2 = resultSource;
            if ((i & 16) != 0) {
                th = queryFailureEvent.error;
            }
            return queryFailureEvent.copy(str, queryKind2, str3, resultSource2, th);
        }

        @InterfaceC6399
        public final String component1() {
            return this.appTag;
        }

        @InterfaceC6399
        public final QueryKind component2() {
            return this.queryKind;
        }

        @InterfaceC6489
        public final String component3() {
            return this.requestKey;
        }

        @InterfaceC6399
        public final ResultSource component4() {
            return this.source;
        }

        @InterfaceC6399
        public final Throwable component5() {
            return this.error;
        }

        @InterfaceC6399
        public final QueryFailureEvent copy(@InterfaceC6399 String str, @InterfaceC6399 QueryKind queryKind, @InterfaceC6489 String str2, @InterfaceC6399 ResultSource resultSource, @InterfaceC6399 Throwable th) {
            C5499.m17103(str, "appTag");
            C5499.m17103(queryKind, "queryKind");
            C5499.m17103(resultSource, "source");
            C5499.m17103(th, "error");
            return new QueryFailureEvent(str, queryKind, str2, resultSource, th);
        }

        public boolean equals(@InterfaceC6489 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueryFailureEvent)) {
                return false;
            }
            QueryFailureEvent queryFailureEvent = (QueryFailureEvent) obj;
            return C5499.m17094(this.appTag, queryFailureEvent.appTag) && this.queryKind == queryFailureEvent.queryKind && C5499.m17094(this.requestKey, queryFailureEvent.requestKey) && this.source == queryFailureEvent.source && C5499.m17094(this.error, queryFailureEvent.error);
        }

        @InterfaceC6399
        public final String getAppTag() {
            return this.appTag;
        }

        @InterfaceC6399
        public final Throwable getError() {
            return this.error;
        }

        @InterfaceC6399
        public final QueryKind getQueryKind() {
            return this.queryKind;
        }

        @InterfaceC6489
        public final String getRequestKey() {
            return this.requestKey;
        }

        @InterfaceC6399
        public final ResultSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = ((this.appTag.hashCode() * 31) + this.queryKind.hashCode()) * 31;
            String str = this.requestKey;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.source.hashCode()) * 31) + this.error.hashCode();
        }

        @InterfaceC6399
        public String toString() {
            return "QueryFailureEvent(appTag=" + this.appTag + ", queryKind=" + this.queryKind + ", requestKey=" + this.requestKey + ", source=" + this.source + ", error=" + this.error + ")";
        }
    }

    @InterfaceC6211(m2698d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;", "", "(Ljava/lang/String;I)V", "METHOD_SINGLE", "CLASS_SINGLE", "FIELD_SINGLE", "METHOD_LIST", "CLASS_LIST", "FIELD_LIST", "METHOD_BATCH", "CLASS_BATCH", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
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

    @InterfaceC6211(m2698d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;", "", "appTag", "", "queryKind", "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;", "requestKey", "source", "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "matchCount", "", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V", "getAppTag", "()Ljava/lang/String;", "getMatchCount", "()I", "getQueryKind", "()Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;", "getRequestKey", "getSource", "()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class QuerySuccessEvent {

        @InterfaceC6399
        private final String appTag;
        private final int matchCount;

        @InterfaceC6399
        private final QueryKind queryKind;

        @InterfaceC6489
        private final String requestKey;

        @InterfaceC6399
        private final ResultSource source;

        public QuerySuccessEvent(@InterfaceC6399 String str, @InterfaceC6399 QueryKind queryKind, @InterfaceC6489 String str2, @InterfaceC6399 ResultSource resultSource, int i) {
            C5499.m17103(str, "appTag");
            C5499.m17103(queryKind, "queryKind");
            C5499.m17103(resultSource, "source");
            this.appTag = str;
            this.queryKind = queryKind;
            this.requestKey = str2;
            this.source = resultSource;
            this.matchCount = i;
        }

        public static /* synthetic */ QuerySuccessEvent copy$default(QuerySuccessEvent querySuccessEvent, String str, QueryKind queryKind, String str2, ResultSource resultSource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = querySuccessEvent.appTag;
            }
            if ((i2 & 2) != 0) {
                queryKind = querySuccessEvent.queryKind;
            }
            QueryKind queryKind2 = queryKind;
            if ((i2 & 4) != 0) {
                str2 = querySuccessEvent.requestKey;
            }
            String str3 = str2;
            if ((i2 & 8) != 0) {
                resultSource = querySuccessEvent.source;
            }
            ResultSource resultSource2 = resultSource;
            if ((i2 & 16) != 0) {
                i = querySuccessEvent.matchCount;
            }
            return querySuccessEvent.copy(str, queryKind2, str3, resultSource2, i);
        }

        @InterfaceC6399
        public final String component1() {
            return this.appTag;
        }

        @InterfaceC6399
        public final QueryKind component2() {
            return this.queryKind;
        }

        @InterfaceC6489
        public final String component3() {
            return this.requestKey;
        }

        @InterfaceC6399
        public final ResultSource component4() {
            return this.source;
        }

        public final int component5() {
            return this.matchCount;
        }

        @InterfaceC6399
        public final QuerySuccessEvent copy(@InterfaceC6399 String str, @InterfaceC6399 QueryKind queryKind, @InterfaceC6489 String str2, @InterfaceC6399 ResultSource resultSource, int i) {
            C5499.m17103(str, "appTag");
            C5499.m17103(queryKind, "queryKind");
            C5499.m17103(resultSource, "source");
            return new QuerySuccessEvent(str, queryKind, str2, resultSource, i);
        }

        public boolean equals(@InterfaceC6489 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuerySuccessEvent)) {
                return false;
            }
            QuerySuccessEvent querySuccessEvent = (QuerySuccessEvent) obj;
            return C5499.m17094(this.appTag, querySuccessEvent.appTag) && this.queryKind == querySuccessEvent.queryKind && C5499.m17094(this.requestKey, querySuccessEvent.requestKey) && this.source == querySuccessEvent.source && this.matchCount == querySuccessEvent.matchCount;
        }

        @InterfaceC6399
        public final String getAppTag() {
            return this.appTag;
        }

        public final int getMatchCount() {
            return this.matchCount;
        }

        @InterfaceC6399
        public final QueryKind getQueryKind() {
            return this.queryKind;
        }

        @InterfaceC6489
        public final String getRequestKey() {
            return this.requestKey;
        }

        @InterfaceC6399
        public final ResultSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = ((this.appTag.hashCode() * 31) + this.queryKind.hashCode()) * 31;
            String str = this.requestKey;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.source.hashCode()) * 31) + Integer.hashCode(this.matchCount);
        }

        @InterfaceC6399
        public String toString() {
            return "QuerySuccessEvent(appTag=" + this.appTag + ", queryKind=" + this.queryKind + ", requestKey=" + this.requestKey + ", source=" + this.source + ", matchCount=" + this.matchCount + ")";
        }
    }

    @Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 â\u00012\u00020\u0001:\u001aã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001â\u0001ì\u0001í\u0001î\u0001B;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J^\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u001aH\u0082\b¢\u0006\u0004\b\"\u0010#J1\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*J5\u0010-\u001a\b\u0012\u0004\u0012\u00020(0,2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b-\u0010.J1\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J5\u00103\u001a\b\u0012\u0004\u0012\u0002000,2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b3\u00104J1\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J5\u00109\u001a\b\u0012\u0004\u0012\u0002060,2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b9\u0010:J7\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002000,0<2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J7\u0010@\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0<2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\b@\u0010AJ@\u0010D\u001a\u0004\u0018\u00010(2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u001d\b\u0002\u0010'\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010\u001a¢\u0006\u0002\bCH\u0002¢\u0006\u0004\bD\u0010EJ@\u0010G\u001a\u0004\u0018\u0001002\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u001d\b\u0002\u0010'\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010F\u0018\u00010\u001a¢\u0006\u0002\bCH\u0002¢\u0006\u0004\bG\u0010HJ@\u0010J\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u001d\b\u0002\u0010'\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010I\u0018\u00010\u001a¢\u0006\u0002\bCH\u0002¢\u0006\u0004\bJ\u0010KJH\u0010L\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010+\u001a\u00020$2!\b\u0002\u0010'\u001a\u001b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0,\u0018\u00010\u001a¢\u0006\u0002\bCH\u0002¢\u0006\u0004\bL\u0010MJH\u0010N\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010+\u001a\u00020$2!\b\u0002\u0010'\u001a\u001b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0,\u0018\u00010\u001a¢\u0006\u0002\bCH\u0002¢\u0006\u0004\bN\u0010MJH\u0010O\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010+\u001a\u00020$2!\b\u0002\u0010'\u001a\u001b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0,\u0018\u00010\u001a¢\u0006\u0002\bCH\u0002¢\u0006\u0004\bO\u0010MJ\u0013\u0010Q\u001a\u00020&*\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u0013\u0010Q\u001a\u00020/*\u00020SH\u0002¢\u0006\u0004\bQ\u0010TJ\u0013\u0010Q\u001a\u000205*\u00020UH\u0002¢\u0006\u0004\bQ\u0010VJ\u0013\u0010Q\u001a\u00020?*\u00020WH\u0002¢\u0006\u0004\bQ\u0010XJ\u0013\u0010Q\u001a\u00020;*\u00020YH\u0002¢\u0006\u0004\bQ\u0010ZJ\u001f\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020B0\u001a*\u00020[H\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020F0\u001a*\u00020^H\u0002¢\u0006\u0004\b\\\u0010_J\u001f\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020I0\u001a*\u00020`H\u0002¢\u0006\u0004\b\\\u0010aJ%\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0,0\u001a*\u00020bH\u0002¢\u0006\u0004\b\\\u0010cJ%\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0,0\u001a*\u00020dH\u0002¢\u0006\u0004\b\\\u0010eJ%\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0,0\u001a*\u00020fH\u0002¢\u0006\u0004\b\\\u0010gJV\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bj\u0010kJ\u009c\u0001\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0018\"\b\b\u0000\u0010n*\u00020m\"\u0004\b\u0001\u0010o\"\b\b\u0002\u0010 *\u00020p2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010r\u001a\u00020q2\u0010\b\b\u0010t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010s2 \b\b\u0010v\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0u2\u0014\b\b\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001aH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010yJ \u0001\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020,0\u0018\"\b\b\u0000\u0010n*\u00020m\"\u0004\b\u0001\u0010o\"\b\b\u0002\u0010 *\u00020p2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020$2\u0010\b\b\u0010t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010s2 \b\b\u0010v\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0u2\u0014\b\b\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001aH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b{\u0010|J±\u0001\u0010\u0080\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020,0<0\u0018\"\b\b\u0000\u0010n*\u00020m\"\u0004\b\u0001\u0010o\"\b\b\u0002\u0010 *\u00020p2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0010\b\b\u0010t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010s2,\b\b\u0010v\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0<0u2\u0014\b\b\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001aH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJ~\u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0018\"\u0004\b\u0000\u0010o\"\b\b\u0001\u0010 *\u00020p2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010r\u001a\u00020q2\u001d\b\b\u0010v\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a¢\u0006\u0002\bC2\u0014\b\b\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0086\u0001\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0\u0018\"\u0004\b\u0000\u0010o\"\b\b\u0001\u0010 *\u00020p2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010+\u001a\u00020$2!\b\b\u0010v\u001a\u001b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0018\u00010\u001a¢\u0006\u0002\bC2\u0014\b\b\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0010\u0010\u0087\u0001\u001a\u00020$¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0089\u0001\u0010\u0011J\u000f\u0010\u008a\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008a\u0001\u0010\u0011J\u001a\u0010\u008d\u0001\u001a\u00020\u000f2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J%\u0010\u008d\u0001\u001a\u00020\u000f2\u0013\u0010\u008c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0006\b\u008d\u0001\u0010\u008f\u0001J\u0018\u0010\u0090\u0001\u001a\u00020(2\u0006\u0010'\u001a\u00020P¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0018\u0010\u0092\u0001\u001a\u0002002\u0006\u0010'\u001a\u00020S¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0018\u0010\u0094\u0001\u001a\u0002062\u0006\u0010'\u001a\u00020U¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001e\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010'\u001a\u00020P¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010'\u001a\u00020S¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001e\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010'\u001a\u00020U¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J*\u0010\u009c\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0<2\u0006\u0010'\u001a\u00020W¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J*\u0010\u009e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002000,0<2\u0006\u0010'\u001a\u00020Y¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001a\u0010 \u0001\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020P¢\u0006\u0006\b \u0001\u0010\u0091\u0001J\u001a\u0010¡\u0001\u001a\u0004\u0018\u0001002\u0006\u0010'\u001a\u00020S¢\u0006\u0006\b¡\u0001\u0010\u0093\u0001J\u001a\u0010¢\u0001\u001a\u0004\u0018\u0001062\u0006\u0010'\u001a\u00020U¢\u0006\u0006\b¢\u0001\u0010\u0095\u0001J\u001e\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010'\u001a\u00020P¢\u0006\u0006\b£\u0001\u0010\u0097\u0001J\u001e\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010'\u001a\u00020S¢\u0006\u0006\b¤\u0001\u0010\u0099\u0001J\u001e\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010'\u001a\u00020U¢\u0006\u0006\b¥\u0001\u0010\u009b\u0001J&\u0010\u0090\u0001\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010PH\u0007¢\u0006\u0006\b\u0090\u0001\u0010¦\u0001J&\u0010\u0092\u0001\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010SH\u0007¢\u0006\u0006\b\u0092\u0001\u0010§\u0001J&\u0010\u0094\u0001\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010UH\u0007¢\u0006\u0006\b\u0094\u0001\u0010¨\u0001J,\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010PH\u0007¢\u0006\u0006\b\u0096\u0001\u0010©\u0001J,\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010SH\u0007¢\u0006\u0006\b\u0098\u0001\u0010ª\u0001J,\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010UH\u0007¢\u0006\u0006\b\u009a\u0001\u0010«\u0001J8\u0010\u009c\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0<2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010WH\u0007¢\u0006\u0006\b\u009c\u0001\u0010¬\u0001J8\u0010\u009e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002000,0<2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010YH\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u00ad\u0001J(\u0010 \u0001\u001a\u0004\u0018\u00010(2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010PH\u0007¢\u0006\u0006\b \u0001\u0010¦\u0001J(\u0010¡\u0001\u001a\u0004\u0018\u0001002\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010SH\u0007¢\u0006\u0006\b¡\u0001\u0010§\u0001J(\u0010¢\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010UH\u0007¢\u0006\u0006\b¢\u0001\u0010¨\u0001J*\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010P¢\u0006\u0006\b£\u0001\u0010©\u0001J*\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010S¢\u0006\u0006\b¤\u0001\u0010ª\u0001J*\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010U¢\u0006\u0006\b¥\u0001\u0010«\u0001J&\u0010®\u0001\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010[H\u0007¢\u0006\u0006\b®\u0001\u0010¯\u0001J&\u0010°\u0001\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010^H\u0007¢\u0006\u0006\b°\u0001\u0010±\u0001J&\u0010²\u0001\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010`H\u0007¢\u0006\u0006\b²\u0001\u0010³\u0001J,\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010bH\u0007¢\u0006\u0006\b´\u0001\u0010µ\u0001J,\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010dH\u0007¢\u0006\u0006\b¶\u0001\u0010·\u0001J,\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010fH\u0007¢\u0006\u0006\b¸\u0001\u0010¹\u0001J(\u0010º\u0001\u001a\u0004\u0018\u00010(2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010[H\u0007¢\u0006\u0006\bº\u0001\u0010¯\u0001J(\u0010»\u0001\u001a\u0004\u0018\u0001002\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010^H\u0007¢\u0006\u0006\b»\u0001\u0010±\u0001J(\u0010¼\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010`H\u0007¢\u0006\u0006\b¼\u0001\u0010³\u0001J,\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010bH\u0007¢\u0006\u0006\b½\u0001\u0010µ\u0001J,\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010dH\u0007¢\u0006\u0006\b¾\u0001\u0010·\u0001J,\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010fH\u0007¢\u0006\u0006\b¿\u0001\u0010¹\u0001J\u0019\u0010\u0090\u0001\u001a\u00020(2\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b\u0090\u0001\u0010Á\u0001J\u0019\u0010\u0092\u0001\u001a\u0002002\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b\u0092\u0001\u0010Â\u0001J\u0019\u0010\u0094\u0001\u001a\u0002062\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b\u0094\u0001\u0010Ã\u0001J\u001f\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b\u0096\u0001\u0010Ä\u0001J\u001f\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b\u0098\u0001\u0010Å\u0001J\u001f\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b\u009a\u0001\u0010Æ\u0001J+\u0010\u009c\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0<2\u0007\u0010À\u0001\u001a\u00020?¢\u0006\u0006\b\u009c\u0001\u0010Ç\u0001J+\u0010\u009e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002000,0<2\u0007\u0010À\u0001\u001a\u00020;¢\u0006\u0006\b\u009e\u0001\u0010È\u0001J\u001b\u0010 \u0001\u001a\u0004\u0018\u00010(2\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b \u0001\u0010Á\u0001J\u001b\u0010¡\u0001\u001a\u0004\u0018\u0001002\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b¡\u0001\u0010Â\u0001J\u001b\u0010¢\u0001\u001a\u0004\u0018\u0001062\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b¢\u0001\u0010Ã\u0001J\u001f\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b£\u0001\u0010Ä\u0001J\u001f\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b¤\u0001\u0010Å\u0001J\u001f\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b¥\u0001\u0010Æ\u0001J!\u0010\u0090\u0001\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b\u0090\u0001\u0010É\u0001J!\u0010\u0092\u0001\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b\u0092\u0001\u0010Ê\u0001J!\u0010\u0094\u0001\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b\u0094\u0001\u0010Ë\u0001J'\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b\u0096\u0001\u0010Ì\u0001J'\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b\u0098\u0001\u0010Í\u0001J'\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b\u009a\u0001\u0010Î\u0001J2\u0010\u009c\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0<2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020?¢\u0006\u0005\b\u009c\u0001\u0010AJ2\u0010\u009e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002000,0<2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020;¢\u0006\u0005\b\u009e\u0001\u0010>J#\u0010 \u0001\u001a\u0004\u0018\u00010(2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b \u0001\u0010É\u0001J#\u0010¡\u0001\u001a\u0004\u0018\u0001002\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b¡\u0001\u0010Ê\u0001J#\u0010¢\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b¢\u0001\u0010Ë\u0001J'\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020&¢\u0006\u0006\b£\u0001\u0010Ì\u0001J'\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u00020/¢\u0006\u0006\b¤\u0001\u0010Í\u0001J'\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\u0007\u0010À\u0001\u001a\u000205¢\u0006\u0006\b¥\u0001\u0010Î\u0001J)\u0010\u0090\u0001\u001a\u00020(2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0090\u0001\u0010Ï\u0001J)\u0010\u0092\u0001\u001a\u0002002\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0092\u0001\u0010Ð\u0001J)\u0010\u0094\u0001\u001a\u0002062\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0094\u0001\u0010Ñ\u0001J/\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0096\u0001\u0010Ò\u0001J/\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0098\u0001\u0010Ò\u0001J/\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u009a\u0001\u0010Ò\u0001J;\u0010\u009c\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0<2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u009c\u0001\u0010Ó\u0001J;\u0010\u009e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002000,0<2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u009e\u0001\u0010Ó\u0001J+\u0010 \u0001\u001a\u0004\u0018\u00010(2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b \u0001\u0010Ï\u0001J+\u0010¡\u0001\u001a\u0004\u0018\u0001002\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¡\u0001\u0010Ð\u0001J+\u0010¢\u0001\u001a\u0004\u0018\u0001062\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¢\u0001\u0010Ñ\u0001J/\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b£\u0001\u0010Ò\u0001J/\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¤\u0001\u0010Ò\u0001J/\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¥\u0001\u0010Ò\u0001J1\u0010\u0090\u0001\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0090\u0001\u0010Ô\u0001J1\u0010\u0092\u0001\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0092\u0001\u0010Õ\u0001J1\u0010\u0094\u0001\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0094\u0001\u0010Ö\u0001J7\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0096\u0001\u0010×\u0001J7\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u0098\u0001\u0010×\u0001J7\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u009a\u0001\u0010×\u0001JC\u0010\u009c\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0<2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u009c\u0001\u0010Ø\u0001JC\u0010\u009e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002000,0<2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b\u009e\u0001\u0010Ø\u0001J3\u0010 \u0001\u001a\u0004\u0018\u00010(2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b \u0001\u0010Ô\u0001J3\u0010¡\u0001\u001a\u0004\u0018\u0001002\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¡\u0001\u0010Õ\u0001J3\u0010¢\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¢\u0001\u0010Ö\u0001J7\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b£\u0001\u0010×\u0001J7\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¤\u0001\u0010×\u0001J7\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¥\u0001\u0010×\u0001J1\u0010®\u0001\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020B0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b®\u0001\u0010Ô\u0001J1\u0010°\u0001\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020F0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b°\u0001\u0010Õ\u0001J1\u0010²\u0001\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00022\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020I0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b²\u0001\u0010Ö\u0001J=\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0,0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b´\u0001\u0010×\u0001J=\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0,0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¶\u0001\u0010×\u0001J=\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0,0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¸\u0001\u0010×\u0001J5\u0010º\u0001\u001a\u0004\u0018\u00010(2\u0006\u0010\u0015\u001a\u00020\u00022\u0019\u0010'\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010B0\u001a¢\u0006\u0002\bC¢\u0006\u0006\bº\u0001\u0010Ô\u0001J5\u0010»\u0001\u001a\u0004\u0018\u0001002\u0006\u0010\u0015\u001a\u00020\u00022\u0019\u0010'\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010F0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b»\u0001\u0010Õ\u0001J5\u0010¼\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u00022\u0019\u0010'\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010I0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¼\u0001\u0010Ö\u0001J=\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0015\u001a\u00020\u00022\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0,0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b½\u0001\u0010×\u0001J=\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0015\u001a\u00020\u00022\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0,0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¾\u0001\u0010×\u0001J=\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u0002060,2\u0006\u0010\u0015\u001a\u00020\u00022\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0,0\u001a¢\u0006\u0002\bC¢\u0006\u0006\b¿\u0001\u0010×\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Ù\u0001R\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ù\u0001R\u001d\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ú\u0001R\u0017\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Û\u0001R!\u0010á\u0001\u001a\u00030Ü\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ï\u0001"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "Ljava/io/Closeable;", "", "appTag", "path", "", "", "dexArray", "Ljava/lang/ClassLoader;", "classLoader", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V", "Lorg/luckypray/dexkit/DexKitBridge;", "createBridge", "()Lorg/luckypray/dexkit/DexKitBridge;", "LYue/ۥۣۢ۠ۤ;", "ensureUsable", "()V", C4750.f10502, "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;", "queryKind", C6659.f17103, "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "source", "LYue/ۥۡۦۧۤ;", "result", "Lkotlin/Function1;", "", "countOf", "notifyQueryResult-nnTlf9I", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "notifyQueryResult", "R", "block", "acquireBridge", "(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "", "allowNull", "Lorg/luckypray/dexkit/query/FindMethod;", "query", "Lorg/luckypray/dexkit/wrap/DexMethod;", "innerGetMethod", "(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;", "allowEmpty", "", "innerGetMethods", "(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;", "Lorg/luckypray/dexkit/query/FindClass;", "Lorg/luckypray/dexkit/wrap/DexClass;", "innerGetClass", "(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;", "innerGetClasses", "(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;", "Lorg/luckypray/dexkit/query/FindField;", "Lorg/luckypray/dexkit/wrap/DexField;", "innerGetField", "(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;", "innerGetFields", "(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;", "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "", "innerGetBatchUsingStringsClasses", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "innerGetBatchUsingStringsMethods", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;", "Lorg/luckypray/dexkit/result/MethodData;", "LYue/ۥ۠ۡۥۧ;", "innerGetMethodDirect", "(Ljava/lang/String;ZLYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexMethod;", "Lorg/luckypray/dexkit/result/ClassData;", "innerGetClassDirect", "(Ljava/lang/String;ZLYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexClass;", "Lorg/luckypray/dexkit/result/FieldData;", "innerGetFieldDirect", "(Ljava/lang/String;ZLYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexField;", "innerGetMethodsDirect", "(Ljava/lang/String;ZLYue/ۥۣ۠ۡ۟;)Ljava/util/List;", "innerGetClassesDirect", "innerGetFieldsDirect", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;", "toQuery", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;", "toBridgeQuery", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)LYue/ۥۣ۠ۡ۟;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)LYue/ۥۣ۠ۡ۟;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)LYue/ۥۣ۠ۡ۟;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)LYue/ۥۣ۠ۡ۟;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)LYue/ۥۣ۠ۡ۟;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)LYue/ۥۣ۠ۡ۟;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "loadResult", "observeLoad-BWLJW6A", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "observeLoad", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "Q", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;", "mode", "Lkotlin/Function0;", "buildQuery", "Lkotlin/Function2;", "executor", "mapper", "getInternalSingle-hUnOzRk", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "getInternalSingle", "getInternalList-hUnOzRk", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;ZLYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "getInternalList", "getInternalMap-yxL6bBk", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "getInternalMap", "getDirectInternalSingle-yxL6bBk", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "getDirectInternalSingle", "getDirectInternalList-yxL6bBk", "(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;ZLYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "getDirectInternalList", "isRetired", "()Z", "close", "destroy", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFunction;", "action", "withBridge", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFunction;)V", "(LYue/ۥۣ۠ۡ۟;)V", "getMethod", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;", "getClass", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;", "getField", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;", "getMethods", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;", "getClasses", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;", "getFields", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;", "getBatchUsingStringsMethods", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Ljava/util/Map;", "getBatchUsingStringsClasses", "(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Ljava/util/Map;", "getMethodOrNull", "getClassOrNull", "getFieldOrNull", "getMethodsOrEmpty", "getClassesOrEmpty", "getFieldsOrEmpty", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Ljava/util/Map;", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Ljava/util/Map;", "getMethodDirect", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;", "getClassDirect", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;", "getFieldDirect", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;", "getMethodsDirect", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Ljava/util/List;", "getClassesDirect", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Ljava/util/List;", "getFieldsDirect", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Ljava/util/List;", "getMethodDirectOrNull", "getClassDirectOrNull", "getFieldDirectOrNull", "getMethodsDirectOrEmpty", "getClassesDirectOrEmpty", "getFieldsDirectOrEmpty", "finder", "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;", "(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;", "(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;", "(Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;", "(Lorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;", "(Lorg/luckypray/dexkit/query/FindField;)Ljava/util/List;", "(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;", "(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindField;)Ljava/util/List;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexMethod;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexClass;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexField;", "(LYue/ۥۣ۠ۡ۟;)Ljava/util/List;", "(LYue/ۥۣ۠ۡ۟;)Ljava/util/Map;", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexMethod;", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexClass;", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/wrap/DexField;", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Ljava/util/List;", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Ljava/util/Map;", "Ljava/lang/String;", "[[B", "Ljava/lang/ClassLoader;", "Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;", "runtime$delegate", "LYue/ۥ۠ۦۨۨ;", "getRuntime", "()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;", "runtime", "Companion", "BatchFindClassUsingStringsBuilder", "BatchFindMethodUsingStringsBuilder", "BridgeClassBuilder", "BridgeClassesBuilder", "BridgeFieldBuilder", "BridgeFieldsBuilder", "BridgeFunction", "BridgeMethodBuilder", "BridgeMethodsBuilder", "FindClassBuilder", "FindFieldBuilder", "FindMethodBuilder", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    @InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n*L\n1#1,1819:1\n295#1:1850\n295#1:1867\n1645#1,5:1885\n1665#1,16:1890\n1628#1,5:1906\n263#1,3:1911\n266#1,7:1918\n1682#1:1925\n275#1:1926\n276#1,3:1930\n279#1,10:1934\n289#1,3:1946\n1694#1,17:1950\n1628#1,5:1967\n263#1,3:1972\n266#1,7:1979\n1712#1:1986\n275#1:1987\n276#1,3:1991\n279#1,10:1995\n289#1,3:2007\n1645#1,5:2011\n1665#1,16:2016\n1628#1,5:2032\n263#1,3:2037\n266#1,7:2044\n1682#1:2051\n275#1:2052\n276#1,3:2056\n279#1,10:2060\n289#1,3:2072\n1694#1,17:2076\n1628#1,5:2093\n263#1,3:2098\n266#1,7:2105\n1712#1:2112\n275#1:2113\n276#1,3:2117\n279#1,10:2121\n289#1,3:2133\n1645#1,5:2137\n1665#1,16:2142\n1628#1,5:2158\n263#1,3:2163\n266#1,7:2170\n1682#1:2177\n275#1:2178\n276#1,3:2182\n279#1,10:2186\n289#1,3:2198\n1694#1,17:2202\n1628#1,5:2219\n263#1,3:2224\n266#1,7:2231\n1712#1:2238\n275#1:2239\n276#1,3:2243\n279#1,10:2247\n289#1,3:2259\n1723#1,16:2263\n1628#1,5:2279\n263#1,3:2284\n266#1,7:2291\n1740#1:2298\n275#1:2299\n276#1,3:2303\n279#1,10:2307\n289#1,3:2319\n1723#1,16:2323\n1628#1,5:2339\n263#1,3:2344\n266#1,7:2351\n1740#1:2358\n275#1:2359\n276#1,3:2363\n279#1,10:2367\n289#1,3:2379\n1752#1,3:2382\n1768#1,15:2385\n1628#1,5:2400\n263#1,3:2405\n266#1,7:2412\n1784#1:2419\n275#1:2420\n276#1,3:2424\n279#1,10:2428\n289#1,3:2440\n1752#1,3:2443\n1768#1,15:2446\n1628#1,5:2461\n263#1,3:2466\n266#1,7:2473\n1784#1:2480\n275#1:2481\n276#1,3:2485\n279#1,10:2489\n289#1,3:2501\n1752#1,3:2504\n1768#1,15:2507\n1628#1,5:2522\n263#1,3:2527\n266#1,7:2534\n1784#1:2541\n275#1:2542\n276#1,3:2546\n279#1,10:2550\n289#1,3:2562\n1796#1,15:2565\n1628#1,5:2580\n263#1,3:2585\n266#1,7:2592\n1812#1:2599\n275#1:2600\n276#1,3:2604\n279#1,10:2608\n289#1,3:2620\n1796#1,15:2623\n1628#1,5:2638\n263#1,3:2643\n266#1,7:2650\n1812#1:2657\n275#1:2658\n276#1,3:2662\n279#1,10:2666\n289#1,3:2678\n1796#1,15:2681\n1628#1,5:2696\n263#1,3:2701\n266#1,7:2708\n1812#1:2715\n275#1:2716\n276#1,3:2720\n279#1,10:2724\n289#1,3:2736\n263#1,3:2740\n266#1,10:2747\n276#1,3:2760\n279#1,10:2764\n289#1,3:2776\n1628#1,5:2779\n263#1,3:2784\n266#1,10:2791\n276#1,3:2804\n279#1,10:2808\n289#1,3:2820\n1628#1,5:2823\n263#1,3:2828\n266#1,10:2835\n276#1,3:2848\n279#1,10:2852\n289#1,3:2864\n1628#1,5:2867\n263#1,3:2872\n266#1,7:2879\n275#1:2887\n276#1,3:2891\n279#1,10:2895\n289#1,3:2907\n1628#1,5:2910\n263#1,3:2915\n266#1,10:2922\n276#1,3:2935\n279#1,10:2939\n289#1,3:2951\n1628#1,5:2954\n263#1,3:2959\n266#1,10:2966\n276#1,3:2979\n279#1,10:2983\n289#1,3:2995\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n145#2:1827\n146#2:1829\n147#2:1831\n148#2:1833\n145#2:1914\n146#2:1916\n147#2:1927\n148#2:1929\n146#2:1933\n147#2,2:1944\n145#2:1975\n146#2:1977\n147#2:1988\n148#2:1990\n146#2:1994\n147#2,2:2005\n145#2:2040\n146#2:2042\n147#2:2053\n148#2:2055\n146#2:2059\n147#2,2:2070\n145#2:2101\n146#2:2103\n147#2:2114\n148#2:2116\n146#2:2120\n147#2,2:2131\n145#2:2166\n146#2:2168\n147#2:2179\n148#2:2181\n146#2:2185\n147#2,2:2196\n145#2:2227\n146#2:2229\n147#2:2240\n148#2:2242\n146#2:2246\n147#2,2:2257\n145#2:2287\n146#2:2289\n147#2:2300\n148#2:2302\n146#2:2306\n147#2,2:2317\n145#2:2347\n146#2:2349\n147#2:2360\n148#2:2362\n146#2:2366\n147#2,2:2377\n145#2:2408\n146#2:2410\n147#2:2421\n148#2:2423\n146#2:2427\n147#2,2:2438\n145#2:2469\n146#2:2471\n147#2:2482\n148#2:2484\n146#2:2488\n147#2,2:2499\n145#2:2530\n146#2:2532\n147#2:2543\n148#2:2545\n146#2:2549\n147#2,2:2560\n145#2:2588\n146#2:2590\n147#2:2601\n148#2:2603\n146#2:2607\n147#2,2:2618\n145#2:2646\n146#2:2648\n147#2:2659\n148#2:2661\n146#2:2665\n147#2,2:2676\n145#2:2704\n146#2:2706\n147#2:2717\n148#2:2719\n146#2:2723\n147#2,2:2734\n145#2:2743\n146#2:2745\n147#2:2757\n148#2:2759\n146#2:2763\n147#2,2:2774\n145#2:2787\n146#2:2789\n147#2:2801\n148#2:2803\n146#2:2807\n147#2,2:2818\n145#2:2831\n146#2:2833\n147#2:2845\n148#2:2847\n146#2:2851\n147#2,2:2862\n145#2:2875\n146#2:2877\n147#2:2888\n148#2:2890\n146#2:2894\n147#2,2:2905\n145#2:2918\n146#2:2920\n147#2:2932\n148#2:2934\n146#2:2938\n147#2,2:2949\n145#2:2962\n146#2:2964\n147#2:2976\n148#2:2978\n146#2:2982\n147#2,2:2993\n1849#3:1821\n1850#3:1825\n1849#3:1828\n1850#3:1832\n1849#3:1915\n1850#3:1928\n1849#3:1976\n1850#3:1989\n1849#3:2041\n1850#3:2054\n1849#3:2102\n1850#3:2115\n1849#3:2167\n1850#3:2180\n1849#3:2228\n1850#3:2241\n1849#3:2288\n1850#3:2301\n1849#3:2348\n1850#3:2361\n1849#3:2409\n1850#3:2422\n1849#3:2470\n1850#3:2483\n1849#3:2531\n1850#3:2544\n1849#3:2589\n1850#3:2602\n1849#3:2647\n1850#3:2660\n1849#3:2705\n1850#3:2718\n1849#3:2744\n1850#3:2758\n1849#3:2788\n1850#3:2802\n1849#3:2832\n1850#3:2846\n1849#3:2876\n1850#3:2889\n1849#3:2919\n1850#3:2933\n1849#3:2963\n1850#3:2977\n1#4:1823\n1#4:1830\n1#4:1884\n1#4:1917\n1#4:1949\n1#4:1978\n1#4:2010\n1#4:2043\n1#4:2075\n1#4:2104\n1#4:2136\n1#4:2169\n1#4:2201\n1#4:2230\n1#4:2262\n1#4:2290\n1#4:2322\n1#4:2350\n1#4:2411\n1#4:2472\n1#4:2533\n1#4:2591\n1#4:2649\n1#4:2707\n1#4:2739\n1#4:2746\n1#4:2790\n1#4:2834\n1#4:2878\n1#4:2886\n1#4:2921\n1#4:2965\n91#5,16:1834\n91#5,16:1851\n91#5,16:1868\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n*L\n310#1:1850\n315#1:1867\n1388#1:1885,5\n1388#1:1890,16\n1388#1:1906,5\n1388#1:1911,3\n1388#1:1918,7\n1388#1:1925\n1388#1:1926\n1388#1:1930,3\n1388#1:1934,10\n1388#1:1946,3\n1409#1:1950,17\n1409#1:1967,5\n1409#1:1972,3\n1409#1:1979,7\n1409#1:1986\n1409#1:1987\n1409#1:1991,3\n1409#1:1995,10\n1409#1:2007,3\n1423#1:2011,5\n1423#1:2016,16\n1423#1:2032,5\n1423#1:2037,3\n1423#1:2044,7\n1423#1:2051\n1423#1:2052\n1423#1:2056,3\n1423#1:2060,10\n1423#1:2072,3\n1440#1:2076,17\n1440#1:2093,5\n1440#1:2098,3\n1440#1:2105,7\n1440#1:2112\n1440#1:2113\n1440#1:2117,3\n1440#1:2121,10\n1440#1:2133,3\n1453#1:2137,5\n1453#1:2142,16\n1453#1:2158,5\n1453#1:2163,3\n1453#1:2170,7\n1453#1:2177\n1453#1:2178\n1453#1:2182,3\n1453#1:2186,10\n1453#1:2198,3\n1470#1:2202,17\n1470#1:2219,5\n1470#1:2224,3\n1470#1:2231,7\n1470#1:2238\n1470#1:2239\n1470#1:2243,3\n1470#1:2247,10\n1470#1:2259,3\n1482#1:2263,16\n1482#1:2279,5\n1482#1:2284,3\n1482#1:2291,7\n1482#1:2298\n1482#1:2299\n1482#1:2303,3\n1482#1:2307,10\n1482#1:2319,3\n1493#1:2323,16\n1493#1:2339,5\n1493#1:2344,3\n1493#1:2351,7\n1493#1:2358\n1493#1:2359\n1493#1:2363,3\n1493#1:2367,10\n1493#1:2379,3\n1505#1:2382,3\n1505#1:2385,15\n1505#1:2400,5\n1505#1:2405,3\n1505#1:2412,7\n1505#1:2419\n1505#1:2420\n1505#1:2424,3\n1505#1:2428,10\n1505#1:2440,3\n1521#1:2443,3\n1521#1:2446,15\n1521#1:2461,5\n1521#1:2466,3\n1521#1:2473,7\n1521#1:2480\n1521#1:2481\n1521#1:2485,3\n1521#1:2489,10\n1521#1:2501,3\n1537#1:2504,3\n1537#1:2507,15\n1537#1:2522,5\n1537#1:2527,3\n1537#1:2534,7\n1537#1:2541\n1537#1:2542\n1537#1:2546,3\n1537#1:2550,10\n1537#1:2562,3\n1553#1:2565,15\n1553#1:2580,5\n1553#1:2585,3\n1553#1:2592,7\n1553#1:2599\n1553#1:2600\n1553#1:2604,3\n1553#1:2608,10\n1553#1:2620,3\n1565#1:2623,15\n1565#1:2638,5\n1565#1:2643,3\n1565#1:2650,7\n1565#1:2657\n1565#1:2658\n1565#1:2662,3\n1565#1:2666,10\n1565#1:2678,3\n1577#1:2681,15\n1577#1:2696,5\n1577#1:2701,3\n1577#1:2708,7\n1577#1:2715\n1577#1:2716\n1577#1:2720,3\n1577#1:2724,10\n1577#1:2736,3\n1628#1:2740,3\n1628#1:2747,10\n1628#1:2760,3\n1628#1:2764,10\n1628#1:2776,3\n1666#1:2779,5\n1666#1:2784,3\n1666#1:2791,10\n1666#1:2804,3\n1666#1:2808,10\n1666#1:2820,3\n1700#1:2823,5\n1700#1:2828,3\n1700#1:2835,10\n1700#1:2848,3\n1700#1:2852,10\n1700#1:2864,3\n1729#1:2867,5\n1729#1:2872,3\n1729#1:2879,7\n1729#1:2887\n1729#1:2891,3\n1729#1:2895,10\n1729#1:2907,3\n1768#1:2910,5\n1768#1:2915,3\n1768#1:2922,10\n1768#1:2935,3\n1768#1:2939,10\n1768#1:2951,3\n1800#1:2954,5\n1800#1:2959,3\n1800#1:2966,10\n1800#1:2979,3\n1800#1:2983,10\n1800#1:2995,3\n265#1:1820\n265#1:1822\n265#1:1824\n265#1:1826\n278#1:1827\n278#1:1829\n278#1:1831\n278#1:1833\n1388#1:1914\n1388#1:1916\n1388#1:1927\n1388#1:1929\n1388#1:1933\n1388#1:1944,2\n1409#1:1975\n1409#1:1977\n1409#1:1988\n1409#1:1990\n1409#1:1994\n1409#1:2005,2\n1423#1:2040\n1423#1:2042\n1423#1:2053\n1423#1:2055\n1423#1:2059\n1423#1:2070,2\n1440#1:2101\n1440#1:2103\n1440#1:2114\n1440#1:2116\n1440#1:2120\n1440#1:2131,2\n1453#1:2166\n1453#1:2168\n1453#1:2179\n1453#1:2181\n1453#1:2185\n1453#1:2196,2\n1470#1:2227\n1470#1:2229\n1470#1:2240\n1470#1:2242\n1470#1:2246\n1470#1:2257,2\n1482#1:2287\n1482#1:2289\n1482#1:2300\n1482#1:2302\n1482#1:2306\n1482#1:2317,2\n1493#1:2347\n1493#1:2349\n1493#1:2360\n1493#1:2362\n1493#1:2366\n1493#1:2377,2\n1505#1:2408\n1505#1:2410\n1505#1:2421\n1505#1:2423\n1505#1:2427\n1505#1:2438,2\n1521#1:2469\n1521#1:2471\n1521#1:2482\n1521#1:2484\n1521#1:2488\n1521#1:2499,2\n1537#1:2530\n1537#1:2532\n1537#1:2543\n1537#1:2545\n1537#1:2549\n1537#1:2560,2\n1553#1:2588\n1553#1:2590\n1553#1:2601\n1553#1:2603\n1553#1:2607\n1553#1:2618,2\n1565#1:2646\n1565#1:2648\n1565#1:2659\n1565#1:2661\n1565#1:2665\n1565#1:2676,2\n1577#1:2704\n1577#1:2706\n1577#1:2717\n1577#1:2719\n1577#1:2723\n1577#1:2734,2\n1628#1:2743\n1628#1:2745\n1628#1:2757\n1628#1:2759\n1628#1:2763\n1628#1:2774,2\n1666#1:2787\n1666#1:2789\n1666#1:2801\n1666#1:2803\n1666#1:2807\n1666#1:2818,2\n1700#1:2831\n1700#1:2833\n1700#1:2845\n1700#1:2847\n1700#1:2851\n1700#1:2862,2\n1729#1:2875\n1729#1:2877\n1729#1:2888\n1729#1:2890\n1729#1:2894\n1729#1:2905,2\n1768#1:2918\n1768#1:2920\n1768#1:2932\n1768#1:2934\n1768#1:2938\n1768#1:2949,2\n1800#1:2962\n1800#1:2964\n1800#1:2976\n1800#1:2978\n1800#1:2982\n1800#1:2993,2\n265#1:1821\n265#1:1825\n278#1:1828\n278#1:1832\n1388#1:1915\n1388#1:1928\n1409#1:1976\n1409#1:1989\n1423#1:2041\n1423#1:2054\n1440#1:2102\n1440#1:2115\n1453#1:2167\n1453#1:2180\n1470#1:2228\n1470#1:2241\n1482#1:2288\n1482#1:2301\n1493#1:2348\n1493#1:2361\n1505#1:2409\n1505#1:2422\n1521#1:2470\n1521#1:2483\n1537#1:2531\n1537#1:2544\n1553#1:2589\n1553#1:2602\n1565#1:2647\n1565#1:2660\n1577#1:2705\n1577#1:2718\n1628#1:2744\n1628#1:2758\n1666#1:2788\n1666#1:2802\n1700#1:2832\n1700#1:2846\n1729#1:2876\n1729#1:2889\n1768#1:2919\n1768#1:2933\n1800#1:2963\n1800#1:2977\n265#1:1823\n278#1:1830\n1388#1:1917\n1409#1:1978\n1423#1:2043\n1440#1:2104\n1453#1:2169\n1470#1:2230\n1482#1:2290\n1493#1:2350\n1505#1:2411\n1521#1:2472\n1537#1:2533\n1553#1:2591\n1565#1:2649\n1577#1:2707\n1628#1:2746\n1666#1:2790\n1700#1:2834\n1729#1:2878\n1768#1:2921\n1800#1:2965\n295#1:1834,16\n310#1:1851,16\n315#1:1868,16\n*E\n"})
    public static final class RecyclableBridge implements Closeable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @InterfaceC6399
        public static final Companion INSTANCE = new Companion(null);

        @InterfaceC6399
        private final String appTag;

        @InterfaceC6489
        private final ClassLoader classLoader;

        @InterfaceC6489
        private final byte[][] dexArray;

        @InterfaceC6489
        private final String path;

        /* JADX INFO: renamed from: runtime$delegate, reason: from kotlin metadata */
        @InterfaceC6399
        private final InterfaceC5684 runtime;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;", "", "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "f", "LYue/ۥۣۢ۠ۤ;", "build", "(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
        public interface BatchFindClassUsingStringsBuilder {
            void build(@InterfaceC6399 BatchFindClassUsingStrings f);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;", "", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "f", "LYue/ۥۣۢ۠ۤ;", "build", "(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
        public interface BatchFindMethodUsingStringsBuilder {
            void build(@InterfaceC6399 BatchFindMethodUsingStrings f);
        }

        @InterfaceC6211(m2698d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;", "", "build", "Lorg/luckypray/dexkit/result/ClassData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public interface BridgeClassBuilder {
            @InterfaceC6399
            ClassData build(@InterfaceC6399 DexKitBridge dexKitBridge);
        }

        @InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;", "", "build", "", "Lorg/luckypray/dexkit/result/ClassData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public interface BridgeClassesBuilder {
            @InterfaceC6399
            List<ClassData> build(@InterfaceC6399 DexKitBridge dexKitBridge);
        }

        @InterfaceC6211(m2698d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;", "", "build", "Lorg/luckypray/dexkit/result/FieldData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public interface BridgeFieldBuilder {
            @InterfaceC6399
            FieldData build(@InterfaceC6399 DexKitBridge dexKitBridge);
        }

        @InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;", "", "build", "", "Lorg/luckypray/dexkit/result/FieldData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public interface BridgeFieldsBuilder {
            @InterfaceC6399
            List<FieldData> build(@InterfaceC6399 DexKitBridge dexKitBridge);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFunction;", "", "Lorg/luckypray/dexkit/DexKitBridge;", "bridge", "LYue/ۥۣۢ۠ۤ;", "apply", "(Lorg/luckypray/dexkit/DexKitBridge;)V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
        public interface BridgeFunction {
            void apply(@InterfaceC6399 DexKitBridge bridge);
        }

        @InterfaceC6211(m2698d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;", "", "build", "Lorg/luckypray/dexkit/result/MethodData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public interface BridgeMethodBuilder {
            @InterfaceC6399
            MethodData build(@InterfaceC6399 DexKitBridge dexKitBridge);
        }

        @InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;", "", "build", "", "Lorg/luckypray/dexkit/result/MethodData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public interface BridgeMethodsBuilder {
            @InterfaceC6399
            List<MethodData> build(@InterfaceC6399 DexKitBridge dexKitBridge);
        }

        @InterfaceC6211(m2698d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\t¨\u0006\u000f"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "appTag", "", "classLoader", "Ljava/lang/ClassLoader;", "create$dexkit_android_release", "dexArray", "", "", "(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "path", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final /* synthetic */ RecyclableBridge create$dexkit_android_release(String str, String str2) {
                C5499.m17103(str, "appTag");
                C5499.m17103(str2, "path");
                return new RecyclableBridge(str, str2, null, null, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public final /* synthetic */ RecyclableBridge create$dexkit_android_release(String str, byte[][] bArr) {
                C5499.m17103(str, "appTag");
                C5499.m17103(bArr, "dexArray");
                return new RecyclableBridge(str, null, bArr, null, null);
            }

            public final /* synthetic */ RecyclableBridge create$dexkit_android_release(String str, ClassLoader classLoader) {
                C5499.m17103(str, "appTag");
                C5499.m17103(classLoader, "classLoader");
                return new RecyclableBridge(str, null, null, classLoader, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;", "", "Lorg/luckypray/dexkit/query/FindClass;", "f", "LYue/ۥۣۢ۠ۤ;", "build", "(Lorg/luckypray/dexkit/query/FindClass;)V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
        public interface FindClassBuilder {
            void build(@InterfaceC6399 FindClass f);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;", "", "Lorg/luckypray/dexkit/query/FindField;", "f", "LYue/ۥۣۢ۠ۤ;", "build", "(Lorg/luckypray/dexkit/query/FindField;)V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
        public interface FindFieldBuilder {
            void build(@InterfaceC6399 FindField f);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;", "", "Lorg/luckypray/dexkit/query/FindMethod;", "f", "LYue/ۥۣۢ۠ۤ;", "build", "(Lorg/luckypray/dexkit/query/FindMethod;)V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
        public interface FindMethodBuilder {
            void build(@InterfaceC6399 FindMethod f);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 byte[][]), (r4v0 java.lang.ClassLoader) A[MD:(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void (m)] (LINE:1) call: org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.<init>(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ RecyclableBridge(String str, String str2, byte[][] bArr, ClassLoader classLoader, C4335 c4335) {
            this(str, str2, bArr, classLoader);
        }

        /* JADX DEBUG: Class process forced to load method for inline: org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(org.luckypray.dexkit.cache.CacheBridgeRuntime):void */
        private final <R> R acquireBridge(InterfaceC5124<? super DexKitBridge, ? extends R> block) {
            DexKitBridge dexKitBridge;
            boolean z;
            CacheBridgeRuntime runtime = getRuntime();
            runtime.beginUse();
            try {
                synchronized (runtime.lifecycleLock) {
                    try {
                        dexKitBridge = runtime.bridge;
                        if (dexKitBridge == null) {
                            Object objInvoke = runtime.createBridge.invoke();
                            runtime.bridge = (DexKitBridge) objInvoke;
                            dexKitBridge = (DexKitBridge) objInvoke;
                            z = true;
                        } else {
                            z = false;
                        }
                        C5437.m16930(1);
                    } catch (Throwable th) {
                        C5437.m16930(1);
                        C5437.m16929(1);
                        throw th;
                    }
                }
                C5437.m16929(1);
                if (z) {
                    runtime.notifyBridgeCreated.invoke();
                }
                R rInvoke = block.invoke(dexKitBridge);
                C5437.m16930(1);
                runtime.endUse();
                C5437.m16929(1);
                return rInvoke;
            } catch (Throwable th2) {
                C5437.m16930(1);
                runtime.endUse();
                C5437.m16929(1);
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DexKitBridge createBridge() {
            String str = this.path;
            if (str != null) {
                return DexKitBridge.INSTANCE.create(str);
            }
            byte[][] bArr = this.dexArray;
            if (bArr != null) {
                return DexKitBridge.INSTANCE.create(bArr);
            }
            ClassLoader classLoader = this.classLoader;
            if (classLoader != null) {
                return DexKitBridge.INSTANCE.create(classLoader, true);
            }
            throw new IllegalStateException("init fail".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ensureUsable() {
            getRuntime().ensureUsable();
        }

        public static /* synthetic */ Map getBatchUsingStringsClasses$default(RecyclableBridge recyclableBridge, String str, BatchFindClassUsingStringsBuilder batchFindClassUsingStringsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindClassUsingStringsBuilder = null;
            }
            return recyclableBridge.getBatchUsingStringsClasses(str, batchFindClassUsingStringsBuilder);
        }

        public static /* synthetic */ Map getBatchUsingStringsMethods$default(RecyclableBridge recyclableBridge, String str, BatchFindMethodUsingStringsBuilder batchFindMethodUsingStringsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindMethodUsingStringsBuilder = null;
            }
            return recyclableBridge.getBatchUsingStringsMethods(str, batchFindMethodUsingStringsBuilder);
        }

        public static /* synthetic */ DexClass getClass$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClass(str, findClassBuilder);
        }

        public static /* synthetic */ DexClass getClassDirect$default(RecyclableBridge recyclableBridge, String str, BridgeClassBuilder bridgeClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassBuilder = null;
            }
            return recyclableBridge.getClassDirect(str, bridgeClassBuilder);
        }

        public static /* synthetic */ DexClass getClassDirectOrNull$default(RecyclableBridge recyclableBridge, String str, BridgeClassBuilder bridgeClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassBuilder = null;
            }
            return recyclableBridge.getClassDirectOrNull(str, bridgeClassBuilder);
        }

        public static /* synthetic */ DexClass getClassOrNull$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClassOrNull(str, findClassBuilder);
        }

        public static /* synthetic */ List getClasses$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClasses(str, findClassBuilder);
        }

        public static /* synthetic */ List getClassesDirect$default(RecyclableBridge recyclableBridge, String str, BridgeClassesBuilder bridgeClassesBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassesBuilder = null;
            }
            return recyclableBridge.getClassesDirect(str, bridgeClassesBuilder);
        }

        public static /* synthetic */ List getClassesDirectOrEmpty$default(RecyclableBridge recyclableBridge, String str, BridgeClassesBuilder bridgeClassesBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeClassesBuilder = null;
            }
            return recyclableBridge.getClassesDirectOrEmpty(str, bridgeClassesBuilder);
        }

        public static /* synthetic */ List getClassesOrEmpty$default(RecyclableBridge recyclableBridge, String str, FindClassBuilder findClassBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findClassBuilder = null;
            }
            return recyclableBridge.getClassesOrEmpty(str, findClassBuilder);
        }

        /* JADX INFO: renamed from: getDirectInternalList-yxL6bBk, reason: not valid java name */
        private final <D, R extends ISerializable> Object m31140getDirectInternalListyxL6bBk(QueryKind queryKind, String key, boolean allowEmpty, InterfaceC5124<? super DexKitBridge, ? extends List<? extends D>> executor, InterfaceC5124<? super D, ? extends R> mapper) {
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", key, null, 8, null), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), executor != null ? new C2920x87bd6f8e(this, executor, mapper) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            return objM31149getResultd1pmJ48;
        }

        /* JADX INFO: renamed from: getDirectInternalSingle-yxL6bBk, reason: not valid java name */
        private final <D, R extends ISerializable> Object m31141getDirectInternalSingleyxL6bBk(QueryKind queryKind, String key, CacheBridgeStore.SingleResolveMode mode, InterfaceC5124<? super DexKitBridge, ? extends D> executor, InterfaceC5124<? super D, ? extends R> mapper) {
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", key, null, 8, null);
            C2921x95b222e4 c2921x95b222e4 = executor != null ? new C2921x95b222e4(this, executor, mapper) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, mode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c2921x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? 0 : 1));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            return objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ DexField getField$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getField(str, findFieldBuilder);
        }

        public static /* synthetic */ DexField getFieldDirect$default(RecyclableBridge recyclableBridge, String str, BridgeFieldBuilder bridgeFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldBuilder = null;
            }
            return recyclableBridge.getFieldDirect(str, bridgeFieldBuilder);
        }

        public static /* synthetic */ DexField getFieldDirectOrNull$default(RecyclableBridge recyclableBridge, String str, BridgeFieldBuilder bridgeFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldBuilder = null;
            }
            return recyclableBridge.getFieldDirectOrNull(str, bridgeFieldBuilder);
        }

        public static /* synthetic */ DexField getFieldOrNull$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getFieldOrNull(str, findFieldBuilder);
        }

        public static /* synthetic */ List getFields$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getFields(str, findFieldBuilder);
        }

        public static /* synthetic */ List getFieldsDirect$default(RecyclableBridge recyclableBridge, String str, BridgeFieldsBuilder bridgeFieldsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldsBuilder = null;
            }
            return recyclableBridge.getFieldsDirect(str, bridgeFieldsBuilder);
        }

        public static /* synthetic */ List getFieldsDirectOrEmpty$default(RecyclableBridge recyclableBridge, String str, BridgeFieldsBuilder bridgeFieldsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeFieldsBuilder = null;
            }
            return recyclableBridge.getFieldsDirectOrEmpty(str, bridgeFieldsBuilder);
        }

        public static /* synthetic */ List getFieldsOrEmpty$default(RecyclableBridge recyclableBridge, String str, FindFieldBuilder findFieldBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findFieldBuilder = null;
            }
            return recyclableBridge.getFieldsOrEmpty(str, findFieldBuilder);
        }

        /* JADX INFO: renamed from: getInternalList-hUnOzRk, reason: not valid java name */
        private final <Q extends BaseFinder, D, R extends ISerializable> Object m31142getInternalListhUnOzRk(QueryKind queryKind, String key, boolean allowEmpty, InterfaceC5122<? extends Q> buildQuery, InterfaceC5138<? super DexKitBridge, ? super Q, ? extends List<? extends D>> executor, InterfaceC5124<? super D, ? extends R> mapper) {
            Q qInvoke = buildQuery != null ? buildQuery.invoke() : null;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", key, qInvoke), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), qInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, executor, qInvoke, mapper) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            return objM31149getResultd1pmJ48;
        }

        /* JADX INFO: renamed from: getInternalMap-yxL6bBk, reason: not valid java name */
        private final <Q extends BaseFinder, D, R extends ISerializable> Object m31143getInternalMapyxL6bBk(QueryKind queryKind, String key, InterfaceC5122<? extends Q> buildQuery, InterfaceC5138<? super DexKitBridge, ? super Q, ? extends Map<String, ? extends List<? extends D>>> executor, InterfaceC5124<? super D, ? extends R> mapper) {
            Q qInvoke = buildQuery != null ? buildQuery.invoke() : null;
            CacheBridgeStore.LoadResult cachedMap = CacheBridgeStore.INSTANCE.getCachedMap(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "b", key, qInvoke), new DexKitCacheBridge$RecyclableBridge$getInternalMap$1(this), qInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(this, executor, qInvoke, mapper) : null);
            ResultSource source = cachedMap.getSource();
            Object objM31149getResultd1pmJ48 = cachedMap.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        String str = this.appTag;
                        Iterator it = ((Map) objM31149getResultd1pmJ48).values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((List) it.next()).size();
                        }
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(str, queryKind, key, source, size));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            return objM31149getResultd1pmJ48;
        }

        /* JADX INFO: renamed from: getInternalSingle-hUnOzRk, reason: not valid java name */
        private final <Q extends BaseFinder, D, R extends ISerializable> Object m31144getInternalSinglehUnOzRk(QueryKind queryKind, String key, CacheBridgeStore.SingleResolveMode mode, InterfaceC5122<? extends Q> buildQuery, InterfaceC5138<? super DexKitBridge, ? super Q, ? extends List<? extends D>> executor, InterfaceC5124<? super D, ? extends R> mapper) {
            Q qInvoke = buildQuery != null ? buildQuery.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", key, qInvoke);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = qInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, executor, qInvoke, mapper) : null;
            boolean z = key == null && qInvoke != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, mode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? 0 : 1));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            return objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ DexMethod getMethod$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethod(str, findMethodBuilder);
        }

        public static /* synthetic */ DexMethod getMethodDirect$default(RecyclableBridge recyclableBridge, String str, BridgeMethodBuilder bridgeMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodBuilder = null;
            }
            return recyclableBridge.getMethodDirect(str, bridgeMethodBuilder);
        }

        public static /* synthetic */ DexMethod getMethodDirectOrNull$default(RecyclableBridge recyclableBridge, String str, BridgeMethodBuilder bridgeMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodBuilder = null;
            }
            return recyclableBridge.getMethodDirectOrNull(str, bridgeMethodBuilder);
        }

        public static /* synthetic */ DexMethod getMethodOrNull$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethodOrNull(str, findMethodBuilder);
        }

        public static /* synthetic */ List getMethods$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethods(str, findMethodBuilder);
        }

        public static /* synthetic */ List getMethodsDirect$default(RecyclableBridge recyclableBridge, String str, BridgeMethodsBuilder bridgeMethodsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodsBuilder = null;
            }
            return recyclableBridge.getMethodsDirect(str, bridgeMethodsBuilder);
        }

        public static /* synthetic */ List getMethodsDirectOrEmpty$default(RecyclableBridge recyclableBridge, String str, BridgeMethodsBuilder bridgeMethodsBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                bridgeMethodsBuilder = null;
            }
            return recyclableBridge.getMethodsDirectOrEmpty(str, bridgeMethodsBuilder);
        }

        public static /* synthetic */ List getMethodsOrEmpty$default(RecyclableBridge recyclableBridge, String str, FindMethodBuilder findMethodBuilder, int i, Object obj) {
            if ((i & 2) != 0) {
                findMethodBuilder = null;
            }
            return recyclableBridge.getMethodsOrEmpty(str, findMethodBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CacheBridgeRuntime getRuntime() {
            return (CacheBridgeRuntime) this.runtime.getValue();
        }

        private final Map<String, List<DexClass>> innerGetBatchUsingStringsClasses(String key, BatchFindClassUsingStrings query) {
            QueryKind queryKind = QueryKind.CLASS_BATCH;
            C2922xab6759f c2922xab6759f = query != null ? new C2922xab6759f(query) : null;
            C2923xd5638d93 c2923xd5638d93 = C2923xd5638d93.INSTANCE;
            C2924xd5638d94 c2924xd5638d94 = C2924xd5638d94.INSTANCE;
            BatchFindClassUsingStrings batchFindClassUsingStringsInvoke = c2922xab6759f != null ? c2922xab6759f.invoke() : null;
            CacheBridgeStore.LoadResult cachedMap = CacheBridgeStore.INSTANCE.getCachedMap(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "b", key, batchFindClassUsingStringsInvoke), new DexKitCacheBridge$RecyclableBridge$getInternalMap$1(this), batchFindClassUsingStringsInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(this, c2923xd5638d93, batchFindClassUsingStringsInvoke, c2924xd5638d94) : null);
            ResultSource source = cachedMap.getSource();
            Object objM31149getResultd1pmJ48 = cachedMap.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        String str = this.appTag;
                        Iterator it = ((Map) objM31149getResultd1pmJ48).values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((List) it.next()).size();
                        }
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(str, queryKind, key, source, size));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (Map) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ Map innerGetBatchUsingStringsClasses$default(RecyclableBridge recyclableBridge, String str, BatchFindClassUsingStrings batchFindClassUsingStrings, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindClassUsingStrings = null;
            }
            return recyclableBridge.innerGetBatchUsingStringsClasses(str, batchFindClassUsingStrings);
        }

        private final Map<String, List<DexMethod>> innerGetBatchUsingStringsMethods(String key, BatchFindMethodUsingStrings query) {
            QueryKind queryKind = QueryKind.METHOD_BATCH;
            C2925xe2bce32b c2925xe2bce32b = query != null ? new C2925xe2bce32b(query) : null;
            C2926xa2ffee1f c2926xa2ffee1f = C2926xa2ffee1f.INSTANCE;
            C2927xa2ffee20 c2927xa2ffee20 = C2927xa2ffee20.INSTANCE;
            BatchFindMethodUsingStrings batchFindMethodUsingStringsInvoke = c2925xe2bce32b != null ? c2925xe2bce32b.invoke() : null;
            CacheBridgeStore.LoadResult cachedMap = CacheBridgeStore.INSTANCE.getCachedMap(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "b", key, batchFindMethodUsingStringsInvoke), new DexKitCacheBridge$RecyclableBridge$getInternalMap$1(this), batchFindMethodUsingStringsInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(this, c2926xa2ffee1f, batchFindMethodUsingStringsInvoke, c2927xa2ffee20) : null);
            ResultSource source = cachedMap.getSource();
            Object objM31149getResultd1pmJ48 = cachedMap.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        String str = this.appTag;
                        Iterator it = ((Map) objM31149getResultd1pmJ48).values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((List) it.next()).size();
                        }
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(str, queryKind, key, source, size));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (Map) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ Map innerGetBatchUsingStringsMethods$default(RecyclableBridge recyclableBridge, String str, BatchFindMethodUsingStrings batchFindMethodUsingStrings, int i, Object obj) {
            if ((i & 2) != 0) {
                batchFindMethodUsingStrings = null;
            }
            return recyclableBridge.innerGetBatchUsingStringsMethods(str, batchFindMethodUsingStrings);
        }

        private final DexClass innerGetClass(String key, boolean allowNull, FindClass query) {
            QueryKind queryKind = QueryKind.CLASS_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = allowNull ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 dexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 = query != null ? new DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1(query) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetClass$2 dexKitCacheBridge$RecyclableBridge$innerGetClass$2 = DexKitCacheBridge$RecyclableBridge$innerGetClass$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetClass$3 dexKitCacheBridge$RecyclableBridge$innerGetClass$3 = DexKitCacheBridge$RecyclableBridge$innerGetClass$3.INSTANCE;
            FindClass findClassInvoke = dexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 != null ? dexKitCacheBridge$RecyclableBridge$innerGetClass$1$1.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", key, findClassInvoke);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = findClassInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetClass$2, findClassInvoke, dexKitCacheBridge$RecyclableBridge$innerGetClass$3) : null;
            boolean z = key == null && findClassInvoke != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? 0 : 1));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (DexClass) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ DexClass innerGetClass$default(RecyclableBridge recyclableBridge, String str, boolean z, FindClass findClass, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findClass = null;
            }
            return recyclableBridge.innerGetClass(str, z, findClass);
        }

        private final DexClass innerGetClassDirect(String key, boolean allowNull, InterfaceC5124<? super DexKitBridge, ClassData> query) {
            int i;
            QueryKind queryKind = QueryKind.CLASS_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = allowNull ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1 dexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1 = DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1.INSTANCE;
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", key, null, 8, null);
            C2921x95b222e4 c2921x95b222e4 = query != null ? new C2921x95b222e4(this, query, dexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            int i2 = 0;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c2921x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        i = i2;
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? i2 : 1));
                            C7148.m3438(C8107.f3222);
                        } catch (Throwable th) {
                            th = th;
                            C7148.C1189 c11892 = C7148.f21560;
                            C7148.m3438(C7149.m3441(th));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                    }
                    i2 = i;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th3) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th3));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (DexClass) objM31149getResultd1pmJ48;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DexClass innerGetClassDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC5124 = null;
            }
            return recyclableBridge.innerGetClassDirect(str, z, interfaceC5124);
        }

        private final List<DexClass> innerGetClasses(String key, boolean allowEmpty, FindClass query) {
            QueryKind queryKind = QueryKind.CLASS_LIST;
            DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 dexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 = query != null ? new DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1(query) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetClasses$2 dexKitCacheBridge$RecyclableBridge$innerGetClasses$2 = DexKitCacheBridge$RecyclableBridge$innerGetClasses$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetClasses$3 dexKitCacheBridge$RecyclableBridge$innerGetClasses$3 = DexKitCacheBridge$RecyclableBridge$innerGetClasses$3.INSTANCE;
            FindClass findClassInvoke = dexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 != null ? dexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1.invoke() : null;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", key, findClassInvoke), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), findClassInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetClasses$2, findClassInvoke, dexKitCacheBridge$RecyclableBridge$innerGetClasses$3) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (List) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ List innerGetClasses$default(RecyclableBridge recyclableBridge, String str, boolean z, FindClass findClass, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findClass = null;
            }
            return recyclableBridge.innerGetClasses(str, z, findClass);
        }

        private final List<DexClass> innerGetClassesDirect(String key, boolean allowEmpty, InterfaceC5124<? super DexKitBridge, ? extends List<ClassData>> query) {
            QueryKind queryKind = QueryKind.CLASS_LIST;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", key, null, 8, null), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), query != null ? new C2920x87bd6f8e(this, query, DexKitCacheBridge$RecyclableBridge$innerGetClassesDirect$1.INSTANCE) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (List) objM31149getResultd1pmJ48;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List innerGetClassesDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC5124 = null;
            }
            return recyclableBridge.innerGetClassesDirect(str, z, interfaceC5124);
        }

        private final DexField innerGetField(String key, boolean allowNull, FindField query) {
            QueryKind queryKind = QueryKind.FIELD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = allowNull ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetField$1$1 dexKitCacheBridge$RecyclableBridge$innerGetField$1$1 = query != null ? new DexKitCacheBridge$RecyclableBridge$innerGetField$1$1(query) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetField$2 dexKitCacheBridge$RecyclableBridge$innerGetField$2 = DexKitCacheBridge$RecyclableBridge$innerGetField$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetField$3 dexKitCacheBridge$RecyclableBridge$innerGetField$3 = DexKitCacheBridge$RecyclableBridge$innerGetField$3.INSTANCE;
            FindField findFieldInvoke = dexKitCacheBridge$RecyclableBridge$innerGetField$1$1 != null ? dexKitCacheBridge$RecyclableBridge$innerGetField$1$1.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", key, findFieldInvoke);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = findFieldInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetField$2, findFieldInvoke, dexKitCacheBridge$RecyclableBridge$innerGetField$3) : null;
            boolean z = key == null && findFieldInvoke != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? 0 : 1));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (DexField) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ DexField innerGetField$default(RecyclableBridge recyclableBridge, String str, boolean z, FindField findField, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findField = null;
            }
            return recyclableBridge.innerGetField(str, z, findField);
        }

        private final DexField innerGetFieldDirect(String key, boolean allowNull, InterfaceC5124<? super DexKitBridge, FieldData> query) {
            int i;
            QueryKind queryKind = QueryKind.FIELD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = allowNull ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 dexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 = DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1.INSTANCE;
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", key, null, 8, null);
            C2921x95b222e4 c2921x95b222e4 = query != null ? new C2921x95b222e4(this, query, dexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            int i2 = 0;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c2921x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        i = i2;
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? i2 : 1));
                            C7148.m3438(C8107.f3222);
                        } catch (Throwable th) {
                            th = th;
                            C7148.C1189 c11892 = C7148.f21560;
                            C7148.m3438(C7149.m3441(th));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                    }
                    i2 = i;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th3) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th3));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (DexField) objM31149getResultd1pmJ48;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DexField innerGetFieldDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC5124 = null;
            }
            return recyclableBridge.innerGetFieldDirect(str, z, interfaceC5124);
        }

        private final List<DexField> innerGetFields(String key, boolean allowEmpty, FindField query) {
            QueryKind queryKind = QueryKind.FIELD_LIST;
            DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1 dexKitCacheBridge$RecyclableBridge$innerGetFields$1$1 = query != null ? new DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1(query) : null;
            DexKitCacheBridge$RecyclableBridge$innerGetFields$2 dexKitCacheBridge$RecyclableBridge$innerGetFields$2 = DexKitCacheBridge$RecyclableBridge$innerGetFields$2.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetFields$3 dexKitCacheBridge$RecyclableBridge$innerGetFields$3 = DexKitCacheBridge$RecyclableBridge$innerGetFields$3.INSTANCE;
            FindField findFieldInvoke = dexKitCacheBridge$RecyclableBridge$innerGetFields$1$1 != null ? dexKitCacheBridge$RecyclableBridge$innerGetFields$1$1.invoke() : null;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", key, findFieldInvoke), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), findFieldInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetFields$2, findFieldInvoke, dexKitCacheBridge$RecyclableBridge$innerGetFields$3) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (List) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ List innerGetFields$default(RecyclableBridge recyclableBridge, String str, boolean z, FindField findField, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findField = null;
            }
            return recyclableBridge.innerGetFields(str, z, findField);
        }

        private final List<DexField> innerGetFieldsDirect(String key, boolean allowEmpty, InterfaceC5124<? super DexKitBridge, ? extends List<FieldData>> query) {
            QueryKind queryKind = QueryKind.FIELD_LIST;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", key, null, 8, null), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), query != null ? new C2920x87bd6f8e(this, query, DexKitCacheBridge$RecyclableBridge$innerGetFieldsDirect$1.INSTANCE) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (List) objM31149getResultd1pmJ48;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List innerGetFieldsDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC5124 = null;
            }
            return recyclableBridge.innerGetFieldsDirect(str, z, interfaceC5124);
        }

        private final DexMethod innerGetMethod(String key, boolean allowNull, FindMethod query) {
            DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1 dexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1 = query != null ? new DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1(query) : null;
            QueryKind queryKind = QueryKind.METHOD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = allowNull ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 dexKitCacheBridge$RecyclableBridge$innerGetMethod$1 = DexKitCacheBridge$RecyclableBridge$innerGetMethod$1.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetMethod$2 dexKitCacheBridge$RecyclableBridge$innerGetMethod$2 = DexKitCacheBridge$RecyclableBridge$innerGetMethod$2.INSTANCE;
            FindMethod findMethodInvoke = dexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1 != null ? dexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1.invoke() : null;
            String strCacheKeyOf = CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "s", key, findMethodInvoke);
            DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 = findMethodInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetMethod$1, findMethodInvoke, dexKitCacheBridge$RecyclableBridge$innerGetMethod$2) : null;
            boolean z = key == null && findMethodInvoke != null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), z), new DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(this), dexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? 0 : 1));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (DexMethod) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ DexMethod innerGetMethod$default(RecyclableBridge recyclableBridge, String str, boolean z, FindMethod findMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findMethod = null;
            }
            return recyclableBridge.innerGetMethod(str, z, findMethod);
        }

        private final DexMethod innerGetMethodDirect(String key, boolean allowNull, InterfaceC5124<? super DexKitBridge, MethodData> query) {
            int i;
            QueryKind queryKind = QueryKind.METHOD_SINGLE;
            CacheBridgeStore.SingleResolveMode singleResolveMode = allowNull ? CacheBridgeStore.SingleResolveMode.NULLABLE : CacheBridgeStore.SingleResolveMode.REQUIRED;
            DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1 dexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1 = DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1.INSTANCE;
            String strCacheKeyOf$default = CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "s", key, null, 8, null);
            C2921x95b222e4 c2921x95b222e4 = query != null ? new C2921x95b222e4(this, query, dexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1) : null;
            CacheBridgeStore cacheBridgeStore = CacheBridgeStore.INSTANCE;
            int i2 = 0;
            CacheBridgeStore.LoadResult cachedSingle = cacheBridgeStore.getCachedSingle(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), strCacheKeyOf$default, singleResolveMode, cacheBridgeStore.shouldCacheFailure(DexKitCacheBridge.getCachePolicy(), false), new DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1(this), c2921x95b222e4);
            ResultSource source = cachedSingle.getSource();
            Object objM31149getResultd1pmJ48 = cachedSingle.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        i = i2;
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((ISerializable) objM31149getResultd1pmJ48) == null ? i2 : 1));
                            C7148.m3438(C8107.f3222);
                        } catch (Throwable th) {
                            th = th;
                            C7148.C1189 c11892 = C7148.f21560;
                            C7148.m3438(C7149.m3441(th));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                    }
                    i2 = i;
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th3) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th3));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (DexMethod) objM31149getResultd1pmJ48;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DexMethod innerGetMethodDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC5124 = null;
            }
            return recyclableBridge.innerGetMethodDirect(str, z, interfaceC5124);
        }

        private final List<DexMethod> innerGetMethods(String key, boolean allowEmpty, FindMethod query) {
            C2928x24931bbd c2928x24931bbd = query != null ? new C2928x24931bbd(query) : null;
            QueryKind queryKind = QueryKind.METHOD_LIST;
            DexKitCacheBridge$RecyclableBridge$innerGetMethods$1 dexKitCacheBridge$RecyclableBridge$innerGetMethods$1 = DexKitCacheBridge$RecyclableBridge$innerGetMethods$1.INSTANCE;
            DexKitCacheBridge$RecyclableBridge$innerGetMethods$2 dexKitCacheBridge$RecyclableBridge$innerGetMethods$2 = DexKitCacheBridge$RecyclableBridge$innerGetMethods$2.INSTANCE;
            FindMethod findMethodInvoke = c2928x24931bbd != null ? c2928x24931bbd.invoke() : null;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.INSTANCE.cacheKeyOf(this.appTag, "l", key, findMethodInvoke), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getInternalList$1(this), findMethodInvoke != null ? new DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1(this, dexKitCacheBridge$RecyclableBridge$innerGetMethods$1, findMethodInvoke, dexKitCacheBridge$RecyclableBridge$innerGetMethods$2) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (List) objM31149getResultd1pmJ48;
        }

        public static /* synthetic */ List innerGetMethods$default(RecyclableBridge recyclableBridge, String str, boolean z, FindMethod findMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                findMethod = null;
            }
            return recyclableBridge.innerGetMethods(str, z, findMethod);
        }

        private final List<DexMethod> innerGetMethodsDirect(String key, boolean allowEmpty, InterfaceC5124<? super DexKitBridge, ? extends List<MethodData>> query) {
            QueryKind queryKind = QueryKind.METHOD_LIST;
            CacheBridgeStore.LoadResult cachedList = CacheBridgeStore.INSTANCE.getCachedList(DexKitCacheBridge.INSTANCE.getCache(), DexKitCacheBridge.cacheLock, DexKitCacheBridge.getCachePolicy(), CacheBridgeKeys.cacheKeyOf$default(CacheBridgeKeys.INSTANCE, this.appTag, "l", key, null, 8, null), allowEmpty, new DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1(this), query != null ? new C2920x87bd6f8e(this, query, DexKitCacheBridge$RecyclableBridge$innerGetMethodsDirect$1.INSTANCE) : null);
            ResultSource source = cachedList.getSource();
            Object objM31149getResultd1pmJ48 = cachedList.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(objM31149getResultd1pmJ48);
            if (thM22403 == null) {
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, ((List) objM31149getResultd1pmJ48).size()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            C7149.m22422(objM31149getResultd1pmJ48);
            return (List) objM31149getResultd1pmJ48;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List innerGetMethodsDirect$default(RecyclableBridge recyclableBridge, String str, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC5124 = null;
            }
            return recyclableBridge.innerGetMethodsDirect(str, z, interfaceC5124);
        }

        /* JADX INFO: renamed from: notifyQueryResult-nnTlf9I, reason: not valid java name */
        private final <T> Object m31145notifyQueryResultnnTlf9I(QueryKind queryKind, String key, ResultSource source, Object result, InterfaceC5124<? super T, Integer> countOf) {
            Throwable thM22403 = C7148.m22403(result);
            if (thM22403 == null) {
                DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        try {
                            cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, countOf.invoke(result).intValue()));
                            C7148.m3438(C8107.f3222);
                        } catch (Throwable th) {
                            th = th;
                            C7148.C1189 c11892 = C7148.f21560;
                            C7148.m3438(C7149.m3441(th));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } else {
                DexKitCacheBridge dexKitCacheBridge3 = DexKitCacheBridge.INSTANCE;
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge4 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th3) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th3));
                    }
                }
            }
            return result;
        }

        /* JADX INFO: renamed from: observeLoad-BWLJW6A, reason: not valid java name */
        private final <T> Object m31146observeLoadBWLJW6A(QueryKind queryKind, String key, CacheBridgeStore.LoadResult<T> loadResult, InterfaceC5124<? super T, Integer> countOf) {
            ResultSource source = loadResult.getSource();
            C2954.C0002 c0002 = (Object) loadResult.m31149getResultd1pmJ48();
            Throwable thM22403 = C7148.m22403(c0002);
            if (thM22403 == null) {
                DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
                for (CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c1189 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener, "listener");
                        cacheBridgeListener.onQuerySuccess(new QuerySuccessEvent(this.appTag, queryKind, key, source, countOf.invoke(c0002).intValue()));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th) {
                        C7148.C1189 c11892 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th));
                    }
                }
            } else {
                DexKitCacheBridge dexKitCacheBridge3 = DexKitCacheBridge.INSTANCE;
                for (CacheBridgeListener cacheBridgeListener2 : DexKitCacheBridge.listeners) {
                    DexKitCacheBridge dexKitCacheBridge4 = DexKitCacheBridge.INSTANCE;
                    try {
                        C7148.C1189 c11893 = C7148.f21560;
                        C5499.m17102(cacheBridgeListener2, "listener");
                        cacheBridgeListener2.onQueryFailure(new QueryFailureEvent(this.appTag, queryKind, key, source, thM22403));
                        C7148.m3438(C8107.f3222);
                    } catch (Throwable th2) {
                        C7148.C1189 c11894 = C7148.f21560;
                        C7148.m3438(C7149.m3441(th2));
                    }
                }
            }
            return c0002;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final InterfaceC5124<DexKitBridge, MethodData> toBridgeQuery(BridgeMethodBuilder bridgeMethodBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$1(bridgeMethodBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final FindMethod toQuery(FindMethodBuilder findMethodBuilder) {
            FindMethod findMethod = new FindMethod();
            findMethodBuilder.build(findMethod);
            return findMethod;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            getRuntime().close();
        }

        public final void destroy() {
            getRuntime().destroy();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getBatchUsingStringsClasses$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getBatchUsingStringsMethods$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexClass getClass(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getClass$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexClass getClassDirect(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getClassDirect$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexClass getClassDirectOrNull(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getClassDirectOrNull$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexClass getClassOrNull(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getClassOrNull$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexClass> getClasses(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getClasses$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexClass> getClassesDirect(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getClassesDirect$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexClass> getClassesDirectOrEmpty(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getClassesDirectOrEmpty$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final List<DexClass> getClassesOrEmpty(@InterfaceC6399 FindClassBuilder query) {
            C5499.m17103(query, "query");
            return innerGetClasses(null, true, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexField getField(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getField$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexField getFieldDirect(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getFieldDirect$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexField getFieldDirectOrNull(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getFieldDirectOrNull$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexField getFieldOrNull(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getFieldOrNull$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexField> getFields(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getFields$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexField> getFieldsDirect(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getFieldsDirect$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexField> getFieldsDirectOrEmpty(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getFieldsDirectOrEmpty$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final List<DexField> getFieldsOrEmpty(@InterfaceC6399 FindFieldBuilder query) {
            C5499.m17103(query, "query");
            return innerGetFields(null, true, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexMethod getMethod(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getMethod$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexMethod getMethodDirect(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getMethodDirect$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexMethod getMethodDirectOrNull(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getMethodDirectOrNull$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexMethod getMethodOrNull(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getMethodOrNull$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexMethod> getMethods(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getMethods$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexMethod> getMethodsDirect(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getMethodsDirect$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexMethod> getMethodsDirectOrEmpty(@InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            return getMethodsDirectOrEmpty$default(this, str, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final List<DexMethod> getMethodsOrEmpty(@InterfaceC6399 FindMethodBuilder query) {
            C5499.m17103(query, "query");
            return innerGetMethods(null, true, toQuery(query));
        }

        public final boolean isRetired() {
            return getRuntime().isDestroyed();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void withBridge(@InterfaceC6399 BridgeFunction action) {
            DexKitBridge dexKitBridge;
            boolean z;
            C5499.m17103(action, "action");
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
                action.apply(dexKitBridge);
                C8107 c8107 = C8107.f3222;
                runtime.endUse();
            } catch (Throwable th) {
                runtime.endUse();
                throw th;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private RecyclableBridge(String str, String str2, byte[][] bArr, ClassLoader classLoader) {
            this.appTag = str;
            this.path = str2;
            this.dexArray = bArr;
            this.classLoader = classLoader;
            this.runtime = C5689.m2371(EnumC5692.f14012, new DexKitCacheBridge$RecyclableBridge$runtime$2(this));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private final InterfaceC5124<DexKitBridge, ClassData> toBridgeQuery(BridgeClassBuilder bridgeClassBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2(bridgeClassBuilder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private final FindClass toQuery(FindClassBuilder findClassBuilder) {
            FindClass findClass = new FindClass();
            findClassBuilder.build(findClass);
            return findClass;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(@InterfaceC6399 BatchFindClassUsingStringsBuilder query) {
            C5499.m17103(query, "query");
            return innerGetBatchUsingStringsClasses(null, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(@InterfaceC6399 BatchFindMethodUsingStringsBuilder query) {
            C5499.m17103(query, "query");
            return innerGetBatchUsingStringsMethods(null, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final DexClass getClass(@InterfaceC6399 FindClassBuilder query) {
            C5499.m17103(query, "query");
            DexClass dexClassInnerGetClass = innerGetClass(null, false, toQuery(query));
            C5499.m17100(dexClassInnerGetClass);
            return dexClassInnerGetClass;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexClass getClassDirect(@InterfaceC6399 String key, @InterfaceC6489 BridgeClassBuilder query) {
            C5499.m17103(key, C6659.f17103);
            DexClass dexClassInnerGetClassDirect = innerGetClassDirect(key, false, query != null ? toBridgeQuery(query) : null);
            C5499.m17100(dexClassInnerGetClassDirect);
            return dexClassInnerGetClassDirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexClass getClassDirectOrNull(@InterfaceC6399 String key, @InterfaceC6489 BridgeClassBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetClassDirect(key, true, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6489
        public final DexClass getClassOrNull(@InterfaceC6399 FindClassBuilder query) {
            C5499.m17103(query, "query");
            return innerGetClass(null, true, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final List<DexClass> getClasses(@InterfaceC6399 FindClassBuilder query) {
            C5499.m17103(query, "query");
            return innerGetClasses(null, false, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexClass> getClassesDirect(@InterfaceC6399 String key, @InterfaceC6489 BridgeClassesBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetClassesDirect(key, false, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexClass> getClassesDirectOrEmpty(@InterfaceC6399 String key, @InterfaceC6489 BridgeClassesBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetClassesDirect(key, true, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final DexField getField(@InterfaceC6399 FindFieldBuilder query) {
            C5499.m17103(query, "query");
            DexField dexFieldInnerGetField = innerGetField(null, false, toQuery(query));
            C5499.m17100(dexFieldInnerGetField);
            return dexFieldInnerGetField;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexField getFieldDirect(@InterfaceC6399 String key, @InterfaceC6489 BridgeFieldBuilder query) {
            C5499.m17103(key, C6659.f17103);
            DexField dexFieldInnerGetFieldDirect = innerGetFieldDirect(key, false, query != null ? toBridgeQuery(query) : null);
            C5499.m17100(dexFieldInnerGetFieldDirect);
            return dexFieldInnerGetFieldDirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexField getFieldDirectOrNull(@InterfaceC6399 String key, @InterfaceC6489 BridgeFieldBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetFieldDirect(key, true, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6489
        public final DexField getFieldOrNull(@InterfaceC6399 FindFieldBuilder query) {
            C5499.m17103(query, "query");
            return innerGetField(null, true, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final List<DexField> getFields(@InterfaceC6399 FindFieldBuilder query) {
            C5499.m17103(query, "query");
            return innerGetFields(null, false, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexField> getFieldsDirect(@InterfaceC6399 String key, @InterfaceC6489 BridgeFieldsBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetFieldsDirect(key, false, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexField> getFieldsDirectOrEmpty(@InterfaceC6399 String key, @InterfaceC6489 BridgeFieldsBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetFieldsDirect(key, true, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final DexMethod getMethod(@InterfaceC6399 FindMethodBuilder query) {
            C5499.m17103(query, "query");
            DexMethod dexMethodInnerGetMethod = innerGetMethod(null, false, toQuery(query));
            C5499.m17100(dexMethodInnerGetMethod);
            return dexMethodInnerGetMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final DexMethod getMethodDirect(@InterfaceC6399 String key, @InterfaceC6489 BridgeMethodBuilder query) {
            C5499.m17103(key, C6659.f17103);
            DexMethod dexMethodInnerGetMethodDirect = innerGetMethodDirect(key, false, query != null ? toBridgeQuery(query) : null);
            C5499.m17100(dexMethodInnerGetMethodDirect);
            return dexMethodInnerGetMethodDirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC5573
        @InterfaceC6489
        public final DexMethod getMethodDirectOrNull(@InterfaceC6399 String key, @InterfaceC6489 BridgeMethodBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetMethodDirect(key, true, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6489
        public final DexMethod getMethodOrNull(@InterfaceC6399 FindMethodBuilder query) {
            C5499.m17103(query, "query");
            return innerGetMethod(null, true, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final List<DexMethod> getMethods(@InterfaceC6399 FindMethodBuilder query) {
            C5499.m17103(query, "query");
            return innerGetMethods(null, false, toQuery(query));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexMethod> getMethodsDirect(@InterfaceC6399 String key, @InterfaceC6489 BridgeMethodsBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetMethodsDirect(key, false, query != null ? toBridgeQuery(query) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final List<DexMethod> getMethodsDirectOrEmpty(@InterfaceC6399 String key, @InterfaceC6489 BridgeMethodsBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetMethodsDirect(key, true, query != null ? toBridgeQuery(query) : null);
        }

        private final InterfaceC5124<DexKitBridge, FieldData> toBridgeQuery(BridgeFieldBuilder bridgeFieldBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3(bridgeFieldBuilder);
        }

        private final FindField toQuery(FindFieldBuilder findFieldBuilder) {
            FindField findField = new FindField();
            findFieldBuilder.build(findField);
            return findField;
        }

        @InterfaceC6399
        public final List<DexClass> getClassesOrEmpty(@InterfaceC6399 String key, @InterfaceC6489 FindClassBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetClasses(key, true, query != null ? toQuery(query) : null);
        }

        @InterfaceC6399
        public final List<DexField> getFieldsOrEmpty(@InterfaceC6399 String key, @InterfaceC6489 FindFieldBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetFields(key, true, query != null ? toQuery(query) : null);
        }

        @InterfaceC6399
        public final List<DexMethod> getMethodsOrEmpty(@InterfaceC6399 String key, @InterfaceC6489 FindMethodBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetMethods(key, true, query != null ? toQuery(query) : null);
        }

        private final InterfaceC5124<DexKitBridge, List<MethodData>> toBridgeQuery(BridgeMethodsBuilder bridgeMethodsBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4(bridgeMethodsBuilder);
        }

        private final BatchFindMethodUsingStrings toQuery(BatchFindMethodUsingStringsBuilder batchFindMethodUsingStringsBuilder) {
            BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
            batchFindMethodUsingStringsBuilder.build(batchFindMethodUsingStrings);
            return batchFindMethodUsingStrings;
        }

        @InterfaceC6399
        @InterfaceC5573
        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(@InterfaceC6399 String key, @InterfaceC6489 BatchFindClassUsingStringsBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetBatchUsingStringsClasses(key, query != null ? toQuery(query) : null);
        }

        @InterfaceC6399
        @InterfaceC5573
        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(@InterfaceC6399 String key, @InterfaceC6489 BatchFindMethodUsingStringsBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetBatchUsingStringsMethods(key, query != null ? toQuery(query) : null);
        }

        @InterfaceC6399
        @InterfaceC5573
        public final DexClass getClass(@InterfaceC6399 String key, @InterfaceC6489 FindClassBuilder query) {
            C5499.m17103(key, C6659.f17103);
            DexClass dexClassInnerGetClass = innerGetClass(key, false, query != null ? toQuery(query) : null);
            C5499.m17100(dexClassInnerGetClass);
            return dexClassInnerGetClass;
        }

        public final /* synthetic */ DexClass getClassDirect(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            DexClass dexClassInnerGetClassDirect = innerGetClassDirect(key, false, query);
            C5499.m17100(dexClassInnerGetClassDirect);
            return dexClassInnerGetClassDirect;
        }

        public final /* synthetic */ DexClass getClassDirectOrNull(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetClassDirect(key, true, query);
        }

        @InterfaceC5573
        @InterfaceC6489
        public final DexClass getClassOrNull(@InterfaceC6399 String key, @InterfaceC6489 FindClassBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetClass(key, true, query != null ? toQuery(query) : null);
        }

        @InterfaceC6399
        @InterfaceC5573
        public final List<DexClass> getClasses(@InterfaceC6399 String key, @InterfaceC6489 FindClassBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetClasses(key, false, query != null ? toQuery(query) : null);
        }

        public final /* synthetic */ List getClassesDirect(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetClassesDirect(key, false, query);
        }

        public final /* synthetic */ List getClassesDirectOrEmpty(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetClassesDirect(key, true, query);
        }

        @InterfaceC6399
        @InterfaceC5573
        public final DexField getField(@InterfaceC6399 String key, @InterfaceC6489 FindFieldBuilder query) {
            C5499.m17103(key, C6659.f17103);
            DexField dexFieldInnerGetField = innerGetField(key, false, query != null ? toQuery(query) : null);
            C5499.m17100(dexFieldInnerGetField);
            return dexFieldInnerGetField;
        }

        public final /* synthetic */ DexField getFieldDirect(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            DexField dexFieldInnerGetFieldDirect = innerGetFieldDirect(key, false, query);
            C5499.m17100(dexFieldInnerGetFieldDirect);
            return dexFieldInnerGetFieldDirect;
        }

        public final /* synthetic */ DexField getFieldDirectOrNull(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetFieldDirect(key, true, query);
        }

        @InterfaceC5573
        @InterfaceC6489
        public final DexField getFieldOrNull(@InterfaceC6399 String key, @InterfaceC6489 FindFieldBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetField(key, true, query != null ? toQuery(query) : null);
        }

        @InterfaceC6399
        @InterfaceC5573
        public final List<DexField> getFields(@InterfaceC6399 String key, @InterfaceC6489 FindFieldBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetFields(key, false, query != null ? toQuery(query) : null);
        }

        public final /* synthetic */ List getFieldsDirect(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetFieldsDirect(key, false, query);
        }

        public final /* synthetic */ List getFieldsDirectOrEmpty(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetFieldsDirect(key, true, query);
        }

        @InterfaceC6399
        @InterfaceC5573
        public final DexMethod getMethod(@InterfaceC6399 String key, @InterfaceC6489 FindMethodBuilder query) {
            C5499.m17103(key, C6659.f17103);
            DexMethod dexMethodInnerGetMethod = innerGetMethod(key, false, query != null ? toQuery(query) : null);
            C5499.m17100(dexMethodInnerGetMethod);
            return dexMethodInnerGetMethod;
        }

        public final /* synthetic */ DexMethod getMethodDirect(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            DexMethod dexMethodInnerGetMethodDirect = innerGetMethodDirect(key, false, query);
            C5499.m17100(dexMethodInnerGetMethodDirect);
            return dexMethodInnerGetMethodDirect;
        }

        public final /* synthetic */ DexMethod getMethodDirectOrNull(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetMethodDirect(key, true, query);
        }

        @InterfaceC5573
        @InterfaceC6489
        public final DexMethod getMethodOrNull(@InterfaceC6399 String key, @InterfaceC6489 FindMethodBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetMethod(key, true, query != null ? toQuery(query) : null);
        }

        @InterfaceC6399
        @InterfaceC5573
        public final List<DexMethod> getMethods(@InterfaceC6399 String key, @InterfaceC6489 FindMethodBuilder query) {
            C5499.m17103(key, C6659.f17103);
            return innerGetMethods(key, false, query != null ? toQuery(query) : null);
        }

        public final /* synthetic */ List getMethodsDirect(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetMethodsDirect(key, false, query);
        }

        public final /* synthetic */ List getMethodsDirectOrEmpty(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            return innerGetMethodsDirect(key, true, query);
        }

        private final InterfaceC5124<DexKitBridge, List<ClassData>> toBridgeQuery(BridgeClassesBuilder bridgeClassesBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$5(bridgeClassesBuilder);
        }

        private final BatchFindClassUsingStrings toQuery(BatchFindClassUsingStringsBuilder batchFindClassUsingStringsBuilder) {
            BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
            batchFindClassUsingStringsBuilder.build(batchFindClassUsingStrings);
            return batchFindClassUsingStrings;
        }

        @InterfaceC6399
        public final List<DexClass> getClassesOrEmpty(@InterfaceC6399 FindClass finder) {
            C5499.m17103(finder, "finder");
            return innerGetClasses(null, true, finder);
        }

        @InterfaceC6399
        public final List<DexField> getFieldsOrEmpty(@InterfaceC6399 FindField finder) {
            C5499.m17103(finder, "finder");
            return innerGetFields(null, true, finder);
        }

        @InterfaceC6399
        public final List<DexMethod> getMethodsOrEmpty(@InterfaceC6399 FindMethod finder) {
            C5499.m17103(finder, "finder");
            return innerGetMethods(null, true, finder);
        }

        private final InterfaceC5124<DexKitBridge, List<FieldData>> toBridgeQuery(BridgeFieldsBuilder bridgeFieldsBuilder) {
            return new DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6(bridgeFieldsBuilder);
        }

        @InterfaceC6399
        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(@InterfaceC6399 BatchFindClassUsingStrings finder) {
            C5499.m17103(finder, "finder");
            return innerGetBatchUsingStringsClasses(null, finder);
        }

        @InterfaceC6399
        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(@InterfaceC6399 BatchFindMethodUsingStrings finder) {
            C5499.m17103(finder, "finder");
            return innerGetBatchUsingStringsMethods(null, finder);
        }

        @InterfaceC6399
        public final DexClass getClass(@InterfaceC6399 FindClass finder) {
            C5499.m17103(finder, "finder");
            DexClass dexClassInnerGetClass = innerGetClass(null, false, finder);
            C5499.m17100(dexClassInnerGetClass);
            return dexClassInnerGetClass;
        }

        @InterfaceC6489
        public final DexClass getClassOrNull(@InterfaceC6399 FindClass finder) {
            C5499.m17103(finder, "finder");
            return innerGetClass(null, true, finder);
        }

        @InterfaceC6399
        public final List<DexClass> getClasses(@InterfaceC6399 FindClass finder) {
            C5499.m17103(finder, "finder");
            return innerGetClasses(null, false, finder);
        }

        @InterfaceC6399
        public final List<DexClass> getClassesOrEmpty(@InterfaceC6399 String key, @InterfaceC6399 FindClass finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetClasses(key, true, finder);
        }

        @InterfaceC6399
        public final DexField getField(@InterfaceC6399 FindField finder) {
            C5499.m17103(finder, "finder");
            DexField dexFieldInnerGetField = innerGetField(null, false, finder);
            C5499.m17100(dexFieldInnerGetField);
            return dexFieldInnerGetField;
        }

        @InterfaceC6489
        public final DexField getFieldOrNull(@InterfaceC6399 FindField finder) {
            C5499.m17103(finder, "finder");
            return innerGetField(null, true, finder);
        }

        @InterfaceC6399
        public final List<DexField> getFields(@InterfaceC6399 FindField finder) {
            C5499.m17103(finder, "finder");
            return innerGetFields(null, false, finder);
        }

        @InterfaceC6399
        public final List<DexField> getFieldsOrEmpty(@InterfaceC6399 String key, @InterfaceC6399 FindField finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetFields(key, true, finder);
        }

        @InterfaceC6399
        public final DexMethod getMethod(@InterfaceC6399 FindMethod finder) {
            C5499.m17103(finder, "finder");
            DexMethod dexMethodInnerGetMethod = innerGetMethod(null, false, finder);
            C5499.m17100(dexMethodInnerGetMethod);
            return dexMethodInnerGetMethod;
        }

        @InterfaceC6489
        public final DexMethod getMethodOrNull(@InterfaceC6399 FindMethod finder) {
            C5499.m17103(finder, "finder");
            return innerGetMethod(null, true, finder);
        }

        @InterfaceC6399
        public final List<DexMethod> getMethods(@InterfaceC6399 FindMethod finder) {
            C5499.m17103(finder, "finder");
            return innerGetMethods(null, false, finder);
        }

        @InterfaceC6399
        public final List<DexMethod> getMethodsOrEmpty(@InterfaceC6399 String key, @InterfaceC6399 FindMethod finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetMethods(key, true, finder);
        }

        @InterfaceC6399
        public final Map<String, List<DexClass>> getBatchUsingStringsClasses(@InterfaceC6399 String key, @InterfaceC6399 BatchFindClassUsingStrings finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetBatchUsingStringsClasses(key, finder);
        }

        @InterfaceC6399
        public final Map<String, List<DexMethod>> getBatchUsingStringsMethods(@InterfaceC6399 String key, @InterfaceC6399 BatchFindMethodUsingStrings finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetBatchUsingStringsMethods(key, finder);
        }

        @InterfaceC6399
        public final DexClass getClass(@InterfaceC6399 String key, @InterfaceC6399 FindClass finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            DexClass dexClassInnerGetClass = innerGetClass(key, false, finder);
            C5499.m17100(dexClassInnerGetClass);
            return dexClassInnerGetClass;
        }

        @InterfaceC6489
        public final DexClass getClassOrNull(@InterfaceC6399 String key, @InterfaceC6399 FindClass finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetClass(key, true, finder);
        }

        @InterfaceC6399
        public final List<DexClass> getClasses(@InterfaceC6399 String key, @InterfaceC6399 FindClass finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetClasses(key, false, finder);
        }

        public final /* synthetic */ List getClassesOrEmpty(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            return innerGetClasses(null, true, findClass);
        }

        @InterfaceC6399
        public final DexField getField(@InterfaceC6399 String key, @InterfaceC6399 FindField finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            DexField dexFieldInnerGetField = innerGetField(key, false, finder);
            C5499.m17100(dexFieldInnerGetField);
            return dexFieldInnerGetField;
        }

        @InterfaceC6489
        public final DexField getFieldOrNull(@InterfaceC6399 String key, @InterfaceC6399 FindField finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetField(key, true, finder);
        }

        @InterfaceC6399
        public final List<DexField> getFields(@InterfaceC6399 String key, @InterfaceC6399 FindField finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetFields(key, false, finder);
        }

        public final /* synthetic */ List getFieldsOrEmpty(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            return innerGetFields(null, true, findField);
        }

        @InterfaceC6399
        public final DexMethod getMethod(@InterfaceC6399 String key, @InterfaceC6399 FindMethod finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            DexMethod dexMethodInnerGetMethod = innerGetMethod(key, false, finder);
            C5499.m17100(dexMethodInnerGetMethod);
            return dexMethodInnerGetMethod;
        }

        @InterfaceC6489
        public final DexMethod getMethodOrNull(@InterfaceC6399 String key, @InterfaceC6399 FindMethod finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetMethod(key, true, finder);
        }

        @InterfaceC6399
        public final List<DexMethod> getMethods(@InterfaceC6399 String key, @InterfaceC6399 FindMethod finder) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(finder, "finder");
            return innerGetMethods(key, false, finder);
        }

        public final /* synthetic */ List getMethodsOrEmpty(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            return innerGetMethods(null, true, findMethod);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:byte[][]:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null byte[][]) : (r4v0 byte[][]))
  (wrap:java.lang.ClassLoader:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.ClassLoader) : (r5v0 java.lang.ClassLoader))
 A[MD:(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void (m)] (LINE:8) call: org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.<init>(java.lang.String, java.lang.String, byte[][], java.lang.ClassLoader):void type: THIS */
        public /* synthetic */ RecyclableBridge(String str, String str2, byte[][] bArr, ClassLoader classLoader, int i, C4335 c4335) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? null : classLoader);
        }

        public final /* synthetic */ Map getBatchUsingStringsClasses(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
            query.invoke(batchFindClassUsingStrings);
            return innerGetBatchUsingStringsClasses(null, batchFindClassUsingStrings);
        }

        public final /* synthetic */ Map getBatchUsingStringsMethods(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
            query.invoke(batchFindMethodUsingStrings);
            return innerGetBatchUsingStringsMethods(null, batchFindMethodUsingStrings);
        }

        public final /* synthetic */ DexClass getClass(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            DexClass dexClassInnerGetClass = innerGetClass(null, false, findClass);
            C5499.m17100(dexClassInnerGetClass);
            return dexClassInnerGetClass;
        }

        public final /* synthetic */ DexClass getClassOrNull(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            return innerGetClass(null, true, findClass);
        }

        public final /* synthetic */ List getClasses(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            return innerGetClasses(null, false, findClass);
        }

        public final /* synthetic */ DexField getField(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            DexField dexFieldInnerGetField = innerGetField(null, false, findField);
            C5499.m17100(dexFieldInnerGetField);
            return dexFieldInnerGetField;
        }

        public final /* synthetic */ DexField getFieldOrNull(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            return innerGetField(null, true, findField);
        }

        public final /* synthetic */ List getFields(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            return innerGetFields(null, false, findField);
        }

        public final /* synthetic */ DexMethod getMethod(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            DexMethod dexMethodInnerGetMethod = innerGetMethod(null, false, findMethod);
            C5499.m17100(dexMethodInnerGetMethod);
            return dexMethodInnerGetMethod;
        }

        public final /* synthetic */ DexMethod getMethodOrNull(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            return innerGetMethod(null, true, findMethod);
        }

        public final /* synthetic */ List getMethods(InterfaceC5124 query) {
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            return innerGetMethods(null, false, findMethod);
        }

        public final /* synthetic */ List getClassesOrEmpty(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            return innerGetClasses(key, true, findClass);
        }

        public final /* synthetic */ List getFieldsOrEmpty(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            return innerGetFields(key, true, findField);
        }

        public final /* synthetic */ List getMethodsOrEmpty(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            return innerGetMethods(key, true, findMethod);
        }

        public final /* synthetic */ Map getBatchUsingStringsClasses(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
            query.invoke(batchFindClassUsingStrings);
            return innerGetBatchUsingStringsClasses(key, batchFindClassUsingStrings);
        }

        public final /* synthetic */ Map getBatchUsingStringsMethods(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
            query.invoke(batchFindMethodUsingStrings);
            return innerGetBatchUsingStringsMethods(key, batchFindMethodUsingStrings);
        }

        public final /* synthetic */ DexClass getClass(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            DexClass dexClassInnerGetClass = innerGetClass(key, false, findClass);
            C5499.m17100(dexClassInnerGetClass);
            return dexClassInnerGetClass;
        }

        public final /* synthetic */ DexClass getClassOrNull(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            return innerGetClass(key, true, findClass);
        }

        public final /* synthetic */ List getClasses(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindClass findClass = new FindClass();
            query.invoke(findClass);
            return innerGetClasses(key, false, findClass);
        }

        public final /* synthetic */ DexField getField(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            DexField dexFieldInnerGetField = innerGetField(key, false, findField);
            C5499.m17100(dexFieldInnerGetField);
            return dexFieldInnerGetField;
        }

        public final /* synthetic */ DexField getFieldOrNull(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            return innerGetField(key, true, findField);
        }

        public final /* synthetic */ List getFields(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindField findField = new FindField();
            query.invoke(findField);
            return innerGetFields(key, false, findField);
        }

        public final /* synthetic */ DexMethod getMethod(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            DexMethod dexMethodInnerGetMethod = innerGetMethod(key, false, findMethod);
            C5499.m17100(dexMethodInnerGetMethod);
            return dexMethodInnerGetMethod;
        }

        public final /* synthetic */ DexMethod getMethodOrNull(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            return innerGetMethod(key, true, findMethod);
        }

        public final /* synthetic */ List getMethods(String key, InterfaceC5124 query) {
            C5499.m17103(key, C6659.f17103);
            C5499.m17103(query, "query");
            FindMethod findMethod = new FindMethod();
            query.invoke(findMethod);
            return innerGetMethods(key, false, findMethod);
        }

        public final /* synthetic */ void withBridge(InterfaceC5124 action) {
            DexKitBridge dexKitBridge;
            boolean z;
            C5499.m17103(action, "action");
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
                action.invoke(dexKitBridge);
                C8107 c8107 = C8107.f3222;
                runtime.endUse();
            } catch (Throwable th) {
                runtime.endUse();
                throw th;
            }
        }
    }

    @InterfaceC6211(m2698d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "", "(Ljava/lang/String;I)V", "CACHE", "QUERY", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public enum ResultSource {
        CACHE,
        QUERY
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29341 extends AbstractC5673 implements InterfaceC5122<RecyclableBridge> {
        final /* synthetic */ String $appTag;
        final /* synthetic */ String $path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29341(String str, String str2) {
            super(0);
            this.$appTag = str;
            this.$path = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final RecyclableBridge invoke() {
            return RecyclableBridge.INSTANCE.create$dexkit_android_release(this.$appTag, this.$path);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$2 */
    @InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29352 extends AbstractC5673 implements InterfaceC5122<RecyclableBridge> {
        final /* synthetic */ String $appTag;
        final /* synthetic */ byte[][] $dexArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29352(String str, byte[][] bArr) {
            super(0);
            this.$appTag = str;
            this.$dexArray = bArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final RecyclableBridge invoke() {
            return RecyclableBridge.INSTANCE.create$dexkit_android_release(this.$appTag, this.$dexArray);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$3 */
    @InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29363 extends AbstractC5673 implements InterfaceC5122<RecyclableBridge> {
        final /* synthetic */ String $appTag;
        final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29363(String str, ClassLoader classLoader) {
            super(0);
            this.$appTag = str;
            this.$classLoader = classLoader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final RecyclableBridge invoke() {
            return RecyclableBridge.INSTANCE.create$dexkit_android_release(this.$appTag, this.$classLoader);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: Yue.ۥ۠۟۟۟
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return DexKitCacheBridge.reaperScheduler$lambda$1(runnable);
            }
        });
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        reaperScheduler = scheduledThreadPoolExecutor;
        cacheLock = new ReentrantReadWriteLock();
        listeners = new CopyOnWriteArraySet<>();
        idleTimeoutMillis = 5000L;
        cachePolicy = new CachePolicy(false, null, 3, 0 == true ? 1 : 0);
    }

    private DexKitCacheBridge() {
    }

    @InterfaceC5578
    public static final void addListener(@InterfaceC6399 CacheBridgeListener listener) {
        C5499.m17103(listener, "listener");
        listeners.add(listener);
    }

    @InterfaceC5578
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
            C8107 c8107 = C8107.f3222;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @InterfaceC5578
    public static final void clearCache(@InterfaceC6399 String appTag) {
        C5499.m17103(appTag, "appTag");
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
            String str = CacheBridgeKeys.INSTANCE.cachePrefixOf(appTag) + ":";
            for (String str2 : INSTANCE.getCache().getAllKeys()) {
                if (C7627.m24008(str2, str, false, 2, null)) {
                    INSTANCE.getCache().remove(str2);
                }
            }
            C8107 c8107 = C8107.f3222;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @InterfaceC5578
    public static final void clearListeners() {
        listeners.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final RecyclableBridge create(@InterfaceC6399 String appTag, @InterfaceC6399 String path) {
        C5499.m17103(appTag, "appTag");
        C5499.m17103(path, "path");
        INSTANCE.getCache();
        return CacheBridgeRegistry.INSTANCE.obtainBridge(appTag, new C29341(appTag, path));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Cache getCache() {
        Cache cache = cacheRef.get();
        if (cache != null) {
            return cache;
        }
        throw new IllegalStateException("Wrapper must be init(cache) first".toString());
    }

    @InterfaceC6399
    public static final CachePolicy getCachePolicy() {
        return cachePolicy;
    }

    @InterfaceC5578
    public static /* synthetic */ void getCachePolicy$annotations() {
    }

    public static final long getIdleTimeoutMillis() {
        return idleTimeoutMillis;
    }

    @InterfaceC5578
    public static /* synthetic */ void getIdleTimeoutMillis$annotations() {
    }

    @InterfaceC5578
    public static final void init(@InterfaceC6399 Cache cache) {
        C5499.m17103(cache, "cache");
        if (!C5696.m2374(cacheRef, null, cache)) {
            throw new IllegalStateException("DexKitCacheBridge.init(cache) can only be called once".toString());
        }
    }

    private final void notifyListeners(InterfaceC5124<? super CacheBridgeListener, C8107> block) {
        for (CacheBridgeListener cacheBridgeListener : listeners) {
            try {
                C7148.C1189 c1189 = C7148.f21560;
                C5499.m17102(cacheBridgeListener, "listener");
                block.invoke(cacheBridgeListener);
                C7148.m3438(C8107.f3222);
            } catch (Throwable th) {
                C7148.C1189 c11892 = C7148.f21560;
                C7148.m3438(C7149.m3441(th));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread reaperScheduler$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "DexKit-Reaper");
        thread.setDaemon(true);
        return thread;
    }

    @InterfaceC5578
    public static final void removeListener(@InterfaceC6399 CacheBridgeListener listener) {
        C5499.m17103(listener, "listener");
        listeners.remove(listener);
    }

    public static final void setCachePolicy(@InterfaceC6399 CachePolicy cachePolicy2) {
        C5499.m17103(cachePolicy2, "<set-?>");
        cachePolicy = cachePolicy2;
    }

    public static final void setIdleTimeoutMillis(long j) {
        idleTimeoutMillis = j;
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final RecyclableBridge create(@InterfaceC6399 String appTag, @InterfaceC6399 byte[][] dexArray) {
        C5499.m17103(appTag, "appTag");
        C5499.m17103(dexArray, "dexArray");
        INSTANCE.getCache();
        return CacheBridgeRegistry.INSTANCE.obtainBridge(appTag, new C29352(appTag, dexArray));
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final RecyclableBridge create(@InterfaceC6399 String appTag, @InterfaceC6399 ClassLoader classLoader) {
        C5499.m17103(appTag, "appTag");
        C5499.m17103(classLoader, "classLoader");
        INSTANCE.getCache();
        return CacheBridgeRegistry.INSTANCE.obtainBridge(appTag, new C29363(appTag, classLoader));
    }
}
