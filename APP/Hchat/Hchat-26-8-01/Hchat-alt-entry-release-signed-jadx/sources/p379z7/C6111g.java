package p379z7;

import bsh.C0353j;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: z7.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6111g implements Iterator {

    /* JADX INFO: renamed from: g */
    public final Iterator f24661g;

    /* JADX INFO: renamed from: h */
    public final Function f24662h;

    /* JADX INFO: renamed from: i */
    public Object f24663i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6111g(Iterator it, Function function) {
        this.f24661g = it;
        this.f24662h = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m10877a() {
        if (this.f24663i == null) {
            while (true) {
                Iterator it = this.f24661g;
                if (!it.hasNext()) {
                    break;
                }
                Object objApply = this.f24662h.apply(it.next());
                if (objApply != null) {
                    this.f24663i = objApply;
                    break;
                }
            }
        }
        return this.f24663i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return m10877a() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objM10877a = m10877a();
        if (objM10877a != null) {
            this.f24663i = null;
            return objM10877a;
        }
        C0353j.m1307e();
        return null;
    }
}
