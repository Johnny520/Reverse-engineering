package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: ph */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2374ph {
    /* JADX INFO: renamed from: a */
    public static final void m4804a(View view, int i) {
        int iM424v = AbstractC0213Ey.m424v(i);
        if (iM424v == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (AbstractC2805zi.m5374G(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM424v == 1) {
            if (AbstractC2805zi.m5374G(2)) {
                view.toString();
            }
            view.setVisibility(0);
        } else if (iM424v == 2) {
            if (AbstractC2805zi.m5374G(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iM424v != 3) {
                return;
            }
            if (AbstractC2805zi.m5374G(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4805b(int i) {
        return !AbstractC1489hB.m2848a();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4806c(int i) {
        Boolean bool;
        if (AbstractC1489hB.m2848a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                AbstractC1489hB.f5259a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m4807d(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static int m4808e(int i, int i2, int i3) {
        return C2230ma.m4524Q(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: f */
    public static int m4809f(int i, int i2, int i3, int i4) {
        return C2230ma.m4525R(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: g */
    public static int m4810g(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static C2147kh m4811h(long j, long j2) {
        AbstractC0295Gu.m625r(j);
        AbstractC0295Gu.m625r(j2);
        return new C2147kh(2);
    }

    /* JADX INFO: renamed from: i */
    public static String m4812i(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: j */
    public static String m4813j(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: k */
    public static String m4814k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: l */
    public static String m4815l(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m4816m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: n */
    public static void m4817n(StringBuilder sb, String str, long j) {
        sb.append(str);
        sb.append(AbstractC0295Gu.m625r(j));
    }
}
