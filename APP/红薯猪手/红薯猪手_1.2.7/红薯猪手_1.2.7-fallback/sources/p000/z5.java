package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z5 extends p000.o4 implements p000.g3<java.lang.String, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.u5 f1247;

    public z5(p000.u5 r1) {
            r0 = this;
            r0.f1247 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(java.lang.String r4) {
            r3 = this;
            java.lang.String r4 = (java.lang.String) r4
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0040: FILL_ARRAY_DATA , data: [-52, -70, -3, -26, 27, -35, -52, -73} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0048: FILL_ARRAY_DATA , data: [-72, -33, -114, -110, 75, -68} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r0 = r0.canWrite()
            if (r0 == 0) goto L27
            ۟.u5 r0 = r3.f1247
            p000.u5.m430(r0, r4)
            goto L3d
        L27:
            int r4 = p000.o.f829
            r4 = 18
            byte[] r4 = new byte[r4]
            r4 = {x0050: FILL_ARRAY_DATA , data: [78, -39, -52, -35, 17, -91, 77, -21, -49, -34, 58, -107, 78, -39, -7, -46, 53, -122} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x005e: FILL_ARRAY_DATA , data: [-85, 125, 72, 58, -127, 35} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r0)
            r0 = 0
            p000.o.m318(r0, r4)
        L3d:
            ۟.vb r4 = p000.vb.f1114
            return r4
    }
}
