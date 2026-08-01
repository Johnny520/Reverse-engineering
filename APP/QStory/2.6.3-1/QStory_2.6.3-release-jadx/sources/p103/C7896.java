package p103;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7896 implements Map.Entry, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f19311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f19312;

    public C7896(Object obj, Object obj2) {
        this.f19312 = obj;
        this.f19311 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7896)) {
            return false;
        }
        C7896 c7896 = (C7896) obj;
        return AbstractC5227.m9466(this.f19312, c7896.f19312) && AbstractC5227.m9466(this.f19311, c7896.f19311);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19312;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19311;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f19312;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19311;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f19312 + ", value=" + this.f19311 + ')';
    }
}
