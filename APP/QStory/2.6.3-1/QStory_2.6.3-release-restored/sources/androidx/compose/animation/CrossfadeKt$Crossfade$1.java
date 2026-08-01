package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.InterfaceC1157;
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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class CrossfadeKt$Crossfade$1 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC1157 $animationSpec;
    final /* synthetic */ InterfaceC7380 $content;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC2962 $modifier;
    final /* synthetic */ Object $targetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$1(Object obj, InterfaceC2962 interfaceC2962, InterfaceC1157 interfaceC1157, String str, InterfaceC7380 interfaceC7380, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = interfaceC2962;
        this.$animationSpec = interfaceC1157;
        this.$label = str;
        this.$content = interfaceC7380;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        InterfaceC7380 interfaceC7380;
        InterfaceC1157 interfaceC1157;
        String str;
        InterfaceC2962 interfaceC2962;
        Object obj = this.$targetState;
        InterfaceC2962 interfaceC29622 = this.$modifier;
        InterfaceC1157 interfaceC1157M1573 = this.$animationSpec;
        String str2 = this.$label;
        InterfaceC7380 interfaceC73802 = this.$content;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = this.$$default;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-513216493);
        if ((iM3031 & 6) == 0) {
            i2 = ((iM3031 & 8) == 0 ? c2159.m2920(obj) : c2159.m2938(obj) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2920(interfaceC29622) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((iM3031 & 384) == 0) {
            i2 |= c2159.m2938(interfaceC1157M1573) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((iM3031 & 3072) == 0) {
            i2 |= c2159.m2920(str2) ? 2048 : 1024;
        }
        if ((iM3031 & 24576) == 0) {
            i2 |= c2159.m2938(interfaceC73802) ? 16384 : 8192;
        }
        if (c2159.m2903(i2 & 1, (i2 & 9363) != 9362)) {
            if (i4 != 0) {
                interfaceC29622 = C2958.f6621;
            }
            InterfaceC2962 interfaceC29623 = interfaceC29622;
            if (i5 != 0) {
                interfaceC1157M1573 = AbstractC1176.m1573(0, 7, null);
            }
            if (i6 != 0) {
                str2 = "Crossfade";
            }
            interfaceC7380 = interfaceC73802;
            InterfaceC1157 interfaceC11572 = interfaceC1157M1573;
            AbstractC1247.m1670(AbstractC1176.m1576(obj, str2, c2159, (i2 & 14) | ((i2 >> 6) & 112), 0), interfaceC29623, interfaceC11572, null, interfaceC7380, c2159, i2 & 58352, 4);
            str = str2;
            interfaceC2962 = interfaceC29623;
            interfaceC1157 = interfaceC11572;
        } else {
            interfaceC7380 = interfaceC73802;
            c2159.m2899();
            interfaceC1157 = interfaceC1157M1573;
            str = str2;
            interfaceC2962 = interfaceC29622;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new CrossfadeKt$Crossfade$1(obj, interfaceC2962, interfaceC1157, str, interfaceC7380, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
