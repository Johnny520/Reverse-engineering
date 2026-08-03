package p177m2;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2773q {

    /* JADX INFO: renamed from: a */
    public final AbstractC2772p f9008a;

    /* JADX INFO: renamed from: b */
    public final C2767k f9009b;

    /* JADX INFO: renamed from: c */
    public final int f9010c;

    /* JADX INFO: renamed from: d */
    public final int f9011d;

    /* JADX INFO: renamed from: e */
    public final Object f9012e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2773q(AbstractC2772p abstractC2772p, C2767k c2767k, int i9, int i10, Object obj) {
        this.f9008a = abstractC2772p;
        this.f9009b = c2767k;
        this.f9010c = i9;
        this.f9011d = i10;
        this.f9012e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2773q)) {
            return false;
        }
        C2773q c2773q = (C2773q) obj;
        return AbstractC1416l.m3825a(this.f9008a, c2773q.f9008a) && AbstractC1416l.m3825a(this.f9009b, c2773q.f9009b) && this.f9010c == c2773q.f9010c && this.f9011d == c2773q.f9011d && AbstractC1416l.m3825a(this.f9012e, c2773q.f9012e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        AbstractC2772p abstractC2772p = this.f9008a;
        int iM2242e = AbstractC0921a.m2242e(this.f9011d, AbstractC0921a.m2242e(this.f9010c, (((abstractC2772p == null ? 0 : abstractC2772p.hashCode()) * 31) + this.f9009b.f9003g) * 31, 31), 31);
        Object obj = this.f9012e;
        return iM2242e + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f9008a);
        sb2.append(", fontWeight=");
        sb2.append(this.f9009b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i9 = this.f9010c;
        sb2.append((Object) (i9 == 0 ? "Normal" : i9 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i10 = this.f9011d;
        if (i10 == 0) {
            str = "None";
        } else if (i10 == 1) {
            str = "Weight";
        } else if (i10 == 2) {
            str = "Style";
        } else if (i10 == 65535) {
            str = "All";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f9012e);
        sb2.append(')');
        return sb2.toString();
    }
}
