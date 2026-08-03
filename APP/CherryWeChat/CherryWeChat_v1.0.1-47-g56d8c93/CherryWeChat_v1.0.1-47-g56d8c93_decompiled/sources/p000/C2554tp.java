package p000;

/* JADX INFO: renamed from: tp */
/* JADX INFO: loaded from: classes.dex */
public final class C2554tp extends C2468rp {

    /* JADX INFO: renamed from: d */
    public static final C2554tp f8874d = new C2554tp(1, 0);

    public C2554tp(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // p000.C2468rp
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2554tp)) {
            return false;
        }
        if (isEmpty() && ((C2554tp) obj).isEmpty()) {
            return true;
        }
        C2554tp c2554tp = (C2554tp) obj;
        return this.f8689a == c2554tp.f8689a && this.f8690b == c2554tp.f8690b;
    }

    @Override // p000.C2468rp
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f8689a;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.f8690b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // p000.C2468rp
    public final boolean isEmpty() {
        return this.f8689a > this.f8690b;
    }

    @Override // p000.C2468rp
    public final String toString() {
        return this.f8689a + ".." + this.f8690b;
    }
}
