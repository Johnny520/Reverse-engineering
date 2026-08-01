package kotlin.collections.builders;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p054.InterfaceC6564;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4314 implements Map.Entry, InterfaceC6564 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12893;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f12894;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final MapBuilder f12895;

    public C4314(MapBuilder mapBuilder, int i) {
        this.f12895 = mapBuilder;
        this.f12893 = i;
        this.f12894 = mapBuilder.modCount;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC4395.m8907(entry.getKey(), getKey()) && AbstractC4395.m8907(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m8756();
        return this.f12895.keysArray[this.f12893];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m8756();
        Object[] objArr = this.f12895.valuesArray;
        objArr.getClass();
        return objArr[this.f12893];
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
        m8756();
        MapBuilder mapBuilder = this.f12895;
        mapBuilder.checkIsMutable$kotlin_stdlib();
        Object[] objArrAllocateValuesArray = mapBuilder.allocateValuesArray();
        int i = this.f12893;
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
    public final void m8756() {
        if (this.f12895.modCount != this.f12894) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
