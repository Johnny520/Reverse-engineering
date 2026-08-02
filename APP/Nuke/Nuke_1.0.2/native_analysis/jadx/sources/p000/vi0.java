package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vi0 {
    /* JADX INFO: renamed from: a */
    public static String m5682a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m5683b(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static int m5684c(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m5685d(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: e */
    public static C0594pv m5686e(String str) {
        kz0.m2765c(str);
        return new C0594pv();
    }

    /* JADX INFO: renamed from: f */
    public static String m5687f(rh1 rh1Var, float f, go0 go0Var, int i, go0 go0Var2) {
        rp0.m4529O(go0Var, AbstractC0731te.m5186O(rh1Var, f));
        return rg3.m4462P(i, go0Var2);
    }

    /* JADX INFO: renamed from: g */
    public static String m5688g(String str, int i) {
        return str + i;
    }

    /* JADX INFO: renamed from: h */
    public static String m5689h(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: i */
    public static String m5690i(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: j */
    public static String m5691j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: k */
    public static String m5692k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: l */
    public static String m5693l(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m5694m(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m5695n(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m5696o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: p */
    public static void m5697p(int i, int i2, int i3, int i4, int i5) {
        sp0.m4938f(i);
        sp0.m4938f(i2);
        sp0.m4938f(i3);
        sp0.m4938f(i4);
        sp0.m4938f(i5);
    }

    /* JADX INFO: renamed from: q */
    public static void m5698q(int i, go0 go0Var, C0419lc c0419lc, go0 go0Var2, C0799v6 c0799v6) {
        yf3.m6268c(go0Var, c0419lc, Integer.valueOf(i));
        yf3.m6267b(go0Var2, c0799v6);
    }

    /* JADX INFO: renamed from: r */
    public static void m5699r(C0043b5 c0043b5, long j) {
        c0043b5.m430q().mo1520i();
        c0043b5.m414E(j);
    }

    /* JADX INFO: renamed from: s */
    public static void m5700s(oa0 oa0Var, oa0 oa0Var2, oa0 oa0Var3, oa0 oa0Var4, oa0 oa0Var5) {
        pa0.m3833a(oa0Var);
        pa0.m3833a(oa0Var2);
        pa0.m3833a(oa0Var3);
        pa0.m3833a(oa0Var4);
        pa0.m3833a(oa0Var5);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5701t(Object obj) {
        if (obj == null) {
            return;
        }
        c80.m664g();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m5702u(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m5703v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m5704w(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return "FINISHED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m5705x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
