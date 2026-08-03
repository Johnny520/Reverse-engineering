package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: Zo */
/* JADX INFO: loaded from: classes.dex */
public final class C1105Zo {

    /* JADX INFO: renamed from: b */
    public static final C1105Zo f3498b = new C1105Zo(new C1186ap(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final C1186ap f3499a;

    public C1105Zo(C1186ap c1186ap) {
        this.f3499a = c1186ap;
    }

    /* JADX INFO: renamed from: a */
    public static C1105Zo m2029a(String str) {
        if (str == null || str.isEmpty()) {
            return f3498b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = AbstractC1062Yo.f3369a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new C1105Zo(new C1186ap(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1105Zo) {
            return this.f3499a.equals(((C1105Zo) obj).f3499a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3499a.f4071a.hashCode();
    }

    public final String toString() {
        return this.f3499a.f4071a.toString();
    }
}
