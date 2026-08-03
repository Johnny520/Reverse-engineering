package p173lh;

import gg.AbstractC1416l;
import java.io.Serializable;
import kh.AbstractC2407b;

/* JADX INFO: renamed from: lh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2567a implements Serializable {

    /* JADX INFO: renamed from: g */
    public final String f8327g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2567a(String str) {
        str.getClass();
        this.f8327g = AbstractC2407b.m5747e(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2567a)) {
            return false;
        }
        return AbstractC1416l.m3825a(this.f8327g, ((C2567a) obj).f8327g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8327g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2407b.m5749g(this.f8327g);
    }
}
