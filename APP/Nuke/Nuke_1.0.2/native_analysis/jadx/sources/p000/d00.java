package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 {

    /* JADX INFO: renamed from: a */
    public final C0624qm f1798a;

    /* JADX INFO: renamed from: b */
    public final C0469mp f1799b;

    public d00(C0624qm c0624qm, C0469mp c0469mp) {
        this.f1798a = c0624qm;
        this.f1799b = c0469mp;
    }

    public final String toString() {
        C0469mp c0469mp = this.f1799b;
        if (c0469mp.f6743l.mo15o(f20.f2746i) != null) {
            c80.m664g();
            return null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        xe1.m6127j(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.f1798a.mo6a());
        sb.append(", continuation=");
        sb.append(c0469mp);
        sb.append(')');
        return sb.toString();
    }
}
