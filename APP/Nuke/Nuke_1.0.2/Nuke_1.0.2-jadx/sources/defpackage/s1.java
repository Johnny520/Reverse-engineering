package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s1(go0 go0Var, dq dqVar, pr2 pr2Var, ui1 ui1Var) {
        this.h = 9;
        this.j = go0Var;
        this.k = dqVar;
        this.i = pr2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:199:0x00c9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [be0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30 */
    @Override // defpackage.xm0
    public final Object a() {
        int i;
        g00 g00Var;
        boolean zO0;
        Object x92Var;
        int iIntValue;
        int i2 = this.h;
        ?? arrayList = be0.h;
        a83 a83Var = a83.a;
        Object obj = this.i;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i2) {
            case 0:
                ((xk1) obj).setValue(null);
                sp0.R((Context) obj3, ((rh0) obj2).a);
                return a83Var;
            case 1:
                ((in0) obj3).j(new de((String) ((xk1) obj).getValue(), (String) ((xk1) obj2).getValue()));
                return a83Var;
            case 2:
                String str = (String) obj3;
                gh ghVar = (gh) obj2;
                String str2 = (String) obj;
                String str3 = hh.h;
                hh hhVar = hh.d;
                ConcurrentHashMap concurrentHashMap = hh.j;
                try {
                    if (concurrentHashMap.get(str) == ghVar) {
                        hhVar.getClass();
                        Object objQ = hh.q(ghVar, str2);
                        bn1.d.getClass();
                        Object objInvoke = ((Method) bn1.h.getValue()).invoke(bn1.g.getValue(), objQ);
                        objInvoke.getClass();
                        if (!((Boolean) objInvoke).booleanValue()) {
                            concurrentHashMap.remove(str, ghVar);
                            hg3.d(str3, "WeChat rejected open request: sendId=".concat(str));
                        }
                        break;
                    }
                } catch (Throwable th) {
                    concurrentHashMap.remove(str, ghVar);
                    hhVar.getClass();
                    hg3.d(str3, "Send open request failed: ".concat(fg1.Q(th)));
                }
                return a83Var;
            case 3:
                ((bj) obj3).a();
                xg xgVar = (xg) ((cj) obj2).c;
                int i3 = ((a72) obj).h;
                do {
                    i = xgVar.get();
                } while (!xgVar.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return a83Var;
            case 4:
                sm smVar = (sm) obj3;
                o62 o62VarM0 = sm.M0(smVar, (zn1) obj2, (t6) obj);
                if (o62VarM0 == null) {
                    return null;
                }
                g00 g00Var2 = smVar.v;
                if (h11.a(g00Var2.B, -1L)) {
                    nz0.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return o62VarM0.i(g00Var2.Q0(o62VarM0, g00Var2.N0(), 0L) ^ (-9223372034707292160L));
            case 5:
                xk1 xk1Var = (xk1) obj;
                zq zqVar = (zq) obj3;
                xk1 xk1Var2 = (xk1) obj2;
                List list = (List) xk1Var.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (!t11.l(((zq) obj4).a, zqVar.a)) {
                        arrayList2.add(obj4);
                    }
                }
                xk1Var.setValue(arrayList2);
                xk1Var2.setValue(null);
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                up0 up0Var = ((cq) obj3).b;
                up0Var.getClass();
                return up0Var.o(((q5) obj).i.d, ((yr0) obj2).a());
            case 7:
                g00 g00Var3 = (g00) obj3;
                p83 p83Var = (p83) obj2;
                vm vmVar = (vm) obj;
                lm lmVar = g00Var3.z;
                while (true) {
                    zk1 zk1Var = lmVar.a;
                    int i4 = zk1Var.j;
                    if (i4 == 0) {
                        g00Var = g00Var3;
                    } else {
                        if (i4 == 0) {
                            um2.i("MutableVector is empty.");
                            return null;
                        }
                        o62 o62Var = (o62) ((d00) zk1Var.h[i4 - 1]).a.a();
                        if (o62Var == null) {
                            g00Var = g00Var3;
                            zO0 = true;
                        } else {
                            g00Var = g00Var3;
                            zO0 = g00.O0(g00Var, o62Var, 0L, 0L, 3);
                        }
                        if (zO0) {
                            zk1 zk1Var2 = lmVar.a;
                            ((d00) zk1Var2.k(zk1Var2.j - 1)).b.h(a83Var);
                            g00Var3 = g00Var;
                        }
                    }
                }
                if (g00Var.A) {
                    o62 o62Var2 = (o62) g00Var.y.a();
                    if (((o62Var2 == null || !g00.O0(g00Var, o62Var2, 0L, 0L, 3)) ? 0 : 1) != 0) {
                        g00Var.A = false;
                    }
                }
                p83Var.e = g00.M0(g00Var, vmVar, 0L);
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
                    ViewGroup viewGroup2 = (ViewGroup) ow1Var.h;
                    v90 v90Var = (v90) ow1Var.i;
                    viewGroup2.setPadding(v90Var.a, v90Var.b, v90Var.c, v90Var.d);
                }
                for (ow1 ow1Var2 : arrayList4) {
                    ViewGroup viewGroup3 = (ViewGroup) ow1Var2.h;
                    u90 u90Var = (u90) ow1Var2.i;
                    viewGroup3.setClipChildren(u90Var.a);
                    viewGroup3.setClipToPadding(u90Var.b);
                }
                return a83Var;
            case 9:
                go0 go0Var = (go0) obj3;
                dq dqVar = (dq) obj2;
                pr2 pr2Var = (pr2) obj;
                qx qxVar = go0Var.M;
                dq dqVar2 = qxVar.b;
                try {
                    qxVar.b = dqVar;
                    pr2 pr2Var2 = go0Var.G;
                    int[] iArr = go0Var.o;
                    zj1 zj1Var = go0Var.v;
                    go0Var.o = null;
                    go0Var.v = null;
                    try {
                        go0Var.G = pr2Var;
                        boolean z = qxVar.e;
                        try {
                            qxVar.e = false;
                            throw null;
                        } catch (Throwable th2) {
                            qxVar.e = z;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        go0Var.G = pr2Var2;
                        go0Var.o = iArr;
                        go0Var.v = zj1Var;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    qxVar.b = dqVar2;
                    throw th4;
                }
            case 10:
                return HomeActivity.onCreate$lambda$0$17$0$0$0$0((HomeActivity) obj3, (xk1) obj, (xk1) obj2);
            case 11:
                ((xk1) obj).setValue(null);
                ((xk1) obj2).setValue(Integer.valueOf(((yp2) obj3).a));
                return a83Var;
            case 12:
                ((xk1) obj).setValue(null);
                ((xk1) obj2).setValue(((wm0) obj3).name());
                return a83Var;
            case 13:
                xk1 xk1Var3 = (xk1) obj;
                xk1 xk1Var4 = (xk1) obj2;
                pp1 pp1Var = pp1.a;
                vj vjVar = ((xt0) obj3).a;
                String strD = vjVar.d();
                strD.getClass();
                op1 op1VarB = pp1.b();
                op1VarB.getClass();
                try {
                    x92Var = (List) op1VarB.b(se.D(new cg(yt0.Companion.serializer())), null, "hooker_debug_records");
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
                    if (!t11.l(((yt0) obj5).l(), strD)) {
                        arrayList5.add(obj5);
                    }
                }
                try {
                    op1VarB.d(new cg(yt0.Companion.serializer()), arrayList5, "hooker_debug_records");
                    break;
                } catch (Throwable unused) {
                }
                vjVar.b.clear();
                xk1Var3.setValue(Integer.valueOf(((Number) xk1Var3.getValue()).intValue() + 1));
                xk1Var4.setValue(null);
                return a83Var;
            case 14:
                d91 d91Var = (d91) obj2;
                s81 s81Var = (s81) ((n70) obj3).getValue();
                return new t81(d91Var, s81Var, (o71) obj, new e9((c11) ((d81) d91Var.e.e).getValue(), s81Var));
            case 15:
                in0 in0Var = (in0) obj3;
                Integer num = (Integer) obj2;
                if (!((Boolean) ((xk1) obj).getValue()).booleanValue()) {
                    iIntValue = num != null ? num.intValue() : -1;
                    return a83Var;
                }
                in0Var.j(new ci1(iIntValue));
                return a83Var;
            case 16:
                ao0 ao0Var = (ao0) obj3;
                tr2 tr2Var = (tr2) obj2;
                jv1 jv1Var = (jv1) obj;
                if (ao0Var != null) {
                    tr2Var.a(tr2Var.c(ao0Var) - tr2Var.t);
                }
                List listL = p7.l(tr2Var, null, tr2Var.t, null);
                fx fxVar = (fx) du.w0(listL);
                Integer num2 = fxVar != null ? fxVar.b : null;
                List listF = jv1Var.f(num2);
                if (num2 != null && !listF.isEmpty()) {
                    fx fxVar2 = (fx) du.o0(listF);
                    int size = listF.size() - 1;
                    if (size > 0) {
                        if (size == 1) {
                            arrayList = eu.O(du.v0(listF));
                        } else {
                            arrayList = new ArrayList(size);
                            if (listF instanceof RandomAccess) {
                                int size2 = listF.size();
                                while (i < size2) {
                                    arrayList.add(listF.get(i));
                                    i++;
                                }
                            } else {
                                ListIterator listIterator = listF.listIterator(1);
                                while (listIterator.hasNext()) {
                                    arrayList.add(listIterator.next());
                                }
                            }
                        }
                    }
                    listF = du.x0(eu.O(new fx(fxVar2.a, null, num2)), arrayList);
                }
                return new ex(du.x0(listL, listF), jv1Var.i());
            default:
                in0 in0Var2 = (in0) obj3;
                Set set = (Set) ((xk1) obj).getValue();
                Set set2 = (Set) obj2;
                set.getClass();
                set2.getClass();
                Set setF0 = set2 instanceof Collection ? set2 : du.F0(set2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj6 : set) {
                    if (setF0.contains(obj6)) {
                        linkedHashSet.add(obj6);
                    }
                }
                in0Var2.j(linkedHashSet);
                return a83Var;
        }
    }

    public /* synthetic */ s1(xk1 xk1Var, zq zqVar, xk1 xk1Var2) {
        this.h = 5;
        this.i = xk1Var;
        this.j = zqVar;
        this.k = xk1Var2;
    }

    public /* synthetic */ s1(Object obj, xk1 xk1Var, xk1 xk1Var2, int i) {
        this.h = i;
        this.j = obj;
        this.i = xk1Var;
        this.k = xk1Var2;
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }
}
