package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends p000.o4 implements p000.g3, p000.f3 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.h2 f504;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ android.app.Activity f505;

    public /* synthetic */ j2(p000.h2 r1, android.app.Activity r2) {
            r0 = this;
            r0.f504 = r1
            r0.f505 = r2
            r0.<init>()
            return
    }

    @Override // p000.f3
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo11() {
            r3 = this;
            ۟.o7 r0 = p000.o7.f856
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [-125, -69, 40, -126, 45, -122, -87, -65, 37, -109} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0044: FILL_ARRAY_DATA , data: [-10, -53, 76, -29, 89, -29} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            p000.o7.m329(r0, r2)
            int r0 = p000.o.f829
            r0 = 71
            byte[] r0 = new byte[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [-50, -61, 95, -18, -11, 10, -50, -11, 84, -17, -15, 62, -52, -39, 78, -20, -62, 23, -52, -41, 99, -20, -27, 38, -50, -18, 78, -20, -42, 51, -51, -27, 105, 116, -94, 59, -89, -106, 86, -91, -87, 60, -114, -106, 81, -70, -85, 47, -118, -106, 68, -99, -91, 41, -107, -108, 100, -92, -92, 0, -90, -107, 79, -70, -88, 59, -85, -106, 73, -91, 51} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0074: FILL_ARRAY_DATA , data: [43, 115, -39, 10, 77, -121} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            r1 = 1
            p000.o.m318(r1, r0)
            ۟.h2 r0 = r3.f504
            android.app.Activity r1 = r3.f505
            r0.getClass()
            p000.h2.m181(r1)
            return r2
    }

    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.Object mo12(java.lang.Object r5) {
            r4 = this;
            ۟.o5 r5 = (p000.o5) r5
            if (r5 != 0) goto L11
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)
            ۟.h2 r5 = r4.f504
            android.app.Activity r0 = r4.f505
            p000.h2.m178(r5, r0)
            goto L1e
        L11:
            android.app.Activity r0 = r4.f505
            ۟.h2 r1 = r4.f504
            ۟.b5 r2 = new ۟.b5
            r3 = 2
            r2.<init>(r5, r1, r0, r3)
            r0.runOnUiThread(r2)
        L1e:
            ۟.vb r5 = p000.vb.f1114
            return r5
    }
}
