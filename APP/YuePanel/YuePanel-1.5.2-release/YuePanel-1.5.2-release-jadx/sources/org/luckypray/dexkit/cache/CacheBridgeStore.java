package org.luckypray.dexkit.cache;

import Yue.C3880;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C4750;
import Yue.C5499;
import Yue.C6380;
import Yue.C7148;
import Yue.C7149;
import Yue.C8107;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.ISerializable;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCacheBridgeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheBridgeStore.kt\norg/luckypray/dexkit/cache/CacheBridgeStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,331:1\n1#2:332\n1547#3:333\n1618#3,3:334\n1849#3:337\n1547#3:338\n1618#3,3:339\n1850#3:342\n1849#3,2:343\n1547#3:345\n1618#3,3:346\n1849#3:349\n1547#3:350\n1618#3,3:351\n1850#3:354\n*S KotlinDebug\n*F\n+ 1 CacheBridgeStore.kt\norg/luckypray/dexkit/cache/CacheBridgeStore\n*L\n233#1:333\n233#1:334,3\n311#1:337\n315#1:338\n315#1:339,3\n311#1:342\n318#1:343,2\n185#1:345\n185#1:346,3\n260#1:349\n269#1:350\n269#1:351,3\n260#1:354\n*E\n"})
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003/01B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Ju\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\"\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0018\u00010\u001e¢\u0006\u0004\b#\u0010$Jq\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\"\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0018\u00010\u001e¢\u0006\u0004\b'\u0010(J\u0081\u0001\u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0)0\"\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\"\b\u0002\u0010!\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0)\u0018\u00010\u001e¢\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lorg/luckypray/dexkit/wrap/ISerializable;", C4750.f10502, "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "outcome", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;", "mode", "LYue/ۥۡۦۧۤ;", "resolveSingleOutcome-gIAlu-s", "(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;)Ljava/lang/Object;", "resolveSingleOutcome", "", "raw", "parseSingleOutcome", "(Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;", "cachePolicy", "", "stableQueryIdentity", "shouldCacheFailure", "(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z", "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;", "cache", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "cacheKey", "canCacheFailure", "Lkotlin/Function0;", "LYue/ۥۣۢ۠ۤ;", "ensureUsable", "loader", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "getCachedSingle", "(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "allowEmpty", "", "getCachedList", "(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "", "getCachedMap", "(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", CacheBridgeStore.CACHE_NO_RESULT, "Ljava/lang/String;", CacheBridgeStore.CACHE_NON_UNIQUE, "LoadResult", "SingleOutcome", "SingleResolveMode", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class CacheBridgeStore {

    @InterfaceC6399
    private static final String CACHE_NON_UNIQUE = "CACHE_NON_UNIQUE";

    @InterfaceC6399
    private static final String CACHE_NO_RESULT = "CACHE_NO_RESULT";

    @InterfaceC6399
    public static final CacheBridgeStore INSTANCE = new CacheBridgeStore();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", C4750.f10502, "", "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "source", "LYue/ۥۡۦۧۤ;", "result", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V", "component1", "()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "component2-d1pmJ48", "()Ljava/lang/Object;", "component2", "copy", "(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "getSource", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "getResult-d1pmJ48", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class LoadResult<T> {

        @InterfaceC6399
        private final Object result;

        @InterfaceC6399
        private final DexKitCacheBridge.ResultSource source;

        public LoadResult(@InterfaceC6399 DexKitCacheBridge.ResultSource resultSource, @InterfaceC6399 Object obj) {
            C5499.m17103(resultSource, "source");
            this.source = resultSource;
            this.result = obj;
        }

        public static /* synthetic */ LoadResult copy$default(LoadResult loadResult, DexKitCacheBridge.ResultSource resultSource, C7148 c7148, int i, Object obj) {
            if ((i & 1) != 0) {
                resultSource = loadResult.source;
            }
            if ((i & 2) != 0) {
                c7148 = C7148.m3437(loadResult.result);
            }
            return loadResult.copy(resultSource, c7148.m22410());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DexKitCacheBridge.ResultSource getSource() {
            return this.source;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: component2-d1pmJ48, reason: not valid java name and from getter */
        public final Object getResult() {
            return this.result;
        }

        @InterfaceC6399
        public final LoadResult<T> copy(@InterfaceC6399 DexKitCacheBridge.ResultSource source, @InterfaceC6399 Object result) {
            C5499.m17103(source, "source");
            return new LoadResult<>(source, result);
        }

        public boolean equals(@InterfaceC6489 Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadResult)) {
                return false;
            }
            LoadResult loadResult = (LoadResult) other;
            return this.source == loadResult.source && C7148.m22402(this.result, loadResult.result);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: getResult-d1pmJ48, reason: not valid java name */
        public final Object m31149getResultd1pmJ48() {
            return this.result;
        }

        @InterfaceC6399
        public final DexKitCacheBridge.ResultSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.source.hashCode() * 31) + C7148.m22406(this.result);
        }

        @InterfaceC6399
        public String toString() {
            return "LoadResult(source=" + this.source + ", result=" + C7148.m22409(this.result) + ")";
        }
    }

    @InterfaceC6211(m2698d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", C4750.f10502, "Lorg/luckypray/dexkit/wrap/ISerializable;", "", "NoResult", "NonUnique", "Value", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public interface SingleOutcome<T extends ISerializable> {

        @InterfaceC6211(m2698d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m2699d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "", "exception", "Lorg/luckypray/dexkit/exceptions/NoResultException;", "(Lorg/luckypray/dexkit/exceptions/NoResultException;)V", "getException", "()Lorg/luckypray/dexkit/exceptions/NoResultException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public static final class NoResult implements SingleOutcome {

            @InterfaceC6399
            private final NoResultException exception;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public NoResult() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ NoResult copy$default(NoResult noResult, NoResultException noResultException, int i, Object obj) {
                if ((i & 1) != 0) {
                    noResultException = noResult.exception;
                }
                return noResult.copy(noResultException);
            }

            @InterfaceC6399
            public final NoResultException component1() {
                return this.exception;
            }

            @InterfaceC6399
            public final NoResult copy(@InterfaceC6399 NoResultException noResultException) {
                C5499.m17103(noResultException, "exception");
                return new NoResult(noResultException);
            }

            public boolean equals(@InterfaceC6489 Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NoResult) && C5499.m17094(this.exception, ((NoResult) obj).exception);
            }

            @InterfaceC6399
            public final NoResultException getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            @InterfaceC6399
            public String toString() {
                return "NoResult(exception=" + this.exception + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public NoResult(@InterfaceC6399 NoResultException noResultException) {
                C5499.m17103(noResultException, "exception");
                this.exception = noResultException;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:org.luckypray.dexkit.exceptions.NoResultException:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.exceptions.NoResultException:0x0008: CONSTRUCTOR ("No result found for query") A[MD:(java.lang.String):void (m), WRAPPED] (LINE:4) call: org.luckypray.dexkit.exceptions.NoResultException.<init>(java.lang.String):void type: CONSTRUCTOR) : (r1v0 org.luckypray.dexkit.exceptions.NoResultException))
 A[MD:(org.luckypray.dexkit.exceptions.NoResultException):void (m)] (LINE:5) call: org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult.<init>(org.luckypray.dexkit.exceptions.NoResultException):void type: THIS */
            public /* synthetic */ NoResult(NoResultException noResultException, int i, C4335 c4335) {
                this((i & 1) != 0 ? new NoResultException("No result found for query") : noResultException);
            }
        }

        @InterfaceC6211(m2698d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m2699d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "", "exception", "Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;", "(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)V", "getException", "()Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public static final class NonUnique implements SingleOutcome {

            @InterfaceC6399
            private final NonUniqueResultException exception;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public NonUnique() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ NonUnique copy$default(NonUnique nonUnique, NonUniqueResultException nonUniqueResultException, int i, Object obj) {
                if ((i & 1) != 0) {
                    nonUniqueResultException = nonUnique.exception;
                }
                return nonUnique.copy(nonUniqueResultException);
            }

            @InterfaceC6399
            public final NonUniqueResultException component1() {
                return this.exception;
            }

            @InterfaceC6399
            public final NonUnique copy(@InterfaceC6399 NonUniqueResultException nonUniqueResultException) {
                C5499.m17103(nonUniqueResultException, "exception");
                return new NonUnique(nonUniqueResultException);
            }

            public boolean equals(@InterfaceC6489 Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NonUnique) && C5499.m17094(this.exception, ((NonUnique) obj).exception);
            }

            @InterfaceC6399
            public final NonUniqueResultException getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            @InterfaceC6399
            public String toString() {
                return "NonUnique(exception=" + this.exception + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public NonUnique(@InterfaceC6399 NonUniqueResultException nonUniqueResultException) {
                C5499.m17103(nonUniqueResultException, "exception");
                this.exception = nonUniqueResultException;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:org.luckypray.dexkit.exceptions.NonUniqueResultException:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.exceptions.NonUniqueResultException:0x0008: CONSTRUCTOR ("query did not return a unique result") A[MD:(java.lang.String):void (m), WRAPPED] (LINE:6) call: org.luckypray.dexkit.exceptions.NonUniqueResultException.<init>(java.lang.String):void type: CONSTRUCTOR) : (r1v0 org.luckypray.dexkit.exceptions.NonUniqueResultException))
 A[MD:(org.luckypray.dexkit.exceptions.NonUniqueResultException):void (m)] (LINE:7) call: org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique.<init>(org.luckypray.dexkit.exceptions.NonUniqueResultException):void type: THIS */
            public /* synthetic */ NonUnique(NonUniqueResultException nonUniqueResultException, int i, C4335 c4335) {
                this((i & 1) != 0 ? new NonUniqueResultException("query did not return a unique result") : nonUniqueResultException);
            }
        }

        @InterfaceC6211(m2698d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m2699d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;", C4750.f10502, "Lorg/luckypray/dexkit/wrap/ISerializable;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "value", "(Lorg/luckypray/dexkit/wrap/ISerializable;)V", "getValue", "()Lorg/luckypray/dexkit/wrap/ISerializable;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "component1", "copy", "(Lorg/luckypray/dexkit/wrap/ISerializable;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;", "equals", "", "other", "", "hashCode", "", "toString", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
        public static final class Value<T extends ISerializable> implements SingleOutcome<T> {

            @InterfaceC6399
            private final T value;

            public Value(@InterfaceC6399 T t) {
                C5499.m17103(t, "value");
                this.value = t;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Value copy$default(Value value, ISerializable iSerializable, int i, Object obj) {
                if ((i & 1) != 0) {
                    iSerializable = value.value;
                }
                return value.copy(iSerializable);
            }

            @InterfaceC6399
            public final T component1() {
                return this.value;
            }

            @InterfaceC6399
            public final Value<T> copy(@InterfaceC6399 T t) {
                C5499.m17103(t, "value");
                return new Value<>(t);
            }

            public boolean equals(@InterfaceC6489 Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Value) && C5499.m17094(this.value, ((Value) obj).value);
            }

            @InterfaceC6399
            public final T getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @InterfaceC6399
            public String toString() {
                return "Value(value=" + this.value + ")";
            }
        }
    }

    @InterfaceC6211(m2698d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;", "", "(Ljava/lang/String;I)V", "REQUIRED", "NULLABLE", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public enum SingleResolveMode {
        REQUIRED,
        NULLABLE
    }

    @InterfaceC6211(m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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

    private CacheBridgeStore() {
    }

    private static final <U extends ISerializable> C7148<List<U>> getCachedList$innerGet$10(DexKitCacheBridge.Cache cache, String str, boolean z) {
        List<String> stringList = cache.getStringList(str, null);
        if (stringList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C3881.m10756(stringList, 10));
        Iterator<T> it = stringList.iterator();
        while (it.hasNext()) {
            arrayList.add(ISerializable.Companion.deserializeAs((String) it.next()));
        }
        if (!arrayList.isEmpty() || z) {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3437(C7148.m3438(arrayList));
        }
        C7148.C1189 c11892 = C7148.f21560;
        return C7148.m3437(C7148.m3438(C7149.m3441(new IllegalStateException("cached empty for key: " + str + " but empty not allowed"))));
    }

    public static /* synthetic */ LoadResult getCachedMap$default(CacheBridgeStore cacheBridgeStore, DexKitCacheBridge.Cache cache, ReentrantReadWriteLock reentrantReadWriteLock, DexKitCacheBridge.CachePolicy cachePolicy, String str, InterfaceC5122 interfaceC5122, InterfaceC5122 interfaceC51222, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC51222 = null;
        }
        return cacheBridgeStore.getCachedMap(cache, reentrantReadWriteLock, cachePolicy, str, interfaceC5122, interfaceC51222);
    }

    private static final <U extends ISerializable> Map<String, List<U>> getCachedMap$innerGetMap(DexKitCacheBridge.Cache cache, String str) {
        List<String> stringList;
        Object objM3438;
        List<String> stringList2 = cache.getStringList(CacheBridgeKeys.INSTANCE.mapGroupsKey(str), null);
        if (stringList2 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(stringList2.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(stringList2.size());
        for (String str2 : stringList2) {
            if (!linkedHashSet.add(str2) || (stringList = cache.getStringList(CacheBridgeKeys.INSTANCE.mapGroupKey(str, str2), null)) == null) {
                return null;
            }
            try {
                C7148.C1189 c1189 = C7148.f21560;
                ArrayList arrayList = new ArrayList(C3881.m10756(stringList, 10));
                Iterator<T> it = stringList.iterator();
                while (it.hasNext()) {
                    arrayList.add(ISerializable.Companion.deserializeAs((String) it.next()));
                }
                objM3438 = C7148.m3438(arrayList);
            } catch (Throwable th) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th));
            }
            if (C7148.m22403(objM3438) != null) {
                return null;
            }
            linkedHashMap.put(str2, (List) objM3438);
        }
        return linkedHashMap;
    }

    private static final <U extends ISerializable> SingleOutcome<U> getCachedSingle$innerGet(DexKitCacheBridge.Cache cache, String str) {
        String string = cache.getString(str, null);
        if (string != null) {
            return INSTANCE.parseSingleOutcome(string);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ISerializable> SingleOutcome<T> parseSingleOutcome(String raw) {
        int i = 1;
        NoResultException noResultException = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (C5499.m17094(raw, CACHE_NO_RESULT)) {
            return new SingleOutcome.NoResult(noResultException, i, objArr3 == true ? 1 : 0);
        }
        if (C5499.m17094(raw, CACHE_NON_UNIQUE)) {
            return new SingleOutcome.NonUnique(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        ISerializable iSerializableDeserializeAs = ISerializable.Companion.deserializeAs(raw);
        C5499.m17101(iSerializableDeserializeAs, "null cannot be cast to non-null type T of org.luckypray.dexkit.cache.CacheBridgeStore.parseSingleOutcome");
        return new SingleOutcome.Value(iSerializableDeserializeAs);
    }

    /* JADX INFO: renamed from: resolveSingleOutcome-gIAlu-s, reason: not valid java name */
    private final <T extends ISerializable> Object m31147resolveSingleOutcomegIAlus(SingleOutcome<? extends T> outcome, SingleResolveMode mode) {
        if (outcome instanceof SingleOutcome.Value) {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3438(((SingleOutcome.Value) outcome).getValue());
        }
        if (outcome instanceof SingleOutcome.NoResult) {
            int i = WhenMappings.$EnumSwitchMapping$1[mode.ordinal()];
            if (i == 1) {
                C7148.C1189 c11892 = C7148.f21560;
                return C7148.m3438(null);
            }
            if (i != 2) {
                throw new C6380();
            }
            C7148.C1189 c11893 = C7148.f21560;
            return C7148.m3438(C7149.m3441(((SingleOutcome.NoResult) outcome).getException()));
        }
        if (!(outcome instanceof SingleOutcome.NonUnique)) {
            throw new C6380();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[mode.ordinal()];
        if (i2 == 1) {
            C7148.C1189 c11894 = C7148.f21560;
            return C7148.m3438(null);
        }
        if (i2 != 2) {
            throw new C6380();
        }
        C7148.C1189 c11895 = C7148.f21560;
        return C7148.m3438(C7149.m3441(((SingleOutcome.NonUnique) outcome).getException()));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
    @InterfaceC6399
    public final <T extends ISerializable> LoadResult<List<T>> getCachedList(@InterfaceC6399 DexKitCacheBridge.Cache cache, @InterfaceC6399 ReentrantReadWriteLock lock, @InterfaceC6399 DexKitCacheBridge.CachePolicy cachePolicy, @InterfaceC6399 String cacheKey, boolean allowEmpty, @InterfaceC6399 InterfaceC5122<C8107> ensureUsable, @InterfaceC6489 InterfaceC5122<? extends List<? extends T>> loader) {
        Object objM3438;
        Object objM34382;
        C5499.m17103(cache, "cache");
        C5499.m17103(lock, "lock");
        C5499.m17103(cachePolicy, "cachePolicy");
        C5499.m17103(cacheKey, "cacheKey");
        C5499.m17103(ensureUsable, "ensureUsable");
        ensureUsable.invoke();
        ReentrantReadWriteLock.ReadLock lock2 = lock.readLock();
        lock2.lock();
        try {
            C7148 cachedList$innerGet$10 = getCachedList$innerGet$10(cache, cacheKey, allowEmpty);
            if (cachedList$innerGet$10 != null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, cachedList$innerGet$10.m22410());
            }
            if (loader == null) {
                DexKitCacheBridge.ResultSource resultSource = DexKitCacheBridge.ResultSource.CACHE;
                C7148.C1189 c1189 = C7148.f21560;
                return new LoadResult<>(resultSource, C7148.m3438(C7149.m3441(new NoSuchElementException("no found cache for key: " + cacheKey))));
            }
            try {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(loader.invoke());
            } catch (Throwable th) {
                C7148.C1189 c11893 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th));
            }
            ReentrantReadWriteLock.ReadLock lock3 = lock.readLock();
            int i = 0;
            int readHoldCount = lock.getWriteHoldCount() == 0 ? lock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
            writeLock.lock();
            try {
                C7148 cachedList$innerGet$102 = getCachedList$innerGet$10(cache, cacheKey, allowEmpty);
                if (cachedList$innerGet$102 != null) {
                    return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, cachedList$innerGet$102.m22410());
                }
                DexKitCacheBridge.ResultSource resultSource2 = DexKitCacheBridge.ResultSource.QUERY;
                Throwable thM22403 = C7148.m22403(objM3438);
                if (thM22403 == null) {
                    List list = (List) objM3438;
                    if (!list.isEmpty() || allowEmpty) {
                        if (cachePolicy.getCacheSuccess()) {
                            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ISerializable) it.next()).serialize());
                            }
                            cache.putStringList(cacheKey, arrayList);
                        }
                        C7148.C1189 c11894 = C7148.f21560;
                        objM34382 = C7148.m3438(list);
                    } else {
                        C7148.C1189 c11895 = C7148.f21560;
                        objM34382 = C7148.m3438(C7149.m3441(new IllegalStateException("query returned empty for key: " + cacheKey + " but empty not allowed")));
                    }
                } else {
                    C7148.C1189 c11896 = C7148.f21560;
                    objM34382 = C7148.m3438(C7149.m3441(thM22403));
                }
                LoadResult<List<T>> loadResult = new LoadResult<>(resultSource2, objM34382);
                while (i < readHoldCount) {
                    lock3.lock();
                    i++;
                }
                writeLock.unlock();
                return loadResult;
            } finally {
                while (i < readHoldCount) {
                    lock3.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock2.unlock();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
    @InterfaceC6399
    public final <T extends ISerializable> LoadResult<Map<String, List<T>>> getCachedMap(@InterfaceC6399 DexKitCacheBridge.Cache cache, @InterfaceC6399 ReentrantReadWriteLock lock, @InterfaceC6399 DexKitCacheBridge.CachePolicy cachePolicy, @InterfaceC6399 String cacheKey, @InterfaceC6399 InterfaceC5122<C8107> ensureUsable, @InterfaceC6489 InterfaceC5122<? extends Map<String, ? extends List<? extends T>>> loader) {
        Object objM3438;
        Object objM34382;
        C5499.m17103(cache, "cache");
        C5499.m17103(lock, "lock");
        C5499.m17103(cachePolicy, "cachePolicy");
        C5499.m17103(cacheKey, "cacheKey");
        C5499.m17103(ensureUsable, "ensureUsable");
        ensureUsable.invoke();
        ReentrantReadWriteLock.ReadLock lock2 = lock.readLock();
        lock2.lock();
        try {
            Map cachedMap$innerGetMap = getCachedMap$innerGetMap(cache, cacheKey);
            if (cachedMap$innerGetMap != null) {
                DexKitCacheBridge.ResultSource resultSource = DexKitCacheBridge.ResultSource.CACHE;
                C7148.C1189 c1189 = C7148.f21560;
                return new LoadResult<>(resultSource, C7148.m3438(cachedMap$innerGetMap));
            }
            if (loader == null) {
                DexKitCacheBridge.ResultSource resultSource2 = DexKitCacheBridge.ResultSource.CACHE;
                C7148.C1189 c11892 = C7148.f21560;
                return new LoadResult<>(resultSource2, C7148.m3438(C7149.m3441(new NoSuchElementException("no found cache for key: " + cacheKey))));
            }
            try {
                C7148.C1189 c11893 = C7148.f21560;
                objM3438 = C7148.m3438(loader.invoke());
            } catch (Throwable th) {
                C7148.C1189 c11894 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th));
            }
            ReentrantReadWriteLock.ReadLock lock3 = lock.readLock();
            int i = 0;
            int readHoldCount = lock.getWriteHoldCount() == 0 ? lock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
            writeLock.lock();
            try {
                Map cachedMap$innerGetMap2 = getCachedMap$innerGetMap(cache, cacheKey);
                if (cachedMap$innerGetMap2 != null) {
                    DexKitCacheBridge.ResultSource resultSource3 = DexKitCacheBridge.ResultSource.CACHE;
                    C7148.C1189 c11895 = C7148.f21560;
                    return new LoadResult<>(resultSource3, C7148.m3438(cachedMap$innerGetMap2));
                }
                DexKitCacheBridge.ResultSource resultSource4 = DexKitCacheBridge.ResultSource.QUERY;
                Throwable thM22403 = C7148.m22403(objM3438);
                if (thM22403 == null) {
                    Map map = (Map) objM3438;
                    List<String> stringList = cache.getStringList(CacheBridgeKeys.INSTANCE.mapGroupsKey(cacheKey), null);
                    if (stringList == null) {
                        stringList = C3880.m10735();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (cachePolicy.getCacheSuccess()) {
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            List list = (List) entry.getValue();
                            arrayList.add(str);
                            String strMapGroupKey = CacheBridgeKeys.INSTANCE.mapGroupKey(cacheKey, str);
                            ArrayList arrayList2 = new ArrayList(C3881.m10756(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ISerializable) it.next()).serialize());
                            }
                            cache.putStringList(strMapGroupKey, arrayList2);
                        }
                        Iterator it2 = C3888.m10979(stringList, C3888.m11067(arrayList)).iterator();
                        while (it2.hasNext()) {
                            cache.remove(CacheBridgeKeys.INSTANCE.mapGroupKey(cacheKey, (String) it2.next()));
                        }
                        cache.putStringList(CacheBridgeKeys.INSTANCE.mapGroupsKey(cacheKey), arrayList);
                    }
                    C7148.C1189 c11896 = C7148.f21560;
                    objM34382 = C7148.m3438(map);
                } else {
                    C7148.C1189 c11897 = C7148.f21560;
                    objM34382 = C7148.m3438(C7149.m3441(thM22403));
                }
                LoadResult<Map<String, List<T>>> loadResult = new LoadResult<>(resultSource4, objM34382);
                while (i < readHoldCount) {
                    lock3.lock();
                    i++;
                }
                writeLock.unlock();
                return loadResult;
            } finally {
                while (i < readHoldCount) {
                    lock3.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock2.unlock();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
    @InterfaceC6399
    public final <T extends ISerializable> LoadResult<T> getCachedSingle(@InterfaceC6399 DexKitCacheBridge.Cache cache, @InterfaceC6399 ReentrantReadWriteLock lock, @InterfaceC6399 DexKitCacheBridge.CachePolicy cachePolicy, @InterfaceC6399 String cacheKey, @InterfaceC6399 SingleResolveMode mode, boolean canCacheFailure, @InterfaceC6399 InterfaceC5122<C8107> ensureUsable, @InterfaceC6489 InterfaceC5122<? extends SingleOutcome<? extends T>> loader) {
        Object objM3438;
        Object objM34382;
        C5499.m17103(cache, "cache");
        C5499.m17103(lock, "lock");
        C5499.m17103(cachePolicy, "cachePolicy");
        C5499.m17103(cacheKey, "cacheKey");
        C5499.m17103(mode, "mode");
        C5499.m17103(ensureUsable, "ensureUsable");
        ensureUsable.invoke();
        ReentrantReadWriteLock.ReadLock lock2 = lock.readLock();
        lock2.lock();
        try {
            SingleOutcome<? extends T> cachedSingle$innerGet = getCachedSingle$innerGet(cache, cacheKey);
            if (cachedSingle$innerGet != null) {
                return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, INSTANCE.m31147resolveSingleOutcomegIAlus(cachedSingle$innerGet, mode));
            }
            if (loader == null) {
                DexKitCacheBridge.ResultSource resultSource = DexKitCacheBridge.ResultSource.CACHE;
                C7148.C1189 c1189 = C7148.f21560;
                return new LoadResult<>(resultSource, C7148.m3438(C7149.m3441(new NoSuchElementException("no found cache for key: " + cacheKey))));
            }
            try {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(loader.invoke());
            } catch (Throwable th) {
                C7148.C1189 c11893 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th));
            }
            ReentrantReadWriteLock.ReadLock lock3 = lock.readLock();
            int i = 0;
            int readHoldCount = lock.getWriteHoldCount() == 0 ? lock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
            writeLock.lock();
            try {
                SingleOutcome<? extends T> cachedSingle$innerGet2 = getCachedSingle$innerGet(cache, cacheKey);
                if (cachedSingle$innerGet2 != null) {
                    return new LoadResult<>(DexKitCacheBridge.ResultSource.CACHE, INSTANCE.m31147resolveSingleOutcomegIAlus(cachedSingle$innerGet2, mode));
                }
                DexKitCacheBridge.ResultSource resultSource2 = DexKitCacheBridge.ResultSource.QUERY;
                Throwable thM22403 = C7148.m22403(objM3438);
                if (thM22403 == null) {
                    SingleOutcome<? extends T> singleOutcome = (SingleOutcome) objM3438;
                    if (singleOutcome instanceof SingleOutcome.Value) {
                        if (cachePolicy.getCacheSuccess()) {
                            cache.putString(cacheKey, ((SingleOutcome.Value) singleOutcome).getValue().serialize());
                        }
                    } else if (singleOutcome instanceof SingleOutcome.NoResult) {
                        if (canCacheFailure) {
                            cache.putString(cacheKey, CACHE_NO_RESULT);
                        }
                    } else if ((singleOutcome instanceof SingleOutcome.NonUnique) && canCacheFailure) {
                        cache.putString(cacheKey, CACHE_NON_UNIQUE);
                    }
                    objM34382 = INSTANCE.m31147resolveSingleOutcomegIAlus(singleOutcome, mode);
                } else {
                    C7148.C1189 c11894 = C7148.f21560;
                    objM34382 = C7148.m3438(C7149.m3441(thM22403));
                }
                LoadResult<T> loadResult = new LoadResult<>(resultSource2, objM34382);
                while (i < readHoldCount) {
                    lock3.lock();
                    i++;
                }
                writeLock.unlock();
                return loadResult;
            } finally {
                while (i < readHoldCount) {
                    lock3.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock2.unlock();
        }
    }

    public final boolean shouldCacheFailure(@InterfaceC6399 DexKitCacheBridge.CachePolicy cachePolicy, boolean stableQueryIdentity) {
        C5499.m17103(cachePolicy, "cachePolicy");
        int i = WhenMappings.$EnumSwitchMapping$0[cachePolicy.getFailurePolicy().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return stableQueryIdentity;
        }
        if (i == 3) {
            return true;
        }
        throw new C6380();
    }
}
