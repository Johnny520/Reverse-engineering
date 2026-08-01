package androidx.compose.p001ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.C0984;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2616;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5220;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2798 extends AbstractC2961 implements InterfaceC2616 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Paint f6177;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Object f6178;

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        C2796 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getRectManager();
        Object obj = this.f6178;
        rectManager.getClass();
        if ((AbstractC5220.m9453(0, obj) ? (InterfaceC7372) obj : null) == null) {
            return;
        }
        rectManager.f6166.m1336(obj);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        C2796 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getRectManager();
        InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4241invoke();
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4241invoke() {
                AbstractC2620.m3911(this.this$0);
            }
        };
        rectManager.f6166.m1335(interfaceC7372);
        this.f6178 = interfaceC7372;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        C0984 c0984 = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getRectManager().f6168;
        Canvas canvasM3475 = AbstractC2429.m3475(((C2593) interfaceC2341).f5521.f4629.m946());
        Paint paint = this.f6177;
        long[] jArr = (long[]) c0984.f940;
        int i = c0984.f941;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            canvasM3475.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, paint);
        }
    }
}
