package p188n0;

import be.AbstractC0283h;
import java.util.List;
import p202o0.AbstractC3031c;
import tf.AbstractC4159f;

/* JADX INFO: renamed from: n0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2861a extends AbstractC4159f {

    /* JADX INFO: renamed from: g */
    public final AbstractC3031c f9254g;

    /* JADX INFO: renamed from: h */
    public final int f9255h;

    /* JADX INFO: renamed from: i */
    public final int f9256i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2861a(AbstractC3031c abstractC3031c, int i9, int i10) {
        this.f9254g = abstractC3031c;
        this.f9255h = i9;
        AbstractC0283h.m1175o(i9, i10, abstractC3031c.size());
        this.f9256i = i10 - i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        AbstractC0283h.m1171m(i9, this.f9256i);
        return this.f9254g.get(this.f9255h + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        return this.f9256i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final List subList(int i9, int i10) {
        AbstractC0283h.m1175o(i9, i10, this.f9256i);
        int i11 = this.f9255h;
        return new C2861a(this.f9254g, i9 + i11, i11 + i10);
    }
}
