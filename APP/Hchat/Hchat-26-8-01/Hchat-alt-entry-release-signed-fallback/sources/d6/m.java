package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends java.lang.ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2033a;

    public /* synthetic */ m(int r1) {
            r0 = this;
            r0.f2033a = r1
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
            r3 = this;
            int r0 = r3.f2033a
            switch(r0) {
                case 0: goto L32;
                case 1: goto L2c;
                case 2: goto L26;
                default: goto L5;
            }
        L5:
            y1.n0 r0 = new y1.n0
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 == 0) goto L1f
            android.os.Handler r2 = a.a.C(r2)
            r0.<init>(r1, r2)
            i0.d r1 = r0.f22015r
            wf.g r0 = f8.i.q0(r0, r1)
            goto L25
        L1f:
            java.lang.String r0 = "no Looper on this thread"
            j8.o.A(r0)
            r0 = 0
        L25:
            return r0
        L26:
            u4.n r0 = new u4.n
            r0.<init>()
            return r0
        L2c:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            return r0
        L32:
            r0 = 256(0x100, float:3.59E-43)
            char[] r0 = new char[r0]
            return r0
    }
}
