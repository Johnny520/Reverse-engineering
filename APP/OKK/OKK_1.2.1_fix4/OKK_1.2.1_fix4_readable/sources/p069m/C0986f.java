package p069m;

/* JADX INFO: renamed from: m.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0986f implements Comparable {

    /* JADX INFO: renamed from: a */
    public C0989i f3500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0987g f3501b;

    public C0986f(C0987g c0987g) {
        this.f3501b = c0987g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3500a.f3507b - ((C0989i) obj).f3507b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f3500a != null) {
            for (int i2 = 0; i2 < 9; i2++) {
                str = str + this.f3500a.f3513h[i2] + " ";
            }
        }
        return str + "] " + this.f3500a;
    }
}
