package p247qe;

import java.util.List;
import p246qd.AbstractC3506j;
import p246qd.C3515s;

/* JADX INFO: renamed from: qe.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3536s {

    /* JADX INFO: renamed from: a */
    public final C3515s f11502a;

    /* JADX INFO: renamed from: b */
    public boolean f11503b;

    /* JADX INFO: renamed from: c */
    public AbstractC3506j f11504c;

    /* JADX INFO: renamed from: d */
    public List f11505d;

    /* JADX INFO: renamed from: e */
    public int f11506e = -1;

    /* JADX INFO: renamed from: f */
    public List f11507f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3536s(C3515s c3515s) {
        this.f11502a = c3515s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m7447a() {
        if (this.f11503b) {
            return false;
        }
        int size = (this.f11506e + 1) % this.f11505d.size();
        this.f11506e = size;
        this.f11504c = (AbstractC3506j) this.f11505d.get(size);
        return this.f11506e == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11502a.m7410o());
        if (this.f11503b) {
            sb2.append(", resolved type: ");
            sb2.append(this.f11504c);
        } else {
            sb2.append(", currentType=");
            sb2.append(this.f11504c);
            sb2.append(", candidateTypes=");
            sb2.append(this.f11505d);
            sb2.append(", constraints=");
            sb2.append(this.f11507f);
        }
        return sb2.toString();
    }
}
