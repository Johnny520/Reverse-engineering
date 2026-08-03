package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class EncodedValue implements java.lang.Comparable<com.android.dex.EncodedValue> {
    private final byte[] data;

    public EncodedValue(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    public com.android.dex.util.ByteInput asByteInput() {
            r2 = this;
            com.android.dex.util.ByteArrayByteInput r0 = new com.android.dex.util.ByteArrayByteInput
            byte[] r1 = r2.data
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dex.EncodedValue r5) {
            r4 = this;
            byte[] r0 = r4.data
            int r0 = r0.length
            byte[] r1 = r5.data
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r0) goto L20
            byte[] r2 = r4.data
            r2 = r2[r1]
            byte[] r3 = r5.data
            r3 = r3[r1]
            if (r2 == r3) goto L1d
            r5 = r2 & 255(0xff, float:3.57E-43)
            r0 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r5 - r0
            return r5
        L1d:
            int r1 = r1 + 1
            goto Lb
        L20:
            byte[] r0 = r4.data
            int r0 = r0.length
            byte[] r5 = r5.data
            int r5 = r5.length
            int r0 = r0 - r5
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dex.EncodedValue r1) {
            r0 = this;
            com.android.dex.EncodedValue r1 = (com.android.dex.EncodedValue) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public byte[] getBytes() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r1 = r3.data
            r2 = 0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "...("
            r0.append(r1)
            byte[] r1 = r3.data
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(com.android.dex.Dex.Section r2) {
            r1 = this;
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }
}
