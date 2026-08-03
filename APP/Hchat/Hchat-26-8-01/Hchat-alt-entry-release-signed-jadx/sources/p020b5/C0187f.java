package p020b5;

import java.io.IOException;
import p005a5.C0016a;
import p061e5.C0826a;

/* JADX INFO: renamed from: b5.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0187f extends AbstractC0191j {

    /* JADX INFO: renamed from: h */
    public final String f473h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0187f(C0016a c0016a, int i9, String str) {
        super(i9);
        this.f473h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // p020b5.AbstractC0191j, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(AbstractC0191j abstractC0191j) {
        int iCompareTo = super.compareTo(abstractC0191j);
        if (iCompareTo != 0 || !(abstractC0191j instanceof C0187f)) {
            return iCompareTo;
        }
        return this.f473h.compareTo(((C0187f) abstractC0191j).f473h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: b */
    public double mo775b() {
        return 0.0d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        c0826a.write(58);
        c0826a.write(this.f473h);
        c0826a.m2071C(mo830d());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public int mo830d() {
        return this.f486g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0187f) && compareTo((AbstractC0191j) obj) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f486g;
    }
}
