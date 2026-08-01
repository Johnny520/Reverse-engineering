package p000;

import java.util.Locale;

/* JADX INFO: renamed from: wr */
/* JADX INFO: loaded from: classes.dex */
public final class C0866wr {

    /* JADX INFO: renamed from: b */
    public static final C0866wr f5103b = new C0866wr(new C0903xr(AbstractC0828vr.m2575a(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final C0903xr f5104a;

    public C0866wr(C0903xr c0903xr) {
        this.f5104a = c0903xr;
    }

    /* JADX INFO: renamed from: a */
    public static C0866wr m2619a(String str) {
        if (str == null || str.isEmpty()) {
            return f5103b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC0791ur.m2482a(strArrSplit[i]);
        }
        return new C0866wr(new C0903xr(AbstractC0828vr.m2575a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0866wr) {
            return this.f5104a.equals(((C0866wr) obj).f5104a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5104a.f5304a.hashCode();
    }

    public final String toString() {
        return this.f5104a.f5304a.toString();
    }
}
