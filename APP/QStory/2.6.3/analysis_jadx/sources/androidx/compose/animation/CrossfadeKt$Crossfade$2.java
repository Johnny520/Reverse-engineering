package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class CrossfadeKt$Crossfade$2 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC0311 $animationSpec;
    final /* synthetic */ InterfaceC6551 $content;
    final /* synthetic */ InterfaceC2129 $modifier;
    final /* synthetic */ Object $targetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$2(Object obj, InterfaceC2129 interfaceC2129, InterfaceC0311 interfaceC0311, InterfaceC6551 interfaceC6551, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = interfaceC2129;
        this.$animationSpec = interfaceC0311;
        this.$content = interfaceC6551;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        InterfaceC6551 interfaceC6551;
        InterfaceC2129 interfaceC2129;
        InterfaceC0311 interfaceC0311;
        Object obj = this.$targetState;
        InterfaceC2129 interfaceC21292 = this.$modifier;
        InterfaceC0311 interfaceC0311M1013 = this.$animationSpec;
        InterfaceC6551 interfaceC65512 = this.$content;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-160948176);
        if ((iM2471 & 6) == 0) {
            i2 = ((iM2471 & 8) == 0 ? c1324.m2360(obj) : c1324.m2378(obj) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((iM2471 & 48) == 0) {
            i2 |= c1324.m2360(interfaceC21292) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((iM2471 & 384) == 0) {
            i2 |= c1324.m2378(interfaceC0311M1013) ? 256 : 128;
        }
        if ((iM2471 & 3072) == 0) {
            i2 |= c1324.m2378(interfaceC65512) ? 2048 : 1024;
        }
        if (c1324.m2343(i2 & 1, (i2 & 1171) != 1170)) {
            if (i4 != 0) {
                interfaceC21292 = C2125.f6276;
            }
            InterfaceC2129 interfaceC21293 = interfaceC21292;
            if (i5 != 0) {
                interfaceC0311M1013 = AbstractC0330.m1013(0, 7, null);
            }
            interfaceC6551 = interfaceC65512;
            InterfaceC0311 interfaceC03112 = interfaceC0311M1013;
            AbstractC0401.m1110(AbstractC0330.m1016(obj, null, c1324, i2 & 14, 2), interfaceC21293, interfaceC03112, null, interfaceC6551, c1324, (i2 & 1008) | ((i2 << 3) & 57344), 4);
            interfaceC2129 = interfaceC21293;
            interfaceC0311 = interfaceC03112;
        } else {
            interfaceC6551 = interfaceC65512;
            c1324.m2339();
            interfaceC2129 = interfaceC21292;
            interfaceC0311 = interfaceC0311M1013;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new CrossfadeKt$Crossfade$2(obj, interfaceC2129, interfaceC0311, interfaceC6551, iM2471, i3);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
