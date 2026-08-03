package p050c0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0179j;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684p0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0687q0 f2144c;

    public C0684p0(int i2) {
        this.f2143b = i2;
        switch (i2) {
            case 1:
                this.f2144c = C0687q0.f2154a;
                break;
            case 2:
                this.f2144c = C0687q0.f2154a;
                break;
            case 3:
                this.f2144c = C0687q0.f2154a;
                break;
            case 4:
                this.f2144c = C0687q0.f2154a;
                break;
            default:
                this.f2144c = C0687q0.f2154a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        Activity activity;
        View viewM1758e;
        Window window;
        View viewM1758e2;
        switch (this.f2143b) {
            case 0:
                C0687q0.m1755b();
                if (C0687q0.f2156c) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    View view = objM537n0 instanceof View ? (View) objM537n0 : null;
                    if (view != null) {
                        this.f2144c.getClass();
                        C0687q0.m1762i(view);
                        this.f2144c.getClass();
                        C0687q0.m1759f(view);
                        C0687q0 c0687q0 = this.f2144c;
                        String simpleName = view.getClass().getSimpleName();
                        this.f2144c.getClass();
                        String str = "setFoldBanner hide " + simpleName + " id=" + C0687q0.m1764k(view);
                        c0687q0.getClass();
                        C0687q0.m1765l(str);
                        break;
                    }
                }
                break;
            case 1:
                C0687q0.m1755b();
                if (C0687q0.f2156c) {
                    C0687q0 c0687q02 = this.f2144c;
                    Object obj = c0760b.f2669b;
                    AbstractC0307g.m702d(obj, "thisObject");
                    c0687q02.getClass();
                    View viewM1761h = C0687q0.m1761h(obj);
                    if (viewM1761h != null) {
                        this.f2144c.getClass();
                        C0687q0.m1762i(viewM1761h);
                        this.f2144c.getClass();
                        C0687q0.m1759f(viewM1761h);
                        break;
                    }
                }
                break;
            case 2:
                C0687q0.m1755b();
                if (C0687q0.f2156c) {
                    C0687q0 c0687q03 = this.f2144c;
                    Object obj2 = c0760b.f2669b;
                    AbstractC0307g.m702d(obj2, "thisObject");
                    c0687q03.getClass();
                    try {
                        C0172c c0172cM714c = AbstractC0317q.m714c(obj2.getClass().getDeclaredFields());
                        while (c0172cM714c.hasNext()) {
                            Field field = (Field) c0172cM714c.next();
                            field.setAccessible(true);
                            Object obj3 = field.get(obj2);
                            if (obj3 != null) {
                                if (obj3.getClass().getName().equals("com.tencent.mm.ui.conversation.l5") || AbstractC0433r.m1028C0(obj3.getClass().getName(), ".l5")) {
                                    View viewM1761h2 = C0687q0.m1761h(obj3);
                                    if (viewM1761h2 != null) {
                                        C0687q0.m1762i(viewM1761h2);
                                        C0687q0.m1759f(viewM1761h2);
                                    }
                                }
                                if ((obj3 instanceof View) && C0687q0.m1760g((View) obj3)) {
                                    C0687q0.m1762i((View) obj3);
                                    C0687q0.m1759f((View) obj3);
                                }
                                if ((obj3 instanceof ViewGroup) && (viewM1758e2 = C0687q0.m1758e((ViewGroup) obj3)) != null) {
                                    C0687q0.m1762i(viewM1758e2);
                                    C0687q0.m1759f(viewM1758e2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        AbstractC0040p.m116u(th);
                    }
                    try {
                        if (obj2 instanceof Activity) {
                            activity = (Activity) obj2;
                        } else {
                            Object objM887g = AbstractC0358S.m887g(obj2, "getContext", new Object[0]);
                            Activity activity2 = objM887g instanceof Activity ? (Activity) objM887g : null;
                            if (activity2 == null) {
                                Object objM887g2 = AbstractC0358S.m887g(obj2, "getActivity", new Object[0]);
                                activity = objM887g2 instanceof Activity ? (Activity) objM887g2 : null;
                            } else {
                                activity = activity2;
                            }
                        }
                        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                        if (viewGroup != null && (viewM1758e = C0687q0.m1758e(viewGroup)) != null) {
                            C0687q0.m1762i(viewM1758e);
                            C0687q0.m1759f(viewM1758e);
                            C0687q0.m1765l("decor lt5 hidden");
                            break;
                        }
                    } catch (Throwable th2) {
                        AbstractC0040p.m116u(th2);
                        return;
                    }
                    break;
                }
                break;
            case 3:
                if (C0687q0.f2156c) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(0, objArr2);
                    View view2 = objM537n02 instanceof View ? (View) objM537n02 : null;
                    if (view2 != null) {
                        this.f2144c.getClass();
                        if (C0687q0.m1760g(view2)) {
                            this.f2144c.getClass();
                            C0687q0.m1762i(view2);
                            this.f2144c.getClass();
                            C0687q0.m1759f(view2);
                            this.f2144c.getClass();
                            C0687q0.m1765l("addView hide fold banner id=" + C0687q0.m1764k(view2));
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        switch (this.f2143b) {
            case 1:
                C0687q0.m1755b();
                if (C0687q0.f2156c) {
                    Object obj = c0760b.f2670c[0];
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    if (num != null && num.intValue() == 0) {
                        c0760b.f2670c[0] = 8;
                    }
                    break;
                }
                break;
            case 4:
                C0687q0.m1755b();
                if (C0687q0.f2156c) {
                    Object obj2 = c0760b.f2669b;
                    View view = obj2 instanceof View ? (View) obj2 : null;
                    if (view != null && C0687q0.m1754a(view)) {
                        c0760b.f2670c[0] = Float.valueOf(0.0f);
                        this.f2144c.getClass();
                        C0687q0.m1759f(view);
                    }
                    break;
                }
                break;
        }
    }
}
