package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class se1 implements Map.Entry, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10076h;

    /* JADX INFO: renamed from: i */
    public final Object f10077i;

    /* JADX INFO: renamed from: j */
    public final Object f10078j;

    public /* synthetic */ se1(int i, Object obj, Object obj2) {
        this.f10076h = i;
        this.f10077i = obj;
        this.f10078j = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f10076h) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && t11.m5086l(entry.getKey(), this.f10077i) && t11.m5086l(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f10076h) {
        }
        return this.f10077i;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f10076h) {
        }
        return this.f10078j;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f10076h) {
            case 0:
                Object obj = this.f10077i;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f10076h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f10076h) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f10077i);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
