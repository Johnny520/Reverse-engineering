package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: OpCodesMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B+\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\u0003\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\"¢\u0006\u0002\u0010#J\u0014\u0010\u0003\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0019\u0010$\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"¢\u0006\u0002\u0010&J\u0014\u0010$\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0005R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R4\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006."}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "opCodes", "", "", "matchType", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "opCodeSize", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V", "", "([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V", "<set-?>", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)V", "getOpCodes", "()Ljava/util/Collection;", "setOpCodes", "(Ljava/util/Collection;)V", "rangeMatcher", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "size", "getSize", "()I", "setSize", "(I)V", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "", "([Ljava/lang/Integer;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opNames", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "min", "max", "range", "Lkotlin/ranges/IntRange;", "sizeMax", "sizeMin", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class OpCodesMatcher extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.enums.OpCodeMatchType matchType;
    private java.util.Collection<java.lang.Integer> opCodes;
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    /* JADX INFO: compiled from: OpCodesMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0007H\u0007J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J,\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J1\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0011J!\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0012J,\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\u0013"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opCodes", "", "", "matchType", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "opCodeSize", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "", "createForOpNames", "opNames", "", "", "([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.lang.String[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(java.util.Collection<java.lang.Integer> r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
                r1 = this;
                java.lang.String r0 = "opCodes"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r2, r3, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int... r8) {
                r7 = this;
                java.lang.String r0 = "opCodes"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                java.util.List r1 = kotlin.collections.ArraysKt.toList(r8)
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                r5 = 6
                r6 = 0
                r3 = 0
                r4 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int[] r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
                r1 = this;
                java.lang.String r0 = "opCodes"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r2, r3, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.util.Collection<java.lang.String> r10, org.luckypray.dexkit.query.enums.OpCodeMatchType r11, org.luckypray.dexkit.query.matchers.base.IntRange r12) {
                r9 = this;
                java.lang.String r0 = "opNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                r0 = r10
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 0
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
                r2.<init>(r3)
                java.util.Collection r2 = (java.util.Collection) r2
                r3 = r0
                r4 = 0
                java.util.Iterator r5 = r3.iterator()
            L21:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L3b
                java.lang.Object r6 = r5.next()
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                r8 = 0
                int r7 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r2.add(r7)
                goto L21
            L3b:
                java.util.List r2 = (java.util.List) r2
                java.util.Collection r2 = (java.util.Collection) r2
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r2, r11, r12)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String... r11) {
                r10 = this;
                java.lang.String r0 = "opNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                r0 = r11
                r1 = 0
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r0.length
                r2.<init>(r3)
                java.util.Collection r2 = (java.util.Collection) r2
                r3 = r0
                r4 = 0
                int r5 = r3.length
                r6 = 0
            L13:
                if (r6 >= r5) goto L28
                r7 = r3[r6]
                r8 = r7
                r9 = 0
                int r8 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r8)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r2.add(r8)
                int r6 = r6 + 1
                goto L13
            L28:
                java.util.List r2 = (java.util.List) r2
                r4 = r2
                java.util.Collection r4 = (java.util.Collection) r4
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String[] r11, org.luckypray.dexkit.query.enums.OpCodeMatchType r12, org.luckypray.dexkit.query.matchers.base.IntRange r13) {
                r10 = this;
                java.lang.String r0 = "opNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                r0 = r11
                r1 = 0
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r0.length
                r2.<init>(r3)
                java.util.Collection r2 = (java.util.Collection) r2
                r3 = r0
                r4 = 0
                int r5 = r3.length
                r6 = 0
            L18:
                if (r6 >= r5) goto L2d
                r7 = r3[r6]
                r8 = r7
                r9 = 0
                int r8 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r8)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r2.add(r8)
                int r6 = r6 + 1
                goto L18
            L2d:
                java.util.List r2 = (java.util.List) r2
                java.util.Collection r2 = (java.util.Collection) r2
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r2, r12, r13)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion = r0
            return
    }

    public OpCodesMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.matchType = r0
            return
    }

    public OpCodesMatcher(java.util.Collection<java.lang.Integer> r8) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public OpCodesMatcher(java.util.Collection<java.lang.Integer> r8, org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public OpCodesMatcher(java.util.Collection<java.lang.Integer> r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.matchType = r0
            r1.opCodes = r2
            r1.matchType = r3
            r1.rangeMatcher = r4
            return
    }

    public /* synthetic */ OpCodesMatcher(java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    public OpCodesMatcher(int[] r8) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public OpCodesMatcher(int[] r8, org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public OpCodesMatcher(int[] r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.matchType = r0
            java.util.List r0 = kotlin.collections.ArraysKt.toList(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            r1.opCodes = r0
            r1.matchType = r3
            r1.rangeMatcher = r4
            return
    }

    public /* synthetic */ OpCodesMatcher(int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(java.util.Collection<java.lang.Integer> r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int... r1) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.util.Collection<java.lang.String> r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String... r1) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(java.lang.String[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.size(r1, r2)
            return r0
    }

    public final org.luckypray.dexkit.query.enums.OpCodeMatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = r1.matchType
            return r0
    }

    public final java.util.Collection<java.lang.Integer> getOpCodes() {
            r1 = this;
            java.util.Collection<java.lang.Integer> r0 = r1.opCodes
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r1.rangeMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ int getSize() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r12) {
            r11 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r0 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion
            java.util.Collection<java.lang.Integer> r1 = r11.opCodes
            r2 = 0
            if (r1 == 0) goto L55
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r1
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L23:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3e
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10 = 0
            short r9 = (short) r9
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r4.add(r9)
            goto L23
        L3e:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            short[] r1 = kotlin.collections.CollectionsKt.toShortArray(r4)
            if (r1 == 0) goto L55
        L4d:
            r3 = 0
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r4 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion
            int r1 = r4.createOpCodesVector(r12, r1)
            goto L56
        L55:
            r1 = r2
        L56:
            org.luckypray.dexkit.query.enums.OpCodeMatchType r3 = r11.matchType
            byte r3 = r3.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r4 = r11.rangeMatcher
            if (r4 == 0) goto L66
            org.luckypray.dexkit.query.base.BaseQuery r4 = (org.luckypray.dexkit.query.base.BaseQuery) r4
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r4, r12)
        L66:
            int r0 = r0.createOpCodesMatcher(r12, r1, r3, r2)
            r12.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher matchType(org.luckypray.dexkit.query.enums.OpCodeMatchType r3) {
            r2 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            r2.matchType = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodes(java.util.Collection<java.lang.Integer> r3) {
            r2 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            r2.opCodes = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodes(java.lang.Integer[] r4) {
            r3 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.opCodes = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opNames(java.util.Collection<java.lang.String> r12) {
            r11 = this;
            java.lang.String r0 = "opNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r11
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            r2 = r12
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L20:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3a
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            int r9 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.add(r9)
            goto L20
        L3a:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            r11.opCodes = r4
            r0 = r11
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opNames(java.lang.String[] r13) {
            r12 = this;
            java.lang.String r0 = "opNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r12
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            r2 = r13
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.length
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            int r7 = r5.length
            r8 = 0
        L17:
            if (r8 >= r7) goto L2c
            r9 = r5[r8]
            r10 = r9
            r11 = 0
            int r10 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4.add(r10)
            int r8 = r8 + 1
            goto L17
        L2c:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            r12.opCodes = r4
            r0 = r12
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.OpCodeMatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.matchType = r2
            return
    }

    public final /* synthetic */ void setOpCodes(java.util.Collection r1) {
            r0 = this;
            r0.opCodes = r1
            return
    }

    public final /* synthetic */ void setSize(int r1) {
            r0 = this;
            r0.size(r1)
            return
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4, r5)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            r2 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            r2.rangeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher sizeMax(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 0
            r2.<init>(r3, r5)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher sizeMin(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r5, r3)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = (org.luckypray.dexkit.query.matchers.base.OpCodesMatcher) r0
            return r0
    }
}
