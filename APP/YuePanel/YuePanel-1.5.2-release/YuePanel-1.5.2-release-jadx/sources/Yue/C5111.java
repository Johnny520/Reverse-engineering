package Yue;

import Yue.InterfaceC7144;
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5111 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1295 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12100 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f12101 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f12102 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f12103 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f12104 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f12105 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f12106 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f12107 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f12108 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f12109 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f12110 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f12111 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f12112 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f12113 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f12114 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f12115 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f12116 = 128;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f12117 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f12118 = 511;

    /* JADX INFO: renamed from: ۥ */
    public final C0647 f1296;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ */
    @InterfaceC7113(24)
    public static class C0646 extends C0647 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f12119 = 1000000;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f12120 = 500000;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static HandlerThread f12121;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static Handler f12122;

        /* JADX INFO: renamed from: ۥ */
        public int f1297;

        /* JADX INFO: renamed from: ۥ۟ */
        public SparseIntArray[] f1298 = new SparseIntArray[9];

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final ArrayList<WeakReference<Activity>> f12123 = new ArrayList<>();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Window.OnFrameMetricsAvailableListener f12124 = new WindowOnFrameMetricsAvailableListenerC5112();

        /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ$ۥ, reason: contains not printable characters */
        public class WindowOnFrameMetricsAvailableListenerC5112 implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC5112() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C0646 c0646 = C0646.this;
                if ((c0646.f1297 & 1) != 0) {
                    c0646.m15779(c0646.f1298[0], frameMetrics.getMetric(8));
                }
                C0646 c06462 = C0646.this;
                if ((c06462.f1297 & 2) != 0) {
                    c06462.m15779(c06462.f1298[1], frameMetrics.getMetric(1));
                }
                C0646 c06463 = C0646.this;
                if ((c06463.f1297 & 4) != 0) {
                    c06463.m15779(c06463.f1298[2], frameMetrics.getMetric(3));
                }
                C0646 c06464 = C0646.this;
                if ((c06464.f1297 & 8) != 0) {
                    c06464.m15779(c06464.f1298[3], frameMetrics.getMetric(4));
                }
                C0646 c06465 = C0646.this;
                if ((c06465.f1297 & 16) != 0) {
                    c06465.m15779(c06465.f1298[4], frameMetrics.getMetric(5));
                }
                C0646 c06466 = C0646.this;
                if ((c06466.f1297 & 64) != 0) {
                    c06466.m15779(c06466.f1298[6], frameMetrics.getMetric(7));
                }
                C0646 c06467 = C0646.this;
                if ((c06467.f1297 & 32) != 0) {
                    c06467.m15779(c06467.f1298[5], frameMetrics.getMetric(6));
                }
                C0646 c06468 = C0646.this;
                if ((c06468.f1297 & 128) != 0) {
                    c06468.m15779(c06468.f1298[7], frameMetrics.getMetric(0));
                }
                C0646 c06469 = C0646.this;
                if ((c06469.f1297 & 256) != 0) {
                    c06469.m15779(c06469.f1298[8], frameMetrics.getMetric(2));
                }
            }
        }

        public C0646(int i) {
            this.f1297 = i;
        }

        @Override // Yue.C5111.C0647
        /* JADX INFO: renamed from: ۥ */
        public void mo1926(Activity activity) {
            if (f12121 == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f12121 = handlerThread;
                handlerThread.start();
                f12122 = new Handler(f12121.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f1298;
                if (sparseIntArrayArr[i] == null && (this.f1297 & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f12124, f12122);
            this.f12123.add(new WeakReference<>(activity));
        }

        @Override // Yue.C5111.C0647
        /* JADX INFO: renamed from: ۥ۟ */
        public SparseIntArray[] mo1927() {
            return this.f1298;
        }

        @Override // Yue.C5111.C0647
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public SparseIntArray[] mo15776(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f12123.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f12123.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f12124);
            return this.f1298;
        }

        @Override // Yue.C5111.C0647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public SparseIntArray[] mo15777() {
            SparseIntArray[] sparseIntArrayArr = this.f1298;
            this.f1298 = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // Yue.C5111.C0647
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public SparseIntArray[] mo15778() {
            for (int size = this.f12123.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f12123.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f12124);
                    this.f12123.remove(size);
                }
            }
            return this.f1298;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m15779(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / C4720.f10089);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ۟ */
    public static class C0647 {
        /* JADX INFO: renamed from: ۥ */
        public void mo1926(Activity activity) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public SparseIntArray[] mo1927() {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public SparseIntArray[] mo15776(Activity activity) {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public SparseIntArray[] mo15777() {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public SparseIntArray[] mo15778() {
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5113 {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5111() {
        this(1);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1924(@InterfaceC6391 Activity activity) {
        this.f1296.mo1926(activity);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public SparseIntArray[] m1925() {
        return this.f1296.mo1927();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public SparseIntArray[] m15773(@InterfaceC6391 Activity activity) {
        return this.f1296.mo15776(activity);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public SparseIntArray[] m15774() {
        return this.f1296.mo15777();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public SparseIntArray[] m15775() {
        return this.f1296.mo15778();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5111(int i) {
        this.f1296 = new C0646(i);
    }
}
