package p086r0;

import android.app.Activity;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p025M0.InterfaceC0193a;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: r0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0936r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f3333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0551a f3334c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3335d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f3336e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3337f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f3338g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0936r0(C0822A1 c0822a1, Activity activity, EditText editText, Object obj, boolean z2, String str) {
        this.f3332a = 2;
        this.f3334c = c0822a1;
        this.f3337f = activity;
        this.f3338g = editText;
        this.f3335d = obj;
        this.f3333b = z2;
        this.f3336e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        switch (this.f3332a) {
            case 0:
                Object obj = this.f3335d;
                View view = this.f3338g;
                boolean z2 = this.f3333b;
                C0842H0 c0842h0 = (C0842H0) this.f3334c;
                if (z2) {
                    c0842h0.f2876u = false;
                }
                try {
                    ((InterfaceC0193a) this.f3337f).mo7b();
                    c0842h0.m1711z0(obj);
                    c0842h0.m1677g1(obj);
                    try {
                        AbstractC0514f.f1622b.mo1012c(view, "invalidateViews", new Object[0]);
                        break;
                    } catch (Throwable unused) {
                    }
                    AbstractC0514f.m1024a(view, "requestLayout", new Object[0]);
                    AbstractC0514f.m1024a(view, "invalidate", new Object[0]);
                    Object parent = view.getParent();
                    c0104d = null;
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        view2.requestLayout();
                    }
                    Object parent2 = view.getParent();
                    View view3 = parent2 instanceof View ? (View) parent2 : null;
                    if (view3 != null) {
                        view3.invalidate();
                        c0104d = C0109i.f404a;
                    }
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("refresh conversation list fail", this.f3336e, thM246a);
                }
                break;
            case 1:
                Object obj2 = this.f3335d;
                ListView listView = (ListView) this.f3338g;
                boolean z3 = this.f3333b;
                C0842H0 c0842h02 = (C0842H0) this.f3334c;
                if (z3) {
                    c0842h02.f2876u = false;
                }
                C0927o0 c0927o0 = (C0927o0) this.f3337f;
                if (c0927o0 != null) {
                    try {
                        c0927o0.mo7b();
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                }
                c0842h02.m1685k1(obj2);
                c0842h02.m1679h1(obj2);
                listView.invalidateViews();
                listView.requestLayout();
                listView.invalidate();
                c0104d2 = C0109i.f404a;
                Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
                if (thM246a2 != null) {
                    AbstractC0731a.m1387d("refresh legacy 65-66 fail", this.f3336e, thM246a2);
                }
                break;
            default:
                C0822A1 c0822a1 = (C0822A1) this.f3334c;
                Activity activity = (Activity) this.f3337f;
                Object obj3 = this.f3335d;
                try {
                    Object systemService = activity.getSystemService("input_method");
                    InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                    EditText editText = (EditText) this.f3338g;
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c0822a1.getClass();
                    C0822A1.m1497a(activity, obj3, editText);
                    boolean zM2498t = AbstractC1135r.m2498t();
                    Handler handler = c0822a1.f2742c;
                    boolean z4 = this.f3333b;
                    if (zM2498t) {
                        handler.postDelayed(new RunnableC0961z1(c0822a1, obj3, editText, 0, activity, z4), 220L);
                        c0104d3 = C0109i.f404a;
                    } else {
                        c0104d3 = Boolean.valueOf(handler.postDelayed(new RunnableC0910i1(c0822a1, activity, z4, 1), 260L));
                    }
                } catch (Throwable th3) {
                    c0104d3 = new C0104d(th3);
                }
                Throwable thM246a3 = AbstractC0105e.m246a(c0104d3);
                if (thM246a3 != null) {
                    AbstractC0731a.m1387d("search command handle fail", this.f3336e, thM246a3);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0936r0(boolean z2, C0842H0 c0842h0, InterfaceC0193a interfaceC0193a, Object obj, View view, String str, int i2) {
        this.f3332a = i2;
        this.f3333b = z2;
        this.f3334c = c0842h0;
        this.f3337f = interfaceC0193a;
        this.f3335d = obj;
        this.f3338g = view;
        this.f3336e = str;
    }
}
