package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class LayoutKt$MultiMeasureLayout$2 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC7383 $content;
    final /* synthetic */ InterfaceC2493 $measurePolicy;
    final /* synthetic */ InterfaceC2962 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$MultiMeasureLayout$2(InterfaceC2962 interfaceC2962, InterfaceC7383 interfaceC7383, InterfaceC2493 interfaceC2493, int i, int i2) {
        super(2);
        this.$modifier = interfaceC2962;
        this.$content = interfaceC7383;
        this.$measurePolicy = interfaceC2493;
        this.$$changed = i;
        this.$$default = i2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        InterfaceC2962 interfaceC2962 = this.$modifier;
        InterfaceC7383 interfaceC7383 = this.$content;
        InterfaceC2493 interfaceC2493 = this.$measurePolicy;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = this.$$default;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1663319424);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM3031 | 6;
        } else if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2938(interfaceC7383) ? 32 : 16;
        }
        if ((iM3031 & 384) == 0) {
            i2 |= c2159.m2920(interfaceC2493) ? 256 : 128;
        }
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            int iHashCode = Integer.hashCode(AbstractC2202.m3048(c2159));
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC7372 interfaceC7372 = C2583.f5436;
            int i5 = ((i2 << 3) & 896) | 6;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            InterfaceC2619.f5567.getClass();
            AbstractC2202.m3032(c2159, interfaceC2493, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3050(c2159, new InterfaceC7387() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C2583) obj);
                    return C6008.f15084;
                }

                public final void invoke(C2583 c2583) {
                    c2583.f5438 = true;
                }
            });
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            interfaceC7383.invoke(c2159, Integer.valueOf((i5 >> 6) & 14));
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        InterfaceC2962 interfaceC29622 = interfaceC2962;
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new LayoutKt$MultiMeasureLayout$2(interfaceC29622, interfaceC7383, interfaceC2493, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
