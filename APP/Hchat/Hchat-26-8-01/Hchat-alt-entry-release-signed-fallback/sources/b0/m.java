package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements i0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f390b;

    public /* synthetic */ m(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f389a = r2
            r0.f390b = r1
            r0.<init>()
            return
    }

    @Override // i0.z
    public final void a() {
            r4 = this;
            int r0 = r4.f389a
            r1 = 0
            java.lang.Object r2 = r4.f390b
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L4f;
                case 2: goto L49;
                case 3: goto L44;
                case 4: goto L38;
                case 5: goto L32;
                case 6: goto L2c;
                case 7: goto L24;
                case 8: goto L19;
                default: goto L8;
            }
        L8:
            y2.x r2 = (y2.x) r2
            r2.f()
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            r2.setTag(r0, r1)
            android.view.WindowManager r0 = r2.f22280v
            r0.removeViewImmediate(r2)
            return
        L19:
            y2.v r2 = (y2.v) r2
            r2.dismiss()
            y2.t r0 = r2.f22267m
            r0.f()
            return
        L24:
            y1.k1 r2 = (y1.k1) r2
            y1.m1 r0 = r2.f21992h
            r0.invoke()
            return
        L2c:
            h0.d1 r2 = (h0.d1) r2
            r2.o()
            return
        L32:
            s.h0 r2 = (s.h0) r2
            r0 = 1
            r2.f12023f = r0
            return
        L38:
            s.m0 r2 = (s.m0) r2
            j8.f r0 = r2.f12043c
            if (r0 == 0) goto L41
            r3 = 0
            r0.f6780a = r3
        L41:
            r2.f12043c = r1
            return
        L44:
            s.a0 r2 = (s.a0) r2
            r2.f11970d = r1
            return
        L49:
            i.k1 r2 = (i.k1) r2
            r2.i()
            return
        L4f:
            d0.c r2 = (d0.c) r2
            i0.j1 r0 = r2.f1893c
            java.lang.Object r0 = r0.getValue()
            d0.b r0 = (d0.b) r0
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            return
        L5f:
            b0.h r2 = (b0.h) r2
            w0.s r0 = r2.f371e
            q9.a r3 = r0.f14817h
            if (r3 == 0) goto L6a
            r3.e()
        L6a:
            r0.a()
            android.view.ActionMode r0 = r2.f374h
            if (r0 == 0) goto L74
            r0.finish()
        L74:
            r2.f374h = r1
            return
    }
}
