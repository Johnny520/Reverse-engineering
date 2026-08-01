package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1166;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1194;
import androidx.compose.animation.core.C1200;
import androidx.compose.animation.core.C1203;
import androidx.compose.animation.core.C1208;
import androidx.compose.animation.core.C1210;
import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.p001ui.C2948;
import androidx.compose.p001ui.C2949;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.C2964;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.C2450;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import androidx.compose.p001ui.graphics.colorspace.C2324;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.C8735;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1145 f1644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1145 f1645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1203 f1648 = new C1203(new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // p068.InterfaceC7387
        public /* synthetic */ Object invoke(Object obj) {
            return m1459invoke__ExYCQ(((C2450) obj).f5073);
        }

        /* JADX INFO: renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final C1194 m1459invoke__ExYCQ(long j) {
            int i = C2450.f5071;
            return new C1194(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // p068.InterfaceC7387
        public /* synthetic */ Object invoke(Object obj) {
            return new C2450(m1460invokeLIALnN8((C1194) obj));
        }

        /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m1460invokeLIALnN8(C1194 c1194) {
            return AbstractC2416.m3460(c1194.f1540, c1194.f1539);
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1145 f1647 = AbstractC1176.m1574(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1145 f1646 = AbstractC1176.m1574(0.0f, 400.0f, null, 5);

    static {
        Map map = AbstractC1166.f1431;
        f1645 = AbstractC1176.m1574(0.0f, 400.0f, new C8737(4294967297L), 1);
        f1644 = AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C1241 m1640(InterfaceC1157 interfaceC1157, int i) {
        if ((i & 1) != 0) {
            interfaceC1157 = AbstractC1176.m1574(0.0f, 400.0f, null, 5);
        }
        return new C1241(new C1275(new C1230(interfaceC1157), (C1279) null, (C1251) null, (C1221) null, (LinkedHashMap) null, 126));
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C1241 m1641(C1208 c1208, int i) {
        InterfaceC1157 interfaceC1157M1574 = c1208;
        if ((i & 1) != 0) {
            Map map = AbstractC1166.f1431;
            interfaceC1157M1574 = AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1);
        }
        C2948 c2948 = C2952.f6605;
        final EnterExitTransitionKt$expandVertically$1 enterExitTransitionKt$expandVertically$1 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                return 0;
            }
        };
        return m1643(interfaceC1157M1574, c2948.equals(C2952.f6607) ? C2952.f6615 : c2948.equals(c2948) ? C2952.f6611 : C2952.f6609, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8735(m1464invokemzRDjE0(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m1464invokemzRDjE0(long j) {
                return (((long) ((int) (j >> 32))) << 32) | (((long) ((Number) enterExitTransitionKt$expandVertically$1.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ C1241 m1642() {
        Map map = AbstractC1166.f1431;
        return m1643(AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1), C2952.f6612, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8735(m1463invokemzRDjE0(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m1463invokemzRDjE0(long j) {
                return 0L;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1241 m1643(InterfaceC1157 interfaceC1157, C2964 c2964, InterfaceC7387 interfaceC7387) {
        return new C1241(new C1275((C1230) null, (C1279) null, new C1251(interfaceC1157, c2964, interfaceC7387), (C1221) null, (LinkedHashMap) null, 123));
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1241 m1644() {
        Map map = AbstractC1166.f1431;
        C1145 c1145M1574 = AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1);
        C2949 c2949 = C2952.f6602;
        final EnterExitTransitionKt$expandHorizontally$1 enterExitTransitionKt$expandHorizontally$1 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                return 0;
            }
        };
        return m1643(c1145M1574, c2949.equals(C2952.f6604) ? C2952.f6610 : c2949.equals(c2949) ? C2952.f6613 : C2952.f6609, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8735(m1462invokemzRDjE0(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m1462invokemzRDjE0(long j) {
                return (((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) ((Number) enterExitTransitionKt$expandHorizontally$1.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m1645(C1210 c1210, AbstractC1242 abstractC1242, AbstractC1240 abstractC1240, String str, InterfaceC2208 interfaceC2208, int i, int i2) {
        AbstractC1242 abstractC1242M1648;
        C2159 c2159;
        AbstractC1240 abstractC1240M1649;
        C2159 c21592;
        C1203 c1203;
        C1200 c1200;
        C1200 c12002;
        C1200 c12003;
        C1200 c1200M1577;
        C1200 c1200M15772;
        C1210 c12102;
        C2159 c21593;
        Object c1237;
        AbstractC1242 abstractC12422;
        AbstractC1240 abstractC12402;
        C1203 c12032 = AbstractC1176.f1462;
        boolean z = true;
        boolean z2 = (i2 & 4) != 0;
        C2159 c21594 = (C2159) interfaceC2208;
        Object objM2905 = c21594.m2905();
        C2188 c2188 = C2204.f4319;
        if (objM2905 == c2188) {
            objM2905 = new InterfaceC7372() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                @Override // p068.InterfaceC7372
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
            c21594.m2946(objM2905);
        }
        final InterfaceC7372 interfaceC7372 = (InterfaceC7372) objM2905;
        if (z2) {
            c2159 = (C2159) interfaceC2208;
            c2159.m2952(-167965831);
            abstractC1242M1648 = m1648(c1210, abstractC1242, c2159, 0);
        } else {
            abstractC1242M1648 = abstractC1242;
            c2159 = (C2159) interfaceC2208;
            c2159.m2952(-167964673);
        }
        c2159.m2937(false);
        AbstractC1242 abstractC12423 = abstractC1242M1648;
        if (z2) {
            c21592 = (C2159) interfaceC2208;
            c21592.m2952(-167962954);
            abstractC1240M1649 = m1649(c1210, abstractC1240, c21592, 0);
        } else {
            abstractC1240M1649 = abstractC1240;
            c21592 = (C2159) interfaceC2208;
            c21592.m2952(-167961890);
        }
        c21592.m2937(false);
        AbstractC1240 abstractC12403 = abstractC1240M1649;
        C1275 c1275 = ((C1241) abstractC12423).f1669;
        C1239 c1239 = (C1239) abstractC12403;
        C1275 c12752 = c1239.f1666;
        C1275 c12753 = ((C1241) abstractC12423).f1669;
        boolean z3 = (c12753.f1738 == null && c12752.f1738 == null) ? false : true;
        boolean z4 = (c12753.f1737 == null && c12752.f1737 == null) ? false : true;
        C1200 c1200M15773 = null;
        if (z3) {
            C2159 c21595 = (C2159) interfaceC2208;
            c21595.m2952(-911488127);
            Object objM29052 = c21595.m2905();
            if (objM29052 == c2188) {
                objM29052 = str + " slide";
                c21595.m2946(objM29052);
            }
            C1200 c1200M15774 = AbstractC1176.m1577(c1210, c12032, (String) objM29052, c21595, 384, 0);
            c1203 = c12032;
            c21595.m2937(false);
            c1200 = c1200M15774;
        } else {
            c1203 = c12032;
            C2159 c21596 = (C2159) interfaceC2208;
            c21596.m2952(-911382324);
            c21596.m2937(false);
            c1200 = null;
        }
        if (z4) {
            C2159 c21597 = (C2159) interfaceC2208;
            c21597.m2952(-911290533);
            C1203 c12033 = AbstractC1176.f1459;
            Object objM29053 = c21597.m2905();
            if (objM29053 == c2188) {
                objM29053 = str + " shrink/expand";
                c21597.m2946(objM29053);
            }
            C1200 c1200M15775 = AbstractC1176.m1577(c1210, c12033, (String) objM29053, c21597, 384, 0);
            c21597.m2937(false);
            c12002 = c1200M15775;
        } else {
            C2159 c21598 = (C2159) interfaceC2208;
            c21598.m2952(-911179709);
            c21598.m2937(false);
            c12002 = null;
        }
        if (z4) {
            C2159 c21599 = (C2159) interfaceC2208;
            c21599.m2952(-911106083);
            Object objM29054 = c21599.m2905();
            if (objM29054 == c2188) {
                objM29054 = str + " InterruptionHandlingOffset";
                c21599.m2946(objM29054);
            }
            C1200 c1200M15776 = AbstractC1176.m1577(c1210, c1203, (String) objM29054, c21599, 384, 0);
            c21599.m2937(false);
            c12003 = c1200M15776;
        } else {
            C2159 c215910 = (C2159) interfaceC2208;
            c215910.m2952(-910935677);
            c215910.m2937(false);
            c12003 = null;
        }
        C1275 c12754 = c1239.f1666;
        final boolean z5 = !z4;
        float[] fArr = C2324.f4561;
        C2159 c215911 = (C2159) interfaceC2208;
        c215911.m2952(-910130296);
        c215911.m2937(false);
        C1275 c12755 = ((C1239) abstractC12403).f1666;
        C1203 c12034 = AbstractC1176.f1468;
        boolean z6 = (c12753.f1739 == null && c12755.f1739 == null) ? false : true;
        if (c12753.f1736 == null && c12755.f1736 == null) {
            z = false;
        }
        if (z6) {
            c215911.m2952(-703879421);
            Object objM29055 = c215911.m2905();
            if (objM29055 == c2188) {
                objM29055 = str + " alpha";
                c215911.m2946(objM29055);
            }
            c1200M1577 = AbstractC1176.m1577(c1210, c12034, (String) objM29055, c215911, 384, 0);
            c215911.m2937(false);
        } else {
            c215911.m2952(-703709976);
            c215911.m2937(false);
            c1200M1577 = null;
        }
        if (z) {
            c215911.m2952(-703642333);
            Object objM29056 = c215911.m2905();
            if (objM29056 == c2188) {
                objM29056 = str + " scale";
                c215911.m2946(objM29056);
            }
            c1200M15772 = AbstractC1176.m1577(c1210, c12034, (String) objM29056, c215911, 384, 0);
            c215911.m2937(false);
        } else {
            c215911.m2952(-703472888);
            c215911.m2937(false);
            c1200M15772 = null;
        }
        if (z) {
            c215911.m2952(-703395232);
            c1200M15773 = AbstractC1176.m1577(c1210, f1648, "TransformOriginInterruptionHandling", c215911, 384, 0);
            c12102 = c1210;
            c21593 = c215911;
            c21593.m2937(false);
        } else {
            c12102 = c1210;
            c21593 = c215911;
            c21593.m2952(-703222904);
            c21593.m2937(false);
        }
        C1200 c12004 = c1200M15773;
        boolean zM2938 = c21593.m2938(c1200M1577) | c21593.m2920(abstractC12423) | c21593.m2920(abstractC12403) | c21593.m2938(c1200M15772) | c21593.m2920(c12102) | c21593.m2938(c12004);
        Object objM29057 = c21593.m2905();
        if (zM2938 || objM29057 == c2188) {
            abstractC12422 = abstractC12423;
            abstractC12402 = abstractC12403;
            c1237 = new C1237(c1200M1577, c1200M15772, c1210, abstractC12422, abstractC12402, c12004);
            c21593.m2946(c1237);
        } else {
            c1237 = objM29057;
            abstractC12422 = abstractC12423;
            abstractC12402 = abstractC12403;
        }
        C1237 c12372 = (C1237) c1237;
        boolean zM2939 = c21593.m2939(z5) | c21593.m2920(interfaceC7372);
        Object objM29058 = c21593.m2905();
        if (zM2939 || objM29058 == c2188) {
            objM29058 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(InterfaceC2415 interfaceC2415) {
                    ((C2408) interfaceC2415).m3412(!z5 && ((Boolean) interfaceC7372.invoke()).booleanValue());
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC2415) obj);
                    return C6008.f15084;
                }
            };
            c21593.m2946(objM29058);
        }
        C2958 c2958 = C2958.f6621;
        return AbstractC2416.m3455(c2958, (InterfaceC7387) objM29058).mo4426(new C1238(c1210, c12002, c12003, c1200, abstractC12422, abstractC12402, interfaceC7372, c12372)).mo4426(c2958);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C1239 m1646(final InterfaceC7387 interfaceC7387) {
        Map map = AbstractC1166.f1431;
        return new C1239(new C1275((C1230) null, new C1279(new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8737(m1470invokemHKZG7I(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m1470invokemHKZG7I(long j) {
                return ((long) ((Number) interfaceC7387.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32;
            }
        }, AbstractC1176.m1574(0.0f, 400.0f, new C8737(4294967297L), 1)), (C1251) null, (C1221) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C1241 m1647(final InterfaceC7387 interfaceC7387) {
        Map map = AbstractC1166.f1431;
        return new C1241(new C1275((C1230) null, new C1279(new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8737(m1468invokemHKZG7I(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m1468invokemHKZG7I(long j) {
                return ((long) ((Number) interfaceC7387.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32;
            }
        }, AbstractC1176.m1574(0.0f, 400.0f, new C8737(4294967297L), 1)), (C1251) null, (C1221) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final AbstractC1242 m1648(C1210 c1210, AbstractC1242 abstractC1242, InterfaceC2208 interfaceC2208, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((C2159) interfaceC2208).m2920(c1210)) || (i & 6) == 4;
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        if (z || objM2905 == C2204.f4319) {
            objM2905 = AbstractC2202.m3034(abstractC1242);
            c2159.m2946(objM2905);
        }
        InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
        Object objM1626 = c1210.m1626();
        AbstractC2182 abstractC2182 = (AbstractC2182) c1210.f1586;
        if (objM1626 == abstractC2182.getValue() && c1210.m1626() == EnterExitState.Visible) {
            if (c1210.m1630()) {
                interfaceC2230.setValue(abstractC1242);
            } else {
                interfaceC2230.setValue(AbstractC1242.f1670);
            }
        } else if (abstractC2182.getValue() == EnterExitState.Visible) {
            interfaceC2230.setValue(((AbstractC1242) interfaceC2230.getValue()).m1659(abstractC1242));
        }
        return (AbstractC1242) interfaceC2230.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final AbstractC1240 m1649(C1210 c1210, AbstractC1240 abstractC1240, InterfaceC2208 interfaceC2208, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((C2159) interfaceC2208).m2920(c1210)) || (i & 6) == 4;
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        if (z || objM2905 == C2204.f4319) {
            objM2905 = AbstractC2202.m3034(abstractC1240);
            c2159.m2946(objM2905);
        }
        InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
        Object objM1626 = c1210.m1626();
        AbstractC2182 abstractC2182 = (AbstractC2182) c1210.f1586;
        if (objM1626 == abstractC2182.getValue() && c1210.m1626() == EnterExitState.Visible) {
            if (c1210.m1630()) {
                interfaceC2230.setValue(abstractC1240);
            } else {
                interfaceC2230.setValue(AbstractC1240.f1668);
            }
        } else if (abstractC2182.getValue() != EnterExitState.Visible) {
            interfaceC2230.setValue(((AbstractC1240) interfaceC2230.getValue()).m1658(abstractC1240));
        }
        return (AbstractC1240) interfaceC2230.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C1241 m1650(InterfaceC1157 interfaceC1157, float f) {
        return new C1241(new C1275((C1230) null, (C1279) null, (C1251) null, new C1221(f, C2450.f5072, interfaceC1157), (LinkedHashMap) null, 119));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C1239 m1651(C1208 c1208, int i) {
        InterfaceC1157 interfaceC1157M1574 = c1208;
        if ((i & 1) != 0) {
            interfaceC1157M1574 = AbstractC1176.m1574(0.0f, 400.0f, null, 5);
        }
        return new C1239(new C1275(new C1230(interfaceC1157M1574), (C1279) null, (C1251) null, (C1221) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ C1239 m1652() {
        Map map = AbstractC1166.f1431;
        return m1655(AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1), C2952.f6612, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8735(m1466invokemzRDjE0(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m1466invokemzRDjE0(long j) {
                return 0L;
            }
        });
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C1239 m1653(C1208 c1208, int i) {
        InterfaceC1157 interfaceC1157M1574 = c1208;
        if ((i & 1) != 0) {
            Map map = AbstractC1166.f1431;
            interfaceC1157M1574 = AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1);
        }
        C2948 c2948 = C2952.f6605;
        final EnterExitTransitionKt$shrinkVertically$1 enterExitTransitionKt$shrinkVertically$1 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                return 0;
            }
        };
        return m1655(interfaceC1157M1574, c2948.equals(C2952.f6607) ? C2952.f6615 : c2948.equals(c2948) ? C2952.f6611 : C2952.f6609, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8735(m1467invokemzRDjE0(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m1467invokemzRDjE0(long j) {
                return (((long) ((int) (j >> 32))) << 32) | (((long) ((Number) enterExitTransitionKt$shrinkVertically$1.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L);
            }
        });
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C1239 m1654() {
        Map map = AbstractC1166.f1431;
        C1145 c1145M1574 = AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1);
        C2949 c2949 = C2952.f6602;
        final EnterExitTransitionKt$shrinkHorizontally$1 enterExitTransitionKt$shrinkHorizontally$1 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                return 0;
            }
        };
        return m1655(c1145M1574, c2949.equals(C2952.f6604) ? C2952.f6610 : c2949.equals(c2949) ? C2952.f6613 : C2952.f6609, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8735(m1465invokemzRDjE0(((C8735) obj).f22224));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m1465invokemzRDjE0(long j) {
                return (((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) ((Number) enterExitTransitionKt$shrinkHorizontally$1.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1239 m1655(InterfaceC1157 interfaceC1157, C2964 c2964, InterfaceC7387 interfaceC7387) {
        return new C1239(new C1275((C1230) null, (C1279) null, new C1251(interfaceC1157, c2964, interfaceC7387), (C1221) null, (LinkedHashMap) null, 123));
    }
}
