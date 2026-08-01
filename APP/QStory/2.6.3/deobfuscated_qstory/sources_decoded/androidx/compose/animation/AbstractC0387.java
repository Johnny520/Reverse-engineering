package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0320;
import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0348;
import androidx.compose.animation.core.C0354;
import androidx.compose.animation.core.C0357;
import androidx.compose.animation.core.C0362;
import androidx.compose.animation.core.C0364;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2116;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.C2131;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.C1615;
import androidx.compose.ui.graphics.InterfaceC1580;
import androidx.compose.ui.graphics.colorspace.C1489;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.C7906;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0299 f1299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0299 f1300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0357 f1303 = new C0357(new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // p052.InterfaceC6558
        public /* synthetic */ Object invoke(Object obj) {
            return m899invoke__ExYCQ(((C1615) obj).f4728);
        }

        /* JADX INFO: renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final C0348 m899invoke__ExYCQ(long j) {
            int i = C1615.f4726;
            return new C0348(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // p052.InterfaceC6558
        public /* synthetic */ Object invoke(Object obj) {
            return new C1615(m900invokeLIALnN8((C0348) obj));
        }

        /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m900invokeLIALnN8(C0348 c0348) {
            return AbstractC1581.m2900(c0348.f1195, c0348.f1194);
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0299 f1302 = AbstractC0330.m1014(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0299 f1301 = AbstractC0330.m1014(0.0f, 400.0f, null, 5);

    static {
        Map map = AbstractC0320.f1086;
        f1300 = AbstractC0330.m1014(0.0f, 400.0f, new C7908(4294967297L), 1);
        f1299 = AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C0395 m1080(InterfaceC0311 interfaceC0311, int i) {
        if ((i & 1) != 0) {
            interfaceC0311 = AbstractC0330.m1014(0.0f, 400.0f, null, 5);
        }
        return new C0395(new C0429(new C0384(interfaceC0311), (C0433) null, (C0405) null, (C0375) null, (LinkedHashMap) null, 126));
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
    public static C0395 m1081(C0362 c0362, int i) {
        InterfaceC0311 interfaceC0311M1014 = c0362;
        if ((i & 1) != 0) {
            Map map = AbstractC0320.f1086;
            interfaceC0311M1014 = AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1);
        }
        C2115 c2115 = C2119.f6260;
        final EnterExitTransitionKt$expandVertically$1 enterExitTransitionKt$expandVertically$1 = new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                return 0;
            }
        };
        return m1083(interfaceC0311M1014, c2115.equals(C2119.f6262) ? C2119.f6270 : c2115.equals(c2115) ? C2119.f6266 : C2119.f6264, new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7906(m904invokemzRDjE0(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m904invokemzRDjE0(long j) {
                return (((long) ((int) (j >> 32))) << 32) | (((long) ((Number) enterExitTransitionKt$expandVertically$1.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ C0395 m1082() {
        Map map = AbstractC0320.f1086;
        return m1083(AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1), C2119.f6267, new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7906(m903invokemzRDjE0(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m903invokemzRDjE0(long j) {
                return 0L;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0395 m1083(InterfaceC0311 interfaceC0311, C2131 c2131, InterfaceC6558 interfaceC6558) {
        return new C0395(new C0429((C0384) null, (C0433) null, new C0405(interfaceC0311, c2131, interfaceC6558), (C0375) null, (LinkedHashMap) null, 123));
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
    public static C0395 m1084() {
        Map map = AbstractC0320.f1086;
        C0299 c0299M1014 = AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1);
        C2116 c2116 = C2119.f6257;
        final EnterExitTransitionKt$expandHorizontally$1 enterExitTransitionKt$expandHorizontally$1 = new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                return 0;
            }
        };
        return m1083(c0299M1014, c2116.equals(C2119.f6259) ? C2119.f6265 : c2116.equals(c2116) ? C2119.f6268 : C2119.f6264, new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7906(m902invokemzRDjE0(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m902invokemzRDjE0(long j) {
                return (((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) ((Number) enterExitTransitionKt$expandHorizontally$1.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1085(C0364 c0364, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, String str, InterfaceC1373 interfaceC1373, int i, int i2) {
        AbstractC0396 abstractC0396M1088;
        C1324 c1324;
        AbstractC0394 abstractC0394M1089;
        C1324 c13242;
        C0357 c0357;
        C0354 c0354;
        C0354 c03542;
        C0354 c03543;
        C0354 c0354M1017;
        C0354 c0354M10172;
        C0364 c03642;
        C1324 c13243;
        Object c0391;
        AbstractC0396 abstractC03962;
        AbstractC0394 abstractC03942;
        C0357 c03572 = AbstractC0330.f1117;
        boolean z = true;
        boolean z2 = (i2 & 4) != 0;
        C1324 c13244 = (C1324) interfaceC1373;
        Object objM2345 = c13244.m2345();
        C1353 c1353 = C1369.f3974;
        if (objM2345 == c1353) {
            objM2345 = new InterfaceC6543() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                @Override // p052.InterfaceC6543
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
            c13244.m2386(objM2345);
        }
        final InterfaceC6543 interfaceC6543 = (InterfaceC6543) objM2345;
        if (z2) {
            c1324 = (C1324) interfaceC1373;
            c1324.m2392(-167965831);
            abstractC0396M1088 = m1088(c0364, abstractC0396, c1324, 0);
        } else {
            abstractC0396M1088 = abstractC0396;
            c1324 = (C1324) interfaceC1373;
            c1324.m2392(-167964673);
        }
        c1324.m2377(false);
        AbstractC0396 abstractC03963 = abstractC0396M1088;
        if (z2) {
            c13242 = (C1324) interfaceC1373;
            c13242.m2392(-167962954);
            abstractC0394M1089 = m1089(c0364, abstractC0394, c13242, 0);
        } else {
            abstractC0394M1089 = abstractC0394;
            c13242 = (C1324) interfaceC1373;
            c13242.m2392(-167961890);
        }
        c13242.m2377(false);
        AbstractC0394 abstractC03943 = abstractC0394M1089;
        C0429 c0429 = ((C0395) abstractC03963).f1324;
        C0393 c0393 = (C0393) abstractC03943;
        C0429 c04292 = c0393.f1321;
        C0429 c04293 = ((C0395) abstractC03963).f1324;
        boolean z3 = (c04293.f1393 == null && c04292.f1393 == null) ? false : true;
        boolean z4 = (c04293.f1392 == null && c04292.f1392 == null) ? false : true;
        C0354 c0354M10173 = null;
        if (z3) {
            C1324 c13245 = (C1324) interfaceC1373;
            c13245.m2392(-911488127);
            Object objM23452 = c13245.m2345();
            if (objM23452 == c1353) {
                objM23452 = str + " slide";
                c13245.m2386(objM23452);
            }
            C0354 c0354M10174 = AbstractC0330.m1017(c0364, c03572, (String) objM23452, c13245, 384, 0);
            c0357 = c03572;
            c13245.m2377(false);
            c0354 = c0354M10174;
        } else {
            c0357 = c03572;
            C1324 c13246 = (C1324) interfaceC1373;
            c13246.m2392(-911382324);
            c13246.m2377(false);
            c0354 = null;
        }
        if (z4) {
            C1324 c13247 = (C1324) interfaceC1373;
            c13247.m2392(-911290533);
            C0357 c03573 = AbstractC0330.f1114;
            Object objM23453 = c13247.m2345();
            if (objM23453 == c1353) {
                objM23453 = str + " shrink/expand";
                c13247.m2386(objM23453);
            }
            C0354 c0354M10175 = AbstractC0330.m1017(c0364, c03573, (String) objM23453, c13247, 384, 0);
            c13247.m2377(false);
            c03542 = c0354M10175;
        } else {
            C1324 c13248 = (C1324) interfaceC1373;
            c13248.m2392(-911179709);
            c13248.m2377(false);
            c03542 = null;
        }
        if (z4) {
            C1324 c13249 = (C1324) interfaceC1373;
            c13249.m2392(-911106083);
            Object objM23454 = c13249.m2345();
            if (objM23454 == c1353) {
                objM23454 = str + " InterruptionHandlingOffset";
                c13249.m2386(objM23454);
            }
            C0354 c0354M10176 = AbstractC0330.m1017(c0364, c0357, (String) objM23454, c13249, 384, 0);
            c13249.m2377(false);
            c03543 = c0354M10176;
        } else {
            C1324 c132410 = (C1324) interfaceC1373;
            c132410.m2392(-910935677);
            c132410.m2377(false);
            c03543 = null;
        }
        C0429 c04294 = c0393.f1321;
        final boolean z5 = !z4;
        float[] fArr = C1489.f4216;
        C1324 c132411 = (C1324) interfaceC1373;
        c132411.m2392(-910130296);
        c132411.m2377(false);
        C0429 c04295 = ((C0393) abstractC03943).f1321;
        C0357 c03574 = AbstractC0330.f1123;
        boolean z6 = (c04293.f1394 == null && c04295.f1394 == null) ? false : true;
        if (c04293.f1391 == null && c04295.f1391 == null) {
            z = false;
        }
        if (z6) {
            c132411.m2392(-703879421);
            Object objM23455 = c132411.m2345();
            if (objM23455 == c1353) {
                objM23455 = str + " alpha";
                c132411.m2386(objM23455);
            }
            c0354M1017 = AbstractC0330.m1017(c0364, c03574, (String) objM23455, c132411, 384, 0);
            c132411.m2377(false);
        } else {
            c132411.m2392(-703709976);
            c132411.m2377(false);
            c0354M1017 = null;
        }
        if (z) {
            c132411.m2392(-703642333);
            Object objM23456 = c132411.m2345();
            if (objM23456 == c1353) {
                objM23456 = str + " scale";
                c132411.m2386(objM23456);
            }
            c0354M10172 = AbstractC0330.m1017(c0364, c03574, (String) objM23456, c132411, 384, 0);
            c132411.m2377(false);
        } else {
            c132411.m2392(-703472888);
            c132411.m2377(false);
            c0354M10172 = null;
        }
        if (z) {
            c132411.m2392(-703395232);
            c0354M10173 = AbstractC0330.m1017(c0364, f1303, "TransformOriginInterruptionHandling", c132411, 384, 0);
            c03642 = c0364;
            c13243 = c132411;
            c13243.m2377(false);
        } else {
            c03642 = c0364;
            c13243 = c132411;
            c13243.m2392(-703222904);
            c13243.m2377(false);
        }
        C0354 c03544 = c0354M10173;
        boolean zM2378 = c13243.m2378(c0354M1017) | c13243.m2360(abstractC03963) | c13243.m2360(abstractC03943) | c13243.m2378(c0354M10172) | c13243.m2360(c03642) | c13243.m2378(c03544);
        Object objM23457 = c13243.m2345();
        if (zM2378 || objM23457 == c1353) {
            abstractC03962 = abstractC03963;
            abstractC03942 = abstractC03943;
            c0391 = new C0391(c0354M1017, c0354M10172, c0364, abstractC03962, abstractC03942, c03544);
            c13243.m2386(c0391);
        } else {
            c0391 = objM23457;
            abstractC03962 = abstractC03963;
            abstractC03942 = abstractC03943;
        }
        C0391 c03912 = (C0391) c0391;
        boolean zM2379 = c13243.m2379(z5) | c13243.m2360(interfaceC6543);
        Object objM23458 = c13243.m2345();
        if (zM2379 || objM23458 == c1353) {
            objM23458 = new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(InterfaceC1580 interfaceC1580) {
                    ((C1573) interfaceC1580).m2852(!z5 && ((Boolean) interfaceC6543.invoke()).booleanValue());
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1580) obj);
                    return C5176.f14739;
                }
            };
            c13243.m2386(objM23458);
        }
        C2125 c2125 = C2125.f6276;
        return AbstractC1581.m2895(c2125, (InterfaceC6558) objM23458).mo3866(new C0392(c0364, c03542, c03543, c0354, abstractC03962, abstractC03942, interfaceC6543, c03912)).mo3866(c2125);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C0393 m1086(final InterfaceC6558 interfaceC6558) {
        Map map = AbstractC0320.f1086;
        return new C0393(new C0429((C0384) null, new C0433(new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7908(m910invokemHKZG7I(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m910invokemHKZG7I(long j) {
                return ((long) ((Number) interfaceC6558.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32;
            }
        }, AbstractC0330.m1014(0.0f, 400.0f, new C7908(4294967297L), 1)), (C0405) null, (C0375) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C0395 m1087(final InterfaceC6558 interfaceC6558) {
        Map map = AbstractC0320.f1086;
        return new C0395(new C0429((C0384) null, new C0433(new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7908(m908invokemHKZG7I(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m908invokemHKZG7I(long j) {
                return ((long) ((Number) interfaceC6558.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32;
            }
        }, AbstractC0330.m1014(0.0f, 400.0f, new C7908(4294967297L), 1)), (C0405) null, (C0375) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final AbstractC0396 m1088(C0364 c0364, AbstractC0396 abstractC0396, InterfaceC1373 interfaceC1373, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((C1324) interfaceC1373).m2360(c0364)) || (i & 6) == 4;
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        if (z || objM2345 == C1369.f3974) {
            objM2345 = AbstractC1367.m2474(abstractC0396);
            c1324.m2386(objM2345);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
        Object objM1066 = c0364.m1066();
        AbstractC1347 abstractC1347 = (AbstractC1347) c0364.f1241;
        if (objM1066 == abstractC1347.getValue() && c0364.m1066() == EnterExitState.Visible) {
            if (c0364.m1070()) {
                interfaceC1395.setValue(abstractC0396);
            } else {
                interfaceC1395.setValue(AbstractC0396.f1325);
            }
        } else if (abstractC1347.getValue() == EnterExitState.Visible) {
            interfaceC1395.setValue(((AbstractC0396) interfaceC1395.getValue()).m1099(abstractC0396));
        }
        return (AbstractC0396) interfaceC1395.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final AbstractC0394 m1089(C0364 c0364, AbstractC0394 abstractC0394, InterfaceC1373 interfaceC1373, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((C1324) interfaceC1373).m2360(c0364)) || (i & 6) == 4;
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        if (z || objM2345 == C1369.f3974) {
            objM2345 = AbstractC1367.m2474(abstractC0394);
            c1324.m2386(objM2345);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
        Object objM1066 = c0364.m1066();
        AbstractC1347 abstractC1347 = (AbstractC1347) c0364.f1241;
        if (objM1066 == abstractC1347.getValue() && c0364.m1066() == EnterExitState.Visible) {
            if (c0364.m1070()) {
                interfaceC1395.setValue(abstractC0394);
            } else {
                interfaceC1395.setValue(AbstractC0394.f1323);
            }
        } else if (abstractC1347.getValue() != EnterExitState.Visible) {
            interfaceC1395.setValue(((AbstractC0394) interfaceC1395.getValue()).m1098(abstractC0394));
        }
        return (AbstractC0394) interfaceC1395.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C0395 m1090(InterfaceC0311 interfaceC0311, float f) {
        return new C0395(new C0429((C0384) null, (C0433) null, (C0405) null, new C0375(f, C1615.f4727, interfaceC0311), (LinkedHashMap) null, 119));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0393 m1091(C0362 c0362, int i) {
        InterfaceC0311 interfaceC0311M1014 = c0362;
        if ((i & 1) != 0) {
            interfaceC0311M1014 = AbstractC0330.m1014(0.0f, 400.0f, null, 5);
        }
        return new C0393(new C0429(new C0384(interfaceC0311M1014), (C0433) null, (C0405) null, (C0375) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ C0393 m1092() {
        Map map = AbstractC0320.f1086;
        return m1095(AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1), C2119.f6267, new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7906(m906invokemzRDjE0(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m906invokemzRDjE0(long j) {
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
    public static C0393 m1093(C0362 c0362, int i) {
        InterfaceC0311 interfaceC0311M1014 = c0362;
        if ((i & 1) != 0) {
            Map map = AbstractC0320.f1086;
            interfaceC0311M1014 = AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1);
        }
        C2115 c2115 = C2119.f6260;
        final EnterExitTransitionKt$shrinkVertically$1 enterExitTransitionKt$shrinkVertically$1 = new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                return 0;
            }
        };
        return m1095(interfaceC0311M1014, c2115.equals(C2119.f6262) ? C2119.f6270 : c2115.equals(c2115) ? C2119.f6266 : C2119.f6264, new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7906(m907invokemzRDjE0(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m907invokemzRDjE0(long j) {
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
    public static C0393 m1094() {
        Map map = AbstractC0320.f1086;
        C0299 c0299M1014 = AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1);
        C2116 c2116 = C2119.f6257;
        final EnterExitTransitionKt$shrinkHorizontally$1 enterExitTransitionKt$shrinkHorizontally$1 = new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                return 0;
            }
        };
        return m1095(c0299M1014, c2116.equals(C2119.f6259) ? C2119.f6265 : c2116.equals(c2116) ? C2119.f6268 : C2119.f6264, new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                return new C7906(m905invokemzRDjE0(((C7906) obj).f21879));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m905invokemzRDjE0(long j) {
                return (((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) ((Number) enterExitTransitionKt$shrinkHorizontally$1.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0393 m1095(InterfaceC0311 interfaceC0311, C2131 c2131, InterfaceC6558 interfaceC6558) {
        return new C0393(new C0429((C0384) null, (C0433) null, new C0405(interfaceC0311, c2131, interfaceC6558), (C0375) null, (LinkedHashMap) null, 123));
    }
}
