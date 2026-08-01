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
import com.bumptech.glide.AbstractC3056;
import io.ktor.server.http.content.C4123;
import io.ktor.util.C4210;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.text.AbstractC5143;
import kotlin.text.C5140;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.bean.MessageData;
import p052.InterfaceC6557;
import p112.C7327;
import p116.C7338;
import p116.C7348;
import p209.C7923;
import p209.C7930;
import p209.InterfaceC7922;
import p217.AbstractC7968;
import p236.C8124;
import p253.AbstractC8189;
import p325.AbstractC8757;
import p325.C8766;
import p326.C8769;
import p326.C8770;
import p350.C8868;
import p385.C9092;
import p386.C9094;
import p388.C9099;
import top.yukonga.miuix.kmp.basic.C6028;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0756 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2195;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2196;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2198;

    public /* synthetic */ C0756(InterfaceC1395 interfaceC1395, ArrayList arrayList, List list, boolean z) {
        this.f2198 = 0;
        this.f2196 = interfaceC1395;
        this.f2197 = arrayList;
        this.f2195 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) throws IOException {
        Integer numM1774;
        Integer numM1773;
        Integer numM17732;
        Integer numM17742;
        C2033 c2033;
        C2033 c20332;
        C0963 c0963;
        C0963 c09632;
        Integer numM17743;
        Integer numM17733;
        Integer numM17734;
        Integer numM17744;
        C2033 c20333;
        C2033 c20334;
        C0963 c09633;
        C0963 c09634;
        C0962 c0962;
        List listM8817;
        int i = this.f2198;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        C2013 c2013 = null;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2195;
        Object obj3 = this.f2197;
        Object obj4 = this.f2196;
        switch (i) {
            case 0:
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                abstractC1708.f4979 = true;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((C0749) arrayList.get(i6)).m1552(abstractC1708);
                }
                int size2 = list.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((C0749) list.get(i7)).m1552(abstractC1708);
                }
                abstractC1708.f4979 = false;
                interfaceC1395.getValue();
                return c5175;
            case 1:
                InterfaceC6557 interfaceC6557 = (InterfaceC6557) obj3;
                InterfaceC1395 interfaceC13952 = (InterfaceC1395) obj2;
                C2013 c20132 = (C2013) obj;
                ((InterfaceC1395) obj4).setValue(c20132);
                boolean zM8917 = AbstractC4394.m8917((String) interfaceC13952.getValue(), c20132.f5946.f6128);
                C2068 c2068 = c20132.f5946;
                interfaceC13952.setValue(c2068.f6128);
                if (!zM8917) {
                    interfaceC6557.invoke(c2068.f6128);
                }
                return c5175;
            case 2:
                C0943 c0943 = (C0943) obj4;
                long j = ((C2013) obj3).f5945;
                InterfaceC2022 interfaceC2022 = (InterfaceC2022) obj2;
                InterfaceC1504 interfaceC1504 = (InterfaceC1504) obj;
                C0963 c0963M1855 = c0943.m1855();
                if (c0963M1855 == null) {
                    return c5175;
                }
                InterfaceC1601 interfaceC1601M385 = interfaceC1504.mo2696().m385();
                long j2 = ((C2035) ((AbstractC1347) c0943.f2661).getValue()).f6003;
                long j3 = ((C2035) ((AbstractC1347) c0943.f2660).getValue()).f6003;
                C2033 c20335 = c0963M1855.f2744;
                C1609 c1609 = c0943.f2663;
                long j4 = c0943.f2662;
                if (!C2035.m3742(j2)) {
                    c1609.m2959(j4);
                    int iM3747 = C2035.m3747(j2);
                    interfaceC2022.mo1872(iM3747);
                    int iM3740 = C2035.m3740(j2);
                    interfaceC2022.mo1872(iM3740);
                    if (iM3747 != iM3740) {
                        interfaceC1601M385.mo2678(c20335.m3738(iM3747, iM3740), c1609);
                    }
                } else if (!C2035.m3742(j3)) {
                    long jM3729 = c20335.f5990.f5995.m3729();
                    C1599 c1599 = new C1599(jM3729);
                    if (jM3729 == 16) {
                        c1599 = null;
                    }
                    long j5 = c1599 != null ? c1599.f4699 : C1599.f4695;
                    c1609.m2959(C1599.m2940(C1599.m2938(j5) * 0.2f, j5));
                    int iM37472 = C2035.m3747(j3);
                    interfaceC2022.mo1872(iM37472);
                    int iM37402 = C2035.m3740(j3);
                    interfaceC2022.mo1872(iM37402);
                    if (iM37472 != iM37402) {
                        interfaceC1601M385.mo2678(c20335.m3738(iM37472, iM37402), c1609);
                    }
                } else if (!C2035.m3742(j)) {
                    c1609.m2959(j4);
                    int iM37473 = C2035.m3747(j);
                    interfaceC2022.mo1872(iM37473);
                    int iM37403 = C2035.m3740(j);
                    interfaceC2022.mo1872(iM37403);
                    if (iM37473 != iM37403) {
                        interfaceC1601M385.mo2678(c20335.m3738(iM37473, iM37403), c1609);
                    }
                }
                boolean zM3732 = c20335.m3732();
                C2062 c2062 = c20335.f5989;
                C2034 c2034 = c20335.f5990;
                boolean z = zM3732 && c2034.f5991 != 3;
                if (z) {
                    long j6 = c20335.f5988;
                    C7327 c7327M10034 = AbstractC5061.m10034(0L, (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32));
                    interfaceC1601M385.mo2667();
                    InterfaceC1601.m2945(interfaceC1601M385, c7327M10034);
                }
                C2047 c2047 = c2034.f5995.f5983;
                C7930 c7930 = c2047.f6059;
                InterfaceC7922 interfaceC7922 = c2047.f6057;
                if (c7930 == null) {
                    c7930 = C7930.f21964;
                }
                C7930 c79302 = c7930;
                C1570 c1570 = c2047.f6058;
                if (c1570 == null) {
                    c1570 = C1570.f4615;
                }
                C1570 c15702 = c1570;
                AbstractC1505 abstractC1505 = c2047.f6060;
                if (abstractC1505 == null) {
                    abstractC1505 = C1510.f4294;
                }
                AbstractC1505 abstractC15052 = abstractC1505;
                try {
                    AbstractC1598 abstractC1598Mo13388 = interfaceC7922.mo13388();
                    C7923 c7923 = C7923.f21948;
                    if (abstractC1598Mo13388 != null) {
                        C2062.m3775(c2062, interfaceC1601M385, abstractC1598Mo13388, interfaceC7922 != c7923 ? interfaceC7922.mo13390() : 1.0f, c15702, c79302, abstractC15052);
                    } else {
                        C2062.m3774(c2062, interfaceC1601M385, interfaceC7922 != c7923 ? interfaceC7922.mo13389() : C1599.f4695, c15702, c79302, abstractC15052);
                    }
                    if (!z) {
                        return c5175;
                    }
                    interfaceC1601M385.mo2679();
                    return c5175;
                } catch (Throwable th) {
                    if (z) {
                        interfaceC1601M385.mo2679();
                    }
                    throw th;
                }
            case 3:
                InterfaceC6557 interfaceC65572 = (InterfaceC6557) obj3;
                C1997 c1997 = (C1997) ((Ref$ObjectRef) obj2).element;
                C2013 c2013M286 = ((C0076) obj4).m286((List) obj);
                if (c1997 != null) {
                    c1997.m3699(null, c2013M286);
                }
                interfaceC65572.invoke(c2013M286);
                return c5175;
            case 4:
                C0993 c0993 = (C0993) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                C0888 c0888 = (C0888) obj;
                int i8 = 4;
                switch (AbstractC0994.f2913[((KeyCommand) obj4).ordinal()]) {
                    case 1:
                        c0993.f2905.m1761(false);
                        break;
                    case 2:
                        c0993.f2905.m1754();
                        break;
                    case 3:
                        c0993.f2905.m1765();
                        break;
                    case 4:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            if (C2035.m3742(c0888.f2517)) {
                                c0888.m1788();
                            } else {
                                boolean zM1772 = c0888.m1772();
                                long j7 = c0888.f2517;
                                if (zM1772) {
                                    int iM37474 = C2035.m3747(j7);
                                    c0888.m1780(iM37474, iM37474);
                                } else {
                                    int iM37404 = C2035.m3740(j7);
                                    c0888.m1780(iM37404, iM37404);
                                }
                            }
                        }
                        break;
                    case 5:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            if (C2035.m3742(c0888.f2517)) {
                                c0888.m1779();
                            } else {
                                boolean zM17722 = c0888.m1772();
                                long j8 = c0888.f2517;
                                if (zM17722) {
                                    int iM37405 = C2035.m3740(j8);
                                    c0888.m1780(iM37405, iM37405);
                                } else {
                                    int iM37475 = C2035.m3747(j8);
                                    c0888.m1780(iM37475, iM37475);
                                }
                            }
                        }
                        break;
                    case 6:
                        C0931 c0931 = c0888.f2518;
                        c0931.f2640 = null;
                        C2068 c20682 = c0888.f2524;
                        String str = c20682.f6128;
                        String str2 = c20682.f6128;
                        if (str.length() > 0) {
                            if (c0888.m1772()) {
                                c0931.f2640 = null;
                                if (str2.length() > 0 && (numM1773 = c0888.m1773()) != null) {
                                    int iIntValue = numM1773.intValue();
                                    c0888.m1780(iIntValue, iIntValue);
                                }
                            } else {
                                c0931.f2640 = null;
                                if (str2.length() > 0 && (numM1774 = c0888.m1774()) != null) {
                                    int iIntValue2 = numM1774.intValue();
                                    c0888.m1780(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 7:
                        C0931 c09312 = c0888.f2518;
                        c09312.f2640 = null;
                        C2068 c20683 = c0888.f2524;
                        String str3 = c20683.f6128;
                        String str4 = c20683.f6128;
                        if (str3.length() > 0) {
                            if (c0888.m1772()) {
                                c09312.f2640 = null;
                                if (str4.length() > 0 && (numM17742 = c0888.m1774()) != null) {
                                    int iIntValue3 = numM17742.intValue();
                                    c0888.m1780(iIntValue3, iIntValue3);
                                }
                            } else {
                                c09312.f2640 = null;
                                if (str4.length() > 0 && (numM17732 = c0888.m1773()) != null) {
                                    int iIntValue4 = numM17732.intValue();
                                    c0888.m1780(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 8:
                        c0888.m1787();
                        break;
                    case 9:
                        c0888.m1789();
                        break;
                    case 10:
                        if (c0888.f2524.f6128.length() > 0 && (c2033 = c0888.f2520) != null) {
                            int iM1785 = c0888.m1785(c2033, -1);
                            c0888.m1780(iM1785, iM1785);
                        }
                        break;
                    case 11:
                        if (c0888.f2524.f6128.length() > 0 && (c20332 = c0888.f2520) != null) {
                            int iM17852 = c0888.m1785(c20332, 1);
                            c0888.m1780(iM17852, iM17852);
                        }
                        break;
                    case 12:
                        if (c0888.f2524.f6128.length() > 0 && (c0963 = c0888.f2525) != null) {
                            int iM1784 = c0888.m1784(c0963, -1);
                            c0888.m1780(iM1784, iM1784);
                        }
                        break;
                    case 13:
                        if (c0888.f2524.f6128.length() > 0 && (c09632 = c0888.f2525) != null) {
                            int iM17842 = c0888.m1784(c09632, 1);
                            c0888.m1780(iM17842, iM17842);
                        }
                        break;
                    case 14:
                        c0888.m1782();
                        break;
                    case 15:
                        c0888.m1778();
                        break;
                    case 16:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            if (c0888.m1772()) {
                                c0888.m1782();
                            } else {
                                c0888.m1778();
                            }
                        }
                        break;
                    case 17:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            if (c0888.m1772()) {
                                c0888.m1778();
                            } else {
                                c0888.m1782();
                            }
                        }
                        break;
                    case 18:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            c0888.m1780(0, 0);
                        }
                        break;
                    case 19:
                        c0888.f2518.f2640 = null;
                        C2068 c20684 = c0888.f2524;
                        if (c20684.f6128.length() > 0) {
                            int length = c20684.f6128.length();
                            c0888.m1780(length, length);
                        }
                        break;
                    case 20:
                        List listM1777 = c0888.m1777(new C0016(29));
                        if (listM1777 != null) {
                            c0993.m1904(listM1777);
                        }
                        break;
                    case 21:
                        List listM17772 = c0888.m1777(new C0995(i4));
                        if (listM17772 != null) {
                            c0993.m1904(listM17772);
                        }
                        break;
                    case 22:
                        List listM17773 = c0888.m1777(new C0995(i5));
                        if (listM17773 != null) {
                            c0993.m1904(listM17773);
                        }
                        break;
                    case 23:
                        List listM17774 = c0888.m1777(new C0995(i3));
                        if (listM17774 != null) {
                            c0993.m1904(listM17774);
                        }
                        break;
                    case 24:
                        List listM17775 = c0888.m1777(new C0995(i2));
                        if (listM17775 != null) {
                            c0993.m1904(listM17775);
                        }
                        break;
                    case 25:
                        List listM17776 = c0888.m1777(new C0995(i8));
                        if (listM17776 != null) {
                            c0993.m1904(listM17776);
                        }
                        break;
                    case 26:
                        if (c0993.f2902) {
                            ref$BooleanRef.element = c0993.f2906.f2673.f2803.f2679.m1860(c0993.f2910);
                        } else {
                            c0993.m1904(AbstractC8189.m13660(new C2010("\n", 1)));
                        }
                        break;
                    case 27:
                        if (c0993.f2902) {
                            ref$BooleanRef.element = false;
                        } else {
                            c0993.m1904(AbstractC8189.m13660(new C2010("\t", 1)));
                        }
                        break;
                    case 28:
                        c0888.f2518.f2640 = null;
                        C2068 c20685 = c0888.f2524;
                        if (c20685.f6128.length() > 0) {
                            c0888.m1780(0, c20685.f6128.length());
                        }
                        break;
                    case 29:
                        c0888.m1788();
                        c0888.m1783();
                        break;
                    case 30:
                        c0888.m1779();
                        c0888.m1783();
                        break;
                    case 31:
                        C0931 c09313 = c0888.f2518;
                        c09313.f2640 = null;
                        C2068 c20686 = c0888.f2524;
                        String str5 = c20686.f6128;
                        String str6 = c20686.f6128;
                        if (str5.length() > 0) {
                            if (c0888.m1772()) {
                                c09313.f2640 = null;
                                if (str6.length() > 0 && (numM17733 = c0888.m1773()) != null) {
                                    int iIntValue5 = numM17733.intValue();
                                    c0888.m1780(iIntValue5, iIntValue5);
                                }
                            } else {
                                c09313.f2640 = null;
                                if (str6.length() > 0 && (numM17743 = c0888.m1774()) != null) {
                                    int iIntValue6 = numM17743.intValue();
                                    c0888.m1780(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        c0888.m1783();
                        break;
                    case 32:
                        C0931 c09314 = c0888.f2518;
                        c09314.f2640 = null;
                        C2068 c20687 = c0888.f2524;
                        String str7 = c20687.f6128;
                        String str8 = c20687.f6128;
                        if (str7.length() > 0) {
                            if (c0888.m1772()) {
                                c09314.f2640 = null;
                                if (str8.length() > 0 && (numM17744 = c0888.m1774()) != null) {
                                    int iIntValue7 = numM17744.intValue();
                                    c0888.m1780(iIntValue7, iIntValue7);
                                }
                            } else {
                                c09314.f2640 = null;
                                if (str8.length() > 0 && (numM17734 = c0888.m1773()) != null) {
                                    int iIntValue8 = numM17734.intValue();
                                    c0888.m1780(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        c0888.m1783();
                        break;
                    case 33:
                        c0888.m1787();
                        c0888.m1783();
                        break;
                    case 34:
                        c0888.m1789();
                        c0888.m1783();
                        break;
                    case 35:
                        c0888.m1782();
                        c0888.m1783();
                        break;
                    case 36:
                        c0888.m1778();
                        c0888.m1783();
                        break;
                    case 37:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            if (c0888.m1772()) {
                                c0888.m1782();
                            } else {
                                c0888.m1778();
                            }
                        }
                        c0888.m1783();
                        break;
                    case 38:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            if (c0888.m1772()) {
                                c0888.m1778();
                            } else {
                                c0888.m1782();
                            }
                        }
                        c0888.m1783();
                        break;
                    case 39:
                        if (c0888.f2524.f6128.length() > 0 && (c20333 = c0888.f2520) != null) {
                            int iM17853 = c0888.m1785(c20333, -1);
                            c0888.m1780(iM17853, iM17853);
                        }
                        c0888.m1783();
                        break;
                    case 40:
                        if (c0888.f2524.f6128.length() > 0 && (c20334 = c0888.f2520) != null) {
                            int iM17854 = c0888.m1785(c20334, 1);
                            c0888.m1780(iM17854, iM17854);
                        }
                        c0888.m1783();
                        break;
                    case 41:
                        if (c0888.f2524.f6128.length() > 0 && (c09633 = c0888.f2525) != null) {
                            int iM17843 = c0888.m1784(c09633, -1);
                            c0888.m1780(iM17843, iM17843);
                        }
                        c0888.m1783();
                        break;
                    case 42:
                        if (c0888.f2524.f6128.length() > 0 && (c09634 = c0888.f2525) != null) {
                            int iM17844 = c0888.m1784(c09634, 1);
                            c0888.m1780(iM17844, iM17844);
                        }
                        c0888.m1783();
                        break;
                    case 43:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            c0888.m1780(0, 0);
                        }
                        c0888.m1783();
                        break;
                    case 44:
                        c0888.f2518.f2640 = null;
                        C2068 c20688 = c0888.f2524;
                        if (c20688.f6128.length() > 0) {
                            int length2 = c20688.f6128.length();
                            c0888.m1780(length2, length2);
                        }
                        c0888.m1783();
                        break;
                    case 45:
                        c0888.f2518.f2640 = null;
                        if (c0888.f2524.f6128.length() > 0) {
                            long j9 = c0888.f2517;
                            int i9 = C2035.f6001;
                            int i10 = (int) (j9 & 4294967295L);
                            c0888.m1780(i10, i10);
                        }
                        break;
                    case 46:
                        C0965 c0965 = c0993.f2907;
                        if (c0965 != null) {
                            c0965.m1870(C2013.m3705(c0888.f2523, c0888.f2524, c0888.f2517, 4));
                        }
                        C0965 c09652 = c0993.f2907;
                        if (c09652 != null) {
                            C0962 c09622 = c09652.f2753;
                            if (c09622 != null && (c0962 = c09622.f2741) != null) {
                                c09652.f2753 = c0962;
                                c09652.f2751 -= c09622.f2740.f5946.f6128.length();
                                c09652.f2752 = new C0962(c09652.f2752, c09622.f2740);
                                c2013 = c0962.f2740;
                            }
                            if (c2013 != null) {
                                c0993.f2909.invoke(c2013);
                            }
                        }
                        break;
                    case 47:
                        C0965 c09653 = c0993.f2907;
                        if (c09653 != null) {
                            C0962 c09623 = c09653.f2752;
                            if (c09623 != null) {
                                c09653.f2752 = c09623.f2741;
                                C2013 c20133 = c09623.f2740;
                                c09653.f2753 = new C0962(c09653.f2753, c20133);
                                c09653.f2751 = c20133.f5946.f6128.length() + c09653.f2751;
                                c2013 = c09623.f2740;
                            }
                            if (c2013 != null) {
                                c0993.f2909.invoke(c2013);
                            }
                        }
                        break;
                    case 48:
                    case 49:
                        break;
                    default:
                        C4210.m8621();
                        return null;
                }
                return c5175;
            case 5:
                InterfaceC2388 interfaceC2388 = (InterfaceC2388) obj4;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C2257 c2257 = new C2257(i5, ref$ObjectRef, (C2363) obj3, (InterfaceC6557) obj2);
                interfaceC2388.getLifecycle().mo4493(c2257);
                return new C0402(interfaceC2388, c2257, ref$ObjectRef, i5);
            case 6:
                URL url = (URL) obj;
                url.getClass();
                String path = url.getPath();
                path.getClass();
                C5140 c5140 = Regex.Companion;
                String str9 = File.separator;
                str9.getClass();
                String strM10141 = AbstractC5143.m10141((String) obj4, str9);
                c5140.getClass();
                String strQuoteReplacement = Matcher.quoteReplacement(strM10141);
                strQuoteReplacement.getClass();
                return (C8124) ((InterfaceC6557) obj2).invoke(new URL(url.getProtocol(), url.getHost(), url.getPort(), new Regex(strQuoteReplacement.concat("$")).replace(path, AbstractC5143.m10141((String) obj3, str9))));
            case 7:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                C6028 c6028 = (C6028) obj3;
                C0345 c0345 = (C0345) obj;
                c0345.getClass();
                AbstractC1347 abstractC1347 = (AbstractC1347) c0345.f1183;
                float fFloatValue = ((Number) abstractC1347.getValue()).floatValue() - ref$FloatRef.element;
                float fM11335 = c6028.m11335();
                c6028.m11334(fM11335 + fFloatValue);
                float fAbs = Math.abs(fM11335 - c6028.m11335());
                ref$FloatRef.element = ((Number) abstractC1347.getValue()).floatValue();
                ((Ref$FloatRef) obj2).element = ((Number) c0345.m1044()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c0345.m1045();
                }
                return c5175;
            case 8:
                C7338 c7338 = (C7338) obj4;
                C7348 c7348 = (C7348) obj2;
                C0236 c0236 = c7338.f19557;
                if (c0236.m752(obj3)) {
                    C0276.m848(obj3, "Key ", " was used multiple times ");
                    return null;
                }
                c7338.f19559.remove(obj3);
                c0236.m754(obj3, c7348);
                return new C0402(c7338, obj3, c7348, i3);
            case 9:
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                C8766 c8766 = (C8766) obj;
                AbstractC3056.m6668(-3937805782914172327L);
                c8766.getClass();
                for (Object obj5 : ((C8868) obj4).f24980) {
                    if (obj5 != null) {
                        C8769.f24705.getClass();
                        InterfaceC5183 interfaceC5183 = C8769.f24704;
                        if (!((PluginMessageCallbackAPI) interfaceC5183.getValue()).isGrayMessage(obj5)) {
                            C8770 c8770 = new C8770(str10, str11);
                            MessageData message = ((PluginMessageCallbackAPI) interfaceC5183.getValue()).parseMessage(obj5);
                            String strM6668 = message.UserUin;
                            if (strM6668 == null) {
                                strM6668 = AbstractC3056.m6668(-3937561979095614887L);
                            }
                            MessageData messageData = message.RecordMsg;
                            c8766.m14436(AbstractC8757.m14433(new C4123(message, strM6668, messageData == null ? null : AbstractC8757.m14433(new C6051(messageData, 12)), c8770)));
                        }
                    }
                }
                return c5175;
            default:
                C9094 c9094 = (C9094) obj4;
                ProgressBar progressBar = (ProgressBar) obj3;
                C9092 c9092 = (C9092) obj2;
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list2) {
                    C9099.C9100 c9100M14606 = ((C9099) obj6).getPluginInfo();
                    if (AbstractC5143.m10171(c9100M14606.getName(), c9092.f25401, false) || AbstractC5143.m10171(c9100M14606.getDescription(), c9092.f25401, false) || AbstractC5143.m10171(c9100M14606.getAuthor(), c9092.f25401, false) || c9100M14606.getTags().contains(c9092.f25401) || AbstractC5143.m10171(c9100M14606.getVersion(), c9092.f25401, false)) {
                        arrayList2.add(obj6);
                    }
                }
                String str12 = c9092.f25403;
                int iHashCode = str12.hashCode();
                if (iHashCode == -938285885) {
                    listM8817 = arrayList2;
                    if (str12.equals("random")) {
                        List listM8798 = AbstractC4343.m8798(arrayList2);
                        Collections.shuffle(listM8798);
                        listM8817 = listM8798;
                    }
                } else if (iHashCode != 31392744) {
                    listM8817 = arrayList2;
                    if (iHashCode == 1109388858) {
                        listM8817 = arrayList2;
                        if (str12.equals("download_asc")) {
                            listM8817 = AbstractC4343.m8817(arrayList2, new C0426(22));
                        }
                    }
                } else {
                    listM8817 = arrayList2;
                    if (str12.equals("download_desc")) {
                        listM8817 = AbstractC4343.m8817(arrayList2, new C0426(23));
                    }
                }
                AbstractC7968.m13430(c9094, listM8817);
                progressBar.setVisibility(8);
                return c5175;
        }
    }

    public /* synthetic */ C0756(Object obj, Object obj2, Object obj3, int i) {
        this.f2198 = i;
        this.f2196 = obj;
        this.f2197 = obj2;
        this.f2195 = obj3;
    }

    public /* synthetic */ C0756(InterfaceC6557 interfaceC6557, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952) {
        this.f2198 = 1;
        this.f2197 = interfaceC6557;
        this.f2196 = interfaceC1395;
        this.f2195 = interfaceC13952;
    }
}
