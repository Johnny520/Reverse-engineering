package org.luckypray.dexkit.cache;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCacheBridgeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheBridgeStore.kt\norg/luckypray/dexkit/cache/CacheBridgeStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,331:1\n1#2:332\n1547#3:333\n1618#3,3:334\n1849#3:337\n1547#3:338\n1618#3,3:339\n1850#3:342\n1849#3,2:343\n1547#3:345\n1618#3,3:346\n1849#3:349\n1547#3:350\n1618#3,3:351\n1850#3:354\n*S KotlinDebug\n*F\n+ 1 CacheBridgeStore.kt\norg/luckypray/dexkit/cache/CacheBridgeStore\n*L\n233#1:333\n233#1:334,3\n311#1:337\n315#1:338\n315#1:339,3\n311#1:342\n318#1:343,2\n185#1:345\n185#1:346,3\n260#1:349\n269#1:350\n269#1:351,3\n260#1:354\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003/01B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Ju\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\"\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0018\u00010\u001e¢\u0006\u0004\b#\u0010$Jq\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\"\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0018\u00010\u001e¢\u0006\u0004\b'\u0010(J\u0081\u0001\u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0)0\"\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\"\b\u0002\u0010!\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0)\u0018\u00010\u001e¢\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore;", "", "<init>", "()V", "Lorg/luckypray/dexkit/wrap/ISerializable;", "T", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "outcome", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;", "mode", "LYue/ۥۡۦۧۤ;", "resolveSingleOutcome-gIAlu-s", "(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;)Ljava/lang/Object;", "resolveSingleOutcome", "", "raw", "parseSingleOutcome", "(Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;", "cachePolicy", "", "stableQueryIdentity", "shouldCacheFailure", "(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z", "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;", "cache", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "cacheKey", "canCacheFailure", "Lkotlin/Function0;", "LYue/ۥۣۢ۠ۤ;", "ensureUsable", "loader", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "getCachedSingle", "(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "allowEmpty", "", "getCachedList", "(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "", "getCachedMap", "(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "CACHE_NO_RESULT", "Ljava/lang/String;", "CACHE_NON_UNIQUE", "LoadResult", "SingleOutcome", "SingleResolveMode", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class CacheBridgeStore {

    @Yue.InterfaceC4418
    private static final java.lang.String CACHE_NON_UNIQUE = "CACHE_NON_UNIQUE";

    @Yue.InterfaceC4418
    private static final java.lang.String CACHE_NO_RESULT = "CACHE_NO_RESULT";

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.cache.CacheBridgeStore INSTANCE = null;

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "T", "", "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "source", "LYue/ۥۡۦۧۤ;", "result", "<init>", "(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V", "component1", "()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "component2-d1pmJ48", "()Ljava/lang/Object;", "component2", "copy", "(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;", "getSource", "Ljava/lang/Object;", "getResult-d1pmJ48", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class LoadResult<T> {

        @Yue.InterfaceC4418
        private final java.lang.Object result;

        @Yue.InterfaceC4418
        private final org.luckypray.dexkit.DexKitCacheBridge.ResultSource source;

        public LoadResult(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.ResultSource r2, @Yue.InterfaceC4418 java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.source = r2
                r1.result = r3
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult copy$default(org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult r0, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r1, Yue.C5388 r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = r0.source
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto L10
                java.lang.Object r2 = r0.result
                Yue.ۥۡۦۧۤ r2 = Yue.C5388.m20376(r2)
            L10:
                java.lang.Object r2 = r2.m20387()
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = r0.copy(r1, r2)
                return r0
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource component1() {
                r1 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r1.source
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: component2-d1pmJ48, reason: not valid java name */
        public final java.lang.Object m30787component2d1pmJ48() {
                r1 = this;
                java.lang.Object r0 = r1.result
                return r0
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<T> copy(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.ResultSource r2, @Yue.InterfaceC4418 java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r5 = (org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult) r5
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = r4.source
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r3 = r5.source
                if (r1 == r3) goto L13
                return r2
            L13:
                java.lang.Object r1 = r4.result
                java.lang.Object r5 = r5.result
                boolean r5 = Yue.C5388.m20379(r1, r5)
                if (r5 != 0) goto L1e
                return r2
            L1e:
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: getResult-d1pmJ48, reason: not valid java name */
        public final java.lang.Object m30788getResultd1pmJ48() {
                r1 = this;
                java.lang.Object r0 = r1.result
                return r0
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource getSource() {
                r1 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r1.source
                return r0
        }

        public int hashCode() {
                r2 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r2.source
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Object r1 = r2.result
                int r1 = Yue.C5388.m20383(r1)
                int r0 = r0 + r1
                return r0
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r4 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r4.source
                java.lang.Object r1 = r4.result
                java.lang.String r1 = Yue.C5388.m20386(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "LoadResult(source="
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = ", result="
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    @Yue.InterfaceC4201(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "T", "Lorg/luckypray/dexkit/wrap/ISerializable;", "", "NoResult", "NonUnique", "Value", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface SingleOutcome<T extends org.luckypray.dexkit.wrap.ISerializable> {

        @Yue.InterfaceC4201(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "", "exception", "Lorg/luckypray/dexkit/exceptions/NoResultException;", "(Lorg/luckypray/dexkit/exceptions/NoResultException;)V", "getException", "()Lorg/luckypray/dexkit/exceptions/NoResultException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class NoResult implements org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome {

            @Yue.InterfaceC4418
            private final org.luckypray.dexkit.exceptions.NoResultException exception;

            public NoResult() {
                    r2 = this;
                    r0 = 0
                    r1 = 1
                    r2.<init>(r0, r1, r0)
                    return
            }

            public NoResult(@Yue.InterfaceC4418 org.luckypray.dexkit.exceptions.NoResultException r2) {
                    r1 = this;
                    java.lang.String r0 = "exception"
                    Yue.C3329.m13906(r2, r0)
                    r1.<init>()
                    r1.exception = r2
                    return
            }

            public /* synthetic */ NoResult(org.luckypray.dexkit.exceptions.NoResultException r1, int r2, Yue.C1769 r3) {
                    r0 = this;
                    r2 = r2 & 1
                    if (r2 == 0) goto Lb
                    org.luckypray.dexkit.exceptions.NoResultException r1 = new org.luckypray.dexkit.exceptions.NoResultException
                    java.lang.String r2 = "No result found for query"
                    r1.<init>(r2)
                Lb:
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult copy$default(org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult r0, org.luckypray.dexkit.exceptions.NoResultException r1, int r2, java.lang.Object r3) {
                    r2 = r2 & 1
                    if (r2 == 0) goto L6
                    org.luckypray.dexkit.exceptions.NoResultException r1 = r0.exception
                L6:
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r0 = r0.copy(r1)
                    return r0
            }

            @Yue.InterfaceC4418
            public final org.luckypray.dexkit.exceptions.NoResultException component1() {
                    r1 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r0 = r1.exception
                    return r0
            }

            @Yue.InterfaceC4418
            public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult copy(@Yue.InterfaceC4418 org.luckypray.dexkit.exceptions.NoResultException r2) {
                    r1 = this;
                    java.lang.String r0 = "exception"
                    Yue.C3329.m13906(r2, r0)
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult
                    r0.<init>(r2)
                    return r0
            }

            public boolean equals(@Yue.InterfaceC4543 java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r4 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult) r4
                    org.luckypray.dexkit.exceptions.NoResultException r1 = r3.exception
                    org.luckypray.dexkit.exceptions.NoResultException r4 = r4.exception
                    boolean r4 = Yue.C3329.m13897(r1, r4)
                    if (r4 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            @Yue.InterfaceC4418
            public final org.luckypray.dexkit.exceptions.NoResultException getException() {
                    r1 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r0 = r1.exception
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r0 = r1.exception
                    int r0 = r0.hashCode()
                    return r0
            }

            @Yue.InterfaceC4418
            public java.lang.String toString() {
                    r3 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r0 = r3.exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "NoResult(exception="
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = ")"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    return r0
            }
        }

        @Yue.InterfaceC4201(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "", "exception", "Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;", "(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)V", "getException", "()Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class NonUnique implements org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome {

            @Yue.InterfaceC4418
            private final org.luckypray.dexkit.exceptions.NonUniqueResultException exception;

            public NonUnique() {
                    r2 = this;
                    r0 = 0
                    r1 = 1
                    r2.<init>(r0, r1, r0)
                    return
            }

            public NonUnique(@Yue.InterfaceC4418 org.luckypray.dexkit.exceptions.NonUniqueResultException r2) {
                    r1 = this;
                    java.lang.String r0 = "exception"
                    Yue.C3329.m13906(r2, r0)
                    r1.<init>()
                    r1.exception = r2
                    return
            }

            public /* synthetic */ NonUnique(org.luckypray.dexkit.exceptions.NonUniqueResultException r1, int r2, Yue.C1769 r3) {
                    r0 = this;
                    r2 = r2 & 1
                    if (r2 == 0) goto Lb
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r1 = new org.luckypray.dexkit.exceptions.NonUniqueResultException
                    java.lang.String r2 = "query did not return a unique result"
                    r1.<init>(r2)
                Lb:
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique copy$default(org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique r0, org.luckypray.dexkit.exceptions.NonUniqueResultException r1, int r2, java.lang.Object r3) {
                    r2 = r2 & 1
                    if (r2 == 0) goto L6
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r1 = r0.exception
                L6:
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r0 = r0.copy(r1)
                    return r0
            }

            @Yue.InterfaceC4418
            public final org.luckypray.dexkit.exceptions.NonUniqueResultException component1() {
                    r1 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = r1.exception
                    return r0
            }

            @Yue.InterfaceC4418
            public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique copy(@Yue.InterfaceC4418 org.luckypray.dexkit.exceptions.NonUniqueResultException r2) {
                    r1 = this;
                    java.lang.String r0 = "exception"
                    Yue.C3329.m13906(r2, r0)
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique
                    r0.<init>(r2)
                    return r0
            }

            public boolean equals(@Yue.InterfaceC4543 java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r4 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique) r4
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r1 = r3.exception
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r4 = r4.exception
                    boolean r4 = Yue.C3329.m13897(r1, r4)
                    if (r4 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            @Yue.InterfaceC4418
            public final org.luckypray.dexkit.exceptions.NonUniqueResultException getException() {
                    r1 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = r1.exception
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = r1.exception
                    int r0 = r0.hashCode()
                    return r0
            }

            @Yue.InterfaceC4418
            public java.lang.String toString() {
                    r3 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = r3.exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "NonUnique(exception="
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = ")"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    return r0
            }
        }

        @Yue.InterfaceC4201(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;", "T", "Lorg/luckypray/dexkit/wrap/ISerializable;", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "value", "(Lorg/luckypray/dexkit/wrap/ISerializable;)V", "getValue", "()Lorg/luckypray/dexkit/wrap/ISerializable;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "component1", "copy", "(Lorg/luckypray/dexkit/wrap/ISerializable;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;", "equals", "", "other", "", "hashCode", "", "toString", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Value<T extends org.luckypray.dexkit.wrap.ISerializable> implements org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<T> {

            @Yue.InterfaceC4418
            private final T value;

            public Value(@Yue.InterfaceC4418 T r2) {
                    r1 = this;
                    java.lang.String r0 = "value"
                    Yue.C3329.m13906(r2, r0)
                    r1.<init>()
                    r1.value = r2
                    return
            }

            public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value copy$default(org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value r0, org.luckypray.dexkit.wrap.ISerializable r1, int r2, java.lang.Object r3) {
                    r2 = r2 & 1
                    if (r2 == 0) goto L6
                    T extends org.luckypray.dexkit.wrap.ISerializable r1 = r0.value
                L6:
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r0 = r0.copy(r1)
                    return r0
            }

            @Yue.InterfaceC4418
            public final T component1() {
                    r1 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r0 = r1.value
                    return r0
            }

            @Yue.InterfaceC4418
            public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value<T> copy(@Yue.InterfaceC4418 T r2) {
                    r1 = this;
                    java.lang.String r0 = "value"
                    Yue.C3329.m13906(r2, r0)
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value
                    r0.<init>(r2)
                    return r0
            }

            public boolean equals(@Yue.InterfaceC4543 java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r4 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value) r4
                    T extends org.luckypray.dexkit.wrap.ISerializable r1 = r3.value
                    T extends org.luckypray.dexkit.wrap.ISerializable r4 = r4.value
                    boolean r4 = Yue.C3329.m13897(r1, r4)
                    if (r4 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            @Yue.InterfaceC4418
            public final T getValue() {
                    r1 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r0 = r1.value
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r0 = r1.value
                    int r0 = r0.hashCode()
                    return r0
            }

            @Yue.InterfaceC4418
            public java.lang.String toString() {
                    r3 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r0 = r3.value
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Value(value="
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = ")"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    return r0
            }
        }
    }

    @Yue.InterfaceC4201(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;", "", "(Ljava/lang/String;I)V", "REQUIRED", "NULLABLE", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum SingleResolveMode extends java.lang.Enum<org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode> {
        private static final /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode[] $VALUES = null;
        public static final org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode NULLABLE = null;
        public static final org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode REQUIRED = null;

        private static final /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode[] $values() {
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r0 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r1 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode[] r0 = new org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode[]{r0, r1}
                return r0
        }

        static {
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode
                java.lang.String r1 = "REQUIRED"
                r2 = 0
                r0.<init>(r1, r2)
                org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED = r0
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode
                java.lang.String r1 = "NULLABLE"
                r2 = 1
                r0.<init>(r1, r2)
                org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE = r0
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode[] r0 = $values()
                org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.$VALUES = r0
                return
        }

        SingleResolveMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode valueOf(java.lang.String r1) {
                java.lang.Class<org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode> r0 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r1 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode) r1
                return r1
        }

        public static org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode[] values() {
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode[] r0 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.$VALUES
                java.lang.Object r0 = r0.clone()
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode[] r0 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode[]) r0
                return r0
        }
    }

    @Yue.InterfaceC4201(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy[] r0 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r2 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.NONE     // Catch: java.lang.NoSuchFieldError -> L10
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                r2 = 2
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r3 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.QUERY_ONLY     // Catch: java.lang.NoSuchFieldError -> L19
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r3 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.ALL     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r4 = 3
                r0[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$0 = r0
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode[] r0 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r3 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r1 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED     // Catch: java.lang.NoSuchFieldError -> L3b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$1 = r0
                return
        }
    }

    static {
            org.luckypray.dexkit.cache.CacheBridgeStore r0 = new org.luckypray.dexkit.cache.CacheBridgeStore
            r0.<init>()
            org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE = r0
            return
    }

    private CacheBridgeStore() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult getCachedList$default(org.luckypray.dexkit.cache.CacheBridgeStore r9, org.luckypray.dexkit.DexKitCacheBridge.Cache r10, java.util.concurrent.locks.ReentrantReadWriteLock r11, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r12, java.lang.String r13, boolean r14, Yue.InterfaceC2823 r15, Yue.InterfaceC2823 r16, int r17, java.lang.Object r18) {
            r0 = r17 & 64
            if (r0 == 0) goto L7
            r0 = 0
            r8 = r0
            goto L9
        L7:
            r8 = r16
        L9:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = r1.getCachedList(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private static final <U extends org.luckypray.dexkit.wrap.ISerializable> Yue.C5388<java.util.List<U>> getCachedList$innerGet$10(org.luckypray.dexkit.DexKitCacheBridge.Cache r3, java.lang.String r4, boolean r5) {
            r0 = 0
            java.util.List r3 = r3.getStringList(r4, r0)
            if (r3 == 0) goto L69
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.wrap.ISerializable$Companion r2 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r1 = r2.deserializeAs(r1)
            r0.add(r1)
            goto L16
        L2c:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L5e
            if (r5 != 0) goto L5e
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "cached empty for key: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " but empty not allowed"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            java.lang.Object r3 = Yue.C5391.m20390(r3)
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            Yue.ۥۡۦۧۤ r3 = Yue.C5388.m20376(r3)
            return r3
        L5e:
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.Object r3 = Yue.C5388.m20377(r0)
            Yue.ۥۡۦۧۤ r3 = Yue.C5388.m20376(r3)
            return r3
        L69:
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult getCachedMap$default(org.luckypray.dexkit.cache.CacheBridgeStore r7, org.luckypray.dexkit.DexKitCacheBridge.Cache r8, java.util.concurrent.locks.ReentrantReadWriteLock r9, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r10, java.lang.String r11, Yue.InterfaceC2823 r12, Yue.InterfaceC2823 r13, int r14, java.lang.Object r15) {
            r14 = r14 & 32
            if (r14 == 0) goto L5
            r13 = 0
        L5:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r7 = r0.getCachedMap(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static final <U extends org.luckypray.dexkit.wrap.ISerializable> java.util.Map<java.lang.String, java.util.List<U>> getCachedMap$innerGetMap(org.luckypray.dexkit.DexKitCacheBridge.Cache r9, java.lang.String r10) {
            org.luckypray.dexkit.cache.CacheBridgeKeys r0 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
            java.lang.String r0 = r0.mapGroupsKey(r10)
            r1 = 0
            java.util.List r0 = r9.getStringList(r0, r1)
            if (r0 != 0) goto Le
            return r1
        Le:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = r0.size()
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r2.add(r4)
            if (r5 != 0) goto L37
            return r1
        L37:
            org.luckypray.dexkit.cache.CacheBridgeKeys r5 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
            java.lang.String r5 = r5.mapGroupKey(r10, r4)
            java.util.List r5 = r9.getStringList(r5, r1)
            if (r5 != 0) goto L44
            return r1
        L44:
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6b
            r7 = 10
            int r7 = Yue.C1210.m6231(r5, r7)     // Catch: java.lang.Throwable -> L6b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L6b
        L55:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L6b
            org.luckypray.dexkit.wrap.ISerializable$Companion r8 = org.luckypray.dexkit.wrap.ISerializable.Companion     // Catch: java.lang.Throwable -> L6b
            org.luckypray.dexkit.wrap.ISerializable r7 = r8.deserializeAs(r7)     // Catch: java.lang.Throwable -> L6b
            r6.add(r7)     // Catch: java.lang.Throwable -> L6b
            goto L55
        L6b:
            r5 = move-exception
            goto L72
        L6d:
            java.lang.Object r5 = Yue.C5388.m20377(r6)     // Catch: java.lang.Throwable -> L6b
            goto L7c
        L72:
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029
            java.lang.Object r5 = Yue.C5391.m20390(r5)
            java.lang.Object r5 = Yue.C5388.m20377(r5)
        L7c:
            java.lang.Throwable r6 = Yue.C5388.m20380(r5)
            if (r6 != 0) goto L88
            java.util.List r5 = (java.util.List) r5
            r3.put(r4, r5)
            goto L24
        L88:
            return r1
        L89:
            return r3
    }

    public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult getCachedSingle$default(org.luckypray.dexkit.cache.CacheBridgeStore r10, org.luckypray.dexkit.DexKitCacheBridge.Cache r11, java.util.concurrent.locks.ReentrantReadWriteLock r12, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r13, java.lang.String r14, org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r15, boolean r16, Yue.InterfaceC2823 r17, Yue.InterfaceC2823 r18, int r19, java.lang.Object r20) {
            r0 = r19
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L9
            r0 = 0
            r9 = r0
            goto Lb
        L9:
            r9 = r18
        Lb:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = r1.getCachedSingle(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    private static final <U extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<U> getCachedSingle$innerGet(org.luckypray.dexkit.DexKitCacheBridge.Cache r1, java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = r1.getString(r2, r0)
            if (r1 == 0) goto Le
            org.luckypray.dexkit.cache.CacheBridgeStore r2 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r1 = r2.parseSingleOutcome(r1)
            return r1
        Le:
            return r0
    }

    private final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<T> parseSingleOutcome(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "CACHE_NO_RESULT"
            boolean r0 = Yue.C3329.m13897(r4, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r4 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult
            r4.<init>(r2, r1, r2)
            goto L2f
        L10:
            java.lang.String r0 = "CACHE_NON_UNIQUE"
            boolean r0 = Yue.C3329.m13897(r4, r0)
            if (r0 == 0) goto L1e
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r4 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique
            r4.<init>(r2, r1, r2)
            goto L2f
        L1e:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value
            org.luckypray.dexkit.wrap.ISerializable$Companion r1 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r4 = r1.deserializeAs(r4)
            java.lang.String r1 = "null cannot be cast to non-null type T of org.luckypray.dexkit.cache.CacheBridgeStore.parseSingleOutcome"
            Yue.C3329.m13904(r4, r1)
            r0.<init>(r4)
            r4 = r0
        L2f:
            return r4
    }

    /* JADX INFO: renamed from: resolveSingleOutcome-gIAlu-s, reason: not valid java name */
    private final <T extends org.luckypray.dexkit.wrap.ISerializable> java.lang.Object m30786resolveSingleOutcomegIAlus(org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<? extends T> r5, org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r6) {
            r4 = this;
            boolean r0 = r5 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value
            if (r0 == 0) goto L11
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r5 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value) r5
            org.luckypray.dexkit.wrap.ISerializable r5 = r5.getValue()
            java.lang.Object r5 = Yue.C5388.m20377(r5)
            goto L6f
        L11:
            boolean r0 = r5 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L42
            int[] r0 = org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$1
            int r6 = r6.ordinal()
            r6 = r0[r6]
            if (r6 == r3) goto L3b
            if (r6 != r2) goto L35
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r5 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult) r5
            org.luckypray.dexkit.exceptions.NoResultException r5 = r5.getException()
            java.lang.Object r5 = Yue.C5391.m20390(r5)
            java.lang.Object r5 = Yue.C5388.m20377(r5)
            goto L6f
        L35:
            Yue.ۥۣۣۡۢ r5 = new Yue.ۥۣۣۡۢ
            r5.<init>()
            throw r5
        L3b:
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029
            java.lang.Object r5 = Yue.C5388.m20377(r1)
            goto L6f
        L42:
            boolean r0 = r5 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique
            if (r0 == 0) goto L70
            int[] r0 = org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$1
            int r6 = r6.ordinal()
            r6 = r0[r6]
            if (r6 == r3) goto L69
            if (r6 != r2) goto L63
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r5 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique) r5
            org.luckypray.dexkit.exceptions.NonUniqueResultException r5 = r5.getException()
            java.lang.Object r5 = Yue.C5391.m20390(r5)
            java.lang.Object r5 = Yue.C5388.m20377(r5)
            goto L6f
        L63:
            Yue.ۥۣۣۡۢ r5 = new Yue.ۥۣۣۡۢ
            r5.<init>()
            throw r5
        L69:
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029
            java.lang.Object r5 = Yue.C5388.m20377(r1)
        L6f:
            return r5
        L70:
            Yue.ۥۣۣۡۢ r5 = new Yue.ۥۣۣۡۢ
            r5.<init>()
            throw r5
    }

    @Yue.InterfaceC4418
    public final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<java.util.List<T>> getCachedList(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.Cache r5, @Yue.InterfaceC4418 java.util.concurrent.locks.ReentrantReadWriteLock r6, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r7, @Yue.InterfaceC4418 java.lang.String r8, boolean r9, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r10, @Yue.InterfaceC4543 Yue.InterfaceC2823<? extends java.util.List<? extends T>> r11) {
            r4 = this;
            java.lang.String r0 = "cache"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "lock"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "cachePolicy"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "cacheKey"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "ensureUsable"
            Yue.C3329.m13906(r10, r0)
            r10.invoke()
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r6.readLock()
            r10.lock()
            Yue.ۥۡۦۧۤ r0 = getCachedList$innerGet$10(r5, r8, r9)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3b
            java.lang.Object r5 = r0.m20387()     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r6 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r7 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> L38
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L38
            r10.unlock()
            return r6
        L38:
            r5 = move-exception
            goto L153
        L3b:
            r10.unlock()
            if (r11 != 0) goto L68
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r5 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r6 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE
            Yue.ۥۡۦۧۤ$ۥ r7 = Yue.C5388.f20029
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "no found cache for key: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            java.lang.Object r7 = Yue.C5391.m20390(r7)
            java.lang.Object r7 = Yue.C5388.m20377(r7)
            r5.<init>(r6, r7)
            return r5
        L68:
            Yue.ۥۡۦۧۤ$ۥ r10 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L75
            java.lang.Object r10 = r11.invoke()     // Catch: java.lang.Throwable -> L75
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L75
            java.lang.Object r10 = Yue.C5388.m20377(r10)     // Catch: java.lang.Throwable -> L75
            goto L80
        L75:
            r10 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r11 = Yue.C5388.f20029
            java.lang.Object r10 = Yue.C5391.m20390(r10)
            java.lang.Object r10 = Yue.C5388.m20377(r10)
        L80:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r6.readLock()
            int r0 = r6.getWriteHoldCount()
            r1 = 0
            if (r0 != 0) goto L90
            int r0 = r6.getReadHoldCount()
            goto L91
        L90:
            r0 = r1
        L91:
            r2 = r1
        L92:
            if (r2 >= r0) goto L9a
            r11.unlock()
            int r2 = r2 + 1
            goto L92
        L9a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.lock()
            Yue.ۥۡۦۧۤ r2 = getCachedList$innerGet$10(r5, r8, r9)     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto Lc1
            java.lang.Object r5 = r2.m20387()     // Catch: java.lang.Throwable -> Lbe
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r7 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lbe
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r8 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> Lbe
            r7.<init>(r8, r5)     // Catch: java.lang.Throwable -> Lbe
        Lb2:
            if (r1 >= r0) goto Lba
            r11.lock()
            int r1 = r1 + 1
            goto Lb2
        Lba:
            r6.unlock()
            return r7
        Lbe:
            r5 = move-exception
            goto L147
        Lc1:
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r2 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY     // Catch: java.lang.Throwable -> Lbe
            java.lang.Throwable r3 = Yue.C5388.m20380(r10)     // Catch: java.lang.Throwable -> Lbe
            if (r3 != 0) goto L12c
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> Lbe
            boolean r3 = r10.isEmpty()     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto Lf9
            if (r9 != 0) goto Lf9
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lbe
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbe
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r7.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r9 = "query returned empty for key: "
            r7.append(r9)     // Catch: java.lang.Throwable -> Lbe
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r8 = " but empty not allowed"
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lbe
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = Yue.C5391.m20390(r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = Yue.C5388.m20377(r5)     // Catch: java.lang.Throwable -> Lbe
            goto L136
        Lf9:
            boolean r7 = r7.getCacheSuccess()     // Catch: java.lang.Throwable -> Lbe
            if (r7 == 0) goto L125
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbe
            r9 = 10
            int r9 = Yue.C1210.m6231(r10, r9)     // Catch: java.lang.Throwable -> Lbe
            r7.<init>(r9)     // Catch: java.lang.Throwable -> Lbe
            java.util.Iterator r9 = r10.iterator()     // Catch: java.lang.Throwable -> Lbe
        L10e:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto L122
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> Lbe
            org.luckypray.dexkit.wrap.ISerializable r3 = (org.luckypray.dexkit.wrap.ISerializable) r3     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = r3.serialize()     // Catch: java.lang.Throwable -> Lbe
            r7.add(r3)     // Catch: java.lang.Throwable -> Lbe
            goto L10e
        L122:
            r5.putStringList(r8, r7)     // Catch: java.lang.Throwable -> Lbe
        L125:
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = Yue.C5388.m20377(r10)     // Catch: java.lang.Throwable -> Lbe
            goto L136
        L12c:
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = Yue.C5391.m20390(r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = Yue.C5388.m20377(r5)     // Catch: java.lang.Throwable -> Lbe
        L136:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r7 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lbe
            r7.<init>(r2, r5)     // Catch: java.lang.Throwable -> Lbe
        L13b:
            if (r1 >= r0) goto L143
            r11.lock()
            int r1 = r1 + 1
            goto L13b
        L143:
            r6.unlock()
            return r7
        L147:
            if (r1 >= r0) goto L14f
            r11.lock()
            int r1 = r1 + 1
            goto L147
        L14f:
            r6.unlock()
            throw r5
        L153:
            r10.unlock()
            throw r5
    }

    @Yue.InterfaceC4418
    public final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<java.util.Map<java.lang.String, java.util.List<T>>> getCachedMap(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.Cache r10, @Yue.InterfaceC4418 java.util.concurrent.locks.ReentrantReadWriteLock r11, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r12, @Yue.InterfaceC4418 java.lang.String r13, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r14, @Yue.InterfaceC4543 Yue.InterfaceC2823<? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends T>>> r15) {
            r9 = this;
            java.lang.String r0 = "cache"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r0 = "lock"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "cachePolicy"
            Yue.C3329.m13906(r12, r0)
            java.lang.String r0 = "cacheKey"
            Yue.C3329.m13906(r13, r0)
            java.lang.String r0 = "ensureUsable"
            Yue.C3329.m13906(r14, r0)
            r14.invoke()
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r14 = r11.readLock()
            r14.lock()
            java.util.Map r0 = getCachedMap$innerGetMap(r10, r13)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3d
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r10 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L3a
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r11 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> L3a
            Yue.ۥۡۦۧۤ$ۥ r12 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r12 = Yue.C5388.m20377(r0)     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r11, r12)     // Catch: java.lang.Throwable -> L3a
            r14.unlock()
            return r10
        L3a:
            r10 = move-exception
            goto L194
        L3d:
            r14.unlock()
            if (r15 != 0) goto L6a
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r10 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r11 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE
            Yue.ۥۡۦۧۤ$ۥ r12 = Yue.C5388.f20029
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "no found cache for key: "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            java.lang.Object r12 = Yue.C5391.m20390(r12)
            java.lang.Object r12 = Yue.C5388.m20377(r12)
            r10.<init>(r11, r12)
            return r10
        L6a:
            Yue.ۥۡۦۧۤ$ۥ r14 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L77
            java.lang.Object r14 = r15.invoke()     // Catch: java.lang.Throwable -> L77
            java.util.Map r14 = (java.util.Map) r14     // Catch: java.lang.Throwable -> L77
            java.lang.Object r14 = Yue.C5388.m20377(r14)     // Catch: java.lang.Throwable -> L77
            goto L82
        L77:
            r14 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r15 = Yue.C5388.f20029
            java.lang.Object r14 = Yue.C5391.m20390(r14)
            java.lang.Object r14 = Yue.C5388.m20377(r14)
        L82:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r15 = r11.readLock()
            int r0 = r11.getWriteHoldCount()
            r1 = 0
            if (r0 != 0) goto L92
            int r0 = r11.getReadHoldCount()
            goto L93
        L92:
            r0 = r1
        L93:
            r2 = r1
        L94:
            if (r2 >= r0) goto L9c
            r15.unlock()
            int r2 = r2 + 1
            goto L94
        L9c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r11 = r11.writeLock()
            r11.lock()
            java.util.Map r2 = getCachedMap$innerGetMap(r10, r13)     // Catch: java.lang.Throwable -> Lc2
            if (r2 == 0) goto Lc5
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r10 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lc2
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r12 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> Lc2
            Yue.ۥۡۦۧۤ$ۥ r13 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r13 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> Lc2
            r10.<init>(r12, r13)     // Catch: java.lang.Throwable -> Lc2
        Lb6:
            if (r1 >= r0) goto Lbe
            r15.lock()
            int r1 = r1 + 1
            goto Lb6
        Lbe:
            r11.unlock()
            return r10
        Lc2:
            r10 = move-exception
            goto L188
        Lc5:
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r2 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY     // Catch: java.lang.Throwable -> Lc2
            java.lang.Throwable r3 = Yue.C5388.m20380(r14)     // Catch: java.lang.Throwable -> Lc2
            if (r3 != 0) goto L16d
            java.util.Map r14 = (java.util.Map) r14     // Catch: java.lang.Throwable -> Lc2
            org.luckypray.dexkit.cache.CacheBridgeKeys r3 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = r3.mapGroupsKey(r13)     // Catch: java.lang.Throwable -> Lc2
            r4 = 0
            java.util.List r3 = r10.getStringList(r3, r4)     // Catch: java.lang.Throwable -> Lc2
            if (r3 != 0) goto Le0
            java.util.List r3 = Yue.C1208.m6210()     // Catch: java.lang.Throwable -> Lc2
        Le0:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc2
            r4.<init>()     // Catch: java.lang.Throwable -> Lc2
            boolean r12 = r12.getCacheSuccess()     // Catch: java.lang.Throwable -> Lc2
            if (r12 == 0) goto L166
            java.util.Set r12 = r14.entrySet()     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> Lc2
        Lf3:
            boolean r5 = r12.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r5 == 0) goto L13b
            java.lang.Object r5 = r12.next()     // Catch: java.lang.Throwable -> Lc2
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> Lc2
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> Lc2
            r4.add(r6)     // Catch: java.lang.Throwable -> Lc2
            org.luckypray.dexkit.cache.CacheBridgeKeys r7 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = r7.mapGroupKey(r13, r6)     // Catch: java.lang.Throwable -> Lc2
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc2
            r8 = 10
            int r8 = Yue.C1210.m6231(r5, r8)     // Catch: java.lang.Throwable -> Lc2
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc2
        L123:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r8 == 0) goto L137
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> Lc2
            org.luckypray.dexkit.wrap.ISerializable r8 = (org.luckypray.dexkit.wrap.ISerializable) r8     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = r8.serialize()     // Catch: java.lang.Throwable -> Lc2
            r7.add(r8)     // Catch: java.lang.Throwable -> Lc2
            goto L123
        L137:
            r10.putStringList(r6, r7)     // Catch: java.lang.Throwable -> Lc2
            goto Lf3
        L13b:
            java.util.Set r12 = Yue.C1219.m6542(r4)     // Catch: java.lang.Throwable -> Lc2
            java.util.List r12 = Yue.C1219.m6454(r3, r12)     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> Lc2
        L147:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r3 == 0) goto L15d
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lc2
            org.luckypray.dexkit.cache.CacheBridgeKeys r5 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = r5.mapGroupKey(r13, r3)     // Catch: java.lang.Throwable -> Lc2
            r10.remove(r3)     // Catch: java.lang.Throwable -> Lc2
            goto L147
        L15d:
            org.luckypray.dexkit.cache.CacheBridgeKeys r12 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r12 = r12.mapGroupsKey(r13)     // Catch: java.lang.Throwable -> Lc2
            r10.putStringList(r12, r4)     // Catch: java.lang.Throwable -> Lc2
        L166:
            Yue.ۥۡۦۧۤ$ۥ r10 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = Yue.C5388.m20377(r14)     // Catch: java.lang.Throwable -> Lc2
            goto L177
        L16d:
            Yue.ۥۡۦۧۤ$ۥ r10 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = Yue.C5391.m20390(r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = Yue.C5388.m20377(r10)     // Catch: java.lang.Throwable -> Lc2
        L177:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r12 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lc2
            r12.<init>(r2, r10)     // Catch: java.lang.Throwable -> Lc2
        L17c:
            if (r1 >= r0) goto L184
            r15.lock()
            int r1 = r1 + 1
            goto L17c
        L184:
            r11.unlock()
            return r12
        L188:
            if (r1 >= r0) goto L190
            r15.lock()
            int r1 = r1 + 1
            goto L188
        L190:
            r11.unlock()
            throw r10
        L194:
            r14.unlock()
            throw r10
    }

    @Yue.InterfaceC4418
    public final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<T> getCachedSingle(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.Cache r5, @Yue.InterfaceC4418 java.util.concurrent.locks.ReentrantReadWriteLock r6, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r9, boolean r10, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r11, @Yue.InterfaceC4543 Yue.InterfaceC2823<? extends org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<? extends T>> r12) {
            r4 = this;
            java.lang.String r0 = "cache"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "lock"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "cachePolicy"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "cacheKey"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "mode"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "ensureUsable"
            Yue.C3329.m13906(r11, r0)
            r11.invoke()
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r6.readLock()
            r11.lock()
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r0 = getCachedSingle$innerGet(r5, r8)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L42
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r5 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r6 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.cache.CacheBridgeStore r7 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r7 = r7.m30786resolveSingleOutcomegIAlus(r0, r9)     // Catch: java.lang.Throwable -> L3f
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L3f
            r11.unlock()
            return r5
        L3f:
            r5 = move-exception
            goto L131
        L42:
            r11.unlock()
            if (r12 != 0) goto L6f
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r5 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r6 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE
            Yue.ۥۡۦۧۤ$ۥ r7 = Yue.C5388.f20029
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "no found cache for key: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            java.lang.Object r7 = Yue.C5391.m20390(r7)
            java.lang.Object r7 = Yue.C5388.m20377(r7)
            r5.<init>(r6, r7)
            return r5
        L6f:
            Yue.ۥۡۦۧۤ$ۥ r11 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r11 = r12.invoke()     // Catch: java.lang.Throwable -> L7c
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r11 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome) r11     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r11 = Yue.C5388.m20377(r11)     // Catch: java.lang.Throwable -> L7c
            goto L87
        L7c:
            r11 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r12 = Yue.C5388.f20029
            java.lang.Object r11 = Yue.C5391.m20390(r11)
            java.lang.Object r11 = Yue.C5388.m20377(r11)
        L87:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r12 = r6.readLock()
            int r0 = r6.getWriteHoldCount()
            r1 = 0
            if (r0 != 0) goto L97
            int r0 = r6.getReadHoldCount()
            goto L98
        L97:
            r0 = r1
        L98:
            r2 = r1
        L99:
            if (r2 >= r0) goto La1
            r12.unlock()
            int r2 = r2 + 1
            goto L99
        La1:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.lock()
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r2 = getCachedSingle$innerGet(r5, r8)     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto Lc9
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r5 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lc7
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r7 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> Lc7
            org.luckypray.dexkit.cache.CacheBridgeStore r8 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r8 = r8.m30786resolveSingleOutcomegIAlus(r2, r9)     // Catch: java.lang.Throwable -> Lc7
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lc7
        Lbb:
            if (r1 >= r0) goto Lc3
            r12.lock()
            int r1 = r1 + 1
            goto Lbb
        Lc3:
            r6.unlock()
            return r5
        Lc7:
            r5 = move-exception
            goto L125
        Lc9:
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r2 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY     // Catch: java.lang.Throwable -> Lc7
            java.lang.Throwable r3 = Yue.C5388.m20380(r11)     // Catch: java.lang.Throwable -> Lc7
            if (r3 != 0) goto L10a
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r11 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome) r11     // Catch: java.lang.Throwable -> Lc7
            boolean r3 = r11 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value     // Catch: java.lang.Throwable -> Lc7
            if (r3 == 0) goto Lec
            boolean r7 = r7.getCacheSuccess()     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto L103
            r7 = r11
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r7 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value) r7     // Catch: java.lang.Throwable -> Lc7
            org.luckypray.dexkit.wrap.ISerializable r7 = r7.getValue()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = r7.serialize()     // Catch: java.lang.Throwable -> Lc7
            r5.putString(r8, r7)     // Catch: java.lang.Throwable -> Lc7
            goto L103
        Lec:
            boolean r7 = r11 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto Lf8
            if (r10 == 0) goto L103
            java.lang.String r7 = "CACHE_NO_RESULT"
            r5.putString(r8, r7)     // Catch: java.lang.Throwable -> Lc7
            goto L103
        Lf8:
            boolean r7 = r11 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto L103
            if (r10 == 0) goto L103
            java.lang.String r7 = "CACHE_NON_UNIQUE"
            r5.putString(r8, r7)     // Catch: java.lang.Throwable -> Lc7
        L103:
            org.luckypray.dexkit.cache.CacheBridgeStore r5 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r5 = r5.m30786resolveSingleOutcomegIAlus(r11, r9)     // Catch: java.lang.Throwable -> Lc7
            goto L114
        L10a:
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r5 = Yue.C5391.m20390(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r5 = Yue.C5388.m20377(r5)     // Catch: java.lang.Throwable -> Lc7
        L114:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r7 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lc7
            r7.<init>(r2, r5)     // Catch: java.lang.Throwable -> Lc7
        L119:
            if (r1 >= r0) goto L121
            r12.lock()
            int r1 = r1 + 1
            goto L119
        L121:
            r6.unlock()
            return r7
        L125:
            if (r1 >= r0) goto L12d
            r12.lock()
            int r1 = r1 + 1
            goto L125
        L12d:
            r6.unlock()
            throw r5
        L131:
            r11.unlock()
            throw r5
    }

    public final boolean shouldCacheFailure(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "cachePolicy"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r3 = r3.getFailurePolicy()
            int[] r0 = org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L22
            r1 = 2
            if (r3 == r1) goto L23
            r4 = 3
            if (r3 != r4) goto L1c
            r4 = r0
            goto L23
        L1c:
            Yue.ۥۣۣۡۢ r3 = new Yue.ۥۣۣۡۢ
            r3.<init>()
            throw r3
        L22:
            r4 = 0
        L23:
            return r4
    }
}
