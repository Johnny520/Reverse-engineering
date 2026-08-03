package p069m;

/* JADX INFO: renamed from: m.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0986f implements Comparable {

    /* JADX INFO: renamed from: a */
    public C0989i f3500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0987g f3501b;

    public C0986f(C0987g r1) {
        this.f3501b = r1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f3500a.f3507b - ((C0989i) r2).f3507b;
    }

    public final String toString() {
        String r1 = "[ ";
        if (this.f3500a == null) goto L9;
        int r02 = 0;
    L6:
        if (r02 >= 9) goto L9;
        r1 = r1 + this.f3500a.f3513h[r02] + " ";
        r02 = r02 + 1;
    L9:
        return r1 + "] " + this.f3500a;
    }
}
