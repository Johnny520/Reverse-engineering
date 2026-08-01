package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.AbstractC0343;
import androidx.compose.animation.core.C0351;
import androidx.compose.animation.core.C0357;
import androidx.compose.animation.core.C0364;
import androidx.compose.animation.core.C0372;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.animation.core.InterfaceC0353;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0311 $animationSpec;
    final /* synthetic */ InterfaceC6550 $content;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ C0364 $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(C0364 c0364, InterfaceC0311 interfaceC0311, Object obj, InterfaceC6550 interfaceC6550) {
        super(2);
        this.$this_Crossfade = c0364;
        this.$animationSpec = interfaceC0311;
        this.$stateForContent = obj;
        this.$content = interfaceC6550;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(InterfaceC1333 interfaceC1333) {
        return ((Number) interfaceC1333.getValue()).floatValue();
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
        Object objM1065;
        AbstractC1286 abstractC1286M2221;
        InterfaceC6557 interfaceC6557Mo2193;
        AbstractC1286 abstractC1286M2233;
        C1324 c1324 = (C1324) interfaceC1373;
        if (!c1324.m2333(i & 1, (i & 3) != 2)) {
            c1324.m2329();
            return;
        }
        C0364 c0364 = this.$this_Crossfade;
        final InterfaceC0311 interfaceC0311 = this.$animationSpec;
        InterfaceC6550 interfaceC6550 = new InterfaceC6550() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            {
                super(3);
            }

            public final InterfaceC0311 invoke(InterfaceC0353 interfaceC0353, InterfaceC1373 interfaceC13732, int i2) {
                C1324 c13242 = (C1324) interfaceC13732;
                c13242.m2382(955869654);
                InterfaceC0311 interfaceC03112 = interfaceC0311;
                c13242.m2367(false);
                return interfaceC03112;
            }

            @Override // p052.InterfaceC6550
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((InterfaceC0353) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
            }
        };
        Object obj = this.$stateForContent;
        C0357 c0357 = AbstractC0330.f1123;
        boolean zM1069 = c0364.m1069();
        C1353 c1353 = C1369.f3973;
        if (zM1069) {
            c1324.m2382(1666827533);
            c1324.m2367(false);
            objM1065 = c0364.m1065();
        } else {
            c1324.m2382(1666573488);
            boolean zM2350 = c1324.m2350(c0364);
            objM1065 = c1324.m2335();
            if (zM2350 || objM1065 == c1353) {
                abstractC1286M2221 = AbstractC1274.m2221();
                interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
                abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
                try {
                    Object objM10652 = c0364.m1065();
                    AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                    c1324.m2376(objM10652);
                    objM1065 = objM10652;
                } finally {
                }
            }
            c1324.m2367(false);
        }
        c1324.m2382(1378811975);
        float f = AbstractC4394.m8917(objM1065, obj) ? 1.0f : 0.0f;
        c1324.m2367(false);
        Float fValueOf = Float.valueOf(f);
        boolean zM23502 = c1324.m2350(c0364);
        Object objM2335 = c1324.m2335();
        if (zM23502 || objM2335 == c1353) {
            objM2335 = AbstractC1367.m2486(new C0408(c0364, 0));
            c1324.m2376(objM2335);
        }
        Object value = ((InterfaceC1333) objM2335).getValue();
        c1324.m2382(1378811975);
        float f2 = AbstractC4394.m8917(value, obj) ? 1.0f : 0.0f;
        c1324.m2367(false);
        Float fValueOf2 = Float.valueOf(f2);
        boolean zM23503 = c1324.m2350(c0364);
        Object objM23352 = c1324.m2335();
        if (zM23503 || objM23352 == c1353) {
            objM23352 = AbstractC1367.m2486(new C0408(c0364, 1));
            c1324.m2376(objM23352);
        }
        InterfaceC0311 interfaceC03112 = (InterfaceC0311) interfaceC6550.invoke(((InterfaceC1333) objM23352).getValue(), c1324, 0);
        boolean zM23504 = c1324.m2350(c0364);
        Object objM23353 = c1324.m2335();
        if (zM23504 || objM23353 == c1353) {
            abstractC1286M2221 = AbstractC1274.m2221();
            interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            try {
                AbstractC0343 abstractC0343 = (AbstractC0343) c0357.mo1061().invoke(fValueOf2);
                abstractC0343.mo1037();
                C0351 c0351 = new C0351(c0364, fValueOf, abstractC0343, c0357);
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                c1324.m2376(c0351);
                objM23353 = c0351;
            } finally {
            }
        }
        final C0351 c03512 = (C0351) objM23353;
        AbstractC0330.m1008(c0364, c03512, fValueOf, fValueOf2, interfaceC03112, c1324, 0);
        boolean zM23505 = c1324.m2350(c0364) | c1324.m2350(c03512);
        Object objM23354 = c1324.m2335();
        if (zM23505 || objM23354 == c1353) {
            objM23354 = new C0372(c0364, c03512, 5);
            c1324.m2376(objM23354);
        }
        AbstractC1367.m2475(c03512, (InterfaceC6557) objM23354, c1324);
        boolean zM23506 = c1324.m2350(c03512);
        Object objM23355 = c1324.m2335();
        if (zM23506 || objM23355 == c1353) {
            objM23355 = new InterfaceC6557() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                {
                    super(1);
                }

                public final void invoke(InterfaceC1580 interfaceC1580) {
                    ((C1573) interfaceC1580).m2845(CrossfadeKt$Crossfade$5$1.invoke$lambda$1(c03512));
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((InterfaceC1580) obj2);
                    return C5175.f14739;
                }
            };
            c1324.m2376(objM23355);
        }
        InterfaceC2129 interfaceC2129M2885 = AbstractC1581.m2885(C2125.f6275, (InterfaceC6557) objM23355);
        InterfaceC6550 interfaceC65502 = this.$content;
        Object obj2 = this.$stateForContent;
        InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, false);
        int iHashCode = Long.hashCode(c1324.f3836);
        C1253 c1253M2371 = c1324.m2371();
        InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129M2885);
        InterfaceC1784.f5221.getClass();
        InterfaceC6542 interfaceC6542 = C1765.f5184;
        c1324.m2386();
        if (c1324.f3837) {
            c1324.m2370(interfaceC6542);
        } else {
            c1324.m2380();
        }
        AbstractC1367.m2464(c1324, interfaceC1658M1441, C1765.f5180);
        AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
        AbstractC1367.m2483(c1324, Integer.valueOf(iHashCode), C1765.f5187);
        AbstractC1367.m2472(c1324, C1765.f5186);
        AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
        interfaceC65502.invoke(obj2, c1324, 0);
        c1324.m2367(true);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
