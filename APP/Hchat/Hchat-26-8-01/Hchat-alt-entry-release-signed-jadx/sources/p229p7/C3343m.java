package p229p7;

import p136j8.AbstractC2091b;
import p257r7.C3716f;

/* JADX INFO: renamed from: p7.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3343m extends C3331a {

    /* JADX INFO: renamed from: r */
    public final C3716f f10758r;

    /* JADX INFO: renamed from: s */
    public final C3716f f10759s;

    /* JADX INFO: renamed from: t */
    public final int f10760t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3343m(int i9) {
        super(AbstractC2091b.m5156c(i9));
        this.f10760t = i9;
        C3716f c3716f = new C3716f(false);
        this.f10758r = c3716f;
        C3716f c3716f2 = new C3716f(-1);
        this.f10759s = c3716f2;
        m6539P(c3716f);
        m6539P(c3716f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229p7.C3331a
    public final String toString() {
        if (m7051Q() != this.f10760t) {
            return super.toString();
        }
        return C3343m.class.getSimpleName() + " {lineNumber=" + this.f10758r + ", commentReference=" + this.f10759s + '}';
    }
}
