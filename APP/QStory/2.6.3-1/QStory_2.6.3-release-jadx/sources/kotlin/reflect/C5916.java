package kotlin.reflect;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5916 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f14978;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Type[] f14979;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f14980;

    public C5916(Class cls, Type type, ArrayList arrayList) {
        this.f14980 = cls;
        this.f14978 = type;
        this.f14979 = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.f14980.equals(parameterizedType.getRawType()) && AbstractC5227.m9466(this.f14978, parameterizedType.getOwnerType()) && Arrays.equals(this.f14979, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f14979;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f14978;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f14980;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f14980;
        Type type = this.f14978;
        if (type != null) {
            sb.append(AbstractC5922.m10663(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC5922.m10663(cls));
        }
        Type[] typeArr = this.f14979;
        if (typeArr.length != 0) {
            AbstractC5179.m9410(typeArr, sb, ", ", "<", ">", "...", ParameterizedTypeImpl$getTypeName$1$1.INSTANCE);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f14980.hashCode();
        Type type = this.f14978;
        return Arrays.hashCode(this.f14979) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
