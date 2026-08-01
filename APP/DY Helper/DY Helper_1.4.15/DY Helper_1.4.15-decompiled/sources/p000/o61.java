package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class o61 {

    /* JADX INFO: renamed from: α */
    public final int f7964;

    /* JADX INFO: renamed from: β */
    public final int f7965;

    public o61(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7964 = r1
            r0.f7965 = r2
            return
    }

    public /* synthetic */ o61(int r3, int r4, int r5) {
            r2 = this;
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            r2.<init>(r3, r4)
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Class r0 = r0.getClass()
            wf r0 = p000.vm1.m6272(r0)
            java.lang.String r0 = r0.m6378()
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            return r0
    }

    /* JADX INFO: renamed from: α */
    public abstract void mo45(p000.f81 r1, p000.InterfaceC0676p6 r2, p000.rw1 r3, p000.en1 r4, p000.r71 r5);

    /* JADX INFO: renamed from: β */
    public p000.q80 mo4213(p000.f81 r1) {
            r0 = this;
            r0 = 0
            return r0
    }
}
