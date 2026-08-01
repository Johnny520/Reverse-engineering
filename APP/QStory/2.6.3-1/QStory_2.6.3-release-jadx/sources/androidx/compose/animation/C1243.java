package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1200;
import androidx.compose.animation.core.C1201;
import androidx.compose.animation.core.C1210;
import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.animation.core.InterfaceC1199;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2964;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.C2450;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2168;
import io.ktor.util.C5043;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.AbstractC8726;
import p221.C8735;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1243 extends AbstractC1227 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final InterfaceC7387 f1671;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f1672 = -9223372034707292160L;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1237 f1673;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC7387 f1674;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public InterfaceC2951 f1675;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1210 f1676;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC7372 f1677;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public AbstractC1240 f1678;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC1242 f1679;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1200 f1680;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1200 f1681;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1200 f1682;

    public C1243(C1210 c1210, C1200 c1200, C1200 c12002, C1200 c12003, AbstractC1242 abstractC1242, AbstractC1240 abstractC1240, InterfaceC7372 interfaceC7372, C1237 c1237) {
        this.f1676 = c1210;
        this.f1682 = c1200;
        this.f1681 = c12002;
        this.f1680 = c12003;
        this.f1679 = abstractC1242;
        this.f1678 = abstractC1240;
        this.f1677 = interfaceC7372;
        this.f1673 = c1237;
        AbstractC8726.m13883(0, 0, 0, 0, 15);
        this.f1674 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199) {
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                InterfaceC1157 interfaceC1157 = null;
                if (interfaceC1199.m1618(enterExitState, enterExitState2)) {
                    C1251 c1251 = ((C1241) this.this$0.f1679).f1669.f1737;
                    if (c1251 != null) {
                        interfaceC1157 = c1251.f1693;
                    }
                } else if (interfaceC1199.m1618(enterExitState2, EnterExitState.PostExit)) {
                    C1251 c12512 = ((C1239) this.this$0.f1678).f1666.f1737;
                    if (c12512 != null) {
                        interfaceC1157 = c12512.f1693;
                    }
                } else {
                    interfaceC1157 = AbstractC1233.f1644;
                }
                return interfaceC1157 == null ? AbstractC1233.f1644 : interfaceC1157;
            }
        };
        this.f1671 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199) {
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (interfaceC1199.m1618(enterExitState, enterExitState2)) {
                    C1279 c1279 = ((C1241) this.this$0.f1679).f1669.f1738;
                    return c1279 != null ? c1279.f1741 : AbstractC1233.f1645;
                }
                if (!interfaceC1199.m1618(enterExitState2, EnterExitState.PostExit)) {
                    return AbstractC1233.f1645;
                }
                C1279 c12792 = ((C1239) this.this$0.f1678).f1666.f1738;
                return c12792 != null ? c12792.f1741 : AbstractC1233.f1645;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final InterfaceC2951 m1660() {
        if (this.f1676.m1623().m1618(EnterExitState.PreEnter, EnterExitState.Visible)) {
            C1251 c1251 = ((C1241) this.f1679).f1669.f1737;
            if (c1251 != null) {
                return c1251.f1695;
            }
            C1251 c12512 = ((C1239) this.f1678).f1666.f1737;
            if (c12512 != null) {
                return c12512.f1695;
            }
            return null;
        }
        C1251 c12513 = ((C1239) this.f1678).f1666.f1737;
        if (c12513 != null) {
            return c12513.f1695;
        }
        C1251 c12514 = ((C1241) this.f1679).f1669.f1737;
        if (c12514 != null) {
            return c12514.f1695;
        }
        return null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void mo1661() {
        this.f1672 = -9223372034707292160L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final C2450 c2450;
        char c;
        long j2;
        if (this.f1676.m1626() == ((AbstractC2182) this.f1676.f1586).getValue()) {
            this.f1675 = null;
        } else if (this.f1675 == null) {
            InterfaceC2951 interfaceC2951M1660 = m1660();
            if (interfaceC2951M1660 == null) {
                interfaceC2951M1660 = C2952.f6617;
            }
            this.f1675 = interfaceC2951M1660;
        }
        if (interfaceC2488.mo2057()) {
            final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
            long j3 = (((long) abstractC2559Mo3615.f5344) << 32) | (((long) abstractC2559Mo3615.f5342) & 4294967295L);
            this.f1672 = j3;
            return interfaceC2488.mo2055((int) (j3 >> 32), (int) (j3 & 4294967295L), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC2543) obj);
                    return C6008.f15084;
                }

                public final void invoke(AbstractC2543 abstractC2543) {
                    abstractC2543.m3695(abstractC2559Mo3615, 0, 0, 0.0f);
                }
            });
        }
        if (!((Boolean) this.f1677.invoke()).booleanValue()) {
            final AbstractC2559 abstractC2559Mo36152 = interfaceC2490.mo3615(j);
            return interfaceC2488.mo2055(abstractC2559Mo36152.f5344, abstractC2559Mo36152.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC2543) obj);
                    return C6008.f15084;
                }

                public final void invoke(AbstractC2543 abstractC2543) {
                    abstractC2543.m3695(abstractC2559Mo36152, 0, 0, 0.0f);
                }
            });
        }
        C1237 c1237 = this.f1673;
        C1200 c1200 = c1237.f1657;
        C1200 c12002 = c1237.f1656;
        C1210 c1210 = c1237.f1655;
        final AbstractC1242 abstractC1242 = c1237.f1654;
        final AbstractC1240 abstractC1240 = c1237.f1653;
        C1200 c12003 = c1237.f1652;
        final C1201 c1201M1619 = c1200 != null ? c1200.m1619(new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199) {
                InterfaceC1157 interfaceC1157;
                InterfaceC1157 interfaceC11572;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (interfaceC1199.m1618(enterExitState, enterExitState2)) {
                    C1230 c1230 = ((C1241) abstractC1242).f1669.f1739;
                    return (c1230 == null || (interfaceC11572 = c1230.f1640) == null) ? AbstractC1233.f1647 : interfaceC11572;
                }
                if (!interfaceC1199.m1618(enterExitState2, EnterExitState.PostExit)) {
                    return AbstractC1233.f1647;
                }
                C1230 c12302 = ((C1239) abstractC1240).f1666.f1739;
                return (c12302 == null || (interfaceC1157 = c12302.f1640) == null) ? AbstractC1233.f1647 : interfaceC1157;
            }
        }, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
            @Override // p068.InterfaceC7387
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Float invoke(EnterExitState enterExitState) {
                int i = AbstractC1236.f1651[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C5043.m9170();
                            return null;
                        }
                        if (((C1239) abstractC1240).f1666.f1739 != null) {
                            f = 0.0f;
                        }
                    } else if (((C1241) abstractC1242).f1669.f1739 != null) {
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        final C1201 c1201M16192 = c12002 != null ? c12002.m1619(new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199) {
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (interfaceC1199.m1618(enterExitState, enterExitState2)) {
                    C1221 c1221 = ((C1241) abstractC1242).f1669.f1736;
                    return c1221 != null ? c1221.f1628 : AbstractC1233.f1647;
                }
                if (!interfaceC1199.m1618(enterExitState2, EnterExitState.PostExit)) {
                    return AbstractC1233.f1647;
                }
                C1221 c12212 = ((C1239) abstractC1240).f1666.f1736;
                return c12212 != null ? c12212.f1628 : AbstractC1233.f1647;
            }
        }, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Float invoke(EnterExitState enterExitState) {
                int i = AbstractC1235.f1650[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        C1221 c1221 = ((C1241) abstractC1242).f1669.f1736;
                        if (c1221 != null) {
                            f = c1221.f1630;
                        }
                    } else {
                        if (i != 3) {
                            C5043.m9170();
                            return null;
                        }
                        C1221 c12212 = ((C1239) abstractC1240).f1666.f1736;
                        if (c12212 != null) {
                            f = c12212.f1630;
                        }
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        if (c1210.m1626() == EnterExitState.PreEnter) {
            C1221 c1221 = ((C1241) abstractC1242).f1669.f1736;
            if (c1221 != null) {
                c2450 = new C2450(c1221.f1629);
            } else {
                C1221 c12212 = ((C1239) abstractC1240).f1666.f1736;
                c2450 = c12212 != null ? new C2450(c12212.f1629) : null;
            }
        } else {
            C1221 c12213 = ((C1239) abstractC1240).f1666.f1736;
            if (c12213 != null) {
                c2450 = new C2450(c12213.f1629);
            } else {
                C1221 c12214 = ((C1241) abstractC1242).f1669.f1736;
                if (c12214 != null) {
                    c2450 = new C2450(c12214.f1629);
                }
            }
        }
        final C1201 c1201M16193 = c12003 != null ? c12003.m1619(new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
            @Override // p068.InterfaceC7387
            public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199) {
                return AbstractC1176.m1574(0.0f, 0.0f, null, 7);
            }
        }, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C2450(m1461invokeLIALnN8((EnterExitState) obj));
            }

            /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
            public final long m1461invokeLIALnN8(EnterExitState enterExitState) {
                C2450 c24502;
                int i = AbstractC1234.f1649[enterExitState.ordinal()];
                if (i != 1) {
                    c24502 = null;
                    if (i == 2) {
                        C1221 c12215 = ((C1241) abstractC1242).f1669.f1736;
                        if (c12215 != null) {
                            c24502 = new C2450(c12215.f1629);
                        } else {
                            C1221 c12216 = ((C1239) abstractC1240).f1666.f1736;
                            if (c12216 != null) {
                                c24502 = new C2450(c12216.f1629);
                            }
                        }
                    } else {
                        if (i != 3) {
                            C5043.m9170();
                            return 0L;
                        }
                        C1221 c12217 = ((C1239) abstractC1240).f1666.f1736;
                        if (c12217 != null) {
                            c24502 = new C2450(c12217.f1629);
                        } else {
                            C1221 c12218 = ((C1241) abstractC1242).f1669.f1736;
                            if (c12218 != null) {
                                c24502 = new C2450(c12218.f1629);
                            }
                        }
                    }
                } else {
                    c24502 = c2450;
                }
                return c24502 != null ? c24502.f5073 : C2450.f5072;
            }
        }) : null;
        final InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC2415 interfaceC2415) {
                InterfaceC2168 interfaceC2168 = c1201M1619;
                C2408 c2408 = (C2408) interfaceC2415;
                c2408.m3415(interfaceC2168 != null ? ((Number) interfaceC2168.getValue()).floatValue() : 1.0f);
                InterfaceC2168 interfaceC21682 = c1201M16192;
                c2408.m3425(interfaceC21682 != null ? ((Number) interfaceC21682.getValue()).floatValue() : 1.0f);
                InterfaceC2168 interfaceC21683 = c1201M16192;
                c2408.m3426(interfaceC21683 != null ? ((Number) interfaceC21683.getValue()).floatValue() : 1.0f);
                InterfaceC2168 interfaceC21684 = c1201M16193;
                c2408.m3421(interfaceC21684 != null ? ((C2450) interfaceC21684.getValue()).f5073 : C2450.f5072);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2415) obj);
                return C6008.f15084;
            }
        };
        final AbstractC2559 abstractC2559Mo36153 = interfaceC2490.mo3615(j);
        long j4 = (((long) abstractC2559Mo36153.f5344) << 32) | (((long) abstractC2559Mo36153.f5342) & 4294967295L);
        final long j5 = !C8735.m13916(this.f1672, -9223372034707292160L) ? this.f1672 : j4;
        C1200 c12004 = this.f1682;
        C1201 c1201M16194 = c12004 != null ? c12004.m1619(this.f1674, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8735(m1472invokeYEO4UFw((EnterExitState) obj));
            }

            /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m1472invokeYEO4UFw(EnterExitState enterExitState) {
                InterfaceC7387 interfaceC73872;
                InterfaceC7387 interfaceC73873;
                C1243 c1243 = this.this$0;
                long j6 = j5;
                c1243.getClass();
                int i = AbstractC1244.f1683[enterExitState.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C1251 c1251 = ((C1241) c1243.f1679).f1669.f1737;
                        if (c1251 != null && (interfaceC73872 = c1251.f1694) != null) {
                            return ((C8735) interfaceC73872.invoke(new C8735(j6))).f22224;
                        }
                    } else {
                        if (i != 3) {
                            C5043.m9170();
                            return 0L;
                        }
                        C1251 c12512 = ((C1239) c1243.f1678).f1666.f1737;
                        if (c12512 != null && (interfaceC73873 = c12512.f1694) != null) {
                            return ((C8735) interfaceC73873.invoke(new C8735(j6))).f22224;
                        }
                    }
                }
                return j6;
            }
        }) : null;
        if (c1201M16194 != null) {
            j4 = ((C8735) c1201M16194.getValue()).f22224;
        }
        long jM13881 = AbstractC8726.m13881(j, j4);
        C1200 c12005 = this.f1681;
        final long j6 = c12005 != null ? ((C8737) c12005.m1619(new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // p068.InterfaceC7387
            public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199) {
                return AbstractC1233.f1645;
            }
        }, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                return new C8737(m1473invokeBjo55l4((EnterExitState) obj));
            }

            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m1473invokeBjo55l4(EnterExitState enterExitState) {
                int i;
                C1243 c1243 = this.this$0;
                long j7 = j5;
                if (c1243.f1675 != null && c1243.m1660() != null && !AbstractC5227.m9466(c1243.f1675, c1243.m1660()) && (i = AbstractC1244.f1683[enterExitState.ordinal()]) != 1 && i != 2) {
                    if (i == 3) {
                        C1251 c1251 = ((C1239) c1243.f1678).f1666.f1737;
                        if (c1251 != null) {
                            long j8 = ((C8735) c1251.f1694.invoke(new C8735(j7))).f22224;
                            InterfaceC2951 interfaceC2951M16602 = c1243.m1660();
                            interfaceC2951M16602.getClass();
                            LayoutDirection layoutDirection = LayoutDirection.Ltr;
                            long jMo4419 = ((C2964) interfaceC2951M16602).mo4419(j7, j8, layoutDirection);
                            InterfaceC2951 interfaceC2951 = c1243.f1675;
                            interfaceC2951.getClass();
                            return C8737.m13922(jMo4419, interfaceC2951.mo4419(j7, j8, layoutDirection));
                        }
                    } else {
                        C5043.m9170();
                    }
                }
                return 0L;
            }
        }).getValue()).f22225 : 0L;
        C1200 c12006 = this.f1680;
        if (c12006 != null) {
            c = ' ';
            j2 = ((C8737) c12006.m1619(this.f1671, new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public /* synthetic */ Object invoke(Object obj) {
                    return new C8737(m1474invokeBjo55l4((EnterExitState) obj));
                }

                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m1474invokeBjo55l4(EnterExitState enterExitState) {
                    C1243 c1243 = this.this$0;
                    long j7 = j5;
                    C1279 c1279 = ((C1241) c1243.f1679).f1669.f1738;
                    long j8 = c1279 != null ? ((C8737) c1279.f1742.invoke(new C8735(j7))).f22225 : 0L;
                    C1279 c12792 = ((C1239) c1243.f1678).f1666.f1738;
                    long j9 = c12792 != null ? ((C8737) c12792.f1742.invoke(new C8735(j7))).f22225 : 0L;
                    int i = AbstractC1244.f1683[enterExitState.ordinal()];
                    if (i == 1) {
                        return 0L;
                    }
                    if (i == 2) {
                        return j8;
                    }
                    if (i == 3) {
                        return j9;
                    }
                    C5043.m9170();
                    return 0L;
                }
            }).getValue()).f22225;
        } else {
            c = ' ';
            j2 = 0;
        }
        InterfaceC2951 interfaceC2951 = this.f1675;
        final long jM13921 = C8737.m13921(interfaceC2951 != null ? interfaceC2951.mo4419(j5, jM13881, LayoutDirection.Ltr) : 0L, j2);
        return interfaceC2488.mo2055((int) (jM13881 >> c), (int) (jM13881 & 4294967295L), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                AbstractC2559 abstractC2559 = abstractC2559Mo36153;
                long j7 = jM13921;
                long j8 = j6;
                InterfaceC7387 interfaceC73872 = interfaceC7387;
                abstractC2543.getClass();
                AbstractC2543.m3689(abstractC2543, abstractC2559);
                abstractC2559.mo3688(C8737.m13921((((long) (((int) (j7 >> 32)) + ((int) (j8 >> 32)))) << 32) | (((long) (((int) (j7 & 4294967295L)) + ((int) (j8 & 4294967295L)))) & 4294967295L), abstractC2559.f5340), 0.0f, interfaceC73872);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }
}
