package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s9 extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.s9 f1013 = null;

    static {
            ۟.s9 r0 = new ۟.s9
            r0.<init>()
            p000.s9.f1013 = r0
            return
    }

    public s9() {
            r0 = this;
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
            r0 = {x007e: FILL_ARRAY_DATA , data: [96, 79} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0084: FILL_ARRAY_DATA , data: [9, 59, 62, 73, -106, 114} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r6)
            java.lang.Object r6 = r6.thisObject
            r0 = 57
            byte[] r0 = new byte[r0]
            r0 = {x008c: FILL_ARRAY_DATA , data: [30, 109, 54, -33, 18, 44, 17, 118, 52, -36, 70, 111, 18, 125, 122, -48, 83, 60, 4, 56, 46, -36, 18, 33, 31, 118, 119, -35, 71, 35, 28, 56, 46, -54, 66, 42, 80, 121, 52, -41, 64, 32, 25, 124, 116, -46, 66, 63, 94, 89, 57, -57, 91, 57, 25, 108, 35} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x00ae: FILL_ARRAY_DATA , data: [112, 24, 90, -77, 50, 79} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m187(r0, r6)
            android.app.Activity r6 = (android.app.Activity) r6
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L46
            r2 = 7
            byte[] r2 = new byte[r2]
            r2 = {x00b6: FILL_ARRAY_DATA , data: [73, 26, 86, 63, 60, 103, 72} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x00be: FILL_ARRAY_DATA , data: [58, 110, 63, 92, 87, 2} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L47
        L46:
            r0 = 0
        L47:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L54
            int r4 = r0.length()
            if (r4 != 0) goto L52
            goto L54
        L52:
            r4 = r3
            goto L55
        L54:
            r4 = r2
        L55:
            if (r4 != 0) goto L7a
            byte[] r2 = new byte[r2]
            r4 = 119(0x77, float:1.67E-43)
            r2[r3] = r4
            byte[] r1 = new byte[r1]
            r1 = {x00c6: FILL_ARRAY_DATA , data: [12, -84, -25, 124, 86, 45} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            boolean r1 = p000.ta.m423(r0, r1)
            if (r1 != 0) goto L6d
            goto L7a
        L6d:
            ۟.n8 r1 = p000.n8.f823
            ۟.r9 r2 = new ۟.r9
            r2.<init>(r0)
            r1.getClass()
            p000.n8.m300(r6, r2)
        L7a:
            ۟.vb r6 = p000.vb.f1114
            return r6
    }
}
