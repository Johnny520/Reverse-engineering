package p351xe;

import java.util.Iterator;
import java.util.List;
import p302ud.C4305a;
import p302ud.C4320p;

/* JADX INFO: renamed from: xe.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5790k implements Iterable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m10470a(List list, C4320p c4320p, int i9) {
        int size = list.size();
        while (i9 < size) {
            if (list.get(i9) == c4320p) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m10471b(C4305a c4305a, C4320p c4320p) {
        Iterator it = c4305a.f14351l.iterator();
        while (it.hasNext()) {
            if (((C4320p) it.next()) == c4320p) {
                it.remove();
                return;
            }
        }
    }
}
