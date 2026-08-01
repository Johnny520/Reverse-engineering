package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class mc2 {
    /* JADX INFO: renamed from: α */
    public static int m3803(int r4) {
            r0 = 0
            r1 = 1
            r2 = r1
        L3:
            r3 = 512(0x200, float:7.17E-43)
            if (r2 > r3) goto L54
            r3 = r4 & r2
            if (r3 == 0) goto L51
            if (r2 == r1) goto L4c
            r3 = 2
            if (r2 == r3) goto L47
            r3 = 4
            if (r2 == r3) goto L42
            r3 = 8
            if (r2 == r3) goto L3d
            r3 = 16
            if (r2 == r3) goto L38
            r3 = 32
            if (r2 == r3) goto L33
            r3 = 64
            if (r2 == r3) goto L2e
            r3 = 128(0x80, float:1.8E-43)
            if (r2 == r3) goto L28
            goto L51
        L28:
            int r3 = android.view.WindowInsets.Type.displayCutout()
        L2c:
            r0 = r0 | r3
            goto L51
        L2e:
            int r3 = android.view.WindowInsets.Type.tappableElement()
            goto L2c
        L33:
            int r3 = android.view.WindowInsets.Type.mandatorySystemGestures()
            goto L2c
        L38:
            int r3 = android.view.WindowInsets.Type.systemGestures()
            goto L2c
        L3d:
            int r3 = android.view.WindowInsets.Type.ime()
            goto L2c
        L42:
            int r3 = android.view.WindowInsets.Type.captionBar()
            goto L2c
        L47:
            int r3 = android.view.WindowInsets.Type.navigationBars()
            goto L2c
        L4c:
            int r3 = android.view.WindowInsets.Type.statusBars()
            goto L2c
        L51:
            int r2 = r2 << 1
            goto L3
        L54:
            return r0
    }
}
