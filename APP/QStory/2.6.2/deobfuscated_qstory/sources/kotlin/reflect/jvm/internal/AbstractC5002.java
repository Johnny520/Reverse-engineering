package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4384;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.InterfaceC4386;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p033.AbstractC6325;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5002 implements InterfaceC4386 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Regex f14420 = new Regex("<v#(\\d+)>");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static Method m9976(Class cls, Class cls2, String str, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC4394.m8917(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC4394.m8917(method.getName(), str) && AbstractC4394.m8917(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static Method m9977(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodM9977;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM9976 = m9976(cls, cls2, str, clsArr);
        if (methodM9976 != null) {
            return methodM9976;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM9977 = m9977(superclass, str, clsArr, cls2, z)) != null) {
            return methodM9977;
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
            Method methodM99772 = m9977(cls4, str, clsArr, cls2, z);
            if (methodM99772 != null) {
                return methodM99772;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, AbstractC4430.m8984(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodM99762 = m9976(cls3, cls2, str, clsArr);
                    if (methodM99762 != null) {
                        return methodM99762;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m9978(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        Class cls;
        cls = AbstractC4384.class;
        boolean zM8917 = AbstractC4394.m8917(AbstractC4343.m8810(arrayList2), cls);
        List listSubList = arrayList2;
        if (zM8917) {
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
        arrayList.add(z ? AbstractC4384.class : Object.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4535 m9979(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) ((C4992) ((C4991) this).f14403.getValue()).f14408.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4343.m8794(((C4536) it.next()).f13226, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C4535 c4535 = (C4535) obj;
            if (AbstractC4394.m8917(c4535.f13213, str) && AbstractC4394.m8917(AbstractC6325.m11870(c4535, this), str2)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbM11551 = AbstractC6136.m11551("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbM11551.append(this);
            throw new KotlinReflectionInternalError(sbM11551.toString());
        }
        if (arrayList2.size() <= 1) {
            return (C4535) AbstractC4343.m8818(arrayList2);
        }
        StringBuilder sbM115512 = AbstractC6136.m11551("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbM115512.append(this);
        throw new KotlinReflectionInternalError(sbM115512.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Method m9980(String str, String str2) {
        Method methodM9977;
        str.getClass();
        str2.getClass();
        if (str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            return null;
        }
        C0076 c0076M10072 = AbstractC5066.m10072(AbstractC4430.m8984(mo8889()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) c0076M10072.f227).toArray(new Class[0]);
        Class cls = (Class) c0076M10072.f228;
        cls.getClass();
        Method methodM99772 = m9977(mo9975(), str, clsArr, cls, false);
        if (methodM99772 != null) {
            return methodM99772;
        }
        if (!mo9975().isInterface() || (methodM9977 = m9977(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodM9977;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Method m9981(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo8889());
        }
        C0076 c0076M10072 = AbstractC5066.m10072(AbstractC4430.m8984(mo8889()), str2, true);
        m9978(arrayList, (ArrayList) c0076M10072.f227, false, z2);
        Class clsMo9975 = mo9975();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) c0076M10072.f228;
        cls.getClass();
        return m9977(clsMo9975, strConcat, clsArr, cls, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4964 m9982(int i, String str) {
        str.getClass();
        C4535 c4535Mo9935 = mo9935(i);
        if (c4535Mo9935 == null) {
            return null;
        }
        if (c4535Mo9935.f13209 == null) {
            return AbstractC4544.f13268.m576(c4535Mo9935, AbstractC4544.f13259[36]) ? new C4996(this, str, null, c4535Mo9935) : new C4964(this, str, null, c4535Mo9935);
        }
        throw new KotlinReflectionInternalError(AbstractC0053.m146(new StringBuilder("Local property "), c4535Mo9935.f13213, " is an extension, which is not yet supported"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public abstract Collection mo9934(C4690 c4690);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public Class mo9975() {
        Class clsMo8889 = mo8889();
        List list = AbstractC4430.f13051;
        clsMo8889.getClass();
        Class cls = (Class) AbstractC4430.f13049.get(clsMo8889);
        return cls == null ? mo8889() : cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public abstract C4535 mo9935(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public abstract InterfaceC4472 mo9936(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public abstract Collection mo9937(C4690 c4690);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract Collection mo9938();
}
