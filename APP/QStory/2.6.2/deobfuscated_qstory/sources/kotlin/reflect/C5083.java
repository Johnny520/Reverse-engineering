package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5083 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f14633;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Type[] f14634;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f14635;

    public C5083(Class cls, Type type, ArrayList arrayList) {
        this.f14635 = cls;
        this.f14633 = type;
        this.f14634 = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.f14635.equals(parameterizedType.getRawType()) && AbstractC4394.m8917(this.f14633, parameterizedType.getOwnerType()) && Arrays.equals(this.f14634, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f14634;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f14633;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f14635;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f14635;
        Type type = this.f14633;
        if (type != null) {
            sb.append(AbstractC5089.m10100(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC5089.m10100(cls));
        }
        Type[] typeArr = this.f14634;
        if (typeArr.length != 0) {
            AbstractC4346.m8859(typeArr, sb, ", ", "<", ">", "...", ParameterizedTypeImpl$getTypeName$1$1.INSTANCE);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f14635.hashCode();
        Type type = this.f14633;
        return Arrays.hashCode(this.f14634) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
