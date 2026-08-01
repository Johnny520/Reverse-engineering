package androidx.compose.animation;

import androidx.compose.animation.core.C0364;
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
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AnimatedVisibilityKt$AnimatedVisibility$13 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6550 $content;
    final /* synthetic */ AbstractC0396 $enter;
    final /* synthetic */ AbstractC0394 $exit;
    final /* synthetic */ InterfaceC2129 $modifier;
    final /* synthetic */ C0364 $this_AnimatedVisibility;
    final /* synthetic */ InterfaceC6557 $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$13(C0364 c0364, InterfaceC6557 interfaceC6557, InterfaceC2129 interfaceC2129, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, InterfaceC6550 interfaceC6550, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = c0364;
        this.$visible = interfaceC6557;
        this.$modifier = interfaceC2129;
        this.$enter = abstractC0396;
        this.$exit = abstractC0394;
        this.$content = interfaceC6550;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        AbstractC0396 abstractC0396;
        InterfaceC6550 interfaceC6550;
        AbstractC0394 abstractC0394;
        InterfaceC2129 interfaceC2129;
        C0364 c0364 = this.$this_AnimatedVisibility;
        InterfaceC6557 interfaceC6557 = this.$visible;
        InterfaceC2129 interfaceC21292 = this.$modifier;
        AbstractC0396 abstractC0396M1098 = this.$enter;
        AbstractC0394 abstractC0394M1097 = this.$exit;
        InterfaceC6550 interfaceC65502 = this.$content;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1699747442);
        if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2350(c0364) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2368(interfaceC6557) ? 32 : 16;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 384;
        } else if ((iM2460 & 384) == 0) {
            i2 |= c1324.m2350(interfaceC21292) ? 256 : 128;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 3072;
        } else if ((iM2460 & 3072) == 0) {
            i2 |= c1324.m2350(abstractC0396M1098) ? 2048 : 1024;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i2 |= 24576;
        } else if ((iM2460 & 24576) == 0) {
            i2 |= c1324.m2350(abstractC0394M1097) ? 16384 : 8192;
        }
        if ((196608 & iM2460) == 0) {
            i2 |= c1324.m2368(interfaceC65502) ? 131072 : 65536;
        }
        if (c1324.m2333(i2 & 1, (74899 & i2) != 74898)) {
            if (i4 != 0) {
                interfaceC21292 = C2125.f6275;
            }
            if (i5 != 0) {
                abstractC0396M1098 = AbstractC0387.m1079(null, 3).m1098(AbstractC0387.m1081());
            }
            if (i6 != 0) {
                abstractC0394M1097 = AbstractC0387.m1091().m1097(AbstractC0387.m1090(null, 3));
            }
            int i7 = i2 & 524286;
            AbstractC0394 abstractC03942 = abstractC0394M1097;
            AbstractC0396 abstractC03962 = abstractC0396M1098;
            InterfaceC2129 interfaceC21293 = interfaceC21292;
            AbstractC0401.m1110(c0364, interfaceC6557, interfaceC21293, abstractC03962, abstractC03942, interfaceC65502, c1324, i7);
            interfaceC6550 = interfaceC65502;
            abstractC0394 = abstractC03942;
            abstractC0396 = abstractC03962;
            interfaceC2129 = interfaceC21293;
        } else {
            c1324.m2329();
            abstractC0396 = abstractC0396M1098;
            interfaceC6550 = interfaceC65502;
            abstractC0394 = abstractC0394M1097;
            interfaceC2129 = interfaceC21292;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new AnimatedVisibilityKt$AnimatedVisibility$13(c0364, interfaceC6557, interfaceC2129, abstractC0396, abstractC0394, interfaceC6550, iM2460, i3);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
