package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: UsingFieldData.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m115d2 = {"Lorg/luckypray/dexkit/result/UsingFieldData;", "", "field", "Lorg/luckypray/dexkit/result/FieldData;", "usingType", "Lorg/luckypray/dexkit/result/FieldUsingType;", "(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)V", "getField", "()Lorg/luckypray/dexkit/result/FieldData;", "getUsingType", "()Lorg/luckypray/dexkit/result/FieldUsingType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "-Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class UsingFieldData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.UsingFieldData.Companion f432Companion = null;
    private final org.luckypray.dexkit.result.FieldData field;
    private final org.luckypray.dexkit.result.FieldUsingType usingType;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.UsingFieldData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: UsingFieldData.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m115d2 = {"Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/UsingFieldData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "usingFieldMeta", "Lorg/luckypray/dexkit/schema/-UsingFieldMeta;", "Lorg/luckypray/dexkit/InnerUsingFieldMeta;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public final org.luckypray.dexkit.result.UsingFieldData from(org.luckypray.dexkit.DexKitBridge r6, org.luckypray.dexkit.schema.UsingFieldMeta r7) {
                r5 = this;
                java.lang.String r0 = "bridge"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "usingFieldMeta"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                org.luckypray.dexkit.result.FieldData$-Companion r0 = org.luckypray.dexkit.result.FieldData.f430Companion
                org.luckypray.dexkit.schema.-FieldMeta r1 = r7.getField()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                org.luckypray.dexkit.result.FieldData r0 = r0.from(r6, r1)
                byte r1 = r7.getUsingType()
                r2 = 1
                if (r1 != r2) goto L21
                org.luckypray.dexkit.result.FieldUsingType r1 = org.luckypray.dexkit.result.FieldUsingType.Read
                goto L26
            L21:
                r2 = 2
                if (r1 != r2) goto L2d
                org.luckypray.dexkit.result.FieldUsingType r1 = org.luckypray.dexkit.result.FieldUsingType.Write
            L26:
                org.luckypray.dexkit.result.UsingFieldData r2 = new org.luckypray.dexkit.result.UsingFieldData
                r2.<init>(r0, r1)
                return r2
            L2d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                byte r2 = r7.getUsingType()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unknown using type: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            org.luckypray.dexkit.result.UsingFieldData$-Companion r0 = new org.luckypray.dexkit.result.UsingFieldData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.UsingFieldData.f432Companion = r0
            return
    }

    public UsingFieldData(org.luckypray.dexkit.result.FieldData r2, org.luckypray.dexkit.result.FieldUsingType r3) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "usingType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
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

    public final org.luckypray.dexkit.result.FieldData component1() {
            r1 = this;
            org.luckypray.dexkit.result.FieldData r0 = r1.field
            return r0
    }

    public final org.luckypray.dexkit.result.FieldUsingType component2() {
            r1 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = r1.usingType
            return r0
    }

    public final org.luckypray.dexkit.result.UsingFieldData copy(org.luckypray.dexkit.result.FieldData r2, org.luckypray.dexkit.result.FieldUsingType r3) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "usingType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.luckypray.dexkit.result.UsingFieldData r0 = new org.luckypray.dexkit.result.UsingFieldData
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof org.luckypray.dexkit.result.UsingFieldData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            org.luckypray.dexkit.result.UsingFieldData r1 = (org.luckypray.dexkit.result.UsingFieldData) r1
            org.luckypray.dexkit.result.FieldData r3 = r5.field
            org.luckypray.dexkit.result.FieldData r4 = r1.field
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            org.luckypray.dexkit.result.FieldUsingType r3 = r5.usingType
            org.luckypray.dexkit.result.FieldUsingType r1 = r1.usingType
            if (r3 == r1) goto L1f
            return r2
        L1f:
            return r0
    }

    public final org.luckypray.dexkit.result.FieldData getField() {
            r1 = this;
            org.luckypray.dexkit.result.FieldData r0 = r1.field
            return r0
    }

    public final org.luckypray.dexkit.result.FieldUsingType getUsingType() {
            r1 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = r1.usingType
            return r0
    }

    public int hashCode() {
            r3 = this;
            org.luckypray.dexkit.result.FieldData r0 = r3.field
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            org.luckypray.dexkit.result.FieldUsingType r2 = r3.usingType
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            org.luckypray.dexkit.result.FieldData r0 = r4.field
            org.luckypray.dexkit.result.FieldUsingType r1 = r4.usingType
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UsingFieldData(field="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ", usingType="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
