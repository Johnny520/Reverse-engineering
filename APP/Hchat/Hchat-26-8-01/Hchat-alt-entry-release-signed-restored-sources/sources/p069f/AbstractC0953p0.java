package p069f;

import java.util.List;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: f.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0953p0 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f3002a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final C0933f0 f3003b = new C0933f0(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2347a(int i9, List list) {
        int size = list.size();
        if (i9 < 0 || i9 >= size) {
            C3193a.m6820i(AbstractC0921a.m2248k(i9, size, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2348b(List list, int i9, int i10) {
        int size = list.size();
        if (i9 > i10) {
            C2104o.m5294t(AbstractC0921a.m2248k(i9, i10, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
            return;
        }
        if (i9 < 0) {
            C3193a.m6820i(AbstractC0921a.m2250m(i9, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i10 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + size + ')');
    }
}
