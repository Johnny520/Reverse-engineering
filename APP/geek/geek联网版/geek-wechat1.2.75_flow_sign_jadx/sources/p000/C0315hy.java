package p000;

/* JADX INFO: renamed from: hy */
/* JADX INFO: loaded from: classes.dex */
public final class C0315hy implements Comparable {

    /* JADX INFO: renamed from: a */
    public h40 f2287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0354iy f2288b;

    public C0315hy(C0354iy c0354iy) {
        this.f2288b = c0354iy;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2287a.f2101b - ((h40) obj).f2101b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f2287a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.f2287a.f2107h[i] + " ";
            }
        }
        return str + "] " + this.f2287a;
    }
}
