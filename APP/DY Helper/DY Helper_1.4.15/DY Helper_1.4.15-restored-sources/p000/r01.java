package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface r01 {
    /* JADX INFO: renamed from: α */
    java.lang.Object mo4344(p000.e80 r1, java.lang.Object r2);

    /* JADX INFO: renamed from: β */
    default p000.r01 mo4345(p000.r01 r2) {
            r1 = this;
            p01 r0 = p000.p01.f8378
            if (r2 != r0) goto L5
            return r1
        L5:
            vi r0 = new vi
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    boolean mo4346(p000.a80 r1);
}
