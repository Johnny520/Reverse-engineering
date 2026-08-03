package p182m7;

import java.io.IOException;
import p229p7.C3332b;
import p241q7.C3445b;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: m7.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2800m extends AbstractC2802o implements Comparable {

    /* JADX INFO: renamed from: q */
    public C2808u f9058q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2800m() {
        super(6, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a, p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        c3445b.getClass();
        if (C3332b.m7054T(c3445b).f10723o.f12083n < 8) {
            m5908T(c3445b);
        } else {
            super.mo1893B(c3445b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2800m c2800m = (C2800m) obj;
        if (c2800m == this) {
            return 0;
        }
        return AbstractC5999a.m10742e(c2800m.f9058q.f7657g, this.f9058q.f7657g);
    }
}
