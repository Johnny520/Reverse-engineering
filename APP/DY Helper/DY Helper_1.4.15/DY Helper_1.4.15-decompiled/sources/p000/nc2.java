package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nc2 {
    /* JADX INFO: renamed from: α */
    public static int m4020(int r5) {
            r0 = 0
            r1 = 1
            r2 = r1
        L3:
            r3 = 512(0x200, float:7.17E-43)
            if (r2 > r3) goto L5b
            r4 = r5 & r2
            if (r4 == 0) goto L58
            if (r2 == r1) goto L53
            r4 = 2
            if (r2 == r4) goto L4e
            r4 = 4
            if (r2 == r4) goto L49
            r4 = 8
            if (r2 == r4) goto L44
            r4 = 16
            if (r2 == r4) goto L3f
            r4 = 32
            if (r2 == r4) goto L3a
            r4 = 64
            if (r2 == r4) goto L35
            r4 = 128(0x80, float:1.8E-43)
            if (r2 == r4) goto L30
            if (r2 == r3) goto L2a
            goto L58
        L2a:
            int r3 = p000.AbstractC0513li.m3565()
        L2e:
            r0 = r0 | r3
            goto L58
        L30:
            int r3 = android.view.WindowInsets.Type.displayCutout()
            goto L2e
        L35:
            int r3 = android.view.WindowInsets.Type.tappableElement()
            goto L2e
        L3a:
            int r3 = android.view.WindowInsets.Type.mandatorySystemGestures()
            goto L2e
        L3f:
            int r3 = android.view.WindowInsets.Type.systemGestures()
            goto L2e
        L44:
            int r3 = android.view.WindowInsets.Type.ime()
            goto L2e
        L49:
            int r3 = android.view.WindowInsets.Type.captionBar()
            goto L2e
        L4e:
            int r3 = android.view.WindowInsets.Type.navigationBars()
            goto L2e
        L53:
            int r3 = android.view.WindowInsets.Type.statusBars()
            goto L2e
        L58:
            int r2 = r2 << 1
            goto L3
        L5b:
            return r0
    }
}
