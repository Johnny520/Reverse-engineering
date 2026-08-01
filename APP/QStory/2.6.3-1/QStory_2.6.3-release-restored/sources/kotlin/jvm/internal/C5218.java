package kotlin.jvm.internal;

import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5976;
import p050.AbstractC7176;
import p068.InterfaceC7367;
import p068.InterfaceC7368;
import p068.InterfaceC7369;
import p068.InterfaceC7370;
import p068.InterfaceC7371;
import p068.InterfaceC7372;
import p068.InterfaceC7373;
import p068.InterfaceC7374;
import p068.InterfaceC7375;
import p068.InterfaceC7376;
import p068.InterfaceC7377;
import p068.InterfaceC7378;
import p068.InterfaceC7379;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7382;
import p068.InterfaceC7383;
import p068.InterfaceC7384;
import p068.InterfaceC7385;
import p068.InterfaceC7386;
import p068.InterfaceC7387;
import p068.InterfaceC7388;
import p068.InterfaceC7389;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5218 implements InterfaceC5925, InterfaceC5219, InterfaceC5230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Map f13308;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f13309;

    static {
        List listM12490 = AbstractC7176.m12490(InterfaceC7372.class, InterfaceC7387.class, InterfaceC7383.class, InterfaceC7380.class, InterfaceC7381.class, InterfaceC7374.class, InterfaceC7373.class, InterfaceC7376.class, InterfaceC7377.class, InterfaceC7375.class, InterfaceC7371.class, InterfaceC7370.class, InterfaceC7369.class, InterfaceC7368.class, InterfaceC7367.class, InterfaceC7385.class, InterfaceC7384.class, InterfaceC7388.class, InterfaceC7389.class, InterfaceC7386.class, InterfaceC7379.class, InterfaceC7378.class, InterfaceC7382.class);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12490, 10));
        int i = 0;
        for (Object obj : listM12490) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f13308 = AbstractC5171.m9330(arrayList);
    }

    public C5218(Class cls) {
        cls.getClass();
        this.f13309 = cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m9435() {
        throw new KotlinReflectionNotSupportedError();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5218) && AbstractC3889.m7317(this).equals(AbstractC3889.m7317((InterfaceC5925) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC5230
    public final GenericDeclaration findJavaDeclaration() {
        return this.f13309;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final String getSimpleName() {
        String strM9461;
        Class cls = this.f13309;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM94612 = AbstractC5227.m9461(cls.getName());
                return strM94612 == null ? cls.getSimpleName() : strM94612;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM9461 = AbstractC5227.m9461(componentType.getName())) != null) {
                strConcat = strM9461.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC5976.m10700(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM10730 = AbstractC5976.m10730(simpleName, '$', 0, 6);
            return iM10730 == -1 ? simpleName : simpleName.substring(iM10730 + 1, simpleName.length());
        }
        return AbstractC5976.m10700(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final List getTypeParameters() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final int hashCode() {
        return AbstractC3889.m7317(this).hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final boolean isInstance(Object obj) {
        Class clsM7317 = this.f13309;
        clsM7317.getClass();
        Map map = f13308;
        map.getClass();
        Integer num = (Integer) map.get(clsM7317);
        if (num != null) {
            return AbstractC5220.m9453(num.intValue(), obj);
        }
        if (clsM7317.isPrimitive()) {
            clsM7317 = AbstractC3889.m7317(AbstractC5228.f13320.mo9476(clsM7317));
        }
        return clsM7317.isInstance(obj);
    }

    public final String toString() {
        return this.f13309.toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo9436() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Collection mo9437() {
        m9435();
        throw null;
    }

    @Override // kotlin.jvm.internal.InterfaceC5219
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Class mo9438() {
        return this.f13309;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo9439() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo9440() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo9441() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Collection mo9442() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo9443() {
        m9435();
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo9444() {
        String strM9465;
        Class cls = this.f13309;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM94652 = AbstractC5227.m9465(cls.getName());
            return strM94652 == null ? cls.getCanonicalName() : strM94652;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM9465 = AbstractC5227.m9465(componentType.getName())) != null) {
            strConcat = strM9465.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection mo9445() {
        m9435();
        throw null;
    }
}
