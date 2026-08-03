package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.code.C0191u;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0025b implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0191u f86a;

    /* JADX INFO: renamed from: b */
    private final int f87b;

    public C0025b(C0191u r1, int r2) {
        if (r2 < 0) goto L7;
        this.f87b = r2;
        this.f86a = r1;
        return;
    L7:
        throw new IllegalArgumentException("handler < 0");
    }

    /* JADX INFO: renamed from: a */
    public final int m101a(C0025b r3) {
        int r0 = r3.f87b;
        int r1 = this.f87b;
        if (r1 >= r0) goto L6;
        return -1;
    L6:
        if (r1 <= r0) goto L10;
        return 1;
    L10:
        return this.f86a.m425b(r3.f86a);
    }

    /* JADX INFO: renamed from: b */
    public final C0191u m102b() {
        return this.f86a;
    }

    /* JADX INFO: renamed from: c */
    public final int m103c() {
        return this.f87b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return m101a((C0025b) r1);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0025b) == true) goto L5;
        return false;
    L5:
        if (m101a((C0025b) r3) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f87b * 31;
        return this.f86a.hashCode() + r0;
    }
}
