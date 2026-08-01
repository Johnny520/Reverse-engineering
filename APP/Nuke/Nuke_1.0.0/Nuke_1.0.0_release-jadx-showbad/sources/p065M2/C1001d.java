package p065M2;

import java.util.ConcurrentModificationException;
import java.util.Map;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: M2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1001d implements Map.Entry, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C1002e f3096d;

    /* JADX INFO: renamed from: e */
    public final int f3097e;

    /* JADX INFO: renamed from: f */
    public final int f3098f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1001d(C1002e c1002e, int i5) {
        AbstractC1665j.m2985e(c1002e, "map");
        this.f3096d = c1002e;
        this.f3097e = i5;
        this.f3098f = c1002e.f3107k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2067a() {
        if (this.f3096d.f3107k != this.f3098f) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC1665j.m2981a(entry.getKey(), getKey()) && AbstractC1665j.m2981a(entry.getValue(), getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        m2067a();
        return this.f3096d.f3100d[this.f3097e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        m2067a();
        Object[] objArr = this.f3096d.f3101e;
        AbstractC1665j.m2982b(objArr);
        return objArr[this.f3097e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m2067a();
        C1002e c1002e = this.f3096d;
        c1002e.m2069b();
        Object[] objArr = c1002e.f3101e;
        if (objArr == null) {
            int length = c1002e.f3100d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c1002e.f3101e = objArr;
        }
        int i5 = this.f3097e;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:INVOKE), 61, (wrap:java.lang.Object:INVOKE) */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
