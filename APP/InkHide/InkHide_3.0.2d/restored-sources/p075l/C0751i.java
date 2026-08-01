package p075l;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0751i implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f2545a;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0743a f2548d;

    /* JADX INFO: renamed from: c */
    public boolean f2547c = false;

    /* JADX INFO: renamed from: b */
    public int f2546b = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0751i(C0743a c0743a) {
        this.f2548d = c0743a;
        this.f2545a = c0743a.m1396d() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2547c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f2546b;
        C0743a c0743a = this.f2548d;
        Object objM1394b = c0743a.m1394b(i2, 0);
        if (key != objM1394b && (key == null || !key.equals(objM1394b))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM1394b2 = c0743a.m1394b(this.f2546b, 1);
        return value == objM1394b2 || (value != null && value.equals(objM1394b2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f2547c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f2548d.m1394b(this.f2546b, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f2547c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f2548d.m1394b(this.f2546b, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2546b < this.f2545a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2547c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f2546b;
        C0743a c0743a = this.f2548d;
        Object objM1394b = c0743a.m1394b(i2, 0);
        Object objM1394b2 = c0743a.m1394b(this.f2546b, 1);
        return (objM1394b == null ? 0 : objM1394b.hashCode()) ^ (objM1394b2 != null ? objM1394b2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2546b++;
        this.f2547c = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2547c) {
            throw new IllegalStateException();
        }
        this.f2548d.m1399g(this.f2546b);
        this.f2546b--;
        this.f2545a--;
        this.f2547c = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f2547c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C0743a c0743a = this.f2548d;
        int i2 = this.f2546b;
        switch (c0743a.f2513d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((C0744b) c0743a.f2514e).f2555b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
