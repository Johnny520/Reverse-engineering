package p077m0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p040U0.AbstractC0299i;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p086r0.C0943t1;

/* JADX INFO: renamed from: m0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0767e extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2581a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2583c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0767e(MainHook mainHook, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        this.f2583c = mainHook;
        this.f2582b = loadPackageParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objMo1015f;
        switch (this.f2581a) {
            case 0:
                ((MainHook) this.f2583c).initPlugin((Context) methodHookParam.thisObject, (XC_LoadPackage.LoadPackageParam) this.f2582b);
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.args[0];
                ByteBuffer byteBuffer = obj instanceof ByteBuffer ? (ByteBuffer) obj : null;
                if (byteBuffer != null) {
                    Object objMo1015f2 = AbstractC0514f.f1622b.mo1015f(methodHookParam.thisObject, "this$0");
                    if (objMo1015f2 != null && (objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f2, "codec")) != null) {
                        byteBuffer.position(0);
                        Object objMo1012c = AbstractC0514f.f1622b.mo1012c(objMo1015f, "decodeMessage", byteBuffer);
                        if (objMo1012c != null) {
                            String string = objMo1012c.toString();
                            C0943t1 c0943t1 = (C0943t1) this.f2582b;
                            c0943t1.getClass();
                            String strM2081p = C0943t1.m2081p(string);
                            if (strM2081p != null) {
                                Activity activity = (Activity) ((WeakReference) this.f2583c).get();
                                if (c0943t1.m2095Z(strM2081p, activity != null ? activity.getIntent() : null, string, "flutter-message")) {
                                    c0943t1.m2092U(strM2081p, "flutter-message");
                                    c0943t1.m2100s(activity, strM2081p);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Bundle extras;
        Bundle extras2;
        switch (this.f2581a) {
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                String name = obj != null ? obj.getClass().getName() : null;
                if (name == null) {
                    name = "";
                }
                String str = name;
                Object[] objArr = methodHookParam.args;
                C0943t1 c0943t1 = (C0943t1) this.f2582b;
                Intent intent = (Intent) AbstractC0123k.m268j0(C0943t1.m2068b(c0943t1, objArr));
                Object obj2 = methodHookParam.thisObject;
                if ((obj2 != null && AbstractC0299i.m511i0(obj2.getClass().getName(), "voip", true)) || (intent != null && c0943t1.m2085K(intent))) {
                    String strM2064W = C0943t1.m2064W(intent);
                    if (strM2064W == null) {
                        strM2064W = c0943t1.m2090S();
                    }
                    String str2 = strM2064W;
                    String strM355k = AbstractC0174d.m355k("enabled=", C0943t1.m2052A());
                    String strM352h = AbstractC0174d.m352h("masked=", str2);
                    if (intent == null || (extras = intent.getExtras()) == null) {
                        extras = intent;
                    }
                    AbstractC0731a.m1384a("voip service", (String) this.f2583c, str, strM355k, strM352h, C0943t1.m2065X(extras));
                    if (str2 != null) {
                        if (intent == null || (extras2 = intent.getExtras()) == null) {
                            extras2 = intent;
                        }
                        if (c0943t1.m2094Y(str2, intent, C0943t1.m2065X(extras2), "service:".concat(str))) {
                            c0943t1.m2092U(str2, "service:".concat(str));
                            AbstractC0731a.m1384a("block voip service", str, str2);
                            c0943t1.m2087O("service:".concat(str), str2);
                            Object[] objArr2 = methodHookParam.args;
                            if (objArr2 != null) {
                                Iterator it = AbstractC0120h.m256d0(objArr2).iterator();
                                while (((C0243b) it).f588c) {
                                    int iM458a = ((C0243b) it).m458a();
                                    Object[] objArr3 = methodHookParam.args;
                                    if (objArr3[iM458a] instanceof Intent) {
                                        objArr3[iM458a] = null;
                                    }
                                }
                            }
                            methodHookParam.setResult(2);
                        }
                    }
                    break;
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0767e(C0943t1 c0943t1, String str, Method method) {
        this.f2582b = c0943t1;
        this.f2583c = str;
    }

    public C0767e(C0943t1 c0943t1, WeakReference weakReference) {
        this.f2582b = c0943t1;
        this.f2583c = weakReference;
    }
}
