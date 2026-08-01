package p227r;

import com.bumptech.glide.AbstractC1926h;
import p117X2.AbstractC1665j;
import p160f3.AbstractC2159s;
import p160f3.C2135g;
import p266y.C3476f;

/* JADX INFO: renamed from: r.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2988g {

    /* JADX INFO: renamed from: a */
    public final C3476f f9458a;

    /* JADX INFO: renamed from: b */
    public final C2135g f9459b;

    public C2988g(C3476f c3476f, C2135g c2135g) {
        this.f9458a = c3476f;
        this.f9459b = c2135g;
    }

    public final String toString() {
        C2135g c2135g = this.f9459b;
        if (c2135g.f7078h.mo1166C(AbstractC2159s.f7104e) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC1926h.m3565h(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC1665j.m2984d(string, "toString(...)");
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.f9458a.mo6a());
        sb.append(", continuation=");
        sb.append(c2135g);
        sb.append(')');
        return sb.toString();
    }
}
