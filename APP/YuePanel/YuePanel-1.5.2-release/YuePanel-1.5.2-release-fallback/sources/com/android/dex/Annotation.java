package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class Annotation implements java.lang.Comparable<com.android.dex.Annotation> {
    private final com.android.dex.Dex dex;
    private final com.android.dex.EncodedValue encodedAnnotation;
    private final byte visibility;

    public Annotation(com.android.dex.Dex r1, byte r2, com.android.dex.EncodedValue r3) {
            r0 = this;
            r0.<init>()
            r0.dex = r1
            r0.visibility = r2
            r0.encodedAnnotation = r3
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dex.Annotation r2) {
            r1 = this;
            com.android.dex.EncodedValue r0 = r1.encodedAnnotation
            com.android.dex.EncodedValue r2 = r2.encodedAnnotation
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dex.Annotation r1) {
            r0 = this;
            com.android.dex.Annotation r1 = (com.android.dex.Annotation) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public com.android.dex.EncodedValueReader getReader() {
            r3 = this;
            com.android.dex.EncodedValueReader r0 = new com.android.dex.EncodedValueReader
            com.android.dex.EncodedValue r1 = r3.encodedAnnotation
            r2 = 29
            r0.<init>(r1, r2)
            return r0
    }

    public int getTypeIndex() {
            r1 = this;
            com.android.dex.EncodedValueReader r0 = r1.getReader()
            r0.readAnnotation()
            int r0 = r0.getAnnotationType()
            return r0
    }

    public byte getVisibility() {
            r1 = this;
            byte r0 = r1.visibility
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.android.dex.Dex r0 = r3.dex
            java.lang.String r1 = " "
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte r2 = r3.visibility
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.getTypeIndex()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L43
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte r2 = r3.visibility
            r0.append(r2)
            r0.append(r1)
            com.android.dex.Dex r1 = r3.dex
            java.util.List r1 = r1.typeNames()
            int r2 = r3.getTypeIndex()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L43:
            return r0
    }

    public void writeTo(com.android.dex.Dex.Section r2) {
            r1 = this;
            byte r0 = r1.visibility
            r2.writeByte(r0)
            com.android.dex.EncodedValue r0 = r1.encodedAnnotation
            r0.writeTo(r2)
            return
    }
}
