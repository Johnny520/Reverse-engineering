package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import io.ktor.client.plugins.AbstractC3933;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4385;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.InterfaceC4387;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p009.AbstractC6183;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5003 implements InterfaceC4387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Regex f14422 = new Regex("<v#(\\d+)>");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static Method m9973(Class cls, Class cls2, String str, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC4395.m8907(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC4395.m8907(method.getName(), str) && AbstractC4395.m8907(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static Method m9974(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodM9974;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM9973 = m9973(cls, cls2, str, clsArr);
        if (methodM9973 != null) {
            return methodM9973;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM9974 = m9974(superclass, str, clsArr, cls2, z)) != null) {
            return methodM9974;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            Class<?> cls3 = null;
            if (i >= length) {
                return null;
            }
            Class<?> cls4 = interfaces[i];
            cls4.getClass();
            Method methodM99742 = m9974(cls4, str, clsArr, cls2, z);
            if (methodM99742 != null) {
                return methodM99742;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, AbstractC4431.m8974(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodM99732 = m9973(cls3, cls2, str, clsArr);
                    if (methodM99732 != null) {
                        return methodM99732;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m9975(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        Class cls;
        cls = AbstractC4385.class;
        boolean zM8907 = AbstractC4395.m8907(AbstractC4344.m8812(arrayList2), cls);
        List listSubList = arrayList2;
        if (zM8907) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        int size = z2 ? listSubList.size() - 1 : listSubList.size();
        arrayList.addAll(listSubList);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls2 = Integer.TYPE;
            cls2.getClass();
            arrayList.add(cls2);
        }
        arrayList.add(z ? AbstractC4385.class : Object.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4536 m9976(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) ((C4993) ((C4992) this).f14405.getValue()).f14410.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4344.m8804(((C4537) it.next()).f13230, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C4536 c4536 = (C4536) obj;
            if (AbstractC4395.m8907(c4536.f13217, str) && AbstractC4395.m8907(AbstractC3933.m8304(c4536, this), str2)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbM11582 = AbstractC6183.m11582("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbM11582.append(this);
            throw new KotlinReflectionInternalError(sbM11582.toString());
        }
        if (arrayList2.size() <= 1) {
            return (C4536) AbstractC4344.m8779(arrayList2);
        }
        StringBuilder sbM115822 = AbstractC6183.m11582("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbM115822.append(this);
        throw new KotlinReflectionInternalError(sbM115822.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Method m9977(String str, String str2) {
        Method methodM9974;
        str.getClass();
        str2.getClass();
        if (str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            return null;
        }
        C0076 c0076M10076 = AbstractC5067.m10076(AbstractC4431.m8974(mo8879()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) c0076M10076.f227).toArray(new Class[0]);
        Class cls = (Class) c0076M10076.f228;
        cls.getClass();
        Method methodM99742 = m9974(mo9972(), str, clsArr, cls, false);
        if (methodM99742 != null) {
            return methodM99742;
        }
        if (!mo9972().isInterface() || (methodM9974 = m9974(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodM9974;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Method m9978(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo8879());
        }
        C0076 c0076M10076 = AbstractC5067.m10076(AbstractC4431.m8974(mo8879()), str2, true);
        m9975(arrayList, (ArrayList) c0076M10076.f227, false, z2);
        Class clsMo9972 = mo9972();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) c0076M10076.f228;
        cls.getClass();
        return m9974(clsMo9972, strConcat, clsArr, cls, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4965 m9979(int i, String str) {
        str.getClass();
        C4536 c4536Mo9932 = mo9932(i);
        if (c4536Mo9932 == null) {
            return null;
        }
        if (c4536Mo9932.f13213 == null) {
            return AbstractC4545.f13272.m577(c4536Mo9932, AbstractC4545.f13263[36]) ? new C4997(this, str, null, c4536Mo9932) : new C4965(this, str, null, c4536Mo9932);
        }
        throw new KotlinReflectionInternalError(AbstractC0053.m151(new StringBuilder("Local property "), c4536Mo9932.f13217, " is an extension, which is not yet supported"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public abstract Collection mo9931(C4691 c4691);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public Class mo9972() {
        Class clsMo8879 = mo8879();
        List list = AbstractC4431.f13055;
        clsMo8879.getClass();
        Class cls = (Class) AbstractC4431.f13053.get(clsMo8879);
        return cls == null ? mo8879() : cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public abstract C4536 mo9932(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public abstract InterfaceC4473 mo9933(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public abstract Collection mo9934(C4691 c4691);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract Collection mo9935();
}
