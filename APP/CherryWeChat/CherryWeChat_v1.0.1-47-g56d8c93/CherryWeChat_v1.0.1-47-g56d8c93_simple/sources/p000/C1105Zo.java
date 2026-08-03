package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: Zo */
/* JADX INFO: loaded from: classes.dex */
public final class C1105Zo {

    /* JADX INFO: renamed from: b */
    public static final C1105Zo f3498b = null;

    /* JADX INFO: renamed from: a */
    public final C1186ap f3499a;

    static {
        f3498b = new C1105Zo(new C1186ap(new LocaleList(new Locale[0])));
    }

    public C1105Zo(C1186ap r1) {
        this.f3499a = r1;
    }

    /* JADX INFO: renamed from: a */
    public static C1105Zo m2029a(String r5) {
        if (r5 == null) goto L12;
        if (r5.isEmpty() == true) goto L12;
        String[] r52 = r5.split(",", -1);
        int r0 = r52.length;
        Locale[] r1 = new Locale[r0];
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L10;
        String r3 = r52[r2];
        int r4 = AbstractC1062Yo.f3369a;
        r1[r2] = Locale.forLanguageTag(r3);
        r2 = r2 + 1;
        goto L7
    L10:
        return new C1105Zo(new C1186ap(new LocaleList(r1)));
    L12:
        return f3498b;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1105Zo) == false) goto L8;
        C1186ap r22 = ((C1105Zo) r2).f3499a;
        if (this.f3499a.equals(r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.f3499a.f4071a.hashCode();
    }

    public final String toString() {
        return this.f3499a.f4071a.toString();
    }
}
