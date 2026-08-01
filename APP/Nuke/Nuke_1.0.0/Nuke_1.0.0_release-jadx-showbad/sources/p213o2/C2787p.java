package p213o2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2787p extends AbstractC2788q implements Iterable {

    /* JADX INFO: renamed from: d */
    public final ArrayList f8816d = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2787p) && ((C2787p) obj).f8816d.equals(this.f8816d);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8816d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8816d.iterator();
    }
}
