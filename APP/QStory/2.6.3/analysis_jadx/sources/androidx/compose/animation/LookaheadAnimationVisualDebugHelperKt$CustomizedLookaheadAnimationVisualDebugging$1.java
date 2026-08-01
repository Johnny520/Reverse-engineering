package androidx.compose.animation;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.C1599;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class LookaheadAnimationVisualDebugHelperKt$CustomizedLookaheadAnimationVisualDebugging$1 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6554 $content;
    final /* synthetic */ long $debugColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadAnimationVisualDebugHelperKt$CustomizedLookaheadAnimationVisualDebugging$1(long j, InterfaceC6554 interfaceC6554, int i) {
        super(2);
        this.$debugColor = j;
        this.$content = interfaceC6554;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        long j = this.$debugColor;
        InterfaceC6554 interfaceC6554 = this.$content;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        int i3 = AbstractC0377.f1286;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1657127863);
        if ((iM2471 & 6) == 0) {
            i2 = (c1324.m2361(j) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        if ((iM2471 & 48) == 0) {
            i2 |= c1324.m2378(interfaceC6554) ? 32 : 16;
        }
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            AbstractC1367.m2487(((AbstractC1390) AbstractC0410.f1358.getValue()).mo2428(new C1599(j)), interfaceC6554, c1324, (i2 & 112) | 8);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new LookaheadAnimationVisualDebugHelperKt$CustomizedLookaheadAnimationVisualDebugging$1(j, interfaceC6554, iM2471);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
