package p087;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7066 implements Map.Entry, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f18971;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f18972;

    public C7066(Object obj, Object obj2) {
        this.f18972 = obj;
        this.f18971 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7066)) {
            return false;
        }
        C7066 c7066 = (C7066) obj;
        return AbstractC4394.m8917(this.f18972, c7066.f18972) && AbstractC4394.m8917(this.f18971, c7066.f18971);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18972;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18971;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f18972;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f18971;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f18972 + ", value=" + this.f18971 + ')';
    }
}
