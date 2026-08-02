package p000;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 {

    /* JADX INFO: renamed from: e */
    public static final i51 f6895e = new i51(9);

    /* JADX INFO: renamed from: a */
    public final Object f6896a;

    /* JADX INFO: renamed from: b */
    public final lv1 f6897b;

    /* JADX INFO: renamed from: c */
    public final String f6898c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f6899d;

    public mv1(String str, Object obj, lv1 lv1Var) {
        if (TextUtils.isEmpty(str)) {
            C0676s.m4651j("Must not be null or empty");
            throw null;
        }
        this.f6898c = str;
        this.f6896a = obj;
        this.f6897b = lv1Var;
    }

    /* JADX INFO: renamed from: a */
    public static mv1 m3211a(String str, Object obj) {
        return new mv1(str, obj, f6895e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mv1) {
            return this.f6898c.equals(((mv1) obj).f6898c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6898c.hashCode();
    }

    public final String toString() {
        return hk1.m2211j(new StringBuilder("Option{key='"), this.f6898c, "'}");
    }
}
