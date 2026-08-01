package p084q0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0123k;
import p011F0.C0132t;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p061e.C0542r;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p082p.AbstractC0785c;
import p082p.AbstractC0786d;
import p086r0.C0822A1;
import p086r0.C0831D1;
import p086r0.C0832E;
import p086r0.C0842H0;
import p086r0.C0854L0;
import p086r0.C0858M1;
import p086r0.C0860N0;
import p086r0.C0881Y0;
import p086r0.C0894d0;
import p086r0.C0901f1;
import p086r0.C0903g0;
import p086r0.C0908i;
import p086r0.C0912j0;
import p086r0.C0914k;
import p086r0.C0919l1;
import p086r0.C0932q;
import p086r0.C0935r;
import p086r0.C0943t1;
import p086r0.C0950w;
import p086r0.C0955x1;
import p086r0.C0956y;
import p102z0.AbstractC1126i;
import p102z0.C1124g;
import p102z0.InterfaceC1125h;

/* JADX INFO: renamed from: q0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0808h implements InterfaceC0551a, InterfaceC1125h {

    /* JADX INFO: renamed from: A */
    public final C0822A1 f2681A;

    /* JADX INFO: renamed from: B */
    public final C0831D1 f2682B;

    /* JADX INFO: renamed from: C */
    public final C0932q f2683C;

    /* JADX INFO: renamed from: d */
    public boolean f2687d;

    /* JADX INFO: renamed from: e */
    public boolean f2688e;

    /* JADX INFO: renamed from: l */
    public final C0832E f2695l;

    /* JADX INFO: renamed from: m */
    public final C0935r f2696m;

    /* JADX INFO: renamed from: n */
    public final C0894d0 f2697n;

    /* JADX INFO: renamed from: o */
    public final C0903g0 f2698o;

    /* JADX INFO: renamed from: p */
    public final C0901f1 f2699p;

    /* JADX INFO: renamed from: q */
    public final C0881Y0 f2700q;

    /* JADX INFO: renamed from: r */
    public final C0919l1 f2701r;

    /* JADX INFO: renamed from: s */
    public final C0858M1 f2702s;

    /* JADX INFO: renamed from: t */
    public final C0801a f2703t;

    /* JADX INFO: renamed from: u */
    public final C0935r f2704u;

    /* JADX INFO: renamed from: v */
    public final C0943t1 f2705v;

    /* JADX INFO: renamed from: w */
    public final C0908i f2706w;

    /* JADX INFO: renamed from: x */
    public final C0955x1 f2707x;

    /* JADX INFO: renamed from: y */
    public final C0914k f2708y;

    /* JADX INFO: renamed from: z */
    public final C0935r f2709z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2684a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f2685b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f2686c = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final C0860N0 f2689f = new C0860N0();

    /* JADX INFO: renamed from: g */
    public final C0956y f2690g = new C0956y();

    /* JADX INFO: renamed from: h */
    public final C0842H0 f2691h = new C0842H0();

    /* JADX INFO: renamed from: i */
    public final C0854L0 f2692i = new C0854L0(0);

    /* JADX INFO: renamed from: j */
    public final C0912j0 f2693j = new C0912j0();

    /* JADX INFO: renamed from: k */
    public final C0854L0 f2694k = new C0854L0(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0808h() {
        C0832E c0832e = new C0832E();
        c0832e.f2789l = C0132t.f427a;
        this.f2695l = c0832e;
        this.f2696m = new C0935r(1);
        this.f2697n = new C0894d0();
        this.f2698o = new C0903g0();
        this.f2699p = new C0901f1();
        this.f2700q = new C0881Y0();
        this.f2701r = new C0919l1();
        this.f2702s = new C0858M1();
        this.f2703t = new C0801a(1);
        this.f2704u = new C0935r(2);
        this.f2705v = new C0943t1();
        this.f2706w = new C0908i();
        this.f2707x = new C0955x1();
        this.f2708y = new C0914k();
        this.f2709z = new C0935r(0);
        this.f2681A = new C0822A1();
        this.f2682B = new C0831D1();
        this.f2683C = new C0932q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    @Override // p102z0.InterfaceC1125h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1472a() {
        boolean z2;
        Object obj;
        String strM2113e;
        boolean zContains;
        TextView textView;
        m1474c();
        if (!this.f2688e) {
            AbstractC0731a.m1384a("onConfigChange skip ui refresh in non-main process");
            return;
        }
        boolean z3 = AbstractC1126i.f3786a;
        if (!C1124g.m2444t()) {
            C1124g.m2427c();
        }
        this.f2691h.m1695o1();
        this.f2695l.m1564E();
        this.f2697n.m1882Q0();
        C0903g0 c0903g0 = this.f2698o;
        Set set = c0903g0.f3187c;
        AbstractC0223g.m417d(set, "targetRecyclerViews");
        for (View view : AbstractC0123k.m281w0(set)) {
            try {
                AbstractC0223g.m415b(view);
                c0903g0.m1945q(view);
                Object objM1933h = C0903g0.m1933h(view);
                if (objM1933h != null) {
                    AbstractC0514f.m1024a(objM1933h, "notifyDataSetChanged", new Object[0]);
                }
                view.requestLayout();
                view.invalidate();
            } catch (Throwable unused) {
            }
        }
        C0842H0 c0842h0 = this.f2691h;
        c0842h0.getClass();
        Set setM2439o = C1124g.m2439o();
        synchronized (c0842h0.f2825B) {
            try {
                if (!setM2439o.isEmpty()) {
                    c0842h0.f2825B.removeAll(setM2439o);
                }
                z2 = !c0842h0.f2825B.isEmpty();
            } catch (Throwable th) {
                throw th;
            }
        }
        ((C0808h) AbstractC0503h.m988u(C0808h.class)).f2702s.m1764h(z2);
        C0858M1 c0858m1 = this.f2702s;
        WeakReference weakReference = c0858m1.f2954g;
        if (weakReference != null && (textView = (TextView) weakReference.get()) != null) {
            c0858m1.m1763g(textView);
        }
        C0956y c0956y = this.f2690g;
        C0950w c0950w = c0956y.f3441d;
        if (c0950w != null) {
            Set set2 = c0956y.f3440c;
            AbstractC0223g.m417d(set2, "resumedWechatActivities");
            boolean zIsEmpty = set2.isEmpty();
            WeakReference weakReference2 = c0950w.f3418h;
            if (weakReference2 != null && (obj = weakReference2.get()) != null && ((strM2113e = C0950w.m2113e(obj)) != null || (strM2113e = c0950w.f3419i) != null)) {
                if (C0950w.m2117p(strM2113e)) {
                    C0950w.m2112c(!zIsEmpty ? "refresh" : "background-refresh", strM2113e, obj);
                } else {
                    boolean z4 = AbstractC1126i.f3786a;
                    if (C1124g.m2447w()) {
                        C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
                        if (!C1124g.m2443s()) {
                            zContains = false;
                            if (zContains) {
                            }
                        } else if (AbstractC0307q.m534d0(strM2113e)) {
                            AbstractC0731a.m1387d("chatUser is null or blank");
                            zContains = false;
                            if (zContains) {
                                c0950w.m2124i(obj, null, strM2113e, false);
                            } else {
                                c0950w.m2128q(obj);
                            }
                        } else {
                            zContains = c0808h.f2685b.contains(strM2113e);
                            if (zContains) {
                            }
                        }
                    } else {
                        c0950w.m2128q(obj);
                    }
                }
            }
        }
        this.f2690g.m2135a(null);
        if (this.f2684a.isEmpty()) {
            this.f2702s.m1764h(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1473b() {
        Object c0104d;
        boolean z2 = AbstractC1126i.f3786a;
        Context contextM991x = AbstractC0503h.m991x();
        AbstractC0223g.m417d(contextM991x, "getContext(...)");
        if (!AbstractC1126i.f3786a) {
            Context applicationContext = contextM991x.getApplicationContext();
            Context context = applicationContext == null ? contextM991x : applicationContext;
            C0542r c0542r = new C0542r(3, context);
            try {
                IntentFilter intentFilter = new IntentFilter("com.lu.wxmask.action.CONFIG_CHANGED");
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    AbstractC0786d.m1453a(context, c0542r, intentFilter, null, null, 2);
                } else if (i2 >= 26) {
                    AbstractC0785c.m1451a(context, c0542r, intentFilter, null, null, 2);
                } else {
                    context.registerReceiver(c0542r, intentFilter, null, null);
                }
                AbstractC1126i.f3786a = true;
                AbstractC0731a.m1384a("config changed broadcast receiver registered", context.getPackageName());
                c0104d = C0109i.f404a;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("register config changed broadcast receiver fail", thM246a);
            }
        }
        if (this.f2687d) {
            return;
        }
        boolean z3 = AbstractC1126i.f3786a;
        ArrayList arrayList = AbstractC1126i.f3795j;
        if (!arrayList.contains(this) && !arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.f2687d = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1474c() {
        ArrayList arrayList = this.f2684a;
        arrayList.clear();
        LinkedHashSet linkedHashSet = this.f2685b;
        linkedHashSet.clear();
        LinkedHashMap linkedHashMap = this.f2686c;
        linkedHashMap.clear();
        boolean z2 = AbstractC1126i.f3786a;
        for (MaskItemBean maskItemBean : C1124g.m2433i()) {
            linkedHashMap.put(maskItemBean.getMaskId(), maskItemBean);
            arrayList.add(maskItemBean.getMaskId());
            linkedHashSet.add(maskItemBean.getMaskId());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Object c0104d;
        String str;
        String string;
        String string2;
        m1473b();
        m1474c();
        boolean zM414a = AbstractC0223g.m414a(loadPackageParam.packageName, loadPackageParam.processName);
        this.f2688e = zM414a;
        if (zM414a) {
            try {
                string = context.getSharedPreferences("com.tencent.mm_preferences", 0).getString("login_weixin_username", null);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (string == null || (string2 = AbstractC0299i.m507C0(string).toString()) == null || AbstractC0307q.m534d0(string2) || string2.equals("null")) {
                c0104d = null;
                str = (String) (c0104d instanceof C0104d ? null : c0104d);
                if (str != null) {
                    boolean z2 = AbstractC1126i.f3786a;
                    String string3 = AbstractC0299i.m507C0(str).toString();
                    if (string3 == null) {
                        string3 = "";
                    }
                    if (!AbstractC0307q.m534d0(string3) && !string3.equals(C1124g.m2437m())) {
                        if (C1124g.m2438n().edit().putString("self_wechat_id", string3).putLong("self_wechat_id_update_at", System.currentTimeMillis()).commit()) {
                            AbstractC1126i.f3791f = string3;
                            C1124g.m2418I();
                        } else {
                            AbstractC0731a.m1387d("setSelfWechatId fail", string3);
                        }
                    }
                }
            } else {
                boolean zEquals = string2.equals("0");
                c0104d = string2;
                if (zEquals) {
                }
                str = (String) (c0104d instanceof C0104d ? null : c0104d);
                if (str != null) {
                }
            }
        }
        this.f2709z.handleHook(context, loadPackageParam);
        this.f2683C.handleHook(context, loadPackageParam);
        this.f2696m.handleHook(context, loadPackageParam);
        boolean z3 = AbstractC1126i.f3786a;
        if (C1124g.m2442r()) {
            this.f2706w.handleHook(context, loadPackageParam);
        }
        if (zM414a) {
            this.f2707x.handleHook(context, loadPackageParam);
        }
        this.f2705v.handleHook(context, loadPackageParam);
        this.f2695l.handleHook(context, loadPackageParam);
        this.f2699p.handleHook(context, loadPackageParam);
        this.f2700q.handleHook(context, loadPackageParam);
        this.f2701r.handleHook(context, loadPackageParam);
        if (zM414a) {
            this.f2697n.handleHook(context, loadPackageParam);
            this.f2698o.handleHook(context, loadPackageParam);
            this.f2702s.handleHook(context, loadPackageParam);
            this.f2691h.handleHook(context, loadPackageParam);
            this.f2692i.handleHook(context, loadPackageParam);
            this.f2693j.handleHook(context, loadPackageParam);
            this.f2694k.handleHook(context, loadPackageParam);
            this.f2690g.handleHook(context, loadPackageParam);
            this.f2708y.handleHook(context, loadPackageParam);
            this.f2681A.handleHook(context, loadPackageParam);
            this.f2682B.handleHook(context, loadPackageParam);
            if (!C1124g.m2443s() || !C1124g.m2435k().getHideMainSearchStrong()) {
                this.f2689f.handleHook(context, loadPackageParam);
            }
        }
        this.f2703t.handleHook(context, loadPackageParam);
        this.f2704u.handleHook(context, loadPackageParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void onCreate() {
        m1473b();
    }
}
