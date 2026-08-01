package p000;

/* JADX INFO: renamed from: tc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0830tc extends p000.AbstractC1100 {

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f10303;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object f10304;

    public C0830tc(int r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.f10303 = r0
            r1.<init>(r2, r0)
            r1.f10304 = r3
            return
    }

    public C0830tc(java.lang.Object[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f10303 = r0
            r1.<init>(r3, r4)
            r1.f10304 = r2
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f10303
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L14
            int r0 = r3.f13424
            int r0 = r0 + 1
            r3.f13424 = r0
            java.lang.Object r3 = r3.f10304
            goto L18
        L14:
            p000.C1080.m7277()
            r3 = 0
        L18:
            return r3
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.f10304
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r3.f13424
            int r2 = r1 + 1
            r3.f13424 = r2
            r3 = r0[r1]
            goto L30
        L2c:
            p000.C1080.m7277()
            r3 = 0
        L30:
            return r3
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            int r0 = r2.f10303
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L14
            int r0 = r2.f13424
            int r0 = r0 + (-1)
            r2.f13424 = r0
            java.lang.Object r2 = r2.f10304
            goto L18
        L14:
            p000.C1080.m7277()
            r2 = 0
        L18:
            return r2
        L19:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r2.f10304
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r2.f13424
            int r1 = r1 + (-1)
            r2.f13424 = r1
            r2 = r0[r1]
            goto L30
        L2c:
            p000.C1080.m7277()
            r2 = 0
        L30:
            return r2
    }
}
