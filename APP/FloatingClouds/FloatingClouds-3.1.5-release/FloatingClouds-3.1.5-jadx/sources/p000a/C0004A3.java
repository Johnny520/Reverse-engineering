package p000a;

import android.content.Context;
import android.os.Vibrator;
import androidx.activity.ComponentActivity;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import p000a.C0518ca;
import p000a.C0816s4;
import p000a.C0879va;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.A3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0004A3 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f28b;

    public /* synthetic */ C0004A3(int i, Object obj) {
        this.f27a = i;
        this.f28b = obj;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        C0518ca.b bVar;
        Object objM2206a;
        Context context;
        Method method;
        Object objM2206a2;
        Object obj = null;
        switch (this.f27a) {
            case 0:
                return ((ComponentActivity) this.f28b).lambda$new$0();
            case 1:
                C0816s4.a.C1338a.EnumC1339a enumC1339a = (C0816s4.a.C1338a.EnumC1339a) this.f28b;
                C0631i9.m1482e(enumC1339a, "expected");
                C0915x8 c0915x8 = C0915x8.f3530a;
                int iOrdinal = enumC1339a.ordinal();
                if (iOrdinal == 0) {
                    bVar = C0518ca.b.f1897a;
                } else if (iOrdinal == 1) {
                    bVar = C0518ca.b.f1898b;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0266Ob();
                    }
                    bVar = C0518ca.b.f1899c;
                }
                return Boolean.valueOf(C0915x8.f3531b == bVar);
            case 2:
                ((C0611h8) this.f28b).m1464j();
                return C0413Wf.f1577a;
            case 3:
                C0698m0 c0698m0 = C0698m0.f2635a;
                ActivityC0422X6 activityC0422X6M2540z = ((C0425X9) this.f28b).m2540z();
                c0698m0.getClass();
                if (!C0698m0.f2637c) {
                    C0698m0.m1590c(activityC0422X6M2540z);
                }
                return C0413Wf.f1577a;
            case 4:
                C0653jc c0653jc = (C0653jc) this.f28b;
                C0879va.a aVar = C0879va.f3444g;
                int i = c0653jc.f2419K;
                aVar.getClass();
                try {
                    context = C0889w1.f3488p;
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                if (context != null) {
                    Object systemService = context.getSystemService("vibrator");
                    Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
                    if (vibrator != null) {
                        C0879va.a.m2105a(vibrator, i);
                        objM2206a = C0413Wf.f1577a;
                        break;
                    }
                    Throwable thM2189a = C0901wd.m2189a(objM2206a);
                    if (thM2189a != null) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[MaskedMsgVibrate] preview vibrate fail", thM2189a}, 2));
                    }
                }
                return C0413Wf.f1577a;
            case 5:
                XposedInterface.Chain chain = (XposedInterface.Chain) this.f28b;
                Object objProceed = chain.proceed();
                if (objProceed == null) {
                    objProceed = chain.getThisObject();
                }
                if (objProceed != null && C0122Gb.f395g == null) {
                    C0122Gb c0122Gb = C0122Gb.f389a;
                    Class<?> cls = objProceed.getClass();
                    c0122Gb.getClass();
                    if (C0122Gb.m317e(cls)) {
                        C0122Gb.f395g = objProceed;
                        C0122Gb.m322j("captureLiveStorageInstance: captured ".concat(objProceed.getClass().getName()));
                        C0908x1.m2194b("ConvHide", "captureLiveStorageInstance: captured ".concat(objProceed.getClass().getName()));
                        if (!C0122Gb.f390b) {
                            try {
                                Method methodM315c = C0122Gb.m315c(objProceed.getClass());
                                if (methodM315c != null) {
                                    C0122Gb.f391c = objProceed;
                                    C0122Gb.f392d = methodM315c;
                                    Class<?> superclass = objProceed.getClass();
                                    C0263O8 c0263o8 = new C0263O8(19);
                                    while (true) {
                                        if (superclass != null) {
                                            Method[] declaredMethods = superclass.getDeclaredMethods();
                                            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                                            int length = declaredMethods.length;
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 < length) {
                                                    method = declaredMethods[i2];
                                                    if (!((Boolean) c0263o8.mo53f(method)).booleanValue()) {
                                                        i2++;
                                                    }
                                                } else {
                                                    method = null;
                                                }
                                            }
                                            if (method == null) {
                                                superclass = superclass.getSuperclass();
                                            }
                                        } else {
                                            method = null;
                                        }
                                    }
                                    if (method != null) {
                                        method.setAccessible(true);
                                    } else {
                                        method = null;
                                    }
                                    C0122Gb.f393e = method;
                                    if (method != null) {
                                        try {
                                            objM2206a2 = method.invoke(objProceed, "filehelper");
                                        } catch (Throwable th2) {
                                            objM2206a2 = C0920xd.m2206a(th2);
                                        }
                                        if (!(objM2206a2 instanceof C0901wd.a)) {
                                            obj = objM2206a2;
                                        }
                                        if (obj != null) {
                                            for (Class<?> superclass2 = obj.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                                                try {
                                                    Field declaredField = superclass2.getDeclaredField("field_parentRef");
                                                    declaredField.setAccessible(true);
                                                    C0122Gb.f394f = declaredField;
                                                } catch (NoSuchFieldException unused) {
                                                }
                                            }
                                        }
                                    }
                                    C0122Gb.f390b = true;
                                    C0122Gb.f389a.getClass();
                                    C0122Gb.m322j("captureLiveStorageInstance: IMMEDIATE resolve OK, methodsReady=true");
                                    C0908x1.m2194b("ConvHide", "captureLiveStorageInstance: immediate resolve OK");
                                }
                            } catch (Throwable th3) {
                                C0122Gb c0122Gb2 = C0122Gb.f389a;
                                String str = "captureLiveStorageInstance: immediate resolve failed: " + th3.getMessage();
                                c0122Gb2.getClass();
                                C0122Gb.m322j(str);
                            }
                        }
                    }
                    break;
                }
                return objProceed;
            default:
                return (Class) this.f28b;
        }
    }
}
