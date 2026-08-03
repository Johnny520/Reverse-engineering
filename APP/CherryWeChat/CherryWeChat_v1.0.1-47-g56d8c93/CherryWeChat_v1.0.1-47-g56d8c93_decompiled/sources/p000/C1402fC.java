package p000;

/* JADX INFO: renamed from: fC */
/* JADX INFO: loaded from: classes.dex */
public final class C1402fC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f4976a;

    public /* synthetic */ C1402fC(int i) {
        this.f4976a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC0585Nj.m1139g(this.f4976a ^ Integer.MIN_VALUE, ((C1402fC) obj).f4976a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1402fC) {
            return this.f4976a == ((C1402fC) obj).f4976a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4976a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f4976a) & 4294967295L);
    }
}
