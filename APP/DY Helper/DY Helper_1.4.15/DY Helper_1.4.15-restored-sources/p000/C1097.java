package p000;

/* JADX INFO: renamed from: υ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1097 extends p000.C1096 implements java.util.ListIterator {

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.AbstractC1099 f13420;

    public C1097(p000.AbstractC1099 r2, int r3) {
            r1 = this;
            r1.f13420 = r2
            r1.<init>(r2)
            int r2 = r2.mo2340()
            if (r3 < 0) goto L10
            if (r3 > r2) goto L10
            r1.f13418 = r3
            return
        L10:
            java.lang.String r1 = "index: "
            java.lang.String r0 = ", size: "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r3, r2, r1, r0)
            p000.C1080.m7269(r1)
            r1 = 0
            throw r1
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            int r0 = r0.f13418
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            int r0 = r0.f13418
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L13
            int r0 = r1.f13418
            int r0 = r0 + (-1)
            r1.f13418 = r0
            χ r1 = r1.f13420
            java.lang.Object r1 = r1.get(r0)
            return r1
        L13:
            p000.C1080.m7277()
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            int r0 = r0.f13418
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
