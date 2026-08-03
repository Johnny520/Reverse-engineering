package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements android.view.View.OnLongClickListener {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f1016;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1017;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ p000.y0 f1018;

    public /* synthetic */ t0(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, p000.y0 r2, int r3) {
            r0 = this;
            r0.f1016 = r3
            r0.f1017 = r1
            r0.f1018 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ t0(p000.y0 r2, java.lang.Object r3) {
            r1 = this;
            r0 = 2
            r1.f1016 = r0
            r1.<init>()
            r1.f1018 = r2
            r1.f1017 = r3
            return
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r7) {
            r6 = this;
            int r0 = r6.f1016
            r1 = 1
            switch(r0) {
                case 0: goto L11;
                case 1: goto L7;
                default: goto L6;
            }
        L6:
            goto L1b
        L7:
            java.lang.Object r7 = r6.f1017
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r7 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r7
            ۟.y0 r0 = r6.f1018
            p000.y0.m463(r7, r0)
            return r1
        L11:
            java.lang.Object r7 = r6.f1017
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r7 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r7
            ۟.y0 r0 = r6.f1018
            p000.y0.m464(r7, r0)
            return r1
        L1b:
            ۟.y0 r0 = r6.f1018
            java.lang.Object r2 = r6.f1017
            r3 = 6
            byte[] r4 = new byte[r3]
            r4 = {x0054: FILL_ARRAY_DATA , data: [-35, 26, 60, 120, -57, 24} // fill-array
            byte[] r5 = new byte[r3]
            r5 = {x005c: FILL_ARRAY_DATA , data: [-87, 114, 85, 11, -29, 40} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            p000.h4.m189(r4, r0)
            android.content.Context r7 = r7.getContext()
            r0 = 15
            byte[] r0 = new byte[r0]
            r0 = {x0064: FILL_ARRAY_DATA , data: [39, -88, 15, -118, 11, -102, 52, -88, 3, -67, 76, -38, 110, -29, 82} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x0070: FILL_ARRAY_DATA , data: [64, -51, 123, -55, 100, -12} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r3)
            p000.h4.m188(r0, r7)
            p000.y0.m465(r7, r2)
            return r1
    }
}
