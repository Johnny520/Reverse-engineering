package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: ph */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2374ph {
    /* JADX INFO: renamed from: a */
    public static final void m4804a(View r2, int r3) {
        int r32 = AbstractC0213Ey.m424v(r3);
        if (r32 != 0) goto L5;
        ViewParent r33 = r2.getParent();
        if ((r33 instanceof ViewGroup) == false) goto L28;
        ViewGroup r34 = (ViewGroup) r33;
    L29:
        if (r34 != null) goto L31;
        return;
    L31:
        if (AbstractC2805zi.m5374G(2) == false) goto L33;
        r2.toString();
        r34.toString();
    L33:
        r34.removeView(r2);
        return;
    L28:
        r34 = null;
        goto L29
    L5:
        if (r32 == 1) goto L21;
        if (r32 == 2) goto L16;
        if (r32 == 3) goto L11;
        return;
    L11:
        if (AbstractC2805zi.m5374G(2) == false) goto L13;
        r2.toString();
    L13:
        r2.setVisibility(4);
        return;
    L16:
        if (AbstractC2805zi.m5374G(2) == false) goto L18;
        r2.toString();
    L18:
        r2.setVisibility(8);
        return;
    L21:
        if (AbstractC2805zi.m5374G(2) == false) goto L23;
        r2.toString();
    L23:
        r2.setVisibility(0);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4805b(int r0) {
        return !AbstractC1489hB.m2848a();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4806c(int r2) {
        if (AbstractC1489hB.m2848a() == true) goto L13;
    L11:
        return true;
    L13:
        Boolean r22 = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);     // Catch: Exception -> L6
    L8:
        if (r22.booleanValue() == true) goto L11;
        return false;
    L6:
        AbstractC1489hB.f5259a.info("Conscrypt is not available or does not support checking for FIPS build.");
        r22 = Boolean.FALSE;
        goto L8
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m4807d(int r3) {
        if (r3 != 1) goto L5;
    L16:
        return false;
    L5:
        if (r3 == 2) goto L16;
        if (r3 == 3) goto L16;
        if (r3 != 4) goto L11;
        return true;
    L11:
        if (r3 != 5) goto L14;
        return true;
    L14:
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static int m4808e(int r0, int r1, int r2) {
        return (C2230ma.m4524Q(r0) + r1) + r2;
    }

    /* JADX INFO: renamed from: f */
    public static int m4809f(int r0, int r1, int r2, int r3) {
        return ((C2230ma.m4525R(r0) + r1) + r2) + r3;
    }

    /* JADX INFO: renamed from: g */
    public static int m4810g(String r0, int r1, int r2) {
        return (r0.hashCode() + r1) * r2;
    }

    /* JADX INFO: renamed from: h */
    public static C2147kh m4811h(long r0, long r2) {
        AbstractC0295Gu.m625r(r0);
        AbstractC0295Gu.m625r(r2);
        return new C2147kh(2);
    }

    /* JADX INFO: renamed from: i */
    public static String m4812i(int r1, String r2) {
        return r2 + r1;
    }

    /* JADX INFO: renamed from: j */
    public static String m4813j(int r1, String r2, String r3) {
        return r2 + r1 + r3;
    }

    /* JADX INFO: renamed from: k */
    public static String m4814k(String r1, String r2, String r3) {
        return r1 + r2 + r3;
    }

    /* JADX INFO: renamed from: l */
    public static String m4815l(StringBuilder r0, String r1, char r2) {
        r0.append(r1);
        r0.append(r2);
        return r0.toString();
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m4816m(int r1, String r2, String r3) {
        StringBuilder r0 = new StringBuilder(r2);
        r0.append(r1);
        r0.append(r3);
        return r0;
    }

    /* JADX INFO: renamed from: n */
    public static void m4817n(StringBuilder r0, String r1, long r2) {
        r0.append(r1);
        r0.append(AbstractC0295Gu.m625r(r2));
    }
}
