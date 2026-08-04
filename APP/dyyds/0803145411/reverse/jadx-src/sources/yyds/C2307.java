package yyds;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.im.core.model.Message;
import com.tencent.mmkv.MMKV;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲁᲀᛳ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2307 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11312;

    public /* synthetic */ C2307(int i) {
        this.f11312 = i;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        Class<?> returnType;
        Class<?> declaringClass;
        Object c2658;
        Object c26582;
        ArrayList<Pair> arrayList;
        Object c26583;
        ApplicationInfo applicationInfo = null;
        switch (this.f11312) {
            case 0:
                return C2746.f13459;
            case 1:
                C2701.f13261.getClass();
                C0474 c0474 = C2701.f13267;
                if (c0474 != null) {
                    return c0474;
                }
                AbstractC2328.m4341(-740288725943150L);
                return null;
            case 2:
                C2701.f13261.getClass();
                return Long.valueOf(C2701.m4785().getFrameworkVersionCode());
            case 3:
                C2701.f13261.getClass();
                return C2701.m4785().getFrameworkVersion();
            case 4:
                C2701.f13261.getClass();
                ApplicationInfo applicationInfo2 = C2701.f13266;
                if (applicationInfo2 != null) {
                    applicationInfo = applicationInfo2;
                } else {
                    AbstractC2328.m4341(-739927948690286L);
                }
                return applicationInfo.sourceDir;
            case 5:
                C1322 c1322 = C1322.f6081;
                EnumC1543 enumC1543 = EnumC1543.f7665;
                c1322.getClass();
                C2068 c2068M666 = AbstractC0145.m666(enumC1543);
                if (c2068M666 != null) {
                    return c2068M666.f10221;
                }
                return null;
            case 6:
                C1322 c13222 = C1322.f6081;
                EnumC1543 enumC15432 = EnumC1543.f7533;
                c13222.getClass();
                C2068 c2068M6662 = AbstractC0145.m666(enumC15432);
                if (c2068M6662 != null) {
                    return c2068M6662.f10221;
                }
                return null;
            case 7:
                C1322 c13223 = C1322.f6081;
                EnumC1543 enumC15433 = EnumC1543.f7556;
                c13223.getClass();
                Method methodM664 = AbstractC0145.m664(enumC15433);
                if (methodM664 == null) {
                    return null;
                }
                methodM664.setAccessible(true);
                return methodM664;
            case 8:
                C1322.f6081.getClass();
                Method method = (Method) C1322.f6078.getValue();
                if (method == null || (declaringClass = method.getDeclaringClass()) == null) {
                    return null;
                }
                try {
                    c2658 = Class.forName(AbstractC2328.m4341(-1070378437477230L), false, declaringClass.getClassLoader());
                    break;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                boolean z = c2658 instanceof C2658;
                Object obj = c2658;
                if (z) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Constructor<?>[] declaredConstructors = declaringClass.getDeclaredConstructors();
                AbstractC2328.m4341(-1070618955645806L);
                int length = declaredConstructors.length;
                int i = 0;
                boolean z2 = false;
                Constructor<?> constructor = null;
                while (true) {
                    if (i < length) {
                        Constructor<?> constructor2 = declaredConstructors[i];
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        if (parameterTypes.length == 3 && AbstractC1544.m3188(parameterTypes[0], Context.class) && parameterTypes[1].getName().equals(Message.class.getName()) && (cls == null || cls.isAssignableFrom(parameterTypes[2]))) {
                            if (!z2) {
                                z2 = true;
                                constructor = constructor2;
                            }
                        }
                        i++;
                        z2 = z2;
                    } else if (!z2) {
                    }
                }
                constructor = null;
                if (constructor == null) {
                    return null;
                }
                constructor.setAccessible(true);
                return constructor;
            case 9:
                String strM4341 = AbstractC2328.m4341(-747783443874670L);
                String strM43412 = AbstractC2328.m4341(-747804918711150L);
                EnumMap enumMap = MMKV.f530;
                C1760 c1760 = new C1760(5, (byte) 0);
                c1760.f8838 = 2;
                c1760.f8839 = strM43412;
                MMKV mmkvM365 = MMKV.m365(strM4341, c1760);
                AbstractC2328.m4341(-747912292893550L);
                return mmkvM365;
            case 10:
                String strM43413 = AbstractC2328.m4341(-747981012370286L);
                String strM43414 = AbstractC2328.m4341(-748011077141358L);
                EnumMap enumMap2 = MMKV.f530;
                C1760 c17602 = new C1760(5, (byte) 0);
                c17602.f8838 = 2;
                c17602.f8839 = strM43414;
                MMKV mmkvM3652 = MMKV.m365(strM43413, c17602);
                AbstractC2328.m4341(-748084091585390L);
                return mmkvM3652;
            case 11:
                String strM43415 = AbstractC2328.m4341(-748152811062126L);
                String strM43416 = AbstractC2328.m4341(-748182875833198L);
                EnumMap enumMap3 = MMKV.f530;
                C1760 c17603 = new C1760(5, (byte) 0);
                c17603.f8838 = 2;
                c17603.f8839 = strM43416;
                MMKV mmkvM3653 = MMKV.m365(strM43415, c17603);
                AbstractC2328.m4341(-748324609753966L);
                return mmkvM3653;
            case 12:
                return new C0114();
            case 13:
                ViewGroup viewGroup = AbstractC0606.f2922;
                if (viewGroup != null) {
                    C1509.f7142.getClass();
                    viewGroup.setAlpha(C1509.m3052() / 100.0f);
                }
                View view = AbstractC0606.f2946;
                if (view != null) {
                    C1509.f7142.getClass();
                    view.setAlpha(C1509.m3112() / 100.0f);
                }
                C1985.m3845();
                return C2746.f13459;
            case 14:
                ViewGroup viewGroup2 = AbstractC0606.f2922;
                if (viewGroup2 != null) {
                    C1509.f7142.getClass();
                    viewGroup2.setAlpha(C1509.m3052() / 100.0f);
                }
                View view2 = AbstractC0606.f2946;
                if (view2 != null) {
                    C1509.f7142.getClass();
                    view2.setAlpha(C1509.m3112() / 100.0f);
                }
                C1985.m3845();
                return C2746.f13459;
            case 15:
                ViewGroup viewGroup3 = AbstractC0606.f2922;
                if (viewGroup3 != null) {
                    C1509.f7142.getClass();
                    viewGroup3.setAlpha(C1509.m3057(C1509.m3046()));
                }
                View view3 = AbstractC0606.f2946;
                if (view3 != null) {
                    C1509.f7142.getClass();
                    view3.setAlpha(C1509.m3057(C1509.m3059()));
                }
                C1985.m3845();
                return C2746.f13459;
            case 16:
                C1784 c1784 = C1784.f9011;
                try {
                    C1329 c1329 = C1329.f6114;
                    String strM43417 = AbstractC2328.m4341(-640911772648302L);
                    AbstractC2328.m4341(-641006261928814L);
                    C0757 c0757 = (C0757) C1586.m3253(strM43417);
                    if (c0757 != null) {
                        Method methodM1702 = C0757.m1702(c0757, c1784.m678());
                        methodM1702.setAccessible(true);
                        c26582 = methodM1702;
                    } else {
                        c26582 = null;
                    }
                    break;
                } catch (Throwable th2) {
                    c26582 = new C2658(th2);
                }
                Throwable thM4249 = C2248.m4249(c26582);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1007921023058798L), thM4249);
                }
                return (Method) (c26582 instanceof C2658 ? null : c26582);
            case 17:
                C0142.f880.getClass();
                if (C0142.m657() == 5) {
                    C0142.m642();
                }
                return C2746.f13459;
            case 18:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 19:
                try {
                    Method method2 = (Method) C0574.f2762.getValue();
                    if (method2 == null || (returnType = method2.getReturnType()) == null) {
                        return null;
                    }
                    Class cls2 = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls2, SQLiteTransactionListener.class, cls2, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 20:
                WeakHashMap weakHashMap = C0154.f955;
                synchronized (weakHashMap) {
                    Set<Map.Entry> setEntrySet = weakHashMap.entrySet();
                    AbstractC2328.m4341(-1014144430670702L);
                    arrayList = new ArrayList(AbstractC0055.m419(setEntrySet, 10));
                    for (Map.Entry entry : setEntrySet) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                        break;
                    }
                }
                C1509.f7142.getClass();
                if (!C1509.m3101()) {
                    for (Pair pair : arrayList) {
                        Object objComponent1 = pair.component1();
                        C0272 c0272 = (C0272) pair.component2();
                        try {
                            Method method3 = c0272.f1475;
                            Object[] objArr = c0272.f1476;
                            c26583 = method3.invoke(objComponent1, Arrays.copyOf(objArr, objArr.length));
                        } catch (Throwable th3) {
                            c26583 = new C2658(th3);
                        }
                        Throwable thM42492 = C2248.m4249(c26583);
                        if (thM42492 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-1014226035049326L), thM42492);
                        }
                        break;
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object objComponent12 = ((Pair) it.next()).component1();
                        C0154.f959.getClass();
                        C0154.m701(objComponent12);
                    }
                }
                return C2746.f13459;
            case 21:
                C0436 c0436 = new C0436();
                c0436.f2220 = C0738.f3426;
                return new C0114(c0436);
            case 22:
                C1206 c1206 = AbstractC0221.f1238;
                return AbstractC1917.m3696(AbstractC0879.m1960(ExecutorC2482.f12272, AbstractC1741.m3466()));
            case 23:
                return AbstractC1917.m3700();
            case 24:
                return AbstractC1917.m3700();
            case 25:
                return new C2424();
            case 26:
                C2787 c2787 = new C2787();
                c2787.f13625 = AbstractC0795.m1804(10L);
                c2787.f13618 = AbstractC0795.m1804(30L);
                c2787.f13639 = AbstractC0795.m1804(30L);
                c2787.f13637 = true;
                return new C1284(c2787);
            case 27:
                return C2746.f13459;
            case 28:
                return C2746.f13459;
            default:
                return AbstractC1090.m2300("KavaRef");
        }
    }

    public /* synthetic */ C2307(C0522 c0522, int i) {
        this.f11312 = i;
    }
}
