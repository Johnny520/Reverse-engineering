package p183;

import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7764 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7764 f21061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f21062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7764 f21063;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f21064;

    public C7764(Object obj, Object obj2) {
        this.f21064 = obj;
        this.f21062 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7764)) {
            return false;
        }
        C7764 c7764 = (C7764) obj;
        return this.f21064.equals(c7764.f21064) && this.f21062.equals(c7764.f21062);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21064;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21062;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21062.hashCode() ^ this.f21064.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21064 + "=" + this.f21062;
    }
}
