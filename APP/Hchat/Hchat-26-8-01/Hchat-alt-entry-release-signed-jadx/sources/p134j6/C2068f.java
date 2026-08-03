package p134j6;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: j6.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2068f implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: g */
    public final Type f6948g;

    /* JADX INFO: renamed from: h */
    public final Type f6949h;

    /* JADX INFO: renamed from: i */
    public final Type[] f6950i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2068f(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            C2104o.m5294t(AbstractC3199a.m6838k(cls, "Must specify owner type for "));
            throw null;
        }
        this.f6948g = type == null ? null : AbstractC2070h.m5123a(type);
        this.f6949h = AbstractC2070h.m5123a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f6950i = typeArr2;
        int length = typeArr2.length;
        for (int i9 = 0; i9 < length; i9++) {
            Objects.requireNonNull(this.f6950i[i9]);
            AbstractC2070h.m5124b(this.f6950i[i9]);
            Type[] typeArr3 = this.f6950i;
            typeArr3[i9] = AbstractC2070h.m5123a(typeArr3[i9]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC2070h.m5125c(this, (ParameterizedType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f6950i.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f6948g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f6949h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f6950i) ^ this.f6949h.hashCode();
        Type type = this.f6948g;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Type[] typeArr = this.f6950i;
        int length = typeArr.length;
        Type type = this.f6949h;
        if (length == 0) {
            return AbstractC2070h.m5131i(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(AbstractC2070h.m5131i(type));
        sb2.append("<");
        sb2.append(AbstractC2070h.m5131i(typeArr[0]));
        for (int i9 = 1; i9 < length; i9++) {
            sb2.append(", ");
            sb2.append(AbstractC2070h.m5131i(typeArr[i9]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
