package p010aa;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import android.widget.TextView;
import ci.C0575c;
import gg.AbstractC1416l;
import gg.C1414j;
import gg.C1425u;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import na.C2917e;
import okhttp3.HttpUrl;
import okio.C3193a;
import p002a1.RunnableC0006d;
import p007a7.AbstractC0018a;
import p015b0.C0136d0;
import p020b5.C0184c;
import p024b9.C0215a;
import p036c9.C0429d2;
import p036c9.C0456k1;
import p036c9.C0492u1;
import p040d0.InterfaceC0647d;
import p057e1.C0807b;
import p062e8.C0828b;
import p064ea.C0850b;
import p068eh.AbstractC0921a;
import p069f.C0945l0;
import p077f8.AbstractC1089i;
import p079fa.C1098a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.crash.C1438g;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.utils.KavaReflector;
import p100h0.AbstractC1517f1;
import p100h0.C1511d1;
import p109hb.C1669b;
import p109hb.C1671c;
import p109hb.C1683i;
import p109hb.C1687k;
import p109hb.C1694q;
import p109hb.C1695r;
import p109hb.RunnableC1692o;
import p117i0.C1871q;
import p117i0.C1879s1;
import p117i0.InterfaceC1809a1;
import p119i2.C1926g;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p126ia.C2007a0;
import p126ia.C2009c;
import p126ia.C2014h;
import p126ia.C2026t;
import p126ia.C2027u;
import p126ia.C2030x;
import p126ia.C2032z;
import p129ig.AbstractC2043a;
import p144k.C2178i0;
import p144k.C2195o;
import p153k8.C2353q;
import p211o9.C3090c;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p230p8.C3351d0;
import p230p8.C3354f;
import p230p8.C3356h;
import p230p8.C3358j;
import p230p8.C3363o;
import p230p8.C3372x;
import p244qb.C3488i;
import p244qb.C3490k;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p259r9.C3752d0;
import p265s.C3866x0;
import p266s0.C3871a;
import p274s8.C3941a;
import p274s8.C3942b;
import p274s8.C3943c;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p293u2.C4240j;
import p293u2.C4242l;
import p300ub.AbstractC4302b;
import p307v0.C4364d;
import p307v0.InterfaceC4366f;
import p308v1.AbstractC4441z0;
import p308v1.InterfaceC4428t;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.EnumC4599g0;
import p332wb.ViewOnAttachStateChangeListenerC4826dr;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p370yf.AbstractC6044i;
import p372z.C6056d;
import p372z.InterfaceC6059g;
import sg.InterfaceC3975g;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4174u;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: aa.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0035c implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f123g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f124h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f125i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: fg.l */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0035c(InterfaceC3599t interfaceC3599t, InterfaceC1231l interfaceC1231l) {
        this.f123g = 10;
        this.f124h = interfaceC3599t;
        this.f125i = (AbstractC6044i) interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m292e() {
        C0215a c0215a = (C0215a) this.f124h;
        C3742g c3742g = (C3742g) this.f125i;
        boolean z9 = false;
        try {
            C2917e c2917e = (C2917e) c0215a.f524f;
            if (c2917e == null) {
                c2917e = new C2917e(c3742g.f12143a, c3742g.f12145c, c3742g.f12147e);
                c0215a.f524f = c2917e;
            }
            Iterator it = c2917e.m6326c().iterator();
            while (it.hasNext()) {
                c0215a.m7753j(it.next());
            }
            DexFinder dexFinder = c2917e.f9459c;
            boolean z10 = (dexFinder.receiveLuckyMoneyClass == null && dexFinder.receiveLuckyMoneyUnionClass == null) ? false : true;
            if (dexFinder.openLuckyMoneyClass == null) {
                boolean z11 = dexFinder.openLuckyMoneyUnionClass != null;
                if (z10 && z11) {
                    z9 = true;
                }
            }
        } catch (Throwable th2) {
            c0215a.m7750e("自动抢红包安装失败", th2);
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[PHI: r6
  0x005f: PHI (r6v3 java.lang.Object) = (r6v2 java.lang.Object), (r6v5 java.lang.Object) binds: [B:22:0x0054, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m293f() {
        boolean zBooleanValue;
        Object objM7105k;
        Object field;
        long jLongValue;
        Object c3959f;
        C3351d0 c3351d0 = (C3351d0) this.f124h;
        Object obj = this.f125i;
        C3356h c3356hM7075g = c3351d0.m7075g();
        boolean z9 = false;
        if (c3356hM7075g != null) {
            if (obj == null || !obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo") || (objM7105k = c3356hM7075g.m7105k()) == null) {
                zBooleanValue = false;
                if (zBooleanValue) {
                    z9 = true;
                }
            } else {
                Method methodM7101f = c3356hM7075g.f10823j;
                if (methodM7101f == null) {
                    methodM7101f = c3356hM7075g.m7101f(C3356h.f10813o, new C0456k1(c3356hM7075g, objM7105k, 10), "sns_info_update_v1");
                    if (methodM7101f != null) {
                        c3356hM7075g.f10823j = methodM7101f;
                        field = KavaReflector.readField(obj, "field_snsId");
                        if (field != null || (field = KavaReflector.readField(obj, "snsId")) != null) {
                            Number number = field instanceof Number ? (Number) field : null;
                            if (number != null) {
                                jLongValue = number.longValue();
                            } else {
                                Long lM6743g0 = AbstractC3156t.m6743g0(field.toString());
                                if (lM6743g0 != null) {
                                    jLongValue = lM6743g0.longValue();
                                }
                            }
                            try {
                                c3959f = Boolean.valueOf(AbstractC1416l.m3825a(KavaReflector.invokeOrThrow(methodM7101f, objM7105k, Long.valueOf(jLongValue), obj), Boolean.TRUE));
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            Throwable thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                                c3356hM7075g.f10817d.invoke("更新朋友圈缓存失败: " + thM8182b.getMessage());
                            }
                            Boolean bool = Boolean.FALSE;
                            if (c3959f instanceof C3959f) {
                                c3959f = bool;
                            }
                            zBooleanValue = ((Boolean) c3959f).booleanValue();
                            if (zBooleanValue) {
                            }
                        }
                    }
                    zBooleanValue = false;
                    if (zBooleanValue) {
                    }
                } else {
                    if (!C3356h.m7099e(objM7105k.getClass(), methodM7101f)) {
                        methodM7101f = null;
                    }
                    if (methodM7101f != null) {
                        field = KavaReflector.readField(obj, "field_snsId");
                        if (field != null) {
                            zBooleanValue = false;
                            if (zBooleanValue) {
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Object m294g() {
        TextView textView = (TextView) this.f124h;
        C3752d0 c3752d0 = (C3752d0) this.f125i;
        if (textView.getParent() != null && AbstractC1416l.m3825a(textView.getTag(), "hchat_message_details_view")) {
            c3752d0.m7837e(textView);
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:149:0x0258 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:218:0x039c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:220:0x03a1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:560:0x08be */
    /* JADX DEBUG: Type inference failed for r3v49. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x041f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0760 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r0v138, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.lang.Object, tf.t] */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v208 */
    /* JADX WARN: Type inference failed for: r12v1, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v37, types: [fg.l, yf.i] */
    /* JADX WARN: Type inference failed for: r2v72, types: [fg.p, gg.j] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v42, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v64, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v73 */
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
        List<Class<?>> list;
        ?? arrayList;
        boolean zBooleanValue;
        Object c3959f;
        Object obj;
        long j3;
        C4618m1 c4618m1M9051d;
        C4629q0 c4629q0;
        C1926g c1926g;
        boolean z10;
        boolean z11;
        C2007a0 c2007a0;
        Object c3959f2;
        boolean zBooleanValue2;
        boolean z12;
        Class<?> declaringClass;
        boolean z13;
        Object objM7105k;
        Method methodM7101f;
        Activity activityM4943c;
        Object c3959f3;
        List listM8159E;
        Object obj2 = null;
         = 0;
        ?? r32 = 0;
        boolean zM4951h = false;
        z = false;
        z = false;
        boolean z14 = false;
        zM4951h = false;
        int i9 = 1;
        switch (this.f123g) {
            case 0:
                C0037e c0037e = (C0037e) this.f124h;
                C3742g c3742g = (C3742g) this.f125i;
                if (c0037e.f130e) {
                    z9 = true;
                } else {
                    C2353q c2353qMessageParser = WeChatApis.messageParser();
                    if (c2353qMessageParser == null || (list = c3742g.f12147e.addMsgClasses) == null || list.isEmpty()) {
                        z9 = false;
                    } else {
                        Iterator<Class<?>> it = list.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            for (Method method : KavaReflector.declaredMethods(it.next())) {
                                if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    if (parameterTypes != null) {
                                        arrayList = new ArrayList();
                                        int length = parameterTypes.length;
                                        for (int i11 = 0; i11 < length; i11++) {
                                            if (C2353q.m5648h(parameterTypes[i11])) {
                                                arrayList.add(Integer.valueOf(i11));
                                            }
                                        }
                                    } else {
                                        arrayList = C4173t.f13710g;
                                    }
                                    if (!arrayList.isEmpty()) {
                                        C3744i.f12154b.m7763b(method, new C0036d(c3742g, (List) arrayList, c0037e, c2353qMessageParser));
                                        i10++;
                                    }
                                }
                            }
                        }
                        c0037e.f130e = i10 > 0;
                        if (!c0037e.f130e) {
                            c0037e.m7750e("AddMsg 屏蔽入口未找到", null);
                        }
                        z9 = c0037e.f130e;
                    }
                }
                return Boolean.valueOf(z9);
            case 1:
                ((C1425u) this.f124h).f4738g = ((InterfaceC1220a) this.f125i).invoke();
                return C3967n.f12976a;
            case 2:
                return new C4240j(AbstractC2043a.m5017W(((InterfaceC0647d) this.f124h).mo1315E0((InterfaceC4428t) ((InterfaceC1220a) this.f125i).invoke())));
            case 3:
                ((C6056d) this.f124h).f24523d.invoke((InterfaceC6059g) this.f125i);
                return C3967n.f12976a;
            case 4:
                Context context = (Context) this.f124h;
                TextClassification textClassification = (TextClassification) this.f125i;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e6) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
                    }
                    break;
                } else {
                    activity.send();
                }
                return C3967n.f12976a;
            case 5:
                Activity activity2 = (Activity) this.f124h;
                C0492u1 c0492u1 = (C0492u1) this.f125i;
                C0429d2.m1445y(activity2);
                C0429d2 c0429d2 = C0429d2.f1235a;
                C0429d2.m1443w(c0492u1.f1494d, activity2);
                return C3967n.f12976a;
            case 6:
                Context context2 = (Context) this.f124h;
                Object obj3 = this.f125i;
                C0429d2.m1445y(context2);
                C0429d2 c0429d22 = C0429d2.f1235a;
                C0429d2.m1416A(obj3, context2);
                C0429d2.m1417B(obj3);
                Object field = KavaReflector.readField(obj3, "adapter");
                if (field != null) {
                    KavaReflector.invokeSuccessfully(C0429d2.f1250p, field, new Object[0]);
                }
                return C3967n.f12976a;
            case 7:
                return ScriptPluginBridge.applyModuleFloatingGlassBar$lambda$1$1((ScriptPluginBridge) this.f124h, (ViewOnAttachStateChangeListenerC4826dr) this.f125i);
            case 8:
                Context context3 = (Context) this.f124h;
                ClassLoader classLoader = (ClassLoader) this.f125i;
                HashSet hashSet = C1098a.f3537f;
                String str = classLoader.getClass().getName() + "@" + System.identityHashCode(classLoader);
                HashSet hashSet2 = C1098a.f3537f;
                synchronized (hashSet2) {
                    if (hashSet2.contains(str)) {
                        zBooleanValue = true;
                    } else {
                        Method methodM2089e = C0828b.m2089e(AbstractC4302b.m8640c(context3, "Hchat_skip_global_mini_program_splash_ads_method_cache"), C0828b.m2091g(context3, classLoader), classLoader, "splash_ad_check_method");
                        if (methodM2089e == null) {
                            zBooleanValue = false;
                        } else {
                            Method method2 = AbstractC1089i.m2758b(methodM2089e) ? methodM2089e : null;
                            if (method2 != null) {
                                try {
                                    C3744i.f12154b.m7763b(method2, new C0850b(context3, i9, false));
                                    hashSet2.add(str);
                                    c3959f = Boolean.TRUE;
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b != null) {
                                    AbstractC1184v0.m3204n("[Hchat:MiniProgramSplashAds] 小程序进程开屏广告 Hook 安装失败: " + thM8182b.getMessage(), thM8182b);
                                    obj = Boolean.FALSE;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            case 9:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f124h;
                String str2 = (String) this.f125i;
                if (atomicBoolean.get()) {
                    C1438g c1438g = C1438g.f4755a;
                    File file = C1438g.f4774t;
                    if (file == null) {
                        AbstractC1416l.m3831g("lastReportFile");
                        throw null;
                    }
                    if (C1438g.m3870l(file, str2)) {
                        File file2 = C1438g.f4773s;
                        if (file2 == null) {
                            AbstractC1416l.m3831g("pendingReportFile");
                            throw null;
                        }
                        file2.delete();
                    }
                }
                C1438g.f4767m = null;
                C1438g.f4768n = new WeakReference(null);
                C1438g.f4769o = null;
                C1438g.f4760f.set(false);
                return C3967n.f12976a;
            case 10:
                AbstractC3603v.m7563q((InterfaceC3599t) this.f124h, null, new C0575c((InterfaceC1231l) this.f125i, (InterfaceC5557c) null), 1);
                return C3967n.f12976a;
            case 11:
                C1511d1 c1511d1 = (C1511d1) this.f124h;
                long j4 = ((C4242l) ((InterfaceC1809a1) this.f125i).getValue()).f13918a;
                C0807b c0807bM4023i = c1511d1.m4023i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (c0807bM4023i != null) {
                    long j5 = c0807bM4023i.f2414a;
                    C1926g c1926gM4027m = c1511d1.m4027m();
                    if (c1926gM4027m != null && c1926gM4027m.f6529h.length() != 0) {
                        EnumC4599g0 enumC4599g0 = (EnumC4599g0) c1511d1.f5045q.getValue();
                        int i12 = enumC4599g0 == null ? -1 : AbstractC1517f1.f5070a[enumC4599g0.ordinal()];
                        if (i12 != -1) {
                            if (i12 == 1 || i12 == 2) {
                                long j10 = c1511d1.m4028n().f9317b;
                                int i13 = C1939m0.f6574c;
                                j3 = j10 >> 32;
                            } else {
                                if (i12 != 3) {
                                    C3193a.m6822k();
                                    return null;
                                }
                                long j11 = c1511d1.m4028n().f9317b;
                                int i14 = C1939m0.f6574c;
                                j3 = j11 & 4294967295L;
                            }
                            int i15 = (int) j3;
                            C4629q0 c4629q02 = c1511d1.f5032d;
                            if (c4629q02 != null && (c4618m1M9051d = c4629q02.m9051d()) != null && (c4629q0 = c1511d1.f5032d) != null && (c1926g = c4629q0.f15326a.f15436a) != null) {
                                c1511d1.f5030b.m859l(i15);
                                int iM7909r = AbstractC3754e0.m7909r(i15, 0, c1926g.f6529h.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c4618m1M9051d.m9039d(j5) >> 32));
                                C1935k0 c1935k0 = c4618m1M9051d.f15293a;
                                C1942o c1942o = c1935k0.f6562b;
                                int iM4827d = c1942o.m4827d(iM7909r);
                                float fM4805e = c1935k0.m4805e(iM4827d);
                                float fM4806f = c1935k0.m4806f(iM4827d);
                                float fM7907q = AbstractC3754e0.m7907q(fIntBitsToFloat, Math.min(fM4805e, fM4806f), Math.max(fM4805e, fM4806f));
                                if (C4242l.m8534a(j4, 0L) || Math.abs(fIntBitsToFloat - fM7907q) <= ((int) (j4 >> 32)) / 2) {
                                    float fM4829f = c1942o.m4829f(iM4827d);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM7907q)) << 32) | (((long) Float.floatToRawIntBits(((c1942o.m4825b(iM4827d) - fM4829f) / 2) + fM4829f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C0807b(jFloatToRawIntBits);
            case 12:
                C1669b c1669b = (C1669b) ((ConcurrentHashMap) ((C1671c) this.f124h).f5523j).get(((C1669b) this.f125i).f5509a);
                if (c1669b != null) {
                    c1669b.f5510b.set(true);
                    c1669b.f5511c.countDown();
                }
                return C3967n.f12976a;
            case 13:
                C1687k c1687k = (C1687k) this.f124h;
                c1687k.f5602c.post(new RunnableC0006d(c1687k, 17, ((C1683i) this.f125i).f5576a));
                return C3967n.f12976a;
            case 14:
                C1695r c1695r = (C1695r) this.f124h;
                ((Handler) c1695r.f5639d).post(new RunnableC1692o(c1695r, ((C1694q) this.f125i).f5626a, i9));
                return C3967n.f12976a;
            case 15:
                ((InterfaceC3975g) this.f124h).mo8208p(this.f125i);
                return C3967n.f12976a;
            case 16:
                C0184c c0184c = (C0184c) this.f124h;
                C1879s1 c1879s1 = (C1879s1) this.f125i;
                if (((C3871a) c0184c.f469a).get() == 0) {
                    c1879s1.invoke();
                }
                return C3967n.f12976a;
            case 17:
                C0945l0 c0945l0 = (C0945l0) this.f124h;
                C1871q c1871q = (C1871q) this.f125i;
                Object[] objArr = c0945l0.f2976b;
                long[] jArr = c0945l0.f2975a;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j12 = jArr[i16];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((255 & j12) < 128) {
                                    c1871q.m4613z(objArr[(i16 << 3) + i18]);
                                }
                                j12 >>= 8;
                            }
                            if (i17 == 8) {
                                if (i16 != length2) {
                                    i16++;
                                }
                            }
                        }
                    }
                }
                return C3967n.f12976a;
            case 18:
                C2027u c2027u = (C2027u) this.f124h;
                C3742g c3742g2 = (C3742g) this.f125i;
                C3363o c3363o = c2027u.f6854g;
                if (c3363o == null) {
                    z10 = false;
                } else {
                    C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
                    if (c3351d0SnsApi != null) {
                        C3356h c3356hM7075g = c3351d0SnsApi.m7075g();
                        if (c3356hM7075g == null || (objM7105k = c3356hM7075g.m7105k()) == null) {
                            z13 = false;
                            z11 = z13;
                        } else {
                            Method methodM7101f2 = c3356hM7075g.f10820g;
                            if (methodM7101f2 == null) {
                                methodM7101f2 = c3356hM7075g.m7101f(C3356h.f10810l, new C0456k1(c3356hM7075g, objM7105k, 15), "sns_info_get_by_id_v1");
                                if (methodM7101f2 != null) {
                                    c3356hM7075g.f10820g = methodM7101f2;
                                } else {
                                    methodM7101f2 = null;
                                }
                                methodM7101f = c3356hM7075g.f10823j;
                                if (methodM7101f == null) {
                                    methodM7101f = c3356hM7075g.m7101f(C3356h.f10813o, new C0456k1(c3356hM7075g, objM7105k, 16), "sns_info_update_v1");
                                    if (methodM7101f != null) {
                                        c3356hM7075g.f10823j = methodM7101f;
                                    } else {
                                        methodM7101f = null;
                                    }
                                    if (methodM7101f2 == null && methodM7101f != null) {
                                        z13 = true;
                                    }
                                    z11 = z13;
                                } else {
                                    if (!C3356h.m7099e(objM7105k.getClass(), methodM7101f)) {
                                        methodM7101f = null;
                                    }
                                    if (methodM7101f == null) {
                                    }
                                    if (methodM7101f2 == null) {
                                        z13 = false;
                                        z11 = z13;
                                    }
                                }
                            } else {
                                if (!C3356h.m7095a(objM7105k.getClass(), methodM7101f2)) {
                                    methodM7101f2 = null;
                                }
                                if (methodM7101f2 == null) {
                                }
                                methodM7101f = c3356hM7075g.f10823j;
                                if (methodM7101f == null) {
                                }
                            }
                        }
                    } else {
                        z11 = false;
                    }
                    C2014h c2014h = c2027u.f6853f;
                    boolean z15 = c2014h != null ? c2014h.m4972g() : false;
                    C2007a0 c2007a02 = c2027u.f6852e;
                    if (c2007a02 != null) {
                        boolean z16 = c2007a02.f6772o;
                        C3351d0 c3351d0SnsApi2 = WeChatApis.snsApi();
                        if (c3351d0SnsApi2 != null) {
                            C3372x c3372xM7076h = c3351d0SnsApi2.m7076h();
                            if (c3372xM7076h != null) {
                                synchronized (c3372xM7076h) {
                                    try {
                                        ?? r02 = c3372xM7076h.f10892h;
                                        boolean zM7146a = C3372x.m7146a(r02);
                                        ?? r03 = r02;
                                        if (!zM7146a) {
                                            r03 = 0;
                                        }
                                        if (r03 == 0) {
                                            String strM2091g = C0828b.m2091g(c3372xM7076h.f10885a, c3372xM7076h.f10886b);
                                            List listM2090f = C0828b.m2090f(c3372xM7076h.f10889e, strM2091g, c3372xM7076h.f10886b, "native_comment_guards_v2");
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj4 : listM2090f) {
                                                Method method3 = (Method) obj4;
                                                if (C3372x.m7147b(method3) || C3372x.m7148c(method3)) {
                                                    arrayList2.add(obj4);
                                                }
                                            }
                                            HashSet hashSet3 = new HashSet();
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj5 : arrayList2) {
                                                if (hashSet3.add(((Method) obj5).toGenericString())) {
                                                    arrayList3.add(obj5);
                                                }
                                            }
                                            ArrayList arrayList4 = C3372x.m7146a(arrayList3) ? arrayList3 : null;
                                            if (arrayList4 != null) {
                                                c3372xM7076h.f10892h = arrayList4;
                                                r32 = arrayList4;
                                            } else {
                                                Method methodM7151f = c3372xM7076h.m7151f();
                                                if (methodM7151f == null || (declaringClass = methodM7151f.getDeclaringClass()) == null) {
                                                    r03 = C4173t.f13710g;
                                                } else {
                                                    List<Method> listDeclaredMethods = KavaReflector.declaredMethods(declaringClass);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    for (Object obj6 : listDeclaredMethods) {
                                                        Method method4 = (Method) obj6;
                                                        if (C3372x.m7147b(method4) || C3372x.m7148c(method4)) {
                                                            arrayList5.add(obj6);
                                                        }
                                                    }
                                                    HashSet hashSet4 = new HashSet();
                                                    ArrayList arrayList6 = new ArrayList();
                                                    for (Object obj7 : arrayList5) {
                                                        if (hashSet4.add(((Method) obj7).toGenericString())) {
                                                            arrayList6.add(obj7);
                                                        }
                                                    }
                                                    if (C3372x.m7146a(arrayList6)) {
                                                        C0828b.f2478a.m2097j(c3372xM7076h.f10889e, strM2091g, "native_comment_guards_v2", arrayList6);
                                                        c3372xM7076h.f10892h = arrayList6;
                                                        r32 = arrayList6;
                                                    } else {
                                                        SharedPreferences sharedPreferences = c3372xM7076h.f10889e;
                                                        sharedPreferences.getClass();
                                                        try {
                                                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                                                                editorEdit.clear().putString("cache.key", strM2091g);
                                                            }
                                                            editorEdit.remove("native_comment_guards_v2").apply();
                                                            break;
                                                        } catch (Throwable unused) {
                                                        }
                                                        c3372xM7076h.f10888d.invoke("朋友圈评论保护入口不完整: count=" + arrayList6.size());
                                                        r03 = C4173t.f13710g;
                                                        c3372xM7076h.f10892h = r03;
                                                    }
                                                }
                                            }
                                        }
                                        r32 = r03;
                                    } finally {
                                    }
                                }
                            }
                            if (r32 == 0) {
                                r32 = C4173t.f13710g;
                            }
                        }
                        if (r32 == 0) {
                            r32 = C4173t.f13710g;
                        }
                        if (r32.isEmpty()) {
                            c2007a02.f6772o = false;
                            z12 = false;
                        } else if (r32.isEmpty()) {
                            z12 = true;
                            c2007a02.f6772o = z12;
                            if (z12 && !z16) {
                                c2007a02.m4959r(new C2030x(c2007a02, i9));
                            }
                        } else {
                            for (Method method5 : r32) {
                                Set set = c2007a02.f6764g;
                                if (set.add(method5)) {
                                    try {
                                        C3744i c3744i = C3744i.f12154b;
                                        Method methodAccessible = KavaReflector.accessible(method5);
                                        if (methodAccessible == null) {
                                            methodAccessible = method5;
                                        }
                                        c3744i.m7763b(methodAccessible, new C2032z(c2007a02, zM4951h ? 1 : 0));
                                        c3959f2 = Boolean.TRUE;
                                    } catch (Throwable th3) {
                                        c3959f2 = new C3959f(th3);
                                    }
                                    Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                    Object obj8 = c3959f2;
                                    if (thM8182b2 != null) {
                                        set.remove(method5);
                                        c2007a02.f6761d.invoke("安装朋友圈伪评论交互保护失败: " + method5.toGenericString(), thM8182b2);
                                        obj8 = Boolean.FALSE;
                                    }
                                    zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                } else {
                                    zBooleanValue2 = true;
                                }
                                if (!zBooleanValue2) {
                                    z12 = false;
                                    c2007a02.f6772o = z12;
                                    if (z12) {
                                        c2007a02.m4959r(new C2030x(c2007a02, i9));
                                    }
                                }
                            }
                            z12 = true;
                            c2007a02.f6772o = z12;
                            if (z12) {
                            }
                        }
                        boolean z17 = z12;
                        C3351d0 c3351d0SnsApi3 = WeChatApis.snsApi();
                        boolean z18 = C3358j.f10833a.m7111d(c3742g2, c3363o, new C2026t(2, c2027u, AbstractC0921a.m2246i(C2027u.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 0)) && (c3351d0SnsApi3 != null && c3351d0SnsApi3.m7077i()) && z11 && z15;
                        C2007a0 c2007a03 = c2027u.f6852e;
                        if (c2007a03 != null) {
                            boolean z19 = c2007a03.f6771n != z18;
                            c2007a03.f6771n = z18;
                            if (z18 && z19) {
                                c2007a03.m4959r(new C2030x(c2007a03, i9));
                            }
                        }
                        if (z18 && (c2007a0 = c2027u.f6852e) != null) {
                            SharedPreferences sharedPreferences2 = c2007a0.f6762e;
                            boolean z20 = sharedPreferences2.getBoolean("pending_restore_all_v1", false);
                            boolean z21 = z20 || sharedPreferences2.getBoolean("pending_restore_likes_v1", false);
                            boolean z22 = z20 || sharedPreferences2.getBoolean("pending_restore_comments_v1", false);
                            if (z21 || z22) {
                                c2007a0.m4957o(z21, z22, new C0136d0(c2007a0, 21));
                            }
                        }
                        if (z18 && z17) {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 19:
                C2007a0 c2007a04 = (C2007a0) this.f124h;
                String str3 = (String) this.f125i;
                synchronized (c2007a04.f6768k) {
                    C3354f c3354fM4955m = c2007a04.m4955m(str3);
                    Object obj9 = c3354fM4955m.f10806b;
                    if (c3354fM4955m.f10805a && obj9 != null) {
                        C2009c c2009cM815l = c2007a04.f6759b.m815l(str3);
                        zM4951h = c2007a04.m4951h(str3, obj9, c2007a04.m4948d(c2009cM815l), C2007a0.m4944g(c2009cM815l), c2007a04.m4950f(), c2007a04.m4949e());
                        if (zM4951h) {
                            c2007a04.f6759b.m806a(str3, c2009cM815l);
                        }
                    }
                    break;
                }
                if (zM4951h && (activityM4943c = C2007a0.m4943c()) != null) {
                    c2007a04.m4956n(activityM4943c, null);
                }
                return C3967n.f12976a;
            case 20:
                C2195o c2195o = (C2195o) this.f124h;
                C5610h0 c5610h0 = (C5610h0) this.f125i;
                c2195o.f7277C = c2195o.f7281x.mo2612a(c5610h0.f22833g.mo4091a(), c5610h0.getLayoutDirection(), c5610h0);
                return C3967n.f12976a;
            case 21:
                ((C1425u) this.f124h).f4738g = AbstractC5618k.m10152h((C2178i0) this.f125i, AbstractC4441z0.f14750a);
                return C3967n.f12976a;
            case 22:
                return m292e();
            case 23:
                return Boolean.valueOf(C3090c.f9983a.m6571c((C3742g) this.f125i, true, (C1414j) this.f124h));
            case 24:
                C3147k c3147k = (C3147k) this.f124h;
                CharSequence charSequence = (CharSequence) this.f125i;
                c3147k.getClass();
                charSequence.getClass();
                Matcher matcher = c3147k.f10206g.matcher(charSequence);
                matcher.getClass();
                return AbstractC0018a.m238b(matcher, 0, charSequence);
            case 25:
                return m293f();
            case 26:
                C3490k c3490k = (C3490k) this.f124h;
                C3488i c3488i = (C3488i) this.f125i;
                c3490k.getClass();
                try {
                    File file3 = new File(new File(c3490k.m7328n(), "Cache"), "favorite_voice_preview.mp3");
                    c3959f3 = c3490k.m7313E(new File(c3488i.f11325a), file3) ? file3.getAbsolutePath() : null;
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                if (thM8182b3 == null) {
                    obj2 = c3959f3;
                } else {
                    c3490k.f11331b.invoke("收藏语音预览转码失败", thM8182b3);
                }
                return (String) obj2;
            case 27:
                return m294g();
            case 28:
                return new C3866x0((InterfaceC4366f) this.f124h, C4174u.f13711g, (C4364d) this.f125i);
            default:
                C3943c c3943c = (C3943c) this.f124h;
                C3742g c3742g3 = (C3742g) this.f125i;
                synchronized (c3943c) {
                    try {
                        listM8159E = c3943c.m8159E(c3742g3);
                        c3943c.m8166r(c3742g3);
                        c3943c.m8164p(c3742g3);
                        c3943c.m8165q(c3742g3, listM8159E);
                    } catch (Throwable th5) {
                        c3943c.m7750e("防撤回入口Hook安装失败", th5);
                    } finally {
                    }
                    if (!c3943c.f12932j) {
                        ArrayList arrayList7 = new ArrayList(AbstractC4167n.m8429e1(listM8159E));
                        Iterator it2 = listM8159E.iterator();
                        while (it2.hasNext()) {
                            arrayList7.add(((C3941a) it2.next()).f12921a);
                        }
                        Iterator it3 = arrayList7.iterator();
                        boolean z23 = false;
                        while (it3.hasNext()) {
                            C3744i.f12154b.m7763b((Method) it3.next(), new C3942b(c3943c, c3742g3, i9));
                            z23 = true;
                        }
                        c3943c.f12932j = z23;
                        if (listM8159E.isEmpty()) {
                            c3943c.m7750e("防撤回入口未找到", null);
                        }
                    }
                    if (c3943c.f12932j && c3943c.f12933k) {
                        if (!c3943c.f12934l) {
                            if (c3943c.f12935m) {
                                z14 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z14);
        }
    }

    public /* synthetic */ C0035c(Object obj, int i9, Object obj2) {
        this.f123g = i9;
        this.f124h = obj;
        this.f125i = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: fg.p */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0035c(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        this.f123g = 23;
        this.f125i = c3742g;
        this.f124h = (C1414j) interfaceC1235p;
    }
}
