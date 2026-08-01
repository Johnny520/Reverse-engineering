package androidx.compose.animation;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.AbstractC0320;
import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0302;
import androidx.compose.animation.core.C0364;
import androidx.compose.animation.core.C0372;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import java.util.Map;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.C7898;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0401 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C0438 m1109(int i) {
        return new C0438((i & 1) != 0, new InterfaceC6554() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
            @Override // p052.InterfaceC6554
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m891invokeTemP2vQ(((C7906) obj).f21879, ((C7906) obj2).f21879);
            }

            /* JADX INFO: renamed from: invoke-TemP2vQ, reason: not valid java name */
            public final C0299 m891invokeTemP2vQ(long j, long j2) {
                Map map = AbstractC0320.f1086;
                return AbstractC0330.m1014(0.0f, 400.0f, new C7906(4294967297L), 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1110(final androidx.compose.animation.core.C0364 r16, androidx.compose.ui.InterfaceC2129 r17, androidx.compose.animation.core.InterfaceC0311 r18, p052.InterfaceC6558 r19, final p052.InterfaceC6551 r20, androidx.compose.runtime.InterfaceC1373 r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AbstractC0401.m1110(androidx.compose.animation.core.飘花落叶言子苏哲世楪兰, androidx.compose.ui.飘花落叶言子楪哲苏兰世, androidx.compose.animation.core.飘花落叶言子世楪苏哲兰, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1111(final C0364 c0364, final InterfaceC6558 interfaceC6558, final InterfaceC2129 interfaceC2129, final AbstractC0396 abstractC0396, final AbstractC0394 abstractC0394, final InterfaceC6551 interfaceC6551, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        AbstractC0396 abstractC03962;
        AbstractC0394 abstractC03942;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1706321816);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(c0364) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(interfaceC6558) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2360(interfaceC2129) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            abstractC03962 = abstractC0396;
            i2 |= c1324.m2360(abstractC03962) ? 2048 : 1024;
        } else {
            abstractC03962 = abstractC0396;
        }
        if ((i & 24576) == 0) {
            abstractC03942 = abstractC0394;
            i2 |= c1324.m2360(abstractC03942) ? 16384 : 8192;
        } else {
            abstractC03942 = abstractC0394;
        }
        if ((i & 196608) == 0) {
            i2 |= c1324.m2378(interfaceC6551) ? 131072 : 65536;
        }
        if (c1324.m2343(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (z || objM2345 == c1353) {
                objM2345 = new InterfaceC6551() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // p052.InterfaceC6551
                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m894invoke3p2s80s((InterfaceC1653) obj, (InterfaceC1655) obj2, ((C7898) obj3).f21865);
                    }

                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final InterfaceC1657 m894invoke3p2s80s(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
                        long j2;
                        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
                        if (!interfaceC1653.mo1497() || ((Boolean) interfaceC6558.invoke(((AbstractC1347) c0364.f1241).getValue())).booleanValue()) {
                            j2 = (((long) abstractC1724Mo3055.f4999) << 32) | (((long) abstractC1724Mo3055.f4997) & 4294967295L);
                        } else {
                            j2 = 0;
                        }
                        return interfaceC1653.mo1495((int) (j2 >> 32), (int) (j2 & 4294967295L), AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            @Override // p052.InterfaceC6558
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((AbstractC1708) obj);
                                return C5176.f14739;
                            }

                            public final void invoke(AbstractC1708 abstractC1708) {
                                abstractC1708.m3135(abstractC1724Mo3055, 0, 0, 0.0f);
                            }
                        });
                    }
                };
                c1324.m2386(objM2345);
            }
            InterfaceC2129 interfaceC2129M3112 = AbstractC1670.m3112(interfaceC2129, (InterfaceC6551) objM2345);
            Object objM23452 = c1324.m2345();
            if (objM23452 == c1353) {
                objM23452 = new InterfaceC6554() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1
                    @Override // p052.InterfaceC6554
                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                        return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                    }
                };
                c1324.m2386(objM23452);
            }
            m1112(c0364, interfaceC6558, interfaceC2129M3112, abstractC03962, abstractC03942, (InterfaceC6554) objM23452, interfaceC6551, c1324, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i5) {
                    AbstractC0401.m1111(c0364, interfaceC6558, interfaceC2129, abstractC0396, abstractC0394, interfaceC6551, interfaceC13732, AbstractC1367.m2471(i | 1));
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1112(final C0364 c0364, final InterfaceC6558 interfaceC6558, final InterfaceC2129 interfaceC2129, final AbstractC0396 abstractC0396, final AbstractC0394 abstractC0394, final InterfaceC6554 interfaceC6554, InterfaceC6551 interfaceC6551, InterfaceC1373 interfaceC1373, final int i, final int i2) {
        int i3;
        InterfaceC6551 interfaceC65512;
        int i4;
        boolean z;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1912839215);
        if ((i & 6) == 0) {
            i3 = (c1324.m2360(c0364) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c1324.m2378(interfaceC6558) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c1324.m2360(interfaceC2129) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c1324.m2360(abstractC0396) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c1324.m2360(abstractC0394) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c1324.m2378(interfaceC6554) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= (2097152 & i) == 0 ? c1324.m2360(null) : c1324.m2378(null) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i) == 0) {
            i3 |= c1324.m2378(interfaceC6551) ? 8388608 : 4194304;
        }
        if (!c1324.m2343(i3 & 1, (4793491 & i3) != 4793490)) {
            interfaceC65512 = interfaceC6551;
            c1324.m2339();
        } else if (((Boolean) interfaceC6558.invoke(((AbstractC1347) c0364.f1241).getValue())).booleanValue() || ((Boolean) interfaceC6558.invoke(c0364.m1066())).booleanValue() || c0364.m1070() || c0364.m1065()) {
            c1324.m2392(-232386135);
            int i5 = i3 & 14;
            int i6 = i5 | 48;
            int i7 = i6 & 14;
            boolean z2 = ((i7 ^ 6) > 4 && c1324.m2360(c0364)) || (i6 & 6) == 4;
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (z2 || objM2345 == c1353) {
                objM2345 = c0364.m1066();
                c1324.m2386(objM2345);
            }
            if (c0364.m1070()) {
                objM2345 = c0364.m1066();
            }
            c1324.m2392(1844425648);
            EnterExitState enterExitStateM1115 = m1115(c0364, interfaceC6558, objM2345, c1324);
            c1324.m2377(false);
            Object value = ((AbstractC1347) c0364.f1241).getValue();
            c1324.m2392(1844425648);
            EnterExitState enterExitStateM11152 = m1115(c0364, interfaceC6558, value, c1324);
            c1324.m2377(false);
            int i8 = i7 | 3072;
            int i9 = (i8 & 14) ^ 6;
            int i10 = i3;
            boolean z3 = (i9 > 4 && c1324.m2360(c0364)) || (i8 & 6) == 4;
            Object objM23452 = c1324.m2345();
            if (z3 || objM23452 == c1353) {
                i4 = i8;
                objM23452 = new C0364(new C0302(enterExitStateM1115), c0364, AbstractC0053.m151(new StringBuilder(), c0364.f1242, " > EnterExitTransition"));
                c1324.m2386(objM23452);
            } else {
                i4 = i8;
            }
            C0364 c03642 = (C0364) objM23452;
            boolean zM2360 = c1324.m2360(c03642) | ((i9 > 4 && c1324.m2360(c0364)) || (i4 & 6) == 4);
            Object objM23453 = c1324.m2345();
            if (zM2360 || objM23453 == c1353) {
                objM23453 = new C0372(c0364, c03642, 3);
                c1324.m2386(objM23453);
            }
            AbstractC1367.m2484(c03642, (InterfaceC6558) objM23453, c1324);
            if (c0364.m1070()) {
                c03642.m1073(enterExitStateM1115, enterExitStateM11152);
            } else {
                c03642.m1071(enterExitStateM11152);
                ((AbstractC1347) c03642.f1247).setValue(Boolean.FALSE);
            }
            AbstractC0396 abstractC0396M1088 = AbstractC0387.m1088(c03642, abstractC0396, c1324, (i10 >> 6) & 112);
            InterfaceC1395 interfaceC1395 = c03642.f1241;
            AbstractC0394 abstractC0394M1089 = AbstractC0387.m1089(c03642, abstractC0394, c1324, (i10 >> 9) & 112);
            InterfaceC1395 interfaceC1395M2479 = AbstractC1367.m2479(interfaceC6554, c1324);
            Object objInvoke = interfaceC6554.invoke(c03642.m1066(), ((AbstractC1347) interfaceC1395).getValue());
            boolean zM23602 = c1324.m2360(c03642) | c1324.m2360(interfaceC1395M2479);
            Object objM23454 = c1324.m2345();
            if (zM23602 || objM23454 == c1353) {
                objM23454 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(c03642, interfaceC1395M2479, null);
                c1324.m2386(objM23454);
            }
            InterfaceC1395 interfaceC1395M2483 = AbstractC1367.m2483(c1324, objInvoke, (InterfaceC6554) objM23454);
            Object objM1066 = c03642.m1066();
            EnterExitState enterExitState = EnterExitState.PostExit;
            if (objM1066 == enterExitState && ((AbstractC1347) interfaceC1395).getValue() == enterExitState && ((Boolean) interfaceC1395M2483.getValue()).booleanValue()) {
                c1324.m2392(-229368781);
                c1324.m2377(false);
                interfaceC65512 = interfaceC6551;
                z = false;
            } else {
                c1324.m2392(-230699766);
                boolean z4 = i5 == 4;
                Object objM23455 = c1324.m2345();
                if (z4 || objM23455 == c1353) {
                    objM23455 = new C0415(c03642);
                    c1324.m2386(objM23455);
                }
                C0415 c0415 = (C0415) objM23455;
                z = false;
                InterfaceC2129 interfaceC2129M1085 = AbstractC0387.m1085(c03642, abstractC0396M1088, abstractC0394M1089, "Built-in", c1324, 199680, 8);
                c1324.m2392(-7404393);
                c1324.m2377(false);
                InterfaceC2129 interfaceC2129Mo3866 = interfaceC2129.mo3866(interfaceC2129M1085.mo3866(C2125.f6276));
                Object objM23456 = c1324.m2345();
                if (objM23456 == c1353) {
                    objM23456 = new C0420(c0415);
                    c1324.m2386(objM23456);
                }
                C0420 c0420 = (C0420) objM23456;
                int iHashCode = Long.hashCode(c1324.f3837);
                C1253 c1253M2381 = c1324.m2381();
                InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129Mo3866);
                InterfaceC1784.f5222.getClass();
                InterfaceC6543 interfaceC6543 = C1765.f5185;
                c1324.m2396();
                if (c1324.f3838) {
                    c1324.m2380(interfaceC6543);
                } else {
                    c1324.m2390();
                }
                AbstractC1367.m2472(c1324, c0420, C1765.f5181);
                AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
                AbstractC1367.m2493(c1324, Integer.valueOf(iHashCode), C1765.f5188);
                AbstractC1367.m2481(c1324, C1765.f5187);
                AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
                interfaceC65512 = interfaceC6551;
                interfaceC65512.invoke(c0415, c1324, Integer.valueOf((i10 >> 18) & 112));
                c1324.m2377(true);
                c1324.m2377(false);
            }
            c1324.m2377(z);
        } else {
            c1324.m2392(-229362829);
            c1324.m2377(false);
            interfaceC65512 = interfaceC6551;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            final InterfaceC0380 interfaceC0380 = null;
            final InterfaceC6551 interfaceC65513 = interfaceC65512;
            c1389M2375.f4034 = new InterfaceC6554(interfaceC6558, interfaceC2129, abstractC0396, abstractC0394, interfaceC6554, interfaceC0380, interfaceC65513, i, i2) { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ InterfaceC6551 $content;
                final /* synthetic */ AbstractC0396 $enter;
                final /* synthetic */ AbstractC0394 $exit;
                final /* synthetic */ InterfaceC2129 $modifier;
                final /* synthetic */ InterfaceC0380 $onLookaheadMeasured;
                final /* synthetic */ InterfaceC6554 $shouldDisposeBlock;
                final /* synthetic */ InterfaceC6558 $visible;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$content = interfaceC65513;
                    this.$$changed = i;
                    this.$$default = i2;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i11) {
                    AbstractC0401.m1112(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, this.$content, interfaceC13732, AbstractC1367.m2471(this.$$changed | 1), this.$$default);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1113(final java.lang.Object r19, androidx.compose.ui.InterfaceC2129 r20, p052.InterfaceC6558 r21, androidx.compose.ui.InterfaceC2118 r22, java.lang.String r23, p052.InterfaceC6558 r24, final p052.InterfaceC6552 r25, androidx.compose.runtime.InterfaceC1373 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AbstractC0401.m1113(java.lang.Object, androidx.compose.ui.飘花落叶言子楪哲苏兰世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, androidx.compose.ui.飘花落叶言子楪世哲苏兰, java.lang.String, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰苏世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰] */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v33, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰] */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰, androidx.compose.runtime.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r5v23, types: [androidx.compose.runtime.snapshots.SnapshotStateList] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1114(final androidx.compose.animation.core.C0364 r21, androidx.compose.ui.InterfaceC2129 r22, p052.InterfaceC6558 r23, androidx.compose.ui.InterfaceC2118 r24, p052.InterfaceC6558 r25, final p052.InterfaceC6552 r26, androidx.compose.runtime.InterfaceC1373 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AbstractC0401.m1114(androidx.compose.animation.core.飘花落叶言子苏哲世楪兰, androidx.compose.ui.飘花落叶言子楪哲苏兰世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, androidx.compose.ui.飘花落叶言子楪世哲苏兰, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰苏世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final EnterExitState m1115(C0364 c0364, InterfaceC6558 interfaceC6558, Object obj, InterfaceC1373 interfaceC1373) {
        EnterExitState enterExitState;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2342(-422486745, 0, c0364, null);
        if (c0364.m1070()) {
            c1324.m2392(-212166497);
            c1324.m2377(false);
            enterExitState = ((Boolean) interfaceC6558.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) interfaceC6558.invoke(c0364.m1066())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            c1324.m2392(-211892364);
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = AbstractC1367.m2474(Boolean.FALSE);
                c1324.m2386(objM2345);
            }
            InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
            if (((Boolean) interfaceC6558.invoke(c0364.m1066())).booleanValue()) {
                interfaceC1395.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) interfaceC6558.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) interfaceC1395.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            c1324.m2377(false);
        }
        c1324.m2377(false);
        return enterExitState;
    }
}
