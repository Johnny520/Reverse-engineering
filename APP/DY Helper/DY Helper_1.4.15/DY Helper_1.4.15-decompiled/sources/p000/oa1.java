package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends p000.AbstractC1111 implements java.util.Set, java.util.Collection, p000.lo0 {

    /* JADX INFO: renamed from: θ */
    public static final p000.oa1 f8011 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f8012;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f8013;

    /* JADX INFO: renamed from: η */
    public final p000.ga1 f8014;

    static {
            oa1 r0 = new oa1
            x r1 = p000.C0966x.f11929
            ga1 r2 = p000.ga1.f4296
            r0.<init>(r1, r1, r2)
            p000.oa1.f8011 = r0
            return
    }

    public oa1(java.lang.Object r1, java.lang.Object r2, p000.ga1 r3) {
            r0 = this;
            r0.<init>()
            r0.f8012 = r1
            r0.f8013 = r2
            r0.f8014 = r3
            return
    }

    @Override // p000.AbstractC1089, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            ga1 r0 = r0.f8014
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            f90 r0 = new f90
            java.lang.Object r1 = r2.f8012
            ga1 r2 = r2.f8014
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r0 = this;
            ga1 r0 = r0.f8014
            int r0 = r0.f4298
            return r0
    }
}
