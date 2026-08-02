package p000;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: h */
    public final Type f6798h;

    /* JADX INFO: renamed from: i */
    public final Type f6799i;

    /* JADX INFO: renamed from: j */
    public final Type[] f6800j;

    public mr0(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            C0676s.m4648g("Must specify owner type for ", cls);
            throw null;
        }
        this.f6798h = type != null ? AbstractC0738tl.m5315n(type) : null;
        this.f6799i = AbstractC0738tl.m5315n(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f6800j = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f6800j[i]);
            AbstractC0738tl.m5317p(this.f6800j[i]);
            Type[] typeArr3 = this.f6800j;
            typeArr3[i] = AbstractC0738tl.m5315n(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0738tl.m5324w(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f6800j.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f6798h;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f6799i;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f6800j) ^ this.f6799i.hashCode();
        Type type = this.f6798h;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f6800j;
        int length = typeArr.length;
        Type type = this.f6799i;
        if (length == 0) {
            return AbstractC0738tl.m5305d0(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC0738tl.m5305d0(type));
        sb.append("<");
        sb.append(AbstractC0738tl.m5305d0(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC0738tl.m5305d0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
