package p110W0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: W0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1593r {

    /* JADX INFO: renamed from: a */
    public final AbstractC1592q f5515a;

    /* JADX INFO: renamed from: b */
    public final C1587l f5516b;

    /* JADX INFO: renamed from: c */
    public final int f5517c;

    /* JADX INFO: renamed from: d */
    public final int f5518d;

    /* JADX INFO: renamed from: e */
    public final Object f5519e;

    public C1593r(AbstractC1592q abstractC1592q, C1587l c1587l, int i5, int i6, Object obj) {
        this.f5515a = abstractC1592q;
        this.f5516b = c1587l;
        this.f5517c = i5;
        this.f5518d = i6;
        this.f5519e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1593r)) {
            return false;
        }
        C1593r c1593r = (C1593r) obj;
        return AbstractC1665j.m2981a(this.f5515a, c1593r.f5515a) && AbstractC1665j.m2981a(this.f5516b, c1593r.f5516b) && this.f5517c == c1593r.f5517c && this.f5518d == c1593r.f5518d && AbstractC1665j.m2981a(this.f5519e, c1593r.f5519e);
    }

    public final int hashCode() {
        AbstractC1592q abstractC1592q = this.f5515a;
        int iM391b = AbstractC0231b.m391b(this.f5518d, AbstractC0231b.m391b(this.f5517c, (((abstractC1592q == null ? 0 : abstractC1592q.hashCode()) * 31) + this.f5516b.f5507d) * 31, 31), 31);
        Object obj = this.f5519e;
        return iM391b + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f5515a);
        sb.append(", fontWeight=");
        sb.append(this.f5516b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i5 = this.f5517c;
        sb.append((Object) (i5 == 0 ? "Normal" : i5 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i6 = this.f5518d;
        if (i6 == 0) {
            str = "None";
        } else if (i6 == 1) {
            str = "Weight";
        } else if (i6 == 2) {
            str = "Style";
        } else if (i6 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f5519e);
        sb.append(')');
        return sb.toString();
    }
}
