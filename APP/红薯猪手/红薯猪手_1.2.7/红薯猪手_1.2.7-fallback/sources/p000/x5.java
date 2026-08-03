package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x5 extends p000.o4 implements p000.g3<java.lang.String, java.lang.Boolean> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.u5 f1168;

    public x5(p000.u5 r1) {
            r0 = this;
            r0.f1168 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final java.lang.Boolean mo12(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0068: FILL_ARRAY_DATA , data: [-16, 0, -91, 106} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x006e: FILL_ARRAY_DATA , data: [-124, 101, -35, 30, -101, -19} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r5)
            byte[] r0 = new byte[r0]
            r0 = {x0076: FILL_ARRAY_DATA , data: [99, -98, 126, 53} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x007c: FILL_ARRAY_DATA , data: [77, -26, 19, 89, 113, 8} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            boolean r0 = p000.ta.m419(r5, r0)
            if (r0 != 0) goto L3c
            int r5 = p000.o.f829
            r5 = 30
            byte[] r5 = new byte[r5]
            r5 = {x0084: FILL_ARRAY_DATA , data: [-35, 82, 15, 13, 6, -14, -48, 120, 29, 14, 49, -34, -47, 70, 14, 15, 61, -35, -48, 83, 52, 14, 50, -19, -35, 74, 23, 13, 25, -35} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x0098: FILL_ARRAY_DATA , data: [53, -3, -72, -24, -89, 89} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r0)
            goto L61
        L3c:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L4f
            ۟.u5 r0 = r4.f1168
            p000.u5.m430(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L67
        L4f:
            int r5 = p000.o.f829
            r5 = 18
            byte[] r5 = new byte[r5]
            r5 = {x00a0: FILL_ARRAY_DATA , data: [-115, 105, 116, -74, 118, 95, -125, 113, 68, -73, 66, 127, -128, 67, 114, -69, 77, 108} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x00ae: FILL_ARRAY_DATA , data: [101, -25, -61, 83, -7, -55} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r0)
        L61:
            r0 = 0
            p000.o.m318(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L67:
            return r5
    }
}
