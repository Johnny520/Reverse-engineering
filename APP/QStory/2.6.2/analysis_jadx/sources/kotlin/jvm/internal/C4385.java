package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.InterfaceC5092;
import kotlin.text.AbstractC5143;
import p052.InterfaceC6537;
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
import p053.AbstractC6560;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4385 implements InterfaceC5092, InterfaceC4386, InterfaceC4397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Map f12959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f12960;

    static {
        List listM13659 = AbstractC8189.m13659(InterfaceC6542.class, InterfaceC6557.class, InterfaceC6553.class, InterfaceC6550.class, InterfaceC6551.class, InterfaceC6544.class, InterfaceC6543.class, InterfaceC6546.class, InterfaceC6547.class, InterfaceC6545.class, InterfaceC6541.class, InterfaceC6540.class, InterfaceC6539.class, InterfaceC6538.class, InterfaceC6537.class, InterfaceC6555.class, InterfaceC6554.class, InterfaceC6558.class, InterfaceC6559.class, InterfaceC6556.class, InterfaceC6549.class, InterfaceC6548.class, InterfaceC6552.class);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM13659, 10));
        int i = 0;
        for (Object obj : listM13659) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f12959 = AbstractC4338.m8783(arrayList);
    }

    public C4385(Class cls) {
        cls.getClass();
        this.f12960 = cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8886() {
        throw new KotlinReflectionNotSupportedError();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4385) && AbstractC6560.m12026(this).equals(AbstractC6560.m12026((InterfaceC5092) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC4397
    public final GenericDeclaration findJavaDeclaration() {
        return this.f12960;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final String getSimpleName() {
        String strM8912;
        Class cls = this.f12960;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM89122 = AbstractC4394.m8912(cls.getName());
                return strM89122 == null ? cls.getSimpleName() : strM89122;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM8912 = AbstractC4394.m8912(componentType.getName())) != null) {
                strConcat = strM8912.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC5143.m10139(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM10151 = AbstractC5143.m10151(simpleName, '$', 0, 6);
            return iM10151 == -1 ? simpleName : simpleName.substring(iM10151 + 1, simpleName.length());
        }
        return AbstractC5143.m10139(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final List getTypeParameters() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final int hashCode() {
        return AbstractC6560.m12026(this).hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final boolean isInstance(Object obj) {
        Class clsM12026 = this.f12960;
        clsM12026.getClass();
        Map map = f12959;
        map.getClass();
        Integer num = (Integer) map.get(clsM12026);
        if (num != null) {
            return AbstractC4387.m8904(num.intValue(), obj);
        }
        if (clsM12026.isPrimitive()) {
            clsM12026 = AbstractC6560.m12026(AbstractC4395.f12971.mo8927(clsM12026));
        }
        return clsM12026.isInstance(obj);
    }

    public final String toString() {
        return this.f12960.toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo8887() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Collection mo8888() {
        m8886();
        throw null;
    }

    @Override // kotlin.jvm.internal.InterfaceC4386
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Class mo8889() {
        return this.f12960;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo8890() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo8891() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo8892() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Collection mo8893() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo8894() {
        m8886();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo8895() {
        String strM8916;
        Class cls = this.f12960;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM89162 = AbstractC4394.m8916(cls.getName());
            return strM89162 == null ? cls.getCanonicalName() : strM89162;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM8916 = AbstractC4394.m8916(componentType.getName())) != null) {
            strConcat = strM8916.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection mo8896() {
        m8886();
        throw null;
    }
}
