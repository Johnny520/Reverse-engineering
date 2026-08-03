package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends p000.o4 implements p000.g3<android.app.Activity, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ java.util.List<java.lang.String> f1058;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ android.widget.TextView f1059;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f1060;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ p000.p8 f1061;

    public u1(java.util.List<java.lang.String> r1, android.widget.TextView r2, int r3, p000.p8 r4) {
            r0 = this;
            r0.f1058 = r1
            r0.f1059 = r2
            r0.f1060 = r3
            r0.f1061 = r4
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(android.app.Activity r8) {
            r7 = this;
            android.app.Activity r8 = (android.app.Activity) r8
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x00ae: FILL_ARRAY_DATA , data: [-28, 14} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00b4: FILL_ARRAY_DATA , data: [-115, 122, -29, -8, 101, 31} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r8)
            java.util.List<java.lang.String> r8 = r7.f1058
            int r8 = r8.size()
            r0 = 11
            r2 = 0
            r3 = 1
            if (r8 != r3) goto L55
            android.widget.TextView r8 = r7.f1059
            byte[] r0 = new byte[r0]
            r0 = {x00bc: FILL_ARRAY_DATA , data: [-69, 59, 100, 58, 78, -49, -69, 59, 66, -24, -45} // fill-array
            byte[] r4 = new byte[r1]
            r4 = {x00c6: FILL_ARRAY_DATA , data: [95, -125, -17, -46, -13, 114} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r4)
            int r4 = r7.f1060
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.StringBuilder r0 = p000.r2.m354(r0, r4)
            byte[] r3 = new byte[r3]
            r4 = 23
            r3[r2] = r4
            byte[] r1 = new byte[r1]
            r1 = {x00ce: FILL_ARRAY_DATA , data: [50, -116, -17, -104, -102, -29} // fill-array
            java.lang.String r1 = p000.oa.m332(r3, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setText(r0)
            goto Laa
        L55:
            android.widget.TextView r8 = r7.f1059
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            ۟.p8 r5 = r7.f1061
            int r5 = r5.f896
            int r5 = r5 + r3
            r4.append(r5)
            byte[] r5 = new byte[r3]
            r6 = 43
            r5[r2] = r6
            byte[] r6 = new byte[r1]
            r6 = {x00d6: FILL_ARRAY_DATA , data: [4, -23, -12, 31, -120, -24} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            r4.append(r5)
            java.util.List<java.lang.String> r5 = r7.f1058
            int r5 = r5.size()
            r4.append(r5)
            byte[] r0 = new byte[r0]
            r0 = {x00de: FILL_ARRAY_DATA , data: [-32, -99, -73, -50, 95, -45, 87, -99, -73, -24, -115} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x00e8: FILL_ARRAY_DATA , data: [-22, 121, 15, 69, -73, 110} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r5)
            r4.append(r0)
            int r0 = r7.f1060
            r4.append(r0)
            byte[] r0 = new byte[r3]
            r3 = -67
            r0[r2] = r3
            byte[] r1 = new byte[r1]
            r1 = {x00f0: FILL_ARRAY_DATA , data: [-104, -10, -91, 46, 104, 77} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            r4.append(r0)
            r8.setText(r4)
        Laa:
            ۟.vb r8 = p000.vb.f1114
            return r8
    }
}
