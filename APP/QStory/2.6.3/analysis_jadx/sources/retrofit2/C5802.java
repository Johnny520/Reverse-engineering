package retrofit2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5802 implements ParameterizedType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f15900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Type[] f15901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f15902;

    public C5802(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                C5925.m11306();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC5785.m11177(type3);
        }
        this.f15902 = type;
        this.f15900 = type2;
        this.f15901 = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC5785.m11176(this, (ParameterizedType) obj);
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
            return AbstractC5785.m11180(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC5785.m11180(type));
        sb.append("<");
        sb.append(AbstractC5785.m11180(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC5785.m11180(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
