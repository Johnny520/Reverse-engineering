package p233pd;

import p302ud.C4320p;
import p351xe.AbstractC5792m;
import tc.C4144a;

/* JADX INFO: renamed from: pd.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3407r extends C4320p {

    /* JADX INFO: renamed from: o */
    public final int f11010o;

    /* JADX INFO: renamed from: p */
    public final int[] f11011p;

    /* JADX INFO: renamed from: q */
    public final int[] f11012q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3407r(C4144a c4144a) {
        super(EnumC3400k.f10994x, 0);
        this.f11010o = c4144a.f13659a;
        this.f11011p = c4144a.f13660b;
        this.f11012q = c4144a.f13661c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("switch-data {");
        for (int i9 = 0; i9 < this.f11010o; i9++) {
            sb2.append(this.f11011p[i9]);
            sb2.append("->");
            sb2.append(AbstractC5792m.m10487d(this.f11012q[i9]));
            sb2.append(", ");
        }
        sb2.append('}');
        m8677K(sb2);
        return sb2.toString();
    }
}
