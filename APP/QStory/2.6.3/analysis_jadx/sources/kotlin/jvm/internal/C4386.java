package kotlin.jvm.internal;

import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.InterfaceC5093;
import kotlin.text.AbstractC5144;
import p034.AbstractC6347;
import p052.InterfaceC6538;
import p052.InterfaceC6539;
import p052.InterfaceC6540;
import p052.InterfaceC6541;
import p052.InterfaceC6542;
import p052.InterfaceC6543;
import p052.InterfaceC6544;
import p052.InterfaceC6545;
import p052.InterfaceC6546;
import p052.InterfaceC6547;
import p052.InterfaceC6548;
import p052.InterfaceC6549;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6553;
import p052.InterfaceC6554;
import p052.InterfaceC6555;
import p052.InterfaceC6556;
import p052.InterfaceC6557;
import p052.InterfaceC6558;
import p052.InterfaceC6559;
import p052.InterfaceC6560;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4386 implements InterfaceC5093, InterfaceC4387, InterfaceC4398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Map f12963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f12964;

    static {
        List listM11931 = AbstractC6347.m11931(InterfaceC6543.class, InterfaceC6558.class, InterfaceC6554.class, InterfaceC6551.class, InterfaceC6552.class, InterfaceC6545.class, InterfaceC6544.class, InterfaceC6547.class, InterfaceC6548.class, InterfaceC6546.class, InterfaceC6542.class, InterfaceC6541.class, InterfaceC6540.class, InterfaceC6539.class, InterfaceC6538.class, InterfaceC6556.class, InterfaceC6555.class, InterfaceC6559.class, InterfaceC6560.class, InterfaceC6557.class, InterfaceC6550.class, InterfaceC6549.class, InterfaceC6553.class);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM11931, 10));
        int i = 0;
        for (Object obj : listM11931) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f12963 = AbstractC4339.m8771(arrayList);
    }

    public C4386(Class cls) {
        cls.getClass();
        this.f12964 = cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8876() {
        throw new KotlinReflectionNotSupportedError();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4386) && AbstractC3057.m6757(this).equals(AbstractC3057.m6757((InterfaceC5093) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC4398
    public final GenericDeclaration findJavaDeclaration() {
        return this.f12964;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getSimpleName() {
        String strM8902;
        Class cls = this.f12964;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM89022 = AbstractC4395.m8902(cls.getName());
                return strM89022 == null ? cls.getSimpleName() : strM89022;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM8902 = AbstractC4395.m8902(componentType.getName())) != null) {
                strConcat = strM8902.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC5144.m10141(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM10171 = AbstractC5144.m10171(simpleName, '$', 0, 6);
            return iM10171 == -1 ? simpleName : simpleName.substring(iM10171 + 1, simpleName.length());
        }
        return AbstractC5144.m10141(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final int hashCode() {
        return AbstractC3057.m6757(this).hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isInstance(Object obj) {
        Class clsM6757 = this.f12964;
        clsM6757.getClass();
        Map map = f12963;
        map.getClass();
        Integer num = (Integer) map.get(clsM6757);
        if (num != null) {
            return AbstractC4388.m8894(num.intValue(), obj);
        }
        if (clsM6757.isPrimitive()) {
            clsM6757 = AbstractC3057.m6757(AbstractC4396.f12975.mo8917(clsM6757));
        }
        return clsM6757.isInstance(obj);
    }

    public final String toString() {
        return this.f12964.toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo8877() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Collection mo8878() {
        m8876();
        throw null;
    }

    @Override // kotlin.jvm.internal.InterfaceC4387
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Class mo8879() {
        return this.f12964;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo8880() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo8881() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo8882() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Collection mo8883() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo8884() {
        m8876();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo8885() {
        String strM8906;
        Class cls = this.f12964;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM89062 = AbstractC4395.m8906(cls.getName());
            return strM89062 == null ? cls.getCanonicalName() : strM89062;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM8906 = AbstractC4395.m8906(componentType.getName())) != null) {
            strConcat = strM8906.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection mo8886() {
        m8876();
        throw null;
    }
}
