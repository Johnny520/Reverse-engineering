package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲈᛳᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2621 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f12895;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC1181 f12896;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public VelocityTracker f12898;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public float f12900;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f12894 = -1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f12899 = -1;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f12897 = -1;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int[] f12893 = {Integer.MAX_VALUE, 0};

    public C2621(Context context, InterfaceC1181 interfaceC1181) {
        this.f12895 = context;
        this.f12896 = interfaceC1181;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4734(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float f;
        float yVelocity;
        long j;
        int i4;
        float f2;
        float fSqrt;
        float f3;
        float[] fArr;
        float f4;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i5 = this.f12899;
        int[] iArr = this.f12893;
        if (i5 == source && this.f12897 == deviceId && this.f12894 == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.f12895;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i6 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i6 >= 34) {
                scaledMinimumFlingVelocity = AbstractC2470.m4523(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i6 >= 34) {
                scaledMaximumFlingVelocity = AbstractC2470.m4518(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f12899 = source;
            this.f12897 = deviceId;
            this.f12894 = i;
            z = true;
        }
        int i7 = iArr[i3];
        VelocityTracker velocityTrackerObtain = this.f12898;
        if (i7 == Integer.MAX_VALUE) {
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.recycle();
                this.f12898 = null;
                return;
            }
            return;
        }
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.f12898 = velocityTrackerObtain;
        }
        Map map = AbstractC1514.f7317;
        velocityTrackerObtain.addMovement(motionEvent);
        float f5 = 0.0f;
        int i8 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC1514.f7317;
            if (!map2.containsKey(velocityTrackerObtain)) {
                map2.put(velocityTrackerObtain, new C1915());
            }
            C1915 c1915 = (C1915) map2.get(velocityTrackerObtain);
            long[] jArr = c1915.f9664;
            long eventTime = motionEvent.getEventTime();
            int i9 = c1915.f9666;
            if (i9 != 0 && eventTime - jArr[c1915.f9662] > 40) {
                c1915.f9666 = i3;
                c1915.f9665 = 0.0f;
                i9 = 0;
            }
            int i10 = (c1915.f9662 + 1) % 20;
            c1915.f9662 = i10;
            if (i9 != 20) {
                c1915.f9666 = i9 + 1;
            }
            c1915.f9663[i10] = motionEvent.getAxisValue(26);
            jArr[c1915.f9662] = eventTime;
        }
        velocityTrackerObtain.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C1915 c19152 = (C1915) AbstractC1514.f7317.get(velocityTrackerObtain);
        if (c19152 != null) {
            float[] fArr2 = c19152.f9663;
            long[] jArr2 = c19152.f9664;
            int i11 = c19152.f9666;
            if (i11 < 2) {
                f2 = Float.MAX_VALUE;
                fSqrt = 0.0f;
                f = 0.0f;
                f4 = fSqrt * 1000.0f;
                c19152.f9665 = f4;
                if (f4 >= (-Math.abs(f2))) {
                    c19152.f9665 = -Math.abs(f2);
                } else if (c19152.f9665 > Math.abs(f2)) {
                    c19152.f9665 = Math.abs(f2);
                }
            } else {
                int i12 = c19152.f9662;
                int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                long j2 = jArr2[i12];
                while (true) {
                    j = jArr2[i13];
                    long j3 = j2 - j;
                    i4 = c19152.f9666;
                    if (j3 <= 100) {
                        break;
                    }
                    c19152.f9666 = i4 - 1;
                    i13 = (i13 + 1) % 20;
                }
                if (i4 >= 2) {
                    if (i4 == 2) {
                        int i14 = (i13 + 1) % 20;
                        if (j != jArr2[i14]) {
                            fSqrt = fArr2[i14] / (r13 - j);
                            f2 = Float.MAX_VALUE;
                            f = 0.0f;
                        }
                    } else {
                        f2 = Float.MAX_VALUE;
                        float fAbs = 0.0f;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            if (i15 >= c19152.f9666 - 1) {
                                break;
                            }
                            int i17 = i15 + i13;
                            long j4 = jArr2[i17 % 20];
                            int i18 = (i17 + 1) % i8;
                            if (jArr2[i18] == j4) {
                                f3 = f5;
                                fArr = fArr2;
                            } else {
                                i16++;
                                f3 = f5;
                                fArr = fArr2;
                                float fSqrt2 = (fAbs < f5 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                                float f6 = fArr[i18] / (jArr2[i18] - j4);
                                fAbs += Math.abs(f6) * (f6 - fSqrt2);
                                if (i16 == i2) {
                                    fAbs *= 0.5f;
                                }
                            }
                            i15++;
                            f5 = f3;
                            fArr2 = fArr;
                            i8 = 20;
                            i2 = 1;
                        }
                        f = f5;
                        fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                    }
                    f4 = fSqrt * 1000.0f;
                    c19152.f9665 = f4;
                    if (f4 >= (-Math.abs(f2))) {
                    }
                }
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC2470.m4520(velocityTrackerObtain, i);
        } else if (i == 0) {
            yVelocity = velocityTrackerObtain.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTrackerObtain.getYVelocity();
        } else {
            C1915 c19153 = (C1915) AbstractC1514.f7317.get(velocityTrackerObtain);
            yVelocity = (c19153 == null || i != 26) ? f : c19153.f9665;
        }
        InterfaceC1181 interfaceC1181 = this.f12896;
        float fMo2375 = interfaceC1181.mo2375() * yVelocity;
        float fSignum = Math.signum(fMo2375);
        if (z || (fSignum != Math.signum(this.f12900) && fSignum != f)) {
            interfaceC1181.mo2376();
        }
        if (Math.abs(fMo2375) < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r1, Math.min(fMo2375, iArr[1]));
        this.f12900 = interfaceC1181.mo2377(fMax) ? fMax : f;
    }
}
