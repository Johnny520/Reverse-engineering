package p311v4;

import bsh.C0353j;

/* JADX INFO: renamed from: v4.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4474w extends AbstractC4457f0 {

    /* JADX INFO: renamed from: g */
    public final C4453d0 f14821g;

    /* JADX INFO: renamed from: h */
    public final C4477z f14822h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4474w(C4453d0 c4453d0, C4477z c4477z) {
        if (c4453d0 == null) {
            C0353j.m1305c("definingClass == null");
            throw null;
        }
        if (c4477z == null) {
            C0353j.m1305c("nat == null");
            throw null;
        }
        this.f14821g = c4453d0;
        this.f14822h = c4477z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f14821g.f14784g.mo4901a() + '.' + this.f14822h.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public int mo8896e(AbstractC4446a abstractC4446a) {
        AbstractC4474w abstractC4474w = (AbstractC4474w) abstractC4446a;
        int iCompareTo = this.f14821g.compareTo(abstractC4474w.f14821g);
        return iCompareTo != 0 ? iCompareTo : this.f14822h.f14827g.compareTo(abstractC4474w.f14822h.f14827g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC4474w abstractC4474w = (AbstractC4474w) obj;
            if (this.f14821g.equals(abstractC4474w.f14821g) && this.f14822h.equals(abstractC4474w.f14822h)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f14821g.hashCode() * 31) ^ this.f14822h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: i */
    public final boolean mo8897i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return mo8898j() + '{' + mo4901a() + '}';
    }
}
