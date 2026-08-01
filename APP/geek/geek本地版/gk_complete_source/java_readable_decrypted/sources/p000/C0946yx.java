package p000;

/* JADX INFO: renamed from: yx */
/* JADX INFO: loaded from: classes.dex */
public final class C0946yx implements Comparable {

    /* JADX INFO: renamed from: a */
    public a40 f5410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0983zx f5411b;

    public C0946yx(C0983zx c0983zx) {
        this.f5411b = c0983zx;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5410a.f29b - ((a40) obj).f29b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f5410a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.f5410a.f35h[i] + " ";
            }
        }
        return str + "] " + this.f5410a;
    }
}
