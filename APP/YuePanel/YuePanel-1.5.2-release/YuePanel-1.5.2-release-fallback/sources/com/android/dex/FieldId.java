package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class FieldId implements java.lang.Comparable<com.android.dex.FieldId> {
    private final int declaringClassIndex;
    private final com.android.dex.Dex dex;
    private final int nameIndex;
    private final int typeIndex;

    public FieldId(com.android.dex.Dex r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.dex = r1
            r0.declaringClassIndex = r2
            r0.typeIndex = r3
            r0.nameIndex = r4
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dex.FieldId r3) {
            r2 = this;
            int r0 = r2.declaringClassIndex
            int r1 = r3.declaringClassIndex
            if (r0 == r1) goto Lb
            int r3 = com.android.dex.util.Unsigned.compare(r0, r1)
            return r3
        Lb:
            int r0 = r2.nameIndex
            int r1 = r3.nameIndex
            if (r0 == r1) goto L16
            int r3 = com.android.dex.util.Unsigned.compare(r0, r1)
            return r3
        L16:
            int r0 = r2.typeIndex
            int r3 = r3.typeIndex
            int r3 = com.android.dex.util.Unsigned.compare(r0, r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dex.FieldId r1) {
            r0 = this;
            com.android.dex.FieldId r1 = (com.android.dex.FieldId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public int getDeclaringClassIndex() {
            r1 = this;
            int r0 = r1.declaringClassIndex
            return r0
    }

    public int getNameIndex() {
            r1 = this;
            int r0 = r1.nameIndex
            return r0
    }

    public int getTypeIndex() {
            r1 = this;
            int r0 = r1.typeIndex
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.android.dex.Dex r0 = r3.dex
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.declaringClassIndex
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r2 = r3.typeIndex
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.nameIndex
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dex.Dex r1 = r3.dex
            java.util.List r1 = r1.typeNames()
            int r2 = r3.typeIndex
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            com.android.dex.Dex r1 = r3.dex
            java.util.List r1 = r1.strings()
            int r2 = r3.nameIndex
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(com.android.dex.Dex.Section r2) {
            r1 = this;
            int r0 = r1.declaringClassIndex
            r2.writeUnsignedShort(r0)
            int r0 = r1.typeIndex
            r2.writeUnsignedShort(r0)
            int r0 = r1.nameIndex
            r2.writeInt(r0)
            return
    }
}
