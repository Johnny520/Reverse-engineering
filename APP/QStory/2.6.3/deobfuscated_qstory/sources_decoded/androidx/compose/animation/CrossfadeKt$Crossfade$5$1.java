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
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0311 $animationSpec;
    final /* synthetic */ InterfaceC6551 $content;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ C0364 $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(C0364 c0364, InterfaceC0311 interfaceC0311, Object obj, InterfaceC6551 interfaceC6551) {
        super(2);
        this.$this_Crossfade = c0364;
        this.$animationSpec = interfaceC0311;
        this.$stateForContent = obj;
        this.$content = interfaceC6551;
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
        Object objM1066;
        AbstractC1286 abstractC1286M2231;
        InterfaceC6558 interfaceC6558Mo2203;
        AbstractC1286 abstractC1286M2243;
        C1324 c1324 = (C1324) interfaceC1373;
        if (!c1324.m2343(i & 1, (i & 3) != 2)) {
            c1324.m2339();
            return;
        }
        C0364 c0364 = this.$this_Crossfade;
        final InterfaceC0311 interfaceC0311 = this.$animationSpec;
        InterfaceC6551 interfaceC6551 = new InterfaceC6551() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            {
                super(3);
            }

            public final InterfaceC0311 invoke(InterfaceC0353 interfaceC0353, InterfaceC1373 interfaceC13732, int i2) {
                C1324 c13242 = (C1324) interfaceC13732;
                c13242.m2392(955869654);
                InterfaceC0311 interfaceC03112 = interfaceC0311;
                c13242.m2377(false);
                return interfaceC03112;
            }

            @Override // p052.InterfaceC6551
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((InterfaceC0353) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
            }
        };
        Object obj = this.$stateForContent;
        C0357 c0357 = AbstractC0330.f1123;
        boolean zM1070 = c0364.m1070();
        C1353 c1353 = C1369.f3974;
        if (zM1070) {
            c1324.m2392(1666827533);
            c1324.m2377(false);
            objM1066 = c0364.m1066();
        } else {
            c1324.m2392(1666573488);
            boolean zM2360 = c1324.m2360(c0364);
            objM1066 = c1324.m2345();
            if (zM2360 || objM1066 == c1353) {
                abstractC1286M2231 = AbstractC1274.m2231();
                interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
                abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
                try {
                    Object objM10662 = c0364.m1066();
                    AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
                    c1324.m2386(objM10662);
                    objM1066 = objM10662;
                } finally {
                }
            }
            c1324.m2377(false);
        }
        c1324.m2392(1378811975);
        float f = AbstractC4395.m8907(objM1066, obj) ? 1.0f : 0.0f;
        c1324.m2377(false);
        Float fValueOf = Float.valueOf(f);
        boolean zM23602 = c1324.m2360(c0364);
        Object objM2345 = c1324.m2345();
        if (zM23602 || objM2345 == c1353) {
            objM2345 = AbstractC1367.m2496(new C0408(c0364, 0));
            c1324.m2386(objM2345);
        }
        Object value = ((InterfaceC1333) objM2345).getValue();
        c1324.m2392(1378811975);
        float f2 = AbstractC4395.m8907(value, obj) ? 1.0f : 0.0f;
        c1324.m2377(false);
        Float fValueOf2 = Float.valueOf(f2);
        boolean zM23603 = c1324.m2360(c0364);
        Object objM23452 = c1324.m2345();
        if (zM23603 || objM23452 == c1353) {
            objM23452 = AbstractC1367.m2496(new C0408(c0364, 1));
            c1324.m2386(objM23452);
        }
        InterfaceC0311 interfaceC03112 = (InterfaceC0311) interfaceC6551.invoke(((InterfaceC1333) objM23452).getValue(), c1324, 0);
        boolean zM23604 = c1324.m2360(c0364);
        Object objM23453 = c1324.m2345();
        if (zM23604 || objM23453 == c1353) {
            abstractC1286M2231 = AbstractC1274.m2231();
            interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
            abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
            try {
                AbstractC0343 abstractC0343 = (AbstractC0343) c0357.mo1062().invoke(fValueOf2);
                abstractC0343.mo1038();
                C0351 c0351 = new C0351(c0364, fValueOf, abstractC0343, c0357);
                AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
                c1324.m2386(c0351);
                objM23453 = c0351;
            } finally {
            }
        }
        final C0351 c03512 = (C0351) objM23453;
        AbstractC0330.m1009(c0364, c03512, fValueOf, fValueOf2, interfaceC03112, c1324, 0);
        boolean zM23605 = c1324.m2360(c0364) | c1324.m2360(c03512);
        Object objM23454 = c1324.m2345();
        if (zM23605 || objM23454 == c1353) {
            objM23454 = new C0372(c0364, c03512, 5);
            c1324.m2386(objM23454);
        }
        AbstractC1367.m2484(c03512, (InterfaceC6558) objM23454, c1324);
        boolean zM23606 = c1324.m2360(c03512);
        Object objM23455 = c1324.m2345();
        if (zM23606 || objM23455 == c1353) {
            objM23455 = new InterfaceC6558() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                {
                    super(1);
                }

                public final void invoke(InterfaceC1580 interfaceC1580) {
                    ((C1573) interfaceC1580).m2855(CrossfadeKt$Crossfade$5$1.invoke$lambda$1(c03512));
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((InterfaceC1580) obj2);
                    return C5176.f14739;
                }
            };
            c1324.m2386(objM23455);
        }
        InterfaceC2129 interfaceC2129M2895 = AbstractC1581.m2895(C2125.f6276, (InterfaceC6558) objM23455);
        InterfaceC6551 interfaceC65512 = this.$content;
        Object obj2 = this.$stateForContent;
        InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, false);
        int iHashCode = Long.hashCode(c1324.f3837);
        C1253 c1253M2381 = c1324.m2381();
        InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M2895);
        InterfaceC1784.f5222.getClass();
        InterfaceC6543 interfaceC6543 = C1765.f5185;
        c1324.m2396();
        if (c1324.f3838) {
            c1324.m2380(interfaceC6543);
        } else {
            c1324.m2390();
        }
        AbstractC1367.m2472(c1324, interfaceC1658M1451, C1765.f5181);
        AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
        AbstractC1367.m2493(c1324, Integer.valueOf(iHashCode), C1765.f5188);
        AbstractC1367.m2481(c1324, C1765.f5187);
        AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
        interfaceC65512.invoke(obj2, c1324, 0);
        c1324.m2377(true);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
