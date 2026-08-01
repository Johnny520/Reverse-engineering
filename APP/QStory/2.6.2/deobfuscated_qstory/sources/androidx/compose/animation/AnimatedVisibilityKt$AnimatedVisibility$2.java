package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0364;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AnimatedVisibilityKt$AnimatedVisibility$2 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6550 $content;
    final /* synthetic */ AbstractC0396 $enter;
    final /* synthetic */ AbstractC0394 $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC2129 $modifier;
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$2(boolean z, InterfaceC2129 interfaceC2129, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, String str, InterfaceC6550 interfaceC6550, int i, int i2) {
        super(2);
        this.$visible = z;
        this.$modifier = interfaceC2129;
        this.$enter = abstractC0396;
        this.$exit = abstractC0394;
        this.$label = str;
        this.$content = interfaceC6550;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        boolean z = this.$visible;
        InterfaceC2129 interfaceC2129 = this.$modifier;
        AbstractC0396 abstractC0396M1098 = this.$enter;
        AbstractC0394 abstractC0394M1097 = this.$exit;
        String str = this.$label;
        InterfaceC6550 interfaceC6550 = this.$content;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1448730565);
        if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2369(z) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2350(interfaceC2129) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((iM2460 & 384) == 0) {
            i2 |= c1324.m2350(abstractC0396M1098) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((iM2460 & 3072) == 0) {
            i2 |= c1324.m2350(abstractC0394M1097) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i2 |= 24576;
        } else if ((iM2460 & 24576) == 0) {
            i2 |= c1324.m2350(str) ? 16384 : 8192;
        }
        if ((196608 & iM2460) == 0) {
            i2 |= c1324.m2368(interfaceC6550) ? 131072 : 65536;
        }
        if (c1324.m2333(i2 & 1, (74899 & i2) != 74898)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            InterfaceC2129 interfaceC21292 = interfaceC2129;
            if (i5 != 0) {
                abstractC0396M1098 = AbstractC0387.m1079(null, 3).m1098(AbstractC0387.m1081());
            }
            if (i6 != 0) {
                abstractC0394M1097 = AbstractC0387.m1091().m1097(AbstractC0387.m1090(null, 3));
            }
            AbstractC0394 abstractC0394 = abstractC0394M1097;
            if (i7 != 0) {
                str = "AnimatedVisibility";
            }
            C0364 c0364M1015 = AbstractC0330.m1015(Boolean.valueOf(z), str, c1324, (i2 & 14) | ((i2 >> 9) & 112), 0);
            Object objM2335 = c1324.m2335();
            if (objM2335 == C1369.f3973) {
                objM2335 = new InterfaceC6557() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                    @Override // p052.InterfaceC6557
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }

                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }
                };
                c1324.m2376(objM2335);
            }
            int i8 = i2 << 3;
            AbstractC0401.m1110(c0364M1015, (InterfaceC6557) objM2335, interfaceC21292, abstractC0396M1098, abstractC0394, interfaceC6550, c1324, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i2 & Opcodes.ASM7));
            interfaceC6550 = interfaceC6550;
            interfaceC2129 = interfaceC21292;
            abstractC0394M1097 = abstractC0394;
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new AnimatedVisibilityKt$AnimatedVisibility$2(z, interfaceC2129, abstractC0396M1098, abstractC0394M1097, str, interfaceC6550, iM2460, i3);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
