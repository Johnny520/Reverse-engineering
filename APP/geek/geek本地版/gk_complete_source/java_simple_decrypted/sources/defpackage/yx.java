package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx implements Comparable {
    public a40 a;
    public final /* synthetic */ zx b;

    public yx(zx r1) {
        this.b = r1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.a.b - ((a40) r2).b;
    }

    public final String toString() {
        String r1 = "[ ";
        if (this.a == null) goto L9;
        int r0 = 0;
    L6:
        if (r0 >= 9) goto L9;
        r1 = r1 + this.a.h[r0] + " ";
        r0 = r0 + 1;
    L9:
        return r1 + "] " + this.a;
    }
}
