package p182m7;

import okio.C3193a;
import p068eh.AbstractC0921a;
import p152k7.AbstractC2331a;
import p257r7.C3711a;

/* JADX INFO: renamed from: m7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2792e extends C3711a {

    /* JADX INFO: renamed from: p */
    public C2790c f9043p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m6182P() {
        int i9 = this.f12074o - 1;
        C2790c c2790c = null;
        if (i9 >= 0) {
            C2807t c2807t = (C2807t) m5554v(C2807t.class);
            C2791d c2791d = c2807t != null ? c2807t.f9071w : null;
            if (c2791d != null) {
                c2790c = (C2790c) c2791d.m6524Q(i9);
            }
        }
        this.f9043p = c2790c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m6183Q(int i9) {
        if (i9 < -1 || i9 > 65534) {
            C3193a.m6820i(AbstractC0921a.m2250m(i9, "Attribute position ", " out of range, must be between -1 to 65534"));
        } else {
            mo633k(i9 + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6184c() {
        C2790c c2790c = this.f9043p;
        if (c2790c != null && !c2790c.f7659i && AbstractC2331a.m5539s(c2790c.f12076k, 4) >= 0 && c2790c.f7658h != null) {
            m6183Q(c2790c.f7657g);
        } else {
            this.f9043p = null;
            m6183Q(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.C3711a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12074o - 1);
        sb2.append(" (");
        sb2.append(this.f9043p);
        sb2.append(")");
        return sb2.toString();
    }
}
