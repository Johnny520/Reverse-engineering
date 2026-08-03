package p311v4;

import bsh.C0353j;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4477z extends AbstractC4446a {

    /* JADX INFO: renamed from: i */
    public static final C4477z f14826i = new C4477z(new C4451c0("TYPE"), new C4451c0("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: g */
    public final C4451c0 f14827g;

    /* JADX INFO: renamed from: h */
    public final C4451c0 f14828h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4477z(C4451c0 c4451c0, C4451c0 c4451c02) {
        if (c4451c0 == null) {
            C0353j.m1305c("name == null");
            throw null;
        }
        if (c4451c02 == null) {
            C0353j.m1305c("descriptor == null");
            throw null;
        }
        this.f14827g = c4451c0;
        this.f14828h = c4451c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f14827g.mo4901a() + ':' + this.f14828h.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        C4477z c4477z = (C4477z) abstractC4446a;
        int iCompareTo = this.f14827g.compareTo(c4477z.f14827g);
        return iCompareTo != 0 ? iCompareTo : this.f14828h.compareTo(c4477z.f14828h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4477z)) {
            return false;
        }
        C4477z c4477z = (C4477z) obj;
        return this.f14827g.equals(c4477z.f14827g) && this.f14828h.equals(c4477z.f14828h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f14827g.f14760g.hashCode() * 31) ^ this.f14828h.f14760g.hashCode();
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
        return "nat";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final C4683c m8917k() {
        return C4683c.m9182m(this.f14828h.f14760g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "nat{" + mo4901a() + '}';
    }
}
