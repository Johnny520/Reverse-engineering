package p011ab;

import ac.AbstractC0063p;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import ba.C0233m;
import ba.C0238r;
import bb.C0243e;
import bb.C0245g;
import ca.C0510b;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p010aa.C0036d;
import p020b5.C0184c;
import p024b9.C0215a;
import p024b9.C0219e;
import p024b9.C0220f;
import p027c0.AbstractC0366k;
import p027c0.C0369n;
import p036c9.C0425c2;
import p036c9.C0429d2;
import p036c9.C0483r1;
import p037cb.C0542c;
import p037cb.C0545f;
import p040d0.InterfaceC0647d;
import p049d9.C0743d;
import p049d9.C0748i;
import p049d9.C0751l;
import p049d9.C0752m;
import p050da.C0762h;
import p062e8.C0828b;
import p064ea.C0849a;
import p064ea.C0850b;
import p064ea.C0851c;
import p070f0.C0982n;
import p070f0.C0989u;
import p077f8.AbstractC1089i;
import p078f9.C1090a;
import p078f9.C1094e;
import p079fa.C1098a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p086fh.C1253k;
import p088g0.C1266j;
import p088g0.C1270n;
import p097g9.C1372a;
import p097g9.C1374c;
import p097g9.C1375d;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.utils.KavaReflector;
import p107h9.C1626a;
import p107h9.C1627b;
import p107h9.C1629d;
import p108ha.C1639e0;
import p108ha.C1643g0;
import p108ha.C1652l;
import p108ha.C1653m;
import p108ha.C1666z;
import p109hb.C1679g;
import p109hb.C1682h0;
import p109hb.C1684i0;
import p109hb.C1687k;
import p109hb.C1698u;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.InterfaceC5196p3;
import p339x1.AbstractC5618k;
import p347xa.C5740a;
import p372z.C6055c;
import p372z.InterfaceC6059g;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;

