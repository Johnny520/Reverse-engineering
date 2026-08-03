package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.code.C0191u;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0025b implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0191u f86a;

    /* JADX INFO: renamed from: b */
    private final int f87b;

    public C0025b(C0191u c0191u, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f87b = i2;
        this.f86a = c0191u;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0025b c0025b) {
        int i2 = c0025b.f87b;
        int i3 = this.f87b;
        if (i3 < i2) {
            return -1;
        }
        if (i3 > i2) {
            return 1;
        }
        return this.f86a.compareTo(c0025b.f86a);
    }

    /* JADX INFO: renamed from: b */
    public final C0191u m102b() {
        return this.f86a;
    }

    /* JADX INFO: renamed from: c */
    public final int m103c() {
        return this.f87b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0025b) && compareTo((C0025b) obj) == 0;
    }

    public final int hashCode() {
        return this.f86a.hashCode() + (this.f87b * 31);
    }
}
