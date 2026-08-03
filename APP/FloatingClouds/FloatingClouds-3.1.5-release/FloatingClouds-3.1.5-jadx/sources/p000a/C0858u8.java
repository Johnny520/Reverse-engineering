package p000a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p000a.C0186K3;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.u8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0858u8 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public volatile int f3364a = -1;

    /* JADX INFO: renamed from: b */
    public final Set<View> f3365b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public static final void m1986b(int i, C0320Rc c0320Rc, View view) {
        if (view.getId() == i && view.getVisibility() != 8) {
            view.setVisibility(8);
            c0320Rc.f1153a++;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                C0631i9.m1481d(childAt, "getChildAt(...)");
                m1986b(i, c0320Rc, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1987a(View view) {
        Object objM2206a;
        int i;
        Context context = view.getContext();
        C0631i9.m1481d(context, "getContext(...)");
        if (this.f3364a != -1) {
            i = this.f3364a;
        } else {
            try {
                objM2206a = Integer.valueOf(context.getResources().getIdentifier("pt", "id", context.getPackageName()));
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            if (objM2206a instanceof C0901wd.a) {
                objM2206a = 0;
            }
            this.f3364a = ((Number) objM2206a).intValue();
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2225e("HideSnsGroupIcon: resolved id 'pt' = ", this.f3364a)}, 1));
            i = this.f3364a;
        }
        if (i == 0) {
            return;
        }
        C0320Rc c0320Rc = new C0320Rc();
        try {
            m1986b(i, c0320Rc, view);
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
        int i2 = c0320Rc.f1153a;
        if (i2 > 0) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(i2, "HideSnsGroupIcon: hid ", " group-icon(s)")}, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1988c(final View view) {
        if (this.f3365b.add(view)) {
            try {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: a.t8
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        C0858u8 c0858u8 = this.f3310a;
                        c0858u8.getClass();
                        C0186K3.f638a.getClass();
                        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2443m) {
                            c0858u8.m1987a(view);
                        }
                    }
                });
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                C0920xd.m2206a(th);
            }
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        Object objM2206a2;
        C0631i9.m1482e(c0173j8, "session");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== HideSnsGroupIcon handleHook START ==="}, 1));
        try {
            if (C0173J8.m467e(c0173j8, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI", "initView", new C0830t(4, this)) != null) {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideSnsGroupIcon: hooked SnsCommentDetailUI.initView"}, 1));
            } else {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideSnsGroupIcon: initView not found"}, 1));
            }
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideSnsGroupIcon hook initView failed", thM2189a}, 2));
        }
        Class clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.view.recyclerview.WxRecyclerView");
        if (clsM13b == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideSnsGroupIcon: com.tencent.mm.view.recyclerview.WxRecyclerView not found"}, 1));
        } else {
            Method method = (Method) C0238N1.m630d0(C0002A1.m17f(clsM13b, new C0687l8(6)));
            if (method == null) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideSnsGroupIcon: setAdapter not found"}, 1));
            } else {
                try {
                    c0173j8.m470f(method).intercept(new C0700m2(4, this));
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideSnsGroupIcon: hooked com.tencent.mm.view.recyclerview.WxRecyclerView.setAdapter"}, 1));
                    objM2206a2 = C0413Wf.f1577a;
                } catch (Throwable th2) {
                    objM2206a2 = C0920xd.m2206a(th2);
                }
                Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
                if (thM2189a2 != null) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideSnsGroupIcon hook setAdapter failed", thM2189a2}, 2));
                }
            }
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== HideSnsGroupIcon handleHook DONE ==="}, 1));
        C0083E8.m209b("F009", "snsGroupIcon", "detailPage+recyclerView");
    }
}
