package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0302;
import androidx.compose.animation.core.C0364;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AnimatedVisibilityKt$AnimatedVisibility$8 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6551 $content;
    final /* synthetic */ AbstractC0396 $enter;
    final /* synthetic */ AbstractC0394 $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC2129 $modifier;
    final /* synthetic */ C0302 $visibleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$8(C0302 c0302, InterfaceC2129 interfaceC2129, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, String str, InterfaceC6551 interfaceC6551, int i, int i2) {
        super(2);
        this.$visibleState = c0302;
        this.$modifier = interfaceC2129;
        this.$enter = abstractC0396;
        this.$exit = abstractC0394;
        this.$label = str;
        this.$content = interfaceC6551;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C0302 c0302 = this.$visibleState;
        InterfaceC2129 interfaceC2129 = this.$modifier;
        AbstractC0396 abstractC0396M1099 = this.$enter;
        AbstractC0394 abstractC0394M1098 = this.$exit;
        String str = this.$label;
        InterfaceC6551 interfaceC6551 = this.$content;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(657024243);
        if ((iM2471 & 6) == 0) {
            i2 = ((iM2471 & 8) == 0 ? c1324.m2360(c0302) : c1324.m2378(c0302) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((iM2471 & 48) == 0) {
            i2 |= c1324.m2360(interfaceC2129) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((iM2471 & 384) == 0) {
            i2 |= c1324.m2360(abstractC0396M1099) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((iM2471 & 3072) == 0) {
            i2 |= c1324.m2360(abstractC0394M1098) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i2 |= 24576;
        } else if ((iM2471 & 24576) == 0) {
            i2 |= c1324.m2360(str) ? 16384 : 8192;
        }
        if ((196608 & iM2471) == 0) {
            i2 |= c1324.m2378(interfaceC6551) ? 131072 : 65536;
        }
        if (c1324.m2343(i2 & 1, (74899 & i2) != 74898)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            InterfaceC2129 interfaceC21292 = interfaceC2129;
            if (i5 != 0) {
                abstractC0396M1099 = AbstractC0387.m1080(null, 3).m1099(AbstractC0387.m1082());
            }
            if (i6 != 0) {
                abstractC0394M1098 = AbstractC0387.m1091(null, 3).m1098(AbstractC0387.m1092());
            }
            AbstractC0394 abstractC0394 = abstractC0394M1098;
            if (i7 != 0) {
                str = "AnimatedVisibility";
            }
            C0364 c0364M1020 = AbstractC0330.m1020(c0302, str, c1324, (i2 & 14) | ((i2 >> 9) & 112));
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                    @Override // p052.InterfaceC6558
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }

                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }
                };
                c1324.m2386(objM2345);
            }
            int i8 = i2 << 3;
            AbstractC0401.m1111(c0364M1020, (InterfaceC6558) objM2345, interfaceC21292, abstractC0396M1099, abstractC0394, interfaceC6551, c1324, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i2 & Opcodes.ASM7));
            interfaceC6551 = interfaceC6551;
            interfaceC2129 = interfaceC21292;
            abstractC0394M1098 = abstractC0394;
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new AnimatedVisibilityKt$AnimatedVisibility$8(c0302, interfaceC2129, abstractC0396M1099, abstractC0394M1098, str, interfaceC6551, iM2471, i3);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