/* JADX INFO: renamed from: ab.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0041a implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f142g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f143h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0041a(Object obj, int i9) {
        this.f142g = i9;
        this.f143h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m307e() {
        boolean z9;
        C0752m c0752m = ((C0743d) this.f143h).f2211e;
        boolean z10 = false;
        if (c0752m != null) {
            synchronized (c0752m) {
                try {
                    C0748i c0748iM1943h = c0752m.m1943h();
                    if (c0748iM1943h != null) {
                        boolean zM1942e = c0752m.m1942e(c0748iM1943h.f2227a, new C0751l(c0752m, 2));
                        boolean zM1942e2 = c0752m.m1942e(c0748iM1943h.f2228b, new C0751l(c0752m, 0));
                        Method method = c0748iM1943h.f2229c;
                        boolean zM1942e3 = method != null ? c0752m.m1942e(method, new C0751l(c0752m, 3)) : true;
                        boolean zM1942e4 = c0752m.m1942e(c0748iM1943h.f2230d, new C0751l(c0752m, 1));
                        if (zM1942e && zM1942e2 && zM1942e3 && zM1942e4) {
                            c0752m.f2249i = true;
                        }
                        Method methodM10439d = C5740a.f23386a.m10439d(c0752m.f2241a, c0752m.f2242b);
                        if (methodM10439d != null) {
                            c0752m.m1942e(methodM10439d, new C0751l(c0752m, 5));
                        }
                        z9 = c0752m.f2249i;
                    } else {
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
    private final Object m308f() {
        Object c3959f;
        boolean zBooleanValue;
        C0762h c0762h = (C0762h) ((C0215a) this.f143h).f524f;
        boolean z9 = false;
        if (c0762h != null) {
            synchronized (c0762h) {
                if (c0762h.f2285j) {
                    zBooleanValue = true;
                } else {
                    Method methodM1978p = c0762h.m1978p();
                    if (methodM1978p != null) {
                        try {
                            C3744i.f12154b.m7763b(methodM1978p, new C0219e(c0762h, 5));
                            c0762h.f2285j = true;
                            c3959f = Boolean.TRUE;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:MessageTextColor] 安装聊天消息绑定 Hook 失败: " + thM8182b.getMessage(), thM8182b);
                            c3959f = Boolean.FALSE;
                        }
                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                    } else {
                        AbstractC1184v0.m3203m("[Hchat:MessageTextColor] 定位聊天消息绑定方法失败");
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
    /* JADX INFO: renamed from: g */
    private final Object m309g() {
        Object c3959f;
        boolean zBooleanValue;
        C0851c c0851c = ((C0849a) this.f143h).f2599e;
        boolean z9 = false;
        if (c0851c != null) {
            synchronized (c0851c) {
                if (c0851c.f2604c) {
                    zBooleanValue = true;
                } else {
                    try {
                        Constructor constructorM2157d = c0851c.m2157d();
                        if (constructorM2157d == null || c0851c.m2158e() == null) {
                            zBooleanValue = false;
                        } else {
                            C3744i.f12154b.m7763b(constructorM2157d, new C0219e(c0851c, 7));
                            c0851c.f2604c = true;
                            c3959f = Boolean.TRUE;
                        }
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        ((C0042b) c0851c.f2605d).invoke("兼容低版本小程序Hook失败", thM8182b);
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
    /* JADX INFO: renamed from: h */
    private final Object m310h() {
        Object c3959f;
        boolean zBooleanValue;
        C0851c c0851c = ((C1098a) this.f143h).f3538e;
        boolean z9 = false;
        if (c0851c != null) {
            synchronized (c0851c) {
                if (c0851c.f2604c) {
                    zBooleanValue = true;
                } else {
                    try {
                        Method methodM2161h = c0851c.m2161h();
                        if (methodM2161h != null) {
                            C3744i.f12154b.m7763b(methodM2161h, new C0850b(((C3742g) c0851c.f2602a).f12143a, 1, false));
                            c0851c.f2604c = true;
                            c3959f = Boolean.TRUE;
                        } else {
                            zBooleanValue = false;
                        }
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        ((C0042b) c0851c.f2605d).invoke("小程序开屏广告 Hook 安装失败", thM8182b);
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
    /* JADX INFO: renamed from: i */
    private final Object m311i() {
        int i9;
        int i10;
        boolean z9;
        C1375d c1375d = ((C1372a) this.f143h).f4558e;
        boolean z10 = false;
        if (c1375d != null) {
            synchronized (c1375d) {
                try {
                    List listM2775k0 = AbstractC1089i.m2775k0(c1375d.f4565a, c1375d.f4566b);
                    if (listM2775k0.isEmpty()) {
                        i9 = 0;
                    } else {
                        Iterator it = listM2775k0.iterator();
                        i9 = 0;
                        while (it.hasNext()) {
                            if (c1375d.m3748b((Method) it.next(), new C1374c(c1375d, 1)) && (i9 = i9 + 1) < 0) {
                                AbstractC0000a.m30P0();
                                throw null;
                            }
                        }
                    }
                    List listM2773j0 = AbstractC1089i.m2773j0(c1375d.f4565a, c1375d.f4566b);
                    if (listM2773j0.isEmpty()) {
                        i10 = 0;
                    } else {
                        Iterator it2 = listM2773j0.iterator();
                        i10 = 0;
                        while (it2.hasNext()) {
                            if (c1375d.m3748b((Method) it2.next(), new C1374c(c1375d, 0)) && (i10 = i10 + 1) < 0) {
                                AbstractC0000a.m30P0();
                                throw null;
                            }
                        }
                    }
                    if (i9 <= 0) {
                        c1375d.f4566b.invoke("保存表情菜单创建 Hook 未安装", null);
                    }
                    if (i10 <= 0) {
                        c1375d.f4566b.invoke("保存表情菜单点击 Hook 未安装", null);
                    }
                    z9 = i9 > 0 && i10 > 0;
                } finally {
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
    private final Object m312j() {
        boolean z9;
        C1627b c1627b = ((C1626a) this.f143h).f5326e;
        boolean z10 = false;
        if (c1627b != null) {
            synchronized (c1627b) {
                if (c1627b.f5331d) {
                    z9 = true;
                } else {
                    ArrayList arrayListM4151a = c1627b.m4151a();
                    if (arrayListM4151a.isEmpty()) {
                        z9 = false;
                    } else {
                        ConcurrentHashMap.KeySetView keySetView = C1629d.f5334a;
                        c1627b.f5331d = C1629d.m4154c(c1627b.f5328a.f12143a, arrayListM4151a, c1627b.f5329b);
                        z9 = c1627b.f5331d;
                    }
                }
            }
            if (z9) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    private final Object m313k() {
        boolean z9;
        C1653m c1653m = ((C1652l) this.f143h).f5438e;
        if (c1653m != null) {
            c1653m.f5440b.registerOnSharedPreferenceChangeListener(c1653m.f5441c);
            c1653m.m4227a();
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    private final Object m314l() {
        Object c3959f;
        boolean zBooleanValue;
        Method method;
        Method method2;
        Object c3959f2;
        C0851c c0851c = ((C1639e0) this.f143h).f5375e;
        boolean z9 = false;
        if (c0851c != null) {
            synchronized (c0851c) {
                try {
                    if (c0851c.f2604c) {
                        zBooleanValue = true;
                    } else {
                        DexFinder dexFinder = ((C3742g) c0851c.f2602a).f12147e;
                        try {
                            dexFinder.resolveSnsUploadApi();
                            c3959f = C3967n.f12976a;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            ((C0042b) c0851c.f2605d).invoke("朋友圈上传尾巴定位朋友圈发布方法失败", thM8182b);
                        }
                        Method method3 = dexFinder.snsCommitMethod;
                        if (method3 == null || (method = dexFinder.snsSetSdkIdMethod) == null || (method2 = dexFinder.snsSetSdkAppNameMethod) == null || Modifier.isAbstract(method3.getModifiers()) || method3.getDeclaringClass().isInterface()) {
                            zBooleanValue = false;
                        } else {
                            try {
                                C3744i.f12154b.m7763b(method3, new C0036d(c0851c, method, method2, 1));
                                c0851c.f2604c = true;
                                c3959f2 = Boolean.TRUE;
                            } catch (Throwable th3) {
                                c3959f2 = new C3959f(th3);
                            }
                            Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                            if (thM8182b2 != null) {
                                ((C0042b) c0851c.f2605d).invoke("朋友圈上传尾巴Hook安装失败: " + method3.toGenericString(), thM8182b2);
                            }
                            Boolean bool = Boolean.FALSE;
                            if (c3959f2 instanceof C3959f) {
                                c3959f2 = bool;
                            }
                            zBooleanValue = ((Boolean) c3959f2).booleanValue();
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (zBooleanValue) {
                z9 = true;
            }
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m315m() {
        boolean z9;
        C1643g0 c1643g0 = (C1643g0) ((C0215a) this.f143h).f524f;
        if (c1643g0 != null) {
            z9 = c1643g0.m4173b(true);
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:537:0x0139 */
    /* JADX DEBUG: Type inference failed for r2v23. Raw type applied. Possible types: java.util.Iterator<E>, java.lang.Object, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0618 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r9v13, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v31 */
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
    public final Object invoke() throws PendingIntent.CanceledException {
        boolean z9;
        Object c3959f;
        boolean zBooleanValue;
        Object c3959f2;
        boolean zBooleanValue2;
        Object c3959f3;
        C0510b c0510b;
        Object c3959f4;
        Object next;
        Iterator it;
        Object next2;
        Object c3959f5;
        boolean z10;
        boolean zM1548f;
        boolean z11;
        ?? c3959f6;
        Object c3959f7;
        boolean z12;
        C1679g c1679gM4301i;
        boolean zBooleanValue3;
        Object c3959f8;
        switch (this.f142g) {
            case 0:
                C0046f c0046f = ((C0043c) this.f143h).f145e;
                boolean z13 = false;
                if (c0046f != null) {
                    synchronized (c0046f) {
                        if (c0046f.f157f) {
                            z9 = true;
                        } else {
                            boolean zM322d = c0046f.m322d();
                            boolean zM323e = c0046f.m323e();
                            boolean zM324f = c0046f.m324f();
                            try {
                                c0046f.m325j();
                                break;
                            } catch (Throwable unused) {
                            }
                            c0046f.f157f = zM322d && (zM323e || zM324f);
                            z9 = c0046f.f157f;
                        }
                    }
                    if (z9) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
            case 1:
                return ((InterfaceC0647d) this.f143h).mo1316j0();
            case 2:
                ((InterfaceC6059g) this.f143h).close();
                return C3967n.f12976a;
            case 3:
                PendingIntent actionIntent = ((RemoteAction) this.f143h).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e6) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e6);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return C3967n.f12976a;
            case 4:
                C0220f c0220f = (C0220f) ((C0215a) this.f143h).f524f;
                boolean z14 = false;
                if (c0220f != null) {
                    synchronized (c0220f) {
                        if (c0220f.f540d) {
                            zBooleanValue = true;
                        } else {
                            Method methodM916h = c0220f.m916h();
                            if (methodM916h != null) {
                                try {
                                    C3744i.f12154b.m7763b(methodM916h, new C0219e(c0220f, 0));
                                    c0220f.f540d = true;
                                    c3959f = Boolean.TRUE;
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b != null) {
                                    AbstractC1184v0.m3204n("[Hchat:ChatTimeStyle] 安装聊天时间样式 Hook 失败: " + thM8182b.getMessage(), thM8182b);
                                    c3959f = Boolean.FALSE;
                                }
                                zBooleanValue = ((Boolean) c3959f).booleanValue();
                            } else {
                                AbstractC1184v0.m3203m("[Hchat:ChatTimeStyle] 定位聊天时间绑定方法失败");
                                zBooleanValue = false;
                            }
                        }
                        break;
                    }
                    if (zBooleanValue) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            case 5:
                C0233m c0233m = (C0233m) ((C0215a) this.f143h).f524f;
                boolean z15 = false;
                if (c0233m != null) {
                    synchronized (c0233m) {
                        try {
                            if (c0233m.f607n) {
                                zBooleanValue2 = true;
                            } else {
                                if (c0233m.f595b.getBoolean("message_bubble_enable", false)) {
                                    C0238r.m952g(c0233m.f594a.f12143a, ((c0233m.f594a.f12143a.getResources().getConfiguration().uiMode & 48) == 32) && c0233m.f595b.getBoolean("message_bubble_separate_dark_mode", false));
                                }
                                if (c0233m.m942g().isEmpty()) {
                                    AbstractC1184v0.m3203m("[Hchat:MessageBubble] 未找到聊天气泡资源: ".concat(AbstractC4166m.m8392A1(C0233m.f593w, null, null, null, null, 63)));
                                } else {
                                    Method methodM945p = c0233m.m945p();
                                    if (methodM945p != null) {
                                        try {
                                            C3744i.f12154b.m7763b(methodM945p, new C0219e(c0233m, 1));
                                            c0233m.f607n = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            AbstractC1184v0.m3204n("[Hchat:MessageBubble] 安装聊天气泡 Hook 失败: " + thM8182b2.getMessage(), thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    } else {
                                        AbstractC1184v0.m3203m("[Hchat:MessageBubble] 定位聊天消息绑定方法失败");
                                    }
                                }
                                zBooleanValue2 = false;
                            }
                        } finally {
                        }
                        break;
                    }
                    if (zBooleanValue2) {
                        z15 = true;
                    }
                }
                return Boolean.valueOf(z15);
            case 6:
                C0233m c0233m2 = (C0233m) this.f143h;
                ArrayList arrayList = C0233m.f593w;
                int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(arrayList));
                if (iM8438a0 < 16) {
                    iM8438a0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                for (Object obj : arrayList) {
                    linkedHashMap.put(obj, Integer.valueOf(c0233m2.f594a.f12143a.getResources().getIdentifier((String) obj, "id", "com.tencent.mm")));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() != 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap2;
            case 7:
                C0245g c0245g = ((C0243e) this.f143h).f647e;
                boolean z16 = false;
                if (c0245g != null) {
                    if (c0245g.f662l) {
                        z16 = true;
                    } else {
                        C3742g c3742g = c0245g.f651a;
                        Context context = c3742g.f12143a;
                        ClassLoader classLoader = c3742g.f12145c;
                        classLoader.getClass();
                        String str = C3087k.m6557a(context, classLoader).f8202h;
                        SharedPreferences sharedPreferences = c0245g.f661k;
                        Method methodM2087c = C0828b.m2087c(sharedPreferences, str, c3742g.f12145c, "username_bind");
                        Object obj2 = null;
                        if (methodM2087c == null) {
                            List listM983g = c0245g.m983g("MicroMsg.ChattingItem", "fillingUsername:need getKfInfo");
                            if (listM983g.isEmpty()) {
                                listM983g = c0245g.m983g("fillingUsername:need getKfInfo");
                            }
                            Iterator it2 = listM983g.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next3 = it2.next();
                                    if (c0245g.m986m((Method) next3)) {
                                        obj2 = next3;
                                    }
                                }
                            }
                            methodM2087c = (Method) obj2;
                            if (methodM2087c != null) {
                                C0828b.m2092h(sharedPreferences, str, "username_bind", methodM2087c);
                            } else {
                                try {
                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                                        editorEdit.clear().putString("cache.key", str);
                                    }
                                    editorEdit.remove("username_bind").apply();
                                    break;
                                } catch (Throwable unused2) {
                                }
                            }
                            if (methodM2087c != null) {
                                try {
                                    C3744i.f12154b.m7763b(methodM2087c, new C0219e(c0245g, 3));
                                    c0245g.f662l = true;
                                    z16 = true;
                                } catch (Throwable th4) {
                                    c0245g.f655e.invoke("实名尾字Hook安装失败", th4);
                                }
                            }
                        } else {
                            if (!c0245g.m986m(methodM2087c)) {
                                methodM2087c = null;
                            }
                            if (methodM2087c == null) {
                            }
                            if (methodM2087c != null) {
                            }
                        }
                    }
                }
                return Boolean.valueOf(z16);
            case 8:
                C0369n c0369n = (C0369n) this.f143h;
                return c0369n.f23801t ? AbstractC0366k.m1320b(c0369n) : C6055c.f24519b;
            case 9:
                C0429d2.m1445y(((C0483r1) this.f143h).f1433a);
                return C3967n.f12976a;
            case 10:
                C0184c c0184c = (C0184c) this.f143h;
                C3742g c3742g2 = (C3742g) c0184c.f469a;
                C0042b c0042b = (C0042b) c0184c.f470b;
                c3742g2.getClass();
                Context context2 = c3742g2.f12143a;
                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context2, "Hchat_chat_live_photo_method_cache");
                ClassLoader classLoader2 = c3742g2.f12145c;
                String strM2091g = C0828b.m2091g(context2, classLoader2);
                Method methodM2087c2 = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader2, "storage_getter_v1");
                Method methodM2087c3 = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader2, "record_query_v1");
                Method methodM2087c4 = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader2, "media_factory_v1");
                char c10 = 0;
                int i9 = 1;
                if (methodM2087c2 != null && methodM2087c3 != null && methodM2087c4 != null) {
                    C0510b c0510b2 = new C0510b(methodM2087c2, methodM2087c3, methodM2087c4);
                    Class<?>[] parameterTypes = methodM2087c4.getParameterTypes();
                    parameterTypes.getClass();
                    Class cls = (Class) AbstractC4165l.m8366C0(0, parameterTypes);
                    if (cls == null || !AbstractC0063p.m431x(cls, methodM2087c4)) {
                        c0510b2 = null;
                        if (c0510b2 != null) {
                            return c0510b2;
                        }
                    } else {
                        Class<?> cls2 = methodM2087c4.getParameterTypes()[1];
                        cls2.getClass();
                        if (AbstractC0063p.m392B(cls2, methodM2087c3)) {
                            Class<?> declaringClass = methodM2087c3.getDeclaringClass();
                            declaringClass.getClass();
                            if (!AbstractC0063p.m393C(declaringClass, methodM2087c2)) {
                            }
                            if (c0510b2 != null) {
                            }
                        }
                    }
                }
                C0828b.m2085a(sharedPreferencesM8640c, strM2091g, "storage_getter_v1");
                C0828b.m2085a(sharedPreferencesM8640c, strM2091g, "record_query_v1");
                C0828b.m2085a(sharedPreferencesM8640c, strM2091g, "media_factory_v1");
                try {
                    DexKitBridge dexKitBridge = c3742g2.f12146d;
                    C0570e c0570e = new C0570e();
                    C1253k c1253k = new C1253k();
                    C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("ChatLiveMediaInfo imgInfo query failed, msgId=", "create ChatLiveMediaInfo, msgId="));
                    c0570e.f1764h = c1253k;
                    Iterator it3 = dexKitBridge.findMethod(c0570e).iterator();
                    it3.getClass();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next4 = it3.next();
                            next4.getClass();
                            C1730o c1730o = (C1730o) next4;
                            try {
                                c3959f4 = c1730o.m4348p().m6023b(classLoader2);
                            } catch (Throwable th5) {
                                c3959f4 = new C3959f(th5);
                            }
                            if (c3959f4 instanceof C3959f) {
                                c3959f4 = null;
                            }
                            Method method = (Method) c3959f4;
                            if (method != null) {
                                Class<?>[] parameterTypes2 = method.getParameterTypes();
                                parameterTypes2.getClass();
                                Class<?> cls3 = parameterTypes2.length == i9 ? parameterTypes2[c10] : null;
                                if (cls3 != null) {
                                    C1731p<C1730o> c1731pM4349q = c1730o.m4349q();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (C1730o c1730o2 : c1731pM4349q) {
                                        try {
                                            c1730o2.getClass();
                                            c3959f5 = c1730o2.m4348p().m6023b(classLoader2);
                                        } catch (Throwable th6) {
                                            c3959f5 = new C3959f(th6);
                                        }
                                        if (c3959f5 instanceof C3959f) {
                                            c3959f5 = null;
                                        }
                                        Method method2 = (Method) c3959f5;
                                        if (method2 != null) {
                                            arrayList2.add(method2);
                                        }
                                        break;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj3 : arrayList2) {
                                        if (AbstractC0063p.m431x(cls3, (Method) obj3)) {
                                            arrayList3.add(obj3);
                                        }
                                    }
                                    Iterator it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        Method method3 = (Method) it4.next();
                                        Class<?> cls4 = method3.getParameterTypes()[i9];
                                        Iterator it5 = arrayList2.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                cls4.getClass();
                                                if (AbstractC0063p.m392B(cls4, (Method) next)) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        Method method4 = (Method) next;
                                        if (method4 != null) {
                                            Iterator it6 = arrayList2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next2 = it6.next();
                                                    it = it4;
                                                    Class<?> declaringClass2 = method4.getDeclaringClass();
                                                    declaringClass2.getClass();
                                                    if (!AbstractC0063p.m393C(declaringClass2, (Method) next2)) {
                                                        it4 = it;
                                                    }
                                                } else {
                                                    it = it4;
                                                    next2 = null;
                                                }
                                            }
                                            Method method5 = (Method) next2;
                                            if (method5 != null) {
                                                c3959f3 = new C0510b(method5, method4, method3);
                                            } else {
                                                it4 = it;
                                            }
                                            break;
                                        }
                                        i9 = 1;
                                    }
                                    c10 = 0;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            c3959f3 = null;
                        }
                        break;
                    }
                } catch (Throwable th7) {
                    c3959f3 = new C3959f(th7);
                }
                Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                if (thM8182b3 != null) {
                    c0042b.invoke("定位聊天实况图片方法失败", thM8182b3);
                }
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = null;
                }
                C0510b c0510b3 = (C0510b) c3959f3;
                if (c0510b3 != null) {
                    C0828b.m2092h(sharedPreferencesM8640c, strM2091g, "storage_getter_v1", c0510b3.f1560a);
                    C0828b.m2092h(sharedPreferencesM8640c, strM2091g, "record_query_v1", c0510b3.f1561b);
                    C0828b.m2092h(sharedPreferencesM8640c, strM2091g, "media_factory_v1", c0510b3.f1562c);
                    c0510b = c0510b3;
                } else {
                    c0510b = null;
                }
                return c0510b;
            case 11:
                C0545f c0545f = (C0545f) ((C0215a) this.f143h).f524f;
                boolean z17 = false;
                if (c0545f != null) {
                    synchronized (c0545f) {
                        try {
                            if (c0545f.f1720c) {
                                z10 = true;
                            } else {
                                C0542c c0542cM1551o = c0545f.m1551o();
                                if (c0542cM1551o != null) {
                                    boolean zM1548f2 = c0545f.m1548f(c0542cM1551o.f1710a, 2, -1);
                                    Constructor constructor = c0542cM1551o.f1711b;
                                    Class<?>[] parameterTypes3 = constructor.getParameterTypes();
                                    parameterTypes3.getClass();
                                    boolean zM1548f3 = c0545f.m1548f(constructor, 2, C0545f.m1541m(parameterTypes3));
                                    Method method6 = c0542cM1551o.f1712c;
                                    if (method6 != null) {
                                        Class<?>[] parameterTypes4 = method6.getParameterTypes();
                                        parameterTypes4.getClass();
                                        zM1548f = c0545f.m1548f(method6, 3, C0545f.m1541m(parameterTypes4));
                                    } else {
                                        zM1548f = true;
                                    }
                                    c0545f.f1720c = zM1548f2 && zM1548f3 && zM1548f;
                                    z10 = c0545f.f1720c;
                                } else {
                                    AbstractC1184v0.m3203m("[Hchat:RoundAvatar] 定位微信全局头像入口失败");
                                    z10 = false;
                                }
                            }
                        } finally {
                        }
                    }
                    if (z10) {
                        z17 = true;
                    }
                }
                return Boolean.valueOf(z17);
            case 12:
                return m307e();
            case 13:
                return m308f();
            case 14:
                return m309g();
            case 15:
                return ScriptPluginBridge.unhookPlugin$lambda$0$0((CopyOnWriteArrayList) this.f143h);
            case 16:
                return ScriptPluginBridge.applyModuleFloatingGlassBar$lambda$1$1$0((InterfaceC5196p3) this.f143h);
            case 17:
                Object systemService = ((C0982n) this.f143h).f3096b.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 18:
                return new BaseInputConnection(((C0989u) this.f143h).f3123a, false);
            case 19:
                C1094e c1094e = ((C1090a) this.f143h).f3504e;
                boolean z18 = false;
                if (c1094e != null) {
                    C3742g c3742g3 = c1094e.f3512a;
                    C0042b c0042b2 = c1094e.f3513b;
                    List listM2773j0 = AbstractC1089i.m2773j0(c3742g3, c0042b2);
                    List listM2775k0 = AbstractC1089i.m2775k0(c3742g3, c0042b2);
                    if (listM2773j0.isEmpty()) {
                        c0042b2.invoke("修改聊天记录定位菜单点击方法失败", null);
                    }
                    if (listM2775k0.isEmpty()) {
                        c0042b2.invoke("修改聊天记录定位菜单创建方法失败", null);
                    }
                    Iterator it7 = listM2775k0.iterator();
                    int i10 = 0;
                    while (it7.hasNext()) {
                        if (c1094e.m2817b((Method) it7.next(), true)) {
                            i10++;
                        }
                    }
                    Iterator it8 = listM2773j0.iterator();
                    int i11 = 0;
                    while (it8.hasNext()) {
                        if (c1094e.m2817b((Method) it8.next(), false)) {
                            i11++;
                        }
                    }
                    if (i10 <= 0 || i11 <= 0) {
                        c0042b2.invoke("修改聊天记录Hook未安装", null);
                    }
                    if (i10 > 0 && i11 > 0) {
                        z18 = true;
                    }
                }
                return Boolean.valueOf(z18);
            case 20:
                return m310h();
            case 21:
                C1266j c1266j = (C1266j) this.f143h;
                c1266j.f4191I = null;
                AbstractC5618k.m10158n(c1266j);
                AbstractC5618k.m10157m(c1266j);
                AbstractC5618k.m10156l(c1266j);
                return Boolean.TRUE;
            case 22:
                C1270n c1270n = (C1270n) this.f143h;
                c1270n.f4216F = null;
                AbstractC5618k.m10158n(c1270n);
                AbstractC5618k.m10157m(c1270n);
                AbstractC5618k.m10156l(c1270n);
                return Boolean.TRUE;
            case 23:
                return m311i();
            case 24:
                return m312j();
            case 25:
                return m313k();
            case 26:
                return KavaReflector.loadClass("com.tencent.mm.plugin.sns.storage.SnsInfo", ((C1666z) this.f143h).f5476a.f12145c);
            case 27:
                return m314l();
            case 28:
                return m315m();
            default:
                C1684i0 c1684i0 = ((C1698u) this.f143h).f5657e;
                if (c1684i0 != null) {
                    Method methodM396F = AbstractC0063p.m396F(c1684i0.f5582a, c1684i0.f5583b);
                    Method methodM395E = AbstractC0063p.m395E(c1684i0.f5582a, c1684i0.f5583b);
                    Method methodM397G = methodM395E != null ? AbstractC0063p.m397G(c1684i0.f5582a, methodM395E, c1684i0.f5583b) : null;
                    boolean z19 = (methodM396F == null || methodM397G == null || !c1684i0.m4286b(methodM396F, new C1682h0(c1684i0, 0))) ? false : true;
                    boolean z20 = (methodM395E == null || methodM397G == null || !c1684i0.m4286b(methodM395E, new C0425c2(c1684i0, 5, methodM397G))) ? false : true;
                    C0828b c0828b = C0828b.f2478a;
                    C3742g c3742g4 = c1684i0.f5582a;
                    String strM2091g2 = C0828b.m2091g(c3742g4.f12143a, c3742g4.f12145c);
                    SharedPreferences sharedPreferences2 = c1684i0.f5587f;
                    List listM2090f = C0828b.m2090f(sharedPreferences2, strM2091g2, c3742g4.f12145c, "retransmit_done_v1");
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : listM2090f) {
                        if (C1684i0.m4285c((Method) obj4)) {
                            arrayList4.add(obj4);
                        }
                    }
                    boolean zIsEmpty = arrayList4.isEmpty();
                    Collection collection = arrayList4;
                    if (zIsEmpty) {
                        try {
                            DexKitBridge dexKitBridge2 = c3742g4.f12146d;
                            C0570e c0570e2 = new C0570e();
                            C1253k c1253k2 = new C1253k();
                            c1253k2.m3369l0(5, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
                            C1253k.m3367u0(c1253k2, AbstractC0000a.m101y0("sendResult", "SendMsgUsernames"));
                            c0570e2.f1764h = c1253k2;
                            C1731p c1731pFindMethod = dexKitBridge2.findMethod(c0570e2);
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it9 = c1731pFindMethod.iterator();
                            while (it9.hasNext()) {
                                try {
                                    c3959f7 = ((C1730o) it9.next()).m4350r(c3742g4.f12145c);
                                } catch (Throwable th8) {
                                    c3959f7 = new C3959f(th8);
                                }
                                if (c3959f7 instanceof C3959f) {
                                    c3959f7 = null;
                                }
                                Method method7 = (Method) c3959f7;
                                if (method7 != null) {
                                    arrayList5.add(method7);
                                }
                                break;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : arrayList5) {
                                if (C1684i0.m4285c((Method) obj5)) {
                                    arrayList6.add(obj5);
                                }
                            }
                            HashSet hashSet = new HashSet();
                            c3959f6 = new ArrayList();
                            for (Object obj6 : arrayList6) {
                                if (hashSet.add(((Method) obj6).toGenericString())) {
                                    c3959f6.add(obj6);
                                }
                            }
                        } catch (Throwable th9) {
                            c3959f6 = new C3959f(th9);
                        }
                        Throwable thM8182b4 = C3960g.m8182b(c3959f6);
                        if (thM8182b4 != null) {
                            c1684i0.f5583b.invoke("定位群发助手重发完成方法失败", thM8182b4);
                        }
                        C4173t c4173t = C4173t.f13710g;
                        boolean z21 = c3959f6 instanceof C3959f;
                        ?? r92 = c3959f6;
                        if (z21) {
                            r92 = c4173t;
                        }
                        List list = (List) r92;
                        boolean zIsEmpty2 = list.isEmpty();
                        collection = list;
                        if (!zIsEmpty2) {
                            c0828b.m2097j(sharedPreferences2, strM2091g2, "retransmit_done_v1", list);
                            collection = list;
                        }
                    }
                    if (collection.isEmpty()) {
                        z12 = false;
                        C1687k c1687k = c1684i0.f5590i;
                        c1679gM4301i = c1687k.m4301i();
                        if (c1679gM4301i != null) {
                            c1687k.f5605f = c1679gM4301i;
                            if (c1687k.f5609j) {
                                zBooleanValue3 = true;
                            } else {
                                try {
                                    C3744i.f12154b.m7763b(c1679gM4301i.f5561c, new C0219e(c1687k, 11));
                                    c1687k.f5609j = true;
                                    c3959f8 = Boolean.TRUE;
                                } catch (Throwable th10) {
                                    c3959f8 = new C3959f(th10);
                                }
                                Throwable thM8182b5 = C3960g.m8182b(c3959f8);
                                if (thM8182b5 != null) {
                                    c1687k.f5601b.invoke("微信原生群发助手完成回调Hook失败: " + c1679gM4301i.f5561c.toGenericString(), thM8182b5);
                                }
                                Boolean bool = Boolean.FALSE;
                                if (c3959f8 instanceof C3959f) {
                                    c3959f8 = bool;
                                }
                                zBooleanValue3 = ((Boolean) c3959f8).booleanValue();
                            }
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (!z19) {
                            c1684i0.f5583b.invoke("群发助手菜单创建Hook未安装", null);
                        }
                        if (!z20) {
                            c1684i0.f5583b.invoke("群发助手菜单点击Hook未安装", null);
                        }
                        if (!z12) {
                            c1684i0.f5583b.invoke("群发助手重发完成Hook未安装", null);
                        }
                        if (!zBooleanValue3) {
                            c1684i0.f5583b.invoke("微信原生群发助手通道未安装", null);
                        }
                        z11 = z19 && z20 && z12 && zBooleanValue3;
                        break;
                    } else {
                        if (!collection.isEmpty()) {
                            Iterator it10 = collection.iterator();
                            while (it10.hasNext()) {
                                if (!c1684i0.m4286b((Method) it10.next(), new C1682h0(c1684i0, 1))) {
                                    z12 = false;
                                    C1687k c1687k2 = c1684i0.f5590i;
                                    c1679gM4301i = c1687k2.m4301i();
                                    if (c1679gM4301i != null) {
                                    }
                                    if (!z19) {
                                    }
                                    if (!z20) {
                                    }
                                    if (!z12) {
                                    }
                                    if (!zBooleanValue3) {
                                    }
                                    if (z19) {
                                    }
                                }
                            }
                        }
                        z12 = true;
                        C1687k c1687k22 = c1684i0.f5590i;
                        c1679gM4301i = c1687k22.m4301i();
                        if (c1679gM4301i != null) {
                        }
                        if (!z19) {
                        }
                        if (!z20) {
                        }
                        if (!z12) {
                        }
                        if (!zBooleanValue3) {
                        }
                        if (z19) {
                        }
                    }
                    break;
                }
                return Boolean.valueOf(z11);
        }
    }
}
