package p000;

import java.util.Locale;

/* JADX INFO: renamed from: sr */
/* JADX INFO: loaded from: classes.dex */
public final class C0718sr {

    /* JADX INFO: renamed from: b */
    public static final C0718sr f4451b = new C0718sr(new C0755tr(AbstractC0681rr.m2297a(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final C0755tr f4452a;

    public C0718sr(C0755tr c0755tr) {
        this.f4452a = c0755tr;
    }

    /* JADX INFO: renamed from: a */
    public static C0718sr m2337a(String str) {
        if (str == null || str.isEmpty()) {
            return f4451b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC0644qr.m2182a(strArrSplit[i]);
        }
        return new C0718sr(new C0755tr(AbstractC0681rr.m2297a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0718sr) {
            return this.f4452a.equals(((C0718sr) obj).f4452a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4452a.f4613a.hashCode();
    }

    public final String toString() {
        return this.f4452a.f4613a.toString();
    }
}
