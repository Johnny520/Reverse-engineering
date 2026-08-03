package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.y0 f1116;

    public w0(p000.y0 r1) {
            r0 = this;
            r0.f1116 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r8 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r8
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x00ae: FILL_ARRAY_DATA , data: [-36, -119, 101, -61, 50} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00b6: FILL_ARRAY_DATA , data: [-84, -24, 23, -94, 95, -71} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r8)
            java.lang.Object[] r0 = r8.args
            r2 = 0
            r0 = r0[r2]
            if (r0 != 0) goto L1e
            goto Laa
        L1e:
            r3 = 30
            byte[] r3 = new byte[r3]
            r3 = {x00be: FILL_ARRAY_DATA , data: [-109, 127, -73, -4, 20, -45, -98, 119, -77, -68, 66, -41, -111, 100, -88, -69, 20, -108, -109, 127, -73, -65, 9, -44, -124, 62, -120, -10, 5, -34} // fill-array
            byte[] r4 = new byte[r1]
            r4 = {x00d2: FILL_ARRAY_DATA , data: [-16, 16, -38, -46, 108, -70} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            r4 = 20
            byte[] r4 = new byte[r4]
            r4 = {x00da: FILL_ARRAY_DATA , data: [-8, -53, 69, 43, -70, 29, -17, -25, 71, 40, -85, 22, -11, -48, 124, 35, -89, 7, -41, -24} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x00e8: FILL_ARRAY_DATA , data: [-101, -92, 40, 70, -33, 115} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            r5 = 0
            java.lang.Integer r3 = p000.r3.m367(r3, r4)
            if (r3 == 0) goto Laa
            int r4 = r3.intValue()
            if (r4 > 0) goto L4c
            goto Laa
        L4c:
            java.lang.Object r8 = r8.thisObject
            r4 = 10
            byte[] r4 = new byte[r4]
            r4 = {x00f0: FILL_ARRAY_DATA , data: [97, -1, -24, 6, -44, 13, 127, -14, -30, 1} // fill-array
            byte[] r6 = new byte[r1]
            r6 = {x00fa: FILL_ARRAY_DATA , data: [21, -105, -127, 117, -101, 111} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r6)
            p000.h4.m188(r4, r8)
            r4 = 7
            byte[] r4 = new byte[r4]
            r4 = {x0102: FILL_ARRAY_DATA , data: [30, 98, -15, -60, -93, -77, 14} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x010a: FILL_ARRAY_DATA , data: [121, 7, -123, -110, -54, -42} // fill-array
            java.lang.String r1 = p000.oa.m332(r4, r1)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object r8 = p000.r3.m357(r8, r1, r4)
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L85
            int r1 = r3.intValue()
            android.view.View r8 = r8.findViewById(r1)
            r5 = r8
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L85:
            if (r5 != 0) goto L88
            goto Laa
        L88:
            ۟.y0 r8 = r7.f1116
            ۟.v0 r1 = new ۟.v0
            r1.<init>(r8, r5, r0, r2)
            r5.setOnLongClickListener(r1)
            int r8 = r5.getChildCount()
        L96:
            if (r2 >= r8) goto Laa
            android.view.View r1 = r5.getChildAt(r2)
            ۟.y0 r3 = r7.f1116
            ۟.v0 r4 = new ۟.v0
            r6 = 1
            r4.<init>(r3, r5, r0, r6)
            r1.setOnLongClickListener(r4)
            int r2 = r2 + 1
            goto L96
        Laa:
            ۟.vb r8 = p000.vb.f1114
            return r8
    }
}
