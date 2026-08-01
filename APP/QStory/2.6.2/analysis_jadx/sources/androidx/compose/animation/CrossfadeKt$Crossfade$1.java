package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class CrossfadeKt$Crossfade$1 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC0311 $animationSpec;
    final /* synthetic */ InterfaceC6550 $content;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC2129 $modifier;
    final /* synthetic */ Object $targetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$1(Object obj, InterfaceC2129 interfaceC2129, InterfaceC0311 interfaceC0311, String str, InterfaceC6550 interfaceC6550, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = interfaceC2129;
        this.$animationSpec = interfaceC0311;
        this.$label = str;
        this.$content = interfaceC6550;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        InterfaceC6550 interfaceC6550;
        InterfaceC0311 interfaceC0311;
        String str;
        InterfaceC2129 interfaceC2129;
        Object obj = this.$targetState;
        InterfaceC2129 interfaceC21292 = this.$modifier;
        InterfaceC0311 interfaceC0311M1012 = this.$animationSpec;
        String str2 = this.$label;
        InterfaceC6550 interfaceC65502 = this.$content;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-513216493);
        if ((iM2460 & 6) == 0) {
            i2 = ((iM2460 & 8) == 0 ? c1324.m2350(obj) : c1324.m2368(obj) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2350(interfaceC21292) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((iM2460 & 384) == 0) {
            i2 |= c1324.m2368(interfaceC0311M1012) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((iM2460 & 3072) == 0) {
            i2 |= c1324.m2350(str2) ? 2048 : 1024;
        }
        if ((iM2460 & 24576) == 0) {
            i2 |= c1324.m2368(interfaceC65502) ? 16384 : 8192;
        }
        if (c1324.m2333(i2 & 1, (i2 & 9363) != 9362)) {
            if (i4 != 0) {
                interfaceC21292 = C2125.f6275;
            }
            InterfaceC2129 interfaceC21293 = interfaceC21292;
            if (i5 != 0) {
                interfaceC0311M1012 = AbstractC0330.m1012(0, 7, null);
            }
            if (i6 != 0) {
                str2 = "Crossfade";
            }
            interfaceC6550 = interfaceC65502;
            InterfaceC0311 interfaceC03112 = interfaceC0311M1012;
            AbstractC0401.m1109(AbstractC0330.m1015(obj, str2, c1324, (i2 & 14) | ((i2 >> 6) & 112), 0), interfaceC21293, interfaceC03112, null, interfaceC6550, c1324, i2 & 58352, 4);
            str = str2;
            interfaceC2129 = interfaceC21293;
            interfaceC0311 = interfaceC03112;
        } else {
            interfaceC6550 = interfaceC65502;
            c1324.m2329();
            interfaceC0311 = interfaceC0311M1012;
            str = str2;
            interfaceC2129 = interfaceC21292;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new CrossfadeKt$Crossfade$1(obj, interfaceC2129, interfaceC0311, str, interfaceC6550, iM2460, i3);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
