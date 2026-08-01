package kotlin.collections.builders;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p054.InterfaceC6563;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4313 implements Map.Entry, InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12889;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f12890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final MapBuilder f12891;

    public C4313(MapBuilder mapBuilder, int i) {
        this.f12891 = mapBuilder;
        this.f12889 = i;
        this.f12890 = mapBuilder.modCount;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC4394.m8917(entry.getKey(), getKey()) && AbstractC4394.m8917(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m8766();
        return this.f12891.keysArray[this.f12889];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m8766();
        Object[] objArr = this.f12891.valuesArray;
        objArr.getClass();
        return objArr[this.f12889];
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
        m8766();
        MapBuilder mapBuilder = this.f12891;
        mapBuilder.checkIsMutable$kotlin_stdlib();
        Object[] objArrAllocateValuesArray = mapBuilder.allocateValuesArray();
        int i = this.f12889;
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
    public final void m8766() {
        if (this.f12891.modCount != this.f12890) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
