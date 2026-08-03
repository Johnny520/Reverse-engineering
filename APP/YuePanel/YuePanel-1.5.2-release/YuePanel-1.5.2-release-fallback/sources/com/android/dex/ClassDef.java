package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class ClassDef {
    public static final int NO_INDEX = -1;
    private final int accessFlags;
    private final int annotationsOffset;
    private final com.android.dex.Dex buffer;
    private final int classDataOffset;
    private final int interfacesOffset;
    private final int offset;
    private final int sourceFileIndex;
    private final int staticValuesOffset;
    private final int supertypeIndex;
    private final int typeIndex;

    public ClassDef(com.android.dex.Dex r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            r0.offset = r2
            r0.typeIndex = r3
            r0.accessFlags = r4
            r0.supertypeIndex = r5
            r0.interfacesOffset = r6
            r0.sourceFileIndex = r7
            r0.annotationsOffset = r8
            r0.classDataOffset = r9
            r0.staticValuesOffset = r10
            return
    }

    public int getAccessFlags() {
            r1 = this;
            int r0 = r1.accessFlags
            return r0
    }

    public int getAnnotationsOffset() {
            r1 = this;
            int r0 = r1.annotationsOffset
            return r0
    }

    public int getClassDataOffset() {
            r1 = this;
            int r0 = r1.classDataOffset
            return r0
    }

    public short[] getInterfaces() {
            r2 = this;
            com.android.dex.Dex r0 = r2.buffer
            int r1 = r2.interfacesOffset
            com.android.dex.TypeList r0 = r0.readTypeList(r1)
            short[] r0 = r0.getTypes()
            return r0
    }

    public int getInterfacesOffset() {
            r1 = this;
            int r0 = r1.interfacesOffset
            return r0
    }

    public int getOffset() {
            r1 = this;
            int r0 = r1.offset
            return r0
    }

    public int getSourceFileIndex() {
            r1 = this;
            int r0 = r1.sourceFileIndex
            return r0
    }

    public int getStaticValuesOffset() {
            r1 = this;
            int r0 = r1.staticValuesOffset
            return r0
    }

    public int getSupertypeIndex() {
            r1 = this;
            int r0 = r1.supertypeIndex
            return r0
    }

    public int getTypeIndex() {
            r1 = this;
            int r0 = r1.typeIndex
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.android.dex.Dex r0 = r3.buffer
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.typeIndex
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r3.supertypeIndex
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dex.Dex r1 = r3.buffer
            java.util.List r1 = r1.typeNames()
            int r2 = r3.typeIndex
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            int r1 = r3.supertypeIndex
            r2 = -1
            if (r1 == r2) goto L4e
            java.lang.String r1 = " extends "
            r0.append(r1)
            com.android.dex.Dex r1 = r3.buffer
            java.util.List r1 = r1.typeNames()
            int r2 = r3.supertypeIndex
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L4e:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
