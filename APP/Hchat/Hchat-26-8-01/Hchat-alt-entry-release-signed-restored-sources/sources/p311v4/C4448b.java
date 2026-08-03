package p311v4;

import p282t4.C4114a;

/* JADX INFO: renamed from: v4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4448b extends AbstractC4446a {

    /* JADX INFO: renamed from: g */
    public final C4114a f14758g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4448b(C4114a c4114a) {
        c4114a.m10856k();
        this.f14758g = c4114a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f14758g.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        return this.f14758g.compareTo(((C4448b) abstractC4446a).f14758g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4448b)) {
            return false;
        }
        return this.f14758g.equals(((C4448b) obj).f14758g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14758g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: i */
    public final boolean mo8897i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "annotation";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14758g.mo4901a();
    }
}
