package com.android.dx.rop.annotation;

/* JADX INFO: loaded from: classes.dex */
public final class Annotations extends com.android.dx.util.MutabilityControl implements java.lang.Comparable<com.android.dx.rop.annotation.Annotations> {
    public static final com.android.dx.rop.annotation.Annotations EMPTY = null;
    private final java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> annotations;

    static {
            com.android.dx.rop.annotation.Annotations r0 = new com.android.dx.rop.annotation.Annotations
            r0.<init>()
            com.android.dx.rop.annotation.Annotations.EMPTY = r0
            r0.setImmutable()
            return
    }

    public Annotations() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.annotations = r0
            return
    }

    public static com.android.dx.rop.annotation.Annotations combine(com.android.dx.rop.annotation.Annotations r1, com.android.dx.rop.annotation.Annotation r2) {
            com.android.dx.rop.annotation.Annotations r0 = new com.android.dx.rop.annotation.Annotations
            r0.<init>()
            r0.addAll(r1)
            r0.add(r2)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.rop.annotation.Annotations combine(com.android.dx.rop.annotation.Annotations r1, com.android.dx.rop.annotation.Annotations r2) {
            com.android.dx.rop.annotation.Annotations r0 = new com.android.dx.rop.annotation.Annotations
            r0.<init>()
            r0.addAll(r1)
            r0.addAll(r2)
            r0.setImmutable()
            return r0
    }

    public void add(com.android.dx.rop.annotation.Annotation r4) {
            r3 = this;
            r3.throwIfImmutable()
            if (r4 == 0) goto L32
            com.android.dx.rop.cst.CstType r0 = r4.getType()
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r1 = r3.annotations
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L17
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r1 = r3.annotations
            r1.put(r0, r4)
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "duplicate type: "
            r1.append(r2)
            java.lang.String r0 = r0.toHuman()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L32:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "annotation == null"
            r4.<init>(r0)
            throw r4
    }

    public void addAll(com.android.dx.rop.annotation.Annotations r2) {
            r1 = this;
            r1.throwIfImmutable()
            if (r2 == 0) goto L20
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r2 = r2.annotations
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            com.android.dx.rop.annotation.Annotation r0 = (com.android.dx.rop.annotation.Annotation) r0
            r1.add(r0)
            goto Lf
        L1f:
            return
        L20:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "toAdd == null"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.rop.annotation.Annotations r4) {
            r3 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r0 = r3.annotations
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r4 = r4.annotations
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.android.dx.rop.annotation.Annotation r1 = (com.android.dx.rop.annotation.Annotation) r1
            java.lang.Object r2 = r4.next()
            com.android.dx.rop.annotation.Annotation r2 = (com.android.dx.rop.annotation.Annotation) r2
            int r1 = r1.compareTo2(r2)
            if (r1 == 0) goto L14
            return r1
        L33:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3b
            r4 = 1
            return r4
        L3b:
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L43
            r4 = -1
            return r4
        L43:
            r4 = 0
            return r4
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.annotation.Annotations r1) {
            r0 = this;
            com.android.dx.rop.annotation.Annotations r1 = (com.android.dx.rop.annotation.Annotations) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.rop.annotation.Annotations
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.android.dx.rop.annotation.Annotations r2 = (com.android.dx.rop.annotation.Annotations) r2
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r0 = r1.annotations
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r2 = r2.annotations
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.util.Collection<com.android.dx.rop.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r0 = r1.annotations
            java.util.Collection r0 = r0.values()
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r0 = r1.annotations
            int r0 = r0.hashCode()
            return r0
    }

    public int size() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r0 = r1.annotations
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "annotations{"
            r0.append(r1)
            java.util.TreeMap<com.android.dx.rop.cst.CstType, com.android.dx.rop.annotation.Annotation> r1 = r5.annotations
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r1.next()
            com.android.dx.rop.annotation.Annotation r3 = (com.android.dx.rop.annotation.Annotation) r3
            if (r2 == 0) goto L25
            r2 = 0
            goto L2a
        L25:
            java.lang.String r4 = ", "
            r0.append(r4)
        L2a:
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
            goto L15
        L32:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
