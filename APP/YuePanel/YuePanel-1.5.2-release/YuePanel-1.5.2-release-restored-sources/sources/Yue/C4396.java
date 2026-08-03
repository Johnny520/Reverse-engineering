package Yue;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: Yue.ۥ۠۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4396 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f860;

    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC4397 f861;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC0398 f9046;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final InterfaceC0397 f9047;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public VelocityTracker f9048;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f9049;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f9050;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f9051;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f9052;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int[] f9053;

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠ۧ$ۥ */
    @InterfaceC8392
    public interface InterfaceC0397 {
        /* JADX INFO: renamed from: ۥ */
        float mo1343(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠ۧ$ۥ۟ */
    @InterfaceC8392
    public interface InterfaceC0398 {
        /* JADX INFO: renamed from: ۥ */
        void mo1342(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4396(@InterfaceC6391 Context context, @InterfaceC6391 InterfaceC4397 interfaceC4397) {
        this(context, interfaceC4397, new InterfaceC0398() { // from class: Yue.ۥ۠۟۠ۥ
            @Override // Yue.C4396.InterfaceC0398
            /* JADX INFO: renamed from: ۥ */
            public final void mo1342(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                C4396.m12711(context2, iArr, motionEvent, i);
            }
        }, new InterfaceC0397() { // from class: Yue.ۥ۠۟۠ۦ
            @Override // Yue.C4396.InterfaceC0397
            /* JADX INFO: renamed from: ۥ */
            public final float mo1343(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return C4396.m12712(velocityTracker, motionEvent, i);
            }
        });
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m12711(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C8299.m27598(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = C8299.m27597(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m12712(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        C8173.m4200(velocityTracker, motionEvent);
        C8173.m26963(velocityTracker, 1000);
        return C8173.m26965(velocityTracker, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m12713(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f9051 == source && this.f9052 == deviceId && this.f9050 == i) {
            return false;
        }
        this.f9046.mo1342(this.f860, this.f9053, motionEvent, i);
        this.f9051 = source;
        this.f9052 = deviceId;
        this.f9050 = i;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float m12714(MotionEvent motionEvent, int i) {
        if (this.f9048 == null) {
            this.f9048 = VelocityTracker.obtain();
        }
        return this.f9047.mo1343(this.f9048, motionEvent, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12715(@InterfaceC6391 MotionEvent motionEvent, int i) {
        boolean zM12713 = m12713(motionEvent, i);
        if (this.f9053[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f9048;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9048 = null;
                return;
            }
            return;
        }
        float fM12714 = m12714(motionEvent, i) * this.f861.mo1347();
        float fSignum = Math.signum(fM12714);
        if (zM12713 || (fSignum != Math.signum(this.f9049) && fSignum != 0.0f)) {
            this.f861.mo12716();
        }
        float fAbs = Math.abs(fM12714);
        int[] iArr = this.f9053;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fM12714, iArr[1]));
        this.f9049 = this.f861.mo1346(fMax) ? fMax : 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC8392
    public C4396(Context context, InterfaceC4397 interfaceC4397, InterfaceC0398 interfaceC0398, InterfaceC0397 interfaceC0397) {
        this.f9050 = -1;
        this.f9051 = -1;
        this.f9052 = -1;
        this.f9053 = new int[]{Integer.MAX_VALUE, 0};
        this.f860 = context;
        this.f861 = interfaceC4397;
        this.f9046 = interfaceC0398;
        this.f9047 = interfaceC0397;
    }
}
