package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.viewinterop.AbstractC2076;
import com.google.protobuf.DescriptorProtos$Edition;
import p052.InterfaceC6558;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1646 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final StackTraceElement[] f4824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1634 f4825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1634 f4826 = new C1634(DescriptorProtos$Edition.EDITION_2023_VALUE);

    static {
        new C1634(1007);
        f4825 = new C1634(1008);
        new C1634(1002);
        f4824 = new StackTraceElement[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m3025(C1643 c1643, long j, long j2) {
        int i = c1643.f4819 == 1 ? 1 : 0;
        long j3 = c1643.f4807;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m3026(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m3027(C1643 c1643) {
        return c1643.f4815 && !c1643.f4806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m3028(C1643 c1643) {
        return (c1643.m3022() || !c1643.f4815 || c1643.f4806) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m3029(C1643 c1643) {
        return !c1643.f4815 && c1643.f4806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3030(C1643 c1643) {
        return (c1643.m3022() || c1643.f4815 || !c1643.f4806) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m3031(C1643 c1643, boolean z) {
        long jM12526 = C7329.m12526(c1643.f4807, c1643.f4816);
        if (z || !c1643.m3022()) {
            return jM12526;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m3032(InterfaceC2129 interfaceC2129, final AbstractC2076 abstractC2076) {
        C1640 c1640 = new C1640();
        c1640.f4801 = new InterfaceC6558() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final Boolean invoke(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent;
                int actionMasked = motionEvent.getActionMasked();
                AbstractC2076 abstractC20762 = abstractC2076;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = abstractC20762.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = abstractC20762.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        };
        C1626 c1626 = new C1626();
        C1626 c16262 = c1640.f4799;
        if (c16262 != null) {
            c16262.f4750 = null;
        }
        c1640.f4799 = c1626;
        c1626.f4750 = c1640;
        abstractC2076.setOnRequestDisallowInterceptTouchEvent$ui(c1626);
        return interfaceC2129.mo3866(c1640);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m3033(C1652 c1652, long j, InterfaceC6558 interfaceC6558, boolean z) {
        MotionEvent motionEventM3046 = c1652.m3046();
        if (motionEventM3046 == null) {
            C5925.m11310("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM3046.getAction();
        if (z) {
            motionEventM3046.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventM3046.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        interfaceC6558.invoke(motionEventM3046);
        motionEventM3046.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventM3046.setAction(action);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m3034(long j) {
        return "PointerId(value=" + j + ')';
    }
}
