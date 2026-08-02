package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e93 implements ParameterizedType {

    /* JADX INFO: renamed from: h */
    public final Type f2365h;

    /* JADX INFO: renamed from: i */
    public final Type f2366i;

    /* JADX INFO: renamed from: j */
    public final Type[] f2367j;

    public e93(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            xe1.m6125i(type3);
        }
        this.f2365h = type;
        this.f2366i = type2;
        this.f2367j = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && xe1.m6139p(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f2367j.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f2365h;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f2366i;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f2367j) ^ this.f2366i.hashCode();
        Type type = this.f2365h;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f2367j;
        int length = typeArr.length;
        Type type = this.f2366i;
        if (length == 0) {
            return xe1.m6136n0(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(xe1.m6136n0(type));
        sb.append("<");
        sb.append(xe1.m6136n0(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(xe1.m6136n0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
