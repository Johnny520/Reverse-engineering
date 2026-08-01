package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1148;
import androidx.compose.animation.core.C1210;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class AnimatedVisibilityKt$AnimatedVisibility$8 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC7380 $content;
    final /* synthetic */ AbstractC1242 $enter;
    final /* synthetic */ AbstractC1240 $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC2962 $modifier;
    final /* synthetic */ C1148 $visibleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$8(C1148 c1148, InterfaceC2962 interfaceC2962, AbstractC1242 abstractC1242, AbstractC1240 abstractC1240, String str, InterfaceC7380 interfaceC7380, int i, int i2) {
        super(2);
        this.$visibleState = c1148;
        this.$modifier = interfaceC2962;
        this.$enter = abstractC1242;
        this.$exit = abstractC1240;
        this.$label = str;
        this.$content = interfaceC7380;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C1148 c1148 = this.$visibleState;
        InterfaceC2962 interfaceC2962 = this.$modifier;
        AbstractC1242 abstractC1242M1659 = this.$enter;
        AbstractC1240 abstractC1240M1658 = this.$exit;
        String str = this.$label;
        InterfaceC7380 interfaceC7380 = this.$content;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = this.$$default;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(657024243);
        if ((iM3031 & 6) == 0) {
            i2 = ((iM3031 & 8) == 0 ? c2159.m2920(c1148) : c2159.m2938(c1148) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2920(interfaceC2962) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((iM3031 & 384) == 0) {
            i2 |= c2159.m2920(abstractC1242M1659) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((iM3031 & 3072) == 0) {
            i2 |= c2159.m2920(abstractC1240M1658) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i2 |= 24576;
        } else if ((iM3031 & 24576) == 0) {
            i2 |= c2159.m2920(str) ? 16384 : 8192;
        }
        if ((196608 & iM3031) == 0) {
            i2 |= c2159.m2938(interfaceC7380) ? 131072 : 65536;
        }
        if (c2159.m2903(i2 & 1, (74899 & i2) != 74898)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            InterfaceC2962 interfaceC29622 = interfaceC2962;
            if (i5 != 0) {
                abstractC1242M1659 = AbstractC1233.m1640(null, 3).m1659(AbstractC1233.m1642());
            }
            if (i6 != 0) {
                abstractC1240M1658 = AbstractC1233.m1651(null, 3).m1658(AbstractC1233.m1652());
            }
            AbstractC1240 abstractC1240 = abstractC1240M1658;
            if (i7 != 0) {
                str = "AnimatedVisibility";
            }
            C1210 c1210M1580 = AbstractC1176.m1580(c1148, str, c2159, (i2 & 14) | ((i2 >> 9) & 112));
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                    @Override // p068.InterfaceC7387
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }

                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }
                };
                c2159.m2946(objM2905);
            }
            int i8 = i2 << 3;
            AbstractC1247.m1671(c1210M1580, (InterfaceC7387) objM2905, interfaceC29622, abstractC1242M1659, abstractC1240, interfaceC7380, c2159, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i2 & Opcodes.ASM7));
            interfaceC7380 = interfaceC7380;
            interfaceC2962 = interfaceC29622;
            abstractC1240M1658 = abstractC1240;
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new AnimatedVisibilityKt$AnimatedVisibility$8(c1148, interfaceC2962, abstractC1242M1659, abstractC1240M1658, str, interfaceC7380, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
