package androidx.compose.p001ui.window;

import android.view.View;
import androidx.compose.foundation.lazy.layout.C1554;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2149;
import androidx.compose.runtime.C2153;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2195;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import java.util.Arrays;
import java.util.UUID;
import kotlin.C6008;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p132.AbstractC8176;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2927 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m4396(final InterfaceC2962 interfaceC2962, final InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c2159.m2938(interfaceC7383) ? 32 : 16;
        }
        if (c2159.m2903(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = C2928.f6547;
                c2159.m2946(objM2905);
            }
            InterfaceC2493 interfaceC2493 = (InterfaceC2493) objM2905;
            int iHashCode = Long.hashCode(c2159.f4182);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962);
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC7372 = C2600.f5530;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, interfaceC2493, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            interfaceC7383.invoke(c2159, Integer.valueOf((i5 >> 6) & 14));
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i6) {
                    AbstractC2927.m4396(interfaceC2962, interfaceC7383, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4397(final InterfaceC7372 interfaceC7372, C2940 c2940, final InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, final int i, final int i2) {
        int i3;
        C2940 c29402;
        int i4;
        final C2940 c29403;
        C2224 c2224M2935;
        boolean z;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(826668973);
        if ((i & 6) == 0) {
            i3 = (c2159.m2938(interfaceC7372) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                c29402 = c2940;
                i3 |= c2159.m2920(c29402) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= c2159.m2938(interfaceC7383) ? 256 : 128;
            }
            i4 = i3;
            if (c2159.m2903(i4 & 1, (i4 & 147) == 146)) {
                c2159.m2899();
                c29403 = c29402;
            } else {
                c29403 = i5 != 0 ? new C2940(7) : c29402;
                View view = (View) c2159.m2943(AbstractC2670.f5677);
                InterfaceC8725 interfaceC8725 = (InterfaceC8725) c2159.m2943(AbstractC2737.f5933);
                final LayoutDirection layoutDirection = (LayoutDirection) c2159.m2943(AbstractC2737.f5927);
                C2149 c2149M3040 = AbstractC2202.m3040(c2159);
                final InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(interfaceC7383, c2159);
                Object[] objArr = new Object[0];
                Object objM2905 = c2159.m2905();
                C2188 c2188 = C2204.f4319;
                if (objM2905 == c2188) {
                    objM2905 = new InterfaceC7372() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1
                        @Override // p068.InterfaceC7372
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    };
                    c2159.m2946(objM2905);
                }
                UUID uuid = (UUID) AbstractC8176.m13098(Arrays.copyOf(objArr, 0), AbstractC8176.f19918, (InterfaceC7372) objM2905, c2159, 3456);
                boolean zM2922 = c2159.m2922(c29403.f6592) | c2159.m2920(view) | c2159.m2920(interfaceC8725) | c2159.m2920(null);
                Object objM29052 = c2159.m2905();
                if (zM2922 || objM29052 == c2188) {
                    DialogC2938 dialogC2938 = new DialogC2938(interfaceC7372, c29403, view, layoutDirection, interfaceC8725, uuid);
                    z = true;
                    C2077 c2077 = new C2077(-1338939603, true, new InterfaceC7383() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        {
                            super(2);
                        }

                        public final void invoke(InterfaceC2208 interfaceC22082, int i6) {
                            C2159 c21592 = (C2159) interfaceC22082;
                            if (!c21592.m2903(i6 & 1, (i6 & 3) != 2)) {
                                c21592.m2899();
                                return;
                            }
                            Object objM29053 = c21592.m2905();
                            if (objM29053 == C2204.f4319) {
                                objM29053 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                    public final void invoke(InterfaceC2779 interfaceC2779) {
                                        InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
                                        interfaceC2779.mo4150(AbstractC2778.f6067, C6008.f15084);
                                    }

                                    @Override // p068.InterfaceC7387
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((InterfaceC2779) obj);
                                        return C6008.f15084;
                                    }
                                };
                                c21592.m2946(objM29053);
                            }
                            AbstractC2927.m4396(AbstractC2783.m4209(C2958.f6621, false, (InterfaceC7387) objM29053), (InterfaceC7383) interfaceC2230M3039.getValue(), c21592, 0, 0);
                        }

                        @Override // p068.InterfaceC7383
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                            return C6008.f15084;
                        }
                    });
                    C2936 c2936 = dialogC2938.f6581;
                    c2936.setParentCompositionContext(c2149M3040);
                    ((AbstractC2182) c2936.f6577).setValue(c2077);
                    c2936.f6573 = true;
                    c2936.m4056();
                    c2159.m2946(dialogC2938);
                    objM29052 = dialogC2938;
                } else {
                    z = true;
                }
                final DialogC2938 dialogC29382 = (DialogC2938) objM29052;
                boolean zM2938 = c2159.m2938(dialogC29382);
                Object objM29053 = c2159.m2905();
                if (zM2938 || objM29053 == c2188) {
                    objM29053 = new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                        {
                            super(1);
                        }

                        @Override // p068.InterfaceC7387
                        public final InterfaceC2195 invoke(C2153 c2153) {
                            dialogC29382.show();
                            return new C1554(dialogC29382, 9);
                        }
                    };
                    c2159.m2946(objM29053);
                }
                AbstractC2202.m3044(dialogC29382, (InterfaceC7387) objM29053, c2159);
                boolean zM29382 = c2159.m2938(dialogC29382) | ((i4 & 14) == 4 ? z : false);
                if ((i4 & 112) != 32) {
                    z = false;
                }
                boolean zM29222 = zM29382 | z | c2159.m2922(layoutDirection.ordinal());
                Object objM29054 = c2159.m2905();
                if (zM29222 || objM29054 == c2188) {
                    objM29054 = new InterfaceC7372() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m4389invoke() {
                            dialogC29382.m4409(interfaceC7372, c29403, layoutDirection);
                        }

                        @Override // p068.InterfaceC7372
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m4389invoke();
                            return C6008.f15084;
                        }
                    };
                    c2159.m2946(objM29054);
                }
                AbstractC2202.m3062((InterfaceC7372) objM29054, c2159);
            }
            c2224M2935 = c2159.m2935();
            if (c2224M2935 == null) {
                c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(InterfaceC2208 interfaceC22082, int i6) {
                        AbstractC2927.m4397(interfaceC7372, c29403, interfaceC7383, interfaceC22082, AbstractC2202.m3031(i | 1), i2);
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
        i3 |= 48;
        c29402 = c2940;
        if ((i & 384) == 0) {
        }
        i4 = i3;
        if (c2159.m2903(i4 & 1, (i4 & 147) == 146)) {
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 == null) {
        }
    }
}
