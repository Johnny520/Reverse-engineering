package p000;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: renamed from: Mi */
/* JADX INFO: loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC0541Mi implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0584Ni f1758a;

    public WindowOnFrameMetricsAvailableListenerC0541Mi(C0584Ni r1) {
        this.f1758a = r1;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window r10, FrameMetrics r11, int r12) {
        C0584Ni r102 = this.f1758a;
        int r122 = r102.f1892a;
        if ((r122 & 1) == 0) goto L6;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[0], r11.getMetric(8));
    L6:
        if ((r122 & 2) == 0) goto L9;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[1], r11.getMetric(1));
    L9:
        if ((r122 & 4) == 0) goto L12;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[2], r11.getMetric(3));
    L12:
        if ((r122 & 8) == 0) goto L15;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[3], r11.getMetric(4));
    L15:
        if ((r122 & 16) == 0) goto L18;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[4], r11.getMetric(5));
    L18:
        if ((r122 & 64) == 0) goto L21;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[6], r11.getMetric(7));
    L21:
        if ((r122 & 32) == 0) goto L24;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[5], r11.getMetric(6));
    L24:
        if ((r122 & 128) == 0) goto L27;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[7], r11.getMetric(0));
    L27:
        if ((r122 & 256) == 0) goto L30;
        C0584Ni.m1120a(((SparseIntArray[]) r102.f1893b)[8], r11.getMetric(2));
        return;
    }
}
