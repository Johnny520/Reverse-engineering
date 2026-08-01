package androidx.compose.foundation.text.selection;

import android.content.ClipDescription;
import androidx.activity.C0863;
import androidx.collection.C1123;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.C1803;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.contextmenu.modifier.AbstractC1665;
import androidx.compose.foundation.text.contextmenu.modifier.C1663;
import androidx.compose.foundation.text.contextmenu.modifier.C1664;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.focus.C2303;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.platform.C2734;
import androidx.compose.p001ui.platform.InterfaceC2709;
import androidx.compose.p001ui.platform.InterfaceC2756;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2888;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2899;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.window.area.AbstractC3400;
import java.util.ArrayList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p124.C8144;
import p124.C8145;
import p124.InterfaceC8146;
import p128.C8157;
import p128.C8158;
import p228.C8780;
import p248.C8894;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1720 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f2826;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C1724 f2827;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1719 f2828;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C1664 f2829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC7372 f2830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1781 f2832;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1803 f2835;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f2836;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC2230 f2837;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C2869 f2838;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC2230 f2839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2847 f2840;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8894 f2841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f2842;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC2230 f2843;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f2844;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2230 f2845;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f2846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2869 f2847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6233 f2848;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC2756 f2849;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC8146 f2850;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C2303 f2851;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC1755 f2852;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC2709 f2853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2856 f2834 = AbstractC1821.f3196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7387 f2833 = new C0863(28);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2230 f2831 = AbstractC2202.m3034(new C2847(7, 0, (String) null));

    public C1720(C1803 c1803) {
        this.f2835 = c1803;
        Boolean bool = Boolean.TRUE;
        this.f2843 = AbstractC2202.m3034(bool);
        this.f2842 = AbstractC2202.m3034(bool);
        this.f2846 = 0L;
        this.f2844 = 0L;
        this.f2845 = AbstractC2202.m3034(null);
        this.f2837 = AbstractC2202.m3034(null);
        this.f2836 = -1;
        this.f2840 = new C2847(7, 0L, (String) null);
        this.f2839 = AbstractC2202.m3034(Boolean.FALSE);
        C1664 c1664 = new C1664();
        c1664.f2692 = ToolbarHandlerState.Uninitialized;
        this.f2829 = c1664;
        this.f2828 = new C1719(this);
        this.f2827 = new C1724(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ea  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m2309(C1720 c1720, C2847 c2847, long j, boolean z, boolean z2, C1123 c1123, boolean z3, C8145 c8145) {
        C1801 c1801M2425;
        long j2;
        int i;
        long j3;
        C1749 c1749;
        long j4;
        C2902 c2902;
        C1749 c17492;
        boolean z4;
        InterfaceC8146 interfaceC8146;
        C1750 c1750M2378;
        C1750 c1750;
        C1750 c17502;
        C1749 c17493;
        C1749 c1749M2381;
        C1781 c1781 = c1720.f2832;
        if (c1781 == null || (c1801M2425 = c1781.m2425()) == null) {
            return C2869.f6348;
        }
        InterfaceC2856 interfaceC2856 = c1720.f2834;
        long j5 = c2847.f6291;
        C2902 c29022 = c2847.f6292;
        int i2 = C2869.f6347;
        int i3 = (int) (j5 >> 32);
        interfaceC2856.mo2442(i3);
        int i4 = (int) (j5 & 4294967295L);
        c1720.f2834.mo2442(i4);
        long jM4330 = AbstractC2882.m4330(i3, i4);
        int iM2438 = c1801M2425.m2438(j, false);
        int i5 = (z2 || z) ? iM2438 : (int) (jM4330 >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iM2438;
        } else {
            j2 = 4294967295L;
            i = (int) (jM4330 & 4294967295L);
        }
        C8894 c8894 = c1720.f2841;
        int i6 = -1;
        if (z || c8894 == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i7 = c1720.f2836;
            if (i7 != -1) {
                i6 = i7;
            }
        }
        C2867 c2867 = c1801M2425.f3090;
        if (z) {
            c2902 = c29022;
            j4 = j5;
            c1749 = null;
        } else {
            j4 = j5;
            int i8 = (int) (jM4330 >> 32);
            c2902 = c29022;
            int i9 = (int) (jM4330 & j3);
            c1749 = new C1749(new C1750(AbstractC1733.m2372(c2867, i8), i8, 1L), new C1750(AbstractC1733.m2372(c2867, i9), i9, 1L), C2869.m4316(jM4330));
        }
        C8894 c88942 = new C8894(1, c1749, new C1758(i5, i, i6, c2867), z2);
        if (c1749 != null && c8894 != null && z2 == c8894.f22590) {
            C1758 c1758 = (C1758) c8894.f22589;
            if (i5 == c1758.f2958 && i == c1758.f2957) {
                return j4;
            }
        }
        c1720.f2841 = c88942;
        c1720.f2836 = iM2438;
        int i10 = c1123.f1328;
        Object obj = c88942.f22589;
        switch (i10) {
            case 2:
                C1758 c17582 = (C1758) obj;
                c17492 = new C1749(c17582.m2387(c17582.f2958), c17582.m2387(c17582.f2957), c88942.m14112() == CrossStatus.CROSSED);
                break;
            case 3:
                c17492 = AbstractC1733.m2361(c88942, C1753.f2946);
                break;
            case 4:
                c17492 = AbstractC1733.m2361(c88942, C1753.f2947);
                break;
            default:
                Object obj2 = c88942.f22591;
                c17492 = (C1749) obj2;
                C1758 c17583 = (C1758) obj;
                if (c17492 == null) {
                    c17492 = AbstractC1733.m2361(c88942, C1753.f2946);
                    break;
                } else {
                    C1750 c17503 = c17492.f2931;
                    C1750 c17504 = c17492.f2932;
                    if (c88942.f22590) {
                        c1750M2378 = AbstractC1733.m2378(c88942, c17583, c17504);
                        c17502 = c17503;
                        c17503 = c17504;
                        c1750 = c1750M2378;
                    } else {
                        c1750M2378 = AbstractC1733.m2378(c88942, c17583, c17503);
                        c1750 = c17504;
                        c17502 = c1750M2378;
                    }
                    if (!AbstractC5227.m9466(c1750M2378, c17503)) {
                        C1749 c17494 = new C1749(c1750, c17502, c88942.m14112() == CrossStatus.CROSSED || (c88942.m14112() == CrossStatus.COLLAPSED && c1750.f2934 > c17502.f2934));
                        C1758 c17584 = (C1758) obj;
                        C1750 c17505 = c17494.f2932;
                        long j6 = c17505.f2933;
                        C1750 c17506 = c17494.f2931;
                        if (j6 != c17506.f2933) {
                            boolean z5 = c17494.f2930;
                            if ((z5 ? c17505 : c17506).f2934 == 0) {
                                if (((C2867) c17584.f2955).f6336.f6342.f6474.length() == (z5 ? c17506 : c17505).f2934) {
                                    new Ref$BooleanRef().element = true;
                                    c17493 = (C1749) obj2;
                                    String str = ((C2867) c17584.f2955).f6336.f6342.f6474;
                                    if (c17493 == null) {
                                    }
                                }
                            }
                            c17492 = c17494;
                            break;
                        } else if (c17505.f2934 == c17506.f2934) {
                            c17493 = (C1749) obj2;
                            String str2 = ((C2867) c17584.f2955).f6336.f6342.f6474;
                            if (c17493 == null && str2.length() != 0) {
                                boolean z6 = c88942.f22590;
                                String str3 = ((C2867) c17584.f2955).f6336.f6342.f6474;
                                int i11 = c17584.f2958;
                                int length = str3.length();
                                if (i11 == 0) {
                                    int iM2461 = AbstractC1821.m2461(0, str3);
                                    c1749M2381 = z6 ? C1749.m2381(c17494, AbstractC1733.m2377(c17505, c17584, iM2461), null, true, 2) : C1749.m2381(c17494, null, AbstractC1733.m2377(c17506, c17584, iM2461), false, 1);
                                } else if (i11 == length) {
                                    int iM2463 = AbstractC1821.m2463(length, str3);
                                    c1749M2381 = z6 ? C1749.m2381(c17494, AbstractC1733.m2377(c17505, c17584, iM2463), null, false, 2) : C1749.m2381(c17494, null, AbstractC1733.m2377(c17506, c17584, iM2463), true, 1);
                                } else {
                                    boolean z7 = c17493.f2930;
                                    int iM24632 = z6 ^ z7 ? AbstractC1821.m2463(i11, str3) : AbstractC1821.m2461(i11, str3);
                                    c1749M2381 = z6 ? C1749.m2381(c17494, AbstractC1733.m2377(c17505, c17584, iM24632), null, z7, 2) : C1749.m2381(c17494, null, AbstractC1733.m2377(c17506, c17584, iM24632), z7, 1);
                                }
                                c17492 = c1749M2381;
                            } else {
                                c17492 = c17494;
                            }
                            break;
                        }
                    }
                }
                break;
        }
        InterfaceC2856 interfaceC28562 = c1720.f2834;
        int i12 = c17492.f2932.f2934;
        interfaceC28562.mo2443(i12);
        InterfaceC2856 interfaceC28563 = c1720.f2834;
        int i13 = c17492.f2931.f2934;
        interfaceC28563.mo2443(i13);
        long jM43302 = AbstractC2882.m4330(i12, i13);
        long j7 = j4;
        if (C2869.m4313(jM43302, j7)) {
            return j7;
        }
        boolean z8 = C2869.m4316(jM43302) != C2869.m4316(j7) && C2869.m4313(AbstractC2882.m4330((int) (jM43302 & j3), (int) (jM43302 >> 32)), j7);
        boolean z9 = C2869.m4312(jM43302) && C2869.m4312(j7);
        if (z3 && c2902.f6474.length() > 0 && !z8 && !z9 && c8145 != null && (interfaceC8146 = c1720.f2850) != null) {
            ((C8144) interfaceC8146).m13068(c8145.f19852);
        }
        c1720.f2833.invoke(m2312(c2902, jM43302));
        c1720.f2838 = new C2869(jM43302);
        if (!z3) {
            c1720.m2313(!C2869.m4312(jM43302));
        }
        C1781 c17812 = c1720.f2832;
        if (c17812 != null) {
            ((AbstractC2182) c17812.f3024).setValue(Boolean.valueOf(z3));
        }
        C1781 c17813 = c1720.f2832;
        if (c17813 != null) {
            ((AbstractC2182) c17813.f3023).setValue(Boolean.valueOf(!C2869.m4312(jM43302) && AbstractC1733.m2373(c1720, true)));
        }
        C1781 c17814 = c1720.f2832;
        if (c17814 != null) {
            z4 = false;
            ((AbstractC2182) c17814.f3022).setValue(Boolean.valueOf(!C2869.m4312(jM43302) && AbstractC1733.m2373(c1720, false)));
        } else {
            z4 = false;
        }
        C1781 c17815 = c1720.f2832;
        if (c17815 != null) {
            ((AbstractC2182) c17815.f3026).setValue(Boolean.valueOf((C2869.m4312(jM43302) && AbstractC1733.m2373(c1720, true)) ? true : z4));
        }
        return jM43302;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2310(C1720 c1720, C2869 c2869) {
        C2902 c2902M2320;
        String str;
        InterfaceC6233 interfaceC6233;
        if (c2869 == null) {
            return;
        }
        long j = c2869.f6349;
        InterfaceC1755 interfaceC1755 = c1720.f2852;
        if (interfaceC1755 == null || (c2902M2320 = c1720.m2320()) == null || (str = c2902M2320.f6474) == null) {
            return;
        }
        InterfaceC2856 interfaceC2856 = c1720.f2834;
        int i = (int) (j >> 32);
        interfaceC2856.mo2442(i);
        int i2 = (int) (j & 4294967295L);
        interfaceC2856.mo2442(i2);
        long jM4330 = AbstractC2882.m4330(i, i2);
        if (str.length() <= 0 || C2869.m4312(jM4330) || (interfaceC6233 = c1720.f2848) == null) {
            return;
        }
        AbstractC6231.m11036(interfaceC6233, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(interfaceC1755, str, jM4330, c2869, c1720, interfaceC2856, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Pair m2311(C1720 c1720) {
        String str;
        C2869 c2869;
        C2902 c2902M2320 = c1720.m2320();
        if (c2902M2320 == null || (str = c2902M2320.f6474) == null || (c2869 = c1720.f2838) == null) {
            return null;
        }
        long j = c2869.f6349;
        int i = (int) (j >> 32);
        c1720.f2834.mo2442(i);
        int i2 = (int) (j & 4294967295L);
        c1720.f2834.mo2442(i2);
        return new Pair(str, new C2869(AbstractC2882.m4330(i, i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C2847 m2312(C2902 c2902, long j) {
        return new C2847(c2902, j, (C2869) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m2313(boolean z) {
        C1781 c1781 = this.f2832;
        if (c1781 != null) {
            ((AbstractC2182) c1781.f3031).setValue(Boolean.valueOf(z));
        }
        if (z) {
            m2315();
        } else {
            m2323();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2314(ContinuationImpl continuationImpl) {
        TextFieldSelectionManager$updateClipboardEntry$1 textFieldSelectionManager$updateClipboardEntry$1;
        if (continuationImpl instanceof TextFieldSelectionManager$updateClipboardEntry$1) {
            textFieldSelectionManager$updateClipboardEntry$1 = (TextFieldSelectionManager$updateClipboardEntry$1) continuationImpl;
            int i = textFieldSelectionManager$updateClipboardEntry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                textFieldSelectionManager$updateClipboardEntry$1.label = i - Integer.MIN_VALUE;
            } else {
                textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, continuationImpl);
            }
        }
        Object objValueOf = textFieldSelectionManager$updateClipboardEntry$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = textFieldSelectionManager$updateClipboardEntry$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objValueOf);
            InterfaceC2756 interfaceC2756 = this.f2849;
            if (interfaceC2756 != null) {
                textFieldSelectionManager$updateClipboardEntry$1.L$0 = this;
                textFieldSelectionManager$updateClipboardEntry$1.label = 1;
                ClipDescription primaryClipDescription = ((C2734) interfaceC2756).f5911.m4154().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (C1720) textFieldSelectionManager$updateClipboardEntry$1.L$0;
        AbstractC6017.m10769(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        ((AbstractC2182) this.f2839).setValue(bool);
        return C6008.f15084;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (((java.lang.Boolean) ((androidx.compose.runtime.AbstractC2182) r3.f3024).getValue()).booleanValue() == false) goto L18;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2315() {
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            if (m2327()) {
                C1781 c1781 = this.f2832;
                if (c1781 != null) {
                }
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                this.f2829.m2202();
            }
        } finally {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m2316() {
        return m2330() && ((Boolean) ((AbstractC2182) this.f2839).getValue()).booleanValue() && this.f2849 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2317() {
        return (C2869.m4312(m2319().f6291) || !m2330() || this.f2849 == null) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2318() {
        return m2330() && C2869.m4312(m2319().f6291);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2847 m2319() {
        return (C2847) ((AbstractC2182) this.f2831).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2902 m2320() {
        C1781 c1781 = this.f2832;
        if (c1781 != null) {
            return c1781.f3015.f3301;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m2321() {
        C2847 c2847M2312 = m2312(m2319().f6292, AbstractC2882.m4330(0, m2319().f6292.f6474.length()));
        this.f2833.invoke(c2847M2312);
        long j = c2847M2312.f6291;
        this.f2838 = new C2869(j);
        this.f2840 = C2847.m4275(this.f2840, null, j, 5);
        m2334(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m2322(HandleState handleState) {
        C1781 c1781 = this.f2832;
        if (c1781 != null) {
            if (c1781.m2428() == handleState) {
                c1781 = null;
            }
            if (c1781 != null) {
                ((AbstractC2182) c1781.f3030).setValue(handleState);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2323() {
        C6249 c6249;
        C1663 c1663 = this.f2829.f2693;
        if (c1663 == null || (c6249 = c1663.f2687) == null) {
            return;
        }
        c6249.mo10815(null);
        c1663.f2687 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2324() {
        InterfaceC6233 interfaceC6233 = this.f2848;
        if (interfaceC6233 != null) {
            AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2962 m2325() {
        if (!m2327()) {
            return C2958.f6621;
        }
        return AbstractC1665.m2203(AbstractC1665.m2204(new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.f2829, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new C1752(this, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8157 m2326() {
        char c;
        long j;
        float fIntBitsToFloat;
        InterfaceC2530 interfaceC2530M2426;
        C2867 c2867;
        InterfaceC2530 interfaceC2530M24262;
        C2867 c28672;
        InterfaceC2530 interfaceC2530M24263;
        InterfaceC2530 interfaceC2530M24264;
        C1781 c1781 = this.f2832;
        if (c1781 != null) {
            if (c1781.f3027) {
                c1781 = null;
            }
            if (c1781 != null) {
                InterfaceC2856 interfaceC2856 = this.f2834;
                long j2 = m2319().f6291;
                int i = C2869.f6347;
                int i2 = (int) (j2 >> 32);
                interfaceC2856.mo2442(i2);
                InterfaceC2856 interfaceC28562 = this.f2834;
                int i3 = (int) (m2319().f6291 & 4294967295L);
                interfaceC28562.mo2442(i3);
                C1781 c17812 = this.f2832;
                long jMo3636 = 0;
                long jMo36362 = (c17812 == null || (interfaceC2530M24264 = c17812.m2426()) == null) ? 0L : interfaceC2530M24264.mo3636(m2328(true));
                C1781 c17813 = this.f2832;
                if (c17813 != null && (interfaceC2530M24263 = c17813.m2426()) != null) {
                    jMo3636 = interfaceC2530M24263.mo3636(m2328(false));
                }
                C1781 c17814 = this.f2832;
                float fIntBitsToFloat2 = 0.0f;
                if (c17814 == null || (interfaceC2530M24262 = c17814.m2426()) == null) {
                    c = ' ';
                    j = jMo3636;
                    fIntBitsToFloat = 0.0f;
                } else {
                    C1801 c1801M2425 = c1781.m2425();
                    c = ' ';
                    j = jMo3636;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2530M24262.mo3636((((long) Float.floatToRawIntBits((c1801M2425 == null || (c28672 = c1801M2425.f3090) == null) ? 0.0f : c28672.m4303(i2).f19884)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                }
                C1781 c17815 = this.f2832;
                if (c17815 != null && (interfaceC2530M2426 = c17815.m2426()) != null) {
                    C1801 c1801M24252 = c1781.m2425();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2530M2426.mo3636((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits((c1801M24252 == null || (c2867 = c1801M24252.f3090) == null) ? 0.0f : c2867.m4303(i3).f19884)) & 4294967295L)) & 4294967295L));
                }
                int i4 = (int) (jMo36362 >> c);
                int i5 = (int) (j >> c);
                return new C8157(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), (c1781.f3015.f3303.mo1816() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo36362 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
            }
        }
        return C8157.f19881;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m2327() {
        return ((Boolean) ((AbstractC2182) this.f2842).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long m2328(boolean z) {
        C1801 c1801M2425;
        C2867 c2867;
        long j;
        C1781 c1781 = this.f2832;
        if (c1781 != null && (c1801M2425 = c1781.m2425()) != null && (c2867 = c1801M2425.f3090) != null) {
            C2896 c2896 = c2867.f6335;
            C2902 c2902M2320 = m2320();
            if (c2902M2320 != null) {
                if (AbstractC5227.m9466(c2902M2320.f6474, c2867.f6336.f6342.f6474)) {
                    C2847 c2847M2319 = m2319();
                    if (z) {
                        long j2 = c2847M2319.f6291;
                        int i = C2869.f6347;
                        j = j2 >> 32;
                    } else {
                        long j3 = c2847M2319.f6291;
                        int i2 = C2869.f6347;
                        j = j3 & 4294967295L;
                    }
                    int i3 = (int) j;
                    this.f2834.mo2442(i3);
                    boolean zM4316 = C2869.m4316(m2319().f6291);
                    long j4 = c2867.f6334;
                    int iM4348 = c2896.m4348(i3);
                    if (iM4348 >= c2896.f6445) {
                        return 9205357640488583168L;
                    }
                    boolean z2 = c2867.m4305(((!z || zM4316) && (z || !zM4316)) ? Math.max(i3 + (-1), 0) : i3) == c2867.m4306(i3);
                    c2896.m4356(i3);
                    int length = ((C2902) c2896.f6450.f3965).f6474.length();
                    ArrayList arrayList = c2896.f6451;
                    C2899 c2899 = (C2899) arrayList.get(i3 == length ? AbstractC7176.m12460(arrayList) : AbstractC2882.m4328(i3, arrayList));
                    C2888 c2888 = c2899.f6467;
                    int iM4358 = c2899.m4358(i3);
                    C8780 c8780 = c2888.f6431;
                    return (((long) Float.floatToRawIntBits(AbstractC3400.m5631(c2896.m4350(iM4348), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC3400.m5631(z2 ? c8780.m14004(iM4358, false) : c8780.m14006(iM4358, false), 0.0f, (int) (j4 >> 32)))) << 32);
                }
            }
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C8158 m2329() {
        return (C8158) ((AbstractC2182) this.f2837).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m2330() {
        return ((Boolean) ((AbstractC2182) this.f2843).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6249 m2331(boolean z) {
        InterfaceC6233 interfaceC6233 = this.f2848;
        if (interfaceC6233 != null) {
            return AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m2332() {
        return C2869.m4311(m2319().f6291) != m2319().f6292.f6474.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2333(C8158 c8158) {
        int iM4310;
        if (!C2869.m4312(m2319().f6291)) {
            C1781 c1781 = this.f2832;
            C1801 c1801M2425 = c1781 != null ? c1781.m2425() : null;
            if (c8158 == null || c1801M2425 == null) {
                iM4310 = C2869.m4310(m2319().f6291);
            } else {
                InterfaceC2856 interfaceC2856 = this.f2834;
                iM4310 = c1801M2425.m2438(c8158.f19886, true);
                interfaceC2856.mo2443(iM4310);
            }
            C2847 c2847M4275 = C2847.m4275(m2319(), null, AbstractC2882.m4330(iM4310, iM4310), 5);
            this.f2833.invoke(c2847M4275);
            this.f2838 = new C2869(c2847M4275.f6291);
        }
        m2322((c8158 == null || m2319().f6292.f6474.length() <= 0) ? HandleState.None : HandleState.Cursor);
        m2313(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2334(boolean z) {
        C2303 c2303;
        C1781 c1781 = this.f2832;
        if (c1781 != null && !c1781.m2427() && (c2303 = this.f2851) != null) {
            C2303.m3192(c2303);
        }
        this.f2840 = m2319();
        m2313(z);
        m2322(HandleState.Selection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2335() {
        InterfaceC6233 interfaceC6233 = this.f2848;
        if (interfaceC6233 != null) {
            AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }
}
