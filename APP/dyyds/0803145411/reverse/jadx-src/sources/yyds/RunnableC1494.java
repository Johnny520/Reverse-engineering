package yyds;

import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛷᛲᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1494 implements Runnable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7044;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7045;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f7046;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7047;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7048;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f7049;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f7050;

    public /* synthetic */ RunnableC1494(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f7048 = i;
        this.f7050 = obj;
        this.f7046 = obj2;
        this.f7049 = obj3;
        this.f7047 = obj4;
        this.f7044 = obj5;
        this.f7045 = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object c2658;
        int i;
        View view;
        Object c26582;
        Object c26583;
        Object objInvoke;
        Object c26584;
        Object objInvoke2;
        Object obj = null;
        boolean z = true;
        switch (this.f7048) {
            case 0:
                C2219 c2219 = (C2219) this.f7050;
                C1783 c1783 = (C1783) this.f7046;
                Object obj2 = this.f7049;
                Object obj3 = this.f7047;
                String str = (String) this.f7044;
                Long l = (Long) this.f7045;
                C1332 c1332 = C1332.f6157;
                C2219 c2219M2736 = C1332.m2736();
                if (!c2219M2736.m4209() || !c2219M2736.equals(c2219)) {
                    C1332.m2731(c1783, false);
                    return;
                }
                if (!C1332.m2726(obj2, c1783, obj3, str)) {
                    C1332.m2731(c1783, false);
                    return;
                }
                Method method = C1332.f6159;
                if (method == null) {
                    C1332.m2731(c1783, false);
                    return;
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC2328.m4341(-795333026808686L);
                Class cls = (Class) AbstractC2070.m3931(1, parameterTypes);
                if (cls == null) {
                    C1332.m2731(c1783, false);
                    return;
                }
                Object[] enumConstants = cls.getEnumConstants();
                if (enumConstants != null) {
                    for (Object obj4 : enumConstants) {
                        Enum r11 = obj4 instanceof Enum ? (Enum) obj4 : null;
                        if (AbstractC1544.m3188(r11 != null ? r11.name() : null, AbstractC2328.m4341(-795431811056494L)) || AbstractC1544.m3188(obj4.toString(), AbstractC2328.m4341(-795461875827566L))) {
                            obj = obj4;
                            if (obj != null) {
                                synchronized (c1783) {
                                    if (c1783.f8986 == l.longValue() && c1783.f8985 && !c1783.f8980 && (i = c1783.f8988) > 0) {
                                        c1783.f8985 = false;
                                        c1783.f8980 = true;
                                        c1783.f8988 = i - 1;
                                    } else {
                                        z = false;
                                    }
                                    break;
                                }
                                if (z) {
                                    try {
                                        c2658 = method.invoke(obj2, obj3, obj);
                                        break;
                                    } catch (Throwable th) {
                                        c2658 = new C2658(th);
                                    }
                                    Throwable thM4249 = C2248.m4249(c2658);
                                    if (thM4249 != null) {
                                        C1332 c13322 = C1332.f6157;
                                        C1332.m2731(c1783, false);
                                        C2336.f11496.m4355(AbstractC2328.m4341(-795702393996142L), thM4249);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    if (obj != null) {
                    }
                }
                C1332 c13323 = C1332.f6157;
                C1332.m2731(c1783, false);
                C2336.f11496.m4354(AbstractC2328.m4341(-795491940598638L));
                return;
            default:
                ArrayList<C0700> arrayList = (ArrayList) this.f7050;
                ArrayList<Pair> arrayList2 = (ArrayList) this.f7046;
                ArrayList<Pair> arrayList3 = (ArrayList) this.f7049;
                Method method2 = (Method) this.f7047;
                Method method3 = (Method) this.f7044;
                C1278 c1278 = (C1278) this.f7045;
                for (C0700 c0700 : arrayList) {
                    ImageView imageView = c0700.f3305;
                    if (imageView == null || imageView.isAttachedToWindow()) {
                        if (method2 != null) {
                            try {
                                objInvoke2 = method2.invoke(c0700.f3303, c0700.f3304);
                            } catch (Throwable th2) {
                                c26584 = new C2658(th2);
                            }
                        } else {
                            objInvoke2 = null;
                        }
                        c26584 = objInvoke2;
                        Throwable thM42492 = C2248.m4249(c26584);
                        if (thM42492 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-831891788432238L), thM42492);
                        }
                        break;
                    }
                }
                for (Pair pair : arrayList2) {
                    Object objComponent1 = pair.component1();
                    View view2 = (View) pair.component2();
                    if (view2 != null && view2.isAttachedToWindow()) {
                        if (method3 != null) {
                            try {
                                objInvoke = method3.invoke(objComponent1, null);
                            } catch (Throwable th3) {
                                c26583 = new C2658(th3);
                            }
                        } else {
                            objInvoke = null;
                        }
                        c26583 = objInvoke;
                        Throwable thM42493 = C2248.m4249(c26583);
                        if (thM42493 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-831943328039790L), thM42493);
                        }
                        break;
                    }
                }
                for (Pair pair2 : arrayList3) {
                    Object objComponent12 = pair2.component1();
                    C2503 c2503 = (C2503) pair2.component2();
                    WeakReference weakReference = c2503.f12330;
                    if (weakReference != null && (view = (View) weakReference.get()) != null && view.isAttachedToWindow()) {
                        C0142 c0142 = C0142.f880;
                        try {
                            c0142.getClass();
                            if (C0142.m657() == 0) {
                                C0142.m660(c2503);
                            } else if (c1278 != null) {
                                String strM4341 = AbstractC2328.m4341(-831994867647342L);
                                WeakReference weakReference2 = c2503.f12328;
                                C0142.m631(c0142, objComponent12, c2503, c1278, strM4341, null, weakReference2 != null ? weakReference2.get() : null, 16);
                            }
                            c26582 = C2746.f13459;
                        } catch (Throwable th4) {
                            c26582 = new C2658(th4);
                        }
                        Throwable thM42494 = C2248.m4249(c26582);
                        if (thM42494 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-832020637451118L), thM42494);
                        }
                    }
                }
                return;
        }
    }
}
