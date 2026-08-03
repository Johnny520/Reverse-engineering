package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0107l;
import ci.C0589j;
import gg.AbstractC1416l;
import gg.C1425u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import na.C2921i;
import na.C2922j;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p010aa.C0033a;
import p010aa.C0040h;
import p027c0.C0368m;
import p063e9.C0832c;
import p063e9.C0848s;
import p068eh.AbstractC0921a;
import p070f0.C0970b;
import p078f9.C1097h;
import p080fb.C1165q1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.utils.KavaReflector;
import p117i0.InterfaceC1809a1;
import p126ia.C2007a0;
import p126ia.C2009c;
import p136j8.AbstractC2091b;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p230p8.C3360l;
import p230p8.C3363o;
import p230p8.C3367s;
import p243q9.C3471g;
import p243q9.C3472h;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p259r9.AbstractC3754e0;
import p261rb.C3785a;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5065l4;
import p332wb.C4759bp;
import p332wb.C4792cp;
import p332wb.C4806d6;
import p332wb.C4849eh;
import p332wb.C4935h4;
import p332wb.C4957hq;
import p332wb.C5032k4;
import p332wb.C5096m2;
import p332wb.C5124mu;
import p332wb.C5197p4;
import p332wb.C5292s0;
import p332wb.C5391v0;
import p332wb.C5491y2;
import p343x6.AbstractC5700d;
import p345x8.C5709b;
import p345x8.C5725r;
import p345x8.C5726s;
import p345x8.C5728u;
import p345x8.C5732y;
import p346x9.C5738e;
import p346x9.C5739f;
import p357y1.C5868c1;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4175v;
import ua.C4297h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: c9.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0482r0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1427g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1428h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1429i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1430j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1431k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1432l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0482r0(C1425u c1425u, FrameLayout frameLayout, C0416a1 c0416a1, ViewGroup viewGroup, InterfaceC1220a interfaceC1220a) {
        this.f1427g = 27;
        this.f1432l = c1425u;
        this.f1430j = frameLayout;
        this.f1429i = c0416a1;
        this.f1431k = viewGroup;
        this.f1428h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m1511e() throws JSONException {
        Context context = (Context) this.f1429i;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1430j;
        C0832c c0832c = (C0832c) this.f1431k;
        C0848s c0848s = (C0848s) this.f1428h;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1432l;
        List list = (List) interfaceC1809a1.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC1416l.m3825a(((C0832c) obj).f2511b, c0832c.f2511b)) {
                arrayList.add(obj);
            }
        }
        AbstractC4955ho.m9603m0(c0848s, interfaceC1809a1, arrayList);
        Toast.makeText(context, "规则已删除", 0).show();
        interfaceC1809a12.setValue(C5096m2.f18833c);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final Object m1512f() throws JSONException {
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1429i;
        C5725r c5725r = (C5725r) this.f1430j;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1431k;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1428h;
        InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1432l;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strM2249l = AbstractC0921a.m2249l(((List) interfaceC1809a1.getValue()).size() + 1, "规则 ");
        List listM99x0 = AbstractC0000a.m99x0(new C5726s(31, null, null));
        C4175v c4175v = C4175v.f13712g;
        C5709b c5709b = new C5709b(strValueOf, strM2249l, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0, c4175v, c4175v, c4175v, c4175v, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0L, false, listM99x0);
        AbstractC4955ho.m9294B(c5725r, interfaceC1809a1, AbstractC4166m.m8398G1((List) interfaceC1809a1.getValue(), c5709b));
        interfaceC1809a12.setValue(strValueOf);
        interfaceC1809a13.setValue(c5709b);
        interfaceC1809a14.setValue("ruleEditor");
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Object m1513g() {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1429i;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1430j;
        Context context = (Context) this.f1431k;
        C1165q1 c1165q1 = (C1165q1) this.f1428h;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1432l;
        interfaceC1809a1.setValue(Boolean.TRUE);
        AbstractC3603v.m7563q(interfaceC3599t, null, new C0970b(context, c1165q1, interfaceC1809a12, interfaceC1809a1, null, 10), 3);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final Object m1514h() {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1429i;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1430j;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1431k;
        C3641z c3641z = (C3641z) this.f1428h;
        List list = (List) this.f1432l;
        interfaceC1809a1.setValue(Boolean.FALSE);
        C5491y2.m9797Q(interfaceC1809a12, true);
        AbstractC3603v.m7563q(interfaceC3599t, null, new C0589j(c3641z, list, (InterfaceC5557c) null, 22), 3);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Object obj;
        String str;
        int i9;
        boolean z9;
        int i10;
        String string;
        boolean zM1495s;
        Object c3959f;
        Object c3959f2;
        Object obj2;
        Object obj3;
        Object c3959f3;
        Object obj4;
        boolean z10 = true;
        boolean zM1494r = false;
        int i11 = 0;
        zM3825a = false;
        boolean zM3825a = false;
        boolean zM4951h = false;
        zM1494r = false;
        zM1494r = false;
        switch (this.f1427g) {
            case 0:
                C0416a1 c0416a1 = (C0416a1) this.f1429i;
                FrameLayout frameLayout = (FrameLayout) this.f1430j;
                ViewGroup viewGroup = (ViewGroup) this.f1431k;
                Activity activity = (Activity) this.f1428h;
                try {
                    obj = ((C1425u) this.f1432l).f4738g;
                } catch (Throwable unused) {
                }
                if (obj == null) {
                    AbstractC1416l.m3831g("compose");
                    throw null;
                }
                ((C5868c1) obj).m10555f();
                try {
                    ViewParent parent = frameLayout.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(frameLayout);
                    }
                    break;
                } catch (Throwable unused2) {
                }
                AbstractC5700d.m10289p(frameLayout);
                AbstractC5700d.m10289p(viewGroup);
                C0114s c0114s = c0416a1.f1194h;
                EnumC0107l enumC0107l = c0114s.f300c;
                EnumC0107l enumC0107l2 = EnumC0107l.f289g;
                if (enumC0107l != enumC0107l2) {
                    c0114s.m554c("setCurrentState");
                    c0114s.m556e(enumC0107l2);
                }
                c0416a1.f1197k.m7634a();
                c0416a1.f1196j.m545a();
                C0452j1.f1327b.remove(activity);
                break;
                break;
            case 1:
                AbstractC0473o2 abstractC0473o2 = (AbstractC0473o2) this.f1429i;
                Activity activity2 = (Activity) this.f1428h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1430j;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f1432l;
                if (abstractC0473o2 instanceof C0436f1) {
                    zM1495s = AbstractC0473o2.m1495s(activity2, ((C0436f1) abstractC0473o2).f1288b, (String) interfaceC1809a1.getValue());
                } else {
                    if (!(abstractC0473o2 instanceof C0440g1)) {
                        C3193a.m6822k();
                        return null;
                    }
                    String str2 = ((C0440g1) abstractC0473o2).f1296b;
                    String str3 = (String) interfaceC1809a1.getValue();
                    activity2.getClass();
                    str2.getClass();
                    synchronized (AbstractC0473o2.f1396a) {
                        try {
                            String strM1477a = AbstractC0473o2.m1477a();
                            if (!AbstractC3149m.m6721t0(strM1477a)) {
                                List<C0414a> listM1486j = AbstractC0473o2.m1486j(activity2, strM1477a);
                                String string2 = AbstractC3149m.m6703R0(str2).toString();
                                if (str3 == null || (string = AbstractC3149m.m6703R0(str3).toString()) == null) {
                                    str = null;
                                } else {
                                    if (string.length() <= 0) {
                                        string = null;
                                    }
                                    str = string;
                                }
                                Iterator it = listM1486j.iterator();
                                int i12 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i9 = -1;
                                    } else if (AbstractC1416l.m3825a(((C0414a) it.next()).f1179a, string2)) {
                                        i9 = i12;
                                    } else {
                                        i12++;
                                    }
                                }
                                if (i9 >= 0) {
                                    if (str == null) {
                                        z9 = true;
                                    } else if (str.equals(string2) || listM1486j.isEmpty()) {
                                        z9 = false;
                                    } else {
                                        Iterator it2 = listM1486j.iterator();
                                        while (it2.hasNext()) {
                                            if (AbstractC1416l.m3825a(((C0414a) it2.next()).f1179a, str)) {
                                                z9 = !AbstractC0473o2.m1482f(string2, listM1486j).contains(str);
                                            }
                                        }
                                        z9 = false;
                                    }
                                    if (z9) {
                                        if (listM1486j.isEmpty()) {
                                            i10 = 0;
                                        } else {
                                            int i13 = 0;
                                            for (C0414a c0414a : listM1486j) {
                                                if ((AbstractC1416l.m3825a(c0414a.f1181c, str) && !AbstractC1416l.m3825a(c0414a.f1179a, string2)) && (i13 = i13 + 1) < 0) {
                                                    AbstractC0000a.m30P0();
                                                    throw null;
                                                }
                                            }
                                            i10 = i13;
                                        }
                                        ArrayList arrayList = new ArrayList(listM1486j);
                                        arrayList.set(i9, C0414a.m1401a((C0414a) arrayList.get(i9), null, null, str, i10, null, null, false, null, false, false, false, 4083));
                                        zM1494r = AbstractC0473o2.m1494r(activity2, strM1477a, AbstractC0473o2.m1488l(arrayList));
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    zM1495s = zM1494r;
                }
                C0452j1.m1455p(activity2, zM1495s ? "聊天分组已更新" : "更新聊天分组失败");
                if (zM1495s) {
                    C0452j1.m1453n(interfaceC1220a2);
                    interfaceC1220a.invoke();
                }
                return C3967n.f12976a;
            case 2:
                C2007a0 c2007a0 = (C2007a0) this.f1429i;
                Activity activity3 = (Activity) this.f1428h;
                C3360l c3360l = (C3360l) this.f1430j;
                String str4 = (String) this.f1431k;
                C2009c c2009c = (C2009c) this.f1432l;
                synchronized (c2007a0.f6768k) {
                    try {
                        Object obj5 = c2007a0.m4955m(str4).f10806b;
                        if (obj5 == null) {
                            c2007a0.f6761d.invoke("朋友圈伪互动未找到本地记录: " + str4, null);
                        } else {
                            C2009c c2009cM815l = c2007a0.f6759b.m815l(str4);
                            zM4951h = c2007a0.m4951h(str4, obj5, c2007a0.m4948d(c2009cM815l), C2007a0.m4945j(c2009c, c2009cM815l), c2007a0.m4950f(), c2007a0.m4949e());
                            if (zM4951h) {
                                c2007a0.f6759b.m806a(str4, c2009cM815l);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (zM4951h) {
                    WeakReference weakReference = c3360l.f10847d;
                    c2007a0.m4956n(activity3, weakReference != null ? (View) weakReference.get() : null);
                }
                return C3967n.f12976a;
            case 3:
                C3363o c3363o = (C3363o) this.f1429i;
                Method method = (Method) this.f1430j;
                Method method2 = (Method) this.f1431k;
                C3367s c3367s = (C3367s) this.f1428h;
                String str5 = (String) this.f1432l;
                try {
                    Object objInvokeOrThrow = KavaReflector.invokeOrThrow(method, null, new Object[0]);
                    if (objInvokeOrThrow != null && method2.getDeclaringClass().isInstance(objInvokeOrThrow)) {
                        Object obj6 = c3367s.f10869e;
                        String str6 = c3367s.f10865a;
                        String str7 = AbstractC3149m.m6721t0(str5) ? str6 : str5;
                        Boolean bool = Boolean.FALSE;
                        Boolean bool2 = Boolean.TRUE;
                        Object objInvokeOrThrow2 = KavaReflector.invokeOrThrow(method2, objInvokeOrThrow, obj6, 1, str7, bool, bool2, 31, str6);
                        zM3825a = AbstractC1416l.m3825a(objInvokeOrThrow2 instanceof Boolean ? (Boolean) objInvokeOrThrow2 : null, bool2);
                    }
                    c3959f = Boolean.valueOf(zM3825a);
                    break;
                } catch (Throwable th4) {
                    c3959f = new C3959f(th4);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    c3363o.f10854b.invoke("调用微信朋友圈视频下载失败: ".concat(c3367s.f10865a), thM8182b);
                }
                Boolean bool3 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = bool3;
                }
                return (Boolean) c3959f;
            case 4:
                C3363o c3363o2 = (C3363o) this.f1429i;
                Method method3 = (Method) this.f1430j;
                Method method4 = (Method) this.f1431k;
                C3367s c3367s2 = (C3367s) this.f1428h;
                Object obj7 = this.f1432l;
                try {
                    Object objInvokeOrThrow3 = KavaReflector.invokeOrThrow(method3, null, new Object[0]);
                    if (objInvokeOrThrow3 == null || !method4.getDeclaringClass().isInstance(objInvokeOrThrow3)) {
                        z10 = false;
                    } else {
                        KavaReflector.invokeOrThrow(method4, objInvokeOrThrow3, c3367s2.f10869e, 2, null, obj7);
                    }
                    c3959f2 = Boolean.valueOf(z10);
                    break;
                } catch (Throwable th5) {
                    c3959f2 = new C3959f(th5);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                if (thM8182b2 != null) {
                    c3363o2.f10854b.invoke("调用微信朋友圈原图下载失败: ".concat(c3367s2.f10865a), thM8182b2);
                }
                Boolean bool4 = Boolean.FALSE;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = bool4;
                }
                return (Boolean) c3959f2;
            case 5:
                C1097h c1097h = (C1097h) this.f1429i;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1430j;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1432l;
                if (c1097h.f3532d && AbstractC3149m.m6721t0(AbstractC3149m.m6703R0((String) interfaceC1809a12.getValue()).toString())) {
                    interfaceC1809a13.setValue("请输入金额");
                } else {
                    interfaceC1235p.invoke((String) interfaceC1809a12.getValue(), (String) interfaceC1809a14.getValue());
                }
                return C3967n.f12976a;
            case 6:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1429i;
                FrameLayout frameLayout2 = (FrameLayout) this.f1430j;
                ViewGroup viewGroup3 = (ViewGroup) this.f1431k;
                C0416a1 c0416a12 = (C0416a1) this.f1428h;
                C1425u c1425u = (C1425u) this.f1432l;
                if (!atomicBoolean.getAndSet(true)) {
                    try {
                        obj2 = c1425u.f4738g;
                    } catch (Throwable unused3) {
                    }
                    if (obj2 == null) {
                        AbstractC1416l.m3831g("compose");
                        throw null;
                    }
                    ((C5868c1) obj2).m10555f();
                    if (frameLayout2.getParent() == viewGroup3) {
                        viewGroup3.removeView(frameLayout2);
                    }
                    AbstractC5700d.m10289p(frameLayout2);
                    AbstractC5700d.m10289p(viewGroup3);
                    C0114s c0114s2 = c0416a12.f1194h;
                    EnumC0107l enumC0107l3 = c0114s2.f300c;
                    EnumC0107l enumC0107l4 = EnumC0107l.f289g;
                    if (enumC0107l3 != enumC0107l4) {
                        c0114s2.m554c("setCurrentState");
                        c0114s2.m556e(enumC0107l4);
                    }
                    c0416a12.f1197k.m7634a();
                    c0416a12.f1196j.m545a();
                }
                return C3967n.f12976a;
            case 7:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1429i;
                FrameLayout frameLayout3 = (FrameLayout) this.f1430j;
                ViewGroup viewGroup4 = (ViewGroup) this.f1431k;
                C0416a1 c0416a13 = (C0416a1) this.f1428h;
                C1425u c1425u2 = (C1425u) this.f1432l;
                if (!atomicBoolean2.getAndSet(true)) {
                    try {
                        obj3 = c1425u2.f4738g;
                    } catch (Throwable unused4) {
                    }
                    if (obj3 == null) {
                        AbstractC1416l.m3831g("compose");
                        throw null;
                    }
                    ((C5868c1) obj3).m10555f();
                    if (frameLayout3.getParent() == viewGroup4) {
                        viewGroup4.removeView(frameLayout3);
                    }
                    AbstractC5700d.m10289p(frameLayout3);
                    AbstractC5700d.m10289p(viewGroup4);
                    C0114s c0114s3 = c0416a13.f1194h;
                    EnumC0107l enumC0107l5 = c0114s3.f300c;
                    EnumC0107l enumC0107l6 = EnumC0107l.f289g;
                    if (enumC0107l5 != enumC0107l6) {
                        c0114s3.m554c("setCurrentState");
                        c0114s3.m556e(enumC0107l6);
                    }
                    c0416a13.f1197k.m7634a();
                    c0416a13.f1196j.m545a();
                }
                return C3967n.f12976a;
            case 8:
                C5391v0 c5391v0 = (C5391v0) this.f1429i;
                Context context = (Context) this.f1430j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1431k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1432l;
                List list = (List) interfaceC1809a15.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj8 : list) {
                    if (((Set) interfaceC1809a16.getValue()).contains(((C5292s0) obj8).f20550a)) {
                        arrayList2.add(obj8);
                    }
                }
                if (!arrayList2.isEmpty() || c5391v0.f21260c) {
                    interfaceC1231l.invoke(arrayList2);
                } else {
                    Toast.makeText(context, "请选择联系人", 0).show();
                }
                return C3967n.f12976a;
            case 9:
                Context context2 = (Context) this.f1429i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1430j;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1432l;
                if (((C5292s0) interfaceC1809a17.getValue()) == null && ((Set) interfaceC1809a18.getValue()).isEmpty() && !((Boolean) interfaceC1809a19.getValue()).booleanValue()) {
                    Toast.makeText(context2, "请先选择群聊", 0).show();
                } else {
                    interfaceC1231l2.invoke(AbstractC4166m.m8407P1((Set) interfaceC1809a18.getValue()));
                }
                return C3967n.f12976a;
            case 10:
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1429i;
                C4957hq c4957hq = (C4957hq) this.f1430j;
                Context context3 = (Context) this.f1431k;
                interfaceC1231l3.invoke(C2921i.m6338a(c4957hq.f17732b, null, null, null, ((Boolean) ((InterfaceC1809a1) this.f1428h).getValue()).booleanValue(), (String) ((InterfaceC1809a1) this.f1432l).getValue(), 7));
                Toast.makeText(context3, "适用聊天已保存", 0).show();
                break;
            case 11:
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f1429i;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1430j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1431k;
                Context context4 = (Context) this.f1428h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1432l;
                Boolean bool5 = (Boolean) interfaceC1809a110.getValue();
                bool5.booleanValue();
                Integer numM6742f0 = AbstractC3156t.m6742f0((String) interfaceC1809a111.getValue());
                AbstractC4955ho.m9670t4(context4, interfaceC1809a112, (C3785a) interfaceC1235p2.invoke(bool5, Integer.valueOf(numM6742f0 != null ? AbstractC3754e0.m7909r(numM6742f0.intValue(), 0, 300) : 3)));
                break;
            case 12:
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1429i;
                C5124mu c5124mu = (C5124mu) this.f1430j;
                Context context5 = (Context) this.f1431k;
                interfaceC1231l4.invoke(C4297h.m8632a(c5124mu.f19084b, null, null, null, ((Boolean) ((InterfaceC1809a1) this.f1428h).getValue()).booleanValue(), (String) ((InterfaceC1809a1) this.f1432l).getValue(), 7));
                Toast.makeText(context5, "适用聊天已保存", 0).show();
                break;
            case 13:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1429i;
                String str8 = (String) this.f1430j;
                Context context6 = (Context) this.f1431k;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f1428h;
                sharedPreferences.edit().putString(str8, AbstractC4166m.m8392A1((Set) ((InterfaceC1809a1) this.f1432l).getValue(), ";;;", null, null, null, 62)).apply();
                Toast.makeText(context6, "标签已保存", 0).show();
                interfaceC1220a3.invoke();
                break;
            case 14:
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1429i;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1430j;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1431k;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1432l;
                List listM99x0 = AbstractC0000a.m99x0(new C4759bp("旧版全局设置", -1, "未命中适用聊天时继续使用下方全局设置"));
                List list2 = (List) interfaceC1809a113.getValue();
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list2));
                int i14 = 0;
                for (Object obj9 : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    C2922j c2922j = (C2922j) obj9;
                    String strM2249l = c2922j.f9513b;
                    if (AbstractC3149m.m6721t0(strM2249l)) {
                        strM2249l = AbstractC0921a.m2249l(i15, "模板 ");
                    }
                    arrayList3.add(new C4759bp(strM2249l, i14, AbstractC4955ho.m9680u5(c2922j)));
                    i14 = i15;
                }
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM99x0, arrayList3);
                Iterator it3 = ((List) interfaceC1809a113.getValue()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i11 = -1;
                    } else if (!((C2922j) it3.next()).f9512a.equals((String) interfaceC1809a114.getValue())) {
                        i11++;
                    }
                }
                Integer numValueOf = i11 >= 0 ? Integer.valueOf(i11) : null;
                interfaceC1809a116.setValue(new C4792cp("默认规则", arrayListM8397F1, numValueOf != null ? numValueOf.intValue() : -1, new C4849eh(interfaceC1809a113, interfaceC1809a114, sharedPreferences2, interfaceC1809a115, interfaceC1809a116)));
                break;
            case 15:
                String str9 = (String) this.f1429i;
                C5725r c5725r = (C5725r) this.f1430j;
                Context context7 = (Context) this.f1431k;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f1432l;
                LinkedHashSet linkedHashSetM8351S = ((Set) interfaceC1809a117.getValue()).contains(str9) ? AbstractC4156d0.m8351S((Set) interfaceC1809a117.getValue(), str9) : AbstractC4156d0.m8354V((Set) interfaceC1809a117.getValue(), str9);
                interfaceC1809a117.setValue(linkedHashSetM8351S);
                String str10 = (String) interfaceC1809a118.getValue();
                c5725r.getClass();
                str10.getClass();
                String lowerCase = AbstractC3149m.m6703R0(str10).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                try {
                    c3959f3 = new JSONObject(c5725r.m10388h("zhilia_model_favorites_v1", HttpUrl.FRAGMENT_ENCODE_SET));
                } catch (Throwable th6) {
                    c3959f3 = new C3959f(th6);
                }
                JSONObject jSONObject = new JSONObject();
                boolean z11 = c3959f3 instanceof C3959f;
                Object obj10 = c3959f3;
                if (z11) {
                    obj10 = jSONObject;
                }
                JSONObject jSONObject2 = (JSONObject) obj10;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(linkedHashSetM8351S));
                Iterator it4 = linkedHashSetM8351S.iterator();
                while (it4.hasNext()) {
                    AbstractC2091b.m5171r((String) it4.next(), arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj11 : arrayList4) {
                    if (((String) obj11).length() > 0) {
                        arrayList5.add(obj11);
                    }
                }
                Iterator it5 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList5)).iterator();
                while (it5.hasNext()) {
                    jSONArray.put((String) it5.next());
                }
                jSONObject2.put(lowerCase, jSONArray);
                String string3 = jSONObject2.toString();
                string3.getClass();
                c5725r.m10391k("zhilia_model_favorites_v1", string3);
                Toast.makeText(context7, linkedHashSetM8351S.contains(str9) ? "已收藏模型" : "已取消收藏", 0).show();
                break;
            case 16:
                AbstractC5065l4 abstractC5065l4 = (AbstractC5065l4) this.f1429i;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f1430j;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f1432l;
                int size = ((List) interfaceC1809a119.getValue()).size();
                int i16 = ((C5032k4) abstractC5065l4).f18302a;
                if (i16 >= 0 && i16 < size) {
                    String str11 = ((C3471g) ((List) interfaceC1809a119.getValue()).get(i16)).f11255a;
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a119.getValue());
                    arrayListM8409R1.remove(i16);
                    interfaceC1809a119.setValue(arrayListM8409R1);
                    List list3 = (List) interfaceC1809a120.getValue();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj12 : list3) {
                        if (!AbstractC1416l.m3825a(((C3472h) obj12).f11266c, str11)) {
                            arrayList6.add(obj12);
                        }
                    }
                    interfaceC1809a120.setValue(arrayList6);
                    sharedPreferences3.edit().putString("group_rename_templates", AbstractC5700d.m10295v((List) interfaceC1809a119.getValue())).putString("group_rename_template_bindings", AbstractC5700d.m10293t((List) interfaceC1809a120.getValue())).apply();
                }
                interfaceC1809a121.setValue(C4935h4.f17525d);
                break;
            case 17:
                Context context8 = (Context) this.f1429i;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f1430j;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f1432l;
                List list4 = AbstractC4955ho.f17708w;
                AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
                int size2 = list4.size();
                AbstractC2133a abstractC2133a2 = AbstractC2136d.f7122g;
                interfaceC1809a122.setValue((String) list4.get(abstractC2133a2.m5360g(size2)));
                List list5 = AbstractC4955ho.f17709x;
                interfaceC1809a123.setValue((String) list5.get(abstractC2133a2.m5360g(list5.size())));
                List list6 = AbstractC4955ho.f17710y;
                interfaceC1809a124.setValue((String) list6.get(abstractC2133a2.m5360g(list6.size())));
                List list7 = AbstractC4955ho.f17711z;
                interfaceC1809a125.setValue((String) list7.get(abstractC2133a2.m5360g(list7.size())));
                Toast.makeText(context8, "已随机填充本群卡片", 0).show();
                break;
            case 18:
                String str12 = (String) this.f1429i;
                String str13 = (String) this.f1430j;
                Context context9 = (Context) this.f1431k;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f1432l;
                interfaceC1809a126.setValue(str12);
                interfaceC1809a127.setValue(str13);
                Toast.makeText(context9, "已恢复为全局文本", 0).show();
                break;
            case 19:
                C5725r c5725r2 = (C5725r) this.f1429i;
                Context context10 = (Context) this.f1430j;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f1432l;
                String strM9674u = AbstractC4955ho.m9674u(interfaceC1809a128, "新配置");
                c5725r2.m10394n((String) interfaceC1809a129.getValue(), AbstractC4166m.m8398G1((List) interfaceC1809a128.getValue(), new C5728u(strM9674u, HttpUrl.FRAGMENT_ENCODE_SET, "https://api.siliconflow.cn/v1", "/chat/completions", "deepseek-ai/DeepSeek-V3", HttpUrl.FRAGMENT_ENCODE_SET, 10)));
                interfaceC1809a128.setValue(c5725r2.m10396p());
                interfaceC1809a130.setValue(strM9674u);
                Toast.makeText(context10, "已新增 ".concat(strM9674u), 0).show();
                break;
            case 20:
                Context context11 = (Context) this.f1429i;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1430j;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f1432l;
                if (AbstractC3149m.m6721t0(AbstractC3149m.m6703R0((String) interfaceC1809a131.getValue()).toString()) || AbstractC3149m.m6721t0(AbstractC3149m.m6703R0((String) interfaceC1809a132.getValue()).toString())) {
                    Toast.makeText(context11, "请先登录并选择智能体", 0).show();
                } else {
                    interfaceC1809a133.setValue(new C5732y("查询中", "正在查询小智控制台...", false));
                    AbstractC3603v.m7563q(interfaceC3599t, null, new C0368m(interfaceC1809a131, interfaceC1809a132, interfaceC1809a133, null, 18), 3);
                }
                return C3967n.f12976a;
            case 21:
                C4806d6 c4806d6 = (C4806d6) this.f1429i;
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f1430j;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f1431k;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f1428h;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f1432l;
                int size3 = ((List) interfaceC1809a134.getValue()).size();
                int i17 = c4806d6.f16510a;
                if (i17 >= 0 && i17 < size3) {
                    String str14 = ((C0040h) ((List) interfaceC1809a134.getValue()).get(i17)).f131a;
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a134.getValue());
                    arrayListM8409R12.remove(i17);
                    List<C0033a> list8 = (List) interfaceC1809a135.getValue();
                    ArrayList arrayList7 = new ArrayList(AbstractC4167n.m8429e1(list8));
                    for (C0033a c0033a : list8) {
                        arrayList7.add(C0033a.m290a(c0033a, null, null, null, false, null, AbstractC4156d0.m8351S(c0033a.f109g, str14), false, false, null, null, 1983));
                    }
                    interfaceC1809a134.setValue(arrayListM8409R12);
                    interfaceC1809a135.setValue(arrayList7);
                    sharedPreferences4.edit().putString("message_block_templates", C0014a.m177g(arrayListM8409R12)).putString("message_block_bindings", C0014a.m175e(arrayList7)).apply();
                }
                interfaceC1809a136.setValue(null);
                break;
            case 22:
                Context context12 = (Context) this.f1429i;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f1430j;
                C5739f c5739f = (C5739f) this.f1431k;
                C5738e c5738e = (C5738e) this.f1428h;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f1432l;
                List list9 = (List) interfaceC1809a137.getValue();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj13 : list9) {
                    if (!AbstractC1416l.m3825a(((C5739f) obj13).f23384a, c5739f.f23384a)) {
                        arrayList8.add(obj13);
                    }
                }
                AbstractC4955ho.m9368K1(c5738e, interfaceC1809a137, arrayList8);
                Toast.makeText(context12, "关键词已删除", 0).show();
                interfaceC1809a138.setValue(C5197p4.f19926a);
                break;
            case 23:
                return m1511e();
            case 24:
                return m1512f();
            case 25:
                return m1513g();
            case 26:
                return m1514h();
            default:
                C1425u c1425u3 = (C1425u) this.f1432l;
                FrameLayout frameLayout4 = (FrameLayout) this.f1430j;
                C0416a1 c0416a14 = (C0416a1) this.f1429i;
                ViewGroup viewGroup5 = (ViewGroup) this.f1431k;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f1428h;
                try {
                    obj4 = c1425u3.f4738g;
                } catch (Throwable unused5) {
                }
                if (obj4 == null) {
                    AbstractC1416l.m3831g("compose");
                    throw null;
                }
                ((C5868c1) obj4).m10555f();
                try {
                    ViewParent parent2 = frameLayout4.getParent();
                    ViewGroup viewGroup6 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(frameLayout4);
                    }
                    break;
                } catch (Throwable unused6) {
                }
                try {
                    AbstractC5700d.m10289p(frameLayout4);
                    break;
                } catch (Throwable unused7) {
                }
                try {
                    AbstractC5700d.m10289p(viewGroup5);
                    break;
                } catch (Throwable unused8) {
                }
                try {
                    C0114s c0114s4 = c0416a14.f1194h;
                    EnumC0107l enumC0107l7 = c0114s4.f300c;
                    EnumC0107l enumC0107l8 = EnumC0107l.f289g;
                    if (enumC0107l7 != enumC0107l8) {
                        c0114s4.m554c("setCurrentState");
                        c0114s4.m556e(enumC0107l8);
                    }
                    c0416a14.f1197k.m7634a();
                    c0416a14.f1196j.m545a();
                    break;
                } catch (Throwable unused9) {
                }
                try {
                    interfaceC1220a4.invoke();
                    break;
                } catch (Throwable unused10) {
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0482r0(int i9, Activity activity, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1427g = i9;
        this.f1429i = obj;
        this.f1428h = activity;
        this.f1430j = obj2;
        this.f1431k = obj3;
        this.f1432l = obj4;
    }

    public /* synthetic */ C0482r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f1427g = i9;
        this.f1429i = obj;
        this.f1430j = obj2;
        this.f1431k = obj3;
        this.f1428h = obj4;
        this.f1432l = obj5;
    }
}
