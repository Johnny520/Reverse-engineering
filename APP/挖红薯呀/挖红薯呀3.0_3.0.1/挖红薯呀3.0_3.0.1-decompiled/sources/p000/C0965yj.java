package p000;

/* JADX INFO: renamed from: yj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0965yj {

    /* JADX INFO: renamed from: a */
    public final C0203fb f7650a;

    /* JADX INFO: renamed from: b */
    public final C0884wc f7651b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0965yj(C0203fb c0203fb, C0884wc c0884wc) {
        this.f7650a = c0203fb;
        this.f7651b = c0884wc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C0884wc c0884wc = this.f7651b;
        if (c0884wc.f7077h.mo64l(AbstractC0806uk.f6249e) != null) {
            C0921xc.m5123d();
            return null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        p30.m3007q(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.f7650a.invoke());
        sb.append(", continuation=");
        sb.append(c0884wc);
        sb.append(')');
        return sb.toString();
    }
}
