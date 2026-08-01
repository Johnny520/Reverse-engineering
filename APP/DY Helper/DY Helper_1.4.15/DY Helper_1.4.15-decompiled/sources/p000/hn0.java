package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hn0 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public long f4780;

    @Override // p000.m01
    public final void beforeHookedMethod(p000.k01 r8) {
            r7 = this;
            r8.getClass()
            java.lang.Object[] r0 = r8.f5692
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            int r2 = r0.getAction()
            if (r2 == 0) goto L14
            goto L6c
        L14:
            int r0 = r0.getKeyCode()
            r2 = 25
            r3 = 24
            if (r0 == r3) goto L21
            if (r0 == r2) goto L21
            goto L6c
        L21:
            p000.in0.m2770()
            boolean r4 = p000.in0.f5137
            if (r4 != 0) goto L29
            goto L6c
        L29:
            java.lang.Object r4 = r8.f5691
            r4.getClass()
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r1 = p000.q02.m4654(r5, r6, r1)
            if (r1 != 0) goto L45
            goto L6c
        L45:
            if (r0 == r3) goto L6d
            if (r0 == r2) goto L4a
            goto L6c
        L4a:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f4780
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6c
            q71 r0 = p000.q71.f8896
            n9 r0 = new n9
            r1 = 23
            r0.<init>(r4, r1)
            r4.runOnUiThread(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.m3107(r0)
            r0 = 0
            r7.f4780 = r0
        L6c:
            return
        L6d:
            long r0 = java.lang.System.currentTimeMillis()
            r7.f4780 = r0
            return
    }
}
