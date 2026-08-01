package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m51 extends p000.o61 {

    /* JADX INFO: renamed from: γ */
    public static final p000.m51 f6941 = null;

    static {
            m51 r0 = new m51
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            p000.m51.f6941 = r0
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: α */
    public final void mo45(p000.f81 r2, p000.InterfaceC0676p6 r3, p000.rw1 r4, p000.en1 r5, p000.r71 r6) {
            r1 = this;
            r1 = 0
            java.lang.Object r4 = r2.m2056(r1)
            zm0 r4 = (p000.zm0) r4
            int r4 = r4.f13169
            r5 = 1
            java.lang.Object r2 = r2.m2056(r5)
            java.util.List r2 = (java.util.List) r2
            int r5 = r2.size()
        L14:
            if (r1 >= r5) goto L25
            java.lang.Object r6 = r2.get(r1)
            int r0 = r4 + r1
            r3.mo3772(r0, r6)
            r3.mo3775(r0, r6)
            int r1 = r1 + 1
            goto L14
        L25:
            return
    }
}
