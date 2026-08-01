package androidx.compose.p001ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.C1041;
import androidx.compose.foundation.lazy.layout.C1554;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2149;
import androidx.compose.runtime.C2153;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2195;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import java.util.Arrays;
import java.util.UUID;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p132.AbstractC8176;
import p221.C8735;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2193 f6543 = new C2193(new InterfaceC7372() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // p068.InterfaceC7372
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2193 f6542 = new C2193(new InterfaceC7372() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalIsInPopupLayout$1
        @Override // p068.InterfaceC7372
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m4394(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4395(InterfaceC2933 interfaceC2933, InterfaceC7372 interfaceC7372, C2923 c2923, final InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        InterfaceC7372 interfaceC73722;
        int i4;
        C2923 c29232;
        int i5;
        final InterfaceC7372 interfaceC73723;
        final C2923 c29233;
        C2224 c2224M2935;
        String str;
        InterfaceC5189 interfaceC5189;
        boolean z;
        Object obj;
        LayoutDirection layoutDirection;
        final InterfaceC2933 interfaceC29332 = interfaceC2933;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1772091631);
        if ((i & 6) == 0) {
            i3 = (c2159.m2920(interfaceC29332) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                interfaceC73722 = interfaceC7372;
                i3 |= c2159.m2938(interfaceC73722) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    c29232 = c2923;
                    i3 |= c2159.m2920(c29232) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i3 |= c2159.m2938(interfaceC7383) ? 2048 : 1024;
                }
                i5 = i3;
                if (c2159.m2903(i5 & 1, (i5 & 1171) != 1170)) {
                    final InterfaceC7372 interfaceC73724 = i6 != 0 ? null : interfaceC73722;
                    final C2923 c29234 = i4 != 0 ? new C2923(31) : c29232;
                    View view = (View) c2159.m2943(AbstractC2670.f5677);
                    InterfaceC8725 interfaceC8725 = (InterfaceC8725) c2159.m2943(AbstractC2737.f5933);
                    String str2 = (String) c2159.m2943(f6543);
                    final LayoutDirection layoutDirection2 = (LayoutDirection) c2159.m2943(AbstractC2737.f5927);
                    C2149 c2149M3040 = AbstractC2202.m3040(c2159);
                    final InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(interfaceC7383, c2159);
                    Object[] objArr = new Object[0];
                    Object objM2905 = c2159.m2905();
                    C2188 c2188 = C2204.f4319;
                    if (objM2905 == c2188) {
                        objM2905 = new InterfaceC7372() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                            @Override // p068.InterfaceC7372
                            public final UUID invoke() {
                                return UUID.randomUUID();
                            }
                        };
                        c2159.m2946(objM2905);
                    }
                    UUID uuid = (UUID) AbstractC8176.m13098(Arrays.copyOf(objArr, 0), AbstractC8176.f19918, (InterfaceC7372) objM2905, c2159, 3456);
                    boolean zBooleanValue = ((Boolean) c2159.m2943(f6542)).booleanValue();
                    Object objM29052 = c2159.m2905();
                    if (objM29052 == c2188) {
                        str = str2;
                        interfaceC5189 = null;
                        z = false;
                        final C2930 c2930 = new C2930(interfaceC73724, c29234, str, view, interfaceC8725, interfaceC29332, uuid, zBooleanValue);
                        interfaceC29332 = interfaceC29332;
                        c2930.m4402(c2149M3040, new C2077(-297523940, true, new InterfaceC7383() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(InterfaceC2208 interfaceC22082, int i7) {
                                C2159 c21592 = (C2159) interfaceC22082;
                                if (!c21592.m2903(i7 & 1, (i7 & 3) != 2)) {
                                    c21592.m2899();
                                    return;
                                }
                                C1041 c1041Mo2988 = AbstractC2924.f6542.mo2988(Boolean.TRUE);
                                final C2930 c29302 = c2930;
                                final InterfaceC2168 interfaceC2168 = interfaceC2230M3039;
                                AbstractC2202.m3047(c1041Mo2988, AbstractC2089.m2749(1022273628, new InterfaceC7383() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void invoke(InterfaceC2208 interfaceC22083, int i8) {
                                        C2159 c21593 = (C2159) interfaceC22083;
                                        if (!c21593.m2903(i8 & 1, (i8 & 3) != 2)) {
                                            c21593.m2899();
                                            return;
                                        }
                                        Object objM29053 = c21593.m2905();
                                        C2188 c21882 = C2204.f4319;
                                        if (objM29053 == c21882) {
                                            objM29053 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                                public final void invoke(InterfaceC2779 interfaceC2779) {
                                                    InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
                                                    interfaceC2779.mo4150(AbstractC2778.f6083, C6008.f15084);
                                                }

                                                @Override // p068.InterfaceC7387
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((InterfaceC2779) obj2);
                                                    return C6008.f15084;
                                                }
                                            };
                                            c21593.m2946(objM29053);
                                        }
                                        InterfaceC2962 interfaceC2962M4209 = AbstractC2783.m4209(C2958.f6621, false, (InterfaceC7387) objM29053);
                                        boolean zM2938 = c21593.m2938(c29302);
                                        final C2930 c29303 = c29302;
                                        Object objM29054 = c21593.m2905();
                                        if (zM2938 || objM29054 == c21882) {
                                            objM29054 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // p068.InterfaceC7387
                                                public /* synthetic */ Object invoke(Object obj2) {
                                                    m4391invokeozmzZPI(((C8735) obj2).f22224);
                                                    return C6008.f15084;
                                                }

                                                /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                public final void m4391invokeozmzZPI(long j) {
                                                    c29303.m4400setPopupContentSizefhxjrPA(new C8735(j));
                                                    c29303.m4403();
                                                }
                                            };
                                            c21593.m2946(objM29054);
                                        }
                                        InterfaceC2962 interfaceC2962M3667 = AbstractC2505.m3667(interfaceC2962M4209, (InterfaceC7387) objM29054);
                                        float f = c29302.getCanCalculatePosition() ? 1.0f : 0.0f;
                                        if (f != 1.0f) {
                                            interfaceC2962M3667 = AbstractC2416.m3453(interfaceC2962M3667, f, 0.0f, null, true, 520187);
                                        }
                                        InterfaceC2168 interfaceC21682 = interfaceC2168;
                                        C2193 c2193 = AbstractC2924.f6543;
                                        InterfaceC7383 interfaceC73832 = (InterfaceC7383) interfaceC21682.getValue();
                                        Object objM29055 = c21593.m2905();
                                        if (objM29055 == c21882) {
                                            objM29055 = C2928.f6546;
                                            c21593.m2946(objM29055);
                                        }
                                        InterfaceC2493 interfaceC2493 = (InterfaceC2493) objM29055;
                                        int iHashCode = Long.hashCode(c21593.f4182);
                                        C2088 c2088M2941 = c21593.m2941();
                                        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21593, interfaceC2962M3667);
                                        InterfaceC2619.f5567.getClass();
                                        InterfaceC7372 interfaceC73725 = C2600.f5530;
                                        c21593.m2956();
                                        if (c21593.f4183) {
                                            c21593.m2940(interfaceC73725);
                                        } else {
                                            c21593.m2950();
                                        }
                                        AbstractC2202.m3032(c21593, interfaceC2493, C2600.f5526);
                                        AbstractC2202.m3032(c21593, c2088M2941, C2600.f5527);
                                        AbstractC2202.m3032(c21593, Integer.valueOf(iHashCode), C2600.f5533);
                                        AbstractC2202.m3041(c21593, C2600.f5532);
                                        AbstractC2202.m3032(c21593, interfaceC2962M4421, C2600.f5528);
                                        interfaceC73832.invoke(c21593, 0);
                                        c21593.m2937(true);
                                    }

                                    @Override // p068.InterfaceC7383
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                        invoke((InterfaceC2208) obj2, ((Number) obj3).intValue());
                                        return C6008.f15084;
                                    }
                                }, c21592), c21592, 56);
                            }

                            @Override // p068.InterfaceC7383
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((InterfaceC2208) obj2, ((Number) obj3).intValue());
                                return C6008.f15084;
                            }
                        }));
                        c2159.m2946(c2930);
                        obj = c2930;
                    } else {
                        str = str2;
                        interfaceC5189 = null;
                        z = false;
                        obj = objM29052;
                    }
                    final C2930 c29302 = (C2930) obj;
                    int i7 = i5 & 112;
                    int i8 = i5 & 896;
                    boolean zM2938 = c2159.m2938(c29302) | (i7 == 32 ? true : z) | (i8 == 256 ? true : z) | c2159.m2920(str) | c2159.m2922(layoutDirection2.ordinal());
                    Object objM29053 = c2159.m2905();
                    if (zM2938 || objM29053 == c2188) {
                        final String str3 = str;
                        objM29053 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p068.InterfaceC7387
                            public final InterfaceC2195 invoke(C2153 c2153) {
                                C2930 c29303 = c29302;
                                c29303.f6571.addView(c29303, c29303.f6570);
                                c29302.m4401(interfaceC73724, c29234, str3, layoutDirection2);
                                return new C1554(c29302, 10);
                            }
                        };
                        c2159.m2946(objM29053);
                    }
                    AbstractC2202.m3044(c29302, (InterfaceC7387) objM29053, c2159);
                    boolean zM29382 = c2159.m2938(c29302) | (i7 == 32 ? true : z) | (i8 == 256 ? true : z) | c2159.m2920(str) | c2159.m2922(layoutDirection2.ordinal());
                    Object objM29054 = c2159.m2905();
                    if (zM29382 || objM29054 == c2188) {
                        final String str4 = str;
                        objM29054 = new InterfaceC7372() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m4390invoke() {
                                c29302.m4401(interfaceC73724, c29234, str4, layoutDirection2);
                            }

                            @Override // p068.InterfaceC7372
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m4390invoke();
                                return C6008.f15084;
                            }
                        };
                        layoutDirection = layoutDirection2;
                        c2159.m2946(objM29054);
                    } else {
                        layoutDirection = layoutDirection2;
                    }
                    AbstractC2202.m3062((InterfaceC7372) objM29054, c2159);
                    boolean zM29383 = c2159.m2938(c29302) | ((i5 & 14) == 4 ? true : z);
                    Object objM29055 = c2159.m2905();
                    if (zM29383 || objM29055 == c2188) {
                        objM29055 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p068.InterfaceC7387
                            public final InterfaceC2195 invoke(C2153 c2153) {
                                c29302.setPositionProvider(interfaceC29332);
                                c29302.m4403();
                                return new C2926();
                            }
                        };
                        c2159.m2946(objM29055);
                    }
                    AbstractC2202.m3044(interfaceC29332, (InterfaceC7387) objM29055, c2159);
                    boolean zM29384 = c2159.m2938(c29302);
                    Object objM29056 = c2159.m2905();
                    if (zM29384 || objM29056 == c2188) {
                        objM29056 = new AndroidPopup_androidKt$Popup$5$1(c29302, interfaceC5189);
                        c2159.m2946(objM29056);
                    }
                    AbstractC2202.m3060(c2159, c29302, (InterfaceC7383) objM29056);
                    boolean zM29385 = c2159.m2938(c29302);
                    Object objM29057 = c2159.m2905();
                    if (zM29385 || objM29057 == c2188) {
                        objM29057 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            public final void invoke(InterfaceC2530 interfaceC2530) {
                                InterfaceC2530 interfaceC2530Mo3640 = interfaceC2530.mo3640();
                                interfaceC2530Mo3640.getClass();
                                c29302.m4405(interfaceC2530Mo3640);
                            }

                            @Override // p068.InterfaceC7387
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((InterfaceC2530) obj2);
                                return C6008.f15084;
                            }
                        };
                        c2159.m2946(objM29057);
                    }
                    InterfaceC2962 interfaceC2962M3665 = AbstractC2505.m3665(C2958.f6621, (InterfaceC7387) objM29057);
                    boolean zM29386 = c2159.m2938(c29302) | c2159.m2922(layoutDirection.ordinal());
                    Object objM29058 = c2159.m2905();
                    if (zM29386 || objM29058 == c2188) {
                        objM29058 = new C2925(c29302, layoutDirection);
                        c2159.m2946(objM29058);
                    }
                    InterfaceC2493 interfaceC2493 = (InterfaceC2493) objM29058;
                    int iHashCode = Long.hashCode(c2159.f4182);
                    C2088 c2088M2941 = c2159.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M3665);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73725 = C2600.f5530;
                    c2159.m2956();
                    if (c2159.f4183) {
                        c2159.m2940(interfaceC73725);
                    } else {
                        c2159.m2950();
                    }
                    AbstractC2202.m3032(c2159, interfaceC2493, C2600.f5526);
                    AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
                    AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c2159, C2600.f5532);
                    AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
                    c2159.m2937(true);
                    interfaceC73723 = interfaceC73724;
                    c29233 = c29234;
                } else {
                    c2159.m2899();
                    interfaceC73723 = interfaceC73722;
                    c29233 = c29232;
                }
                c2224M2935 = c2159.m2935();
                if (c2224M2935 != null) {
                    c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(InterfaceC2208 interfaceC22082, int i9) {
                            AbstractC2924.m4395(interfaceC29332, interfaceC73723, c29233, interfaceC7383, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
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
            i3 |= 384;
            c29232 = c2923;
            if ((i & 3072) == 0) {
            }
            i5 = i3;
            if (c2159.m2903(i5 & 1, (i5 & 1171) != 1170)) {
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 != null) {
            }
        }
        interfaceC73722 = interfaceC7372;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        c29232 = c2923;
        if ((i & 3072) == 0) {
        }
        i5 = i3;
        if (c2159.m2903(i5 & 1, (i5 & 1171) != 1170)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
        }
    }
}
