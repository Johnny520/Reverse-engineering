package fun.box001.internal.dexformat;

/* JADX INFO: renamed from: e.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0027d implements Comparable {

    /* JADX INFO: renamed from: a */
    private final int f89a;

    /* JADX INFO: renamed from: b */
    private final int f90b;

    /* JADX INFO: renamed from: c */
    private final C0026c f91c;

    public C0027d(int r2, int r3, C0026c r4) {
        if (r2 < 0) goto L14;
        if (r3 <= r2) goto L12;
        if (r4.m535f() == true) goto L10;
        this.f89a = r2;
        this.f90b = r3;
        this.f91c = r4;
        return;
    L10:
        throw new IllegalArgumentException("handlers.isMutable()");
    L12:
        throw new IllegalArgumentException("end <= start");
    L14:
        throw new IllegalArgumentException("start < 0");
    }

    /* JADX INFO: renamed from: a */
    public final int m108a(C0027d r5) {
        int r0 = r5.f89a;
        int r2 = this.f89a;
        if (r2 >= r0) goto L6;
        return -1;
    L6:
        if (r2 <= r0) goto L8;
        return 1;
    L8:
        int r02 = this.f90b;
        int r22 = r5.f90b;
        if (r02 >= r22) goto L11;
        return -1;
    L11:
        if (r02 <= r22) goto L14;
        return 1;
    L14:
        return this.f91c.m104F(r5.f91c);
    }

    /* JADX INFO: renamed from: b */
    public final int m109b() {
        return this.f90b;
    }

    /* JADX INFO: renamed from: c */
    public final C0026c m110c() {
        return this.f91c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return m108a((C0027d) r1);
    }

    /* JADX INFO: renamed from: d */
    public final int m111d() {
        return this.f89a;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0027d) == true) goto L5;
        return false;
    L5:
        if (m108a((C0027d) r3) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        int r0 = ((this.f89a * 31) + this.f90b) * 31;
        return this.f91c.hashCode() + r0;
    }
}
