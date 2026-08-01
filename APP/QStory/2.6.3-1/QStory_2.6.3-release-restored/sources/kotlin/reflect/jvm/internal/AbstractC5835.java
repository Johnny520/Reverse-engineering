package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import io.ktor.client.plugins.AbstractC4765;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.InterfaceC5219;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5369;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p025.AbstractC7012;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5835 implements InterfaceC5219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Regex f14767 = new Regex("<v#(\\d+)>");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static Method m10532(Class cls, Class cls2, String str, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC5227.m9466(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC5227.m9466(method.getName(), str) && AbstractC5227.m9466(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static Method m10533(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodM10533;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM10532 = m10532(cls, cls2, str, clsArr);
        if (methodM10532 != null) {
            return methodM10532;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM10533 = m10533(superclass, str, clsArr, cls2, z)) != null) {
            return methodM10533;
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
            Method methodM105332 = m10533(cls4, str, clsArr, cls2, z);
            if (methodM105332 != null) {
                return methodM105332;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, AbstractC5263.m9533(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodM105322 = m10532(cls3, cls2, str, clsArr);
                    if (methodM105322 != null) {
                        return methodM105322;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m10534(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        Class cls;
        cls = AbstractC5217.class;
        boolean zM9466 = AbstractC5227.m9466(AbstractC5176.m9371(arrayList2), cls);
        List listSubList = arrayList2;
        if (zM9466) {
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
        arrayList.add(z ? AbstractC5217.class : Object.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C5368 m10535(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) ((C5825) ((C5824) this).f14750.getValue()).f14755.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5176.m9363(((C5369) it.next()).f13575, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C5368 c5368 = (C5368) obj;
            if (AbstractC5227.m9466(c5368.f13562, str) && AbstractC5227.m9466(AbstractC4765.m8863(c5368, this), str2)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbM12141 = AbstractC7012.m12141("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbM12141.append(this);
            throw new KotlinReflectionInternalError(sbM12141.toString());
        }
        if (arrayList2.size() <= 1) {
            return (C5368) AbstractC5176.m9338(arrayList2);
        }
        StringBuilder sbM121412 = AbstractC7012.m12141("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbM121412.append(this);
        throw new KotlinReflectionInternalError(sbM121412.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Method m10536(String str, String str2) {
        Method methodM10533;
        str.getClass();
        str2.getClass();
        if (str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            return null;
        }
        C0923 c0923M10635 = AbstractC5899.m10635(AbstractC5263.m9533(mo9438()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) c0923M10635.f572).toArray(new Class[0]);
        Class cls = (Class) c0923M10635.f573;
        cls.getClass();
        Method methodM105332 = m10533(mo10531(), str, clsArr, cls, false);
        if (methodM105332 != null) {
            return methodM105332;
        }
        if (!mo10531().isInterface() || (methodM10533 = m10533(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodM10533;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Method m10537(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo9438());
        }
        C0923 c0923M10635 = AbstractC5899.m10635(AbstractC5263.m9533(mo9438()), str2, true);
        m10534(arrayList, (ArrayList) c0923M10635.f572, false, z2);
        Class clsMo10531 = mo10531();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) c0923M10635.f573;
        cls.getClass();
        return m10533(clsMo10531, strConcat, clsArr, cls, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5797 m10538(int i, String str) {
        str.getClass();
        C5368 c5368Mo10491 = mo10491(i);
        if (c5368Mo10491 == null) {
            return null;
        }
        if (c5368Mo10491.f13558 == null) {
            return AbstractC5377.f13617.m1137(c5368Mo10491, AbstractC5377.f13608[36]) ? new C5829(this, str, null, c5368Mo10491) : new C5797(this, str, null, c5368Mo10491);
        }
        throw new KotlinReflectionInternalError(AbstractC0900.m711(new StringBuilder("Local property "), c5368Mo10491.f13562, " is an extension, which is not yet supported"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public abstract Collection mo10490(C5523 c5523);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public Class mo10531() {
        Class clsMo9438 = mo9438();
        List list = AbstractC5263.f13400;
        clsMo9438.getClass();
        Class cls = (Class) AbstractC5263.f13398.get(clsMo9438);
        return cls == null ? mo9438() : cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public abstract C5368 mo10491(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public abstract InterfaceC5305 mo10492(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public abstract Collection mo10493(C5523 c5523);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract Collection mo10494();
}
