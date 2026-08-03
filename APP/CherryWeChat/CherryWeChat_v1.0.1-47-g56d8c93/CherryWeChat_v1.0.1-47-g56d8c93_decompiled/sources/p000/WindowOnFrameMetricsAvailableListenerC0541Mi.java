package p000;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: renamed from: Mi */
/* JADX INFO: loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC0541Mi implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0584Ni f1758a;

    public WindowOnFrameMetricsAvailableListenerC0541Mi(C0584Ni c0584Ni) {
        this.f1758a = c0584Ni;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        C0584Ni c0584Ni = this.f1758a;
        int i2 = c0584Ni.f1892a;
        if ((i2 & 1) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[0], frameMetrics.getMetric(8));
        }
        if ((i2 & 2) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[1], frameMetrics.getMetric(1));
        }
        if ((i2 & 4) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[2], frameMetrics.getMetric(3));
        }
        if ((i2 & 8) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[3], frameMetrics.getMetric(4));
        }
        if ((i2 & 16) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[4], frameMetrics.getMetric(5));
        }
        if ((i2 & 64) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[6], frameMetrics.getMetric(7));
        }
        if ((i2 & 32) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[5], frameMetrics.getMetric(6));
        }
        if ((i2 & 128) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[7], frameMetrics.getMetric(0));
        }
        if ((i2 & 256) != 0) {
            C0584Ni.m1120a(((SparseIntArray[]) c0584Ni.f1893b)[8], frameMetrics.getMetric(2));
        }
    }
}
