package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements i0.n, androidx.lifecycle.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y1.t f22156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.q f22157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.lifecycle.s f22159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fg.p f22160k;

    public x2(y1.t r1, i0.q r2) {
            r0 = this;
            r0.<init>()
            r0.f22156g = r1
            r0.f22157h = r2
            s0.d r1 = y1.b1.f21852a
            r0.f22160k = r1
            return
    }

    @Override // androidx.lifecycle.o
    public final void b(androidx.lifecycle.q r1, androidx.lifecycle.k r2) {
            r0 = this;
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_DESTROY
            if (r2 != r1) goto L8
            r0.e()
            return
        L8:
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_CREATE
            if (r2 != r1) goto L15
            boolean r1 = r0.f22158i
            if (r1 != 0) goto L15
            fg.p r1 = r0.f22160k
            r0.f(r1)
        L15:
            return
    }

    public final void e() {
            r3 = this;
            boolean r0 = r3.f22158i
            if (r0 != 0) goto L1d
            r0 = 1
            r3.f22158i = r0
            y1.t r0 = r3.f22156g
            android.view.View r0 = r0.getView()
            r1 = 2131099778(0x7f060082, float:1.7811919E38)
            r2 = 0
            r0.setTag(r1, r2)
            androidx.lifecycle.s r0 = r3.f22159j
            if (r0 == 0) goto L1b
            r0.f(r3)
        L1b:
            r3.f22159j = r2
        L1d:
            i0.q r0 = r3.f22157h
            r0.m()
            return
    }

    public final void f(fg.p r3) {
            r2 = this;
            f1.p r0 = new f1.p
            r1 = 11
            r0.<init>(r2, r1, r3)
            y1.t r3 = r2.f22156g
            r3.setOnReadyForComposition(r0)
            return
    }
}
