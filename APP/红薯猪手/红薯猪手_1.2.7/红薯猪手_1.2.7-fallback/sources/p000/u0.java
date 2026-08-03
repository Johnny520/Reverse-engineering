package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.y0 f1057;

    public u0(p000.y0 r1) {
            r0 = this;
            r0.f1057 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r9) {
            r8 = this;
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r9 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r9
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x00aa: FILL_ARRAY_DATA , data: [-62, -112, -100, 18, 114} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00b2: FILL_ARRAY_DATA , data: [-78, -15, -18, 115, 31, 104} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r9)
            ۟.y0 r0 = r8.f1057
            ۟.n8 r2 = p000.n8.f823
            r2.getClass()
            android.view.View r2 = p000.n8.m298(r9)
            if (r2 != 0) goto L24
            goto La6
        L24:
            ۟.k r3 = p000.k8.f660
            java.lang.String r3 = r3.f534
            r4 = 22
            byte[] r5 = new byte[r4]
            r5 = {x00ba: FILL_ARRAY_DATA , data: [46, 74, 86, 34, 60, 73, 45, 68, 86, 53, 17, 84, 23, 74, 75, 60, 7, 120, 7, 104, 78, 35} // fill-array
            byte[] r6 = new byte[r1]
            r6 = {x00ca: FILL_ARRAY_DATA , data: [99, 43, 34, 80, 85, 49} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m188(r5, r3)
            r5 = 11
            byte[] r5 = new byte[r5]
            r5 = {x00d2: FILL_ARRAY_DATA , data: [-77, -10, -117, 28, -42, -28, -87, -11, -102, 45, -44} // fill-array
            byte[] r6 = new byte[r1]
            r6 = {x00dc: FILL_ARRAY_DATA , data: [-35, -103, -1, 121, -126, -115} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            java.lang.Integer r3 = p000.r3.m367(r3, r5)
            r5 = -1
            if (r3 == 0) goto L57
            int r3 = r3.intValue()
            goto L58
        L57:
            r3 = r5
        L58:
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            ۟.k r6 = p000.k8.f660
            java.lang.String r6 = r6.f534
            byte[] r4 = new byte[r4]
            r4 = {x00e4: FILL_ARRAY_DATA , data: [47, -25, -106, 55, -111, 66, 44, -23, -106, 32, -68, 95, 22, -25, -117, 41, -86, 115, 6, -59, -114, 54} // fill-array
            byte[] r7 = new byte[r1]
            r7 = {x00f4: FILL_ARRAY_DATA , data: [98, -122, -30, 69, -8, 58} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r7)
            p000.h4.m188(r4, r6)
            r4 = 17
            byte[] r4 = new byte[r4]
            r4 = {x00fc: FILL_ARRAY_DATA , data: [23, 121, -114, -126, -86, -11, 17, 96, -118, -79, -86, -61, 10, 66, -122, -128, -72} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x010a: FILL_ARRAY_DATA , data: [126, 20, -17, -27, -49, -69} // fill-array
            java.lang.String r1 = p000.oa.m332(r4, r1)
            java.lang.Integer r1 = p000.r3.m367(r6, r1)
            if (r1 == 0) goto L8d
            int r5 = r1.intValue()
        L8d:
            android.view.View r1 = r2.findViewById(r5)
            if (r1 != 0) goto L94
            goto La6
        L94:
            ۟.t0 r2 = new ۟.t0
            r4 = 0
            r2.<init>(r9, r0, r4)
            r3.setOnLongClickListener(r2)
            ۟.t0 r2 = new ۟.t0
            r3 = 1
            r2.<init>(r9, r0, r3)
            r1.setOnLongClickListener(r2)
        La6:
            ۟.vb r9 = p000.vb.f1114
            return r9
    }
}
