package p069f;

import bsh.C0353j;
import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.Map;
import p136j8.C2104o;

/* JADX INFO: renamed from: f.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0926c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: g */
    public int f2900g;

    /* JADX INFO: renamed from: h */
    public int f2901h = -1;

    /* JADX INFO: renamed from: i */
    public boolean f2902i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0930e f2903j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0926c(C0930e c0930e) {
        this.f2903j = c0930e;
        this.f2900g = c0930e.f2912i - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2902i) {
            C2104o.m5276A("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i9 = this.f2901h;
        C0930e c0930e = this.f2903j;
        return AbstractC1416l.m3825a(key, c0930e.m2280h(i9)) && AbstractC1416l.m3825a(entry.getValue(), c0930e.m2284l(this.f2901h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f2902i) {
            return this.f2903j.m2280h(this.f2901h);
        }
        C2104o.m5276A("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2902i) {
            return this.f2903j.m2284l(this.f2901h);
        }
        C2104o.m5276A("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2901h < this.f2900g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2902i) {
            C2104o.m5276A("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i9 = this.f2901h;
        C0930e c0930e = this.f2903j;
        Object objM2280h = c0930e.m2280h(i9);
        Object objM2284l = c0930e.m2284l(this.f2901h);
        return (objM2280h == null ? 0 : objM2280h.hashCode()) ^ (objM2284l != null ? objM2284l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        this.f2901h++;
        this.f2902i = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2902i) {
            throw new IllegalStateException();
        }
        this.f2903j.m2282j(this.f2901h);
        this.f2901h--;
        this.f2900g--;
        this.f2902i = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f2902i) {
            return this.f2903j.m2283k(this.f2901h, obj);
        }
        C2104o.m5276A("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
