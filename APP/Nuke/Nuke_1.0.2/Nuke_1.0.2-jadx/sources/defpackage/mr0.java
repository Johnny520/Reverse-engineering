package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 implements ParameterizedType, Serializable {
    public final Type h;
    public final Type i;
    public final Type[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mr0(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            s.g("Must specify owner type for ", cls);
            throw null;
        }
        this.h = type != null ? tl.n(type) : null;
        this.i = tl.n(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.j = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.j[i]);
            tl.p(this.j[i]);
            Type[] typeArr3 = this.j;
            typeArr3[i] = tl.n(typeArr3[i]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && tl.w(this, (ParameterizedType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.j.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.j) ^ this.i.hashCode();
        Type type = this.h;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Type[] typeArr = this.j;
        int length = typeArr.length;
        Type type = this.i;
        if (length == 0) {
            return tl.d0(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(tl.d0(type));
        sb.append("<");
        sb.append(tl.d0(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(tl.d0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
