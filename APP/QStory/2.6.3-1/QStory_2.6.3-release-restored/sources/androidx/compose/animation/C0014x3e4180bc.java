package androidx.compose.animation;

import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.animation.LookaheadAnimationVisualDebugHelperKt$CustomizedLookaheadAnimationVisualDebugging$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class C0014x3e4180bc extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC7383 $content;
    final /* synthetic */ long $debugColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014x3e4180bc(long j, InterfaceC7383 interfaceC7383, int i) {
        super(2);
        this.$debugColor = j;
        this.$content = interfaceC7383;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        long j = this.$debugColor;
        InterfaceC7383 interfaceC7383 = this.$content;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = AbstractC1223.f1631;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1657127863);
        if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2921(j) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2938(interfaceC7383) ? 32 : 16;
        }
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            AbstractC2202.m3047(((AbstractC2225) AbstractC1256.f1703.getValue()).mo2988(new C2434(j)), interfaceC7383, c2159, (i2 & 112) | 8);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C0014x3e4180bc(j, interfaceC7383, iM3031);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
