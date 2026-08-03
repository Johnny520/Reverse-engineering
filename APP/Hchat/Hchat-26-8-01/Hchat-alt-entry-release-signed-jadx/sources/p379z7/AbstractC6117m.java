package p379z7;

import bsh.C0353j;
import java.util.Iterator;

/* JADX INFO: renamed from: z7.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6117m implements Iterator {

    /* JADX INFO: renamed from: g */
    public final Iterator f24675g;

    /* JADX INFO: renamed from: h */
    public Iterator f24676h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6117m(Iterator it) {
        this.f24675g = it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Iterator m10880a() {
        Iterator it = this.f24676h;
        if (it == null || !it.hasNext()) {
            this.f24676h = null;
            while (true) {
                Iterator it2 = this.f24675g;
                if (!it2.hasNext()) {
                    break;
                }
                Iterator itMo5912b = mo5912b(it2.next());
                if (itMo5912b != null && itMo5912b.hasNext()) {
                    this.f24676h = itMo5912b;
                    break;
                }
            }
        }
        return this.f24676h;
    }

    /* JADX INFO: renamed from: b */
    public abstract Iterator mo5912b(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator itM10880a = m10880a();
        return itM10880a != null && itM10880a.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Iterator itM10880a = m10880a();
        if (itM10880a != null) {
            return itM10880a.next();
        }
        C0353j.m1307e();
        return null;
    }
}
