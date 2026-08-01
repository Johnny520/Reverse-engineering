package androidx.compose.animation;

import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.compose.animation.core.AbstractC1166;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1148;
import androidx.compose.animation.core.C1200;
import androidx.compose.animation.core.C1210;
import androidx.compose.animation.core.C1218;
import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2153;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2195;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2088;
import androidx.compose.runtime.snapshots.C2111;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;
import java.util.Map;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.C8727;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1247 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C1284 m1669(int i) {
        return new C1284((i & 1) != 0, new InterfaceC7383() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
            @Override // p068.InterfaceC7383
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m1451invokeTemP2vQ(((C8735) obj).f22224, ((C8735) obj2).f22224);
            }

            /* JADX INFO: renamed from: invoke-TemP2vQ, reason: not valid java name */
            public final C1145 m1451invokeTemP2vQ(long j, long j2) {
                Map map = AbstractC1166.f1431;
                return AbstractC1176.m1574(0.0f, 400.0f, new C8735(4294967297L), 1);
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
    */
    public static final void m1670(final C1210 c1210, InterfaceC2962 interfaceC2962, InterfaceC1157 interfaceC1157, InterfaceC7387 interfaceC7387, final InterfaceC7380 interfaceC7380, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        InterfaceC2962 interfaceC29622;
        int i3;
        InterfaceC1157 interfaceC11572;
        int i4;
        InterfaceC7387 interfaceC73872;
        final InterfaceC2962 interfaceC29623;
        final InterfaceC1157 interfaceC11573;
        final InterfaceC7387 interfaceC73873;
        C2224 c2224M2935;
        InterfaceC7387 interfaceC73874;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1877370462);
        int i5 = (i & 6) == 0 ? (c2159.m2920(c1210) ? 4 : 2) | i : i;
        int i6 = i2 & 1;
        if (i6 != 0) {
            i5 |= 48;
        } else {
            if ((i & 48) == 0) {
                interfaceC29622 = interfaceC2962;
                i5 |= c2159.m2920(interfaceC29622) ? 32 : 16;
            }
            i3 = i2 & 2;
            if (i3 == 0) {
                i5 |= 384;
            } else {
                if ((i & 384) == 0) {
                    interfaceC11572 = interfaceC1157;
                    i5 |= c2159.m2938(interfaceC11572) ? 256 : 128;
                }
                i4 = i2 & 4;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        interfaceC73872 = interfaceC7387;
                        i5 |= c2159.m2938(interfaceC73872) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i5 |= c2159.m2938(interfaceC7380) ? 16384 : 8192;
                    }
                    if (c2159.m2903(i5 & 1, (i5 & 9363) == 9362)) {
                        c2159.m2899();
                        interfaceC29623 = interfaceC29622;
                        interfaceC11573 = interfaceC11572;
                        interfaceC73873 = interfaceC73872;
                    } else {
                        InterfaceC2962 interfaceC29624 = i6 != 0 ? C2958.f6621 : interfaceC29622;
                        InterfaceC1157 interfaceC1157M1573 = i3 != 0 ? AbstractC1176.m1573(0, 7, null) : interfaceC11572;
                        C2188 c2188 = C2204.f4319;
                        if (i4 != 0) {
                            Object objM2905 = c2159.m2905();
                            if (objM2905 == c2188) {
                                objM2905 = new InterfaceC7387() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                                    @Override // p068.InterfaceC7387
                                    public final Object invoke(Object obj) {
                                        return obj;
                                    }
                                };
                                c2159.m2946(objM2905);
                            }
                            interfaceC73874 = (InterfaceC7387) objM2905;
                        } else {
                            interfaceC73874 = interfaceC73872;
                        }
                        Object objM29052 = c2159.m2905();
                        Object obj = objM29052;
                        if (objM29052 == c2188) {
                            SnapshotStateList snapshotStateList = new SnapshotStateList();
                            snapshotStateList.add(c1210.m1626());
                            c2159.m2946(snapshotStateList);
                            obj = snapshotStateList;
                        }
                        SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
                        Object objM29053 = c2159.m2905();
                        if (objM29053 == c2188) {
                            long[] jArr = AbstractC1137.f1352;
                            objM29053 = new C1083();
                            c2159.m2946(objM29053);
                        }
                        C1083 c1083 = (C1083) objM29053;
                        Object objM1626 = c1210.m1626();
                        AbstractC2182 abstractC2182 = (AbstractC2182) c1210.f1586;
                        if (AbstractC5227.m9466(objM1626, abstractC2182.getValue())) {
                            c2159.m2952(321145192);
                            if (snapshotStateList2.size() == 1 && AbstractC5227.m9466(snapshotStateList2.get(0), abstractC2182.getValue())) {
                                c2159.m2952(321469824);
                                c2159.m2937(false);
                            } else {
                                c2159.m2952(321279546);
                                boolean z = (i5 & 14) == 4;
                                Object objM29054 = c2159.m2905();
                                if (z || objM29054 == c2188) {
                                    objM29054 = new InterfaceC7387() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                        {
                                            super(1);
                                        }

                                        @Override // p068.InterfaceC7387
                                        public final Boolean invoke(Object obj2) {
                                            return Boolean.valueOf(!AbstractC5227.m9466(obj2, ((AbstractC2182) c1210.f1586).getValue()));
                                        }
                                    };
                                    c2159.m2946(objM29054);
                                }
                                AbstractC5176.m9350(snapshotStateList2, (InterfaceC7387) objM29054);
                                c1083.m1314();
                                c2159.m2937(false);
                            }
                            c2159.m2937(false);
                        } else {
                            c2159.m2952(321475776);
                            c2159.m2937(false);
                        }
                        if (c1083.m1313(abstractC2182.getValue())) {
                            c2159.m2952(322279296);
                            c2159.m2937(false);
                        } else {
                            c2159.m2952(321536443);
                            ListIterator listIterator = snapshotStateList2.listIterator();
                            int i7 = 0;
                            while (true) {
                                C2111 c2111 = (C2111) listIterator;
                                if (!c2111.hasNext()) {
                                    i7 = -1;
                                    break;
                                } else if (AbstractC5227.m9466(interfaceC73874.invoke(c2111.next()), interfaceC73874.invoke(abstractC2182.getValue()))) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            if (i7 == -1) {
                                snapshotStateList2.add(abstractC2182.getValue());
                            } else {
                                snapshotStateList2.set(i7, abstractC2182.getValue());
                            }
                            c1083.m1314();
                            int size = snapshotStateList2.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                Object obj2 = snapshotStateList2.get(i8);
                                c1083.m1315(obj2, AbstractC2089.m2749(-934471669, new CrossfadeKt$Crossfade$5$1(c1210, interfaceC1157M1573, obj2, interfaceC7380), c2159));
                            }
                            c2159.m2937(false);
                        }
                        InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, false);
                        int iHashCode = Long.hashCode(c2159.f4182);
                        C2088 c2088M2941 = c2159.m2941();
                        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC29624);
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
                        c2159.m2952(-1312707512);
                        int size2 = snapshotStateList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            Object obj3 = snapshotStateList2.get(i9);
                            c2159.m2902(1171574969, 0, interfaceC73874.invoke(obj3), null);
                            InterfaceC7383 interfaceC7383 = (InterfaceC7383) c1083.m1317(obj3);
                            if (interfaceC7383 == null) {
                                c2159.m2952(1959122128);
                            } else {
                                c2159.m2952(1171576145);
                                interfaceC7383.invoke(c2159, 0);
                            }
                            c2159.m2937(false);
                            c2159.m2937(false);
                        }
                        c2159.m2937(false);
                        c2159.m2937(true);
                        interfaceC29623 = interfaceC29624;
                        interfaceC11573 = interfaceC1157M1573;
                        interfaceC73873 = interfaceC73874;
                    }
                    c2224M2935 = c2159.m2935();
                    if (c2224M2935 == null) {
                        c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(InterfaceC2208 interfaceC22082, int i10) {
                                AbstractC1247.m1670(c1210, interfaceC29623, interfaceC11573, interfaceC73873, interfaceC7380, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                            }

                            @Override // p068.InterfaceC7383
                            public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                                invoke((InterfaceC2208) obj4, ((Number) obj5).intValue());
                                return C6008.f15084;
                            }
                        };
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                interfaceC73872 = interfaceC7387;
                if ((i & 24576) == 0) {
                }
                if (c2159.m2903(i5 & 1, (i5 & 9363) == 9362)) {
                }
                c2224M2935 = c2159.m2935();
                if (c2224M2935 == null) {
                }
            }
            interfaceC11572 = interfaceC1157;
            i4 = i2 & 4;
            if (i4 == 0) {
            }
            interfaceC73872 = interfaceC7387;
            if ((i & 24576) == 0) {
            }
            if (c2159.m2903(i5 & 1, (i5 & 9363) == 9362)) {
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 == null) {
            }
        }
        interfaceC29622 = interfaceC2962;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        interfaceC11572 = interfaceC1157;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        interfaceC73872 = interfaceC7387;
        if ((i & 24576) == 0) {
        }
        if (c2159.m2903(i5 & 1, (i5 & 9363) == 9362)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 == null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1671(final C1210 c1210, final InterfaceC7387 interfaceC7387, final InterfaceC2962 interfaceC2962, final AbstractC1242 abstractC1242, final AbstractC1240 abstractC1240, final InterfaceC7380 interfaceC7380, InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        AbstractC1242 abstractC12422;
        AbstractC1240 abstractC12402;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1706321816);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(c1210) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(interfaceC7387) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2920(interfaceC2962) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            abstractC12422 = abstractC1242;
            i2 |= c2159.m2920(abstractC12422) ? 2048 : 1024;
        } else {
            abstractC12422 = abstractC1242;
        }
        if ((i & 24576) == 0) {
            abstractC12402 = abstractC1240;
            i2 |= c2159.m2920(abstractC12402) ? 16384 : 8192;
        } else {
            abstractC12402 = abstractC1240;
        }
        if ((i & 196608) == 0) {
            i2 |= c2159.m2938(interfaceC7380) ? 131072 : 65536;
        }
        if (c2159.m2903(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (z || objM2905 == c2188) {
                objM2905 = new InterfaceC7380() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // p068.InterfaceC7380
                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m1454invoke3p2s80s((InterfaceC2488) obj, (InterfaceC2490) obj2, ((C8727) obj3).f22210);
                    }

                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final InterfaceC2492 m1454invoke3p2s80s(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
                        long j2;
                        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
                        if (!interfaceC2488.mo2057() || ((Boolean) interfaceC7387.invoke(((AbstractC2182) c1210.f1586).getValue())).booleanValue()) {
                            j2 = (((long) abstractC2559Mo3615.f5344) << 32) | (((long) abstractC2559Mo3615.f5342) & 4294967295L);
                        } else {
                            j2 = 0;
                        }
                        return interfaceC2488.mo2055((int) (j2 >> 32), (int) (j2 & 4294967295L), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
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
                };
                c2159.m2946(objM2905);
            }
            InterfaceC2962 interfaceC2962M3672 = AbstractC2505.m3672(interfaceC2962, (InterfaceC7380) objM2905);
            Object objM29052 = c2159.m2905();
            if (objM29052 == c2188) {
                objM29052 = new InterfaceC7383() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1
                    @Override // p068.InterfaceC7383
                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                        return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                    }
                };
                c2159.m2946(objM29052);
            }
            m1672(c1210, interfaceC7387, interfaceC2962M3672, abstractC12422, abstractC12402, (InterfaceC7383) objM29052, interfaceC7380, c2159, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i5) {
                    AbstractC1247.m1671(c1210, interfaceC7387, interfaceC2962, abstractC1242, abstractC1240, interfaceC7380, interfaceC22082, AbstractC2202.m3031(i | 1));
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1672(final C1210 c1210, final InterfaceC7387 interfaceC7387, final InterfaceC2962 interfaceC2962, final AbstractC1242 abstractC1242, final AbstractC1240 abstractC1240, final InterfaceC7383 interfaceC7383, InterfaceC7380 interfaceC7380, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        InterfaceC7380 interfaceC73802;
        int i4;
        boolean z;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1912839215);
        if ((i & 6) == 0) {
            i3 = (c2159.m2920(c1210) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c2159.m2938(interfaceC7387) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c2159.m2920(interfaceC2962) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c2159.m2920(abstractC1242) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c2159.m2920(abstractC1240) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c2159.m2938(interfaceC7383) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= (2097152 & i) == 0 ? c2159.m2920(null) : c2159.m2938(null) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i) == 0) {
            i3 |= c2159.m2938(interfaceC7380) ? 8388608 : 4194304;
        }
        if (!c2159.m2903(i3 & 1, (4793491 & i3) != 4793490)) {
            interfaceC73802 = interfaceC7380;
            c2159.m2899();
        } else if (((Boolean) interfaceC7387.invoke(((AbstractC2182) c1210.f1586).getValue())).booleanValue() || ((Boolean) interfaceC7387.invoke(c1210.m1626())).booleanValue() || c1210.m1630() || c1210.m1625()) {
            c2159.m2952(-232386135);
            int i5 = i3 & 14;
            int i6 = i5 | 48;
            int i7 = i6 & 14;
            boolean z2 = ((i7 ^ 6) > 4 && c2159.m2920(c1210)) || (i6 & 6) == 4;
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (z2 || objM2905 == c2188) {
                objM2905 = c1210.m1626();
                c2159.m2946(objM2905);
            }
            if (c1210.m1630()) {
                objM2905 = c1210.m1626();
            }
            c2159.m2952(1844425648);
            EnterExitState enterExitStateM1675 = m1675(c1210, interfaceC7387, objM2905, c2159);
            c2159.m2937(false);
            Object value = ((AbstractC2182) c1210.f1586).getValue();
            c2159.m2952(1844425648);
            EnterExitState enterExitStateM16752 = m1675(c1210, interfaceC7387, value, c2159);
            c2159.m2937(false);
            int i8 = i7 | 3072;
            int i9 = (i8 & 14) ^ 6;
            int i10 = i3;
            boolean z3 = (i9 > 4 && c2159.m2920(c1210)) || (i8 & 6) == 4;
            Object objM29052 = c2159.m2905();
            if (z3 || objM29052 == c2188) {
                i4 = i8;
                objM29052 = new C1210(new C1148(enterExitStateM1675), c1210, AbstractC0900.m711(new StringBuilder(), c1210.f1587, " > EnterExitTransition"));
                c2159.m2946(objM29052);
            } else {
                i4 = i8;
            }
            C1210 c12102 = (C1210) objM29052;
            boolean zM2920 = c2159.m2920(c12102) | ((i9 > 4 && c2159.m2920(c1210)) || (i4 & 6) == 4);
            Object objM29053 = c2159.m2905();
            if (zM2920 || objM29053 == c2188) {
                objM29053 = new C1218(c1210, c12102, 3);
                c2159.m2946(objM29053);
            }
            AbstractC2202.m3044(c12102, (InterfaceC7387) objM29053, c2159);
            if (c1210.m1630()) {
                c12102.m1633(enterExitStateM1675, enterExitStateM16752);
            } else {
                c12102.m1631(enterExitStateM16752);
                ((AbstractC2182) c12102.f1592).setValue(Boolean.FALSE);
            }
            AbstractC1242 abstractC1242M1648 = AbstractC1233.m1648(c12102, abstractC1242, c2159, (i10 >> 6) & 112);
            InterfaceC2230 interfaceC2230 = c12102.f1586;
            AbstractC1240 abstractC1240M1649 = AbstractC1233.m1649(c12102, abstractC1240, c2159, (i10 >> 9) & 112);
            InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(interfaceC7383, c2159);
            Object objInvoke = interfaceC7383.invoke(c12102.m1626(), ((AbstractC2182) interfaceC2230).getValue());
            boolean zM29202 = c2159.m2920(c12102) | c2159.m2920(interfaceC2230M3039);
            Object objM29054 = c2159.m2905();
            if (zM29202 || objM29054 == c2188) {
                objM29054 = new C0005xd7829780(c12102, interfaceC2230M3039, null);
                c2159.m2946(objM29054);
            }
            InterfaceC2230 interfaceC2230M3043 = AbstractC2202.m3043(c2159, objInvoke, (InterfaceC7383) objM29054);
            Object objM1626 = c12102.m1626();
            EnterExitState enterExitState = EnterExitState.PostExit;
            if (objM1626 == enterExitState && ((AbstractC2182) interfaceC2230).getValue() == enterExitState && ((Boolean) interfaceC2230M3043.getValue()).booleanValue()) {
                c2159.m2952(-229368781);
                c2159.m2937(false);
                interfaceC73802 = interfaceC7380;
                z = false;
            } else {
                c2159.m2952(-230699766);
                boolean z4 = i5 == 4;
                Object objM29055 = c2159.m2905();
                if (z4 || objM29055 == c2188) {
                    objM29055 = new C1261(c12102);
                    c2159.m2946(objM29055);
                }
                C1261 c1261 = (C1261) objM29055;
                z = false;
                InterfaceC2962 interfaceC2962M1645 = AbstractC1233.m1645(c12102, abstractC1242M1648, abstractC1240M1649, "Built-in", c2159, 199680, 8);
                c2159.m2952(-7404393);
                c2159.m2937(false);
                InterfaceC2962 interfaceC2962Mo4426 = interfaceC2962.mo4426(interfaceC2962M1645.mo4426(C2958.f6621));
                Object objM29056 = c2159.m2905();
                if (objM29056 == c2188) {
                    objM29056 = new C1266(c1261);
                    c2159.m2946(objM29056);
                }
                C1266 c1266 = (C1266) objM29056;
                int iHashCode = Long.hashCode(c2159.f4182);
                C2088 c2088M2941 = c2159.m2941();
                InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962Mo4426);
                InterfaceC2619.f5567.getClass();
                InterfaceC7372 interfaceC7372 = C2600.f5530;
                c2159.m2956();
                if (c2159.f4183) {
                    c2159.m2940(interfaceC7372);
                } else {
                    c2159.m2950();
                }
                AbstractC2202.m3032(c2159, c1266, C2600.f5526);
                AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
                AbstractC2202.m3053(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                AbstractC2202.m3041(c2159, C2600.f5532);
                AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
                interfaceC73802 = interfaceC7380;
                interfaceC73802.invoke(c1261, c2159, Integer.valueOf((i10 >> 18) & 112));
                c2159.m2937(true);
                c2159.m2937(false);
            }
            c2159.m2937(z);
        } else {
            c2159.m2952(-229362829);
            c2159.m2937(false);
            interfaceC73802 = interfaceC7380;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            final InterfaceC1226 interfaceC1226 = null;
            final InterfaceC7380 interfaceC73803 = interfaceC73802;
            c2224M2935.f4379 = new InterfaceC7383(interfaceC7387, interfaceC2962, abstractC1242, abstractC1240, interfaceC7383, interfaceC1226, interfaceC73803, i, i2) { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ InterfaceC7380 $content;
                final /* synthetic */ AbstractC1242 $enter;
                final /* synthetic */ AbstractC1240 $exit;
                final /* synthetic */ InterfaceC2962 $modifier;
                final /* synthetic */ InterfaceC1226 $onLookaheadMeasured;
                final /* synthetic */ InterfaceC7383 $shouldDisposeBlock;
                final /* synthetic */ InterfaceC7387 $visible;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$content = interfaceC73803;
                    this.$$changed = i;
                    this.$$default = i2;
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i11) {
                    AbstractC1247.m1672(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, this.$content, interfaceC22082, AbstractC2202.m3031(this.$$changed | 1), this.$$default);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
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
    */
    public static final void m1673(final Object obj, InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387, InterfaceC2951 interfaceC2951, String str, InterfaceC7387 interfaceC73872, final InterfaceC7381 interfaceC7381, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        int i4;
        InterfaceC7387 interfaceC73873;
        int i5;
        InterfaceC2951 interfaceC29512;
        int i6;
        int i7;
        final InterfaceC2962 interfaceC29622;
        final InterfaceC7387 interfaceC73874;
        final InterfaceC7387 interfaceC73875;
        final InterfaceC2951 interfaceC29513;
        final String str2;
        C2224 c2224M2935;
        int i8;
        InterfaceC7387 interfaceC73876;
        InterfaceC7387 interfaceC73877;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? c2159.m2920(obj) : c2159.m2938(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= c2159.m2920(interfaceC2962) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    interfaceC73873 = interfaceC7387;
                    i3 |= c2159.m2938(interfaceC73873) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        interfaceC29512 = interfaceC2951;
                        i3 |= c2159.m2920(interfaceC29512) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i3 |= c2159.m2920(str) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 == 0) {
                            if ((196608 & i) == 0) {
                                i3 |= c2159.m2938(interfaceC73872) ? 131072 : 65536;
                            }
                            if ((1572864 & i) == 0) {
                                i3 |= c2159.m2938(interfaceC7381) ? 1048576 : Opcodes.ASM8;
                            }
                            if (c2159.m2903(i3 & 1, (599187 & i3) == 599186)) {
                                c2159.m2899();
                                interfaceC29622 = interfaceC2962;
                                interfaceC73874 = interfaceC73872;
                                interfaceC73875 = interfaceC73873;
                                interfaceC29513 = interfaceC29512;
                                str2 = str;
                            } else {
                                InterfaceC2962 interfaceC29623 = i9 != 0 ? C2958.f6621 : interfaceC2962;
                                C2188 c2188 = C2204.f4319;
                                if (i4 != 0) {
                                    Object objM2905 = c2159.m2905();
                                    if (objM2905 == c2188) {
                                        objM2905 = new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                            @Override // p068.InterfaceC7387
                                            public final C1253 invoke(InterfaceC1264 interfaceC1264) {
                                                return new C1253(AbstractC1233.m1640(AbstractC1176.m1573(com.android.p002dx.p005io.Opcodes.REM_INT_LIT8, 4, null), 2).m1659(AbstractC1233.m1650(AbstractC1176.m1573(com.android.p002dx.p005io.Opcodes.REM_INT_LIT8, 4, null), 0.92f)), AbstractC1233.m1651(AbstractC1176.m1573(90, 6, null), 2));
                                            }
                                        };
                                        c2159.m2946(objM2905);
                                    }
                                    interfaceC73876 = (InterfaceC7387) objM2905;
                                    i8 = i7;
                                } else {
                                    i8 = i7;
                                    interfaceC73876 = interfaceC73873;
                                }
                                InterfaceC2951 interfaceC29514 = i5 != 0 ? C2952.f6617 : interfaceC29512;
                                str2 = i6 != 0 ? "AnimatedContent" : str;
                                if (i8 != 0) {
                                    Object objM29052 = c2159.m2905();
                                    if (objM29052 == c2188) {
                                        objM29052 = new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                            @Override // p068.InterfaceC7387
                                            public final Object invoke(Object obj2) {
                                                return obj2;
                                            }
                                        };
                                        c2159.m2946(objM29052);
                                    }
                                    interfaceC73877 = (InterfaceC7387) objM29052;
                                } else {
                                    interfaceC73877 = interfaceC73872;
                                }
                                C1210 c1210M1576 = AbstractC1176.m1576(obj, str2, c2159, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                int i10 = i3 & 8176;
                                int i11 = i3 >> 3;
                                m1674(c1210M1576, interfaceC29623, interfaceC73876, interfaceC29514, interfaceC73877, interfaceC7381, c2159, i10 | (57344 & i11) | (i11 & Opcodes.ASM7), 0);
                                interfaceC29622 = interfaceC29623;
                                interfaceC73875 = interfaceC73876;
                                interfaceC29513 = interfaceC29514;
                                interfaceC73874 = interfaceC73877;
                            }
                            c2224M2935 = c2159.m2935();
                            if (c2224M2935 == null) {
                                c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void invoke(InterfaceC2208 interfaceC22082, int i12) {
                                        AbstractC1247.m1673(obj, interfaceC29622, interfaceC73875, interfaceC29513, str2, interfaceC73874, interfaceC7381, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                                    }

                                    @Override // p068.InterfaceC7383
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                        invoke((InterfaceC2208) obj2, ((Number) obj3).intValue());
                                        return C6008.f15084;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        if ((1572864 & i) == 0) {
                        }
                        if (c2159.m2903(i3 & 1, (599187 & i3) == 599186)) {
                        }
                        c2224M2935 = c2159.m2935();
                        if (c2224M2935 == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (c2159.m2903(i3 & 1, (599187 & i3) == 599186)) {
                    }
                    c2224M2935 = c2159.m2935();
                    if (c2224M2935 == null) {
                    }
                }
                interfaceC29512 = interfaceC2951;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (c2159.m2903(i3 & 1, (599187 & i3) == 599186)) {
                }
                c2224M2935 = c2159.m2935();
                if (c2224M2935 == null) {
                }
            }
            interfaceC73873 = interfaceC7387;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            interfaceC29512 = interfaceC2951;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (c2159.m2903(i3 & 1, (599187 & i3) == 599186)) {
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        interfaceC73873 = interfaceC7387;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        interfaceC29512 = interfaceC2951;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (c2159.m2903(i3 & 1, (599187 & i3) == 599186)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 == null) {
        }
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
    */
    public static final void m1674(final C1210 c1210, InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387, InterfaceC2951 interfaceC2951, InterfaceC7387 interfaceC73872, final InterfaceC7381 interfaceC7381, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        InterfaceC2962 interfaceC29622;
        int i3;
        InterfaceC7387 interfaceC73873;
        int i4;
        InterfaceC2951 interfaceC29512;
        int i5;
        InterfaceC7387 interfaceC73874;
        InterfaceC7381 interfaceC73812;
        final InterfaceC2962 interfaceC29623;
        ?? r3;
        C2224 c2224M2935;
        InterfaceC7387 interfaceC73875;
        Object obj;
        C1265 c1265;
        ?? r13;
        Object obj2;
        InterfaceC2230 interfaceC2230;
        SnapshotStateList snapshotStateList;
        C1265 c12652;
        C1200 c1200M1577;
        ?? r32;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(511725103);
        int i6 = (i & 6) == 0 ? (c2159.m2920(c1210) ? 4 : 2) | i : i;
        int i7 = i2 & 1;
        if (i7 != 0) {
            i6 |= 48;
        } else {
            if ((i & 48) == 0) {
                interfaceC29622 = interfaceC2962;
                i6 |= c2159.m2920(interfaceC29622) ? 32 : 16;
            }
            i3 = i2 & 2;
            if (i3 == 0) {
                i6 |= 384;
            } else {
                if ((i & 384) == 0) {
                    interfaceC73873 = interfaceC7387;
                    i6 |= c2159.m2938(interfaceC73873) ? 256 : 128;
                }
                i4 = i2 & 4;
                if (i4 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        interfaceC29512 = interfaceC2951;
                        i6 |= c2159.m2920(interfaceC29512) ? 2048 : 1024;
                    }
                    i5 = i2 & 8;
                    if (i5 != 0) {
                        if ((i & 24576) == 0) {
                            interfaceC73874 = interfaceC73872;
                            i6 |= c2159.m2938(interfaceC73874) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            interfaceC73812 = interfaceC7381;
                            i6 |= c2159.m2938(interfaceC73812) ? 131072 : 65536;
                        } else {
                            interfaceC73812 = interfaceC7381;
                        }
                        if (c2159.m2903(i6 & 1, (74899 & i6) != 74898)) {
                            InterfaceC2962 interfaceC2962M3146 = C2958.f6621;
                            InterfaceC2962 interfaceC29624 = i7 != 0 ? interfaceC2962M3146 : interfaceC29622;
                            Object obj3 = C2204.f4319;
                            if (i3 != 0) {
                                Object objM2905 = c2159.m2905();
                                if (objM2905 == obj3) {
                                    objM2905 = new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                        @Override // p068.InterfaceC7387
                                        public final C1253 invoke(InterfaceC1264 interfaceC1264) {
                                            return new C1253(AbstractC1233.m1640(AbstractC1176.m1573(com.android.p002dx.p005io.Opcodes.REM_INT_LIT8, 4, null), 2).m1659(AbstractC1233.m1650(AbstractC1176.m1573(com.android.p002dx.p005io.Opcodes.REM_INT_LIT8, 4, null), 0.92f)), AbstractC1233.m1651(AbstractC1176.m1573(90, 6, null), 2));
                                        }
                                    };
                                    c2159.m2946(objM2905);
                                }
                                interfaceC73875 = (InterfaceC7387) objM2905;
                            } else {
                                interfaceC73875 = interfaceC73873;
                            }
                            if (i4 != 0) {
                                interfaceC29512 = C2952.f6617;
                            }
                            if (i5 != 0) {
                                Object objM29052 = c2159.m2905();
                                if (objM29052 == obj3) {
                                    objM29052 = new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                        @Override // p068.InterfaceC7387
                                        public final Object invoke(Object obj4) {
                                            return obj4;
                                        }
                                    };
                                    c2159.m2946(objM29052);
                                }
                                interfaceC73874 = (InterfaceC7387) objM29052;
                            }
                            int i8 = i6 & 14;
                            boolean z = i8 == 4;
                            Object objM29053 = c2159.m2905();
                            if (z || objM29053 == obj3) {
                                objM29053 = new C1265(c1210, interfaceC29512);
                                c2159.m2946(objM29053);
                            }
                            C1265 c12653 = (C1265) objM29053;
                            boolean z2 = i8 == 4;
                            Object objM29054 = c2159.m2905();
                            Object obj4 = objM29054;
                            if (z2 || objM29054 == obj3) {
                                Object[] objArr = {c1210.m1626()};
                                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                                snapshotStateList2.addAll(AbstractC5179.m9405(objArr));
                                c2159.m2946(snapshotStateList2);
                                obj4 = snapshotStateList2;
                            }
                            final SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj4;
                            boolean z3 = i8 == 4;
                            Object objM29055 = c2159.m2905();
                            if (z3 || objM29055 == obj3) {
                                long[] jArr = AbstractC1137.f1352;
                                objM29055 = new C1083();
                                c2159.m2946(objM29055);
                            }
                            C1083 c1083 = (C1083) objM29055;
                            Object objM1626 = c1210.m1626();
                            InterfaceC2230 interfaceC22302 = c1210.f1586;
                            if (!snapshotStateList3.contains(objM1626)) {
                                snapshotStateList3.clear();
                                snapshotStateList3.add(c1210.m1626());
                            }
                            AbstractC2182 abstractC2182 = (AbstractC2182) interfaceC22302;
                            if (AbstractC5227.m9466(c1210.m1626(), abstractC2182.getValue())) {
                                if (snapshotStateList3.size() != 1 || !AbstractC5227.m9466(snapshotStateList3.get(0), c1210.m1626())) {
                                    snapshotStateList3.clear();
                                    snapshotStateList3.add(c1210.m1626());
                                }
                                if (c1083.f1222 != 1 || c1083.m1312(c1210.m1626())) {
                                    c1083.m1314();
                                }
                                c12653.f1715 = interfaceC29512;
                            }
                            if (!AbstractC5227.m9466(c1210.m1626(), abstractC2182.getValue()) && !snapshotStateList3.contains(abstractC2182.getValue())) {
                                ListIterator listIterator = snapshotStateList3.listIterator();
                                int i9 = 0;
                                while (true) {
                                    C2111 c2111 = (C2111) listIterator;
                                    ListIterator listIterator2 = listIterator;
                                    if (!c2111.hasNext()) {
                                        i9 = -1;
                                        break;
                                    } else {
                                        if (AbstractC5227.m9466(interfaceC73874.invoke(c2111.next()), interfaceC73874.invoke(abstractC2182.getValue()))) {
                                            break;
                                        }
                                        i9++;
                                        listIterator = listIterator2;
                                    }
                                }
                                if (i9 == -1) {
                                    snapshotStateList3.add(abstractC2182.getValue());
                                } else {
                                    snapshotStateList3.set(i9, abstractC2182.getValue());
                                }
                            }
                            if (c1083.m1312(abstractC2182.getValue()) && c1083.m1312(c1210.m1626())) {
                                c2159.m2952(1968995539);
                                c2159.m2937(false);
                                r13 = 0;
                                obj = obj3;
                                c1265 = c12653;
                                interfaceC73873 = interfaceC73875;
                            } else {
                                boolean z4 = false;
                                c2159.m2952(1966410449);
                                c1083.m1314();
                                int size = snapshotStateList3.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    final Object obj5 = snapshotStateList3.get(i10);
                                    Object obj6 = obj3;
                                    final InterfaceC7387 interfaceC73876 = interfaceC73875;
                                    final C1265 c12654 = c12653;
                                    final InterfaceC7381 interfaceC73813 = interfaceC73812;
                                    c1083.m1315(obj5, AbstractC2089.m2749(-23915175, new InterfaceC7383() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        public final void invoke(InterfaceC2208 interfaceC22082, int i11) {
                                            C2159 c21592 = (C2159) interfaceC22082;
                                            if (!c21592.m2903(i11 & 1, (i11 & 3) != 2)) {
                                                c21592.m2899();
                                                return;
                                            }
                                            InterfaceC7387 interfaceC73877 = interfaceC73876;
                                            C1265 c12655 = c12654;
                                            Object objM29056 = c21592.m2905();
                                            C2188 c2188 = C2204.f4319;
                                            if (objM29056 == c2188) {
                                                objM29056 = (C1253) interfaceC73877.invoke(c12655);
                                                c21592.m2946(objM29056);
                                            }
                                            final C1253 c1253 = (C1253) objM29056;
                                            boolean zM2939 = c21592.m2939(AbstractC5227.m9466(c1210.m1623().mo1616(), obj5));
                                            C1210 c12102 = c1210;
                                            Object obj7 = obj5;
                                            InterfaceC7387 interfaceC73878 = interfaceC73876;
                                            C1265 c12656 = c12654;
                                            Object objM29057 = c21592.m2905();
                                            if (zM2939 || objM29057 == c2188) {
                                                objM29057 = AbstractC5227.m9466(c12102.m1623().mo1616(), obj7) ? AbstractC1240.f1668 : ((C1253) interfaceC73878.invoke(c12656)).f1698;
                                                c21592.m2946(objM29057);
                                            }
                                            final AbstractC1240 abstractC1240 = (AbstractC1240) objM29057;
                                            Object obj8 = obj5;
                                            C1210 c12103 = c1210;
                                            Object objM29058 = c21592.m2905();
                                            if (objM29058 == c2188) {
                                                objM29058 = new C1263(AbstractC5227.m9466(obj8, ((AbstractC2182) c12103.f1586).getValue()));
                                                c21592.m2946(objM29058);
                                            }
                                            C1263 c1263 = (C1263) objM29058;
                                            C1241 c1241 = c1253.f1699;
                                            boolean zM2938 = c21592.m2938(c1253);
                                            Object objM29059 = c21592.m2905();
                                            if (zM2938 || objM29059 == c2188) {
                                                objM29059 = new InterfaceC7380() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // p068.InterfaceC7380
                                                    public /* synthetic */ Object invoke(Object obj9, Object obj10, Object obj11) {
                                                        return m1450invoke3p2s80s((InterfaceC2488) obj9, (InterfaceC2490) obj10, ((C8727) obj11).f22210);
                                                    }

                                                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                                                    public final InterfaceC2492 m1450invoke3p2s80s(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
                                                        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
                                                        int i12 = abstractC2559Mo3615.f5344;
                                                        int i13 = abstractC2559Mo3615.f5342;
                                                        final C1253 c12532 = c1253;
                                                        return interfaceC2488.mo2055(i12, i13, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            public final void invoke(AbstractC2543 abstractC2543) {
                                                                abstractC2543.m3695(abstractC2559Mo3615, 0, 0, ((AbstractC2184) c12532.f1697).m2994());
                                                            }

                                                            @Override // p068.InterfaceC7387
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                                                                invoke((AbstractC2543) obj9);
                                                                return C6008.f15084;
                                                            }
                                                        });
                                                    }
                                                };
                                                c21592.m2946(objM29059);
                                            }
                                            InterfaceC2962 interfaceC2962M3672 = AbstractC2505.m3672(C2958.f6621, (InterfaceC7380) objM29059);
                                            ((AbstractC2182) c1263.f1711).setValue(Boolean.valueOf(AbstractC5227.m9466(obj5, ((AbstractC2182) c1210.f1586).getValue())));
                                            InterfaceC2962 interfaceC2962Mo4426 = interfaceC2962M3672.mo4426(c1263);
                                            C1210 c12104 = c1210;
                                            boolean zM29382 = c21592.m2938(obj5);
                                            final Object obj9 = obj5;
                                            Object objM290510 = c21592.m2905();
                                            if (zM29382 || objM290510 == c2188) {
                                                objM290510 = new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // p068.InterfaceC7387
                                                    public final Boolean invoke(Object obj10) {
                                                        return Boolean.valueOf(AbstractC5227.m9466(obj10, obj9));
                                                    }
                                                };
                                                c21592.m2946(objM290510);
                                            }
                                            InterfaceC7387 interfaceC73879 = (InterfaceC7387) objM290510;
                                            boolean zM2920 = c21592.m2920(abstractC1240);
                                            Object objM290511 = c21592.m2905();
                                            if (zM2920 || objM290511 == c2188) {
                                                objM290511 = new InterfaceC7383() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // p068.InterfaceC7383
                                                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                        EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !((C1239) abstractC1240).f1666.f1735);
                                                    }
                                                };
                                                c21592.m2946(objM290511);
                                            }
                                            InterfaceC7383 interfaceC7383 = (InterfaceC7383) objM290511;
                                            final SnapshotStateList<Object> snapshotStateList4 = snapshotStateList3;
                                            final Object obj10 = obj5;
                                            final C1265 c12657 = c12654;
                                            final InterfaceC7381 interfaceC73814 = interfaceC73813;
                                            AbstractC1247.m1672(c12104, interfaceC73879, interfaceC2962Mo4426, c1241, abstractC1240, interfaceC7383, AbstractC2089.m2749(-143346359, new InterfaceC7380() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                public final void invoke(InterfaceC1257 interfaceC1257, InterfaceC2208 interfaceC22083, int i12) {
                                                    if ((i12 & 6) == 0) {
                                                        i12 |= (i12 & 8) == 0 ? ((C2159) interfaceC22083).m2920(interfaceC1257) : ((C2159) interfaceC22083).m2938(interfaceC1257) ? 4 : 2;
                                                    }
                                                    C2159 c21593 = (C2159) interfaceC22083;
                                                    if (!c21593.m2903(i12 & 1, (i12 & 19) != 18)) {
                                                        c21593.m2899();
                                                        return;
                                                    }
                                                    boolean zM29202 = c21593.m2920(snapshotStateList4) | c21593.m2938(obj10) | c21593.m2938(c12657);
                                                    final SnapshotStateList<Object> snapshotStateList5 = snapshotStateList4;
                                                    final Object obj11 = obj10;
                                                    final C1265 c12658 = c12657;
                                                    Object objM290512 = c21593.m2905();
                                                    C2188 c21882 = C2204.f4319;
                                                    if (zM29202 || objM290512 == c21882) {
                                                        objM290512 = new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // p068.InterfaceC7387
                                                            public final InterfaceC2195 invoke(C2153 c2153) {
                                                                return new C1248(snapshotStateList5, obj11, c12658, 0);
                                                            }
                                                        };
                                                        c21593.m2946(objM290512);
                                                    }
                                                    AbstractC2202.m3044(interfaceC1257, (InterfaceC7387) objM290512, c21593);
                                                    C1083 c10832 = c12657.f1713;
                                                    Object obj12 = obj10;
                                                    interfaceC1257.getClass();
                                                    c10832.m1315(obj12, ((C1261) interfaceC1257).f1709);
                                                    Object objM290513 = c21593.m2905();
                                                    if (objM290513 == c21882) {
                                                        objM290513 = new C1245(interfaceC1257);
                                                        c21593.m2946(objM290513);
                                                    }
                                                    interfaceC73814.invoke((C1245) objM290513, obj10, c21593, 0);
                                                }

                                                @Override // p068.InterfaceC7380
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj11, Object obj12, Object obj13) {
                                                    invoke((InterfaceC1257) obj11, (InterfaceC2208) obj12, ((Number) obj13).intValue());
                                                    return C6008.f15084;
                                                }
                                            }, c21592), c21592, 12582912, 64);
                                        }

                                        @Override // p068.InterfaceC7383
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj7, Object obj8) {
                                            invoke((InterfaceC2208) obj7, ((Number) obj8).intValue());
                                            return C6008.f15084;
                                        }
                                    }, c2159));
                                    i10++;
                                    interfaceC73875 = interfaceC73876;
                                    obj3 = obj6;
                                    c12653 = c12654;
                                    z4 = z4;
                                    interfaceC73812 = interfaceC7381;
                                }
                                boolean z5 = z4;
                                obj = obj3;
                                c1265 = c12653;
                                interfaceC73873 = interfaceC73875;
                                c2159.m2937(z5);
                                r13 = z5;
                            }
                            boolean zM2920 = c2159.m2920(c1210.m1623()) | c2159.m2920(c1265);
                            Object objM29056 = c2159.m2905();
                            Object obj7 = obj;
                            if (zM2920 || objM29056 == obj7) {
                                objM29056 = (C1253) interfaceC73873.invoke(c1265);
                                c2159.m2946(objM29056);
                            }
                            C1253 c1253 = (C1253) objM29056;
                            C1210 c12102 = c1265.f1716;
                            boolean zM29202 = c2159.m2920(c1265);
                            Object objM29057 = c2159.m2905();
                            if (zM29202 || objM29057 == obj7) {
                                objM29057 = AbstractC2202.m3034(Boolean.FALSE);
                                c2159.m2946(objM29057);
                            }
                            InterfaceC2230 interfaceC22303 = (InterfaceC2230) objM29057;
                            InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(c1253.f1696, c2159);
                            if (AbstractC5227.m9466(c12102.m1626(), ((AbstractC2182) c12102.f1586).getValue())) {
                                interfaceC22303.setValue(Boolean.FALSE);
                            } else if (interfaceC2230M3039.getValue() != null) {
                                interfaceC22303.setValue(Boolean.TRUE);
                            }
                            if (((Boolean) interfaceC22303.getValue()).booleanValue()) {
                                c2159.m2952(1353077497);
                                C1265 c12655 = c1265;
                                snapshotStateList = snapshotStateList3;
                                interfaceC2230 = interfaceC2230M3039;
                                obj2 = null;
                                ?? r33 = c2159;
                                c1200M1577 = AbstractC1176.m1577(c12655.f1716, AbstractC1176.f1459, null, r33, 0, 2);
                                boolean zM29203 = r33.m2920(c1200M1577);
                                Object objM29058 = r33.m2905();
                                if (zM29203 || objM29058 == obj7) {
                                    C1284 c1284 = (C1284) interfaceC2230.getValue();
                                    if (c1284 == null || c1284.f1745) {
                                        interfaceC2962M3146 = AbstractC2280.m3146(interfaceC2962M3146);
                                    }
                                    r33.m2946(interfaceC2962M3146);
                                    objM29058 = interfaceC2962M3146;
                                }
                                interfaceC2962M3146 = (InterfaceC2962) objM29058;
                                r33.m2937(r13);
                                c12652 = c12655;
                                r32 = r33;
                            } else {
                                obj2 = null;
                                ?? r34 = c2159;
                                interfaceC2230 = interfaceC2230M3039;
                                snapshotStateList = snapshotStateList3;
                                r34.m2952(1353343539);
                                r34.m2937(r13);
                                c12652 = c1265;
                                c12652.f1712 = null;
                                c1200M1577 = null;
                                r32 = r34;
                            }
                            InterfaceC2962 interfaceC2962Mo4426 = interfaceC29624.mo4426(interfaceC2962M3146.mo4426(new C1267(c1200M1577, interfaceC2230, c12652)));
                            Object objM29059 = r32.m2905();
                            if (objM29059 == obj7) {
                                objM29059 = new C1246(c12652);
                                r32.m2946(objM29059);
                            }
                            C1246 c1246 = (C1246) objM29059;
                            int iHashCode = Long.hashCode(r32.f4182);
                            C2088 c2088M2941 = r32.m2941();
                            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(r32, interfaceC2962Mo4426);
                            InterfaceC2619.f5567.getClass();
                            InterfaceC7372 interfaceC7372 = C2600.f5530;
                            r32.m2956();
                            if (r32.f4183) {
                                r32.m2940(interfaceC7372);
                            } else {
                                r32.m2950();
                            }
                            AbstractC2202.m3032(r32, c1246, C2600.f5526);
                            AbstractC2202.m3032(r32, c2088M2941, C2600.f5527);
                            AbstractC2202.m3053(r32, Integer.valueOf(iHashCode), C2600.f5533);
                            AbstractC2202.m3041(r32, C2600.f5532);
                            AbstractC2202.m3032(r32, interfaceC2962M4421, C2600.f5528);
                            r32.m2952(-860173498);
                            int size2 = snapshotStateList.size();
                            ?? r17 = snapshotStateList;
                            for (?? r2 = r13; r2 < size2; r2++) {
                                ?? r5 = r17;
                                Object obj8 = r5.get(r2);
                                r32.m2902(-2026002954, r13, interfaceC73874.invoke(obj8), obj2);
                                ?? r1 = (InterfaceC7383) c1083.m1317(obj8);
                                if (r1 == 0) {
                                    r32.m2952(1618454323);
                                } else {
                                    r32.m2952(-2026001778);
                                    r1.invoke(r32, Integer.valueOf((int) r13));
                                }
                                r32.m2937(r13);
                                r32.m2937(r13);
                                r17 = r5;
                            }
                            r32.m2937(r13);
                            r32.m2937(true);
                            interfaceC29623 = interfaceC29624;
                            r3 = r32;
                        } else {
                            C2159 c21592 = c2159;
                            c21592.m2899();
                            interfaceC29623 = interfaceC29622;
                            r3 = c21592;
                        }
                        ?? r0 = r3;
                        final InterfaceC7387 interfaceC73877 = interfaceC73873;
                        final InterfaceC2951 interfaceC29513 = interfaceC29512;
                        final InterfaceC7387 interfaceC73878 = interfaceC73874;
                        c2224M2935 = r0.m2935();
                        if (c2224M2935 != null) {
                            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(InterfaceC2208 interfaceC22082, int i11) {
                                    AbstractC1247.m1674(c1210, interfaceC29623, interfaceC73877, interfaceC29513, interfaceC73878, interfaceC7381, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                                }

                                @Override // p068.InterfaceC7383
                                public /* bridge */ /* synthetic */ Object invoke(Object obj9, Object obj10) {
                                    invoke((InterfaceC2208) obj9, ((Number) obj10).intValue());
                                    return C6008.f15084;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i6 |= 24576;
                    interfaceC73874 = interfaceC73872;
                    if ((196608 & i) == 0) {
                    }
                    if (c2159.m2903(i6 & 1, (74899 & i6) != 74898)) {
                    }
                    ?? r02 = r3;
                    final InterfaceC7387 interfaceC738772 = interfaceC73873;
                    final InterfaceC2951 interfaceC295132 = interfaceC29512;
                    final InterfaceC7387 interfaceC738782 = interfaceC73874;
                    c2224M2935 = r02.m2935();
                    if (c2224M2935 != null) {
                    }
                }
                interfaceC29512 = interfaceC2951;
                i5 = i2 & 8;
                if (i5 != 0) {
                }
                interfaceC73874 = interfaceC73872;
                if ((196608 & i) == 0) {
                }
                if (c2159.m2903(i6 & 1, (74899 & i6) != 74898)) {
                }
                ?? r022 = r3;
                final InterfaceC7387 interfaceC7387722 = interfaceC73873;
                final InterfaceC2951 interfaceC2951322 = interfaceC29512;
                final InterfaceC7387 interfaceC7387822 = interfaceC73874;
                c2224M2935 = r022.m2935();
                if (c2224M2935 != null) {
                }
            }
            interfaceC73873 = interfaceC7387;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            interfaceC29512 = interfaceC2951;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            interfaceC73874 = interfaceC73872;
            if ((196608 & i) == 0) {
            }
            if (c2159.m2903(i6 & 1, (74899 & i6) != 74898)) {
            }
            ?? r0222 = r3;
            final InterfaceC7387 interfaceC73877222 = interfaceC73873;
            final InterfaceC2951 interfaceC29513222 = interfaceC29512;
            final InterfaceC7387 interfaceC73878222 = interfaceC73874;
            c2224M2935 = r0222.m2935();
            if (c2224M2935 != null) {
            }
        }
        interfaceC29622 = interfaceC2962;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        interfaceC73873 = interfaceC7387;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        interfaceC29512 = interfaceC2951;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        interfaceC73874 = interfaceC73872;
        if ((196608 & i) == 0) {
        }
        if (c2159.m2903(i6 & 1, (74899 & i6) != 74898)) {
        }
        ?? r02222 = r3;
        final InterfaceC7387 interfaceC738772222 = interfaceC73873;
        final InterfaceC2951 interfaceC295132222 = interfaceC29512;
        final InterfaceC7387 interfaceC738782222 = interfaceC73874;
        c2224M2935 = r02222.m2935();
        if (c2224M2935 != null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final EnterExitState m1675(C1210 c1210, InterfaceC7387 interfaceC7387, Object obj, InterfaceC2208 interfaceC2208) {
        EnterExitState enterExitState;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2902(-422486745, 0, c1210, null);
        if (c1210.m1630()) {
            c2159.m2952(-212166497);
            c2159.m2937(false);
            enterExitState = ((Boolean) interfaceC7387.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) interfaceC7387.invoke(c1210.m1626())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            c2159.m2952(-211892364);
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = AbstractC2202.m3034(Boolean.FALSE);
                c2159.m2946(objM2905);
            }
            InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
            if (((Boolean) interfaceC7387.invoke(c1210.m1626())).booleanValue()) {
                interfaceC2230.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) interfaceC7387.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) interfaceC2230.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            c2159.m2937(false);
        }
        c2159.m2937(false);
        return enterExitState;
    }
}
