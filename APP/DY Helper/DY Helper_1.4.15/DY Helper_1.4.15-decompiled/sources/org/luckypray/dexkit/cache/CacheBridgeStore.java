package org.luckypray.dexkit.cache;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeStore {
    private static final java.lang.String CACHE_NON_UNIQUE = "CACHE_NON_UNIQUE";
    private static final java.lang.String CACHE_NO_RESULT = "CACHE_NO_RESULT";
    public static final org.luckypray.dexkit.cache.CacheBridgeStore INSTANCE = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class LoadResult<T> {
        private final java.lang.Object result;
        private final org.luckypray.dexkit.DexKitCacheBridge.ResultSource source;

        public LoadResult(org.luckypray.dexkit.DexKitCacheBridge.ResultSource r1, java.lang.Object r2) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.source = r1
                r0.result = r2
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult copy$default(org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult r0, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r1, p000.fo1 r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = r0.source
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto L12
                java.lang.Object r2 = r0.result
                fo1 r3 = new fo1
                r3.<init>(r2)
                r2 = r3
            L12:
                java.lang.Object r2 = r2.f4054
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = r0.copy(r1, r2)
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource component1() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r0.source
                return r0
        }

        /* JADX INFO: renamed from: component2-d1pmJ48, reason: not valid java name */
        public final java.lang.Object m7394component2d1pmJ48() {
                r0 = this;
                java.lang.Object r0 = r0.result
                return r0
        }

        public final org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<T> copy(org.luckypray.dexkit.DexKitCacheBridge.ResultSource r1, java.lang.Object r2) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
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
                java.lang.Object r4 = r4.result
                java.lang.Object r5 = r5.result
                boolean r4 = p000.ln0.m3626(r4, r5)
                if (r4 != 0) goto L1e
                return r2
            L1e:
                return r0
        }

        /* JADX INFO: renamed from: getResult-d1pmJ48, reason: not valid java name */
        public final java.lang.Object m7395getResultd1pmJ48() {
                r0 = this;
                java.lang.Object r0 = r0.result
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource getSource() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r0.source
                return r0
        }

        public int hashCode() {
                r1 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r1.source
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Object r1 = r1.result
                if (r1 != 0) goto Le
                r1 = 0
                goto L12
            Le:
                int r1 = r1.hashCode()
            L12:
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r3.source
                java.lang.Object r3 = r3.result
                java.lang.String r3 = p000.fo1.m2191(r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "LoadResult(source="
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = ", result="
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = ")"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                return r3
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public interface SingleOutcome<T extends org.luckypray.dexkit.wrap.ISerializable> {

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public static final class NoResult implements org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome {
            private final org.luckypray.dexkit.exceptions.NoResultException exception;

            public NoResult() {
                    r2 = this;
                    r0 = 0
                    r1 = 1
                    r2.<init>(r0, r1, r0)
                    return
            }

            public NoResult(org.luckypray.dexkit.exceptions.NoResultException r1) {
                    r0 = this;
                    r1.getClass()
                    r0.<init>()
                    r0.exception = r1
                    return
            }

            public /* synthetic */ NoResult(org.luckypray.dexkit.exceptions.NoResultException r1, int r2, p000.AbstractC1067zq r3) {
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

            public final org.luckypray.dexkit.exceptions.NoResultException component1() {
                    r0 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r0 = r0.exception
                    return r0
            }

            public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult copy(org.luckypray.dexkit.exceptions.NoResultException r1) {
                    r0 = this;
                    r1.getClass()
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult
                    r0.<init>(r1)
                    return r0
            }

            public boolean equals(java.lang.Object r4) {
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
                    org.luckypray.dexkit.exceptions.NoResultException r3 = r3.exception
                    org.luckypray.dexkit.exceptions.NoResultException r4 = r4.exception
                    boolean r3 = p000.ln0.m3626(r3, r4)
                    if (r3 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            public final org.luckypray.dexkit.exceptions.NoResultException getException() {
                    r0 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r0 = r0.exception
                    return r0
            }

            public int hashCode() {
                    r0 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r0 = r0.exception
                    int r0 = r0.hashCode()
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    org.luckypray.dexkit.exceptions.NoResultException r2 = r2.exception
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "NoResult(exception="
                    r0.<init>(r1)
                    r0.append(r2)
                    java.lang.String r2 = ")"
                    r0.append(r2)
                    java.lang.String r2 = r0.toString()
                    return r2
            }
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public static final class NonUnique implements org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome {
            private final org.luckypray.dexkit.exceptions.NonUniqueResultException exception;

            public NonUnique() {
                    r2 = this;
                    r0 = 0
                    r1 = 1
                    r2.<init>(r0, r1, r0)
                    return
            }

            public NonUnique(org.luckypray.dexkit.exceptions.NonUniqueResultException r1) {
                    r0 = this;
                    r1.getClass()
                    r0.<init>()
                    r0.exception = r1
                    return
            }

            public /* synthetic */ NonUnique(org.luckypray.dexkit.exceptions.NonUniqueResultException r1, int r2, p000.AbstractC1067zq r3) {
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

            public final org.luckypray.dexkit.exceptions.NonUniqueResultException component1() {
                    r0 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = r0.exception
                    return r0
            }

            public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique copy(org.luckypray.dexkit.exceptions.NonUniqueResultException r1) {
                    r0 = this;
                    r1.getClass()
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique
                    r0.<init>(r1)
                    return r0
            }

            public boolean equals(java.lang.Object r4) {
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
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r3 = r3.exception
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r4 = r4.exception
                    boolean r3 = p000.ln0.m3626(r3, r4)
                    if (r3 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            public final org.luckypray.dexkit.exceptions.NonUniqueResultException getException() {
                    r0 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = r0.exception
                    return r0
            }

            public int hashCode() {
                    r0 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = r0.exception
                    int r0 = r0.hashCode()
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    org.luckypray.dexkit.exceptions.NonUniqueResultException r2 = r2.exception
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "NonUnique(exception="
                    r0.<init>(r1)
                    r0.append(r2)
                    java.lang.String r2 = ")"
                    r0.append(r2)
                    java.lang.String r2 = r0.toString()
                    return r2
            }
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public static final class Value<T extends org.luckypray.dexkit.wrap.ISerializable> implements org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<T> {
            private final T value;

            public Value(T r1) {
                    r0 = this;
                    r1.getClass()
                    r0.<init>()
                    r0.value = r1
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

            public final T component1() {
                    r0 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r0 = r0.value
                    return r0
            }

            public final org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value<T> copy(T r1) {
                    r0 = this;
                    r1.getClass()
                    org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r0 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value
                    r0.<init>(r1)
                    return r0
            }

            public boolean equals(java.lang.Object r4) {
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
                    T extends org.luckypray.dexkit.wrap.ISerializable r3 = r3.value
                    T extends org.luckypray.dexkit.wrap.ISerializable r4 = r4.value
                    boolean r3 = p000.ln0.m3626(r3, r4)
                    if (r3 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            public final T getValue() {
                    r0 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r0 = r0.value
                    return r0
            }

            public int hashCode() {
                    r0 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r0 = r0.value
                    int r0 = r0.hashCode()
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    T extends org.luckypray.dexkit.wrap.ISerializable r2 = r2.value
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Value(value="
                    r0.<init>(r1)
                    r0.append(r2)
                    java.lang.String r2 = ")"
                    r0.append(r2)
                    java.lang.String r2 = r0.toString()
                    return r2
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
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

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
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

    public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult getCachedList$default(org.luckypray.dexkit.cache.CacheBridgeStore r9, org.luckypray.dexkit.DexKitCacheBridge.Cache r10, java.util.concurrent.locks.ReentrantReadWriteLock r11, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r12, java.lang.String r13, boolean r14, p000.p70 r15, p000.p70 r16, int r17, java.lang.Object r18) {
            r0 = r17 & 64
            if (r0 == 0) goto Le
            r0 = 0
            r8 = r0
        L6:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            goto L11
        Le:
            r8 = r16
            goto L6
        L11:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r9 = r1.getCachedList(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    private static final <U extends org.luckypray.dexkit.wrap.ISerializable> p000.fo1 getCachedList$innerGet$10(org.luckypray.dexkit.DexKitCacheBridge.Cache r3, java.lang.String r4, boolean r5) {
            r0 = 0
            java.util.List r3 = r3.getStringList(r4, r0)
            if (r3 == 0) goto L52
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r1)
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
            if (r3 == 0) goto L4c
            if (r5 != 0) goto L4c
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r5 = "cached empty for key: "
            java.lang.String r0 = " but empty not allowed"
            java.lang.String r4 = p000.lz1.m3674(r5, r4, r0)
            r3.<init>(r4)
            eo1 r4 = new eo1
            r4.<init>(r3)
            fo1 r3 = new fo1
            r3.<init>(r4)
            return r3
        L4c:
            fo1 r3 = new fo1
            r3.<init>(r0)
            return r3
        L52:
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult getCachedMap$default(org.luckypray.dexkit.cache.CacheBridgeStore r7, org.luckypray.dexkit.DexKitCacheBridge.Cache r8, java.util.concurrent.locks.ReentrantReadWriteLock r9, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r10, java.lang.String r11, p000.p70 r12, p000.p70 r13, int r14, java.lang.Object r15) {
            r14 = r14 & 32
            if (r14 == 0) goto L5
            r13 = 0
        L5:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r7 = r0.getCachedMap(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static final <U extends org.luckypray.dexkit.wrap.ISerializable> java.util.Map<java.lang.String, java.util.List<U>> getCachedMap$innerGetMap(org.luckypray.dexkit.DexKitCacheBridge.Cache r9, java.lang.String r10) {
            org.luckypray.dexkit.cache.CacheBridgeKeys r0 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
            java.lang.String r0 = r0.mapGroupsKey(r10)
            r1 = 0
            java.util.List r0 = r9.getStringList(r0, r1)
            if (r0 != 0) goto Le
            goto L7b
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
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r2.add(r4)
            if (r5 != 0) goto L37
            goto L7b
        L37:
            org.luckypray.dexkit.cache.CacheBridgeKeys r5 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
            java.lang.String r5 = r5.mapGroupKey(r10, r4)
            java.util.List r5 = r9.getStringList(r5, r1)
            if (r5 != 0) goto L44
            goto L7b
        L44:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            r7 = 10
            int r7 = p000.AbstractC1021yh.m6889(r5, r7)     // Catch: java.lang.Throwable -> L69
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L69
        L53:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L69
            org.luckypray.dexkit.wrap.ISerializable$Companion r8 = org.luckypray.dexkit.wrap.ISerializable.Companion     // Catch: java.lang.Throwable -> L69
            org.luckypray.dexkit.wrap.ISerializable r7 = r8.deserializeAs(r7)     // Catch: java.lang.Throwable -> L69
            r6.add(r7)     // Catch: java.lang.Throwable -> L69
            goto L53
        L69:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
        L6f:
            java.lang.Throwable r5 = p000.fo1.m2190(r6)
            if (r5 != 0) goto L7b
            java.util.List r6 = (java.util.List) r6
            r3.put(r4, r6)
            goto L24
        L7b:
            return r1
        L7c:
            return r3
    }

    public static /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult getCachedSingle$default(org.luckypray.dexkit.cache.CacheBridgeStore r10, org.luckypray.dexkit.DexKitCacheBridge.Cache r11, java.util.concurrent.locks.ReentrantReadWriteLock r12, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r13, java.lang.String r14, org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r15, boolean r16, p000.p70 r17, p000.p70 r18, int r19, java.lang.Object r20) {
            r0 = r19
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L13
            r0 = 0
            r9 = r0
        L8:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            goto L16
        L13:
            r9 = r18
            goto L8
        L16:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r10 = r1.getCachedSingle(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
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

    private final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<T> parseSingleOutcome(java.lang.String r3) {
            r2 = this;
            java.lang.String r2 = "CACHE_NO_RESULT"
            boolean r2 = p000.ln0.m3626(r3, r2)
            r0 = 1
            r1 = 0
            if (r2 == 0) goto L10
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r2 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult
            r2.<init>(r1, r0, r1)
            return r2
        L10:
            java.lang.String r2 = "CACHE_NON_UNIQUE"
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L1e
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r2 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique
            r2.<init>(r1, r0, r1)
            return r2
        L1e:
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r2 = new org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r3 = r0.deserializeAs(r3)
            r3.getClass()
            r2.<init>(r3)
            return r2
    }

    /* JADX INFO: renamed from: resolveSingleOutcome-gIAlu-s, reason: not valid java name */
    private final <T extends org.luckypray.dexkit.wrap.ISerializable> java.lang.Object m7393resolveSingleOutcomegIAlus(org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome<? extends T> r3, org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r4) {
            r2 = this;
            boolean r2 = r3 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value
            if (r2 == 0) goto Lb
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r3 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value) r3
            org.luckypray.dexkit.wrap.ISerializable r2 = r3.getValue()
            return r2
        Lb:
            boolean r2 = r3 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult
            r0 = 2
            r1 = 1
            if (r2 == 0) goto L2d
            int[] r2 = org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$1
            int r4 = r4.ordinal()
            r2 = r2[r4]
            if (r2 == r1) goto L4d
            if (r2 != r0) goto L28
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NoResult r3 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult) r3
            org.luckypray.dexkit.exceptions.NoResultException r2 = r3.getException()
            eo1 r2 = p000.i81.m2661(r2)
            return r2
        L28:
            p000.C1080.m7272()
            r2 = 0
            return r2
        L2d:
            boolean r2 = r3 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique
            if (r2 == 0) goto L4f
            int[] r2 = org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$1
            int r4 = r4.ordinal()
            r2 = r2[r4]
            if (r2 == r1) goto L4d
            if (r2 != r0) goto L48
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$NonUnique r3 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique) r3
            org.luckypray.dexkit.exceptions.NonUniqueResultException r2 = r3.getException()
            eo1 r2 = p000.i81.m2661(r2)
            return r2
        L48:
            p000.C1080.m7272()
            r2 = 0
            return r2
        L4d:
            r2 = 0
            return r2
        L4f:
            p000.C1080.m7272()
            r2 = 0
            return r2
    }

    public final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<java.util.List<T>> getCachedList(org.luckypray.dexkit.DexKitCacheBridge.Cache r4, java.util.concurrent.locks.ReentrantReadWriteLock r5, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r6, java.lang.String r7, boolean r8, p000.p70 r9, p000.p70 r10) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r9.getClass()
            r9.invoke()
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r5.readLock()
            r3.lock()
            fo1 r9 = getCachedList$innerGet$10(r4, r7, r8)     // Catch: java.lang.Throwable -> L2c
            if (r9 == 0) goto L2f
            java.lang.Object r4 = r9.f4054     // Catch: java.lang.Throwable -> L2c
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r5 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L2c
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r6 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L2c
            r3.unlock()
            return r5
        L2c:
            r4 = move-exception
            goto L11b
        L2f:
            r3.unlock()
            if (r10 != 0) goto L4c
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r3 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "no found cache for key: "
            java.lang.String r6 = r6.concat(r7)
            r5.<init>(r6)
            eo1 r6 = new eo1
            r6.<init>(r5)
            r3.<init>(r4, r6)
            return r3
        L4c:
            java.lang.Object r3 = r10.invoke()     // Catch: java.lang.Throwable -> L53
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r3 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r3)
            r3 = r9
        L5a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r5.readLock()
            int r10 = r5.getWriteHoldCount()
            r0 = 0
            if (r10 != 0) goto L6a
            int r10 = r5.getReadHoldCount()
            goto L6b
        L6a:
            r10 = r0
        L6b:
            r1 = r0
        L6c:
            if (r1 >= r10) goto L74
            r9.unlock()
            int r1 = r1 + 1
            goto L6c
        L74:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()
            r5.lock()
            fo1 r1 = getCachedList$innerGet$10(r4, r7, r8)     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto L96
            java.lang.Object r3 = r1.f4054     // Catch: java.lang.Throwable -> Lca
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r4 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lca
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r6 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r6, r3)     // Catch: java.lang.Throwable -> Lca
        L8a:
            if (r0 >= r10) goto L92
            r9.lock()
            int r0 = r0 + 1
            goto L8a
        L92:
            r5.unlock()
            return r4
        L96:
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY     // Catch: java.lang.Throwable -> Lca
            java.lang.Throwable r2 = p000.fo1.m2190(r3)     // Catch: java.lang.Throwable -> Lca
            if (r2 != 0) goto Lf9
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lca
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lca
            if (r2 == 0) goto Lcc
            if (r8 != 0) goto Lcc
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lca
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r4.<init>()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = "query returned empty for key: "
            r4.append(r6)     // Catch: java.lang.Throwable -> Lca
            r4.append(r7)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = " but empty not allowed"
            r4.append(r6)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lca
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lca
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lca
            r3 = r4
            goto Lfe
        Lca:
            r3 = move-exception
            goto L10f
        Lcc:
            boolean r6 = r6.getCacheSuccess()     // Catch: java.lang.Throwable -> Lca
            if (r6 == 0) goto Lfe
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lca
            r8 = 10
            int r8 = p000.AbstractC1021yh.m6889(r3, r8)     // Catch: java.lang.Throwable -> Lca
            r6.<init>(r8)     // Catch: java.lang.Throwable -> Lca
            java.util.Iterator r8 = r3.iterator()     // Catch: java.lang.Throwable -> Lca
        Le1:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Lca
            if (r2 == 0) goto Lf5
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Lca
            org.luckypray.dexkit.wrap.ISerializable r2 = (org.luckypray.dexkit.wrap.ISerializable) r2     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = r2.serialize()     // Catch: java.lang.Throwable -> Lca
            r6.add(r2)     // Catch: java.lang.Throwable -> Lca
            goto Le1
        Lf5:
            r4.putStringList(r7, r6)     // Catch: java.lang.Throwable -> Lca
            goto Lfe
        Lf9:
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> Lca
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lca
        Lfe:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r4 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Lca
        L103:
            if (r0 >= r10) goto L10b
            r9.lock()
            int r0 = r0 + 1
            goto L103
        L10b:
            r5.unlock()
            return r4
        L10f:
            if (r0 >= r10) goto L117
            r9.lock()
            int r0 = r0 + 1
            goto L10f
        L117:
            r5.unlock()
            throw r3
        L11b:
            r3.unlock()
            throw r4
    }

    public final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<java.util.Map<java.lang.String, java.util.List<T>>> getCachedMap(org.luckypray.dexkit.DexKitCacheBridge.Cache r9, java.util.concurrent.locks.ReentrantReadWriteLock r10, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r11, java.lang.String r12, p000.p70 r13, p000.p70 r14) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r13.invoke()
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r10.readLock()
            r8.lock()
            java.util.Map r13 = getCachedMap$innerGetMap(r9, r12)     // Catch: java.lang.Throwable -> L2a
            if (r13 == 0) goto L2d
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r9 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L2a
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r10 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> L2a
            r9.<init>(r10, r13)     // Catch: java.lang.Throwable -> L2a
            r8.unlock()
            return r9
        L2a:
            r9 = move-exception
            goto L18a
        L2d:
            r8.unlock()
            if (r14 != 0) goto L4a
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r8 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r9 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "no found cache for key: "
            java.lang.String r11 = r11.concat(r12)
            r10.<init>(r11)
            eo1 r11 = new eo1
            r11.<init>(r10)
            r8.<init>(r9, r11)
            return r8
        L4a:
            java.lang.Object r8 = r14.invoke()     // Catch: java.lang.Throwable -> L51
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r8 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r8)
            r8 = r13
        L58:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r13 = r10.readLock()
            int r14 = r10.getWriteHoldCount()
            r0 = 0
            if (r14 != 0) goto L68
            int r14 = r10.getReadHoldCount()
            goto L69
        L68:
            r14 = r0
        L69:
            r1 = r0
        L6a:
            if (r1 >= r14) goto L72
            r13.unlock()
            int r1 = r1 + 1
            goto L6a
        L72:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r10 = r10.writeLock()
            r10.lock()
            java.util.Map r1 = getCachedMap$innerGetMap(r9, r12)     // Catch: java.lang.Throwable -> L141
            if (r1 == 0) goto L92
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r8 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L141
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r9 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> L141
            r8.<init>(r9, r1)     // Catch: java.lang.Throwable -> L141
        L86:
            if (r0 >= r14) goto L8e
            r13.lock()
            int r0 = r0 + 1
            goto L86
        L8e:
            r10.unlock()
            return r8
        L92:
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY     // Catch: java.lang.Throwable -> L141
            java.lang.Throwable r2 = p000.fo1.m2190(r8)     // Catch: java.lang.Throwable -> L141
            if (r2 != 0) goto L168
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L141
            org.luckypray.dexkit.cache.CacheBridgeKeys r2 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> L141
            java.lang.String r2 = r2.mapGroupsKey(r12)     // Catch: java.lang.Throwable -> L141
            r3 = 0
            java.util.List r2 = r9.getStringList(r2, r3)     // Catch: java.lang.Throwable -> L141
            if (r2 != 0) goto Lab
            jz r2 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L141
        Lab:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L141
            r3.<init>()     // Catch: java.lang.Throwable -> L141
            boolean r11 = r11.getCacheSuccess()     // Catch: java.lang.Throwable -> L141
            if (r11 == 0) goto L16d
            java.util.Set r11 = r8.entrySet()     // Catch: java.lang.Throwable -> L141
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L141
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L141
        Lc0:
            boolean r4 = r11.hasNext()     // Catch: java.lang.Throwable -> L141
            if (r4 == 0) goto L108
            java.lang.Object r4 = r11.next()     // Catch: java.lang.Throwable -> L141
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L141
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L141
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L141
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L141
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L141
            r3.add(r5)     // Catch: java.lang.Throwable -> L141
            org.luckypray.dexkit.cache.CacheBridgeKeys r6 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> L141
            java.lang.String r5 = r6.mapGroupKey(r12, r5)     // Catch: java.lang.Throwable -> L141
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L141
            r7 = 10
            int r7 = p000.AbstractC1021yh.m6889(r4, r7)     // Catch: java.lang.Throwable -> L141
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L141
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L141
        Lf0:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L141
            if (r7 == 0) goto L104
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L141
            org.luckypray.dexkit.wrap.ISerializable r7 = (org.luckypray.dexkit.wrap.ISerializable) r7     // Catch: java.lang.Throwable -> L141
            java.lang.String r7 = r7.serialize()     // Catch: java.lang.Throwable -> L141
            r6.add(r7)     // Catch: java.lang.Throwable -> L141
            goto Lf0
        L104:
            r9.putStringList(r5, r6)     // Catch: java.lang.Throwable -> L141
            goto Lc0
        L108:
            java.util.Set r11 = p000.AbstractC0984xh.m6671(r3)     // Catch: java.lang.Throwable -> L141
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L141
            boolean r4 = r11 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L141
            if (r4 == 0) goto L115
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.Throwable -> L141
            goto L119
        L115:
            java.util.List r11 = p000.AbstractC0984xh.m6666(r11)     // Catch: java.lang.Throwable -> L141
        L119:
            boolean r4 = r11.isEmpty()     // Catch: java.lang.Throwable -> L141
            if (r4 == 0) goto L124
            java.util.List r11 = p000.AbstractC0984xh.m6666(r2)     // Catch: java.lang.Throwable -> L141
            goto L144
        L124:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L141
            r4.<init>()     // Catch: java.lang.Throwable -> L141
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L141
        L12d:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L141
            if (r5 == 0) goto L143
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L141
            boolean r6 = r11.contains(r5)     // Catch: java.lang.Throwable -> L141
            if (r6 != 0) goto L12d
            r4.add(r5)     // Catch: java.lang.Throwable -> L141
            goto L12d
        L141:
            r8 = move-exception
            goto L17e
        L143:
            r11 = r4
        L144:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L141
        L148:
            boolean r2 = r11.hasNext()     // Catch: java.lang.Throwable -> L141
            if (r2 == 0) goto L15e
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Throwable -> L141
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L141
            org.luckypray.dexkit.cache.CacheBridgeKeys r4 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> L141
            java.lang.String r2 = r4.mapGroupKey(r12, r2)     // Catch: java.lang.Throwable -> L141
            r9.remove(r2)     // Catch: java.lang.Throwable -> L141
            goto L148
        L15e:
            org.luckypray.dexkit.cache.CacheBridgeKeys r11 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> L141
            java.lang.String r11 = r11.mapGroupsKey(r12)     // Catch: java.lang.Throwable -> L141
            r9.putStringList(r11, r3)     // Catch: java.lang.Throwable -> L141
            goto L16d
        L168:
            eo1 r8 = new eo1     // Catch: java.lang.Throwable -> L141
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L141
        L16d:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r9 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L141
            r9.<init>(r1, r8)     // Catch: java.lang.Throwable -> L141
        L172:
            if (r0 >= r14) goto L17a
            r13.lock()
            int r0 = r0 + 1
            goto L172
        L17a:
            r10.unlock()
            return r9
        L17e:
            if (r0 >= r14) goto L186
            r13.lock()
            int r0 = r0 + 1
            goto L17e
        L186:
            r10.unlock()
            throw r8
        L18a:
            r8.unlock()
            throw r9
    }

    public final <T extends org.luckypray.dexkit.wrap.ISerializable> org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<T> getCachedSingle(org.luckypray.dexkit.DexKitCacheBridge.Cache r4, java.util.concurrent.locks.ReentrantReadWriteLock r5, org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r6, java.lang.String r7, org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r8, boolean r9, p000.p70 r10, p000.p70 r11) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r10.getClass()
            r10.invoke()
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r5.readLock()
            r3.lock()
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r10 = getCachedSingle$innerGet(r4, r7)     // Catch: java.lang.Throwable -> L33
            if (r10 == 0) goto L36
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r4 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> L33
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> L33
            org.luckypray.dexkit.cache.CacheBridgeStore r6 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r6.m7393resolveSingleOutcomegIAlus(r10, r8)     // Catch: java.lang.Throwable -> L33
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L33
            r3.unlock()
            return r4
        L33:
            r4 = move-exception
            goto L105
        L36:
            r3.unlock()
            if (r11 != 0) goto L53
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r3 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "no found cache for key: "
            java.lang.String r6 = r6.concat(r7)
            r5.<init>(r6)
            eo1 r6 = new eo1
            r6.<init>(r5)
            r3.<init>(r4, r6)
            return r3
        L53:
            java.lang.Object r3 = r11.invoke()     // Catch: java.lang.Throwable -> L5a
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r3 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome) r3     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r3 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r3)
            r3 = r10
        L61:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r5.readLock()
            int r11 = r5.getWriteHoldCount()
            r0 = 0
            if (r11 != 0) goto L71
            int r11 = r5.getReadHoldCount()
            goto L72
        L71:
            r11 = r0
        L72:
            r1 = r0
        L73:
            if (r1 >= r11) goto L7b
            r10.unlock()
            int r1 = r1 + 1
            goto L73
        L7b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()
            r5.lock()
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r1 = getCachedSingle$innerGet(r4, r7)     // Catch: java.lang.Throwable -> Lf8
            if (r1 == 0) goto La1
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r3 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lf8
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE     // Catch: java.lang.Throwable -> Lf8
            org.luckypray.dexkit.cache.CacheBridgeStore r6 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object r6 = r6.m7393resolveSingleOutcomegIAlus(r1, r8)     // Catch: java.lang.Throwable -> Lf8
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> Lf8
        L95:
            if (r0 >= r11) goto L9d
            r10.lock()
            int r0 = r0 + 1
            goto L95
        L9d:
            r5.unlock()
            return r3
        La1:
            org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY     // Catch: java.lang.Throwable -> Lf8
            java.lang.Throwable r2 = p000.fo1.m2190(r3)     // Catch: java.lang.Throwable -> Lf8
            if (r2 != 0) goto Le2
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome r3 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome) r3     // Catch: java.lang.Throwable -> Lf8
            boolean r2 = r3 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value     // Catch: java.lang.Throwable -> Lf8
            if (r2 == 0) goto Lc4
            boolean r6 = r6.getCacheSuccess()     // Catch: java.lang.Throwable -> Lf8
            if (r6 == 0) goto Ldb
            r6 = r3
            org.luckypray.dexkit.cache.CacheBridgeStore$SingleOutcome$Value r6 = (org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.Value) r6     // Catch: java.lang.Throwable -> Lf8
            org.luckypray.dexkit.wrap.ISerializable r6 = r6.getValue()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r6 = r6.serialize()     // Catch: java.lang.Throwable -> Lf8
            r4.putString(r7, r6)     // Catch: java.lang.Throwable -> Lf8
            goto Ldb
        Lc4:
            boolean r6 = r3 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NoResult     // Catch: java.lang.Throwable -> Lf8
            if (r6 == 0) goto Ld0
            if (r9 == 0) goto Ldb
            java.lang.String r6 = "CACHE_NO_RESULT"
            r4.putString(r7, r6)     // Catch: java.lang.Throwable -> Lf8
            goto Ldb
        Ld0:
            boolean r6 = r3 instanceof org.luckypray.dexkit.cache.CacheBridgeStore.SingleOutcome.NonUnique     // Catch: java.lang.Throwable -> Lf8
            if (r6 == 0) goto Ldb
            if (r9 == 0) goto Ldb
            java.lang.String r6 = "CACHE_NON_UNIQUE"
            r4.putString(r7, r6)     // Catch: java.lang.Throwable -> Lf8
        Ldb:
            org.luckypray.dexkit.cache.CacheBridgeStore r4 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object r3 = r4.m7393resolveSingleOutcomegIAlus(r3, r8)     // Catch: java.lang.Throwable -> Lf8
            goto Le7
        Le2:
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> Lf8
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lf8
        Le7:
            org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r4 = new org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult     // Catch: java.lang.Throwable -> Lf8
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Lf8
        Lec:
            if (r0 >= r11) goto Lf4
            r10.lock()
            int r0 = r0 + 1
            goto Lec
        Lf4:
            r5.unlock()
            return r4
        Lf8:
            r3 = move-exception
        Lf9:
            if (r0 >= r11) goto L101
            r10.lock()
            int r0 = r0 + 1
            goto Lf9
        L101:
            r5.unlock()
            throw r3
        L105:
            r3.unlock()
            throw r4
    }

    public final boolean shouldCacheFailure(org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r2, boolean r3) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r1 = r2.getFailurePolicy()
            int[] r2 = org.luckypray.dexkit.cache.CacheBridgeStore.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L1f
            r0 = 2
            if (r1 == r0) goto L1e
            r3 = 3
            if (r1 != r3) goto L19
            return r2
        L19:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L1e:
            return r3
        L1f:
            r1 = 0
            return r1
    }
}
