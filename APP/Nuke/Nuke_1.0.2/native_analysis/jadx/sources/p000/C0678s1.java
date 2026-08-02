package p000;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;

/* JADX INFO: renamed from: s1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0678s1 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9856h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f9857i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f9858j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9859k;

    public /* synthetic */ C0678s1(go0 go0Var, C0138dq c0138dq, pr2 pr2Var, ui1 ui1Var) {
        this.f9856h = 9;
        this.f9858j = go0Var;
        this.f9859k = c0138dq;
        this.f9857i = pr2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [be0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30 */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i;
        g00 g00Var;
        boolean zM1771O0;
        Object x92Var;
        int iIntValue;
        int i2 = this.f9856h;
        ?? arrayList = be0.f819h;
        a83 a83Var = a83.f116a;
        Object obj = this.f9857i;
        Object obj2 = this.f9859k;
        Object obj3 = this.f9858j;
        switch (i2) {
            case 0:
                ((xk1) obj).setValue(null);
                sp0.m4919R((Context) obj3, ((rh0) obj2).f9586a);
                return a83Var;
            case 1:
                ((in0) obj3).mo5j(new C0127de((String) ((xk1) obj).getValue(), (String) ((xk1) obj2).getValue()));
                return a83Var;
            case 2:
                String str = (String) obj3;
                C0240gh c0240gh = (C0240gh) obj2;
                String str2 = (String) obj;
                String str3 = C0277hh.f4008h;
                C0277hh c0277hh = C0277hh.f4004d;
                ConcurrentHashMap concurrentHashMap = C0277hh.f4010j;
                try {
                    if (concurrentHashMap.get(str) == c0240gh) {
                        c0277hh.getClass();
                        Object objM2172q = C0277hh.m2172q(c0240gh, str2);
                        bn1.f944d.getClass();
                        Object objInvoke = ((Method) bn1.f948h.getValue()).invoke(bn1.f947g.getValue(), objM2172q);
                        objInvoke.getClass();
                        if (!((Boolean) objInvoke).booleanValue()) {
                            concurrentHashMap.remove(str, c0240gh);
                            hg3.m2166d(str3, "WeChat rejected open request: sendId=".concat(str));
                        }
                        break;
                    }
                } catch (Throwable th) {
                    concurrentHashMap.remove(str, c0240gh);
                    c0277hh.getClass();
                    hg3.m2166d(str3, "Send open request failed: ".concat(fg1.m1624Q(th)));
                }
                return a83Var;
            case 3:
                ((AbstractC0057bj) obj3).mo550a();
                C0885xg c0885xg = (C0885xg) ((C0093cj) obj2).f1581c;
                int i3 = ((a72) obj).f108h;
                do {
                    i = c0885xg.get();
                } while (!c0885xg.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return a83Var;
            case 4:
                C0699sm c0699sm = (C0699sm) obj3;
                o62 o62VarM4895M0 = C0699sm.m4895M0(c0699sm, (zn1) obj2, (C0723t6) obj);
                if (o62VarM4895M0 == null) {
                    return null;
                }
                g00 g00Var2 = c0699sm.f10188v;
                if (h11.m2041a(g00Var2.f3211B, -1L)) {
                    nz0.m3458c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return o62VarM4895M0.m3521i(g00Var2.m1774Q0(o62VarM4895M0, g00Var2.m1772N0(), 0L) ^ (-9223372034707292160L));
            case 5:
                xk1 xk1Var = (xk1) obj;
                C0971zq c0971zq = (C0971zq) obj3;
                xk1 xk1Var2 = (xk1) obj2;
                List list = (List) xk1Var.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (!t11.m5086l(((C0971zq) obj4).f14022a, c0971zq.f14022a)) {
                        arrayList2.add(obj4);
                    }
                }
                xk1Var.setValue(arrayList2);
                xk1Var2.setValue(null);
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                up0 up0Var = ((C0102cq) obj3).f1667b;
                up0Var.getClass();
                return up0Var.mo847o(((C0605q5) obj).f8739i.f13644d, ((yr0) obj2).m6320a());
            case 7:
                g00 g00Var3 = (g00) obj3;
                p83 p83Var = (p83) obj2;
                InterfaceC0815vm interfaceC0815vm = (InterfaceC0815vm) obj;
                C0429lm c0429lm = g00Var3.f3217z;
                while (true) {
                    zk1 zk1Var = c0429lm.f6190a;
                    int i4 = zk1Var.f13936j;
                    if (i4 == 0) {
                        g00Var = g00Var3;
                    } else {
                        if (i4 == 0) {
                            um2.m5519i("MutableVector is empty.");
                            return null;
                        }
                        o62 o62Var = (o62) ((d00) zk1Var.f13934h[i4 - 1]).f1798a.mo6a();
                        if (o62Var == null) {
                            g00Var = g00Var3;
                            zM1771O0 = true;
                        } else {
                            g00Var = g00Var3;
                            zM1771O0 = g00.m1771O0(g00Var, o62Var, 0L, 0L, 3);
                        }
                        if (zM1771O0) {
                            zk1 zk1Var2 = c0429lm.f6190a;
                            ((d00) zk1Var2.m6432k(zk1Var2.f13936j - 1)).f1799b.mo2509h(a83Var);
                            g00Var3 = g00Var;
                        }
                    }
                }
                if (g00Var.f3210A) {
                    o62 o62Var2 = (o62) g00Var.f3216y.mo6a();
                    if (((o62Var2 == null || !g00.m1771O0(g00Var, o62Var2, 0L, 0L, 3)) ? 0 : 1) != 0) {
                        g00Var.f3210A = false;
                    }
                }
                p83Var.f8041e = g00.m1770M0(g00Var, interfaceC0815vm, 0L);
                return a83Var;
            case 8:
                ArrayList<ow1> arrayList3 = (ArrayList) obj2;
                ArrayList<ow1> arrayList4 = (ArrayList) obj;
                for (TextView textView : (List) obj3) {
                    ViewParent parent = textView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (viewGroup.getTag(R.id.display_message_details_time_view) == textView) {
                            viewGroup.setTag(R.id.display_message_details_time_view, null);
                        }
                        viewGroup.removeView(textView);
                    }
                }
                for (ow1 ow1Var : arrayList3) {
                    ViewGroup viewGroup2 = (ViewGroup) ow1Var.f7862h;
                    v90 v90Var = (v90) ow1Var.f7863i;
                    viewGroup2.setPadding(v90Var.f11846a, v90Var.f11847b, v90Var.f11848c, v90Var.f11849d);
                }
                for (ow1 ow1Var2 : arrayList4) {
                    ViewGroup viewGroup3 = (ViewGroup) ow1Var2.f7862h;
                    u90 u90Var = (u90) ow1Var2.f7863i;
                    viewGroup3.setClipChildren(u90Var.f11155a);
                    viewGroup3.setClipToPadding(u90Var.f11156b);
                }
                return a83Var;
            case 9:
                go0 go0Var = (go0) obj3;
                C0138dq c0138dq = (C0138dq) obj2;
                pr2 pr2Var = (pr2) obj;
                C0635qx c0635qx = go0Var.f3607M;
                C0138dq c0138dq2 = c0635qx.f9262b;
                try {
                    c0635qx.f9262b = c0138dq;
                    pr2 pr2Var2 = go0Var.f3601G;
                    int[] iArr = go0Var.f3630o;
                    zj1 zj1Var = go0Var.f3637v;
                    go0Var.f3630o = null;
                    go0Var.f3637v = null;
                    try {
                        go0Var.f3601G = pr2Var;
                        boolean z = c0635qx.f9265e;
                        try {
                            c0635qx.f9265e = false;
                            throw null;
                        } catch (Throwable th2) {
                            c0635qx.f9265e = z;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        go0Var.f3601G = pr2Var2;
                        go0Var.f3630o = iArr;
                        go0Var.f3637v = zj1Var;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    c0635qx.f9262b = c0138dq2;
                    throw th4;
                }
            case 10:
                return HomeActivity.onCreate$lambda$0$17$0$0$0$0((HomeActivity) obj3, (xk1) obj, (xk1) obj2);
            case 11:
                ((xk1) obj).setValue(null);
                ((xk1) obj2).setValue(Integer.valueOf(((yp2) obj3).f13555a));
                return a83Var;
            case 12:
                ((xk1) obj).setValue(null);
                ((xk1) obj2).setValue(((wm0) obj3).name());
                return a83Var;
            case 13:
                xk1 xk1Var3 = (xk1) obj;
                xk1 xk1Var4 = (xk1) obj2;
                pp1 pp1Var = pp1.f8445a;
                AbstractC0812vj abstractC0812vj = ((xt0) obj3).f13167a;
                String strMo9d = abstractC0812vj.mo9d();
                strMo9d.getClass();
                op1 op1VarM3930b = pp1.m3930b();
                op1VarM3930b.getClass();
                try {
                    x92Var = (List) op1VarM3930b.m3605b(AbstractC0691se.m4815D(new C0090cg(yt0.Companion.serializer())), null, "hooker_debug_records");
                    break;
                } catch (Throwable th5) {
                    x92Var = new x92(th5);
                }
                if (x92Var instanceof x92) {
                    x92Var = null;
                }
                List list2 = (List) x92Var;
                ?? r2 = arrayList;
                if (list2 != null) {
                    r2 = list2;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : r2) {
                    if (!t11.m5086l(((yt0) obj5).m6337l(), strMo9d)) {
                        arrayList5.add(obj5);
                    }
                }
                try {
                    op1VarM3930b.m3607d(new C0090cg(yt0.Companion.serializer()), arrayList5, "hooker_debug_records");
                    break;
                } catch (Throwable unused) {
                }
                abstractC0812vj.f11986b.clear();
                xk1Var3.setValue(Integer.valueOf(((Number) xk1Var3.getValue()).intValue() + 1));
                xk1Var4.setValue(null);
                return a83Var;
            case 14:
                d91 d91Var = (d91) obj2;
                s81 s81Var = (s81) ((n70) obj3).getValue();
                return new t81(d91Var, s81Var, (o71) obj, new C0158e9((c11) ((d81) d91Var.f1920e.f7824e).getValue(), s81Var));
            case 15:
                in0 in0Var = (in0) obj3;
                Integer num = (Integer) obj2;
                if (!((Boolean) ((xk1) obj).getValue()).booleanValue()) {
                    iIntValue = num != null ? num.intValue() : -1;
                    return a83Var;
                }
                in0Var.mo5j(new ci1(iIntValue));
                return a83Var;
            case 16:
                ao0 ao0Var = (ao0) obj3;
                tr2 tr2Var = (tr2) obj2;
                jv1 jv1Var = (jv1) obj;
                if (ao0Var != null) {
                    tr2Var.m5410a(tr2Var.m5412c(ao0Var) - tr2Var.f10932t);
                }
                List listM3776l = AbstractC0570p7.m3776l(tr2Var, null, tr2Var.f10932t, null);
                C0219fx c0219fx = (C0219fx) AbstractC0142du.m1167w0(listM3776l);
                Integer num2 = c0219fx != null ? c0219fx.f3160b : null;
                List listMo912f = jv1Var.mo912f(num2);
                if (num2 != null && !listMo912f.isEmpty()) {
                    C0219fx c0219fx2 = (C0219fx) AbstractC0142du.m1159o0(listMo912f);
                    int size = listMo912f.size() - 1;
                    if (size > 0) {
                        if (size == 1) {
                            arrayList = AbstractC0179eu.m1434O(AbstractC0142du.m1166v0(listMo912f));
                        } else {
                            arrayList = new ArrayList(size);
                            if (listMo912f instanceof RandomAccess) {
                                int size2 = listMo912f.size();
                                while (i < size2) {
                                    arrayList.add(listMo912f.get(i));
                                    i++;
                                }
                            } else {
                                ListIterator listIterator = listMo912f.listIterator(1);
                                while (listIterator.hasNext()) {
                                    arrayList.add(listIterator.next());
                                }
                            }
                        }
                    }
                    listMo912f = AbstractC0142du.m1168x0(AbstractC0179eu.m1434O(new C0219fx(c0219fx2.f3159a, null, num2)), arrayList);
                }
                return new C0182ex(AbstractC0142du.m1168x0(listM3776l, listMo912f), jv1Var.mo913i());
            default:
                in0 in0Var2 = (in0) obj3;
                Set set = (Set) ((xk1) obj).getValue();
                Set set2 = (Set) obj2;
                set.getClass();
                set2.getClass();
                Set setM1148F0 = set2 instanceof Collection ? set2 : AbstractC0142du.m1148F0(set2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj6 : set) {
                    if (setM1148F0.contains(obj6)) {
                        linkedHashSet.add(obj6);
                    }
                }
                in0Var2.mo5j(linkedHashSet);
                return a83Var;
        }
    }

    public /* synthetic */ C0678s1(xk1 xk1Var, C0971zq c0971zq, xk1 xk1Var2) {
        this.f9856h = 5;
        this.f9857i = xk1Var;
        this.f9858j = c0971zq;
        this.f9859k = xk1Var2;
    }

    public /* synthetic */ C0678s1(Object obj, xk1 xk1Var, xk1 xk1Var2, int i) {
        this.f9856h = i;
        this.f9858j = obj;
        this.f9857i = xk1Var;
        this.f9859k = xk1Var2;
    }

    public /* synthetic */ C0678s1(Object obj, Object obj2, Object obj3, int i) {
        this.f9856h = i;
        this.f9858j = obj;
        this.f9859k = obj2;
        this.f9857i = obj3;
    }
}
