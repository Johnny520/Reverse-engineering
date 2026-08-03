package p091g3;

import android.view.WindowInsets;

/* JADX INFO: renamed from: g3.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1330q0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m3556a(int i9) {
        int iStatusBars;
        int i10 = 0;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i9 & i11) != 0) {
                if (i11 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i11 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i11 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i11 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i11 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i11 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i11 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i11 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i11 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i10 |= iStatusBars;
            }
        }
        return i10;
    }
}
