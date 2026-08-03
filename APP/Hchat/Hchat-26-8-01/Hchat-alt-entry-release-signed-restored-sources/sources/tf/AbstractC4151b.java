package tf;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p136j8.C2104o;

/* JADX INFO: renamed from: tf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4151b implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public int f13681g;

    /* JADX INFO: renamed from: h */
    public Object f13682h;

    /* JADX INFO: renamed from: a */
    public abstract void mo2018a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.f13681g;
        if (i9 == 0) {
            this.f13681g = 3;
            mo2018a();
            return this.f13681g == 1;
        }
        if (i9 == 1) {
            return true;
        }
        if (i9 == 2) {
            return false;
        }
        C2104o.m5294t("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.f13681g;
        if (i9 == 1) {
            this.f13681g = 0;
            return this.f13682h;
        }
        if (i9 != 2) {
            this.f13681g = 3;
            mo2018a();
            if (this.f13681g == 1) {
                this.f13681g = 0;
                return this.f13682h;
            }
        }
        C0353j.m1307e();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
