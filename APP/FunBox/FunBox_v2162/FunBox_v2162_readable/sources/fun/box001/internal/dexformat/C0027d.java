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

    public C0027d(int i2, int i3, C0026c c0026c) {
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c0026c.m535f()) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f89a = i2;
        this.f90b = i3;
        this.f91c = c0026c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0027d c0027d) {
        int i2 = c0027d.f89a;
        int i3 = this.f89a;
        if (i3 < i2) {
            return -1;
        }
        if (i3 > i2) {
            return 1;
        }
        int i4 = this.f90b;
        int i5 = c0027d.f90b;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        return this.f91c.compareTo(c0027d.f91c);
    }

    /* JADX INFO: renamed from: b */
    public final int m109b() {
        return this.f90b;
    }

    /* JADX INFO: renamed from: c */
    public final C0026c m110c() {
        return this.f91c;
    }

    /* JADX INFO: renamed from: d */
    public final int m111d() {
        return this.f89a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0027d) && compareTo((C0027d) obj) == 0;
    }

    public final int hashCode() {
        return this.f91c.hashCode() + (((this.f89a * 31) + this.f90b) * 31);
    }
}
