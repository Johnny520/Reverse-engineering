package p029c2;

import android.view.InputDevice;
import android.view.MotionEvent;
import p376zd.C9987e;

/* JADX INFO: renamed from: c2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1309b {
    /* JADX INFO: renamed from: a */
    public static final int m5270a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return AbstractC1312e.f3932a.m5286a();
                }
                if (i10 != 5) {
                    if (i10 != 6) {
                        return AbstractC1312e.f3932a.m5289d();
                    }
                }
            }
            return AbstractC1312e.f3932a.m5288c();
        }
        return AbstractC1312e.f3932a.m5287b();
    }

    /* JADX INFO: renamed from: b */
    public static final MotionEvent m5271b(InterfaceC1310c interfaceC1310c) {
        interfaceC1310c.getClass();
        return ((C1308a) interfaceC1310c).m5269c();
    }

    /* JADX INFO: renamed from: c */
    public static final int m5272c(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            C9987e.m38645a("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return AbstractC1311d.f3928a.m5279b();
            }
            if (motionRange2 != null && motionRange == null) {
                return AbstractC1311d.f3928a.m5280c();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                    return AbstractC1311d.f3928a.m5279b();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                    return AbstractC1311d.f3928a.m5280c();
                }
            }
        }
        return AbstractC1311d.f3928a.m5278a();
    }
}
