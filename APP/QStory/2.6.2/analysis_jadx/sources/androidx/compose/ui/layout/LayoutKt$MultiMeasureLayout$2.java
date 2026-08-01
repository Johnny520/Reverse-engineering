package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class LayoutKt$MultiMeasureLayout$2 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6553 $content;
    final /* synthetic */ InterfaceC1658 $measurePolicy;
    final /* synthetic */ InterfaceC2129 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$MultiMeasureLayout$2(InterfaceC2129 interfaceC2129, InterfaceC6553 interfaceC6553, InterfaceC1658 interfaceC1658, int i, int i2) {
        super(2);
        this.$modifier = interfaceC2129;
        this.$content = interfaceC6553;
        this.$measurePolicy = interfaceC1658;
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
    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        InterfaceC2129 interfaceC2129 = this.$modifier;
        InterfaceC6553 interfaceC6553 = this.$content;
        InterfaceC1658 interfaceC1658 = this.$measurePolicy;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1663319424);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM2460 | 6;
        } else if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2368(interfaceC6553) ? 32 : 16;
        }
        if ((iM2460 & 384) == 0) {
            i2 |= c1324.m2350(interfaceC1658) ? 256 : 128;
        }
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            int iHashCode = Integer.hashCode(AbstractC1367.m2479(c1324));
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC6542 interfaceC6542 = C1748.f5090;
            int i5 = ((i2 << 3) & 896) | 6;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            InterfaceC1784.f5221.getClass();
            AbstractC1367.m2464(c1324, interfaceC1658, C1765.f5180);
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2481(c1324, new InterfaceC6557() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C1748) obj);
                    return C5175.f14739;
                }

                public final void invoke(C1748 c1748) {
                    c1748.f5092 = true;
                }
            });
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            interfaceC6553.invoke(c1324, Integer.valueOf((i5 >> 6) & 14));
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        InterfaceC2129 interfaceC21292 = interfaceC2129;
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new LayoutKt$MultiMeasureLayout$2(interfaceC21292, interfaceC6553, interfaceC1658, iM2460, i3);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
