package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.UsingFieldData.Companion f13535Companion = null;
    private final org.luckypray.dexkit.result.FieldData field;
    private final org.luckypray.dexkit.result.FieldUsingType usingType;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.UsingFieldData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.result.UsingFieldData from(org.luckypray.dexkit.DexKitBridge r2, org.luckypray.dexkit.schema.UsingFieldMeta r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.result.FieldData$-Companion r1 = org.luckypray.dexkit.result.FieldData.f13533Companion
                org.luckypray.dexkit.schema.-FieldMeta r0 = r3.getField()
                r0.getClass()
                org.luckypray.dexkit.result.FieldData r1 = r1.from(r2, r0)
                byte r2 = r3.getUsingType()
                r0 = 1
                if (r2 != r0) goto L1d
                org.luckypray.dexkit.result.FieldUsingType r2 = org.luckypray.dexkit.result.FieldUsingType.Read
                goto L22
            L1d:
                r0 = 2
                if (r2 != r0) goto L28
                org.luckypray.dexkit.result.FieldUsingType r2 = org.luckypray.dexkit.result.FieldUsingType.Write
            L22:
                org.luckypray.dexkit.result.UsingFieldData r3 = new org.luckypray.dexkit.result.UsingFieldData
                r3.<init>(r1, r2)
                return r3
            L28:
                byte r1 = r3.getUsingType()
                java.lang.String r2 = "Unknown using type: "
                java.lang.String r1 = p000.a12.m17(r2, r1)
                p000.C1080.m7275(r1)
                r1 = 0
                return r1
        }
    }

    static {
            org.luckypray.dexkit.result.UsingFieldData$-Companion r0 = new org.luckypray.dexkit.result.UsingFieldData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.UsingFieldData.f13535Companion = r0
            return
    }

    public UsingFieldData(org.luckypray.dexkit.result.FieldData r1, org.luckypray.dexkit.result.FieldUsingType r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.field = r1
            r0.usingType = r2
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
            r0 = this;
            org.luckypray.dexkit.result.FieldData r0 = r0.field
            return r0
    }

    public final org.luckypray.dexkit.result.FieldUsingType component2() {
            r0 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = r0.usingType
            return r0
    }

    public final org.luckypray.dexkit.result.UsingFieldData copy(org.luckypray.dexkit.result.FieldData r1, org.luckypray.dexkit.result.FieldUsingType r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            org.luckypray.dexkit.result.UsingFieldData r0 = new org.luckypray.dexkit.result.UsingFieldData
            r0.<init>(r1, r2)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
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
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            org.luckypray.dexkit.result.FieldUsingType r4 = r4.usingType
            org.luckypray.dexkit.result.FieldUsingType r5 = r5.usingType
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final org.luckypray.dexkit.result.FieldData getField() {
            r0 = this;
            org.luckypray.dexkit.result.FieldData r0 = r0.field
            return r0
    }

    public final org.luckypray.dexkit.result.FieldUsingType getUsingType() {
            r0 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = r0.usingType
            return r0
    }

    public int hashCode() {
            r1 = this;
            org.luckypray.dexkit.result.FieldData r0 = r1.field
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.luckypray.dexkit.result.FieldUsingType r1 = r1.usingType
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            org.luckypray.dexkit.result.FieldData r0 = r3.field
            org.luckypray.dexkit.result.FieldUsingType r3 = r3.usingType
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "UsingFieldData(field="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", usingType="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
