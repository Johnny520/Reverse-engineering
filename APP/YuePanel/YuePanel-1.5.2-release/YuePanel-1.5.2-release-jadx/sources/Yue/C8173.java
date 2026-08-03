package Yue;

import Yue.InterfaceC7144;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8173 {

    /* JADX INFO: renamed from: ۥ */
    public static Map<VelocityTracker, C8174> f3281 = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۧ$ۥ */
    @InterfaceC7113(34)
    public static class C1449 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m4202(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static float m4203(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m26973(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۧ$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1450 {
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m4200(@InterfaceC6391 VelocityTracker velocityTracker, @InterfaceC6391 MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f3281.containsKey(velocityTracker)) {
                f3281.put(velocityTracker, new C8174());
            }
            f3281.get(velocityTracker).m4204(motionEvent);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4201(@InterfaceC6391 VelocityTracker velocityTracker) {
        velocityTracker.clear();
        m26972(velocityTracker);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m26963(@InterfaceC6391 VelocityTracker velocityTracker, int i) {
        m26964(velocityTracker, i, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m26964(@InterfaceC6391 VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        C8174 c8174M26967 = m26967(velocityTracker);
        if (c8174M26967 != null) {
            c8174M26967.m26976(i, f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m26965(@InterfaceC6391 VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1449.m4202(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        C8174 c8174M26967 = m26967(velocityTracker);
        if (c8174M26967 != null) {
            return c8174M26967.m26977(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m26966(@InterfaceC6391 VelocityTracker velocityTracker, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1449.m4203(velocityTracker, i, i2);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity(i2);
        }
        if (i == 1) {
            return velocityTracker.getYVelocity(i2);
        }
        return 0.0f;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C8174 m26967(VelocityTracker velocityTracker) {
        return f3281.get(velocityTracker);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static float m26968(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static float m26969(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m26970(@InterfaceC6391 VelocityTracker velocityTracker, int i) {
        return Build.VERSION.SDK_INT >= 34 ? C1449.m26973(velocityTracker, i) : i == 26 || i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m26971(@InterfaceC6391 VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        m26972(velocityTracker);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m26972(VelocityTracker velocityTracker) {
        f3281.remove(velocityTracker);
    }
}
