package retrofit2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import net.bytebuddy.description.type.TypeDescription;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5800 implements WildcardType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f15898;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f15899;

    public C5800(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C5919.m11245();
            throw null;
        }
        if (typeArr.length != 1) {
            C5919.m11245();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC5784.m11120(typeArr[0]);
            this.f15898 = null;
            this.f15899 = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC5784.m11120(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            C5919.m11245();
            throw null;
        }
        this.f15898 = typeArr2[0];
        this.f15899 = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC5784.m11119(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f15898;
        return type != null ? new Type[]{type} : AbstractC5784.f15880;
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
            return "? super " + AbstractC5784.m11123(type);
        }
        Type type2 = this.f15899;
        if (type2 == Object.class) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + AbstractC5784.m11123(type2);
    }
}
