package androidx.compose.p001ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.viewinterop.AbstractC2909;
import com.google.protobuf.DescriptorProtos$Edition;
import p068.InterfaceC7387;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final StackTraceElement[] f5169;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2469 f5170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2469 f5171 = new C2469(DescriptorProtos$Edition.EDITION_2023_VALUE);

    static {
        new C2469(1007);
        f5170 = new C2469(1008);
        new C2469(1002);
        f5169 = new StackTraceElement[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m3585(C2478 c2478, long j, long j2) {
        int i = c2478.f5164 == 1 ? 1 : 0;
        long j3 = c2478.f5152;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m3586(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m3587(C2478 c2478) {
        return c2478.f5160 && !c2478.f5151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m3588(C2478 c2478) {
        return (c2478.m3582() || !c2478.f5160 || c2478.f5151) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m3589(C2478 c2478) {
        return !c2478.f5160 && c2478.f5151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3590(C2478 c2478) {
        return (c2478.m3582() || c2478.f5160 || !c2478.f5151) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m3591(C2478 c2478, boolean z) {
        long jM13085 = C8158.m13085(c2478.f5152, c2478.f5161);
        if (z || !c2478.m3582()) {
            return jM13085;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m3592(InterfaceC2962 interfaceC2962, final AbstractC2909 abstractC2909) {
        C2475 c2475 = new C2475();
        c2475.f5146 = new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Boolean invoke(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent;
                int actionMasked = motionEvent.getActionMasked();
                AbstractC2909 abstractC29092 = abstractC2909;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = abstractC29092.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = abstractC29092.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        };
        C2461 c2461 = new C2461();
        C2461 c24612 = c2475.f5144;
        if (c24612 != null) {
            c24612.f5095 = null;
        }
        c2475.f5144 = c2461;
        c2461.f5095 = c2475;
        abstractC2909.setOnRequestDisallowInterceptTouchEvent$ui(c2461);
        return interfaceC2962.mo4426(c2475);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m3593(C2487 c2487, long j, InterfaceC7387 interfaceC7387, boolean z) {
        MotionEvent motionEventM3606 = c2487.m3606();
        if (motionEventM3606 == null) {
            C6755.m11869("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM3606.getAction();
        if (z) {
            motionEventM3606.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventM3606.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        interfaceC7387.invoke(motionEventM3606);
        motionEventM3606.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventM3606.setAction(action);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m3594(long j) {
        return "PointerId(value=" + j + ')';
    }
}
