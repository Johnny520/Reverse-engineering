package p000;

/* JADX INFO: renamed from: fC */
/* JADX INFO: loaded from: classes.dex */
public final class C1402fC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f4976a;

    public /* synthetic */ C1402fC(int r1) {
        this.f4976a = r1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        int r32 = ((C1402fC) r3).f4976a;
        return AbstractC0585Nj.m1139g(this.f4976a ^ Integer.MIN_VALUE, r32 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1402fC) == false) goto L11;
        int r22 = ((C1402fC) r2).f4976a;
        if (this.f4976a == r22) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4976a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f4976a) & 4294967295L);
    }
}
