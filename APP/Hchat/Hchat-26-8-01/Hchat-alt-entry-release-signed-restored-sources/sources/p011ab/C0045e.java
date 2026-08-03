package p011ab;

import ac.AbstractC0063p;
import ac.C0058k;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import be.C0289k;
import gg.AbstractC1416l;
import gg.C1423s;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p028c1.C0372b;
import p036c9.AbstractC0473o2;
import p036c9.C0414a;
import p036c9.C0418b;
import p036c9.C0429d2;
import p036c9.C0430e;
import p036c9.C0446i;
import p036c9.C0452j1;
import p036c9.EnumC0432e1;
import p049d9.C0745f;
import p051db.C0765c;
import p057e1.C0808c;
import p068eh.AbstractC0921a;
import p069f.C0965w;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p092g4.AbstractC1341a;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p117i0.AbstractC1887v0;
import p117i0.C1836h0;
import p117i0.C1892x;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p136j8.C2104o;
import p154k9.C2366j;
import p159l0.C2420b;
import p159l0.C2425g;
import p159l0.C2429k;
import p172lg.C2564d;
import p174m.AbstractC2622l;
import p174m.C2581c;
import p174m.C2605g3;
import p174m.C2610i;
import p174m.C2618k;
import p174m.InterfaceC2596f;
import p175m0.C2682a;
import p175m0.C2684b;
import p175m0.InterfaceC2703k0;
import p197n9.C2912a;
import p201o.AbstractC3026b;
import p218og.AbstractC3149m;
import p251r.C3619d;
import p251r.C3623h;
import p251r.C3626k;
import p251r.C3641z;
import p261rb.C3797m;
import p265s.C3831g0;
import p266s0.AbstractC3872b;
import p266s0.C3871a;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p277t.C4076h;
import p293u2.C4242l;
import p300ub.AbstractC4302b;
import p315v8.C4528h;
import p315v8.C4537q;
import p332wb.AbstractC4955ho;
import p332wb.C4737b3;
import p332wb.C4759bp;
import p332wb.C5099m5;
import p332wb.C5227q1;
import p332wb.C5259r0;
import p332wb.C5292s0;
import p332wb.C5330t5;
import p332wb.C5391v0;
import p338x0.C5571a;
import p338x0.C5572b;
import p339x1.AbstractC5614i1;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: ab.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0045e implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f148g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f149h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f150i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f151j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0045e(C1836h0 c1836h0, C2682a c2682a, C2425g c2425g, AbstractC1887v0 abstractC1887v0) {
        this.f148g = 8;
        this.f149h = c1836h0;
        this.f150i = c2682a;
        this.f151j = c2425g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0451, code lost:
    
        if (r5.f8521z == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0453, code lost:
    
        r6 = (p057e1.C0808c) r5.f8519x.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x045c, code lost:
    
        if (r6 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0467, code lost:
    
        if (p174m.C2618k.m6072m1(r5, r6, 0, 0, 3) != true) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x046a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x046b, code lost:
    
        if (r2 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x046d, code lost:
    
        r5.f8521z = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x046f, code lost:
    
        r0.f8445e = p174m.C2618k.m6071k1(r5, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0478, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0652 A[PHI: r2
  0x0652: PHI (r2v10 java.lang.Object) = (r2v4 java.lang.Object), (r2v8 java.lang.Object) binds: [B:235:0x0650, B:251:0x0682] A[DONT_GENERATE, DONT_INLINE]] */
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
        CharSequence text;
        Object c3959f;
        int i9;
        Object objM404N;
        int i10 = 2;
        boolean z9 = true;
        boolean zM320a = false;
        Object obj = null;
        Object obj2 = null;
        String str = null;
        obj = null;
        obj = null;
        switch (this.f148g) {
            case 0:
                C0046f c0046f = (C0046f) this.f149h;
                TextView textView = (TextView) this.f150i;
                WeakReference weakReference = (WeakReference) this.f151j;
                if (AbstractC4302b.m8640c(c0046f.f152a.f12143a, "Hchat_quote_delete_clear_config").getBoolean("quote_delete_clear_enable", false) && ((text = textView.getText()) == null || text.length() == 0)) {
                    Object obj3 = weakReference.get();
                    if (obj3 == null) {
                        Object objM316c = C0046f.m316c(textView);
                        if (objM316c == null) {
                            objM316c = c0046f.f156e.get();
                            if (objM316c == null || !(objM316c instanceof View) || !((View) objM316c).isAttachedToWindow() || !C0046f.m317g(objM316c)) {
                                objM316c = null;
                            }
                            if (objM316c != null && (objM316c instanceof View) && ((View) objM316c).getRootView() == textView.getRootView()) {
                                obj = objM316c;
                            }
                            if (obj != null) {
                                obj3 = obj;
                                zM320a = c0046f.m320a(obj3);
                            }
                        }
                    } else {
                        if (!(obj3 instanceof View) || !((View) obj3).isAttachedToWindow() || !C0046f.m317g(obj3)) {
                            obj3 = null;
                        }
                        if (obj3 != null) {
                            zM320a = c0046f.m320a(obj3);
                        }
                    }
                }
                return Boolean.valueOf(zM320a);
            case 1:
                Activity activity = (Activity) this.f149h;
                String str2 = (String) this.f150i;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f151j;
                C0452j1 c0452j1 = C0452j1.f1326a;
                C0452j1.m1459v(activity, str2, interfaceC1220a);
                return C3967n.f12976a;
            case 2:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f149h;
                Activity activity2 = (Activity) this.f150i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f151j;
                if (((Set) interfaceC1809a1.getValue()).isEmpty()) {
                    C0452j1.m1455p(activity2, "请至少选择一个分组");
                } else {
                    interfaceC1809a12.setValue(EnumC0432e1.f1273l);
                }
                return C3967n.f12976a;
            case 3:
                Activity activity3 = (Activity) this.f149h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f150i;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f151j;
                activity3.getClass();
                synchronized (AbstractC0473o2.f1396a) {
                    String strM1477a = AbstractC0473o2.m1477a();
                    if (!AbstractC3149m.m6721t0(strM1477a)) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("format", "HchatConversationGroups");
                            jSONObject.put("schema", "HchatConversationGroups");
                            jSONObject.put("version", 1);
                            jSONObject.put("exportedAt", System.currentTimeMillis());
                            jSONObject.put("groups", AbstractC0473o2.m1483g(AbstractC0473o2.m1486j(activity3, strM1477a)));
                            c3959f = jSONObject.toString(2);
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b == null) {
                            obj2 = c3959f;
                        } else {
                            AbstractC1184v0.m3204n("[Hchat:ConversationGroup] 导出当前账号的聊天分组失败: " + thM8182b.getMessage(), thM8182b);
                        }
                        str = (String) obj2;
                    }
                    break;
                }
                if (str == null) {
                    C0452j1.m1455p(activity3, "导出聊天分组失败");
                } else {
                    interfaceC1220a2.invoke();
                    C0430e c0430e = C0430e.f1252a;
                    C0446i c0446i = new C0446i(interfaceC1220a3, 3, activity3);
                    String strM2251n = AbstractC0921a.m2251n("Hchat_chat_groups_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()), ".json");
                    C0418b c0418b = new C0418b(str);
                    Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("application/json");
                    intent.putExtra("android.intent.extra.TITLE", strM2251n);
                    intent.addFlags(2);
                    C0430e.m1448b(activity3, intent);
                    c0430e.m1450a(activity3, c0418b, intent, c0446i, null);
                }
                return C3967n.f12976a;
            case 4:
                Activity activity4 = (Activity) this.f149h;
                Object obj4 = this.f150i;
                Context context = (Context) this.f151j;
                C0429d2.m1445y(activity4);
                C0429d2 c0429d2 = C0429d2.f1235a;
                C0429d2.m1443w(obj4, context);
                return C3967n.f12976a;
            case 5:
                return ScriptPluginBridge.applyModuleFloatingGlassBar$lambda$1$0((AtomicReference) this.f149h, (ScriptPluginBridge) this.f150i, (String) this.f151j);
            case 6:
                return ScriptWaBridge.downloadImages$lambda$0((Consumer) this.f149h, (ScriptWaBridge) this.f150i, (List) this.f151j);
            case 7:
                return ScriptWaBridge.downloadImage$lambda$0((Consumer) this.f149h, (ScriptWaBridge) this.f150i, (String) this.f151j);
            case 8:
                C1836h0 c1836h0 = (C1836h0) this.f149h;
                C2682a c2682a = (C2682a) this.f150i;
                C2425g c2425g = (C2425g) this.f151j;
                C2684b c2684b = c1836h0.f6088M;
                C2682a c2682a2 = c2684b.f8742b;
                try {
                    c2684b.f8742b = c2682a;
                    C2425g c2425g2 = c1836h0.f6082G;
                    int[] iArr = c1836h0.f6111o;
                    C0965w c0965w = c1836h0.f6118v;
                    c1836h0.f6111o = null;
                    c1836h0.f6118v = null;
                    try {
                        c1836h0.f6082G = c2425g;
                        boolean z10 = c2684b.f8745e;
                        try {
                            c2684b.f8745e = false;
                            throw null;
                        } catch (Throwable th3) {
                            c2684b.f8745e = z10;
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        c1836h0.f6082G = c2425g2;
                        c1836h0.f6111o = iArr;
                        c1836h0.f6118v = c0965w;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    c2684b.f8742b = c2682a2;
                    throw th5;
                }
            case 9:
                C2618k c2618k = (C2618k) this.f149h;
                C2605g3 c2605g3 = (C2605g3) this.f150i;
                InterfaceC2596f interfaceC2596f = (InterfaceC2596f) this.f151j;
                C3967n c3967n = C3967n.f12976a;
                C2581c c2581c = c2618k.f8520y;
                while (true) {
                    C2046b c2046b = c2581c.f8371a;
                    int i11 = c2046b.f6893i;
                    if (i11 != 0) {
                        if (i11 == 0) {
                            C2104o.m5287l("MutableVector is empty.");
                            return null;
                        }
                        C0808c c0808c = (C0808c) ((C2610i) c2046b.f6891g[i11 - 1]).f8467a.invoke();
                        if (c0808c == null ? true : C2618k.m6072m1(c2618k, c0808c, 0L, 0L, 3)) {
                            C2046b c2046b2 = c2581c.f8371a;
                            ((C2610i) c2046b2.m5065k(c2046b2.f6893i - 1)).f8468b.resumeWith(c3967n);
                        }
                    }
                    break;
                }
                break;
            case 10:
                C2420b c2420b = (C2420b) this.f149h;
                C2429k c2429k = (C2429k) this.f150i;
                InterfaceC2703k0 interfaceC2703k0 = (InterfaceC2703k0) this.f151j;
                if (c2420b != null) {
                    c2429k.m5816a(c2429k.m5818c(c2420b) - c2429k.f7982t);
                }
                List listM3592h = AbstractC1341a.m3592h(c2429k, null, c2429k.f7982t, null);
                C5572b c5572b = (C5572b) AbstractC4166m.m8394C1(listM3592h);
                Integer num = c5572b != null ? c5572b.f22699b : null;
                List listMo628f = interfaceC2703k0.mo628f(num);
                if (num != null && !listMo628f.isEmpty()) {
                    listMo628f = AbstractC4166m.m8397F1(AbstractC0000a.m99x0(new C5572b(((C5572b) AbstractC4166m.m8422t1(listMo628f)).f22698a, null, num)), AbstractC4166m.m8419q1(1, listMo628f));
                }
                return new C5571a(AbstractC4166m.m8397F1(listM3592h, listMo628f), interfaceC2703k0.mo632j());
            case 11:
                C1892x c1892x = (C1892x) this.f149h;
                C3641z c3641z = (C3641z) this.f150i;
                C3619d c3619d = (C3619d) this.f151j;
                C3623h c3623h = (C3623h) c1892x.getValue();
                return new C3626k(c3641z, c3623h, c3619d, new C0058k((C2564d) ((C3831g0) c3641z.f11801e.f338e).getValue(), c3623h));
            case 12:
                AbstractC3872b abstractC3872b = (AbstractC3872b) this.f149h;
                C0289k c0289k = (C0289k) this.f150i;
                C1423s c1423s = (C1423s) this.f151j;
                abstractC3872b.mo4452a();
                C3871a c3871a = (C3871a) c0289k.f840c;
                int i12 = c1423s.f4736g;
                do {
                    i9 = c3871a.get();
                } while (!c3871a.compareAndSet(i9, ((i9 >>> 27) & 15) == i12 ? i9 - 1 : i9));
                return C3967n.f12976a;
            case 13:
                C4076h c4076h = (C4076h) this.f149h;
                C0808c c0808cM8262k1 = C4076h.m8262k1(c4076h, (AbstractC5614i1) this.f150i, (C0372b) this.f151j);
                if (c0808cM8262k1 == null) {
                    return null;
                }
                C2618k c2618k2 = c4076h.f13513u;
                if (C4242l.m8534a(c2618k2.f8514A, AbstractC2622l.f8533a)) {
                    AbstractC3026b.m6430c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c0808cM8262k1.m2053i(c2618k2.m6075o1(c0808cM8262k1, c2618k2.m6073l1(), 0L) ^ (-9223372034707292160L));
            case 14:
                C4528h c4528h = (C4528h) this.f149h;
                String str3 = (String) this.f150i;
                C4537q c4537q = (C4537q) this.f151j;
                c4528h.f14956q = false;
                c4528h.f14957r = true;
                c4528h.f14958s = str3;
                c4537q.m8960k(c4528h);
                return C3967n.f12976a;
            case 15:
                C0414a c0414a = (C0414a) this.f149h;
                Context context2 = (Context) this.f150i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f151j;
                if (AbstractC3149m.m6721t0(c0414a.f1180b)) {
                    Toast.makeText(context2, "请输入分组名称", 0).show();
                } else {
                    interfaceC1231l.invoke(c0414a);
                }
                return C3967n.f12976a;
            case 16:
                ArrayList arrayList = (ArrayList) this.f149h;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f150i;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f151j;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    if (((Set) interfaceC1809a13.getValue()).contains(((C5099m5) obj5).f18836a.f20550a)) {
                        arrayList2.add(obj5);
                    }
                }
                interfaceC1231l2.invoke(arrayList2);
                return C3967n.f12976a;
            case 17:
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f149h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f150i;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f151j;
                if (((C5292s0) interfaceC1809a14.getValue()) == null) {
                    interfaceC1220a4.invoke();
                } else {
                    interfaceC1809a14.setValue(null);
                    interfaceC1809a15.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 18:
                C2912a c2912a = (C2912a) this.f149h;
                Context context3 = (Context) this.f150i;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f151j;
                if (AbstractC3149m.m6721t0(c2912a.f9410b)) {
                    Toast.makeText(context3, "请输入标签名称", 0).show();
                } else {
                    interfaceC1231l3.invoke(c2912a);
                }
                return C3967n.f12976a;
            case 19:
                Activity activity5 = (Activity) this.f149h;
                Context context4 = (Context) this.f150i;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f151j;
                if (activity5 != null) {
                    C5259r0 c5259r0 = C5259r0.f20316a;
                    synchronized (c5259r0) {
                        interfaceC1220a5.getClass();
                        C5259r0.f20318c = interfaceC1220a5;
                        C5259r0.f20319d = activity5;
                        c5259r0.m9740a(activity5.getClass());
                        c5259r0.m9740a(Activity.class);
                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent2.addCategory("android.intent.category.OPENABLE");
                        intent2.setType("*/*");
                        intent2.addFlags(1);
                        AbstractC4955ho.m9299B4(activity5, intent2);
                        try {
                            activity5.startActivityForResult(intent2, 1212371545);
                        } catch (Throwable unused) {
                            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                            intent3.addCategory("android.intent.category.OPENABLE");
                            intent3.setType("*/*");
                            intent3.addFlags(1);
                            activity5.startActivityForResult(Intent.createChooser(intent3, "选择 Hchat 配置文件"), 1212371545);
                        }
                        break;
                    }
                } else {
                    Toast.makeText(context4, "当前页面无法打开文件管理器", 0).show();
                }
                return C3967n.f12976a;
            case 20:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f149h;
                String str4 = (String) this.f150i;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f151j;
                interfaceC1809a16.setValue(Boolean.valueOf(true ^ ((Boolean) interfaceC1809a16.getValue()).booleanValue()));
                sharedPreferences.edit().putBoolean(str4, ((Boolean) interfaceC1809a16.getValue()).booleanValue()).apply();
                return C3967n.f12976a;
            case 21:
                C5391v0 c5391v0 = (C5391v0) this.f149h;
                C5292s0 c5292s0 = (C5292s0) this.f150i;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f151j;
                if (c5391v0.f21260c) {
                    Set set = (Set) interfaceC1809a17.getValue();
                    String str5 = c5292s0.f20550a;
                    objM404N = set.contains(str5) ? AbstractC4156d0.m8351S((Set) interfaceC1809a17.getValue(), str5) : AbstractC4156d0.m8354V((Set) interfaceC1809a17.getValue(), str5);
                } else {
                    objM404N = AbstractC0063p.m404N(c5292s0.f20550a);
                }
                interfaceC1809a17.setValue(objM404N);
                return C3967n.f12976a;
            case 22:
                Context context5 = (Context) this.f149h;
                C5292s0 c5292s02 = (C5292s0) this.f150i;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f151j;
                Activity activity6 = context5 instanceof Activity ? (Activity) context5 : null;
                if (activity6 == null) {
                    Toast.makeText(context5, "当前页面无法打开图片选择器", 0).show();
                } else {
                    String str6 = c5292s02.f20550a;
                    C5227q1 c5227q1 = new C5227q1(context5, interfaceC1809a18, i10);
                    C0745f c0745f = C0745f.f2216a;
                    str6.getClass();
                    C0745f.f2216a.m1935b(activity6, c5227q1, str6, true);
                }
                return C3967n.f12976a;
            case 23:
                Context context6 = (Context) this.f149h;
                String str7 = (String) this.f150i;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f151j;
                Object systemService = context6.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("HchatScriptDir", str7));
                }
                Toast.makeText(context6, "已复制", 0).show();
                interfaceC1220a6.invoke();
                return C3967n.f12976a;
            case 24:
                C4737b3 c4737b3 = (C4737b3) this.f149h;
                String str8 = (String) this.f150i;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f151j;
                interfaceC1809a19.setValue(c4737b3.f15965d ? ((Set) interfaceC1809a19.getValue()).contains(str8) ? AbstractC4156d0.m8351S((Set) interfaceC1809a19.getValue(), str8) : AbstractC4156d0.m8354V((Set) interfaceC1809a19.getValue(), str8) : AbstractC0063p.m404N(str8));
                return C3967n.f12976a;
            case 25:
                Context context7 = (Context) this.f149h;
                C2366j c2366j = (C2366j) this.f150i;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f151j;
                AbstractC2043a.m5039m(context7, c2366j.f7776e);
                AbstractC2043a.m5039m(context7, c2366j.f7777f);
                List list = (List) interfaceC1809a110.getValue();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list) {
                    if (!AbstractC1416l.m3825a(((C2366j) obj6).f7772a, c2366j.f7772a)) {
                        arrayList3.add(obj6);
                    }
                }
                AbstractC4955ho.m9455V0(context7, interfaceC1809a110, arrayList3);
                return C3967n.f12976a;
            case 26:
                C5330t5 c5330t5 = (C5330t5) this.f149h;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f150i;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f151j;
                interfaceC1809a111.setValue(c5330t5);
                interfaceC1809a112.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return C3967n.f12976a;
            case 27:
                ((InterfaceC1231l) this.f149h).invoke(AbstractC4955ho.m9628o7((C0765c) this.f150i, ((Integer) this.f151j).intValue(), C4173t.f13710g));
                return C3967n.f12976a;
            case 28:
                C4759bp c4759bp = (C4759bp) this.f149h;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f150i;
                ((InterfaceC1809a1) this.f151j).setValue(Integer.valueOf(c4759bp.f16109b));
                interfaceC1231l4.invoke(c4759bp);
                return C3967n.f12976a;
            default:
                Context context8 = (Context) this.f149h;
                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) this.f150i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f151j;
                if (((C3797m) interfaceC1809a113.getValue()).f12467b || ((C3797m) interfaceC1809a113.getValue()).f12474i) {
                    Toast.makeText(context8, "请先停止当前任务", 0).show();
                } else {
                    interfaceC1220a7.invoke();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C0045e(Object obj, Object obj2, Object obj3, int i9) {
        this.f148g = i9;
        this.f149h = obj;
        this.f150i = obj2;
        this.f151j = obj3;
    }
}
