package kotlin.collections.builders;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p070.InterfaceC7393;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5146 implements Map.Entry, InterfaceC7393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final MapBuilder f13240;

    public C5146(MapBuilder mapBuilder, int i) {
        this.f13240 = mapBuilder;
        this.f13238 = i;
        this.f13239 = mapBuilder.modCount;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC5227.m9466(entry.getKey(), getKey()) && AbstractC5227.m9466(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m9315();
        return this.f13240.keysArray[this.f13238];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m9315();
        Object[] objArr = this.f13240.valuesArray;
        objArr.getClass();
        return objArr[this.f13238];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m9315();
        MapBuilder mapBuilder = this.f13240;
        mapBuilder.checkIsMutable$kotlin_stdlib();
        Object[] objArrAllocateValuesArray = mapBuilder.allocateValuesArray();
        int i = this.f13238;
        Object obj2 = objArrAllocateValuesArray[i];
        objArrAllocateValuesArray[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(getValue());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9315() {
        if (this.f13240.modCount != this.f13239) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
