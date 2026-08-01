package p050;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ViewOnTouchListenerC1026;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2467;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import com.alibaba.fastjson2.C3776;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5763;
import kotlin.reflect.jvm.internal.types.C5769;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.C6385;
import p023.C6973;
import p034.AbstractC7082;
import p042.AbstractC7140;
import p086.C7735;
import p103.AbstractC7973;
import p103.InterfaceC7965;
import p104.C7996;
import p105.AbstractC8008;
import p105.C8011;
import p105.C8014;
import p105.InterfaceC8013;
import p113.InterfaceC8060;
import p123.C8141;
import p123.C8143;
import p128.C8158;
import p226.AbstractC8765;
import p252.C8949;
import p252.C8952;
import p263.AbstractC8986;
import p277.AbstractC9077;
import p321.C9453;
import p321.C9465;
import p321.C9470;
import p321.C9472;
import p328.C9488;
import top.suzhelan.qstory.hook.api.C6648;
import top.suzhelan.qstory.hook.api.InterfaceC6639;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2378 f17822;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m12427(Activity activity, View view, boolean z) {
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        FrameLayout frameLayout = new FrameLayout(activity);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 16;
        layoutParams.format = -2;
        layoutParams.type = 1003;
        layoutParams.flags = 201327872;
        layoutParams.softInputMode = 16;
        if (!z) {
            view.setOnTouchListener(new ViewOnTouchListenerC1026(activity, 3));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        windowManager.addView(frameLayout, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m12428(View view, C9472 c9472) {
        C9488 c9488 = c9472.f24669.f24627;
        if (c9488 == null || !c9488.f24755) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        C9470 c9470 = c9472.f24669;
        if (c9470.f24636 != elevation) {
            c9470.f24636 = elevation;
            c9472.m14885();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m12429(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3466.m5903(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m12430(int i) {
        if (i >= 0) {
            return;
        }
        C6755.m11865();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m12431(String str, boolean z) {
        if (z) {
            return;
        }
        C6755.m11869(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m12432(C6686 c6686, C2478 c2478, long j) {
        C3776 c3776 = (C3776) c6686.f16359;
        c3776.getClass();
        C8141 c8141 = (C8141) c3776.f9663;
        C8141 c81412 = (C8141) c3776.f9664;
        boolean zM3589 = AbstractC2481.m3589(c2478);
        long j2 = c2478.f5153;
        if (zM3589) {
            C8143[] c8143Arr = c81412.f19842;
            AbstractC5179.m9393(0, c8143Arr.length, null, c8143Arr);
            c81412.f19841 = 0;
            C8143[] c8143Arr2 = c8141.f19842;
            AbstractC5179.m9393(0, c8143Arr2.length, null, c8143Arr2);
            c8141.f19841 = 0;
            c3776.f9665 = 0L;
        }
        if (!AbstractC2481.m3587(c2478)) {
            List listM3583 = c2478.m3583();
            int i = 0;
            for (int size = listM3583.size(); i < size; size = size) {
                C2467 c2467 = (C2467) listM3583.get(i);
                c3776.m6973(c2467.f5123, C8158.m13084(c2467.f5119, j));
                i++;
            }
            c3776.m6973(j2, C8158.m13084(c2478.f5155, j));
        }
        if (AbstractC2481.m3587(c2478) && j2 - c3776.f9665 > 40) {
            C8143[] c8143Arr3 = c81412.f19842;
            AbstractC5179.m9393(0, c8143Arr3.length, null, c8143Arr3);
            c81412.f19841 = 0;
            C8143[] c8143Arr4 = c8141.f19842;
            AbstractC5179.m9393(0, c8143Arr4.length, null, c8143Arr4);
            c8141.f19841 = 0;
            c3776.f9665 = 0L;
        }
        c3776.f9665 = j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12433(AbstractC7140 abstractC7140, InterfaceC6639 interfaceC6639) {
        "hookItem";
        "onMsgViewUpdateListener";
        C6648.f16294.put(abstractC7140, interfaceC6639);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m12434(InterfaceC6016 interfaceC6016, String str, int i, int i2, String str2) {
        String string = AbstractC5976.m10714(str.substring(i, i2)).toString();
        if (string.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC6016.getValue()).add(new C8949(string, str2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final List m12435(String str) {
        int i;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return EmptyList.INSTANCE;
        }
        InterfaceC6016 interfaceC6016M10774 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C7996(13));
        for (int i2 = 0; i2 <= str.length() - 1; i2 = i) {
            InterfaceC6016 interfaceC6016M107742 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C7996(14));
            Integer numValueOf = null;
            i = i2;
            while (true) {
                if (i <= str.length() - 1) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ',') {
                        ((ArrayList) interfaceC6016M10774.getValue()).add(new C8952(AbstractC5976.m10714(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), interfaceC6016M107742.isInitialized() ? (List) interfaceC6016M107742.getValue() : EmptyList.INSTANCE));
                        i++;
                    } else if (cCharAt != ';') {
                        i++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i);
                        }
                        int i3 = i + 1;
                        int i4 = i3;
                        while (i4 <= AbstractC5976.m10717(str)) {
                            char cCharAt2 = str.charAt(i4);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                m12434(interfaceC6016M107742, str, i3, i4, "");
                                break;
                            }
                            if (cCharAt2 != '=') {
                                i4++;
                            } else {
                                int i5 = i4 + 1;
                                if (str.length() == i5) {
                                    pair2 = new Pair(Integer.valueOf(i5), "");
                                } else {
                                    if (str.charAt(i5) == '\"') {
                                        int i6 = i4 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (i6 <= str.length() - 1) {
                                            char cCharAt3 = str.charAt(i6);
                                            if (cCharAt3 == '\"') {
                                                int i7 = i6 + 1;
                                                int i8 = i7;
                                                while (i8 < str.length() && str.charAt(i8) == ' ') {
                                                    i8++;
                                                }
                                                if (i8 == str.length() || str.charAt(i8) == ';') {
                                                    pair = new Pair(Integer.valueOf(i7), sb.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i6 >= str.length() - 3) {
                                                sb.append(cCharAt3);
                                                i6++;
                                            } else {
                                                sb.append(str.charAt(i6 + 1));
                                                i6 += 2;
                                            }
                                        }
                                        pair = new Pair(Integer.valueOf(i6), "\"".concat(sb.toString()));
                                    } else {
                                        int i9 = i5;
                                        while (i9 <= str.length() - 1) {
                                            char cCharAt4 = str.charAt(i9);
                                            if (cCharAt4 == ',' || cCharAt4 == ';') {
                                                pair = new Pair(Integer.valueOf(i9), AbstractC5976.m10714(str.substring(i5, i9)).toString());
                                                break;
                                            }
                                            i9++;
                                        }
                                        pair = new Pair(Integer.valueOf(i9), AbstractC5976.m10714(str.substring(i5, i9)).toString());
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.component1()).intValue();
                                m12434(interfaceC6016M107742, str, i3, i4, (String) pair2.component2());
                                i = iIntValue;
                            }
                        }
                        m12434(interfaceC6016M107742, str, i3, i4, "");
                        i = i4;
                    }
                } else {
                    ((ArrayList) interfaceC6016M10774.getValue()).add(new C8952(AbstractC5976.m10714(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), interfaceC6016M107742.isInitialized() ? (List) interfaceC6016M107742.getValue() : EmptyList.INSTANCE));
                }
            }
        }
        return interfaceC6016M10774.isInitialized() ? (List) interfaceC6016M10774.getValue() : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static double m12436(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC8013 m12437(C2080 c2080, InterfaceC5919 interfaceC5919, boolean z) {
        InterfaceC8013 interfaceC8013Mo10306;
        InterfaceC8013 interfaceC8013M10429;
        C8011 c8011;
        InterfaceC5925 interfaceC5925M12977 = AbstractC7973.m12977(interfaceC5919);
        boolean zMo9455 = interfaceC5919.mo9455();
        List<C5917> listMo9457 = interfaceC5919.mo9457();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo9457, 10));
        for (C5917 c5917 : listMo9457) {
            c5917.getClass();
            InterfaceC5919 interfaceC59192 = c5917.f14982;
            if (interfaceC59192 == null) {
                C6385.m11431(interfaceC59192, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(interfaceC59192);
        }
        if (arrayList.isEmpty()) {
            if (AbstractC3889.m7316(interfaceC5925M12977).isInterface()) {
                C2080.m2710(c2080, interfaceC5925M12977);
            }
            InterfaceC7965 interfaceC7965 = AbstractC8008.f19510;
            if (zMo9455) {
                interfaceC8013Mo10306 = AbstractC8008.f19509.mo10306(interfaceC5925M12977);
            } else {
                interfaceC8013Mo10306 = AbstractC8008.f19510.mo10306(interfaceC5925M12977);
                if (interfaceC8013Mo10306 == null) {
                    interfaceC8013Mo10306 = null;
                }
            }
        } else {
            c2080.getClass();
            InterfaceC7965 interfaceC79652 = AbstractC8008.f19510;
            Object objM10319 = !zMo9455 ? AbstractC8008.f19508.m10319(interfaceC5925M12977, arrayList) : AbstractC8008.f19507.m10319(interfaceC5925M12977, arrayList);
            if (Result.m9310isFailureimpl(objM10319)) {
                objM10319 = null;
            }
            interfaceC8013Mo10306 = (InterfaceC8013) objM10319;
        }
        if (interfaceC8013Mo10306 != null) {
            return interfaceC8013Mo10306;
        }
        if (arrayList.isEmpty()) {
            interfaceC8013M10429 = AbstractC5754.m10429(interfaceC5925M12977);
            if (interfaceC8013M10429 == null) {
                C2080.m2710(c2080, interfaceC5925M12977);
                if (AbstractC3889.m7316(interfaceC5925M12977).isInterface()) {
                    c8011 = new C8011(interfaceC5925M12977);
                    interfaceC8013M10429 = c8011;
                }
                interfaceC8013M10429 = null;
            }
            if (interfaceC8013M10429 != null) {
                return zMo9455 ? AbstractC4765.m8872(interfaceC8013M10429) : interfaceC8013M10429;
            }
        } else {
            ArrayList arrayListM10426 = AbstractC5754.m10426(c2080, arrayList, z);
            if (arrayListM10426 != null) {
                InterfaceC8013 interfaceC8013M10435 = AbstractC5754.m10435(interfaceC5925M12977, arrayListM10426, new C8014(0, arrayList));
                if (interfaceC8013M10435 == null) {
                    c2080.m2721(interfaceC5925M12977, arrayListM10426);
                    if (AbstractC3889.m7316(interfaceC5925M12977).isInterface()) {
                        c8011 = new C8011(interfaceC5925M12977);
                        interfaceC8013M10429 = c8011;
                        if (interfaceC8013M10429 != null) {
                        }
                    }
                    interfaceC8013M10429 = null;
                    if (interfaceC8013M10429 != null) {
                    }
                } else {
                    interfaceC8013M10429 = interfaceC8013M10435;
                    if (interfaceC8013M10429 != null) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m12438(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            AbstractC8765.m13984("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fM12444 = m12444(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fM12444);
                }
            }
            float fSqrt = (float) Math.sqrt(m12444(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : m12444(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM124442 = m12444(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM124442 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM124442 / fArr11[i14];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static double m12439(double d, double d2) {
        double d3 = (d + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d5 = d4 * 100.0d;
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = d6 * d6 * d6;
        if (d7 <= 0.008856451679035631d) {
            d7 = ((116.0d * d6) - 16.0d) / 903.2962962962963d;
        }
        return m12436(d5, d7 * 100.0d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m12440(View view) {
        AbstractC4570 abstractC4570 = (AbstractC4570) view.getTag();
        if (abstractC4570 == null || abstractC4570.m8617() == null) {
            return;
        }
        ((WindowManager) abstractC4570.m8617().getSystemService("window")).removeViewImmediate((View) view.getParent());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static double m12441(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM14164 = AbstractC8986.m14164(d);
        double d3 = ((dM14164 + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM12436 = m12436(dM14164, d3);
        double dAbs = Math.abs(dM12436 - d2);
        if (dM12436 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM14167 = ((AbstractC8986.m14167(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (dM14167 < 0.0d || dM14167 > 100.0d) {
            return -1.0d;
        }
        return dM14167;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m12442(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static double m12443(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM14164 = AbstractC8986.m14164(d);
        double d3 = ((dM14164 + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM12436 = m12436(d3, dM14164);
        double dAbs = Math.abs(dM12436 - d2);
        if (dM12436 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM14167 = ((AbstractC8986.m14167(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (dM14167 < 0.0d || dM14167 > 100.0d) {
            return -1.0d;
        }
        return dM14167;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final float m12444(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m12445(String str) throws CertificateEncodingException {
        JarFile jarFile = new JarFile(new File(str));
        JarEntry jarEntry = jarFile.getJarEntry("AndroidManifest.xml");
        byte[] bArr = new byte[8192];
        byte[] encoded = null;
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            while (inputStream.read(bArr, 0, 8192) != -1) {
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Certificate[] certificates = jarEntry != null ? jarEntry.getCertificates() : null;
        if (certificates != null && certificates.length > 0) {
            encoded = certificates[0].getEncoded();
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(encoded);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                int i = b & DefaultClassResolver.NAME;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m12446(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Pair m12447(C6973 c6973) {
        Charset charset = AbstractC5964.f15033;
        if (c6973 != null) {
            Charset charsetM12088 = C6973.m12088(c6973);
            if (charsetM12088 == null) {
                try {
                    c6973 = AbstractC3888.m7271(c6973 + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    c6973 = null;
                }
            } else {
                charset = charsetM12088;
            }
        }
        return new Pair(charset, c6973);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C7735 m12448(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
        if (protoBuf$VersionRequirementTable.getRequirementCount() == 0) {
            return C7735.f18766;
        }
        List<ProtoBuf$VersionRequirement> requirementList = protoBuf$VersionRequirementTable.getRequirementList();
        requirementList.getClass();
        return new C7735(requirementList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static AbstractC7082 m12449(int i) {
        return i != 0 ? i != 1 ? new C9465() : new C9453() : new C9465();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m12450(int i, int i2) {
        if (i <= i2) {
            return;
        }
        C5043.m9177("toIndex (", i, ") is greater than size (", i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C5769 m12451(InterfaceC5919 interfaceC5919) {
        C5763 c5763 = C5763.f14626;
        InterfaceC8060 interfaceC8060Mo10182 = c5763.mo10182((AbstractC5758) interfaceC5919);
        int iMo10180 = c5763.mo10180(interfaceC8060Mo10182);
        ArrayList arrayList = new ArrayList(iMo10180);
        for (int i = 0; i < iMo10180; i++) {
            arrayList.add((AbstractC5226) c5763.mo10212(interfaceC8060Mo10182, i));
        }
        return !arrayList.isEmpty() ? new C5769(AbstractC5171.m9330(AbstractC5176.m9380(arrayList, interfaceC5919.mo9457()))) : C5769.f14634;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract String mo10560();
}
