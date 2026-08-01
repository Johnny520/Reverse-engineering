package p260;

import com.google.gson.internal.AbstractC3220;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import lin.xposed.hook.javaplugin.C5553;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8245<T> {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f22815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f22816;

    public C8245() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C8245.class) {
                Type typeM7326 = AbstractC3220.m7326(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m13800(typeM7326);
                }
                this.f22815 = typeM7326;
                this.f22816 = AbstractC3220.m7327(typeM7326);
                this.f22814 = typeM7326.hashCode();
                return;
            }
        } else if (genericSuperclass == C8245.class) {
            C5919.m11250("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw")));
            throw null;
        }
        C5919.m11250("Must only create direct subclasses of TypeToken");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13800(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            StringBuilder sb = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
            sb.append(typeVariable.getName());
            sb.append(" declared by ");
            sb.append(typeVariable.getGenericDeclaration());
            C5553.m10819(sb, "\nSee ", "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
            return;
        }
        if (type instanceof GenericArrayType) {
            m13800(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m13800(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m13800(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type != null) {
                return;
            }
            C5919.m11249("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m13800(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m13800(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8245) {
            return AbstractC3220.m7322(this.f22815, ((C8245) obj).f22815);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22814;
    }

    public final String toString() {
        return AbstractC3220.m7329(this.f22815);
    }

    public C8245(Type type) {
        Objects.requireNonNull(type);
        Type typeM7326 = AbstractC3220.m7326(type);
        this.f22815 = typeM7326;
        this.f22816 = AbstractC3220.m7327(typeM7326);
        this.f22814 = typeM7326.hashCode();
    }
}
