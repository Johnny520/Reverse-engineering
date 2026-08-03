package p000;

/* JADX INFO: renamed from: tp */
/* JADX INFO: loaded from: classes.dex */
public final class C2554tp extends C2468rp {

    /* JADX INFO: renamed from: d */
    public static final C2554tp f8874d = null;

    static {
        f8874d = new C2554tp(1, 0);
    }

    public C2554tp(long r8, long r10) {
        super(r8, r10, 1);
    }

    @Override // p000.C2468rp
    public final boolean equals(Object r5) {
        if ((r5 instanceof C2554tp) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C2554tp r52 = (C2554tp) r5;
        long r0 = r52.f8689a;
        if (this.f8689a == r0) goto L11;
        return false;
    L11:
        if (this.f8690b != r52.f8690b) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((C2554tp) r5).isEmpty() == false) goto L8;
        return true;
    }

    @Override // p000.C2468rp
    public final int hashCode() {
        if (isEmpty() == false) goto L6;
        return -1;
    L6:
        long r2 = this.f8689a;
        long r0 = ((long) 31) * (r2 ^ (r2 >>> 32));
        long r22 = this.f8690b;
        return (int) (r0 + (r22 ^ (r22 >>> 32)));
    }

    @Override // p000.C2468rp
    public final boolean isEmpty() {
        if (this.f8689a <= this.f8690b) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.C2468rp
    public final String toString() {
        return this.f8689a + ".." + this.f8690b;
    }
}
