package retrofit2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5801 implements ParameterizedType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f15900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Type[] f15901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f15902;

    public C5801(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                C5919.m11245();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC5784.m11120(type3);
        }
        this.f15902 = type;
        this.f15900 = type2;
        this.f15901 = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC5784.m11119(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f15901.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f15902;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f15900;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f15901) ^ this.f15900.hashCode();
        Type type = this.f15902;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f15901;
        int length = typeArr.length;
        Type type = this.f15900;
        if (length == 0) {
            return AbstractC5784.m11123(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC5784.m11123(type));
        sb.append("<");
        sb.append(AbstractC5784.m11123(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC5784.m11123(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
