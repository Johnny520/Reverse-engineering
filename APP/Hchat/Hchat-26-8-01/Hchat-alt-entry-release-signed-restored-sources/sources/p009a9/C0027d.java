package p009a9;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: a9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0027d {

    /* JADX INFO: renamed from: a */
    public CharSequence f83a;

    /* JADX INFO: renamed from: b */
    public C0024a f84b;

    /* JADX INFO: renamed from: c */
    public C0030g f85c;

    /* JADX INFO: renamed from: d */
    public CharSequence f86d;

    /* JADX INFO: renamed from: e */
    public String f87e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0027d(CharSequence charSequence) {
        C0030g c0030g = new C0030g();
        this.f83a = charSequence;
        this.f84b = null;
        this.f85c = c0030g;
        this.f86d = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f87e = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0027d)) {
            return false;
        }
        C0027d c0027d = (C0027d) obj;
        return AbstractC1416l.m3825a(this.f83a, c0027d.f83a) && AbstractC1416l.m3825a(this.f84b, c0027d.f84b) && AbstractC1416l.m3825a(this.f85c, c0027d.f85c) && AbstractC1416l.m3825a(this.f86d, c0027d.f86d) && AbstractC1416l.m3825a(this.f87e, c0027d.f87e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f83a.hashCode() * 31;
        C0024a c0024a = this.f84b;
        return this.f87e.hashCode() + ((this.f86d.hashCode() + ((this.f85c.hashCode() + ((iHashCode + (c0024a == null ? 0 : c0024a.hashCode())) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        CharSequence charSequence = this.f83a;
        C0024a c0024a = this.f84b;
        C0030g c0030g = this.f85c;
        CharSequence charSequence2 = this.f86d;
        String str = this.f87e;
        StringBuilder sb2 = new StringBuilder("State(baseName=");
        sb2.append((Object) charSequence);
        sb2.append(", baseNameStyle=");
        sb2.append(c0024a);
        sb2.append(", title=");
        sb2.append(c0030g);
        sb2.append(", tail=");
        sb2.append((Object) charSequence2);
        sb2.append(", lastRendered=");
        return AbstractC0921a.m2255r(sb2, str, ")");
    }
}
