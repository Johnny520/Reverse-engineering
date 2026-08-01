package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class LabelMap extends java.util.LinkedHashMap<java.lang.String, org.simpleframework.xml.core.Label> implements java.lang.Iterable<org.simpleframework.xml.core.Label> {
    private final org.simpleframework.xml.core.Policy policy;

    public LabelMap() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public LabelMap(org.simpleframework.xml.core.Policy r1) {
            r0 = this;
            r0.<init>()
            r0.policy = r1
            return
    }

    private java.lang.String[] getArray(java.util.Set<java.lang.String> r1) {
            r0 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.String[] getKeys() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r4.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            org.simpleframework.xml.core.Label r2 = (org.simpleframework.xml.core.Label) r2
            if (r2 == 0) goto L9
            java.lang.String r3 = r2.getPath()
            java.lang.String r2 = r2.getName()
            r0.add(r3)
            r0.add(r2)
            goto L9
        L26:
            java.lang.String[] r4 = r4.getArray(r0)
            return r4
    }

    public org.simpleframework.xml.core.Label getLabel(java.lang.String r1) {
            r0 = this;
            java.lang.Object r0 = r0.remove(r1)
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            return r0
    }

    public org.simpleframework.xml.core.LabelMap getLabels() {
            r3 = this;
            org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
            org.simpleframework.xml.core.Policy r1 = r3.policy
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            org.simpleframework.xml.core.Label r1 = (org.simpleframework.xml.core.Label) r1
            if (r1 == 0) goto Lb
            java.lang.String r2 = r1.getPath()
            r0.put(r2, r1)
            goto Lb
        L21:
            return r0
    }

    public java.lang.String[] getPaths() {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            org.simpleframework.xml.core.Label r2 = (org.simpleframework.xml.core.Label) r2
            if (r2 == 0) goto L9
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            goto L9
        L1f:
            java.lang.String[] r3 = r3.getArray(r0)
            return r3
    }

    public boolean isStrict(org.simpleframework.xml.core.Context r2) {
            r1 = this;
            org.simpleframework.xml.core.Policy r0 = r1.policy
            if (r0 != 0) goto L9
            boolean r1 = r2.isStrict()
            return r1
        L9:
            boolean r2 = r2.isStrict()
            if (r2 == 0) goto L19
            org.simpleframework.xml.core.Policy r1 = r1.policy
            boolean r1 = r1.isStrict()
            if (r1 == 0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.Label> iterator() {
            r0 = this;
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
