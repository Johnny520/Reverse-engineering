package p332wb;

import gg.AbstractC1416l;
import na.C2921i;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.hq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4957hq {

    /* JADX INFO: renamed from: a */
    public final int f17731a;

    /* JADX INFO: renamed from: b */
    public final C2921i f17732b;

    /* JADX INFO: renamed from: c */
    public final boolean f17733c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4957hq(int i9, C2921i c2921i, boolean z9) {
        c2921i.getClass();
        this.f17731a = i9;
        this.f17732b = c2921i;
        this.f17733c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4957hq)) {
            return false;
        }
        C4957hq c4957hq = (C4957hq) obj;
        return this.f17731a == c4957hq.f17731a && AbstractC1416l.m3825a(this.f17732b, c4957hq.f17732b) && this.f17733c == c4957hq.f17733c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f17733c) + ((this.f17732b.hashCode() + (Integer.hashCode(this.f17731a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RedPacketBindingEditorRequest(index=");
        sb2.append(this.f17731a);
        sb2.append(", binding=");
        sb2.append(this.f17732b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f17733c);
    }
}
