package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5536 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f14101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5528 f14102;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Comparable f14103;

    public C5536(C5528 c5528, Comparable comparable, Object obj) {
        this.f14102 = c5528;
        this.f14103 = comparable;
        this.f14101 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14103.compareTo(((C5536) obj).f14103);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f14103;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f14101;
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
        return this.f14103;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14101;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f14103;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14101;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f14102.m9903();
        Object obj2 = this.f14101;
        this.f14101 = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14103);
        String strValueOf2 = String.valueOf(this.f14101);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
