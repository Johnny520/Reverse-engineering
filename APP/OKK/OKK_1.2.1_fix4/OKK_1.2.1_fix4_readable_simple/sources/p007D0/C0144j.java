package p007D0;

/* JADX INFO: renamed from: D0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0144j implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte f337a;

    public /* synthetic */ C0144j(byte r1) {
        this.f337a = r1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        byte r22 = ((C0144j) r2).f337a;
        int r02 = this.f337a & 255;
        int r23 = r22 & 255;
        if (r02 >= r23) goto L5;
        return -1;
    L5:
        if (r02 != r23) goto L7;
        return 0;
    L7:
        return 1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0144j) == false) goto L10;
        byte r32 = ((C0144j) r3).f337a;
        if (this.f337a != r32) goto L11;
        return true;
    L11:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f337a);
    }

    public final String toString() {
        return String.valueOf(this.f337a & 255);
    }
}
