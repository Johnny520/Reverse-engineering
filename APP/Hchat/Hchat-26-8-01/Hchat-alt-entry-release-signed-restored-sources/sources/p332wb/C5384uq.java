package p332wb;

import gg.AbstractC1416l;
import na.C2922j;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.uq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5384uq {

    /* JADX INFO: renamed from: a */
    public final int f21198a;

    /* JADX INFO: renamed from: b */
    public final C2922j f21199b;

    /* JADX INFO: renamed from: c */
    public final boolean f21200c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5384uq(int i9, C2922j c2922j, boolean z9) {
        c2922j.getClass();
        this.f21198a = i9;
        this.f21199b = c2922j;
        this.f21200c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5384uq)) {
            return false;
        }
        C5384uq c5384uq = (C5384uq) obj;
        return this.f21198a == c5384uq.f21198a && AbstractC1416l.m3825a(this.f21199b, c5384uq.f21199b) && this.f21200c == c5384uq.f21200c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f21200c) + ((this.f21199b.hashCode() + (Integer.hashCode(this.f21198a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RedPacketTemplateEditorRequest(index=");
        sb2.append(this.f21198a);
        sb2.append(", template=");
        sb2.append(this.f21199b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f21200c);
    }
}
