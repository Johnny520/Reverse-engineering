package ac;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: ac.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0065r implements Comparable {

    /* JADX INFO: renamed from: g */
    public int f219g;

    /* JADX INFO: renamed from: h */
    public int f220h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f219g - ((C0065r) obj).f219g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Segment{start=");
        sb2.append(this.f219g);
        sb2.append(", end=");
        return AbstractC3199a.m6841n(sb2, this.f220h, '}');
    }
}
