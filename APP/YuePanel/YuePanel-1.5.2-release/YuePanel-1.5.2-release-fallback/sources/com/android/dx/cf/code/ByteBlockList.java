package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class ByteBlockList extends com.android.dx.util.LabeledList {
    public ByteBlockList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.android.dx.cf.code.ByteBlock get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.code.ByteBlock r1 = (com.android.dx.cf.code.ByteBlock) r1
            return r1
    }

    public com.android.dx.cf.code.ByteBlock labelToBlock(int r4) {
            r3 = this;
            int r0 = r3.indexOfLabel(r4)
            if (r0 < 0) goto Lb
            com.android.dx.cf.code.ByteBlock r4 = r3.get(r0)
            return r4
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such label: "
            r1.append(r2)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void set(int r1, com.android.dx.cf.code.ByteBlock r2) {
            r0 = this;
            super.set(r1, r2)
            return
    }
}
