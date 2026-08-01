package androidx.compose.animation;

import androidx.compose.animation.core.C1210;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class AnimatedVisibilityKt$AnimatedVisibility$13 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC7380 $content;
    final /* synthetic */ AbstractC1242 $enter;
    final /* synthetic */ AbstractC1240 $exit;
    final /* synthetic */ InterfaceC2962 $modifier;
    final /* synthetic */ C1210 $this_AnimatedVisibility;
    final /* synthetic */ InterfaceC7387 $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$13(C1210 c1210, InterfaceC7387 interfaceC7387, InterfaceC2962 interfaceC2962, AbstractC1242 abstractC1242, AbstractC1240 abstractC1240, InterfaceC7380 interfaceC7380, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = c1210;
        this.$visible = interfaceC7387;
        this.$modifier = interfaceC2962;
        this.$enter = abstractC1242;
        this.$exit = abstractC1240;
        this.$content = interfaceC7380;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        AbstractC1242 abstractC1242;
        InterfaceC7380 interfaceC7380;
        AbstractC1240 abstractC1240;
        InterfaceC2962 interfaceC2962;
        C1210 c1210 = this.$this_AnimatedVisibility;
        InterfaceC7387 interfaceC7387 = this.$visible;
        InterfaceC2962 interfaceC29622 = this.$modifier;
        AbstractC1242 abstractC1242M1659 = this.$enter;
        AbstractC1240 abstractC1240M1658 = this.$exit;
        InterfaceC7380 interfaceC73802 = this.$content;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = this.$$default;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1699747442);
        if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2920(c1210) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2938(interfaceC7387) ? 32 : 16;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 384;
        } else if ((iM3031 & 384) == 0) {
            i2 |= c2159.m2920(interfaceC29622) ? 256 : 128;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 3072;
        } else if ((iM3031 & 3072) == 0) {
            i2 |= c2159.m2920(abstractC1242M1659) ? 2048 : 1024;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i2 |= 24576;
        } else if ((iM3031 & 24576) == 0) {
            i2 |= c2159.m2920(abstractC1240M1658) ? 16384 : 8192;
        }
        if ((196608 & iM3031) == 0) {
            i2 |= c2159.m2938(interfaceC73802) ? 131072 : 65536;
        }
        if (c2159.m2903(i2 & 1, (74899 & i2) != 74898)) {
            if (i4 != 0) {
                interfaceC29622 = C2958.f6621;
            }
            if (i5 != 0) {
                abstractC1242M1659 = AbstractC1233.m1640(null, 3).m1659(AbstractC1233.m1642());
            }
            if (i6 != 0) {
                abstractC1240M1658 = AbstractC1233.m1652().m1658(AbstractC1233.m1651(null, 3));
            }
            int i7 = i2 & 524286;
            AbstractC1240 abstractC12402 = abstractC1240M1658;
            AbstractC1242 abstractC12422 = abstractC1242M1659;
            InterfaceC2962 interfaceC29623 = interfaceC29622;
            AbstractC1247.m1671(c1210, interfaceC7387, interfaceC29623, abstractC12422, abstractC12402, interfaceC73802, c2159, i7);
            interfaceC7380 = interfaceC73802;
            abstractC1240 = abstractC12402;
            abstractC1242 = abstractC12422;
            interfaceC2962 = interfaceC29623;
        } else {
            c2159.m2899();
            abstractC1242 = abstractC1242M1659;
            interfaceC7380 = interfaceC73802;
            abstractC1240 = abstractC1240M1658;
            interfaceC2962 = interfaceC29622;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new AnimatedVisibilityKt$AnimatedVisibility$13(c1210, interfaceC7387, interfaceC2962, abstractC1242, abstractC1240, interfaceC7380, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
