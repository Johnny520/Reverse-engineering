package p311v4;

import java.util.ArrayList;
import p025bc.AbstractC0255e;
import p326w4.C4681a;

/* JADX INFO: renamed from: v4.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4468q extends AbstractC4446a {

    /* JADX INFO: renamed from: g */
    public final int f14810g;

    /* JADX INFO: renamed from: h */
    public final C4477z f14811h;

    /* JADX INFO: renamed from: i */
    public final C4681a f14812i;

    /* JADX INFO: renamed from: j */
    public C4453d0 f14813j;

    /* JADX INFO: renamed from: k */
    public C4459h f14814k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f14815l = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4468q(int i9, C4477z c4477z) {
        this.f14810g = i9;
        this.f14811h = c4477z;
        this.f14812i = C4681a.m9173b(c4477z.f14828h.mo4901a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        C4453d0 c4453d0 = this.f14813j;
        StringBuilder sbM1026o = AbstractC0255e.m1026o("InvokeDynamic(", c4453d0 != null ? c4453d0.f14784g.mo4901a() : "Unknown", ":");
        sbM1026o.append(this.f14810g);
        sbM1026o.append(", ");
        sbM1026o.append(this.f14811h.mo4901a());
        sbM1026o.append(")");
        return sbM1026o.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        C4468q c4468q = (C4468q) abstractC4446a;
        int iCompare = Integer.compare(this.f14810g, c4468q.f14810g);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f14811h.compareTo(c4468q.f14811h);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f14813j.compareTo(c4468q.f14813j);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f14814k.compareTo(c4468q.f14814k);
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
        return "InvokeDynamic";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return mo4901a();
    }
}
