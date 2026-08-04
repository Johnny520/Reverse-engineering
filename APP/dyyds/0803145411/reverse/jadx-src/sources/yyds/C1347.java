package yyds;

import android.os.Looper;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᛶᛵᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1347 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1784 f6236;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6237 = 1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Class f6238;

    public /* synthetic */ C1347(Class cls, C1784 c1784) {
        this.f6238 = cls;
        this.f6236 = c1784;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c8  */
    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo371(Object obj) {
        Object obj2;
        Object c2658;
        Boolean bool;
        Long l;
        Object next;
        C2746 c2746;
        C1628 c1628M3570;
        Object c26582;
        C2746 c27462;
        Object objM3161;
        switch (this.f6237) {
            case 0:
                C2746 c27463 = C2746.f13459;
                C1784 c1784 = this.f6236;
                final Class cls = this.f6238;
                AbstractC2328.m4341(-1009664779780974L);
                final Object obj3 = ((C1829) obj).f9184;
                if (obj3 != null) {
                    c1784.getClass();
                    Method method = (Method) C1784.f9007.getValue();
                    if (method == null) {
                        bool = null;
                        if (bool != null) {
                            final boolean zBooleanValue = bool.booleanValue();
                            Map map = C1784.f9003;
                            AbstractC2328.m4341(-1005807899149166L);
                            synchronized (map) {
                                l = (Long) map.get(obj3);
                            }
                            if (l != null) {
                                final long jLongValue = l.longValue();
                                Runnable runnable = new Runnable() { // from class: yyds.ᛵᲈᛱᛴ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Long l2;
                                        Object c26583;
                                        C1628 c1628M35702;
                                        long j = jLongValue;
                                        Object obj4 = obj3;
                                        Class cls2 = cls;
                                        boolean z = zBooleanValue;
                                        Map map2 = C1784.f9003;
                                        AbstractC2328.m4341(-1009737794225006L);
                                        synchronized (map2) {
                                            l2 = (Long) map2.get(obj4);
                                        }
                                        if (l2 != null && l2.longValue() == j) {
                                            C1784 c17842 = C1784.f9011;
                                            try {
                                                c17842.getClass();
                                                ImageView imageViewM3561 = C1784.m3561(obj4, cls2);
                                                if (imageViewM3561 != null && (c1628M35702 = c17842.m3570(imageViewM3561)) != null) {
                                                    C1784.m3553(c1628M35702, AbstractC2328.m4341(-1005769244443502L) + j);
                                                    C2535 c2535M3329 = c1628M35702.m3329();
                                                    EnumC1796 enumC1796 = EnumC1796.f9060;
                                                    c2535M3329.getClass();
                                                    AbstractC2328.m4341(-999580196569966L);
                                                    c2535M3329.f12485 = enumC1796;
                                                    C1784.m3562(c1628M35702, z, true, true, false);
                                                }
                                                c26583 = C2746.f13459;
                                            } catch (Throwable th) {
                                                c26583 = new C2658(th);
                                            }
                                            Throwable thM4249 = C2248.m4249(c26583);
                                            if (thM4249 != null) {
                                                C2336.f11496.m4355(AbstractC2328.m4341(-1009849463374702L), thM4249);
                                            }
                                        }
                                    }
                                };
                                if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
                                    runnable.run();
                                } else {
                                    C1784.f8999.post(runnable);
                                }
                            }
                        }
                    } else {
                        Map map2 = C1784.f9004;
                        AbstractC2328.m4341(-1005584560849774L);
                        synchronized (map2) {
                            WeakReference weakReference = (WeakReference) map2.get(obj3);
                            obj2 = weakReference != null ? weakReference.get() : null;
                            break;
                        }
                        if (obj2 != null) {
                            try {
                                Object objInvoke = method.invoke(obj2, null);
                                c2658 = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                            } catch (Throwable th) {
                                c2658 = new C2658(th);
                            }
                            Throwable thM4249 = C2248.m4249(c2658);
                            if (thM4249 != null) {
                                C2336.f11496.m4355(AbstractC2328.m4341(-1005683345097582L), thM4249);
                            }
                            bool = (Boolean) (c2658 instanceof C2658 ? null : c2658);
                            break;
                        }
                        if (bool != null) {
                        }
                    }
                }
                return c27463;
            default:
                C2746 c27464 = C2746.f13459;
                Class cls2 = this.f6238;
                C1784 c17842 = this.f6236;
                C1829 c1829 = (C1829) obj;
                AbstractC2328.m4341(-1009368427037550L);
                Iterator it = c1829.f9185.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (cls2.isInstance(next)) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next == null) {
                    return c27464;
                }
                long jIncrementAndGet = C1784.f8995.incrementAndGet();
                Map map3 = C1784.f9003;
                AbstractC2328.m4341(-1009441441481582L);
                synchronized (map3) {
                    AbstractC2328.m4341(-1009553110631278L);
                    map3.put(next, Long.valueOf(jIncrementAndGet));
                }
                ArrayList arrayList = c1829.f9185;
                Method method2 = (Method) C1784.f9007.getValue();
                if (method2 != null) {
                    Class<?> declaringClass = method2.getDeclaringClass();
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            objM3161 = it2.next();
                            if (objM3161 == null || !declaringClass.isInstance(objM3161)) {
                                objM3161 = null;
                            }
                            if (objM3161 != null) {
                            }
                        } else {
                            objM3161 = null;
                        }
                    }
                    if (objM3161 == null) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                if (next2 == null) {
                                    objM3161 = null;
                                } else {
                                    Method[] methods = next2.getClass().getMethods();
                                    AbstractC2328.m4341(-1005318272877422L);
                                    objM3161 = AbstractC1529.m3161(AbstractC1529.m3164(AbstractC1529.m3163(AbstractC2070.m3935(methods), new C2553(declaringClass, 0)), new C2001(declaringClass, 4, next2)));
                                }
                                if (objM3161 != null) {
                                }
                            } else {
                                objM3161 = null;
                            }
                        }
                    }
                    if (objM3161 != null) {
                        Map map4 = C1784.f9004;
                        AbstractC2328.m4341(-1005386992354158L);
                        synchronized (map4) {
                            AbstractC2328.m4341(-1005485776601966L);
                            map4.put(next, new WeakReference(objM3161));
                        }
                    }
                }
                ConcurrentHashMap.KeySetView keySetView = C1784.f8994;
                Class cls3 = Void.TYPE;
                Class cls4 = Boolean.TYPE;
                C1784.m3561(next, cls2);
                Method[] methods2 = cls2.getMethods();
                AbstractC2328.m4341(-1004948905689966L);
                ArrayList arrayList2 = new ArrayList();
                for (Method method3 : methods2) {
                    if (Arrays.equals(method3.getParameterTypes(), new Class[]{cls4}) && AbstractC1544.m3188(method3.getReturnType(), cls3)) {
                        arrayList2.add(method3);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    linkedHashSet.add(((Method) it4.next()).getName());
                }
                if (linkedHashSet.isEmpty() || ((Method) C1784.f9007.getValue()) == null) {
                    c2746 = c27464;
                    if (C1784.f8990.add(cls2.getName())) {
                        C2336.f11496.m4354(AbstractC2328.m4341(-1005017625166702L));
                    }
                } else {
                    Method[] methods3 = next.getClass().getMethods();
                    AbstractC2328.m4341(-1005159359087470L);
                    ArrayList<Method> arrayList3 = new ArrayList();
                    int length = methods3.length;
                    int i = 0;
                    while (i < length) {
                        Method method4 = methods3[i];
                        if (Modifier.isAbstract(method4.getModifiers()) || !linkedHashSet.contains(method4.getName())) {
                            c27462 = c27464;
                        } else {
                            c27462 = c27464;
                            if (Arrays.equals(method4.getParameterTypes(), new Class[]{cls4}) && AbstractC1544.m3188(method4.getReturnType(), cls3)) {
                                arrayList3.add(method4);
                            }
                        }
                        i++;
                        c27464 = c27462;
                    }
                    c2746 = c27464;
                    for (Method method5 : arrayList3) {
                        String str = AbstractC2328.m4341(-1005228078564206L) + method5.toGenericString();
                        if (keySetView.add(str)) {
                            C1784 c17843 = C1784.f9011;
                            try {
                                method5.setAccessible(true);
                                c17843.m688(method5, null, new C1347(c17843, cls2));
                                c26582 = C2746.f13459;
                            } catch (Throwable th2) {
                                c26582 = new C2658(th2);
                            }
                            if (C2248.m4249(c26582) != null) {
                                keySetView.remove(str);
                            }
                            break;
                        }
                    }
                }
                ImageView imageViewM3561 = C1784.m3561(next, cls2);
                if (imageViewM3561 == null || (c1628M3570 = c17842.m3570(imageViewM3561)) == null) {
                    return c2746;
                }
                C1784 c17844 = C1784.f9011;
                String str2 = AbstractC2328.m4341(-1005919568298862L) + jIncrementAndGet;
                c17844.getClass();
                C1784.m3553(c1628M3570, str2);
                return c2746;
        }
    }

    public /* synthetic */ C1347(C1784 c1784, Class cls) {
        this.f6236 = c1784;
        this.f6238 = cls;
    }
}
