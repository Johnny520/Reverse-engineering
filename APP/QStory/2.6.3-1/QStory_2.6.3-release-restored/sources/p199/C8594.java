package p199;

import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8594 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C8594 f21403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f21404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8594 f21405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f21406;

    public C8594(Object obj, Object obj2) {
        this.f21406 = obj;
        this.f21404 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8594)) {
            return false;
        }
        C8594 c8594 = (C8594) obj;
        return this.f21406.equals(c8594.f21406) && this.f21404.equals(c8594.f21404);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21406;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21404;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21404.hashCode() ^ this.f21406.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21406 + "=" + this.f21404;
    }
}
