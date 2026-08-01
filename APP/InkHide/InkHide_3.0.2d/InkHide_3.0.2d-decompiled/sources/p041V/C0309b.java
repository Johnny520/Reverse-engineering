package p041V;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: V.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0309b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f679a;

    /* JADX INFO: renamed from: b */
    public final Type f680b;

    /* JADX INFO: renamed from: c */
    public final Type[] f681c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0309b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z2 = true;
            boolean z3 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z3) {
                z2 = false;
            }
            AbstractC0311d.m540b(z2);
        }
        this.f679a = type == null ? null : AbstractC0311d.m539a(type);
        this.f680b = AbstractC0311d.m539a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f681c = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Objects.requireNonNull(this.f681c[i2]);
            AbstractC0311d.m541c(this.f681c[i2]);
            Type[] typeArr3 = this.f681c;
            typeArr3[i2] = AbstractC0311d.m539a(typeArr3[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0311d.m542d(this, (ParameterizedType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f681c.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f679a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f680b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f681c) ^ this.f680b.hashCode();
        Type type = this.f679a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Type[] typeArr = this.f681c;
        int length = typeArr.length;
        Type type = this.f680b;
        if (length == 0) {
            return AbstractC0311d.m548j(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC0311d.m548j(type));
        sb.append("<");
        sb.append(AbstractC0311d.m548j(typeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(", ");
            sb.append(AbstractC0311d.m548j(typeArr[i2]));
        }
        sb.append(">");
        return sb.toString();
    }
}
