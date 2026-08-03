package gg;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p136j8.C2104o;
import tf.AbstractC4159f;

/* JADX INFO: renamed from: gg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1406b implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4718g = 1;

    /* JADX INFO: renamed from: h */
    public int f4719h;

    /* JADX INFO: renamed from: i */
    public final Object f4720i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1406b(Object[] objArr) {
        objArr.getClass();
        this.f4720i = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4718g) {
            case 0:
                if (this.f4719h < ((Object[]) this.f4720i).length) {
                }
                break;
            default:
                if (this.f4719h < ((AbstractC4159f) this.f4720i).size()) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4718g) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f4720i;
                    int i9 = this.f4719h;
                    this.f4719h = i9 + 1;
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f4719h--;
                    C2104o.m5287l(e6.getMessage());
                    return null;
                }
                break;
            default:
                if (!hasNext()) {
                    C0353j.m1307e();
                } else {
                    AbstractC4159f abstractC4159f = (AbstractC4159f) this.f4720i;
                    int i10 = this.f4719h;
                    this.f4719h = i10 + 1;
                }
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4718g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1406b(AbstractC4159f abstractC4159f) {
        this.f4720i = abstractC4159f;
    }
}
