package p183m6;

/* JADX INFO: renamed from: m6.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5054x implements Comparable {

    /* JADX INFO: renamed from: q */
    public int f15365q;

    /* JADX INFO: renamed from: r */
    public int f15366r;

    public C5054x(int i10, int i11) {
        this.f15365q = i10;
        this.f15366r = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5054x c5054x) {
        return this.f15365q - c5054x.f15365q;
    }

    public String toString() {
        return "Segment{start=" + this.f15365q + ", end=" + this.f15366r + '}';
    }
}
