package p000;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0967x0 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11957;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.compose.p001ui.platform.AndroidComposeView f11958;

    public /* synthetic */ C0967x0(androidx.compose.p001ui.platform.AndroidComposeView r1, int r2) {
            r0 = this;
            r0.f11957 = r2
            r0.f11958 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f11957
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L2c;
                case 2: goto Lc;
                default: goto L5;
            }
        L5:
            androidx.compose.ui.platform.AndroidComposeView r5 = r5.f11958
            androidx.compose.p001ui.platform.AndroidComposeView.m367(r5)
            r5 = 0
            return r5
        Lc:
            androidx.compose.ui.platform.AndroidComposeView r5 = r5.f11958
            android.view.MotionEvent r0 = r5.f954
            if (r0 == 0) goto L29
            int r0 = r0.getActionMasked()
            r1 = 7
            if (r0 == r1) goto L1e
            r1 = 9
            if (r0 == r1) goto L1e
            goto L29
        L1e:
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.f955 = r0
            d1 r0 = r5.f920
            r5.post(r0)
        L29:
            s62 r5 = p000.s62.f9751
            return r5
        L2c:
            androidx.compose.ui.platform.AndroidComposeView r5 = r5.f11958
            android.content.res.Configuration r5 = r5.getConfiguration()
            android.os.LocaleList r5 = r5.getLocales()
            cv0 r0 = new cv0
            dv0 r1 = new dv0
            r1.<init>(r5)
            r0.<init>(r1)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L54
            android.os.LocaleList r5 = android.os.LocaleList.getDefault()
            cv0 r0 = new cv0
            dv0 r1 = new dv0
            r1.<init>(r5)
            r0.<init>(r1)
        L54:
            dv0 r5 = r0.f2779
            android.os.LocaleList r0 = r5.f3300
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L62:
            if (r2 >= r0) goto L78
            zu0 r3 = new zu0
            android.os.LocaleList r4 = r5.f3300
            java.util.Locale r4 = r4.get(r2)
            r4.getClass()
            r3.<init>(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto L62
        L78:
            av0 r5 = new av0
            r5.<init>(r1)
            return r5
        L7e:
            androidx.compose.ui.platform.AndroidComposeView r5 = r5.f11958
            x91 r5 = r5.f915
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            return r5
    }
}
