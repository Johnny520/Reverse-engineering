package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4704 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f13756;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4696 f13757;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Comparable f13758;

    public C4704(C4696 c4696, Comparable comparable, Object obj) {
        this.f13757 = c4696;
        this.f13758 = comparable;
        this.f13756 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13758.compareTo(((C4704) obj).f13758);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f13758;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f13756;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13758;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13756;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f13758;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f13756;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13757.m9344();
        Object obj2 = this.f13756;
        this.f13756 = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13758);
        String strValueOf2 = String.valueOf(this.f13756);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
