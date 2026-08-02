package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fg implements Iterator, Map.Entry {
    public int h;
    public int i = -1;
    public boolean j;
    public final /* synthetic */ hg k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fg(hg hgVar) {
        this.k = hgVar;
        this.h = hgVar.j - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.j) {
            s.l("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.i;
            hg hgVar = this.k;
            if (t11.l(key, hgVar.f(i)) && t11.l(entry.getValue(), hgVar.j(this.i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.j) {
            return this.k.f(this.i);
        }
        s.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.j) {
            return this.k.j(this.i);
        }
        s.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.j) {
            s.l("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.i;
        hg hgVar = this.k;
        Object objF = hgVar.f(i);
        Object objJ = hgVar.j(this.i);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            um2.b();
            return null;
        }
        this.i++;
        this.j = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        this.k.h(this.i);
        this.i--;
        this.h--;
        this.j = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.j) {
            return this.k.i(this.i, obj);
        }
        s.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
