package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.animation.core.C1185;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.InterfaceC2203;
import androidx.compose.runtime.internal.C2088;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1361 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1876;

    public /* synthetic */ C1361(int i) {
        this.f1876 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f1876) {
            case 0:
                return AnchoredDraggableNode$drag$2.invokeSuspend$lambda$0(null, null, (C1321) obj);
            case 1:
                return Draggable2DNode$drag$2.invokeSuspend$lambda$0(null, null, (C1321) obj);
            case 2:
                return DraggableNode$drag$2.invokeSuspend$lambda$0(null, null, (C1321) obj);
            case 3:
                return NonTouchScrollingLogicKt$busyReceive$2$job$1.invokeSuspend$lambda$0(((Long) obj).longValue());
            case 4:
                C1377 c1377 = (C1377) obj;
                float f = c1377.f1907;
                long j = c1377.f1906;
                return new C1185(f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), c1377.f1905);
            case 5:
                C1185 c1185 = (C1185) obj;
                float f2 = c1185.f1491;
                float f3 = c1185.f1490;
                float f4 = c1185.f1489;
                long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
                return new C1377(f2, c1185.f1488, (4294967295L & ((long) Float.floatToRawIntBits(f4))) | (jFloatToRawIntBits << 32));
            case 6:
                C2169 c2169 = AbstractC2670.f5681;
                C2088 c2088 = (C2088) ((InterfaceC2203) obj);
                c2088.getClass();
                if (((Context) AbstractC2202.m3042(c2088, c2169)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC1375.f1901;
                }
                InterfaceC1372.f1894.getClass();
                return C1380.f1908;
            case 7:
                return Boolean.valueOf(!false);
            default:
                C2478 c2478 = (C2478) obj;
                if (c2478.f5151 && c2478.f5160) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
