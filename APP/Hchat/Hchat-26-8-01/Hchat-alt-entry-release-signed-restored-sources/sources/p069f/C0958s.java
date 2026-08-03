package p069f;

import gg.AbstractC1416l;
import java.util.Map;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: f.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0958s implements Map.Entry, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3016g;

    /* JADX INFO: renamed from: h */
    public final Object f3017h;

    /* JADX INFO: renamed from: i */
    public final Object f3018i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0958s(Object obj, int i9, Object obj2) {
        this.f3016g = i9;
        this.f3017h = obj;
        this.f3018i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f3016g) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC1416l.m3825a(entry.getKey(), this.f3017h) && AbstractC1416l.m3825a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f3016g) {
        }
        return this.f3017h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f3016g) {
        }
        return this.f3018i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f3016g) {
            case 1:
                Object obj = this.f3017h;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f3016g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:IGET), 61, (wrap:java.lang.Object:INVOKE) */
    public String toString() {
        switch (this.f3016g) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f3017h);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
