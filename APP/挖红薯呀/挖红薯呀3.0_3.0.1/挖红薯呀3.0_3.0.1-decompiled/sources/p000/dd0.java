package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dd0 implements Map.Entry, p40 {

    /* JADX INFO: renamed from: d */
    public final fd0 f1056d;

    /* JADX INFO: renamed from: e */
    public final int f1057e;

    /* JADX INFO: renamed from: f */
    public final int f1058f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dd0(fd0 fd0Var, int i) {
        fd0Var.getClass();
        this.f1056d = fd0Var;
        this.f1057e = i;
        this.f1058f = fd0Var.f1690k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m684a() {
        if (this.f1056d.f1690k != this.f1058f) {
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
        return p30.m3002l(entry.getKey(), getKey()) && p30.m3002l(entry.getValue(), getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        m684a();
        return this.f1056d.f1683d[this.f1057e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        m684a();
        Object[] objArr = this.f1056d.f1684e;
        objArr.getClass();
        return objArr[this.f1057e];
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
        m684a();
        fd0 fd0Var = this.f1056d;
        fd0Var.m1081b();
        Object[] objArr = fd0Var.f1684e;
        if (objArr == null) {
            int length = fd0Var.f1683d.length;
            if (length < 0) {
                C0921xc.m5131l("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            fd0Var.f1684e = objArr;
        }
        int i = this.f1057e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
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
