package tf;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: tf.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4157e extends AbstractC4159f implements RandomAccess {

    /* JADX INFO: renamed from: g */
    public final AbstractC4159f f13691g;

    /* JADX INFO: renamed from: h */
    public final int f13692h;

    /* JADX INFO: renamed from: i */
    public final int f13693i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4157e(AbstractC4159f abstractC4159f, int i9, int i10) {
        this.f13691g = abstractC4159f;
        this.f13692h = i9;
        C4153c c4153c = AbstractC4159f.Companion;
        int size = abstractC4159f.size();
        c4153c.getClass();
        C4153c.m8347c(i9, i10, size);
        this.f13693i = i10 - i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        AbstractC4159f.Companion.getClass();
        C4153c.m8345a(i9, this.f13693i);
        return this.f13691g.get(this.f13692h + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        return this.f13693i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final List subList(int i9, int i10) {
        AbstractC4159f.Companion.getClass();
        C4153c.m8347c(i9, i10, this.f13693i);
        int i11 = this.f13692h;
        return new C4157e(this.f13691g, i9 + i11, i11 + i10);
    }
}
