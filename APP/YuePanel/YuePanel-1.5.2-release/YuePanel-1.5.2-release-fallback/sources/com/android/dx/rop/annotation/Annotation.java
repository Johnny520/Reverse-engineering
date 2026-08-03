package com.android.dx.rop.annotation;

/* JADX INFO: loaded from: classes.dex */
public final class Annotation extends com.android.dx.util.MutabilityControl implements java.lang.Comparable<com.android.dx.rop.annotation.Annotation>, com.android.dx.util.ToHuman {
    private final java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> elements;
    private final com.android.dx.rop.cst.CstType type;
    private final com.android.dx.rop.annotation.AnnotationVisibility visibility;

    public Annotation(com.android.dx.rop.cst.CstType r1, com.android.dx.rop.annotation.AnnotationVisibility r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L1b
            if (r2 == 0) goto L13
            r0.type = r1
            r0.visibility = r2
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r0.elements = r1
            return
        L13:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "visibility == null"
            r1.<init>(r2)
            throw r1
        L1b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "type == null"
            r1.<init>(r2)
            throw r1
    }

    public void add(com.android.dx.rop.annotation.NameValuePair r4) {
            r3 = this;
            r3.throwIfImmutable()
            if (r4 == 0) goto L2e
            com.android.dx.rop.cst.CstString r0 = r4.getName()
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r1 = r3.elements
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L17
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r1 = r3.elements
            r1.put(r0, r4)
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "name already added: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L2e:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "pair == null"
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.rop.annotation.Annotation r4) {
            r3 = this;
            com.android.dx.rop.cst.CstType r0 = r3.type
            com.android.dx.rop.cst.CstType r1 = r4.type
            int r0 = r0.compareTo2(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.android.dx.rop.annotation.AnnotationVisibility r0 = r3.visibility
            com.android.dx.rop.annotation.AnnotationVisibility r1 = r4.visibility
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L16
            return r0
        L16:
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r0 = r3.elements
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r4 = r4.elements
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            com.android.dx.rop.annotation.NameValuePair r1 = (com.android.dx.rop.annotation.NameValuePair) r1
            java.lang.Object r2 = r4.next()
            com.android.dx.rop.annotation.NameValuePair r2 = (com.android.dx.rop.annotation.NameValuePair) r2
            int r1 = r1.compareTo2(r2)
            if (r1 == 0) goto L2a
            return r1
        L49:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L51
            r4 = 1
            return r4
        L51:
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L59
            r4 = -1
            return r4
        L59:
            r4 = 0
            return r4
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.annotation.Annotation r1) {
            r0 = this;
            com.android.dx.rop.annotation.Annotation r1 = (com.android.dx.rop.annotation.Annotation) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.android.dx.rop.annotation.Annotation
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.annotation.Annotation r4 = (com.android.dx.rop.annotation.Annotation) r4
            com.android.dx.rop.cst.CstType r0 = r3.type
            com.android.dx.rop.cst.CstType r2 = r4.type
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L22
            com.android.dx.rop.annotation.AnnotationVisibility r0 = r3.visibility
            com.android.dx.rop.annotation.AnnotationVisibility r2 = r4.visibility
            if (r0 == r2) goto L19
            goto L22
        L19:
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r0 = r3.elements
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r4 = r4.elements
            boolean r4 = r0.equals(r4)
            return r4
        L22:
            return r1
    }

    public java.util.Collection<com.android.dx.rop.annotation.NameValuePair> getNameValuePairs() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r0 = r1.elements
            java.util.Collection r0 = r0.values()
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    public com.android.dx.rop.cst.CstType getType() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.type
            return r0
    }

    public com.android.dx.rop.annotation.AnnotationVisibility getVisibility() {
            r1 = this;
            com.android.dx.rop.annotation.AnnotationVisibility r0 = r1.visibility
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.android.dx.rop.cst.CstType r0 = r2.type
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r1 = r2.elements
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.android.dx.rop.annotation.AnnotationVisibility r1 = r2.visibility
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public void put(com.android.dx.rop.annotation.NameValuePair r3) {
            r2 = this;
            r2.throwIfImmutable()
            if (r3 == 0) goto Lf
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r0 = r2.elements
            com.android.dx.rop.cst.CstString r1 = r3.getName()
            r0.put(r1, r3)
            return
        Lf:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "pair == null"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.annotation.AnnotationVisibility r1 = r5.visibility
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = "-annotation "
            r0.append(r1)
            com.android.dx.rop.cst.CstType r1 = r5.type
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.rop.annotation.NameValuePair> r1 = r5.elements
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L2c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r1.next()
            com.android.dx.rop.annotation.NameValuePair r3 = (com.android.dx.rop.annotation.NameValuePair) r3
            if (r2 == 0) goto L3c
            r2 = 0
            goto L41
        L3c:
            java.lang.String r4 = ", "
            r0.append(r4)
        L41:
            com.android.dx.rop.cst.CstString r4 = r3.getName()
            java.lang.String r4 = r4.toHuman()
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            com.android.dx.rop.cst.Constant r3 = r3.getValue()
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
            goto L2c
        L5d:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toHuman()
            return r0
    }
}
