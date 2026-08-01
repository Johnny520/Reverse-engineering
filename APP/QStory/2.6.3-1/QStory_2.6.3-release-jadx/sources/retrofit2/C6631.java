package retrofit2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import net.bytebuddy.description.type.TypeDescription;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6631 implements WildcardType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f16243;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f16244;

    public C6631(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C6755.m11865();
            throw null;
        }
        if (typeArr.length != 1) {
            C6755.m11865();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC6615.m11736(typeArr[0]);
            this.f16243 = null;
            this.f16244 = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC6615.m11736(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            C6755.m11865();
            throw null;
        }
        this.f16243 = typeArr2[0];
        this.f16244 = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC6615.m11735(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16243;
        return type != null ? new Type[]{type} : AbstractC6615.f16225;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f16244};
    }

    public final int hashCode() {
        Type type = this.f16243;
        return (this.f16244.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f16243;
        if (type != null) {
            return "? super " + AbstractC6615.m11739(type);
        }
        Type type2 = this.f16244;
        if (type2 == Object.class) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + AbstractC6615.m11739(type2);
    }
}
