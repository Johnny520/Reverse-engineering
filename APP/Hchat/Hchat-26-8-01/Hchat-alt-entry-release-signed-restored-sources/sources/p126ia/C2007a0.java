package p126ia;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p010aa.C0035c;
import p011ab.C0042b;
import p015b0.RunnableC0133c;
import p020b5.C0184c;
import p024b9.RunnableC0217c;
import p036c9.C0482r0;
import p036c9.ThreadFactoryC0478q;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p218og.AbstractC3156t;
import p230p8.C3351d0;
import p230p8.C3353e0;
import p230p8.C3354f;
import p230p8.C3360l;
import p242q8.C3460o;
import p258r8.C3742g;
import p276sf.C3962i;
import p276sf.C3963j;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: ia.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2007a0 {

    /* JADX INFO: renamed from: a */
    public final C3742g f6758a;

    /* JADX INFO: renamed from: b */
    public final C0184c f6759b;

    /* JADX INFO: renamed from: c */
    public final C2014h f6760c;

    /* JADX INFO: renamed from: d */
    public final C0042b f6761d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f6762e;

    /* JADX INFO: renamed from: f */
    public final Set f6763f;

    /* JADX INFO: renamed from: g */
    public final Set f6764g;

    /* JADX INFO: renamed from: h */
    public final Handler f6765h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f6766i;

    /* JADX INFO: renamed from: j */
    public final ThreadLocal f6767j;

    /* JADX INFO: renamed from: k */
    public final Object f6768k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f6769l;

    /* JADX INFO: renamed from: m */
    public final C3962i f6770m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f6771n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f6772o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2007a0(C3742g c3742g, C0184c c0184c, C2014h c2014h, C0042b c0042b) {
        c3742g.getClass();
        this.f6758a = c3742g;
        this.f6759b = c0184c;
        this.f6760c = c2014h;
        this.f6761d = c0042b;
        this.f6762e = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_fake_interaction_config");
        this.f6763f = AbstractC2091b.m5168o();
        this.f6764g = AbstractC2091b.m5168o();
        this.f6765h = new Handler(Looper.getMainLooper());
        this.f6766i = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(16));
        this.f6767j = new ThreadLocal();
        this.f6768k = new Object();
        this.f6769l = new AtomicBoolean(false);
        this.f6770m = new C3962i(new C2030x(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static byte[] m4942b(Object obj) {
        Object field = KavaReflector.readField(obj, "field_attrBuf");
        byte[] bArr = field instanceof byte[] ? (byte[]) field : null;
        if (bArr != null) {
            return bArr;
        }
        Object field2 = KavaReflector.readField(obj, "attrBuf");
        if (field2 instanceof byte[]) {
            return (byte[]) field2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Activity m4943c() {
        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
        Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
        if (activityM7263a == null) {
            activityM7263a = null;
        }
        if (activityM7263a != null) {
            if (!(activityM7263a.isFinishing() || activityM7263a.isDestroyed())) {
                return activityM7263a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C2009c m4944g(C2009c c2009c) {
        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(c2009c.f6778a, c2009c.f6780c);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8397F1) {
            if (hashSet.add(((C2010d) obj).f6782a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListM8397F12 = AbstractC4166m.m8397F1(c2009c.f6779b, c2009c.f6781d);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListM8397F12) {
            C2008b c2008b = (C2008b) obj2;
            if (hashSet2.add(new C3963j(c2008b.f6773a, c2008b.f6774b, c2008b.f6776d))) {
                arrayList2.add(obj2);
            }
        }
        return new C2009c(12, arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C2009c m4945j(C2009c c2009c, C2009c c2009c2) {
        C2009c c2009cM4944g = m4944g(c2009c);
        C2009c c2009cM4944g2 = m4944g(c2009c2);
        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(c2009cM4944g.f6778a, c2009cM4944g2.f6778a);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8397F1) {
            if (hashSet.add(((C2010d) obj).f6782a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListM8397F12 = AbstractC4166m.m8397F1(c2009cM4944g.f6779b, c2009cM4944g2.f6779b);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListM8397F12) {
            C2008b c2008b = (C2008b) obj2;
            if (hashSet2.add(new C3963j(c2008b.f6773a, c2008b.f6774b, c2008b.f6776d))) {
                arrayList2.add(obj2);
            }
        }
        return new C2009c(12, arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m4946q(Object obj) {
        long jLongValue;
        Object field = KavaReflector.readField(obj, "field_snsId");
        if (field == null && (field = KavaReflector.readField(obj, "snsId")) == null) {
            return null;
        }
        if (field instanceof Number) {
            jLongValue = ((Number) field).longValue();
        } else {
            Long lM6743g0 = AbstractC3156t.m6743g0(field.toString());
            if (lM6743g0 == null) {
                return null;
            }
            jLongValue = lM6743g0.longValue();
        }
        if (jLongValue == 0) {
            return null;
        }
        return Long.toUnsignedString(jLongValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4947a(Activity activity, C3360l c3360l, C2009c c2009c) {
        activity.getClass();
        c3360l.getClass();
        String str = c3360l.f10844a;
        if (str != null) {
            m4959r(new C0482r0(2, activity, this, c3360l, str, c2009c));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C2009c m4948d(C2009c c2009c) {
        boolean zM4950f = m4950f();
        List list = C4173t.f13710g;
        List list2 = zM4950f ? c2009c.f6778a : list;
        if (m4949e()) {
            list = c2009c.f6779b;
        }
        return new C2009c(12, list2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m4949e() {
        return this.f6771n && this.f6772o && this.f6762e.getBoolean("fake_comment_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m4950f() {
        return this.f6771n && this.f6762e.getBoolean("fake_like_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: h */
    public final boolean m4951h(String str, Object obj, C2009c c2009c, C2009c c2009c2, boolean z9, boolean z10) {
        boolean zBooleanValue;
        byte[] bArrM4942b = m4942b(obj);
        boolean z11 = false;
        if (bArrM4942b != null) {
            C2006a c2006aM4970d = this.f6760c.m4970d(bArrM4942b, c2009c, c2009c2, z9, z10);
            if (!c2006aM4970d.f6757b) {
                return true;
            }
            byte[] bArr = c2006aM4970d.f6756a;
            Method methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(obj.getClass(), "setAttrBuf", bArr);
            if (methodFindCompatibleMethod != null ? KavaReflector.invokeSuccessfully(methodFindCompatibleMethod, obj, bArr) : false) {
                C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
                if (c3351d0SnsApi != null) {
                    C0035c c0035c = new C0035c(c3351d0SnsApi, 25, obj);
                    C3353e0 c3353e0 = (C3353e0) c3351d0SnsApi.f10790j.getValue();
                    if (c3353e0 != null) {
                        ThreadLocal threadLocal = c3353e0.f10803g;
                        Boolean bool = (Boolean) threadLocal.get();
                        threadLocal.set(Boolean.TRUE);
                        try {
                            Object objInvoke = c0035c.invoke();
                            if (bool == null) {
                                threadLocal.remove();
                            } else {
                                threadLocal.set(bool);
                            }
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        } catch (Throwable th2) {
                            if (bool == null) {
                                threadLocal.remove();
                                throw th2;
                            }
                            threadLocal.set(bool);
                            throw th2;
                        }
                    } else {
                        zBooleanValue = ((Boolean) c0035c.invoke()).booleanValue();
                    }
                    if (zBooleanValue) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    this.f6761d.invoke("写入朋友圈伪互动原生缓存失败: snsId=" + str, null);
                }
            }
        }
        return z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4952i(Object obj) {
        String strM4946q;
        boolean zContainsKey;
        byte[] bArrM4942b;
        C0184c c0184c = this.f6759b;
        if (AbstractC1416l.m3825a(this.f6767j.get(), Boolean.TRUE) || obj == null || !obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo") || (strM4946q = m4946q(obj)) == null) {
            return;
        }
        synchronized (c0184c) {
            zContainsKey = c0184c.m792J().containsKey(strM4946q);
        }
        if (zContainsKey && (bArrM4942b = m4942b(obj)) != null) {
            C2009c c2009cM815l = c0184c.m815l(strM4946q);
            C2006a c2006aM4970d = this.f6760c.m4970d(bArrM4942b, m4948d(c2009cM815l), m4944g(c2009cM815l), m4950f(), m4949e());
            if (c2006aM4970d.f6757b) {
                byte[] bArr = c2006aM4970d.f6756a;
                Method methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(obj.getClass(), "setAttrBuf", bArr);
                if (methodFindCompatibleMethod != null) {
                    KavaReflector.invokeSuccessfully(methodFindCompatibleMethod, obj, bArr);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4953k(View view) {
        if (!m4954l(view) && (view instanceof AbsListView)) {
            ((AbsListView) view).invalidateViews();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m4953k(childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m4954l(View view) {
        Class cls = (Class) this.f6770m.getValue();
        if (cls == null || !cls.isInstance(view)) {
            return false;
        }
        KavaReflector.invokeMethod(KavaReflector.invokeMethod(view, "getAdapter", new Object[0]), "notifyDataSetChanged", new Object[0]);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C3354f m4955m(String str) {
        ThreadLocal threadLocal = this.f6767j;
        Boolean bool = (Boolean) threadLocal.get();
        threadLocal.set(Boolean.TRUE);
        try {
            C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
            C3354f c3354fM7073c = c3351d0SnsApi != null ? c3351d0SnsApi.m7073c(str) : new C3354f(null, false);
            if (bool == null) {
                threadLocal.remove();
                return c3354fM7073c;
            }
            threadLocal.set(bool);
            return c3354fM7073c;
        } catch (Throwable th2) {
            if (bool == null) {
                threadLocal.remove();
            } else {
                threadLocal.set(bool);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4956n(Activity activity, View view) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC0217c(activity, this, view, decorView, 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m4957o(boolean z9, boolean z10, InterfaceC1231l interfaceC1231l) {
        AtomicBoolean atomicBoolean = this.f6769l;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return false;
        }
        if (m4959r(new C2031y(this, z9, z10, interfaceC1231l))) {
            return true;
        }
        atomicBoolean.set(false);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public final boolean m4958p(boolean z9, boolean z10) throws Throwable {
        Object obj;
        boolean zM4951h;
        Object obj2;
        C2009c c2009c;
        boolean z11;
        C2009c c2009c2;
        Object obj3;
        boolean z12;
        boolean z13 = true;
        for (String str : this.f6759b.m809d()) {
            C2009c c2009cM815l = this.f6759b.m815l(str);
            C2009c c2009cM4948d = m4948d(c2009cM815l);
            Object obj4 = this.f6768k;
            synchronized (obj4) {
                try {
                    C3354f c3354fM4955m = m4955m(str);
                    if (c3354fM4955m.f10805a) {
                        Object obj5 = c3354fM4955m.f10806b;
                        if (obj5 != null) {
                            C2009c c2009cM4962b = C2009c.m4962b(c2009cM4948d, z9 ? C4173t.f13710g : c2009cM4948d.f6778a, z10 ? C4173t.f13710g : c2009cM4948d.f6779b, null, null, 12);
                            C2009c c2009cM4944g = m4944g(c2009cM815l);
                            if (z9 || !m4950f()) {
                                obj2 = obj4;
                                c2009c = c2009cM4962b;
                                z11 = false;
                            } else {
                                obj2 = obj4;
                                c2009c = c2009cM4962b;
                                z11 = true;
                            }
                            try {
                                if (!z10) {
                                    try {
                                        if (m4949e()) {
                                            c2009c2 = c2009cM4944g;
                                            obj3 = obj5;
                                            obj = obj2;
                                            z12 = true;
                                        }
                                        zM4951h = m4951h(str, obj3, c2009c, c2009c2, z11, z12);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj2;
                                        throw th;
                                    }
                                }
                                zM4951h = m4951h(str, obj3, c2009c, c2009c2, z11, z12);
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                            c2009c2 = c2009cM4944g;
                            obj3 = obj5;
                            obj = obj2;
                            z12 = false;
                        } else {
                            obj = obj4;
                            zM4951h = true;
                        }
                    } else {
                        obj = obj4;
                        zM4951h = false;
                    }
                    if (!zM4951h) {
                        z13 = false;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj4;
                }
            }
        }
        if (z13) {
            C0184c c0184c = this.f6759b;
            synchronized (c0184c) {
                if (z9 || z10) {
                    if (z9 && z10) {
                        c0184c.m811g();
                    } else {
                        LinkedHashMap linkedHashMapM792J = c0184c.m792J();
                        Set setKeySet = linkedHashMapM792J.keySet();
                        setKeySet.getClass();
                        for (String str2 : AbstractC4166m.m8407P1(setKeySet)) {
                            C2009c c2009c3 = (C2009c) linkedHashMapM792J.get(str2);
                            if (c2009c3 != null) {
                                C2009c c2009cM4961a = C2009c.m4961a(z9 ? C4173t.f13710g : c2009c3.f6778a, z10 ? C4173t.f13710g : c2009c3.f6779b, z9 ? C4173t.f13710g : c2009c3.f6780c, z10 ? C4173t.f13710g : c2009c3.f6781d);
                                str2.getClass();
                                C0184c.m778I(linkedHashMapM792J, str2, c2009cM4961a);
                            }
                        }
                        c0184c.m796N(linkedHashMapM792J);
                    }
                }
            }
            SharedPreferences.Editor editorEdit = this.f6762e.edit();
            if (z9) {
                editorEdit.remove("pending_restore_likes_v1");
            }
            if (z10) {
                editorEdit.remove("pending_restore_comments_v1");
            }
            if (z9 && z10) {
                editorEdit.remove("pending_restore_all_v1");
            }
            editorEdit.commit();
            Activity activityM4943c = m4943c();
            if (activityM4943c != null) {
                m4956n(activityM4943c, null);
                return z13;
            }
        }
        return z13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m4959r(InterfaceC1220a interfaceC1220a) {
        try {
            this.f6766i.execute(new RunnableC0133c(interfaceC1220a, 1));
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }
}
