package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ModelList extends java.util.ArrayList<org.simpleframework.xml.core.Model> {
    public ModelList() {
            r0 = this;
            r0.<init>()
            return
    }

    public org.simpleframework.xml.core.ModelList build() {
            r2 = this;
            org.simpleframework.xml.core.ModelList r0 = new org.simpleframework.xml.core.ModelList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            org.simpleframework.xml.core.Model r1 = (org.simpleframework.xml.core.Model) r1
            r0.register(r1)
            goto L9
        L19:
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.next()
            org.simpleframework.xml.core.Model r0 = (org.simpleframework.xml.core.Model) r0
            if (r0 == 0) goto L4
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    public org.simpleframework.xml.core.Model lookup(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 > r0) goto Lf
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            org.simpleframework.xml.core.Model r1 = (org.simpleframework.xml.core.Model) r1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public void register(org.simpleframework.xml.core.Model r5) {
            r4 = this;
            int r0 = r5.getIndex()
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r0) goto L1b
            if (r2 < r1) goto L11
            r3 = 0
            r4.add(r3)
        L11:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L18
            r4.set(r3, r5)
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            return
    }

    public org.simpleframework.xml.core.Model take() {
            r2 = this;
        L0:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L14
            r0 = 0
            java.lang.Object r0 = r2.remove(r0)
            org.simpleframework.xml.core.Model r0 = (org.simpleframework.xml.core.Model) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L0
            return r0
        L14:
            r2 = 0
            return r2
    }
}
