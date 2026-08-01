package p139j6;

import p024b9.AbstractC1061t;
import p170l6.C4674m;
import p170l6.EnumC4677p;

/* JADX INFO: renamed from: j6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3607d {

    /* JADX INFO: renamed from: a */
    public final String f10022a;

    /* JADX INFO: renamed from: b */
    public final C4674m f10023b;

    /* JADX INFO: renamed from: c */
    public final EnumC4677p f10024c;

    public C3607d(String str, C4674m c4674m, EnumC4677p enumC4677p) {
        str.getClass();
        c4674m.getClass();
        enumC4677p.getClass();
        this.f10022a = str;
        this.f10023b = c4674m;
        this.f10024c = enumC4677p;
    }

    /* JADX INFO: renamed from: a */
    public final String m13491a() {
        return this.f10022a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC4677p m13492b() {
        return this.f10024c;
    }

    /* JADX INFO: renamed from: c */
    public final C4674m m13493c() {
        return this.f10023b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3607d)) {
            return false;
        }
        C3607d c3607d = (C3607d) obj;
        return AbstractC1061t.m3842c(this.f10022a, c3607d.f10022a) && AbstractC1061t.m3842c(this.f10023b, c3607d.f10023b) && this.f10024c == c3607d.f10024c;
    }

    public int hashCode() {
        return (((this.f10022a.hashCode() * 31) + this.f10023b.hashCode()) * 31) + this.f10024c.hashCode();
    }

    public String toString() {
        return "CodeSnapshot(code=" + this.f10022a + ", structure=" + this.f10023b + ", language=" + this.f10024c + ")";
    }
}
