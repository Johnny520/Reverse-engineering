package androidx.compose.foundation.lazy;

import android.widget.ProgressBar;
import androidx.activity.C0863;
import androidx.appcompat.app.C0923;
import androidx.collection.C1083;
import androidx.collection.C1123;
import androidx.compose.animation.C1248;
import androidx.compose.animation.C1272;
import androidx.compose.animation.core.C1191;
import androidx.compose.foundation.text.AbstractC1832;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1800;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.C1803;
import androidx.compose.foundation.text.C1831;
import androidx.compose.foundation.text.C1833;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.selection.C1726;
import androidx.compose.foundation.text.selection.C1769;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.graphics.drawscope.C2345;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2868;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2881;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2831;
import androidx.compose.p001ui.text.input.C2844;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import androidx.core.view.C3090;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.compose.C3196;
import io.ktor.server.http.content.C4956;
import io.ktor.util.C5043;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5976;
import kotlin.text.C5973;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.bean.MessageData;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p128.C8157;
import p132.C8168;
import p132.C8178;
import p191.AbstractC8568;
import p225.C8753;
import p225.C8760;
import p225.InterfaceC8752;
import p233.AbstractC8798;
import p252.C8954;
import p303.AbstractC9234;
import p336.C9515;
import p341.C9569;
import p341.C9570;
import p345.AbstractC9594;
import p345.C9603;
import p401.C9895;
import p402.C9908;
import p404.C9911;
import top.yukonga.miuix.kmp.basic.C6864;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1597 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2541;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2542;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2544;

    public /* synthetic */ C1597(InterfaceC2230 interfaceC2230, ArrayList arrayList, List list, boolean z) {
        this.f2544 = 0;
        this.f2542 = interfaceC2230;
        this.f2543 = arrayList;
        this.f2541 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) throws IOException {
        Integer numM2344;
        Integer numM2343;
        Integer numM23432;
        Integer numM23442;
        C2867 c2867;
        C2867 c28672;
        C1801 c1801;
        C1801 c18012;
        Integer numM23443;
        Integer numM23433;
        Integer numM23434;
        Integer numM23444;
        C2867 c28673;
        C2867 c28674;
        C1801 c18013;
        C1801 c18014;
        C1800 c1800;
        List listM9337;
        int i = this.f2544;
        int i2 = 3;
        int i3 = 2;
        int i4 = 8;
        int i5 = 0;
        int i6 = 1;
        C2847 c2847 = null;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f2541;
        Object obj3 = this.f2543;
        Object obj4 = this.f2542;
        switch (i) {
            case 0:
                InterfaceC2230 interfaceC2230 = (InterfaceC2230) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                abstractC2543.f5325 = true;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((C1590) arrayList.get(i7)).m2122(abstractC2543);
                }
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((C1590) list.get(i8)).m2122(abstractC2543);
                }
                abstractC2543.f5325 = false;
                interfaceC2230.getValue();
                return c6008;
            case 1:
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) obj3;
                InterfaceC2230 interfaceC22302 = (InterfaceC2230) obj2;
                C2847 c28472 = (C2847) obj;
                ((InterfaceC2230) obj4).setValue(c28472);
                boolean zM9466 = AbstractC5227.m9466((String) interfaceC22302.getValue(), c28472.f6292.f6474);
                C2902 c2902 = c28472.f6292;
                interfaceC22302.setValue(c2902.f6474);
                if (!zM9466) {
                    interfaceC7387.invoke(c2902.f6474);
                }
                return c6008;
            case 2:
                C1781 c1781 = (C1781) obj4;
                long j = ((C2847) obj3).f6291;
                InterfaceC2856 interfaceC2856 = (InterfaceC2856) obj2;
                InterfaceC2339 interfaceC2339 = (InterfaceC2339) obj;
                C1801 c1801M2425 = c1781.m2425();
                if (c1801M2425 == null) {
                    return c6008;
                }
                InterfaceC2436 interfaceC2436M946 = interfaceC2339.mo3266().m946();
                long j2 = ((C2869) ((AbstractC2182) c1781.f3007).getValue()).f6349;
                long j3 = ((C2869) ((AbstractC2182) c1781.f3006).getValue()).f6349;
                C2867 c28675 = c1801M2425.f3090;
                C2444 c2444 = c1781.f3009;
                long j4 = c1781.f3008;
                if (!C2869.m4312(j2)) {
                    c2444.m3529(j4);
                    int iM4317 = C2869.m4317(j2);
                    interfaceC2856.mo2442(iM4317);
                    int iM4310 = C2869.m4310(j2);
                    interfaceC2856.mo2442(iM4310);
                    if (iM4317 != iM4310) {
                        interfaceC2436M946.mo3248(c28675.m4308(iM4317, iM4310), c2444);
                    }
                } else if (!C2869.m4312(j3)) {
                    long jM4299 = c28675.f6336.f6341.m4299();
                    C2434 c2434 = new C2434(jM4299);
                    if (jM4299 == 16) {
                        c2434 = null;
                    }
                    long j5 = c2434 != null ? c2434.f5045 : C2434.f5041;
                    c2444.m3529(C2434.m3510(C2434.m3508(j5) * 0.2f, j5));
                    int iM43172 = C2869.m4317(j3);
                    interfaceC2856.mo2442(iM43172);
                    int iM43102 = C2869.m4310(j3);
                    interfaceC2856.mo2442(iM43102);
                    if (iM43172 != iM43102) {
                        interfaceC2436M946.mo3248(c28675.m4308(iM43172, iM43102), c2444);
                    }
                } else if (!C2869.m4312(j)) {
                    c2444.m3529(j4);
                    int iM43173 = C2869.m4317(j);
                    interfaceC2856.mo2442(iM43173);
                    int iM43103 = C2869.m4310(j);
                    interfaceC2856.mo2442(iM43103);
                    if (iM43173 != iM43103) {
                        interfaceC2436M946.mo3248(c28675.m4308(iM43173, iM43103), c2444);
                    }
                }
                boolean zM4302 = c28675.m4302();
                C2896 c2896 = c28675.f6335;
                C2868 c2868 = c28675.f6336;
                boolean z = zM4302 && c2868.f6337 != 3;
                if (z) {
                    long j6 = c28675.f6334;
                    C8157 c8157M13629 = AbstractC8568.m13629(0L, (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32));
                    interfaceC2436M946.mo3237();
                    InterfaceC2436.m3515(interfaceC2436M946, c8157M13629);
                }
                C2881 c2881 = c2868.f6341.f6329;
                C8760 c8760 = c2881.f6405;
                InterfaceC8752 interfaceC8752 = c2881.f6403;
                if (c8760 == null) {
                    c8760 = C8760.f22306;
                }
                C8760 c87602 = c8760;
                C2405 c2405 = c2881.f6404;
                if (c2405 == null) {
                    c2405 = C2405.f4961;
                }
                C2405 c24052 = c2405;
                AbstractC2340 abstractC2340 = c2881.f6406;
                if (abstractC2340 == null) {
                    abstractC2340 = C2345.f4640;
                }
                AbstractC2340 abstractC23402 = abstractC2340;
                try {
                    AbstractC2433 abstractC2433Mo13975 = interfaceC8752.mo13975();
                    C8753 c8753 = C8753.f22290;
                    if (abstractC2433Mo13975 != null) {
                        C2896.m4345(c2896, interfaceC2436M946, abstractC2433Mo13975, interfaceC8752 != c8753 ? interfaceC8752.mo13977() : 1.0f, c24052, c87602, abstractC23402);
                    } else {
                        C2896.m4344(c2896, interfaceC2436M946, interfaceC8752 != c8753 ? interfaceC8752.mo13976() : C2434.f5041, c24052, c87602, abstractC23402);
                    }
                    if (!z) {
                        return c6008;
                    }
                    interfaceC2436M946.mo3249();
                    return c6008;
                } catch (Throwable th) {
                    if (z) {
                        interfaceC2436M946.mo3249();
                    }
                    throw th;
                }
            case 3:
                InterfaceC7387 interfaceC73872 = (InterfaceC7387) obj3;
                C2831 c2831 = (C2831) ((Ref$ObjectRef) obj2).element;
                C2847 c2847M847 = ((C0923) obj4).m847((List) obj);
                if (c2831 != null) {
                    c2831.m4269(null, c2847M847);
                }
                interfaceC73872.invoke(c2847M847);
                return c6008;
            case 4:
                C1831 c1831 = (C1831) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                C1726 c1726 = (C1726) obj;
                int i9 = 4;
                switch (AbstractC1832.f3259[((KeyCommand) obj4).ordinal()]) {
                    case 1:
                        c1831.f3251.m2331(false);
                        break;
                    case 2:
                        c1831.f3251.m2324();
                        break;
                    case 3:
                        c1831.f3251.m2335();
                        break;
                    case 4:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            if (C2869.m4312(c1726.f2863)) {
                                c1726.m2358();
                            } else {
                                boolean zM2342 = c1726.m2342();
                                long j7 = c1726.f2863;
                                if (zM2342) {
                                    int iM43174 = C2869.m4317(j7);
                                    c1726.m2350(iM43174, iM43174);
                                } else {
                                    int iM43104 = C2869.m4310(j7);
                                    c1726.m2350(iM43104, iM43104);
                                }
                            }
                        }
                        break;
                    case 5:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            if (C2869.m4312(c1726.f2863)) {
                                c1726.m2349();
                            } else {
                                boolean zM23422 = c1726.m2342();
                                long j8 = c1726.f2863;
                                if (zM23422) {
                                    int iM43105 = C2869.m4310(j8);
                                    c1726.m2350(iM43105, iM43105);
                                } else {
                                    int iM43175 = C2869.m4317(j8);
                                    c1726.m2350(iM43175, iM43175);
                                }
                            }
                        }
                        break;
                    case 6:
                        C1769 c1769 = c1726.f2864;
                        c1769.f2986 = null;
                        C2902 c29022 = c1726.f2870;
                        String str = c29022.f6474;
                        String str2 = c29022.f6474;
                        if (str.length() > 0) {
                            if (c1726.m2342()) {
                                c1769.f2986 = null;
                                if (str2.length() > 0 && (numM2343 = c1726.m2343()) != null) {
                                    int iIntValue = numM2343.intValue();
                                    c1726.m2350(iIntValue, iIntValue);
                                }
                            } else {
                                c1769.f2986 = null;
                                if (str2.length() > 0 && (numM2344 = c1726.m2344()) != null) {
                                    int iIntValue2 = numM2344.intValue();
                                    c1726.m2350(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 7:
                        C1769 c17692 = c1726.f2864;
                        c17692.f2986 = null;
                        C2902 c29023 = c1726.f2870;
                        String str3 = c29023.f6474;
                        String str4 = c29023.f6474;
                        if (str3.length() > 0) {
                            if (c1726.m2342()) {
                                c17692.f2986 = null;
                                if (str4.length() > 0 && (numM23442 = c1726.m2344()) != null) {
                                    int iIntValue3 = numM23442.intValue();
                                    c1726.m2350(iIntValue3, iIntValue3);
                                }
                            } else {
                                c17692.f2986 = null;
                                if (str4.length() > 0 && (numM23432 = c1726.m2343()) != null) {
                                    int iIntValue4 = numM23432.intValue();
                                    c1726.m2350(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 8:
                        c1726.m2357();
                        break;
                    case 9:
                        c1726.m2359();
                        break;
                    case 10:
                        if (c1726.f2870.f6474.length() > 0 && (c2867 = c1726.f2866) != null) {
                            int iM2355 = c1726.m2355(c2867, -1);
                            c1726.m2350(iM2355, iM2355);
                        }
                        break;
                    case 11:
                        if (c1726.f2870.f6474.length() > 0 && (c28672 = c1726.f2866) != null) {
                            int iM23552 = c1726.m2355(c28672, 1);
                            c1726.m2350(iM23552, iM23552);
                        }
                        break;
                    case 12:
                        if (c1726.f2870.f6474.length() > 0 && (c1801 = c1726.f2871) != null) {
                            int iM2354 = c1726.m2354(c1801, -1);
                            c1726.m2350(iM2354, iM2354);
                        }
                        break;
                    case 13:
                        if (c1726.f2870.f6474.length() > 0 && (c18012 = c1726.f2871) != null) {
                            int iM23542 = c1726.m2354(c18012, 1);
                            c1726.m2350(iM23542, iM23542);
                        }
                        break;
                    case 14:
                        c1726.m2352();
                        break;
                    case 15:
                        c1726.m2348();
                        break;
                    case 16:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            if (c1726.m2342()) {
                                c1726.m2352();
                            } else {
                                c1726.m2348();
                            }
                        }
                        break;
                    case 17:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            if (c1726.m2342()) {
                                c1726.m2348();
                            } else {
                                c1726.m2352();
                            }
                        }
                        break;
                    case 18:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            c1726.m2350(0, 0);
                        }
                        break;
                    case 19:
                        c1726.f2864.f2986 = null;
                        C2902 c29024 = c1726.f2870;
                        if (c29024.f6474.length() > 0) {
                            int length = c29024.f6474.length();
                            c1726.m2350(length, length);
                        }
                        break;
                    case 20:
                        List listM2347 = c1726.m2347(new C0863(29));
                        if (listM2347 != null) {
                            c1831.m2474(listM2347);
                        }
                        break;
                    case 21:
                        List listM23472 = c1726.m2347(new C1833(i5));
                        if (listM23472 != null) {
                            c1831.m2474(listM23472);
                        }
                        break;
                    case 22:
                        List listM23473 = c1726.m2347(new C1833(i6));
                        if (listM23473 != null) {
                            c1831.m2474(listM23473);
                        }
                        break;
                    case 23:
                        List listM23474 = c1726.m2347(new C1833(i3));
                        if (listM23474 != null) {
                            c1831.m2474(listM23474);
                        }
                        break;
                    case 24:
                        List listM23475 = c1726.m2347(new C1833(i2));
                        if (listM23475 != null) {
                            c1831.m2474(listM23475);
                        }
                        break;
                    case 25:
                        List listM23476 = c1726.m2347(new C1833(i9));
                        if (listM23476 != null) {
                            c1831.m2474(listM23476);
                        }
                        break;
                    case 26:
                        if (c1831.f3248) {
                            ref$BooleanRef.element = c1831.f3252.f3019.f3149.f3025.m2430(c1831.f3256);
                        } else {
                            c1831.m2474(AbstractC7176.m12487(new C2844("\n", 1)));
                        }
                        break;
                    case 27:
                        if (c1831.f3248) {
                            ref$BooleanRef.element = false;
                        } else {
                            c1831.m2474(AbstractC7176.m12487(new C2844("\t", 1)));
                        }
                        break;
                    case 28:
                        c1726.f2864.f2986 = null;
                        C2902 c29025 = c1726.f2870;
                        if (c29025.f6474.length() > 0) {
                            c1726.m2350(0, c29025.f6474.length());
                        }
                        break;
                    case 29:
                        c1726.m2358();
                        c1726.m2353();
                        break;
                    case 30:
                        c1726.m2349();
                        c1726.m2353();
                        break;
                    case 31:
                        C1769 c17693 = c1726.f2864;
                        c17693.f2986 = null;
                        C2902 c29026 = c1726.f2870;
                        String str5 = c29026.f6474;
                        String str6 = c29026.f6474;
                        if (str5.length() > 0) {
                            if (c1726.m2342()) {
                                c17693.f2986 = null;
                                if (str6.length() > 0 && (numM23433 = c1726.m2343()) != null) {
                                    int iIntValue5 = numM23433.intValue();
                                    c1726.m2350(iIntValue5, iIntValue5);
                                }
                            } else {
                                c17693.f2986 = null;
                                if (str6.length() > 0 && (numM23443 = c1726.m2344()) != null) {
                                    int iIntValue6 = numM23443.intValue();
                                    c1726.m2350(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        c1726.m2353();
                        break;
                    case 32:
                        C1769 c17694 = c1726.f2864;
                        c17694.f2986 = null;
                        C2902 c29027 = c1726.f2870;
                        String str7 = c29027.f6474;
                        String str8 = c29027.f6474;
                        if (str7.length() > 0) {
                            if (c1726.m2342()) {
                                c17694.f2986 = null;
                                if (str8.length() > 0 && (numM23444 = c1726.m2344()) != null) {
                                    int iIntValue7 = numM23444.intValue();
                                    c1726.m2350(iIntValue7, iIntValue7);
                                }
                            } else {
                                c17694.f2986 = null;
                                if (str8.length() > 0 && (numM23434 = c1726.m2343()) != null) {
                                    int iIntValue8 = numM23434.intValue();
                                    c1726.m2350(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        c1726.m2353();
                        break;
                    case 33:
                        c1726.m2357();
                        c1726.m2353();
                        break;
                    case 34:
                        c1726.m2359();
                        c1726.m2353();
                        break;
                    case 35:
                        c1726.m2352();
                        c1726.m2353();
                        break;
                    case 36:
                        c1726.m2348();
                        c1726.m2353();
                        break;
                    case 37:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            if (c1726.m2342()) {
                                c1726.m2352();
                            } else {
                                c1726.m2348();
                            }
                        }
                        c1726.m2353();
                        break;
                    case 38:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            if (c1726.m2342()) {
                                c1726.m2348();
                            } else {
                                c1726.m2352();
                            }
                        }
                        c1726.m2353();
                        break;
                    case 39:
                        if (c1726.f2870.f6474.length() > 0 && (c28673 = c1726.f2866) != null) {
                            int iM23553 = c1726.m2355(c28673, -1);
                            c1726.m2350(iM23553, iM23553);
                        }
                        c1726.m2353();
                        break;
                    case 40:
                        if (c1726.f2870.f6474.length() > 0 && (c28674 = c1726.f2866) != null) {
                            int iM23554 = c1726.m2355(c28674, 1);
                            c1726.m2350(iM23554, iM23554);
                        }
                        c1726.m2353();
                        break;
                    case 41:
                        if (c1726.f2870.f6474.length() > 0 && (c18013 = c1726.f2871) != null) {
                            int iM23543 = c1726.m2354(c18013, -1);
                            c1726.m2350(iM23543, iM23543);
                        }
                        c1726.m2353();
                        break;
                    case 42:
                        if (c1726.f2870.f6474.length() > 0 && (c18014 = c1726.f2871) != null) {
                            int iM23544 = c1726.m2354(c18014, 1);
                            c1726.m2350(iM23544, iM23544);
                        }
                        c1726.m2353();
                        break;
                    case 43:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            c1726.m2350(0, 0);
                        }
                        c1726.m2353();
                        break;
                    case 44:
                        c1726.f2864.f2986 = null;
                        C2902 c29028 = c1726.f2870;
                        if (c29028.f6474.length() > 0) {
                            int length2 = c29028.f6474.length();
                            c1726.m2350(length2, length2);
                        }
                        c1726.m2353();
                        break;
                    case 45:
                        c1726.f2864.f2986 = null;
                        if (c1726.f2870.f6474.length() > 0) {
                            long j9 = c1726.f2863;
                            int i10 = C2869.f6347;
                            int i11 = (int) (j9 & 4294967295L);
                            c1726.m2350(i11, i11);
                        }
                        break;
                    case 46:
                        C1803 c1803 = c1831.f3253;
                        if (c1803 != null) {
                            c1803.m2440(C2847.m4275(c1726.f2869, c1726.f2870, c1726.f2863, 4));
                        }
                        C1803 c18032 = c1831.f3253;
                        if (c18032 != null) {
                            C1800 c18002 = c18032.f3099;
                            if (c18002 != null && (c1800 = c18002.f3087) != null) {
                                c18032.f3099 = c1800;
                                c18032.f3097 -= c18002.f3086.f6292.f6474.length();
                                c18032.f3098 = new C1800(c18032.f3098, c18002.f3086);
                                c2847 = c1800.f3086;
                            }
                            if (c2847 != null) {
                                c1831.f3255.invoke(c2847);
                            }
                        }
                        break;
                    case 47:
                        C1803 c18033 = c1831.f3253;
                        if (c18033 != null) {
                            C1800 c18003 = c18033.f3098;
                            if (c18003 != null) {
                                c18033.f3098 = c18003.f3087;
                                C2847 c28473 = c18003.f3086;
                                c18033.f3099 = new C1800(c18033.f3099, c28473);
                                c18033.f3097 = c28473.f6292.f6474.length() + c18033.f3097;
                                c2847 = c18003.f3086;
                            }
                            if (c2847 != null) {
                                c1831.f3255.invoke(c2847);
                            }
                        }
                        break;
                    case 48:
                    case 49:
                        break;
                    default:
                        C5043.m9170();
                        return null;
                }
                return c6008;
            case 5:
                InterfaceC3221 interfaceC3221 = (InterfaceC3221) obj4;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C3090 c3090 = new C3090(i6, ref$ObjectRef, (C3196) obj3, (InterfaceC7387) obj2);
                interfaceC3221.getLifecycle().mo5063(c3090);
                return new C1248(interfaceC3221, c3090, ref$ObjectRef, i6);
            case 6:
                URL url = (URL) obj;
                url.getClass();
                String path = url.getPath();
                path.getClass();
                C5973 c5973 = Regex.Companion;
                String str9 = File.separator;
                str9.getClass();
                String strM10715 = AbstractC5976.m10715((String) obj4, str9);
                c5973.getClass();
                String strQuoteReplacement = Matcher.quoteReplacement(strM10715);
                strQuoteReplacement.getClass();
                return (C8954) ((InterfaceC7387) obj2).invoke(new URL(url.getProtocol(), url.getHost(), url.getPort(), new Regex(strQuoteReplacement.concat("$")).replace(path, AbstractC5976.m10715((String) obj3, str9))));
            case 7:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                C6864 c6864 = (C6864) obj3;
                C1191 c1191 = (C1191) obj;
                c1191.getClass();
                AbstractC2182 abstractC2182 = (AbstractC2182) c1191.f1528;
                float fFloatValue = ((Number) abstractC2182.getValue()).floatValue() - ref$FloatRef.element;
                float fM11954 = c6864.m11954();
                c6864.m11953(fM11954 + fFloatValue);
                float fAbs = Math.abs(fM11954 - c6864.m11954());
                ref$FloatRef.element = ((Number) abstractC2182.getValue()).floatValue();
                ((Ref$FloatRef) obj2).element = ((Number) c1191.m1605()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c1191.m1606();
                }
                return c6008;
            case 8:
                C8168 c8168 = (C8168) obj4;
                C8178 c8178 = (C8178) obj2;
                C1083 c1083 = c8168.f19897;
                if (c1083.m1313(obj3)) {
                    C1123.m1409(obj3, "Key ", " was used multiple times ");
                    return null;
                }
                c8168.f19899.remove(obj3);
                c1083.m1315(obj3, c8178);
                return new C1248(c8168, obj3, c8178, i3);
            case 9:
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                C9603 c9603 = (C9603) obj;
                AbstractC9234.m14531(2337);
                c9603.getClass();
                for (Object obj5 : ((C9515) obj4).f24839) {
                    if (obj5 != null) {
                        C9569.f24978.getClass();
                        InterfaceC6016 interfaceC6016 = C9569.f24977;
                        if (!((PluginMessageCallbackAPI) interfaceC6016.getValue()).isGrayMessage(obj5)) {
                            C9570 c9570 = new C9570(str10, str11);
                            MessageData message = ((PluginMessageCallbackAPI) interfaceC6016.getValue()).parseMessage(obj5);
                            String str12 = message.UserUin;
                            if (str12 == null) {
                                str12 = "";
                            }
                            MessageData messageData = message.RecordMsg;
                            c9603.m15029(AbstractC9594.m15026(new C4956(message, str12, messageData == null ? null : AbstractC9594.m15026(new C6886(messageData, i4)), c9570)));
                        }
                    }
                }
                return c6008;
            default:
                C9911 c9911 = (C9911) obj4;
                ProgressBar progressBar = (ProgressBar) obj3;
                C9908 c9908 = (C9908) obj2;
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list2) {
                    C9895.C9896 c9896M15175 = ((C9895) obj6).getPluginInfo();
                    if (AbstractC5976.m10735(c9896M15175.getName(), c9908.f25796, false) || AbstractC5976.m10735(c9896M15175.getDescription(), c9908.f25796, false) || AbstractC5976.m10735(c9896M15175.getAuthor(), c9908.f25796, false) || c9896M15175.getTags().contains(c9908.f25796) || AbstractC5976.m10735(c9896M15175.getVersion(), c9908.f25796, false)) {
                        arrayList2.add(obj6);
                    }
                }
                String str13 = c9908.f25798;
                int iHashCode = str13.hashCode();
                if (iHashCode == -938285885) {
                    listM9337 = arrayList2;
                    if (str13.equals("random")) {
                        List listM9342 = AbstractC5176.m9342(arrayList2);
                        Collections.shuffle(listM9342);
                        listM9337 = listM9342;
                    }
                } else if (iHashCode != 31392744) {
                    listM9337 = arrayList2;
                    if (iHashCode == 1109388858) {
                        listM9337 = arrayList2;
                        if (str13.equals("download_asc")) {
                            listM9337 = AbstractC5176.m9337(arrayList2, new C1272(22));
                        }
                    }
                } else {
                    listM9337 = arrayList2;
                    if (str13.equals("download_desc")) {
                        listM9337 = AbstractC5176.m9337(arrayList2, new C1272(23));
                    }
                }
                AbstractC8798.m14017(c9911, listM9337);
                progressBar.setVisibility(8);
                return c6008;
        }
    }

    public /* synthetic */ C1597(Object obj, Object obj2, Object obj3, int i) {
        this.f2544 = i;
        this.f2542 = obj;
        this.f2543 = obj2;
        this.f2541 = obj3;
    }

    public /* synthetic */ C1597(InterfaceC7387 interfaceC7387, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302) {
        this.f2544 = 1;
        this.f2543 = interfaceC7387;
        this.f2542 = interfaceC2230;
        this.f2541 = interfaceC22302;
    }
}
