package androidx.compose.foundation.lazy;

import android.widget.ProgressBar;
import androidx.activity.C0016;
import androidx.appcompat.app.C0076;
import androidx.collection.C0236;
import androidx.collection.C0276;
import androidx.compose.animation.C0402;
import androidx.compose.animation.C0426;
import androidx.compose.animation.core.C0345;
import androidx.compose.foundation.text.AbstractC0994;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0962;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.C0965;
import androidx.compose.foundation.text.C0993;
import androidx.compose.foundation.text.C0995;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.selection.C0888;
import androidx.compose.foundation.text.selection.C0931;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.graphics.drawscope.C1510;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2034;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2047;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C1997;
import androidx.compose.ui.text.input.C2010;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.InterfaceC2022;
import androidx.core.view.C2257;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.compose.C2363;
import io.ktor.server.http.content.C4124;
import io.ktor.util.C4211;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5144;
import kotlin.text.C5141;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.bean.MessageData;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p112.C7328;
import p116.C7339;
import p116.C7349;
import p175.AbstractC7739;
import p209.C7924;
import p209.C7931;
import p209.InterfaceC7923;
import p217.AbstractC7969;
import p236.C8125;
import p287.AbstractC8405;
import p320.C8686;
import p325.C8740;
import p325.C8741;
import p329.AbstractC8765;
import p329.C8774;
import p385.C9066;
import p386.C9079;
import p388.C9082;
import top.yukonga.miuix.kmp.basic.C6034;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0756 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2196;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2199;

    public /* synthetic */ C0756(InterfaceC1395 interfaceC1395, ArrayList arrayList, List list, boolean z) {
        this.f2199 = 0;
        this.f2197 = interfaceC1395;
        this.f2198 = arrayList;
        this.f2196 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) throws IOException {
        Integer numM1784;
        Integer numM1783;
        Integer numM17832;
        Integer numM17842;
        C2033 c2033;
        C2033 c20332;
        C0963 c0963;
        C0963 c09632;
        Integer numM17843;
        Integer numM17833;
        Integer numM17834;
        Integer numM17844;
        C2033 c20333;
        C2033 c20334;
        C0963 c09633;
        C0963 c09634;
        C0962 c0962;
        List listM8778;
        int i = this.f2199;
        int i2 = 3;
        int i3 = 2;
        int i4 = 8;
        int i5 = 0;
        int i6 = 1;
        C2013 c2013 = null;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2196;
        Object obj3 = this.f2198;
        Object obj4 = this.f2197;
        switch (i) {
            case 0:
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                abstractC1708.f4980 = true;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((C0749) arrayList.get(i7)).m1562(abstractC1708);
                }
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((C0749) list.get(i8)).m1562(abstractC1708);
                }
                abstractC1708.f4980 = false;
                interfaceC1395.getValue();
                return c5176;
            case 1:
                InterfaceC6558 interfaceC6558 = (InterfaceC6558) obj3;
                InterfaceC1395 interfaceC13952 = (InterfaceC1395) obj2;
                C2013 c20132 = (C2013) obj;
                ((InterfaceC1395) obj4).setValue(c20132);
                boolean zM8907 = AbstractC4395.m8907((String) interfaceC13952.getValue(), c20132.f5947.f6129);
                C2068 c2068 = c20132.f5947;
                interfaceC13952.setValue(c2068.f6129);
                if (!zM8907) {
                    interfaceC6558.invoke(c2068.f6129);
                }
                return c5176;
            case 2:
                C0943 c0943 = (C0943) obj4;
                long j = ((C2013) obj3).f5946;
                InterfaceC2022 interfaceC2022 = (InterfaceC2022) obj2;
                InterfaceC1504 interfaceC1504 = (InterfaceC1504) obj;
                C0963 c0963M1865 = c0943.m1865();
                if (c0963M1865 == null) {
                    return c5176;
                }
                InterfaceC1601 interfaceC1601M386 = interfaceC1504.mo2706().m386();
                long j2 = ((C2035) ((AbstractC1347) c0943.f2662).getValue()).f6004;
                long j3 = ((C2035) ((AbstractC1347) c0943.f2661).getValue()).f6004;
                C2033 c20335 = c0963M1865.f2745;
                C1609 c1609 = c0943.f2664;
                long j4 = c0943.f2663;
                if (!C2035.m3752(j2)) {
                    c1609.m2969(j4);
                    int iM3757 = C2035.m3757(j2);
                    interfaceC2022.mo1882(iM3757);
                    int iM3750 = C2035.m3750(j2);
                    interfaceC2022.mo1882(iM3750);
                    if (iM3757 != iM3750) {
                        interfaceC1601M386.mo2688(c20335.m3748(iM3757, iM3750), c1609);
                    }
                } else if (!C2035.m3752(j3)) {
                    long jM3739 = c20335.f5991.f5996.m3739();
                    C1599 c1599 = new C1599(jM3739);
                    if (jM3739 == 16) {
                        c1599 = null;
                    }
                    long j5 = c1599 != null ? c1599.f4700 : C1599.f4696;
                    c1609.m2969(C1599.m2950(C1599.m2948(j5) * 0.2f, j5));
                    int iM37572 = C2035.m3757(j3);
                    interfaceC2022.mo1882(iM37572);
                    int iM37502 = C2035.m3750(j3);
                    interfaceC2022.mo1882(iM37502);
                    if (iM37572 != iM37502) {
                        interfaceC1601M386.mo2688(c20335.m3748(iM37572, iM37502), c1609);
                    }
                } else if (!C2035.m3752(j)) {
                    c1609.m2969(j4);
                    int iM37573 = C2035.m3757(j);
                    interfaceC2022.mo1882(iM37573);
                    int iM37503 = C2035.m3750(j);
                    interfaceC2022.mo1882(iM37503);
                    if (iM37573 != iM37503) {
                        interfaceC1601M386.mo2688(c20335.m3748(iM37573, iM37503), c1609);
                    }
                }
                boolean zM3742 = c20335.m3742();
                C2062 c2062 = c20335.f5990;
                C2034 c2034 = c20335.f5991;
                boolean z = zM3742 && c2034.f5992 != 3;
                if (z) {
                    long j6 = c20335.f5989;
                    C7328 c7328M13070 = AbstractC7739.m13070(0L, (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32));
                    interfaceC1601M386.mo2677();
                    InterfaceC1601.m2955(interfaceC1601M386, c7328M13070);
                }
                C2047 c2047 = c2034.f5996.f5984;
                C7931 c7931 = c2047.f6060;
                InterfaceC7923 interfaceC7923 = c2047.f6058;
                if (c7931 == null) {
                    c7931 = C7931.f21961;
                }
                C7931 c79312 = c7931;
                C1570 c1570 = c2047.f6059;
                if (c1570 == null) {
                    c1570 = C1570.f4616;
                }
                C1570 c15702 = c1570;
                AbstractC1505 abstractC1505 = c2047.f6061;
                if (abstractC1505 == null) {
                    abstractC1505 = C1510.f4295;
                }
                AbstractC1505 abstractC15052 = abstractC1505;
                try {
                    AbstractC1598 abstractC1598Mo13416 = interfaceC7923.mo13416();
                    C7924 c7924 = C7924.f21945;
                    if (abstractC1598Mo13416 != null) {
                        C2062.m3785(c2062, interfaceC1601M386, abstractC1598Mo13416, interfaceC7923 != c7924 ? interfaceC7923.mo13418() : 1.0f, c15702, c79312, abstractC15052);
                    } else {
                        C2062.m3784(c2062, interfaceC1601M386, interfaceC7923 != c7924 ? interfaceC7923.mo13417() : C1599.f4696, c15702, c79312, abstractC15052);
                    }
                    if (!z) {
                        return c5176;
                    }
                    interfaceC1601M386.mo2689();
                    return c5176;
                } catch (Throwable th) {
                    if (z) {
                        interfaceC1601M386.mo2689();
                    }
                    throw th;
                }
            case 3:
                InterfaceC6558 interfaceC65582 = (InterfaceC6558) obj3;
                C1997 c1997 = (C1997) ((Ref$ObjectRef) obj2).element;
                C2013 c2013M287 = ((C0076) obj4).m287((List) obj);
                if (c1997 != null) {
                    c1997.m3709(null, c2013M287);
                }
                interfaceC65582.invoke(c2013M287);
                return c5176;
            case 4:
                C0993 c0993 = (C0993) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                C0888 c0888 = (C0888) obj;
                int i9 = 4;
                switch (AbstractC0994.f2914[((KeyCommand) obj4).ordinal()]) {
                    case 1:
                        c0993.f2906.m1771(false);
                        break;
                    case 2:
                        c0993.f2906.m1764();
                        break;
                    case 3:
                        c0993.f2906.m1775();
                        break;
                    case 4:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            if (C2035.m3752(c0888.f2518)) {
                                c0888.m1798();
                            } else {
                                boolean zM1782 = c0888.m1782();
                                long j7 = c0888.f2518;
                                if (zM1782) {
                                    int iM37574 = C2035.m3757(j7);
                                    c0888.m1790(iM37574, iM37574);
                                } else {
                                    int iM37504 = C2035.m3750(j7);
                                    c0888.m1790(iM37504, iM37504);
                                }
                            }
                        }
                        break;
                    case 5:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            if (C2035.m3752(c0888.f2518)) {
                                c0888.m1789();
                            } else {
                                boolean zM17822 = c0888.m1782();
                                long j8 = c0888.f2518;
                                if (zM17822) {
                                    int iM37505 = C2035.m3750(j8);
                                    c0888.m1790(iM37505, iM37505);
                                } else {
                                    int iM37575 = C2035.m3757(j8);
                                    c0888.m1790(iM37575, iM37575);
                                }
                            }
                        }
                        break;
                    case 6:
                        C0931 c0931 = c0888.f2519;
                        c0931.f2641 = null;
                        C2068 c20682 = c0888.f2525;
                        String str = c20682.f6129;
                        String str2 = c20682.f6129;
                        if (str.length() > 0) {
                            if (c0888.m1782()) {
                                c0931.f2641 = null;
                                if (str2.length() > 0 && (numM1783 = c0888.m1783()) != null) {
                                    int iIntValue = numM1783.intValue();
                                    c0888.m1790(iIntValue, iIntValue);
                                }
                            } else {
                                c0931.f2641 = null;
                                if (str2.length() > 0 && (numM1784 = c0888.m1784()) != null) {
                                    int iIntValue2 = numM1784.intValue();
                                    c0888.m1790(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 7:
                        C0931 c09312 = c0888.f2519;
                        c09312.f2641 = null;
                        C2068 c20683 = c0888.f2525;
                        String str3 = c20683.f6129;
                        String str4 = c20683.f6129;
                        if (str3.length() > 0) {
                            if (c0888.m1782()) {
                                c09312.f2641 = null;
                                if (str4.length() > 0 && (numM17842 = c0888.m1784()) != null) {
                                    int iIntValue3 = numM17842.intValue();
                                    c0888.m1790(iIntValue3, iIntValue3);
                                }
                            } else {
                                c09312.f2641 = null;
                                if (str4.length() > 0 && (numM17832 = c0888.m1783()) != null) {
                                    int iIntValue4 = numM17832.intValue();
                                    c0888.m1790(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 8:
                        c0888.m1797();
                        break;
                    case 9:
                        c0888.m1799();
                        break;
                    case 10:
                        if (c0888.f2525.f6129.length() > 0 && (c2033 = c0888.f2521) != null) {
                            int iM1795 = c0888.m1795(c2033, -1);
                            c0888.m1790(iM1795, iM1795);
                        }
                        break;
                    case 11:
                        if (c0888.f2525.f6129.length() > 0 && (c20332 = c0888.f2521) != null) {
                            int iM17952 = c0888.m1795(c20332, 1);
                            c0888.m1790(iM17952, iM17952);
                        }
                        break;
                    case 12:
                        if (c0888.f2525.f6129.length() > 0 && (c0963 = c0888.f2526) != null) {
                            int iM1794 = c0888.m1794(c0963, -1);
                            c0888.m1790(iM1794, iM1794);
                        }
                        break;
                    case 13:
                        if (c0888.f2525.f6129.length() > 0 && (c09632 = c0888.f2526) != null) {
                            int iM17942 = c0888.m1794(c09632, 1);
                            c0888.m1790(iM17942, iM17942);
                        }
                        break;
                    case 14:
                        c0888.m1792();
                        break;
                    case 15:
                        c0888.m1788();
                        break;
                    case 16:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            if (c0888.m1782()) {
                                c0888.m1792();
                            } else {
                                c0888.m1788();
                            }
                        }
                        break;
                    case 17:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            if (c0888.m1782()) {
                                c0888.m1788();
                            } else {
                                c0888.m1792();
                            }
                        }
                        break;
                    case 18:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            c0888.m1790(0, 0);
                        }
                        break;
                    case 19:
                        c0888.f2519.f2641 = null;
                        C2068 c20684 = c0888.f2525;
                        if (c20684.f6129.length() > 0) {
                            int length = c20684.f6129.length();
                            c0888.m1790(length, length);
                        }
                        break;
                    case 20:
                        List listM1787 = c0888.m1787(new C0016(29));
                        if (listM1787 != null) {
                            c0993.m1914(listM1787);
                        }
                        break;
                    case 21:
                        List listM17872 = c0888.m1787(new C0995(i5));
                        if (listM17872 != null) {
                            c0993.m1914(listM17872);
                        }
                        break;
                    case 22:
                        List listM17873 = c0888.m1787(new C0995(i6));
                        if (listM17873 != null) {
                            c0993.m1914(listM17873);
                        }
                        break;
                    case 23:
                        List listM17874 = c0888.m1787(new C0995(i3));
                        if (listM17874 != null) {
                            c0993.m1914(listM17874);
                        }
                        break;
                    case 24:
                        List listM17875 = c0888.m1787(new C0995(i2));
                        if (listM17875 != null) {
                            c0993.m1914(listM17875);
                        }
                        break;
                    case 25:
                        List listM17876 = c0888.m1787(new C0995(i9));
                        if (listM17876 != null) {
                            c0993.m1914(listM17876);
                        }
                        break;
                    case 26:
                        if (c0993.f2903) {
                            ref$BooleanRef.element = c0993.f2907.f2674.f2804.f2680.m1870(c0993.f2911);
                        } else {
                            c0993.m1914(AbstractC6347.m11928(new C2010("\n", 1)));
                        }
                        break;
                    case 27:
                        if (c0993.f2903) {
                            ref$BooleanRef.element = false;
                        } else {
                            c0993.m1914(AbstractC6347.m11928(new C2010("\t", 1)));
                        }
                        break;
                    case 28:
                        c0888.f2519.f2641 = null;
                        C2068 c20685 = c0888.f2525;
                        if (c20685.f6129.length() > 0) {
                            c0888.m1790(0, c20685.f6129.length());
                        }
                        break;
                    case 29:
                        c0888.m1798();
                        c0888.m1793();
                        break;
                    case 30:
                        c0888.m1789();
                        c0888.m1793();
                        break;
                    case 31:
                        C0931 c09313 = c0888.f2519;
                        c09313.f2641 = null;
                        C2068 c20686 = c0888.f2525;
                        String str5 = c20686.f6129;
                        String str6 = c20686.f6129;
                        if (str5.length() > 0) {
                            if (c0888.m1782()) {
                                c09313.f2641 = null;
                                if (str6.length() > 0 && (numM17833 = c0888.m1783()) != null) {
                                    int iIntValue5 = numM17833.intValue();
                                    c0888.m1790(iIntValue5, iIntValue5);
                                }
                            } else {
                                c09313.f2641 = null;
                                if (str6.length() > 0 && (numM17843 = c0888.m1784()) != null) {
                                    int iIntValue6 = numM17843.intValue();
                                    c0888.m1790(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        c0888.m1793();
                        break;
                    case 32:
                        C0931 c09314 = c0888.f2519;
                        c09314.f2641 = null;
                        C2068 c20687 = c0888.f2525;
                        String str7 = c20687.f6129;
                        String str8 = c20687.f6129;
                        if (str7.length() > 0) {
                            if (c0888.m1782()) {
                                c09314.f2641 = null;
                                if (str8.length() > 0 && (numM17844 = c0888.m1784()) != null) {
                                    int iIntValue7 = numM17844.intValue();
                                    c0888.m1790(iIntValue7, iIntValue7);
                                }
                            } else {
                                c09314.f2641 = null;
                                if (str8.length() > 0 && (numM17834 = c0888.m1783()) != null) {
                                    int iIntValue8 = numM17834.intValue();
                                    c0888.m1790(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        c0888.m1793();
                        break;
                    case 33:
                        c0888.m1797();
                        c0888.m1793();
                        break;
                    case 34:
                        c0888.m1799();
                        c0888.m1793();
                        break;
                    case 35:
                        c0888.m1792();
                        c0888.m1793();
                        break;
                    case 36:
                        c0888.m1788();
                        c0888.m1793();
                        break;
                    case 37:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            if (c0888.m1782()) {
                                c0888.m1792();
                            } else {
                                c0888.m1788();
                            }
                        }
                        c0888.m1793();
                        break;
                    case 38:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            if (c0888.m1782()) {
                                c0888.m1788();
                            } else {
                                c0888.m1792();
                            }
                        }
                        c0888.m1793();
                        break;
                    case 39:
                        if (c0888.f2525.f6129.length() > 0 && (c20333 = c0888.f2521) != null) {
                            int iM17953 = c0888.m1795(c20333, -1);
                            c0888.m1790(iM17953, iM17953);
                        }
                        c0888.m1793();
                        break;
                    case 40:
                        if (c0888.f2525.f6129.length() > 0 && (c20334 = c0888.f2521) != null) {
                            int iM17954 = c0888.m1795(c20334, 1);
                            c0888.m1790(iM17954, iM17954);
                        }
                        c0888.m1793();
                        break;
                    case 41:
                        if (c0888.f2525.f6129.length() > 0 && (c09633 = c0888.f2526) != null) {
                            int iM17943 = c0888.m1794(c09633, -1);
                            c0888.m1790(iM17943, iM17943);
                        }
                        c0888.m1793();
                        break;
                    case 42:
                        if (c0888.f2525.f6129.length() > 0 && (c09634 = c0888.f2526) != null) {
                            int iM17944 = c0888.m1794(c09634, 1);
                            c0888.m1790(iM17944, iM17944);
                        }
                        c0888.m1793();
                        break;
                    case 43:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            c0888.m1790(0, 0);
                        }
                        c0888.m1793();
                        break;
                    case 44:
                        c0888.f2519.f2641 = null;
                        C2068 c20688 = c0888.f2525;
                        if (c20688.f6129.length() > 0) {
                            int length2 = c20688.f6129.length();
                            c0888.m1790(length2, length2);
                        }
                        c0888.m1793();
                        break;
                    case 45:
                        c0888.f2519.f2641 = null;
                        if (c0888.f2525.f6129.length() > 0) {
                            long j9 = c0888.f2518;
                            int i10 = C2035.f6002;
                            int i11 = (int) (j9 & 4294967295L);
                            c0888.m1790(i11, i11);
                        }
                        break;
                    case 46:
                        C0965 c0965 = c0993.f2908;
                        if (c0965 != null) {
                            c0965.m1880(C2013.m3715(c0888.f2524, c0888.f2525, c0888.f2518, 4));
                        }
                        C0965 c09652 = c0993.f2908;
                        if (c09652 != null) {
                            C0962 c09622 = c09652.f2754;
                            if (c09622 != null && (c0962 = c09622.f2742) != null) {
                                c09652.f2754 = c0962;
                                c09652.f2752 -= c09622.f2741.f5947.f6129.length();
                                c09652.f2753 = new C0962(c09652.f2753, c09622.f2741);
                                c2013 = c0962.f2741;
                            }
                            if (c2013 != null) {
                                c0993.f2910.invoke(c2013);
                            }
                        }
                        break;
                    case 47:
                        C0965 c09653 = c0993.f2908;
                        if (c09653 != null) {
                            C0962 c09623 = c09653.f2753;
                            if (c09623 != null) {
                                c09653.f2753 = c09623.f2742;
                                C2013 c20133 = c09623.f2741;
                                c09653.f2754 = new C0962(c09653.f2754, c20133);
                                c09653.f2752 = c20133.f5947.f6129.length() + c09653.f2752;
                                c2013 = c09623.f2741;
                            }
                            if (c2013 != null) {
                                c0993.f2910.invoke(c2013);
                            }
                        }
                        break;
                    case 48:
                    case 49:
                        break;
                    default:
                        C4211.m8611();
                        return null;
                }
                return c5176;
            case 5:
                InterfaceC2388 interfaceC2388 = (InterfaceC2388) obj4;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C2257 c2257 = new C2257(i6, ref$ObjectRef, (C2363) obj3, (InterfaceC6558) obj2);
                interfaceC2388.getLifecycle().mo4503(c2257);
                return new C0402(interfaceC2388, c2257, ref$ObjectRef, i6);
            case 6:
                URL url = (URL) obj;
                url.getClass();
                String path = url.getPath();
                path.getClass();
                C5141 c5141 = Regex.Companion;
                String str9 = File.separator;
                str9.getClass();
                String strM10156 = AbstractC5144.m10156((String) obj4, str9);
                c5141.getClass();
                String strQuoteReplacement = Matcher.quoteReplacement(strM10156);
                strQuoteReplacement.getClass();
                return (C8125) ((InterfaceC6558) obj2).invoke(new URL(url.getProtocol(), url.getHost(), url.getPort(), new Regex(strQuoteReplacement.concat("$")).replace(path, AbstractC5144.m10156((String) obj3, str9))));
            case 7:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                C6034 c6034 = (C6034) obj3;
                C0345 c0345 = (C0345) obj;
                c0345.getClass();
                AbstractC1347 abstractC1347 = (AbstractC1347) c0345.f1183;
                float fFloatValue = ((Number) abstractC1347.getValue()).floatValue() - ref$FloatRef.element;
                float fM11395 = c6034.m11395();
                c6034.m11394(fM11395 + fFloatValue);
                float fAbs = Math.abs(fM11395 - c6034.m11395());
                ref$FloatRef.element = ((Number) abstractC1347.getValue()).floatValue();
                ((Ref$FloatRef) obj2).element = ((Number) c0345.m1045()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c0345.m1046();
                }
                return c5176;
            case 8:
                C7339 c7339 = (C7339) obj4;
                C7349 c7349 = (C7349) obj2;
                C0236 c0236 = c7339.f19552;
                if (c0236.m753(obj3)) {
                    C0276.m849(obj3, "Key ", " was used multiple times ");
                    return null;
                }
                c7339.f19554.remove(obj3);
                c0236.m755(obj3, c7349);
                return new C0402(c7339, obj3, c7349, i3);
            case 9:
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                C8774 c8774 = (C8774) obj;
                AbstractC8405.m13972(2337);
                c8774.getClass();
                for (Object obj5 : ((C8686) obj4).f24494) {
                    if (obj5 != null) {
                        C8740.f24633.getClass();
                        InterfaceC5184 interfaceC5184 = C8740.f24632;
                        if (!((PluginMessageCallbackAPI) interfaceC5184.getValue()).isGrayMessage(obj5)) {
                            C8741 c8741 = new C8741(str10, str11);
                            MessageData message = ((PluginMessageCallbackAPI) interfaceC5184.getValue()).parseMessage(obj5);
                            String str12 = message.UserUin;
                            if (str12 == null) {
                                str12 = "";
                            }
                            MessageData messageData = message.RecordMsg;
                            c8774.m14470(AbstractC8765.m14467(new C4124(message, str12, messageData == null ? null : AbstractC8765.m14467(new C6057(messageData, i4)), c8741)));
                        }
                    }
                }
                return c5176;
            default:
                C9082 c9082 = (C9082) obj4;
                ProgressBar progressBar = (ProgressBar) obj3;
                C9079 c9079 = (C9079) obj2;
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list2) {
                    C9066.C9067 c9067M14616 = ((C9066) obj6).getPluginInfo();
                    if (AbstractC5144.m10176(c9067M14616.getName(), c9079.f25451, false) || AbstractC5144.m10176(c9067M14616.getDescription(), c9079.f25451, false) || AbstractC5144.m10176(c9067M14616.getAuthor(), c9079.f25451, false) || c9067M14616.getTags().contains(c9079.f25451) || AbstractC5144.m10176(c9067M14616.getVersion(), c9079.f25451, false)) {
                        arrayList2.add(obj6);
                    }
                }
                String str13 = c9079.f25453;
                int iHashCode = str13.hashCode();
                if (iHashCode == -938285885) {
                    listM8778 = arrayList2;
                    if (str13.equals("random")) {
                        List listM8783 = AbstractC4344.m8783(arrayList2);
                        Collections.shuffle(listM8783);
                        listM8778 = listM8783;
                    }
                } else if (iHashCode != 31392744) {
                    listM8778 = arrayList2;
                    if (iHashCode == 1109388858) {
                        listM8778 = arrayList2;
                        if (str13.equals("download_asc")) {
                            listM8778 = AbstractC4344.m8778(arrayList2, new C0426(22));
                        }
                    }
                } else {
                    listM8778 = arrayList2;
                    if (str13.equals("download_desc")) {
                        listM8778 = AbstractC4344.m8778(arrayList2, new C0426(23));
                    }
                }
                AbstractC7969.m13458(c9082, listM8778);
                progressBar.setVisibility(8);
                return c5176;
        }
    }

    public /* synthetic */ C0756(Object obj, Object obj2, Object obj3, int i) {
        this.f2199 = i;
        this.f2197 = obj;
        this.f2198 = obj2;
        this.f2196 = obj3;
    }

    public /* synthetic */ C0756(InterfaceC6558 interfaceC6558, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952) {
        this.f2199 = 1;
        this.f2198 = interfaceC6558;
        this.f2197 = interfaceC1395;
        this.f2196 = interfaceC13952;
    }
}
