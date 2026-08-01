package p087;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7067 implements Map.Entry, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f18966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f18967;

    public C7067(Object obj, Object obj2) {
        this.f18967 = obj;
        this.f18966 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7067)) {
            return false;
        }
        C7067 c7067 = (C7067) obj;
        return AbstractC4395.m8907(this.f18967, c7067.f18967) && AbstractC4395.m8907(this.f18966, c7067.f18966);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18967;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18966;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f18967;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f18966;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f18967 + ", value=" + this.f18966 + ')';
    }
}
