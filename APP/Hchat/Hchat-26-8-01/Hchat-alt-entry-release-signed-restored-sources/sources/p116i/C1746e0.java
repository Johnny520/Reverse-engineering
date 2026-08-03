package p116i;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import ma.C2821a;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p020b5.C0184c;
import p024b9.C0215a;
import p024b9.C0219e;
import p036c9.C0425c2;
import p037cb.C0545f;
import p057e1.C0808c;
import p057e1.C0810e;
import p062e8.C0828b;
import p064ea.C0851c;
import p077f8.AbstractC1089i;
import p078f9.C1093d;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p086fh.C1253k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p109hb.C1671c;
import p115hh.C1730o;
import p115hh.C1731p;
import p117i0.C1833g1;
import p117i0.C1845j1;
import p119i2.C1954y;
import p126ia.C2026t;
import p129ig.AbstractC2043a;
import p136j8.C2090a;
import p137j9.C2115a;
import p138ja.C2116a;
import p139jb.C2117a;
import p139jb.C2120d;
import p139jb.C2121e;
import p144k.AbstractC2191m1;
import p144k.C2227y1;
import p144k.InterfaceC2188l1;
import p168l9.C2535a;
import p168l9.C2536b;
import p168l9.C2538d;
import p183m8.C2813a;
import p184m9.C2816a;
import p184m9.C2820e;
import p210o8.C3087k;
import p213ob.C3113f;
import p213ob.C3120m;
import p213ob.C3121n;
import p231pb.C3378a;
import p244qb.C3480a;
import p244qb.C3489j;
import p244qb.C3490k;
import p249qg.InterfaceC3599t;
import p254r3.C3656c;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.C3745a;
import p259r9.C3752d0;
import p261rb.C3786b;
import p261rb.C3787c;
import p261rb.C3795k;
import p265s.C3863w;
import p265s.C3869z;
import p268s2.C3922b;
import p269s3.C3927e;
import p275s9.C3946b;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p290u.C4227d;
import p294u3.C4248a;
import p294u3.InterfaceC4250c;
import p299u9.C4284c;
import p299u9.C4289h;
import p339x1.AbstractC5618k;
import qa.C3478f;
import sh.C4005e2;
import sh.C4059w1;
import sh.C4060x;
import tf.AbstractC4166m;
import tf.AbstractC4171r;
import tf.C4173t;
import tf.C4174u;
import th.C4217i;

