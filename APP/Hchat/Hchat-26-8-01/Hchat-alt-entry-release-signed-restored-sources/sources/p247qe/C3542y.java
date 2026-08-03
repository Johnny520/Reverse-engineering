package p247qe;

import p025bc.AbstractC0255e;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;

/* JADX INFO: renamed from: qe.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3542y implements Comparable {

    /* JADX INFO: renamed from: g */
    public final int f11521g;

    /* JADX INFO: renamed from: h */
    public final AbstractC3508l f11522h;

    /* JADX INFO: renamed from: i */
    public final AbstractC3506j f11523i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3542y(int i9, AbstractC3508l abstractC3508l, AbstractC3506j abstractC3506j) {
        this.f11521g = i9;
        this.f11522h = abstractC3508l;
        this.f11523i = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11521g, ((C3542y) obj).f11521g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f11523i);
        AbstractC3508l abstractC3508l = this.f11522h;
        return AbstractC0255e.m1033v(strValueOf, " -> ", abstractC3508l.mo7387X(), " in ", String.valueOf(abstractC3508l.f11420j));
    }
}
