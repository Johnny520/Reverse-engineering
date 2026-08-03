package p159l0;

import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2420b {

    /* JADX INFO: renamed from: a */
    public int f7923a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2420b(int i9) {
        this.f7923a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m5756a() {
        return this.f7923a != Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return AbstractC2091b.m5163j(sb2, this.f7923a, " }");
    }
}
