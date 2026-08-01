package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4703 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f13752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4695 f13753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Comparable f13754;

    public C4703(C4695 c4695, Comparable comparable, Object obj) {
        this.f13753 = c4695;
        this.f13754 = comparable;
        this.f13752 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13754.compareTo(((C4703) obj).f13754);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f13754;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f13752;
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
        return this.f13754;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13752;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f13754;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f13752;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13753.m9354();
        Object obj2 = this.f13752;
        this.f13752 = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13754);
        String strValueOf2 = String.valueOf(this.f13752);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
