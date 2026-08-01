package p252v2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import p224q2.AbstractC2917h;

/* JADX INFO: renamed from: v2.a */
/* JADX INFO: loaded from: classes.dex */
public class C3352a<T> {

    /* JADX INFO: renamed from: a */
    public final Class f10417a;

    /* JADX INFO: renamed from: b */
    public final Type f10418b;

    /* JADX INFO: renamed from: c */
    public final int f10419c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3352a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C3352a.class) {
                Type typeM5109a = AbstractC2917h.m5109a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m5603a(typeM5109a);
                }
                this.f10418b = typeM5109a;
                this.f10417a = AbstractC2917h.m5116h(typeM5109a);
                this.f10419c = typeM5109a.hashCode();
                return;
            }
        } else if (genericSuperclass == C3352a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5603a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m5603a(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i5 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m5603a(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i5 < length) {
                m5603a(actualTypeArguments[i5]);
                i5++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m5603a(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i5 < length2) {
            m5603a(upperBounds[i5]);
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3352a) {
            return AbstractC2917h.m5113e(this.f10418b, ((C3352a) obj).f10418b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10419c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2917h.m5119k(this.f10418b);
    }

    public C3352a(Type type) {
        Objects.requireNonNull(type);
        Type typeM5109a = AbstractC2917h.m5109a(type);
        this.f10418b = typeM5109a;
        this.f10417a = AbstractC2917h.m5116h(typeM5109a);
        this.f10419c = typeM5109a.hashCode();
    }
}
