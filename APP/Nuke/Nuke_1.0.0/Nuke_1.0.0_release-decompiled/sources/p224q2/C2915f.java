package p224q2;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: q2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2915f implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: d */
    public final Type f9211d;

    /* JADX INFO: renamed from: e */
    public final Type f9212e;

    /* JADX INFO: renamed from: f */
    public final Type[] f9213f;

    public C2915f(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f9211d = type == null ? null : AbstractC2917h.m5109a(type);
        this.f9212e = AbstractC2917h.m5109a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f9213f = typeArr2;
        int length = typeArr2.length;
        for (int i5 = 0; i5 < length; i5++) {
            Objects.requireNonNull(this.f9213f[i5]);
            AbstractC2917h.m5111c(this.f9213f[i5]);
            Type[] typeArr3 = this.f9213f;
            typeArr3[i5] = AbstractC2917h.m5109a(typeArr3[i5]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC2917h.m5113e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f9213f.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f9211d;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f9212e;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f9213f) ^ this.f9212e.hashCode();
        Type type = this.f9211d;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f9213f;
        int length = typeArr.length;
        Type type = this.f9212e;
        if (length == 0) {
            return AbstractC2917h.m5119k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC2917h.m5119k(type));
        sb.append("<");
        sb.append(AbstractC2917h.m5119k(typeArr[0]));
        for (int i5 = 1; i5 < length; i5++) {
            sb.append(", ");
            sb.append(AbstractC2917h.m5119k(typeArr[i5]));
        }
        sb.append(">");
        return sb.toString();
    }
}
