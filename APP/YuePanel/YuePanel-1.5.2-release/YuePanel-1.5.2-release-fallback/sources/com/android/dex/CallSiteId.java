package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public class CallSiteId implements java.lang.Comparable<com.android.dex.CallSiteId> {
    private final com.android.dex.Dex dex;
    private final int offset;

    public CallSiteId(com.android.dex.Dex r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.dex = r1
            r0.offset = r2
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dex.CallSiteId r2) {
            r1 = this;
            int r0 = r1.offset
            int r2 = r2.offset
            int r2 = com.android.dex.util.Unsigned.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dex.CallSiteId r1) {
            r0 = this;
            com.android.dex.CallSiteId r1 = (com.android.dex.CallSiteId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public int getCallSiteOffset() {
            r1 = this;
            int r0 = r1.offset
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            com.android.dex.Dex r0 = r2.dex
            if (r0 != 0) goto Lb
            int r0 = r2.offset
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lb:
            java.util.List r0 = r0.protoIds()
            int r1 = r2.offset
            java.lang.Object r0 = r0.get(r1)
            com.android.dex.ProtoId r0 = (com.android.dex.ProtoId) r0
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(com.android.dex.Dex.Section r2) {
            r1 = this;
            int r0 = r1.offset
            r2.writeInt(r0)
            return
    }
}
