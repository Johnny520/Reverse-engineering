package p119Y;

import java.util.Map;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: Y.a */
/* JADX INFO: loaded from: classes.dex */
public class C1717a implements Map.Entry, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5953d;

    /* JADX INFO: renamed from: e */
    public final Object f5954e;

    /* JADX INFO: renamed from: f */
    public final Object f5955f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1717a(int i5, Object obj, Object obj2) {
        this.f5953d = i5;
        this.f5954e = obj;
        this.f5955f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f5953d) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC1665j.m2981a(entry.getKey(), this.f5954e) && AbstractC1665j.m2981a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f5953d) {
        }
        return this.f5954e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f5953d) {
        }
        return this.f5955f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f5953d) {
            case 0:
                Object obj = this.f5954e;
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
        switch (this.f5953d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:IGET), 61, (wrap:java.lang.Object:INVOKE) */
    public String toString() {
        switch (this.f5953d) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f5954e);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
