package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.AbstractC1189;
import androidx.compose.animation.core.C1197;
import androidx.compose.animation.core.C1203;
import androidx.compose.animation.core.C1210;
import androidx.compose.animation.core.C1218;
import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.animation.core.InterfaceC1199;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1157 $animationSpec;
    final /* synthetic */ InterfaceC7380 $content;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ C1210 $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(C1210 c1210, InterfaceC1157 interfaceC1157, Object obj, InterfaceC7380 interfaceC7380) {
        super(2);
        this.$this_Crossfade = c1210;
        this.$animationSpec = interfaceC1157;
        this.$stateForContent = obj;
        this.$content = interfaceC7380;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(InterfaceC2168 interfaceC2168) {
        return ((Number) interfaceC2168.getValue()).floatValue();
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
        Object objM1626;
        AbstractC2121 abstractC2121M2791;
        InterfaceC7387 interfaceC7387Mo2763;
        AbstractC2121 abstractC2121M2803;
        C2159 c2159 = (C2159) interfaceC2208;
        if (!c2159.m2903(i & 1, (i & 3) != 2)) {
            c2159.m2899();
            return;
        }
        C1210 c1210 = this.$this_Crossfade;
        final InterfaceC1157 interfaceC1157 = this.$animationSpec;
        InterfaceC7380 interfaceC7380 = new InterfaceC7380() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            {
                super(3);
            }

            public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199, InterfaceC2208 interfaceC22082, int i2) {
                C2159 c21592 = (C2159) interfaceC22082;
                c21592.m2952(955869654);
                InterfaceC1157 interfaceC11572 = interfaceC1157;
                c21592.m2937(false);
                return interfaceC11572;
            }

            @Override // p068.InterfaceC7380
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((InterfaceC1199) obj, (InterfaceC2208) obj2, ((Number) obj3).intValue());
            }
        };
        Object obj = this.$stateForContent;
        C1203 c1203 = AbstractC1176.f1468;
        boolean zM1630 = c1210.m1630();
        C2188 c2188 = C2204.f4319;
        if (zM1630) {
            c2159.m2952(1666827533);
            c2159.m2937(false);
            objM1626 = c1210.m1626();
        } else {
            c2159.m2952(1666573488);
            boolean zM2920 = c2159.m2920(c1210);
            objM1626 = c2159.m2905();
            if (zM2920 || objM1626 == c2188) {
                abstractC2121M2791 = AbstractC2109.m2791();
                interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
                abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
                try {
                    Object objM16262 = c1210.m1626();
                    AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                    c2159.m2946(objM16262);
                    objM1626 = objM16262;
                } finally {
                }
            }
            c2159.m2937(false);
        }
        c2159.m2952(1378811975);
        float f = AbstractC5227.m9466(objM1626, obj) ? 1.0f : 0.0f;
        c2159.m2937(false);
        Float fValueOf = Float.valueOf(f);
        boolean zM29202 = c2159.m2920(c1210);
        Object objM2905 = c2159.m2905();
        if (zM29202 || objM2905 == c2188) {
            objM2905 = AbstractC2202.m3056(new C1254(c1210, 0));
            c2159.m2946(objM2905);
        }
        Object value = ((InterfaceC2168) objM2905).getValue();
        c2159.m2952(1378811975);
        float f2 = AbstractC5227.m9466(value, obj) ? 1.0f : 0.0f;
        c2159.m2937(false);
        Float fValueOf2 = Float.valueOf(f2);
        boolean zM29203 = c2159.m2920(c1210);
        Object objM29052 = c2159.m2905();
        if (zM29203 || objM29052 == c2188) {
            objM29052 = AbstractC2202.m3056(new C1254(c1210, 1));
            c2159.m2946(objM29052);
        }
        InterfaceC1157 interfaceC11572 = (InterfaceC1157) interfaceC7380.invoke(((InterfaceC2168) objM29052).getValue(), c2159, 0);
        boolean zM29204 = c2159.m2920(c1210);
        Object objM29053 = c2159.m2905();
        if (zM29204 || objM29053 == c2188) {
            abstractC2121M2791 = AbstractC2109.m2791();
            interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            try {
                AbstractC1189 abstractC1189 = (AbstractC1189) c1203.mo1622().invoke(fValueOf2);
                abstractC1189.mo1598();
                C1197 c1197 = new C1197(c1210, fValueOf, abstractC1189, c1203);
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                c2159.m2946(c1197);
                objM29053 = c1197;
            } finally {
            }
        }
        final C1197 c11972 = (C1197) objM29053;
        AbstractC1176.m1569(c1210, c11972, fValueOf, fValueOf2, interfaceC11572, c2159, 0);
        boolean zM29205 = c2159.m2920(c1210) | c2159.m2920(c11972);
        Object objM29054 = c2159.m2905();
        if (zM29205 || objM29054 == c2188) {
            objM29054 = new C1218(c1210, c11972, 5);
            c2159.m2946(objM29054);
        }
        AbstractC2202.m3044(c11972, (InterfaceC7387) objM29054, c2159);
        boolean zM29206 = c2159.m2920(c11972);
        Object objM29055 = c2159.m2905();
        if (zM29206 || objM29055 == c2188) {
            objM29055 = new InterfaceC7387() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                {
                    super(1);
                }

                public final void invoke(InterfaceC2415 interfaceC2415) {
                    ((C2408) interfaceC2415).m3415(CrossfadeKt$Crossfade$5$1.invoke$lambda$1(c11972));
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((InterfaceC2415) obj2);
                    return C6008.f15084;
                }
            };
            c2159.m2946(objM29055);
        }
        InterfaceC2962 interfaceC2962M3455 = AbstractC2416.m3455(C2958.f6621, (InterfaceC7387) objM29055);
        InterfaceC7380 interfaceC73802 = this.$content;
        Object obj2 = this.$stateForContent;
        InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, false);
        int iHashCode = Long.hashCode(c2159.f4182);
        C2088 c2088M2941 = c2159.m2941();
        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M3455);
        InterfaceC2619.f5567.getClass();
        InterfaceC7372 interfaceC7372 = C2600.f5530;
        c2159.m2956();
        if (c2159.f4183) {
            c2159.m2940(interfaceC7372);
        } else {
            c2159.m2950();
        }
        AbstractC2202.m3032(c2159, interfaceC2493M2011, C2600.f5526);
        AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
        AbstractC2202.m3053(c2159, Integer.valueOf(iHashCode), C2600.f5533);
        AbstractC2202.m3041(c2159, C2600.f5532);
        AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
        interfaceC73802.invoke(obj2, c2159, 0);
        c2159.m2937(true);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
