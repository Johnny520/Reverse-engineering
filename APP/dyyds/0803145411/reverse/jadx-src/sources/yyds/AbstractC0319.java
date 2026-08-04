package yyds;

import android.view.View;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛲᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0319 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ExecutorC1267 f1691 = new ExecutorC1267(1);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final ExecutorC1267 f1692 = new ExecutorC1267(2);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static int m980(C2637 c2637, AbstractC0353 abstractC0353, View view, View view2, AbstractC2551 abstractC2551, boolean z) {
        if (abstractC2551.m4613() == 0 || c2637.m4742() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c2637.m4742();
        }
        return (int) (((abstractC0353.mo1056(view2) - abstractC0353.mo1046(view)) / (Math.abs(AbstractC2551.m4603(view) - AbstractC2551.m4603(view2)) + 1)) * c2637.m4742());
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final C2101 m981(InterfaceC0274 interfaceC0274, InterfaceC2213 interfaceC2213, Object obj) {
        C2101 c2101 = null;
        if ((interfaceC0274 instanceof InterfaceC1431) && interfaceC2213.mo423(C0463.f2313) != null) {
            InterfaceC1431 interfaceC1431Mo1008 = (InterfaceC1431) interfaceC0274;
            while (true) {
                if ((interfaceC1431Mo1008 instanceof C1305) || (interfaceC1431Mo1008 = interfaceC1431Mo1008.mo1008()) == null) {
                    break;
                }
                if (interfaceC1431Mo1008 instanceof C2101) {
                    c2101 = (C2101) interfaceC1431Mo1008;
                    break;
                }
            }
            if (c2101 != null) {
                c2101.m3996(interfaceC2213, obj);
            }
        }
        return c2101;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static long[] m982(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final void m983(int i) {
        if (i >= 1) {
            return;
        }
        C0188.m806(AbstractC0897.m1989(i, "Expected positive parallelism level, but got "));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m984(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m985(String str, boolean z) {
        if (z) {
            return;
        }
        C0188.m798(str);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static int m986(C2637 c2637, AbstractC0353 abstractC0353, View view, View view2, AbstractC2551 abstractC2551, boolean z, boolean z2) {
        if (abstractC2551.m4613() == 0 || c2637.m4742() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c2637.m4742() - Math.max(AbstractC2551.m4603(view), AbstractC2551.m4603(view2))) - 1) : Math.max(0, Math.min(AbstractC2551.m4603(view), AbstractC2551.m4603(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0353.mo1056(view2) - abstractC0353.mo1046(view)) / (Math.abs(AbstractC2551.m4603(view) - AbstractC2551.m4603(view2)) + 1))) + (abstractC0353.mo1038() - abstractC0353.mo1046(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final int m987(C2263 c2263, int i) {
        int i2;
        int[] iArr = c2263.f11164;
        int i3 = i + 1;
        int length = c2263.f11165.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = iArr[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final Pair m988(String str, String str2) {
        return new Pair(str, str2);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC2213 m989(InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC22132, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC2213.mo424(bool, new C1936(7))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC22132.mo424(bool, new C1936(7))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC2213.mo422(interfaceC22132);
        }
        C1936 c1936 = new C1936(5);
        C2586 c2586 = C2586.f12764;
        InterfaceC2213 interfaceC22133 = (InterfaceC2213) interfaceC2213.mo424(c2586, c1936);
        Object objMo424 = interfaceC22132;
        if (zBooleanValue2) {
            objMo424 = interfaceC22132.mo424(c2586, new C1936(6));
        }
        return interfaceC22133.mo422((InterfaceC2213) objMo424);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m990(Object obj) {
        m992(obj, "Argument must not be null");
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static int m991(C2637 c2637, AbstractC0353 abstractC0353, View view, View view2, AbstractC2551 abstractC2551, boolean z) {
        if (abstractC2551.m4613() == 0 || c2637.m4742() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC2551.m4603(view) - AbstractC2551.m4603(view2)) + 1;
        }
        return Math.min(abstractC0353.mo1036(), abstractC0353.mo1056(view2) - abstractC0353.mo1046(view));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m992(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0188.m789(str);
    }
}
