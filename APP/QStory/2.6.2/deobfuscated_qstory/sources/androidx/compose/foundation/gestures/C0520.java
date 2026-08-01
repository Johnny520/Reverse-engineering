package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.animation.core.C0339;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.InterfaceC1368;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.platform.AbstractC1835;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0520 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1530;

    public /* synthetic */ C0520(int i) {
        this.f1530 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f1530) {
            case 0:
                return AnchoredDraggableNode$drag$2.invokeSuspend$lambda$0(null, null, (C0480) obj);
            case 1:
                return Draggable2DNode$drag$2.invokeSuspend$lambda$0(null, null, (C0480) obj);
            case 2:
                return DraggableNode$drag$2.invokeSuspend$lambda$0(null, null, (C0480) obj);
            case 3:
                return NonTouchScrollingLogicKt$busyReceive$2$job$1.invokeSuspend$lambda$0(((Long) obj).longValue());
            case 4:
                C0536 c0536 = (C0536) obj;
                float f = c0536.f1561;
                long j = c0536.f1560;
                return new C0339(f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), c0536.f1559);
            case 5:
                C0339 c0339 = (C0339) obj;
                float f2 = c0339.f1146;
                float f3 = c0339.f1145;
                float f4 = c0339.f1144;
                long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
                return new C0536(f2, c0339.f1143, (4294967295L & ((long) Float.floatToRawIntBits(f4))) | (jFloatToRawIntBits << 32));
            case 6:
                C1334 c1334 = AbstractC1835.f5335;
                C1253 c1253 = (C1253) ((InterfaceC1368) obj);
                c1253.getClass();
                if (((Context) AbstractC1367.m2473(c1253, c1334)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0534.f1555;
                }
                InterfaceC0531.f1548.getClass();
                return C0539.f1562;
            case 7:
                return Boolean.valueOf(!false);
            default:
                C1643 c1643 = (C1643) obj;
                if (c1643.f4805 && c1643.f4814) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
