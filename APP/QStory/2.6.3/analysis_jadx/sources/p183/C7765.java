package p183;

import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7765 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7765 f21058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f21059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7765 f21060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f21061;

    public C7765(Object obj, Object obj2) {
        this.f21061 = obj;
        this.f21059 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7765)) {
            return false;
        }
        C7765 c7765 = (C7765) obj;
        return this.f21061.equals(c7765.f21061) && this.f21059.equals(c7765.f21059);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21061;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21059;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21059.hashCode() ^ this.f21061.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21061 + "=" + this.f21059;
    }
}
