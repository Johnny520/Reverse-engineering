package p000;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0612o6 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final p000.a80 f7961;

    public C0612o6(p000.a80 r1) {
            r0 = this;
            r0.<init>()
            r0.f7961 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof p000.C0612o6
            if (r0 != 0) goto L8
            goto L10
        L8:
            o6 r2 = (p000.C0612o6) r2
            a80 r1 = r1.f7961
            a80 r2 = r2.f7961
            if (r1 == r2) goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            a80 r1 = r1.f7961
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r1 = this;
            rp r0 = new rp
            r0.<init>()
            a80 r1 = r1.f7961
            r0.f9430 = r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r1) {
            r0 = this;
            rp r1 = (p000.C0769rp) r1
            r1.getClass()
            a80 r0 = r0.f7961
            r1.f9430 = r0
            return
    }
}
