package yyds;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛸᛳᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1747 implements ParameterizedType {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Type[] f8805;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Type f8806;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Type f8807;

    public C1747(Type type, Class cls, Type... typeArr) {
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            C0188.m795(cls, "Must specify owner type for ");
            throw null;
        }
        this.f8806 = type != null ? AbstractC1917.m3702(type) : null;
        this.f8807 = AbstractC1917.m3702(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f8805 = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            AbstractC1917.m3692(this.f8805[i]);
            Type[] typeArr3 = this.f8805;
            typeArr3[i] = AbstractC1917.m3702(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC1917.m3706(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f8805.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f8806;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f8807;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f8805) ^ this.f8807.hashCode();
        Type type = this.f8806;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f8805;
        int length = typeArr.length;
        Type type = this.f8807;
        if (length == 0) {
            return AbstractC1917.m3703(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC1917.m3703(type));
        sb.append("<");
        sb.append(AbstractC1917.m3703(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC1917.m3703(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
