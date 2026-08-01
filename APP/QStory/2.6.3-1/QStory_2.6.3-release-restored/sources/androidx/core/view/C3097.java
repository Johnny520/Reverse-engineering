package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3097 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f6918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public VelocityTracker f6919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3098 f6920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f6921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6917 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6916 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f6923 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int[] f6922 = {Integer.MAX_VALUE, 0};

    public C3097(Context context, InterfaceC3098 interfaceC3098) {
        this.f6921 = context;
        this.f6920 = interfaceC3098;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4784(MotionEvent motionEvent, int i) {
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
        int i5 = this.f6916;
        int[] iArr = this.f6922;
        if (i5 == source && this.f6923 == deviceId && this.f6917 == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.f6921;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i6 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i6 >= 34) {
                scaledMinimumFlingVelocity = AbstractC3031.m4567(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
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
                scaledMaximumFlingVelocity = AbstractC3031.m4568(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f6916 = source;
            this.f6923 = deviceId;
            this.f6917 = i;
            z = true;
        }
        int i7 = iArr[i3];
        VelocityTracker velocityTracker = this.f6919;
        if (i7 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6919 = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.f6919 = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f6919;
        Map map = AbstractC3030.f6818;
        velocityTracker2.addMovement(motionEvent);
        float f5 = 0.0f;
        int i8 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC3030.f6818;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C3033());
            }
            C3033 c3033 = (C3033) map2.get(velocityTracker2);
            long[] jArr = c3033.f6822;
            long eventTime = motionEvent.getEventTime();
            if (c3033.f6820 != 0 && eventTime - jArr[c3033.f6819] > 40) {
                c3033.f6820 = i3;
                c3033.f6821 = 0.0f;
            }
            int i9 = (c3033.f6819 + 1) % 20;
            c3033.f6819 = i9;
            int i10 = c3033.f6820;
            if (i10 != 20) {
                c3033.f6820 = i10 + 1;
            }
            c3033.f6823[i9] = motionEvent.getAxisValue(26);
            jArr[c3033.f6819] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, Float.MAX_VALUE);
        C3033 c30332 = (C3033) AbstractC3030.f6818.get(velocityTracker2);
        if (c30332 != null) {
            float[] fArr2 = c30332.f6823;
            long[] jArr2 = c30332.f6822;
            int i11 = c30332.f6820;
            if (i11 < 2) {
                f2 = Float.MAX_VALUE;
                fSqrt = 0.0f;
                f = 0.0f;
                f4 = fSqrt * 1000.0f;
                c30332.f6821 = f4;
                if (f4 >= (-Math.abs(f2))) {
                    c30332.f6821 = -Math.abs(f2);
                } else if (c30332.f6821 > Math.abs(f2)) {
                    c30332.f6821 = Math.abs(f2);
                }
            } else {
                int i12 = c30332.f6819;
                int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                long j2 = jArr2[i12];
                while (true) {
                    j = jArr2[i13];
                    long j3 = j2 - j;
                    i4 = c30332.f6820;
                    if (j3 <= 100) {
                        break;
                    }
                    c30332.f6820 = i4 - 1;
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
                            if (i15 >= c30332.f6820 - 1) {
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
                    c30332.f6821 = f4;
                    if (f4 >= (-Math.abs(f2))) {
                    }
                }
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC3031.m4569(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            C3033 c30333 = (C3033) AbstractC3030.f6818.get(velocityTracker2);
            yVelocity = (c30333 == null || i != 26) ? f : c30333.f6821;
        }
        InterfaceC3098 interfaceC3098 = this.f6920;
        float fMo4713 = interfaceC3098.mo4713() * yVelocity;
        float fSignum = Math.signum(fMo4713);
        if (z || (fSignum != Math.signum(this.f6918) && fSignum != f)) {
            interfaceC3098.mo4712();
        }
        if (Math.abs(fMo4713) < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r1, Math.min(fMo4713, iArr[1]));
        this.f6918 = interfaceC3098.mo4724(fMax) ? fMax : f;
    }
}
