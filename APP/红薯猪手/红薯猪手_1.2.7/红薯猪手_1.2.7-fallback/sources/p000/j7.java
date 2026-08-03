package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j7 extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.m7 f521;

    public j7(p000.m7 r1) {
            r0 = this;
            r0.f521 = r1
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
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x008c: FILL_ARRAY_DATA , data: [-54, 46} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0092: FILL_ARRAY_DATA , data: [-93, 90, 34, -89, -26, 90} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r6)
            java.lang.Object r0 = r6.thisObject
            r2 = 57
            byte[] r3 = new byte[r2]
            r3 = {x009a: FILL_ARRAY_DATA , data: [-48, -79, 3, 52, 94, -25, -33, -86, 1, 55, 10, -92, -36, -95, 79, 59, 31, -9, -54, -28, 27, 55, 94, -22, -47, -86, 66, 54, 11, -24, -46, -28, 27, 33, 14, -31, -98, -91, 1, 60, 12, -21, -41, -96, 65, 57, 14, -12, -112, -123, 12, 44, 23, -14, -41, -80, 22} // fill-array
            byte[] r4 = new byte[r1]
            r4 = {x00bc: FILL_ARRAY_DATA , data: [-66, -60, 111, 88, 126, -124} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            p000.h4.m187(r3, r0)
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L53
            ۟.k r3 = p000.k8.f660
            ۟.k r3 = ۟.k8.a.m235()
            java.lang.String r3 = r3.f619
            android.os.Parcelable r0 = r0.getParcelableExtra(r3)
            if (r0 == 0) goto L53
            ۟.k r3 = ۟.k8.a.m235()
            java.lang.String r3 = r3.f620
            java.lang.Object r0 = p000.r3.m364(r0, r3)
            if (r0 == 0) goto L53
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L53
            goto L55
        L53:
            java.lang.String r0 = ""
        L55:
            int r3 = r0.length()
            r4 = 0
            if (r3 <= 0) goto L5e
            r3 = 1
            goto L5f
        L5e:
            r3 = r4
        L5f:
            if (r3 == 0) goto L89
            java.lang.Object r6 = r6.thisObject
            byte[] r2 = new byte[r2]
            r2 = {x00c4: FILL_ARRAY_DATA , data: [-92, -112, -3, -31, 115, 66, -85, -117, -1, -30, 39, 1, -88, -128, -79, -18, 50, 82, -66, -59, -27, -30, 115, 79, -91, -117, -68, -29, 38, 77, -90, -59, -27, -12, 35, 68, -22, -124, -1, -23, 33, 78, -93, -127, -65, -20, 35, 81, -28, -92, -14, -7, 58, 87, -93, -111, -24} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x00e6: FILL_ARRAY_DATA , data: [-54, -27, -111, -115, 83, 33} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            p000.h4.m187(r1, r6)
            android.app.Activity r6 = (android.app.Activity) r6
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r6 = r6.findViewById(r1)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            ۟.m7 r1 = r5.f521
            ۟.h7 r2 = new ۟.h7
            r2.<init>(r6, r1, r0, r4)
            r6.post(r2)
        L89:
            ۟.vb r6 = p000.vb.f1114
            return r6
    }
}
