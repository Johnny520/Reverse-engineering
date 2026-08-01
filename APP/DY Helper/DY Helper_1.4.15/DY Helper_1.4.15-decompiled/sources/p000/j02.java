package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class j02 implements p000.i02 {

    /* JADX INFO: renamed from: ε */
    public final p000.C0421j7 f5286;

    public j02() {
            r2 = this;
            r2.<init>()
            j7 r0 = new j7
            r1 = 0
            r0.<init>(r1)
            r2.f5286 = r0
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m2846(int r1) {
            r0 = this;
            j7 r0 = r0.f5286
            int r0 = r0.get()
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m2847(int r4) {
            r3 = this;
        L0:
            j7 r0 = r3.f5286
            int r1 = r0.get()
            r2 = r1 & r4
            if (r2 == 0) goto Lb
            goto L13
        Lb:
            r2 = r1 | r4
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L0
        L13:
            return
    }
}
