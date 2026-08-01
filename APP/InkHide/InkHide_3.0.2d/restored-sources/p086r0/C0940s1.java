package p086r0;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Iterator;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p034R0.C0244c;
import p040U0.AbstractC0299i;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0940s1 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0943t1 f3349b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f3350c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0940s1(C0943t1 c0943t1, Method method, int i2) {
        this.f3348a = i2;
        this.f3349b = c0943t1;
        this.f3350c = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        boolean z2;
        Bundle extras;
        Bundle extras2;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z3;
        String str;
        Method method;
        String string;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        boolean z5;
        String strM2081p;
        boolean z6;
        boolean z7;
        int i2;
        CharSequence title;
        CharSequence title2;
        Method method2 = this.f3350c;
        C0943t1 c0943t1 = this.f3349b;
        switch (this.f3348a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Iterator it = C0943t1.m2068b(c0943t1, methodHookParam.args).iterator();
                while (it.hasNext() && !C0943t1.m2071d(c0943t1, methodHookParam, method2, (Intent) it.next())) {
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Iterator it2 = C0943t1.m2068b(c0943t1, methodHookParam.args).iterator();
                while (it2.hasNext() && !C0943t1.m2071d(c0943t1, methodHookParam, method2, (Intent) it2.next())) {
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                int length = objArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        obj = objArr[i3];
                        z2 = true;
                        if (!(obj instanceof Notification)) {
                            i3++;
                        }
                    } else {
                        obj = null;
                        z2 = true;
                    }
                }
                Notification notification = obj instanceof Notification ? (Notification) obj : null;
                if (notification != null) {
                    String strM2073e = C0943t1.m2073e(c0943t1, notification);
                    boolean z8 = (AbstractC0223g.m414a(notification.category, "call") || notification.fullScreenIntent != null) ? z2 : false;
                    if (C0943t1.m2062N(strM2073e) || z8 || c0943t1.m2090S() != null) {
                        String strM2081p2 = C0943t1.m2081p(strM2073e);
                        if (strM2081p2 == null) {
                            strM2081p2 = c0943t1.m2090S();
                        }
                        AbstractC0731a.m1384a("voip notification", C0943t1.m2063P(method2), AbstractC0174d.m355k("enabled=", C0943t1.m2052A()), AbstractC0174d.m352h("masked=", strM2081p2), AbstractC0174d.m355k("call=", z8), C0943t1.m2065X(strM2073e));
                        if (strM2081p2 != null && c0943t1.m2094Y(strM2081p2, null, strM2073e, "notification")) {
                            if (C0943t1.m2062N(strM2073e) || z8 || c0943t1.m2090S() != null) {
                                AbstractC0731a.m1384a("block voip notification", strM2081p2, C0943t1.m2065X(strM2073e));
                                c0943t1.m2092U(strM2081p2, "notification");
                                c0943t1.m2087O("notification", strM2081p2);
                                methodHookParam.setResult((Object) null);
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj5 = methodHookParam.thisObject;
                Service service = obj5 instanceof Service ? (Service) obj5 : null;
                if (service != null) {
                    Intent intent = (Intent) AbstractC0123k.m268j0(C0943t1.m2068b(c0943t1, methodHookParam.args));
                    String strM2064W = C0943t1.m2064W(intent);
                    if (strM2064W == null) {
                        strM2064W = c0943t1.m2090S();
                    }
                    String name = service.getClass().getName();
                    String strM355k = AbstractC0174d.m355k("enabled=", C0943t1.m2052A());
                    String strM352h = AbstractC0174d.m352h("masked=", strM2064W);
                    if (intent == null || (extras = intent.getExtras()) == null) {
                        extras = intent;
                    }
                    AbstractC0731a.m1384a("voip service bind", name, strM355k, strM352h, C0943t1.m2065X(extras));
                    if (strM2064W != null) {
                        if (intent == null || (extras2 = intent.getExtras()) == null) {
                            extras2 = intent;
                        }
                        if (c0943t1.m2094Y(strM2064W, intent, C0943t1.m2065X(extras2), "service-bind:".concat(service.getClass().getName()))) {
                            AbstractC0731a.m1384a("block voip service bind", service.getClass().getName(), strM2064W);
                            c0943t1.m2087O("service-bind:".concat(service.getClass().getName()), strM2064W);
                            service.stopSelf();
                            C0943t1.m2076h(c0943t1, methodHookParam, method2);
                        }
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj6 = methodHookParam.thisObject;
                Service service2 = obj6 instanceof Service ? (Service) obj6 : null;
                if (service2 != null) {
                    String name2 = service2.getClass().getName();
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr2, "args");
                    int length2 = objArr2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            obj2 = objArr2[i4];
                            if (!(obj2 instanceof Notification)) {
                                i4++;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Notification notification2 = obj2 instanceof Notification ? (Notification) obj2 : null;
                    String strM2073e2 = notification2 != null ? C0943t1.m2073e(c0943t1, notification2) : null;
                    if (strM2073e2 == null) {
                        strM2073e2 = "";
                    }
                    c0943t1.getClass();
                    if (!AbstractC0299i.m511i0(service2.getClass().getName(), "voip", true) && !C0943t1.m2062N(strM2073e2)) {
                        if (notification2 != null) {
                            if (!AbstractC0223g.m414a(notification2.category, "call") && notification2.fullScreenIntent == null) {
                            }
                        }
                    }
                    String strM2081p3 = C0943t1.m2081p(strM2073e2);
                    if (strM2081p3 == null) {
                        strM2081p3 = c0943t1.m2090S();
                    }
                    AbstractC0731a.m1384a("voip startForeground", name2, AbstractC0174d.m355k("enabled=", C0943t1.m2052A()), AbstractC0174d.m352h("masked=", strM2081p3), C0943t1.m2065X(strM2073e2));
                    if (strM2081p3 != null && c0943t1.m2094Y(strM2081p3, null, strM2073e2, "startForeground:".concat(name2))) {
                        AbstractC0731a.m1384a("block voip startForeground", name2, strM2081p3);
                        c0943t1.m2087O("startForeground:".concat(name2), strM2081p3);
                        service2.stopSelf();
                        C0943t1.m2076h(c0943t1, methodHookParam, method2);
                        break;
                    }
                }
                break;
            default:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr3 = methodHookParam.args;
                c0943t1.getClass();
                if (objArr3 != null) {
                    int length3 = objArr3.length;
                    for (int i5 = 0; i5 < length3; i5++) {
                        obj3 = objArr3[i5];
                        if (!(obj3 instanceof View)) {
                        }
                    }
                    obj3 = null;
                } else {
                    obj3 = null;
                }
                View view = obj3 instanceof View ? (View) obj3 : null;
                if (view != null) {
                    Object[] objArr4 = methodHookParam.args;
                    if (objArr4 != null) {
                        int length4 = objArr4.length;
                        for (int i6 = 0; i6 < length4; i6++) {
                            obj4 = objArr4[i6];
                            if (!(obj4 instanceof ViewGroup.LayoutParams)) {
                            }
                        }
                        obj4 = null;
                    } else {
                        obj4 = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = obj4 instanceof ViewGroup.LayoutParams ? (ViewGroup.LayoutParams) obj4 : null;
                    if (layoutParams2 != null) {
                        boolean z9 = layoutParams2 instanceof WindowManager.LayoutParams;
                        WindowManager.LayoutParams layoutParams3 = z9 ? (WindowManager.LayoutParams) layoutParams2 : null;
                        if (layoutParams3 != null) {
                            CharSequence title3 = layoutParams3.getTitle();
                            z3 = z9;
                            str = "";
                            method = method2;
                            string = "title=" + ((Object) title3) + " package=" + layoutParams3.packageName + " type=" + layoutParams3.type + " flags=" + layoutParams3.flags + " width=" + layoutParams3.width + " height=" + layoutParams3.height;
                        } else {
                            z3 = z9;
                            str = "";
                            method = method2;
                            string = "layout=" + layoutParams2.getClass().getName() + " width=" + layoutParams2.width + " height=" + layoutParams2.height;
                        }
                        WindowManager.LayoutParams layoutParams4 = z3 ? (WindowManager.LayoutParams) layoutParams2 : null;
                        String string2 = (layoutParams4 == null || (title2 = layoutParams4.getTitle()) == null) ? null : title2.toString();
                        if (string2 == null) {
                            string2 = str;
                        }
                        String str2 = layoutParams4 != null ? layoutParams4.packageName : null;
                        if (str2 == null) {
                            str2 = str;
                        }
                        if (str2.equals("com.tencent.mm")) {
                            C0244c c0244c = new C0244c(2000, 2999, 1);
                            Integer numValueOf = layoutParams4 != null ? Integer.valueOf(layoutParams4.type) : null;
                            z4 = (numValueOf != null && c0244c.m459a(numValueOf.intValue())) || AbstractC0299i.m511i0(string2, "FloatingWindow", true);
                        }
                        if (C0943t1.m2070c0(view, "voip") || C0943t1.m2070c0(view, "BaseSmallView") || z4 || AbstractC0299i.m511i0(string, "FloatingWindow", true)) {
                            boolean zM2079n = C0943t1.m2079n();
                            WindowManager.LayoutParams layoutParams5 = z3 ? (WindowManager.LayoutParams) layoutParams2 : null;
                            String string3 = (layoutParams5 == null || (title = layoutParams5.getTitle()) == null) ? null : title.toString();
                            if (string3 == null) {
                                string3 = str;
                            }
                            String str3 = layoutParams5 != null ? layoutParams5.packageName : null;
                            if (str3 == null) {
                                str3 = str;
                            }
                            if (str3.equals("com.tencent.mm")) {
                                layoutParams = layoutParams2;
                                C0244c c0244c2 = new C0244c(2000, 2999, 1);
                                Integer numValueOf2 = layoutParams5 != null ? Integer.valueOf(layoutParams5.type) : null;
                                if (numValueOf2 == null || !c0244c2.m459a(numValueOf2.intValue())) {
                                    z5 = true;
                                    if (AbstractC0299i.m511i0(string3, "FloatingWindow", true)) {
                                    }
                                    strM2081p = C0943t1.m2081p(string);
                                    if (strM2081p == null) {
                                        strM2081p = c0943t1.m2090S();
                                    }
                                    boolean z10 = zM2079n || C0943t1.m2070c0(view, "voip") || C0943t1.m2070c0(view, "BaseSmallView") || C0943t1.m2062N(string);
                                    boolean zM2094Y = c0943t1.m2094Y(strM2081p, null, string, "floating-window");
                                    if (strM2081p == null && C0943t1.m2052A() && c0943t1.m2091T() && !c0943t1.m2089R(null)) {
                                        boolean z11 = AbstractC1126i.f3786a;
                                        if (!C1124g.m2433i().isEmpty()) {
                                            WindowManager.LayoutParams layoutParams6 = z3 ? (WindowManager.LayoutParams) layoutParams : null;
                                            if (layoutParams6 != null) {
                                                CharSequence title4 = layoutParams6.getTitle();
                                                String string4 = title4 != null ? title4.toString() : null;
                                                if (string4 == null) {
                                                    string4 = str;
                                                }
                                                String str4 = layoutParams6.packageName;
                                                if (str4 == null) {
                                                    str4 = str;
                                                }
                                                if (str4.equals("com.tencent.mm") && ((AbstractC0299i.m511i0(string4, "FloatingWindow", true) || AbstractC0299i.m511i0(string, "FloatingWindow", true)) && 2000 <= (i2 = layoutParams6.type) && i2 < 3000 && z10)) {
                                                    z6 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z6 = false;
                                    }
                                    z7 = zM2094Y || z6;
                                    AbstractC0731a.m1384a("voip floating window", C0943t1.m2063P(method), AbstractC0174d.m355k("enabled=", C0943t1.m2052A()), AbstractC0174d.m352h("masked=", strM2081p), AbstractC0174d.m355k("block=", z7), AbstractC0174d.m355k("stack=", zM2079n), C0943t1.m2065X(string));
                                    if (z7) {
                                        if (strM2081p != null) {
                                            c0943t1.m2092U(strM2081p, "floating-window");
                                        }
                                        c0943t1.m2087O("floating-window", strM2081p);
                                        String strM2063P = C0943t1.m2063P(method);
                                        if (strM2081p == null) {
                                            strM2081p = "floating-window";
                                        }
                                        AbstractC0731a.m1384a("block voip floating window", strM2063P, strM2081p);
                                        C0943t1.m2075g(methodHookParam, method, null);
                                        break;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(string);
                                sb.append(' ');
                                C0943t1.m2078l(view, 4, sb);
                                string = sb.toString();
                                AbstractC0223g.m417d(string, "toString(...)");
                                strM2081p = C0943t1.m2081p(string);
                                if (strM2081p == null) {
                                }
                                if (zM2079n) {
                                }
                                boolean zM2094Y2 = c0943t1.m2094Y(strM2081p, null, string, "floating-window");
                                if (strM2081p == null) {
                                    z6 = false;
                                }
                                if (zM2094Y2) {
                                }
                                AbstractC0731a.m1384a("voip floating window", C0943t1.m2063P(method), AbstractC0174d.m355k("enabled=", C0943t1.m2052A()), AbstractC0174d.m352h("masked=", strM2081p), AbstractC0174d.m355k("block=", z7), AbstractC0174d.m355k("stack=", zM2079n), C0943t1.m2065X(string));
                                if (z7) {
                                }
                            } else {
                                layoutParams = layoutParams2;
                                z5 = true;
                            }
                            if (zM2079n || C0943t1.m2070c0(view, "voip") || C0943t1.m2070c0(view, "BaseSmallView") || AbstractC0299i.m511i0(string, "FloatingWindow", z5)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(string);
                                sb2.append(' ');
                                C0943t1.m2078l(view, 4, sb2);
                                string = sb2.toString();
                                AbstractC0223g.m417d(string, "toString(...)");
                            }
                            strM2081p = C0943t1.m2081p(string);
                            if (strM2081p == null) {
                            }
                            if (zM2079n) {
                            }
                            boolean zM2094Y22 = c0943t1.m2094Y(strM2081p, null, string, "floating-window");
                            if (strM2081p == null) {
                            }
                            if (zM2094Y22) {
                            }
                            AbstractC0731a.m1384a("voip floating window", C0943t1.m2063P(method), AbstractC0174d.m355k("enabled=", C0943t1.m2052A()), AbstractC0174d.m352h("masked=", strM2081p), AbstractC0174d.m355k("block=", z7), AbstractC0174d.m355k("stack=", zM2079n), C0943t1.m2065X(string));
                            if (z7) {
                            }
                        }
                    }
                }
                break;
        }
    }
}
