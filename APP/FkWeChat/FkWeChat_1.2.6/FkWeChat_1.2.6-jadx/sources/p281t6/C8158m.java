package p281t6;

import java.util.Locale;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: t6.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8158m {

    /* JADX INFO: renamed from: a */
    public final String f27279a;

    /* JADX INFO: renamed from: b */
    public final String f27280b;

    /* JADX INFO: renamed from: c */
    public final boolean f27281c;

    public C8158m(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        this.f27279a = str;
        this.f27280b = str2;
        this.f27281c = z10;
    }

    /* JADX INFO: renamed from: a */
    public final String m31637a() {
        return this.f27279a;
    }

    /* JADX INFO: renamed from: b */
    public final String m31638b() {
        return this.f27280b;
    }

    /* JADX INFO: renamed from: c */
    public final String m31639c() {
        return this.f27279a;
    }

    /* JADX INFO: renamed from: d */
    public final String m31640d() {
        return this.f27280b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8158m)) {
            return false;
        }
        C8158m c8158m = (C8158m) obj;
        return AbstractC8611a0.m33061F(c8158m.f27279a, this.f27279a, true) && AbstractC8611a0.m33061F(c8158m.f27280b, this.f27280b, true);
    }

    public int hashCode() {
        String str = this.f27279a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f27280b.toLowerCase(locale);
        lowerCase2.getClass();
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode();
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.f27279a + ", value=" + this.f27280b + ", escapeValue=" + this.f27281c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8158m(String str, String str2) {
        this(str, str2, false);
        str.getClass();
        str2.getClass();
    }
}
