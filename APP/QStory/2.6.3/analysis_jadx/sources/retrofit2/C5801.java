package retrofit2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import net.bytebuddy.description.type.TypeDescription;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5801 implements WildcardType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f15898;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f15899;

    public C5801(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C5925.m11306();
            throw null;
        }
        if (typeArr.length != 1) {
            C5925.m11306();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC5785.m11177(typeArr[0]);
            this.f15898 = null;
            this.f15899 = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC5785.m11177(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            C5925.m11306();
            throw null;
        }
        this.f15898 = typeArr2[0];
        this.f15899 = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC5785.m11176(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f15898;
        return type != null ? new Type[]{type} : AbstractC5785.f15880;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f15899};
    }

    public final int hashCode() {
        Type type = this.f15898;
        return (this.f15899.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f15898;
        if (type != null) {
            return "? super " + AbstractC5785.m11180(type);
        }
        Type type2 = this.f15899;
        if (type2 == Object.class) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + AbstractC5785.m11180(type2);
    }
}
