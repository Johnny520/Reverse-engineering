package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class ProtoId implements java.lang.Comparable<com.android.dex.ProtoId> {
    private final com.android.dex.Dex dex;
    private final int parametersOffset;
    private final int returnTypeIndex;
    private final int shortyIndex;

    public ProtoId(com.android.dex.Dex r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.dex = r1
            r0.shortyIndex = r2
            r0.returnTypeIndex = r3
            r0.parametersOffset = r4
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dex.ProtoId r3) {
            r2 = this;
            int r0 = r2.returnTypeIndex
            int r1 = r3.returnTypeIndex
            if (r0 == r1) goto Lb
            int r3 = com.android.dex.util.Unsigned.compare(r0, r1)
            return r3
        Lb:
            int r0 = r2.parametersOffset
            int r3 = r3.parametersOffset
            int r3 = com.android.dex.util.Unsigned.compare(r0, r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dex.ProtoId r1) {
            r0 = this;
            com.android.dex.ProtoId r1 = (com.android.dex.ProtoId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public int getParametersOffset() {
            r1 = this;
            int r0 = r1.parametersOffset
            return r0
    }

    public int getReturnTypeIndex() {
            r1 = this;
            int r0 = r1.returnTypeIndex
            return r0
    }

    public int getShortyIndex() {
            r1 = this;
            int r0 = r1.shortyIndex
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            com.android.dex.Dex r0 = r4.dex
            java.lang.String r1 = " "
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r4.shortyIndex
            r0.append(r2)
            r0.append(r1)
            int r2 = r4.returnTypeIndex
            r0.append(r2)
            r0.append(r1)
            int r1 = r4.parametersOffset
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dex.Dex r2 = r4.dex
            java.util.List r2 = r2.strings()
            int r3 = r4.shortyIndex
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            com.android.dex.Dex r2 = r4.dex
            java.util.List r2 = r2.typeNames()
            int r3 = r4.returnTypeIndex
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            r0.append(r1)
            com.android.dex.Dex r1 = r4.dex
            int r2 = r4.parametersOffset
            com.android.dex.TypeList r1 = r1.readTypeList(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(com.android.dex.Dex.Section r2) {
            r1 = this;
            int r0 = r1.shortyIndex
            r2.writeInt(r0)
            int r0 = r1.returnTypeIndex
            r2.writeInt(r0)
            int r0 = r1.parametersOffset
            r2.writeInt(r0)
            return
    }
}
