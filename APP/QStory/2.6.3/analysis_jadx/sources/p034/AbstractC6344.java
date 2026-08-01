package p034;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ViewOnTouchListenerC0179;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1632;
import androidx.compose.ui.input.pointer.C1643;
import bsh.C2633;
import com.alibaba.fastjson2.C2943;
import com.bumptech.glide.AbstractC3056;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import io.ktor.util.C4211;
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
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import kotlin.reflect.jvm.internal.types.C4931;
import kotlin.reflect.jvm.internal.types.C4937;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5144;
import p007.C6144;
import p018.AbstractC6253;
import p026.AbstractC6311;
import p070.C6906;
import p088.C7167;
import p097.InterfaceC7231;
import p107.C7312;
import p107.C7314;
import p112.C7329;
import p210.AbstractC7936;
import p236.C8120;
import p236.C8123;
import p247.AbstractC8157;
import p261.AbstractC8248;
import p287.AbstractC8405;
import p305.C8624;
import p305.C8636;
import p305.C8641;
import p305.C8643;
import p312.C8659;
import top.suzhelan.qstory.hook.api.C5818;
import top.suzhelan.qstory.hook.api.InterfaceC5809;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6344 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1543 f17477;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m11868(Activity activity, View view, boolean z) {
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
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
            view.setOnTouchListener(new ViewOnTouchListenerC0179(activity, 3));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        windowManager.addView(frameLayout, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m11869(View view, C8643 c8643) {
        C8659 c8659 = c8643.f24324.f24282;
        if (c8659 == null || !c8659.f24410) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        C8641 c8641 = c8643.f24324;
        if (c8641.f24291 != elevation) {
            c8641.f24291 = elevation;
            c8643.m14326();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11870(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C2633.m5343(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m11871(int i) {
        if (i >= 0) {
            return;
        }
        C5925.m11306();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11872(String str, boolean z) {
        if (z) {
            return;
        }
        C5925.m11310(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11873(C5856 c5856, C1643 c1643, long j) {
        C2943 c2943 = (C2943) c5856.f16014;
        c2943.getClass();
        C7312 c7312 = (C7312) c2943.f9318;
        C7312 c73122 = (C7312) c2943.f9319;
        boolean zM3029 = AbstractC1646.m3029(c1643);
        long j2 = c1643.f4808;
        if (zM3029) {
            C7314[] c7314Arr = c73122.f19497;
            AbstractC4347.m8834(0, c7314Arr.length, null, c7314Arr);
            c73122.f19496 = 0;
            C7314[] c7314Arr2 = c7312.f19497;
            AbstractC4347.m8834(0, c7314Arr2.length, null, c7314Arr2);
            c7312.f19496 = 0;
            c2943.f9320 = 0L;
        }
        if (!AbstractC1646.m3027(c1643)) {
            List listM3023 = c1643.m3023();
            int i = 0;
            for (int size = listM3023.size(); i < size; size = size) {
                C1632 c1632 = (C1632) listM3023.get(i);
                c2943.m6413(c1632.f4778, C7329.m12525(c1632.f4774, j));
                i++;
            }
            c2943.m6413(j2, C7329.m12525(c1643.f4810, j));
        }
        if (AbstractC1646.m3027(c1643) && j2 - c2943.f9320 > 40) {
            C7314[] c7314Arr3 = c73122.f19497;
            AbstractC4347.m8834(0, c7314Arr3.length, null, c7314Arr3);
            c73122.f19496 = 0;
            C7314[] c7314Arr4 = c7312.f19497;
            AbstractC4347.m8834(0, c7314Arr4.length, null, c7314Arr4);
            c7312.f19496 = 0;
            c2943.f9320 = 0L;
        }
        c2943.f9320 = j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11874(AbstractC6311 abstractC6311, InterfaceC5809 interfaceC5809) {
        AbstractC8405.m13972(1562);
        AbstractC8405.m13972(1563);
        C5818.f15949.put(abstractC6311, interfaceC5809);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m11875(InterfaceC5184 interfaceC5184, String str, int i, int i2, String str2) {
        String string = AbstractC5144.m10155(str.substring(i, i2)).toString();
        if (string.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC5184.getValue()).add(new C8120(string, str2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final List m11876(String str) {
        int i;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return EmptyList.INSTANCE;
        }
        InterfaceC5184 interfaceC5184M10215 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C7167(13));
        for (int i2 = 0; i2 <= str.length() - 1; i2 = i) {
            InterfaceC5184 interfaceC5184M102152 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C7167(14));
            Integer numValueOf = null;
            i = i2;
            while (true) {
                if (i <= str.length() - 1) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ',') {
                        ((ArrayList) interfaceC5184M10215.getValue()).add(new C8123(AbstractC5144.m10155(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), interfaceC5184M102152.isInitialized() ? (List) interfaceC5184M102152.getValue() : EmptyList.INSTANCE));
                        i++;
                    } else if (cCharAt != ';') {
                        i++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i);
                        }
                        int i3 = i + 1;
                        int i4 = i3;
                        while (i4 <= AbstractC5144.m10158(str)) {
                            char cCharAt2 = str.charAt(i4);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                m11875(interfaceC5184M102152, str, i3, i4, "");
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
                                                pair = new Pair(Integer.valueOf(i9), AbstractC5144.m10155(str.substring(i5, i9)).toString());
                                                break;
                                            }
                                            i9++;
                                        }
                                        pair = new Pair(Integer.valueOf(i9), AbstractC5144.m10155(str.substring(i5, i9)).toString());
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.component1()).intValue();
                                m11875(interfaceC5184M102152, str, i3, i4, (String) pair2.component2());
                                i = iIntValue;
                            }
                        }
                        m11875(interfaceC5184M102152, str, i3, i4, "");
                        i = i4;
                    }
                } else {
                    ((ArrayList) interfaceC5184M10215.getValue()).add(new C8123(AbstractC5144.m10155(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), interfaceC5184M102152.isInitialized() ? (List) interfaceC5184M102152.getValue() : EmptyList.INSTANCE));
                }
            }
        }
        return interfaceC5184M10215.isInitialized() ? (List) interfaceC5184M10215.getValue() : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static double m11877(double d, double d2) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p089.InterfaceC7184 m11878(androidx.compose.runtime.internal.C1245 r5, kotlin.reflect.InterfaceC5087 r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.AbstractC6344.m11878(androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲, kotlin.reflect.飘花落叶言子世楪苏兰哲, boolean):飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m11879(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            AbstractC7936.m13425("At least one point must be provided");
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
                float fM11885 = m11885(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fM11885);
                }
            }
            float fSqrt = (float) Math.sqrt(m11885(fArr7, fArr7));
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
                fArr10[i13] = i13 < i9 ? 0.0f : m11885(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM118852 = m11885(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM118852 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM118852 / fArr11[i14];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static double m11880(double d, double d2) {
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
        return m11877(d5, d7 * 100.0d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m11881(View view) {
        AbstractC3738 abstractC3738 = (AbstractC3738) view.getTag();
        if (abstractC3738 == null || abstractC3738.m8058() == null) {
            return;
        }
        ((WindowManager) abstractC3738.m8058().getSystemService("window")).removeViewImmediate((View) view.getParent());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static double m11882(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM13605 = AbstractC8157.m13605(d);
        double d3 = ((dM13605 + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM11877 = m11877(dM13605, d3);
        double dAbs = Math.abs(dM11877 - d2);
        if (dM11877 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM13608 = ((AbstractC8157.m13608(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (dM13608 < 0.0d || dM13608 > 100.0d) {
            return -1.0d;
        }
        return dM13608;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m11883(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static double m11884(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM13605 = AbstractC8157.m13605(d);
        double d3 = ((dM13605 + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM11877 = m11877(d3, dM13605);
        double dAbs = Math.abs(dM11877 - d2);
        if (dM11877 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM13608 = ((AbstractC8157.m13608(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (dM13608 < 0.0d || dM13608 > 100.0d) {
            return -1.0d;
        }
        return dM13608;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final float m11885(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m11886(String str) throws CertificateEncodingException {
        JarFile jarFile = new JarFile(new File(str));
        JarEntry jarEntry = jarFile.getJarEntry(AbstractC8405.m13972(49));
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
            byte[] bArrDigest = MessageDigest.getInstance(AbstractC8405.m13973("喵喵呜呜呜呜呜喵~喵喵呜呜喵喵喵呜~喵呜喵喵呜呜呜呜")).digest(encoded);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                int i = b & DefaultClassResolver.NAME;
                if (i < 16) {
                    sb.append(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
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
    public static int m11887(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Pair m11888(C6144 c6144) {
        Charset charset = AbstractC5132.f14688;
        if (c6144 != null) {
            Charset charsetM11529 = C6144.m11529(c6144);
            if (charsetM11529 == null) {
                try {
                    c6144 = AbstractC3056.m6711(c6144 + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    c6144 = null;
                }
            } else {
                charset = charsetM11529;
            }
        }
        return new Pair(charset, c6144);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C6906 m11889(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
        if (protoBuf$VersionRequirementTable.getRequirementCount() == 0) {
            return C6906.f18421;
        }
        List<ProtoBuf$VersionRequirement> requirementList = protoBuf$VersionRequirementTable.getRequirementList();
        requirementList.getClass();
        return new C6906(requirementList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static AbstractC6253 m11890(int i) {
        return i != 0 ? i != 1 ? new C8636() : new C8624() : new C8636();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m11891(int i, int i2) {
        if (i <= i2) {
            return;
        }
        C4211.m8618("toIndex (", i, ") is greater than size (", i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C4937 m11892(InterfaceC5087 interfaceC5087) {
        C4931 c4931 = C4931.f14281;
        InterfaceC7231 interfaceC7231Mo9623 = c4931.mo9623((AbstractC4926) interfaceC5087);
        int iMo9621 = c4931.mo9621(interfaceC7231Mo9623);
        ArrayList arrayList = new ArrayList(iMo9621);
        for (int i = 0; i < iMo9621; i++) {
            arrayList.add((AbstractC4394) c4931.mo9653(interfaceC7231Mo9623, i));
        }
        return !arrayList.isEmpty() ? new C4937(AbstractC4339.m8771(AbstractC4344.m8821(arrayList, interfaceC5087.mo8898()))) : C4937.f14289;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract String mo10001();
}
