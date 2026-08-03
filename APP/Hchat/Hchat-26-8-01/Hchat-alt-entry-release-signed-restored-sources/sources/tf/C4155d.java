package tf;

import bsh.C0353j;
import gg.C1406b;
import java.util.ListIterator;

/* JADX INFO: renamed from: tf.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4155d extends C1406b implements ListIterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC4159f f13690j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4155d(AbstractC4159f abstractC4159f, int i9) {
        super(abstractC4159f);
        this.f13690j = abstractC4159f;
        C4153c c4153c = AbstractC4159f.Companion;
        int size = abstractC4159f.size();
        c4153c.getClass();
        C4153c.m8346b(i9, size);
        this.f4719h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4719h > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4719h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f4719h - 1;
        this.f4719h = i9;
        return this.f13690j.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4719h - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
