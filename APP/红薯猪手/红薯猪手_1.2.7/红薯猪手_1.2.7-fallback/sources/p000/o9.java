package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o9 extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.t9 f861;

    public o9(p000.t9 r1) {
            r0 = this;
            r0.f861 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r6 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r6
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x00ba: FILL_ARRAY_DATA , data: [95, 69, 112, 23, -85} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00c2: FILL_ARRAY_DATA , data: [47, 36, 2, 118, -58, -70} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r6)
            ۟.t9 r0 = r5.f861
            r2 = 1099431936(0x41880000, float:17.0)
            int r2 = p000.tb.m427(r2)
            p000.t9.m414(r0, r2)
            java.lang.Object r0 = r6.thisObject
            r2 = 10
            byte[] r2 = new byte[r2]
            r2 = {x00ca: FILL_ARRAY_DATA , data: [66, -3, -85, 20, -117, 54, 92, -16, -95, 19} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x00d4: FILL_ARRAY_DATA , data: [54, -107, -62, 103, -60, 84} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            p000.h4.m188(r2, r0)
            ۟.k r2 = p000.k8.f660
            ۟.k r2 = ۟.k8.a.m235()
            java.lang.String r2 = r2.f580
            java.lang.Object r0 = p000.r3.m364(r0, r2)
            ۟.n8 r2 = p000.n8.f823
            r2.getClass()
            android.view.View r6 = p000.n8.m298(r6)
            if (r6 == 0) goto L7e
            ۟.k r2 = ۟.k8.a.m235()
            java.lang.String r2 = r2.f541
            r3 = 11
            byte[] r3 = new byte[r3]
            r3 = {x00dc: FILL_ARRAY_DATA , data: [-106, -95, 56, -117, 86, 71, -98, -87, 11, -113, 68} // fill-array
            byte[] r4 = new byte[r1]
            r4 = {x00e6: FILL_ARRAY_DATA , data: [-41, -51, 72, -29, 55, 21} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            p000.h4.m188(r3, r2)
            ۟.k r3 = ۟.k8.a.m235()
            java.lang.String r3 = r3.f581
            java.lang.Integer r2 = p000.r3.m367(r2, r3)
            if (r2 == 0) goto L76
            int r2 = r2.intValue()
            goto L77
        L76:
            r2 = -1
        L77:
            android.view.View r6 = r6.findViewById(r2)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            goto L7f
        L7e:
            r6 = 0
        L7f:
            if (r0 == 0) goto Lb7
            if (r6 != 0) goto L84
            goto Lb7
        L84:
            r2 = 8
            byte[] r2 = new byte[r2]
            r2 = {x00ee: FILL_ARRAY_DATA , data: [-120, -61, -81, 63, -111, -128, -106, -55} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x00f6: FILL_ARRAY_DATA , data: [-26, -84, -37, 90, -59, -7} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            java.lang.Object r2 = p000.r3.m364(r0, r2)
            byte[] r3 = new byte[r1]
            r3 = {x00fe: FILL_ARRAY_DATA , data: [78, -83, 104, 91, 105, -85} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0106: FILL_ARRAY_DATA , data: [32, -62, 26, 54, 8, -57} // fill-array
            java.lang.String r1 = p000.oa.m332(r3, r1)
            boolean r1 = p000.h4.m185(r2, r1)
            if (r1 == 0) goto Lb2
            ۟.t9 r1 = r5.f861
            p000.t9.m412(r1, r6, r0)
            goto Lb7
        Lb2:
            ۟.t9 r0 = r5.f861
            p000.t9.m413(r0, r6)
        Lb7:
            ۟.vb r6 = p000.vb.f1114
            return r6
    }
}
