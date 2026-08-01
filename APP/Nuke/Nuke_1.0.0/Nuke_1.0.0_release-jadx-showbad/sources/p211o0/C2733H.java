package p211o0;

import com.bumptech.glide.AbstractC1923e;
import p117X2.AbstractC1665j;
import p204n0.C2684c;
import p204n0.C2685d;

/* JADX INFO: renamed from: o0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C2733H extends AbstractC2767z {

    /* JADX INFO: renamed from: f */
    public final C2685d f8678f;

    /* JADX INFO: renamed from: g */
    public final C2750i f8679g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2733H(C2685d c2685d) {
        C2750i c2750iM4885a;
        this.f8678f = c2685d;
        if (AbstractC1923e.m3451K(c2685d)) {
            c2750iM4885a = null;
        } else {
            c2750iM4885a = AbstractC2752k.m4885a();
            C2750i.m4878b(c2750iM4885a, c2685d);
        }
        this.f8679g = c2750iM4885a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2733H) {
            return AbstractC1665j.m2981a(this.f8678f, ((C2733H) obj).f8678f);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8678f.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p211o0.AbstractC2767z
    /* JADX INFO: renamed from: k */
    public final C2684c mo4788k() {
        C2685d c2685d = this.f8678f;
        return new C2684c(c2685d.f8562a, c2685d.f8563b, c2685d.f8564c, c2685d.f8565d);
    }
}
