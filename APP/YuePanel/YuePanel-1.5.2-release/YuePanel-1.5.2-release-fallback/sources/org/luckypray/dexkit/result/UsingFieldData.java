package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lorg/luckypray/dexkit/result/UsingFieldData;", "", "field", "Lorg/luckypray/dexkit/result/FieldData;", "usingType", "Lorg/luckypray/dexkit/result/FieldUsingType;", "(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)V", "getField", "()Lorg/luckypray/dexkit/result/FieldData;", "getUsingType", "()Lorg/luckypray/dexkit/result/FieldUsingType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UsingFieldData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.result.UsingFieldData.Companion f30808Companion = null;

    @Yue.InterfaceC4418
    private final org.luckypray.dexkit.result.FieldData field;

    @Yue.InterfaceC4418
    private final org.luckypray.dexkit.result.FieldUsingType usingType;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.UsingFieldData$-Companion, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/UsingFieldData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "usingFieldMeta", "Lorg/luckypray/dexkit/schema/-UsingFieldMeta;", "Lorg/luckypray/dexkit/InnerUsingFieldMeta;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.result.UsingFieldData from(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.UsingFieldMeta r4) {
                r2 = this;
                java.lang.String r0 = "bridge"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "usingFieldMeta"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.result.FieldData$-Companion r0 = org.luckypray.dexkit.result.FieldData.f30806Companion
                org.luckypray.dexkit.schema.-FieldMeta r1 = r4.getField()
                Yue.C3329.m13903(r1)
                org.luckypray.dexkit.result.FieldData r3 = r0.from(r3, r1)
                byte r0 = r4.getUsingType()
                r1 = 1
                if (r0 != r1) goto L21
                org.luckypray.dexkit.result.FieldUsingType r4 = org.luckypray.dexkit.result.FieldUsingType.Read
                goto L26
            L21:
                r1 = 2
                if (r0 != r1) goto L2c
                org.luckypray.dexkit.result.FieldUsingType r4 = org.luckypray.dexkit.result.FieldUsingType.Write
            L26:
                org.luckypray.dexkit.result.UsingFieldData r0 = new org.luckypray.dexkit.result.UsingFieldData
                r0.<init>(r3, r4)
                return r0
            L2c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                byte r4 = r4.getUsingType()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown using type: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
        }
    }

    static {
            org.luckypray.dexkit.result.UsingFieldData$-Companion r0 = new org.luckypray.dexkit.result.UsingFieldData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.UsingFieldData.f30808Companion = r0
            return
    }

    public UsingFieldData(@Yue.InterfaceC4418 org.luckypray.dexkit.result.FieldData r2, @Yue.InterfaceC4418 org.luckypray.dexkit.result.FieldUsingType r3) {
            r1 = this;
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "usingType"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.field = r2
            r1.usingType = r3
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.result.UsingFieldData copy$default(org.luckypray.dexkit.result.UsingFieldData r0, org.luckypray.dexkit.result.FieldData r1, org.luckypray.dexkit.result.FieldUsingType r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            org.luckypray.dexkit.result.FieldData r1 = r0.field
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            org.luckypray.dexkit.result.FieldUsingType r2 = r0.usingType
        Lc:
            org.luckypray.dexkit.result.UsingFieldData r0 = r0.copy(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.FieldData component1() {
            r1 = this;
            org.luckypray.dexkit.result.FieldData r0 = r1.field
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.FieldUsingType component2() {
            r1 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = r1.usingType
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.UsingFieldData copy(@Yue.InterfaceC4418 org.luckypray.dexkit.result.FieldData r2, @Yue.InterfaceC4418 org.luckypray.dexkit.result.FieldUsingType r3) {
            r1 = this;
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "usingType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.result.UsingFieldData r0 = new org.luckypray.dexkit.result.UsingFieldData
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.luckypray.dexkit.result.UsingFieldData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            org.luckypray.dexkit.result.UsingFieldData r5 = (org.luckypray.dexkit.result.UsingFieldData) r5
            org.luckypray.dexkit.result.FieldData r1 = r4.field
            org.luckypray.dexkit.result.FieldData r3 = r5.field
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            org.luckypray.dexkit.result.FieldUsingType r1 = r4.usingType
            org.luckypray.dexkit.result.FieldUsingType r5 = r5.usingType
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.FieldData getField() {
            r1 = this;
            org.luckypray.dexkit.result.FieldData r0 = r1.field
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.FieldUsingType getUsingType() {
            r1 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = r1.usingType
            return r0
    }

    public int hashCode() {
            r2 = this;
            org.luckypray.dexkit.result.FieldData r0 = r2.field
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.luckypray.dexkit.result.FieldUsingType r1 = r2.usingType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r4 = this;
            org.luckypray.dexkit.result.FieldData r0 = r4.field
            org.luckypray.dexkit.result.FieldUsingType r1 = r4.usingType
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UsingFieldData(field="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", usingType="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
