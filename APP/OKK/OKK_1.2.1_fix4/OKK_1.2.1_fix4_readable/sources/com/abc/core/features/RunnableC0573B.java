package com.abc.core.features;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.abc.core.runtime.C0797H;
import com.abc.core.runtime.C0817b;
import com.abc.core.runtime.DialogC0823e;
import com.abc.core.runtime.HookDiagnostics;
import com.abc.core.runtime.RunnableC0819c;
import com.abc.internal.probe.AppFingerprint;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p034S.RunnableC0328h;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0573B implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1694a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1696c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1697d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1698e;

    public /* synthetic */ RunnableC0573B(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i2) {
        this.f1694a = i2;
        this.f1696c = callback;
        this.f1697d = obj;
        this.f1695b = obj2;
        this.f1698e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 1;
        Object obj = this.f1698e;
        Object obj2 = this.f1695b;
        Object obj3 = this.f1697d;
        Object obj4 = this.f1696c;
        switch (this.f1694a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj4;
                AbstractC0307g.m703e(viewGroup, "$parent");
                AbstractC0307g.m703e(obj2, "$mainTabUi");
                C0588G.m1435v(16, viewGroup, (ViewGroup) obj3, obj2, obj);
                break;
            case 1:
                String str = (String) obj4;
                AbstractC0307g.m703e(str, "$sender");
                AbstractC0307g.m703e((RealNameTailHook) obj3, "$this_runCatching");
                InterfaceC0286l interfaceC0286l = (InterfaceC0286l) obj;
                AbstractC0307g.m703e(interfaceC0286l, "$onResult");
                if (RealNameTailHook.f2174l.remove(obj2) != null) {
                    RealNameTailHook.f2173k.remove(obj2);
                    RealNameTailHook.f2171i.remove(str);
                    RealNameTailHook.m1782s("timeout ".concat(str));
                    interfaceC0286l.invoke(new C0676m1("timeout"));
                }
                break;
            case 2:
                Activity activity = (Activity) obj4;
                AbstractC0307g.m703e(activity, "$activity");
                ClassLoader classLoader = (ClassLoader) obj3;
                AbstractC0307g.m703e(classLoader, "$classLoader");
                DialogC0823e dialogC0823e = (DialogC0823e) obj;
                AbstractC0307g.m703e(dialogC0823e, "$progress");
                Context applicationContext = activity.getApplicationContext();
                AbstractC0307g.m702d(applicationContext, "getApplicationContext(...)");
                AppFingerprint appFingerprintM884e0 = AbstractC0358S.m884e0(applicationContext, new C0817b(dialogC0823e, 1), classLoader, (String) obj2);
                HookDiagnostics hookDiagnostics = HookDiagnostics.f3000a;
                HookDiagnostics.f3001b.post(new RunnableC0819c(dialogC0823e, HookDiagnostics.m2155e(appFingerprintM884e0), activity, i2));
                break;
            default:
                View view = (View) obj4;
                AbstractC0307g.m703e(view, "$rowView");
                ScrollView scrollView = (ScrollView) obj3;
                AbstractC0307g.m703e(scrollView, "$scroll");
                C0797H c0797h = (C0797H) obj2;
                AbstractC0307g.m703e(c0797h, "$item");
                Activity activity2 = (Activity) obj;
                AbstractC0307g.m703e(activity2, "$host");
                int top = 0;
                while (view != null) {
                    top += view.getTop();
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                    if (view == scrollView) {
                        scrollView.smoothScrollTo(0, top);
                        scrollView.postDelayed(new RunnableC0328h(c0797h, activity2, 7), 380L);
                        break;
                    }
                }
                scrollView.smoothScrollTo(0, top);
                scrollView.postDelayed(new RunnableC0328h(c0797h, activity2, 7), 380L);
                break;
        }
    }

    public /* synthetic */ RunnableC0573B(Object obj, String str, RealNameTailHook realNameTailHook, C0641b c0641b) {
        this.f1694a = 1;
        this.f1695b = obj;
        this.f1696c = str;
        this.f1697d = realNameTailHook;
        this.f1698e = c0641b;
    }
}
