package p020b5;

import p061e5.C0826a;

/* JADX INFO: renamed from: b5.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0191j implements Comparable {

    /* JADX INFO: renamed from: g */
    public final int f486g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0191j(int i9) {
        this.f486g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC0191j abstractC0191j) {
        int iCompareTo = Integer.valueOf(this.f486g).compareTo(Integer.valueOf(abstractC0191j.f486g));
        return iCompareTo == 0 ? Double.valueOf(mo775b()).compareTo(Double.valueOf(abstractC0191j.mo775b())) : iCompareTo;
    }

    /* JADX INFO: renamed from: b */
    public abstract double mo775b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo776c(C0826a c0826a);
}
