package p000;

/* JADX INFO: renamed from: qi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0725qi {

    /* JADX INFO: renamed from: α */
    public static final p000.C0799si f9014 = null;

    static {
            si r0 = new si
            i2 r1 = p000.AbstractC0861u6.f10606
            y9 r2 = p000.C0966x.f11948
            r0.<init>(r1, r2)
            p000.AbstractC0725qi.f9014 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final p000.C0799si m4883(p000.C0787s6 r4, p000.v80 r5) {
            y9 r0 = p000.C0966x.f11949
            i2 r1 = p000.AbstractC0861u6.f10606
            boolean r1 = r4.equals(r1)
            r2 = 0
            if (r1 == 0) goto L1f
            y9 r1 = p000.C0966x.f11948
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1f
            r4 = -1446604504(0xffffffffa9c69128, float:-8.818147E-14)
            r5.m6082(r4)
            r5.m6100(r2)
            si r4 = p000.AbstractC0725qi.f9014
            return r4
        L1f:
            r1 = -1446550657(0xffffffffa9c7637f, float:-8.854635E-14)
            r5.m6082(r1)
            java.lang.Object r1 = r5.m6073()
            i2 r3 = p000.C0730qn.f9051
            if (r1 != r3) goto L35
            si r1 = new si
            r1.<init>(r4, r0)
            r5.m6115(r1)
        L35:
            si r1 = (p000.C0799si) r1
            r5.m6100(r2)
            return r1
    }
}
