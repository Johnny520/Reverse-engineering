package p118X3;

import java.util.ArrayList;
import java.util.Set;
import p049I2.AbstractC0797o;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: X3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1696f {

    /* JADX INFO: renamed from: c */
    public static final C1696f f5802c = new C1696f(AbstractC0973m.m2028i0(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set f5803a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0797o f5804b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1696f(Set set, AbstractC0797o abstractC0797o) {
        this.f5803a = set;
        this.f5804b = abstractC0797o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1696f)) {
            return false;
        }
        C1696f c1696f = (C1696f) obj;
        return AbstractC1665j.m2981a(c1696f.f5803a, this.f5803a) && AbstractC1665j.m2981a(c1696f.f5804b, this.f5804b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f5803a.hashCode() + 1517) * 41;
        AbstractC0797o abstractC0797o = this.f5804b;
        return iHashCode + (abstractC0797o != null ? abstractC0797o.hashCode() : 0);
    }
}
