package p304uf;

import gg.AbstractC1416l;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p114hg.InterfaceC1711a;
import p136j8.C2104o;

/* JADX INFO: renamed from: uf.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4332f implements Map.Entry, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C4333g f14473g;

    /* JADX INFO: renamed from: h */
    public final int f14474h;

    /* JADX INFO: renamed from: i */
    public final int f14475i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4332f(C4333g c4333g, int i9) {
        c4333g.getClass();
        this.f14473g = c4333g;
        this.f14474h = i9;
        this.f14475i = c4333g.f14484n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8778a() {
        if (this.f14473g.f14484n != this.f14475i) {
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
        return AbstractC1416l.m3825a(entry.getKey(), getKey()) && AbstractC1416l.m3825a(entry.getValue(), getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        m8778a();
        return this.f14473g.f14477g[this.f14474h];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        m8778a();
        Object[] objArr = this.f14473g.f14478h;
        objArr.getClass();
        return objArr[this.f14474h];
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
        m8778a();
        C4333g c4333g = this.f14473g;
        c4333g.m8781d();
        Object[] objArr = c4333g.f14478h;
        if (objArr == null) {
            int length = c4333g.f14477g.length;
            if (length < 0) {
                C2104o.m5294t("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            c4333g.f14478h = objArr;
        }
        int i9 = this.f14474h;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:INVOKE), 61, (wrap:java.lang.Object:INVOKE) */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