/* JADX INFO: renamed from: i.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1746e0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5838g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5839h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1746e0(Object obj, int i9) {
        this.f5838g = i9;
        this.f5839h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m4384e() {
        boolean z9;
        C3478f c3478f = (C3478f) ((C0215a) this.f5839h).f524f;
        boolean z10 = false;
        if (c3478f != null) {
            synchronized (c3478f) {
                try {
                    if (!c3478f.f11288h) {
                        c3478f.m7287o();
                    }
                    if (!c3478f.f11289i) {
                        c3478f.m7288p();
                    }
                    if (!c3478f.f11290j) {
                        c3478f.m7286n();
                    }
                    if (!c3478f.f11291k) {
                        c3478f.m7285m();
                    }
                    if (c3478f.f11288h || c3478f.f11289i || c3478f.f11290j) {
                        z9 = true;
                    } else if (!c3478f.f11291k) {
                        z9 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z9) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final Object m4385f() {
        Object c3959f;
        boolean zBooleanValue;
        Method methodM7969f;
        C3787c c3787c = ((C3786b) this.f5839h).f12409e;
        boolean z9 = false;
        if (c3787c != null) {
            synchronized (c3787c) {
                if (c3787c.f12417h) {
                    zBooleanValue = true;
                } else {
                    try {
                        Constructor constructorM7971h = c3787c.m7971h();
                        if (constructorM7971h == null || (methodM7969f = c3787c.m7969f(constructorM7971h)) == null) {
                            zBooleanValue = false;
                        } else {
                            c3787c.m7970g();
                            C2813a c2813aNetwork = WeChatApis.network();
                            if (c2813aNetwork != null) {
                                c2813aNetwork.m6205a(c3787c.f12410a.f12147e);
                            }
                            C3744i.f12154b.m7763b(methodM7969f, new C0219e(c3787c, 25));
                            c3787c.f12414e = constructorM7971h;
                            c3787c.f12417h = true;
                            C3795k c3795k = c3787c.f12411b;
                            synchronized (c3795k.f12444d) {
                                c3795k.f12452l = true;
                                if (!c3795k.f12453m && c3795k.f12447g.isEmpty() && c3795k.f12448h.isEmpty()) {
                                    c3795k.f12454n = "等待检测";
                                }
                            }
                            c3959f = Boolean.TRUE;
                        }
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        c3787c.f12412c.invoke("僵尸粉检测 Hook 安装失败", thM8182b);
                        c3959f = Boolean.FALSE;
                    }
                    zBooleanValue = ((Boolean) c3959f).booleanValue();
                }
            }
            if (zBooleanValue) {
                z9 = true;
            }
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Object m4386g() {
        Object c3959f;
        boolean zBooleanValue;
        C3946b c3946b = (C3946b) ((C0215a) this.f5839h).f524f;
        boolean z9 = false;
        if (c3946b != null) {
            synchronized (c3946b) {
                if (c3946b.f12944g) {
                    zBooleanValue = true;
                } else {
                    Method methodM8170c = c3946b.m8170c();
                    if (methodM8170c != null) {
                        try {
                            C3744i.f12154b.m7763b(methodM8170c, new C0219e(c3946b, 26));
                            c3946b.f12944g = true;
                            c3959f = Boolean.TRUE;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:HideChatAvatar] 安装聊天头像绑定 Hook 失败: " + thM8182b.getMessage(), thM8182b);
                            c3959f = Boolean.FALSE;
                        }
                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                    } else {
                        AbstractC1184v0.m3203m("[Hchat:HideChatAvatar] 定位聊天头像绑定方法失败");
                        zBooleanValue = false;
                    }
                }
            }
            if (zBooleanValue) {
                z9 = true;
            }
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final Object m4387h() {
        C4005e2 c4005e2;
        C4060x c4060x = ((C4059w1) this.f5839h).f13435a;
        float fM4488g = (c4060x == null || (c4005e2 = c4060x.f13436a) == null) ? 0.0f : c4005e2.f13117c.m4488g();
        return Integer.valueOf(Float.isNaN(fM4488g) ? 0 : AbstractC2043a.m5018X(fM4488g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final Object m4388i() {
        boolean z9;
        C0184c c0184c = (C0184c) ((C0215a) this.f5839h).f524f;
        boolean z10 = false;
        if (c0184c != null) {
            synchronized (c0184c) {
                try {
                    int i9 = 0;
                    for (Method method : AbstractC1089i.m2775k0((C3742g) c0184c.f469a, new C1954y(23))) {
                        if (((Set) c0184c.f471c).contains(method) || (((Set) c0184c.f471c).add(method) && c0184c.m827x(method))) {
                            i9++;
                        }
                    }
                    if (i9 == 0) {
                        AbstractC1184v0.m3203m("[Hchat:HideChatMenu] 定位或安装聊天长按菜单 Hook 失败");
                    }
                    z9 = i9 > 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z9) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    private final Object m4389j() {
        ((C4227d) this.f5839h).f13900U.invoke(Boolean.valueOf(!r0.f13899T));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    private final Object m4390k() {
        InterfaceC4250c interfaceC4250c = (InterfaceC4250c) this.f5839h;
        interfaceC4250c.mo550f().m552a(new C4248a(interfaceC4250c));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:556:0x025a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:568:0x00d3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:590:0x0325 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:630:0x0218 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x00ee */
    /* JADX DEBUG: Type inference failed for r11v20. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v24, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36, types: [int] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r7v36, types: [e8.b] */
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
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z9;
        Object c3959f;
        Object obj;
        boolean zBooleanValue;
        Object c3959f2;
        boolean zBooleanValue2;
        Object c3959f3;
        Method methodM5958f;
        boolean zBooleanValue3;
        Object c3959f4;
        Object obj2;
        boolean z10;
        int i9;
        int i10;
        boolean z11;
        boolean z12;
        ?? r12;
        ?? r32;
        boolean z13;
        ?? c3959f5;
        Object c3959f6;
        Object next;
        boolean z14;
        Object next2;
        int length;
        ?? r122;
        ?? M7826I;
        Object c3959f7;
        ?? r42;
        boolean z15;
        switch (this.f5838g) {
            case 0:
                return Float.valueOf(AbstractC1742d.m4378n(((InterfaceC3599t) this.f5839h).mo4457n()));
            case 1:
                C0851c c0851c = (C0851c) ((C0215a) this.f5839h).f524f;
                if (c0851c != null) {
                    z9 = c0851c.m2156a(true);
                }
                return Boolean.valueOf(z9);
            case 2:
                C0851c c0851c2 = ((C2115a) this.f5839h).f7068e;
                boolean z16 = false;
                if (c0851c2 != null) {
                    synchronized (c0851c2) {
                        if (c0851c2.f2604c) {
                            zBooleanValue = true;
                        } else {
                            try {
                                Method methodM2160g = c0851c2.m2160g();
                                if (methodM2160g != null) {
                                    C3744i.f12154b.m7763b(methodM2160g, new C0219e(c0851c2, 13));
                                    c0851c2.f2604c = true;
                                    c3959f = Boolean.TRUE;
                                } else {
                                    zBooleanValue = false;
                                }
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            Throwable thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                                ((C2026t) c0851c2.f2605d).invoke("伪造语音时长录音长度Hook失败", thM8182b);
                                obj = Boolean.FALSE;
                            }
                            zBooleanValue = ((Boolean) obj).booleanValue();
                        }
                        break;
                    }
                    if (zBooleanValue) {
                        z16 = true;
                    }
                }
                return Boolean.valueOf(z16);
            case 3:
                C1671c c1671c = ((C2116a) this.f5839h).f7069e;
                boolean z17 = false;
                if (c1671c != null) {
                    C3742g c3742g = (C3742g) c1671c.f5520g;
                    C2026t c2026t = (C2026t) c1671c.f5521h;
                    Method methodM396F = AbstractC0063p.m396F(c3742g, c2026t);
                    Method methodM395E = AbstractC0063p.m395E(c3742g, c2026t);
                    Method methodM397G = methodM395E != null ? AbstractC0063p.m397G(c3742g, methodM395E, c2026t) : null;
                    boolean z18 = (methodM396F == null || methodM397G == null || !c1671c.m4280p(methodM396F, new C0219e(c1671c, 14))) ? false : true;
                    boolean z19 = (methodM395E == null || methodM397G == null || !c1671c.m4280p(methodM395E, new C0425c2(c1671c, 6, methodM397G))) ? false : true;
                    if (!z18) {
                        c2026t.invoke("多选撤回菜单创建Hook未安装", null);
                    }
                    if (!z19) {
                        c2026t.invoke("多选撤回菜单点击Hook未安装", null);
                    }
                    if (z18 && z19) {
                        z17 = true;
                    }
                }
                return Boolean.valueOf(z17);
            case 4:
                C2121e c2121e = ((C2117a) this.f5839h).f7070e;
                boolean z20 = false;
                if (c2121e != null) {
                    C3742g c3742g2 = c2121e.f7078a;
                    Set set = c2121e.f7081d;
                    C2026t c2026t2 = c2121e.f7079b;
                    Context context = c3742g2.f12143a;
                    ClassLoader classLoader = c3742g2.f12145c;
                    classLoader.getClass();
                    String str = C3087k.m6557a(context, classLoader).f8202h;
                    SharedPreferences sharedPreferences = c2121e.f7080c;
                    List listM2090f = C0828b.m2090f(sharedPreferences, str, c3742g2.f12145c, "finder_menu_create");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listM2090f) {
                        if (C2121e.m5333g((Method) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    List listM8407P1 = arrayList;
                    if (zIsEmpty) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        List listM5337c = c2121e.m5337c("pos is error ");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : listM5337c) {
                            if (C2121e.m5333g((Method) obj4)) {
                                arrayList2.add(obj4);
                            }
                        }
                        AbstractC4171r.m8432h1(linkedHashSet, arrayList2);
                        List listM5337c2 = c2121e.m5337c("feed", "menu", "sheet", "holder", "KEY_FINDER_SELF_FLAG");
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : listM5337c2) {
                            if (C2121e.m5333g((Method) obj5)) {
                                arrayList3.add(obj5);
                            }
                        }
                        AbstractC4171r.m8432h1(linkedHashSet, arrayList3);
                        List listM5337c3 = c2121e.m5337c("getCreateSecondMoreMenuListener: username=");
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : listM5337c3) {
                            if (C2121e.m5333g((Method) obj6)) {
                                arrayList4.add(obj6);
                            }
                        }
                        AbstractC4171r.m8432h1(linkedHashSet, arrayList4);
                        c2121e.m5338j(str, "finder_menu_create", AbstractC4166m.m8407P1(linkedHashSet));
                        listM8407P1 = AbstractC4166m.m8407P1(linkedHashSet);
                    }
                    Iterator it = listM8407P1.iterator();
                    int i11 = 0;
                    while (true) {
                        boolean zBooleanValue4 = true;
                        if (it.hasNext()) {
                            Method method = (Method) it.next();
                            if (set.add(method)) {
                                try {
                                    C3744i.f12154b.m7763b(method, new C2120d(c2121e, 1));
                                    c3959f3 = Boolean.TRUE;
                                } catch (Throwable th3) {
                                    c3959f3 = new C3959f(th3);
                                }
                                Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                                Object obj7 = c3959f3;
                                if (thM8182b2 != null) {
                                    set.remove(method);
                                    c2026t2.invoke("视频号菜单创建Hook失败", thM8182b2);
                                    obj7 = Boolean.FALSE;
                                }
                                zBooleanValue4 = ((Boolean) obj7).booleanValue();
                            }
                            if (zBooleanValue4) {
                                i11++;
                            }
                        } else {
                            Context context2 = c3742g2.f12143a;
                            ClassLoader classLoader2 = c3742g2.f12145c;
                            classLoader2.getClass();
                            String str2 = C3087k.m6557a(context2, classLoader2).f8202h;
                            List listM2090f2 = C0828b.m2090f(sharedPreferences, str2, c3742g2.f12145c, "finder_menu_click");
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj8 : listM2090f2) {
                                if (C2121e.m5332f((Method) obj8)) {
                                    arrayList5.add(obj8);
                                }
                            }
                            boolean zIsEmpty2 = arrayList5.isEmpty();
                            List<Method> listM8407P12 = arrayList5;
                            if (zIsEmpty2) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                List listM5337c4 = c2121e.m5337c("[getMoreMenuItemSelectedListener] feed ");
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj9 : listM5337c4) {
                                    if (C2121e.m5332f((Method) obj9)) {
                                        arrayList6.add(obj9);
                                    }
                                }
                                AbstractC4171r.m8432h1(linkedHashSet2, arrayList6);
                                List listM5337c5 = c2121e.m5337c("getMoreMenuItemSelectedListener feed ");
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj10 : listM5337c5) {
                                    if (C2121e.m5332f((Method) obj10)) {
                                        arrayList7.add(obj10);
                                    }
                                }
                                AbstractC4171r.m8432h1(linkedHashSet2, arrayList7);
                                List listM5337c6 = c2121e.m5337c("button_speedplay", "ref_eid");
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj11 : listM5337c6) {
                                    if (C2121e.m5332f((Method) obj11)) {
                                        arrayList8.add(obj11);
                                    }
                                }
                                AbstractC4171r.m8432h1(linkedHashSet2, arrayList8);
                                c2121e.m5338j(str2, "finder_menu_click", AbstractC4166m.m8407P1(linkedHashSet2));
                                listM8407P12 = AbstractC4166m.m8407P1(linkedHashSet2);
                            }
                            int i12 = 0;
                            for (Method method2 : listM8407P12) {
                                if (set.add(method2)) {
                                    try {
                                        C3744i.f12154b.m7763b(method2, new C2120d(c2121e, 0));
                                        c3959f2 = Boolean.TRUE;
                                    } catch (Throwable th4) {
                                        c3959f2 = new C3959f(th4);
                                    }
                                    Throwable thM8182b3 = C3960g.m8182b(c3959f2);
                                    Object obj12 = c3959f2;
                                    if (thM8182b3 != null) {
                                        set.remove(method2);
                                        c2026t2.invoke("视频号菜单点击Hook失败", thM8182b3);
                                        obj12 = Boolean.FALSE;
                                    }
                                    zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                } else {
                                    zBooleanValue2 = true;
                                }
                                if (zBooleanValue2) {
                                    i12++;
                                }
                                break;
                            }
                            if (i11 <= 0 || i12 <= 0) {
                                c2026t2.invoke("视频号媒体下载Hook未安装", null);
                            }
                            if (i11 > 0 && i12 > 0) {
                                z20 = true;
                            }
                        }
                        break;
                    }
                }
                return Boolean.valueOf(z20);
            case 5:
                C2227y1 c2227y1 = (C2227y1) this.f5839h;
                InterfaceC2188l1 interfaceC2188l1 = (InterfaceC2188l1) AbstractC5618k.m10152h(c2227y1, AbstractC2191m1.f7270a);
                c2227y1.f7377F = interfaceC2188l1;
                c2227y1.f7378G = interfaceC2188l1 != null ? interfaceC2188l1.mo1629a() : null;
                return C3967n.f12976a;
            case 6:
                C2538d c2538d = ((C2535a) this.f5839h).f8203e;
                boolean z21 = false;
                if (c2538d != null) {
                    synchronized (c2538d) {
                        if (c2538d.f8214f || ((methodM5958f = c2538d.m5958f()) != null && c2538d.m5956b(methodM5958f))) {
                            C3087k c3087kVersion = WeChatApis.version();
                            long j3 = c3087kVersion != null ? c3087kVersion.m6563b().f8195a : 0L;
                            if ((j3 == 0 || j3 >= 2841) && !c2538d.f8215g) {
                                Method methodM5959g = c2538d.m5959g();
                                if (methodM5959g != null && c2538d.m5955a(methodM5959g, "新版转发联系人配置", new C2536b(c2538d, 1))) {
                                    c2538d.f8215g = true;
                                }
                            }
                            z21 = true;
                        }
                    }
                }
                return Boolean.valueOf(z21);
            case 7:
                C2820e c2820e = ((C2816a) this.f5839h).f9086e;
                boolean z22 = false;
                if (c2820e != null) {
                    synchronized (c2820e) {
                        if (c2820e.f9111g) {
                            zBooleanValue3 = true;
                        } else {
                            Method method3 = c2820e.f9105a.f12147e.emojiSendMethod;
                            if (method3 != null) {
                                Class<?>[] parameterTypes = method3.getParameterTypes();
                                if (AbstractC1416l.m3825a(method3.getReturnType(), Void.TYPE) && parameterTypes.length >= 4 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && parameterTypes[1].getName().equals("com.tencent.mm.storage.emotion.EmojiInfo")) {
                                    Class<?> cls = method3.getParameterTypes()[1];
                                    cls.getClass();
                                    LinkedHashMap linkedHashMapM6223d = c2820e.m6223d(cls);
                                    if (linkedHashMapM6223d != null) {
                                        c2820e.f9110f = linkedHashMapM6223d;
                                        try {
                                            C3744i.f12154b.m7763b(method3, new C0425c2(c2820e, 9, method3));
                                            c2820e.f9111g = true;
                                            c3959f4 = Boolean.TRUE;
                                        } catch (Throwable th5) {
                                            c3959f4 = new C3959f(th5);
                                        }
                                        Throwable thM8182b4 = C3960g.m8182b(c3959f4);
                                        if (thM8182b4 != null) {
                                            c2820e.f9110f = C4174u.f13711g;
                                            c2820e.f9106b.invoke("游戏表情发送 Hook 安装失败", thM8182b4);
                                            obj2 = Boolean.FALSE;
                                        }
                                        zBooleanValue3 = ((Boolean) obj2).booleanValue();
                                        break;
                                    }
                                }
                            }
                            zBooleanValue3 = false;
                        }
                    }
                    if (zBooleanValue3) {
                        z22 = true;
                    }
                }
                return Boolean.valueOf(z22);
            case 8:
                ((C2820e) this.f5839h).f9109e.set(false);
                return C3967n.f12976a;
            case 9:
                C0545f c0545f = ((C2821a) this.f5839h).f9112e;
                if (c0545f != null) {
                    z10 = c0545f.m1549g(true);
                }
                return Boolean.valueOf(z10);
            case 10:
                C3121n c3121n = ((C3113f) this.f5839h).f10092e;
                boolean z23 = false;
                if (c3121n != null) {
                    synchronized (c3121n) {
                        try {
                            List listM2775k0 = AbstractC1089i.m2775k0(c3121n.f10110a, c3121n.f10111b);
                            if (listM2775k0.isEmpty()) {
                                i9 = 0;
                            } else {
                                Iterator it2 = listM2775k0.iterator();
                                i9 = 0;
                                while (it2.hasNext()) {
                                    if (c3121n.m6623a((Method) it2.next(), new C3120m(c3121n, 1)) && (i9 = i9 + 1) < 0) {
                                        AbstractC0000a.m30P0();
                                        throw null;
                                    }
                                }
                            }
                            List listM2773j0 = AbstractC1089i.m2773j0(c3121n.f10110a, c3121n.f10111b);
                            if (listM2773j0.isEmpty()) {
                                i10 = 0;
                            } else {
                                Iterator it3 = listM2773j0.iterator();
                                i10 = 0;
                                while (it3.hasNext()) {
                                    if (c3121n.m6623a((Method) it3.next(), new C3120m(c3121n, 0)) && (i10 = i10 + 1) < 0) {
                                        AbstractC0000a.m30P0();
                                        throw null;
                                    }
                                }
                            }
                            if (i9 <= 0) {
                                c3121n.f10111b.invoke("文本转语音菜单创建 Hook 未安装", null);
                            }
                            if (i10 <= 0) {
                                c3121n.f10111b.invoke("文本转语音菜单点击 Hook 未安装", null);
                            }
                            z11 = i9 > 0 && i10 > 0;
                        } finally {
                        }
                    }
                    if (z11) {
                        z23 = true;
                    }
                }
                return Boolean.valueOf(z23);
            case 11:
                C0545f c0545f2 = ((C3378a) this.f5839h).f10912e;
                if (c0545f2 != null) {
                    z12 = c0545f2.m1549g(true);
                }
                return Boolean.valueOf(z12);
            case 12:
                return m4384e();
            case 13:
                C3490k c3490k = ((C3480a) this.f5839h).f11293e;
                if (c3490k != null) {
                    ConcurrentHashMap concurrentHashMap = c3490k.f11336g;
                    C2026t c2026t3 = c3490k.f11331b;
                    ?? r72 = C0828b.f2478a;
                    SharedPreferences sharedPreferences2 = c3490k.f11334e;
                    String strM7334z = c3490k.m7334z();
                    C3742g c3742g3 = c3490k.f11330a;
                    ClassLoader classLoader3 = c3742g3.f12145c;
                    List listM2090f3 = C0828b.m2090f(sharedPreferences2, strM7334z, classLoader3, "voice_menu_click");
                    ?? arrayList9 = new ArrayList();
                    for (Object obj13 : listM2090f3) {
                        if (C3490k.m7306t((Method) obj13)) {
                            arrayList9.add(obj13);
                        }
                    }
                    if (arrayList9.isEmpty()) {
                        try {
                            DexKitBridge dexKitBridge = c3742g3.f12146d;
                            C0570e c0570e = new C0570e();
                            C1253k c1253k = new C1253k();
                            z13 = false;
                            z13 = false;
                            try {
                                C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("ChattingItemVoice", "Retr_Msg_content", "Retr_Msg_Type"));
                                c0570e.f1764h = c1253k;
                                C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                                ArrayList arrayList10 = new ArrayList();
                                for (C1730o c1730o : c1731pFindMethod) {
                                    try {
                                        c1730o.getClass();
                                        c3959f6 = c1730o.m4348p().m6023b(classLoader3);
                                    } catch (Throwable th6) {
                                        c3959f6 = new C3959f(th6);
                                    }
                                    if (c3959f6 instanceof C3959f) {
                                        c3959f6 = null;
                                    }
                                    Method method4 = (Method) c3959f6;
                                    if (method4 != null) {
                                        arrayList10.add(method4);
                                    }
                                    break;
                                }
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj14 : arrayList10) {
                                    if (C3490k.m7306t((Method) obj14)) {
                                        arrayList11.add(obj14);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                c3959f5 = new ArrayList();
                                for (Object obj15 : arrayList11) {
                                    if (hashSet.add(((Method) obj15).toGenericString())) {
                                        c3959f5.add(obj15);
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                c3959f5 = new C3959f(th);
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            z13 = false;
                        }
                        Throwable thM8182b5 = C3960g.m8182b(c3959f5);
                        ?? r123 = c3959f5;
                        if (thM8182b5 != null) {
                            c2026t3.invoke("转发语音DexKit定位失败", thM8182b5);
                            r123 = C4173t.f13710g;
                        }
                        arrayList9 = (List) r123;
                        if (arrayList9.isEmpty()) {
                            String strM7334z2 = c3490k.m7334z();
                            try {
                                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                                if (!AbstractC1416l.m3825a(sharedPreferences2.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7334z2)) {
                                    editorEdit.clear().putString("cache.key", strM7334z2);
                                }
                                editorEdit.remove("voice_menu_click").apply();
                                break;
                            } catch (Throwable unused) {
                            }
                        } else {
                            r72.m2097j(sharedPreferences2, c3490k.m7334z(), "voice_menu_click", arrayList9);
                        }
                        break;
                    } else {
                        z13 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        c2026t3.invoke("转发语音定位菜单点击方法失败", null);
                    }
                    int i13 = z13 ? 1 : 0;
                    ?? r16 = z13;
                    for (Method method5 : arrayList9) {
                        Class<?> declaringClass = method5.getDeclaringClass();
                        declaringClass.getClass();
                        Collection collectionValues = concurrentHashMap.values();
                        collectionValues.getClass();
                        Iterator it4 = collectionValues.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (AbstractC1416l.m3825a(((Method) next).getDeclaringClass(), declaringClass)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        Method method6 = (Method) next;
                        if (method6 != null) {
                            z14 = true;
                        } else {
                            Iterator it5 = KavaReflector.declaredMethods(declaringClass).iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    next2 = it5.next();
                                    Method method7 = (Method) next2;
                                    Class<?>[] parameterTypes2 = method7.getParameterTypes();
                                    z14 = true;
                                    if (!AbstractC1416l.m3825a(method7.getReturnType(), Boolean.TYPE) || Modifier.isStatic(method7.getModifiers()) || 3 > (length = parameterTypes2.length) || length >= 5 || MenuItem.class.isAssignableFrom(parameterTypes2[r16]) || !View.class.isAssignableFrom(parameterTypes2[1])) {
                                    }
                                } else {
                                    z14 = true;
                                    next2 = null;
                                }
                            }
                            method6 = (Method) next2;
                        }
                        if (method6 != null) {
                            if (c3490k.m7329o(method6, new C1093d(z14, c3490k, 2))) {
                                i13++;
                            }
                            r122 = r16;
                            if (c3490k.m7329o(method5, new C1093d(r122, c3490k, 2))) {
                                concurrentHashMap.put(method5, method6);
                                i13++;
                            }
                        } else {
                            r122 = r16;
                        }
                        r16 = r122;
                    }
                    ?? r124 = r16;
                    Iterator it6 = C2090a.m5152g(c3742g3, true, c2026t3).iterator();
                    while (it6.hasNext()) {
                        if (c3490k.m7329o((Method) it6.next(), new C3489j(c3490k, 1))) {
                            i13++;
                        }
                    }
                    Iterator it7 = C2090a.m5151f(c3742g3, true, c2026t3).iterator();
                    while (it7.hasNext()) {
                        if (c3490k.m7329o((Method) it7.next(), new C3489j(c3490k, 0))) {
                            i13++;
                        }
                    }
                    Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.fav.ui.FavSelectUI", classLoader3);
                    if (clsLoadClass != null) {
                        Class cls2 = Integer.TYPE;
                        cls2.getClass();
                        Class cls3 = Long.TYPE;
                        cls3.getClass();
                        Method methodFindMethod = KavaReflector.findMethod(clsLoadClass, "onItemClick", AdapterView.class, View.class, cls2, cls3);
                        boolean zM7329o = methodFindMethod != null ? c3490k.m7329o(methodFindMethod, new C3489j(c3490k, 2)) : r124 == true ? 1 : 0;
                        if (zM7329o) {
                            i13++;
                        }
                        Method methodM395E2 = AbstractC0063p.m395E(c3742g3, c2026t3);
                        Method methodM397G2 = methodM395E2 != null ? AbstractC0063p.m397G(c3742g3, methodM395E2, c2026t3) : null;
                        if (methodM395E2 != null && methodM397G2 != null) {
                            Method methodM396F2 = AbstractC0063p.m396F(c3742g3, c2026t3);
                            if (methodM396F2 != null && c3490k.m7329o(methodM396F2, new C3489j(c3490k, 3))) {
                                i13++;
                            }
                            if (c3490k.m7329o(methodM395E2, new C0425c2(c3490k, 14, methodM397G2))) {
                                i13++;
                            }
                        }
                        if (i13 <= 0) {
                            c2026t3.invoke("转发语音Hook未安装", null);
                        }
                        boolean z24 = i13 > 0 ? true : r124 == true ? 1 : 0;
                        r12 = r124;
                        if (z24) {
                            r32 = 1;
                        }
                    }
                    return Boolean.valueOf((boolean) r32);
                }
                r12 = 0;
                r32 = r12;
                return Boolean.valueOf((boolean) r32);
            case 14:
                return Boolean.valueOf(AbstractC1416l.m3825a(((Callable) this.f5839h).call(), Boolean.TRUE));
            case 15:
                C3752d0 c3752d0 = ((C3745a) this.f5839h).f12156e;
                boolean z25 = false;
                if (c3752d0 != null) {
                    try {
                        M7826I = c3752d0.m7826I();
                        try {
                            ?? r43 = M7826I;
                            if (c3752d0.m7825H()) {
                                r43 = M7826I + 1;
                            }
                            ?? r44 = r43;
                            if (c3752d0.m7823F()) {
                                r44 = r43 + 1;
                            }
                            M7826I = r44;
                            if (c3752d0.m7824G()) {
                                M7826I = r44 + 1;
                            }
                            c3959f7 = C3967n.f12976a;
                            r42 = M7826I;
                        } catch (Throwable th9) {
                            th = th9;
                            c3959f7 = new C3959f(th);
                            r42 = M7826I;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        M7826I = 0;
                    }
                    Throwable thM8182b6 = C3960g.m8182b(c3959f7);
                    if (thM8182b6 != null) {
                        c3752d0.f12191b.invoke("Hchat扩展功能安装异常", thM8182b6);
                    }
                    if (r42 > 0) {
                        z25 = true;
                    }
                    break;
                }
                return Boolean.valueOf(z25);
            case 16:
                return m4385f();
            case 17:
                C3863w c3863w = ((C3869z) this.f5839h).f12693j;
                if (c3863w != null) {
                    AbstractC5618k.m10156l(c3863w);
                }
                return C3967n.f12976a;
            case 18:
                C3922b c3922b = (C3922b) this.f5839h;
                C1845j1 c1845j1 = c3922b.f12876i;
                if (((C0810e) c1845j1.getValue()).f2428a == 9205357640488583168L || C0810e.m2056c(((C0810e) c1845j1.getValue()).f2428a)) {
                    return null;
                }
                return c3922b.f12874g.mo2592b(((C0810e) c1845j1.getValue()).f2428a);
            case 19:
                C3927e c3927e = (C3927e) this.f5839h;
                C3656c c3656c = C3656c.f11857a;
                C4173t c4173t = C4173t.f13710g;
                c3927e.f12903c.setValue(c3656c);
                c3927e.f12902b.setValue(c4173t);
                c3927e.f12904d.setValue(c4173t);
                return C3967n.f12976a;
            case 20:
                return m4386g();
            case 21:
                float fM4492g = ((C1833g1) this.f5839h).m4492g();
                if (fM4492g < 0.0f) {
                    fM4492g = 0.0f;
                }
                return Float.valueOf(fM4492g);
            case 22:
                return m4387h();
            case 23:
                return (C0808c) this.f5839h;
            case 24:
                return m4388i();
            case 25:
                return ((List) this.f5839h).iterator();
            case 26:
                ((C4217i) this.f5839h).m8489q1();
                return C3967n.f12976a;
            case 27:
                return m4389j();
            case 28:
                return m4390k();
            default:
                C4289h c4289h = ((C4284c) this.f5839h).f14206e;
                if (c4289h != null) {
                    z15 = c4289h.m8612f(true);
                }
                return Boolean.valueOf(z15);
        }
    }
}
