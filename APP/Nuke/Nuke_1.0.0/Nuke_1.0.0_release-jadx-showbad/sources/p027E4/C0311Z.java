package p027E4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: E4.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0311Z implements ParameterizedType {

    /* JADX INFO: renamed from: d */
    public final Type f1025d;

    /* JADX INFO: renamed from: e */
    public final Type f1026e;

    /* JADX INFO: renamed from: f */
    public final Type[] f1027f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0311Z(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC0315b0.m533d(type3);
        }
        this.f1025d = type;
        this.f1026e = type2;
        this.f1027f = (Type[]) typeArr.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0315b0.m534e(this, (ParameterizedType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1027f.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f1025d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f1026e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f1027f) ^ this.f1026e.hashCode();
        Type type = this.f1025d;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Type[] typeArr = this.f1027f;
        int length = typeArr.length;
        Type type = this.f1026e;
        if (length == 0) {
            return AbstractC0315b0.m548s(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC0315b0.m548s(type));
        sb.append("<");
        sb.append(AbstractC0315b0.m548s(typeArr[0]));
        for (int i5 = 1; i5 < typeArr.length; i5++) {
            sb.append(", ");
            sb.append(AbstractC0315b0.m548s(typeArr[i5]));
        }
        sb.append(">");
        return sb.toString();
    }
}
