package androidx.compose.p001ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.focus.C2289;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.C2149;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.compose.AbstractC3195;
import io.ktor.util.C5043;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p132.AbstractC8177;
import p132.InterfaceC8174;
import p147.AbstractC8333;
import p158.InterfaceC8366;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7387 f6527 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return C6008.f15084;
        }

        public final void invoke(View view) {
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m4383(InterfaceC2208 interfaceC2208, InterfaceC2962 interfaceC2962, int i, InterfaceC8725 interfaceC8725, InterfaceC3221 interfaceC3221, InterfaceC8366 interfaceC8366, LayoutDirection layoutDirection, C2088 c2088) {
        InterfaceC2619.f5567.getClass();
        AbstractC2202.m3032(interfaceC2208, c2088, C2600.f5527);
        AbstractC2202.m3032(interfaceC2208, interfaceC2962, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C2583) obj, (InterfaceC2962) obj2);
                return C6008.f15084;
            }

            public final void invoke(C2583 c2583, InterfaceC2962 interfaceC29622) {
                AbstractC2917.m4385(c2583).setModifier(interfaceC29622);
            }
        });
        AbstractC2202.m3032(interfaceC2208, interfaceC8725, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C2583) obj, (InterfaceC8725) obj2);
                return C6008.f15084;
            }

            public final void invoke(C2583 c2583, InterfaceC8725 interfaceC87252) {
                AbstractC2917.m4385(c2583).setDensity(interfaceC87252);
            }
        });
        AbstractC2202.m3032(interfaceC2208, interfaceC3221, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C2583) obj, (InterfaceC3221) obj2);
                return C6008.f15084;
            }

            public final void invoke(C2583 c2583, InterfaceC3221 interfaceC32212) {
                AbstractC2917.m4385(c2583).setLifecycleOwner(interfaceC32212);
            }
        });
        AbstractC2202.m3032(interfaceC2208, interfaceC8366, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C2583) obj, (InterfaceC8366) obj2);
                return C6008.f15084;
            }

            public final void invoke(C2583 c2583, InterfaceC8366 interfaceC83662) {
                AbstractC2917.m4385(c2583).setSavedStateRegistryOwner(interfaceC83662);
            }
        });
        AbstractC2202.m3032(interfaceC2208, layoutDirection, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5
            public final void invoke(C2583 c2583, LayoutDirection layoutDirection2) {
                ViewFactoryHolder viewFactoryHolderM4385 = AbstractC2917.m4385(c2583);
                int i2 = AbstractC2907.f6488[layoutDirection2.ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    i3 = 0;
                } else if (i2 != 2) {
                    C5043.m9170();
                    return;
                }
                viewFactoryHolderM4385.setLayoutDirection(i3);
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C2583) obj, (LayoutDirection) obj2);
                return C6008.f15084;
            }
        });
        AbstractC2202.m3032(interfaceC2208, Integer.valueOf(i), C2600.f5533);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC7372 m4384(final InterfaceC7387 interfaceC7387, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        final int iHashCode = Long.hashCode(c2159.f4182);
        final Context context = (Context) c2159.m2943(AbstractC2670.f5681);
        final C2149 c2149M3040 = AbstractC2202.m3040(c2159);
        final InterfaceC8174 interfaceC8174 = (InterfaceC8174) c2159.m2943(AbstractC8177.f19919);
        final View view = (View) c2159.m2943(AbstractC2670.f5677);
        boolean zM2938 = ((((i & 14) ^ 6) > 4 && c2159.m2920(interfaceC7387)) || (i & 6) == 4) | c2159.m2938(context) | c2159.m2938(c2149M3040) | c2159.m2938(interfaceC8174) | c2159.m2922(iHashCode) | c2159.m2938(view);
        Object objM2905 = c2159.m2905();
        if (zM2938 || objM2905 == C2204.f4319) {
            InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public final C2583 invoke() {
                    Context context2 = context;
                    InterfaceC7387 interfaceC73872 = interfaceC7387;
                    AbstractC2207 abstractC2207 = c2149M3040;
                    InterfaceC8174 interfaceC81742 = interfaceC8174;
                    int i2 = iHashCode;
                    KeyEvent.Callback callback = view;
                    callback.getClass();
                    return new ViewFactoryHolder(context2, interfaceC73872, abstractC2207, interfaceC81742, i2, (InterfaceC2636) callback).getLayoutNode();
                }
            };
            c2159.m2946(interfaceC7372);
            objM2905 = interfaceC7372;
        }
        return (InterfaceC7372) objM2905;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ViewFactoryHolder m4385(C2583 c2583) {
        AbstractC2909 abstractC2909 = c2583.f5461;
        if (abstractC2909 != null) {
            return (ViewFactoryHolder) abstractC2909;
        }
        throw AbstractC0900.m699("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4386(final InterfaceC7387 interfaceC7387, InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC73872, InterfaceC7387 interfaceC73873, InterfaceC7387 interfaceC73874, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        InterfaceC2962 interfaceC29622;
        int i4;
        InterfaceC7387 interfaceC73875;
        int i5;
        InterfaceC7387 interfaceC73876;
        int i6;
        InterfaceC7387 interfaceC73877;
        final InterfaceC2962 interfaceC29623;
        final InterfaceC7387 interfaceC73878;
        final InterfaceC7387 interfaceC73879;
        final InterfaceC7387 interfaceC738710;
        C2224 c2224M2935;
        InterfaceC7387 interfaceC738711;
        InterfaceC2962 interfaceC29624;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-180024211);
        if ((i & 6) == 0) {
            i3 = (c2159.m2938(interfaceC7387) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                interfaceC29622 = interfaceC2962;
                i3 |= c2159.m2920(interfaceC29622) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    interfaceC73875 = interfaceC73872;
                    i3 |= c2159.m2938(interfaceC73875) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        interfaceC73876 = interfaceC73873;
                        i3 |= c2159.m2938(interfaceC73876) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            interfaceC73877 = interfaceC73874;
                            i3 |= c2159.m2938(interfaceC73877) ? 16384 : 8192;
                        }
                        if (c2159.m2903(i3 & 1, (i3 & 9363) != 9362)) {
                            InterfaceC2962 interfaceC29625 = i7 != 0 ? C2958.f6621 : interfaceC29622;
                            if (i4 != 0) {
                                interfaceC73875 = null;
                            }
                            InterfaceC7387 interfaceC738712 = f6527;
                            if (i5 != 0) {
                                interfaceC73876 = interfaceC738712;
                            }
                            if (i6 == 0) {
                                interfaceC738712 = interfaceC73877;
                            }
                            int iHashCode = Long.hashCode(c2159.f4182);
                            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC29625.mo4426(C2921.f6534).mo4426(C2289.f4499).mo4426(C2913.f6523).mo4426(C2919.f6531));
                            InterfaceC8725 interfaceC8725 = (InterfaceC8725) c2159.m2943(AbstractC2737.f5933);
                            LayoutDirection layoutDirection = (LayoutDirection) c2159.m2943(AbstractC2737.f5927);
                            C2088 c2088M2941 = c2159.m2941();
                            InterfaceC3221 interfaceC3221 = (InterfaceC3221) c2159.m2943(AbstractC3195.f7338);
                            InterfaceC8366 interfaceC8366 = (InterfaceC8366) c2159.m2943(AbstractC8333.f20714);
                            if (interfaceC73875 != null) {
                                c2159.m2952(1313917368);
                                InterfaceC7372 interfaceC7372M4384 = m4384(interfaceC7387, c2159, i3 & 14);
                                c2159.m2956();
                                if (c2159.f4183) {
                                    c2159.m2940(interfaceC7372M4384);
                                } else {
                                    c2159.m2950();
                                }
                                interfaceC738711 = interfaceC73876;
                                m4383(c2159, interfaceC2962M4421, iHashCode, interfaceC8725, interfaceC3221, interfaceC8366, layoutDirection, c2088M2941);
                                AbstractC2202.m3032(c2159, interfaceC73875, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                    @Override // p068.InterfaceC7383
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((C2583) obj, (InterfaceC7387) obj2);
                                        return C6008.f15084;
                                    }

                                    public final void invoke(C2583 c2583, InterfaceC7387 interfaceC738713) {
                                        AbstractC2917.m4385(c2583).setResetBlock(interfaceC738713);
                                    }
                                });
                                AbstractC2202.m3032(c2159, interfaceC738712, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                    @Override // p068.InterfaceC7383
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((C2583) obj, (InterfaceC7387) obj2);
                                        return C6008.f15084;
                                    }

                                    public final void invoke(C2583 c2583, InterfaceC7387 interfaceC738713) {
                                        AbstractC2917.m4385(c2583).setUpdateBlock(interfaceC738713);
                                    }
                                });
                                AbstractC2202.m3032(c2159, interfaceC738711, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                    @Override // p068.InterfaceC7383
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((C2583) obj, (InterfaceC7387) obj2);
                                        return C6008.f15084;
                                    }

                                    public final void invoke(C2583 c2583, InterfaceC7387 interfaceC738713) {
                                        AbstractC2917.m4385(c2583).setReleaseBlock(interfaceC738713);
                                    }
                                });
                                c2159.m2937(true);
                                c2159.m2937(false);
                                interfaceC29624 = interfaceC29625;
                            } else {
                                interfaceC738711 = interfaceC73876;
                                c2159.m2952(1314774735);
                                InterfaceC7372 interfaceC7372M43842 = m4384(interfaceC7387, c2159, i3 & 14);
                                interfaceC29624 = interfaceC29625;
                                c2159.m2902(125, 1, null, null);
                                c2159.f4217 = true;
                                if (c2159.f4183) {
                                    c2159.m2940(interfaceC7372M43842);
                                } else {
                                    c2159.m2950();
                                }
                                m4383(c2159, interfaceC2962M4421, iHashCode, interfaceC8725, interfaceC3221, interfaceC8366, layoutDirection, c2088M2941);
                                AbstractC2202.m3032(c2159, interfaceC738712, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                    @Override // p068.InterfaceC7383
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((C2583) obj, (InterfaceC7387) obj2);
                                        return C6008.f15084;
                                    }

                                    public final void invoke(C2583 c2583, InterfaceC7387 interfaceC738713) {
                                        AbstractC2917.m4385(c2583).setUpdateBlock(interfaceC738713);
                                    }
                                });
                                AbstractC2202.m3032(c2159, interfaceC738711, new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                    @Override // p068.InterfaceC7383
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((C2583) obj, (InterfaceC7387) obj2);
                                        return C6008.f15084;
                                    }

                                    public final void invoke(C2583 c2583, InterfaceC7387 interfaceC738713) {
                                        AbstractC2917.m4385(c2583).setReleaseBlock(interfaceC738713);
                                    }
                                });
                                c2159.m2937(true);
                                c2159.m2937(false);
                            }
                            InterfaceC7387 interfaceC738713 = interfaceC738712;
                            interfaceC73879 = interfaceC738711;
                            interfaceC73878 = interfaceC73875;
                            interfaceC738710 = interfaceC738713;
                            interfaceC29623 = interfaceC29624;
                        } else {
                            c2159.m2899();
                            interfaceC29623 = interfaceC29622;
                            interfaceC73878 = interfaceC73875;
                            interfaceC73879 = interfaceC73876;
                            interfaceC738710 = interfaceC73877;
                        }
                        c2224M2935 = c2159.m2935();
                        if (c2224M2935 != null) {
                            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(InterfaceC2208 interfaceC22082, int i8) {
                                    AbstractC2917.m4386(interfaceC7387, interfaceC29623, interfaceC73878, interfaceC73879, interfaceC738710, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                                }

                                @Override // p068.InterfaceC7383
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                                    return C6008.f15084;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    interfaceC73877 = interfaceC73874;
                    if (c2159.m2903(i3 & 1, (i3 & 9363) != 9362)) {
                    }
                    c2224M2935 = c2159.m2935();
                    if (c2224M2935 != null) {
                    }
                }
                interfaceC73876 = interfaceC73873;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                interfaceC73877 = interfaceC73874;
                if (c2159.m2903(i3 & 1, (i3 & 9363) != 9362)) {
                }
                c2224M2935 = c2159.m2935();
                if (c2224M2935 != null) {
                }
            }
            interfaceC73875 = interfaceC73872;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            interfaceC73876 = interfaceC73873;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            interfaceC73877 = interfaceC73874;
            if (c2159.m2903(i3 & 1, (i3 & 9363) != 9362)) {
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 != null) {
            }
        }
        interfaceC29622 = interfaceC2962;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        interfaceC73875 = interfaceC73872;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        interfaceC73876 = interfaceC73873;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        interfaceC73877 = interfaceC73874;
        if (c2159.m2903(i3 & 1, (i3 & 9363) != 9362)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m4387(final InterfaceC7387 interfaceC7387, InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC73872, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        final InterfaceC2962 interfaceC29622;
        final InterfaceC7387 interfaceC73873;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1783766393);
        if ((i & 6) == 0) {
            i3 = (c2159.m2938(interfaceC7387) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c2159.m2920(interfaceC2962) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= c2159.m2938(interfaceC73872) ? 256 : 128;
        }
        if (c2159.m2903(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            InterfaceC2962 interfaceC29623 = interfaceC2962;
            InterfaceC7387 interfaceC73874 = f6527;
            InterfaceC7387 interfaceC73875 = i5 != 0 ? interfaceC73874 : interfaceC73872;
            m4386(interfaceC7387, interfaceC29623, null, interfaceC73874, interfaceC73875, c2159, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            interfaceC29622 = interfaceC29623;
            interfaceC73873 = interfaceC73875;
        } else {
            c2159.m2899();
            interfaceC29622 = interfaceC2962;
            interfaceC73873 = interfaceC73872;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i6) {
                    AbstractC2917.m4387(interfaceC7387, interfaceC29622, interfaceC73873, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            };
        }
    }
}
