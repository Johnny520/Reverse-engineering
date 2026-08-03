package p144k;

import android.content.Context;
import android.widget.Toast;
import gb.C1382f;
import gb.C1391o;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import p065eb.C0859c0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p100h0.C1538n;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.C3593q;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.C5383up;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import p371yg.C6046b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import wf.InterfaceC5557c;
import wf.InterfaceC5559e;

/* JADX INFO: renamed from: k.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2173g1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7220h = 2;

    /* JADX INFO: renamed from: i */
    public int f7221i;

    /* JADX INFO: renamed from: j */
    public Object f7222j;

    /* JADX INFO: renamed from: k */
    public Object f7223k;

    /* JADX INFO: renamed from: l */
    public Object f7224l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f7225m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f7226n;

    /* JADX INFO: renamed from: o */
    public Object f7227o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f7228p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f7229q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f7230r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2173g1(Context context, C1391o c1391o, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f7223k = context;
        this.f7222j = c1391o;
        this.f7224l = interfaceC1809a1;
        this.f7225m = interfaceC1809a12;
        this.f7226n = interfaceC1809a13;
        this.f7227o = interfaceC1809a14;
        this.f7228p = interfaceC1809a15;
        this.f7229q = interfaceC1809a16;
        this.f7230r = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1, types: [fg.p, yf.i] */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f7220h) {
            case 0:
                C2173g1 c2173g1 = new C2173g1((EnumC2164d1) this.f7229q, (C2176h1) this.f7228p, (AbstractC6044i) this.f7230r, this.f7226n, interfaceC5557c);
                c2173g1.f7225m = obj;
                return c2173g1;
            case 1:
                C2173g1 c2173g12 = new C2173g1((InterfaceC1809a1) this.f7223k, (InterfaceC1809a1) this.f7224l, (Context) this.f7225m, (InterfaceC1809a1) this.f7226n, (InterfaceC1809a1) this.f7227o, (InterfaceC1809a1) this.f7228p, (InterfaceC1809a1) this.f7229q, (InterfaceC1809a1) this.f7230r, interfaceC5557c);
                c2173g12.f7222j = obj;
                return c2173g12;
            default:
                return new C2173g1((Context) this.f7223k, (C1391o) this.f7222j, (InterfaceC1809a1) this.f7224l, (InterfaceC1809a1) this.f7225m, (InterfaceC1809a1) this.f7226n, (InterfaceC1809a1) this.f7227o, (InterfaceC1809a1) this.f7228p, (InterfaceC1809a1) this.f7229q, (InterfaceC1809a1) this.f7230r, interfaceC5557c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f7220h) {
        }
        return ((C2173g1) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:168:0x0128 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:173:0x0156 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x016a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [fg.p] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, sf.n] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C6046b c6046b;
        ?? r02;
        C2170f1 c2170f1;
        C2176h1 c2176h1;
        Object objInvoke;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        ?? r16;
        Object c3959f;
        ?? r162;
        Object objM7570x;
        Object objM7570x2;
        int i9 = this.f7220h;
        ?? r2 = C3967n.f12976a;
        String simpleName = "当前微信账号已被禁止上传在线插件";
        int i10 = 2;
        Object obj2 = this.f7230r;
        Object obj3 = this.f7229q;
        Object obj4 = this.f7228p;
        Object obj5 = this.f7226n;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        InterfaceC5557c interfaceC5557c = null;
        switch (i9) {
            case 0:
                C2176h1 c2176h12 = (C2176h1) obj4;
                int i11 = this.f7221i;
                try {
                    try {
                        if (i11 == 0) {
                            AbstractC1089i.m2732I0(obj);
                            InterfaceC5559e interfaceC5559eMo2062s = ((InterfaceC3599t) this.f7225m).mo4457n().mo2062s(C3593q.f11607h);
                            interfaceC5559eMo2062s.getClass();
                            C2170f1 c2170f12 = new C2170f1((EnumC2164d1) obj3, (InterfaceC3596r0) interfaceC5559eMo2062s);
                            C2176h1.m5406a(c2176h12, c2170f12);
                            C6046b c6046b2 = c2176h12.f7236b;
                            AbstractC6044i abstractC6044i = (AbstractC6044i) obj2;
                            this.f7225m = c2170f12;
                            this.f7223k = c6046b2;
                            this.f7222j = abstractC6044i;
                            this.f7224l = obj5;
                            this.f7227o = c2176h12;
                            this.f7221i = 1;
                            if (c6046b2.m10806d(this) == enumC5799a) {
                                return enumC5799a;
                            }
                            c6046b = c6046b2;
                            r02 = abstractC6044i;
                            c2170f1 = c2170f12;
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                c2176h1 = (C2176h1) this.f7222j;
                                c6046b = (C6046b) this.f7223k;
                                c2170f1 = (C2170f1) this.f7225m;
                                try {
                                    AbstractC1089i.m2732I0(obj);
                                    objInvoke = obj;
                                    atomicReference2 = c2176h1.f7235a;
                                    while (!atomicReference2.compareAndSet(c2170f1, null) && atomicReference2.get() == c2170f1) {
                                    }
                                    c6046b.m10808f(null);
                                    return objInvoke;
                                } catch (Throwable th2) {
                                    th = th2;
                                    atomicReference = c2176h1.f7235a;
                                    while (!atomicReference.compareAndSet(c2170f1, null)) {
                                    }
                                    throw th;
                                }
                            }
                            c2176h12 = (C2176h1) this.f7227o;
                            obj5 = this.f7224l;
                            InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f7222j;
                            C6046b c6046b3 = (C6046b) this.f7223k;
                            C2170f1 c2170f13 = (C2170f1) this.f7225m;
                            AbstractC1089i.m2732I0(obj);
                            c2170f1 = c2170f13;
                            c6046b = c6046b3;
                            r02 = interfaceC1235p;
                        }
                        this.f7225m = c2170f1;
                        this.f7223k = c6046b;
                        this.f7222j = c2176h12;
                        this.f7224l = null;
                        this.f7227o = null;
                        this.f7221i = 2;
                        objInvoke = r02.invoke(obj5, this);
                        if (objInvoke == enumC5799a) {
                            return enumC5799a;
                        }
                        c2176h1 = c2176h12;
                        atomicReference2 = c2176h1.f7235a;
                        while (!atomicReference2.compareAndSet(c2170f1, null)) {
                        }
                        c6046b.m10808f(null);
                        return objInvoke;
                    } catch (Throwable th3) {
                        th = th3;
                        c2176h1 = c2176h12;
                        atomicReference = c2176h1.f7235a;
                        while (!atomicReference.compareAndSet(c2170f1, null) && atomicReference.get() == c2170f1) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    "当前微信账号已被禁止上传在线插件".m10808f(null);
                    throw th4;
                }
            case 1:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f7224l;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f7223k;
                int i12 = this.f7221i;
                try {
                    if (i12 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        interfaceC1809a12.setValue(Boolean.TRUE);
                        interfaceC1809a1.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        Context context = (Context) this.f7225m;
                        C5808e c5808e = AbstractC3553c0.f11555a;
                        ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                        r16 = r2;
                        r2 = 5;
                        try {
                            C1538n c1538n = new C1538n(context, interfaceC5557c, (char) 5);
                            this.f7222j = null;
                            this.f7221i = 1;
                            objM7570x = AbstractC3603v.m7570x(executorC5807d, c1538n, this);
                            r16 = r16;
                            if (objM7570x == enumC5799a) {
                                return enumC5799a;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c3959f = new C3959f(th);
                            r162 = r16;
                        }
                    } else {
                        if (i12 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                        objM7570x = obj;
                        r16 = r2;
                        r2 = r2;
                    }
                    c3959f = (List) objM7570x;
                    r162 = r16;
                    break;
                } catch (Throwable th6) {
                    th = th6;
                    r16 = r2;
                }
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f7227o;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) obj2;
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b == null) {
                    List<C0859c0> list = (List) c3959f;
                    interfaceC1809a13.setValue(list);
                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list));
                    if (iM8438a0 < 16) {
                        iM8438a0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                    for (C0859c0 c0859c0 : list) {
                        String str = c0859c0.f2626a;
                        String str2 = c0859c0.f2633h;
                        if (str2 == null) {
                            str2 = c0859c0.f2627b;
                        }
                        if (AbstractC3149m.m6721t0(str2)) {
                            str2 = c0859c0.f2626a;
                        }
                        linkedHashMap.put(str, str2);
                    }
                    interfaceC1809a14.setValue(linkedHashMap);
                    int iM8438a02 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a02 >= 16 ? iM8438a02 : 16);
                    for (C0859c0 c0859c02 : list) {
                        String str3 = c0859c02.f2626a;
                        String str4 = (String) ((Map) interfaceC1809a15.getValue()).get(c0859c02.f2626a);
                        if (str4 == null) {
                            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        linkedHashMap2.put(str3, str4);
                    }
                    interfaceC1809a15.setValue(linkedHashMap2);
                    Map map = (Map) interfaceC1809a16.getValue();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        String str5 = (String) entry.getKey();
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                                if (((C0859c0) it.next()).f2626a.equals(str5)) {
                                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                                }
                                break;
                            }
                        }
                    }
                    interfaceC1809a16.setValue(linkedHashMap3);
                    Set set = (Set) interfaceC1809a17.getValue();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(((C0859c0) it2.next()).f2626a);
                    }
                    interfaceC1809a17.setValue(AbstractC4166m.m8426x1(set, linkedHashSet));
                } else {
                    if (!(thM8182b instanceof C1382f) || !AbstractC1416l.m3825a(((C1382f) thM8182b).f4589g, "UPLOADER_BLACKLISTED")) {
                        String message = thM8182b.getMessage();
                        String string = message != null ? AbstractC3149m.m6703R0(message).toString() : null;
                        simpleName = (string == null || AbstractC3149m.m6721t0(string)) ? null : string;
                        if (simpleName == null) {
                            simpleName = thM8182b.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a1.setValue(simpleName);
                }
                interfaceC1809a12.setValue(Boolean.FALSE);
                return r162;
            default:
                C1391o c1391o = (C1391o) this.f7222j;
                Context context2 = (Context) this.f7223k;
                int i13 = this.f7221i;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e2 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d2 = ExecutorC5807d.f23583i;
                    C5383up c5383up = new C5383up(context2, c1391o, interfaceC5557c, i10);
                    this.f7221i = 1;
                    objM7570x2 = AbstractC3603v.m7570x(executorC5807d2, c5383up, this);
                    if (objM7570x2 == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i13 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x2 = obj;
                }
                Object obj6 = ((C3960g) objM7570x2).f12964g;
                ((InterfaceC1809a1) this.f7224l).setValue(null);
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f7225m;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f7227o;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) obj2;
                Throwable thM8182b2 = C3960g.m8182b(obj6);
                if (thM8182b2 != null) {
                    if (!(thM8182b2 instanceof C1382f) || !AbstractC1416l.m3825a(((C1382f) thM8182b2).f4589g, "UPLOADER_BLACKLISTED")) {
                        String message2 = thM8182b2.getMessage();
                        String string2 = message2 != null ? AbstractC3149m.m6703R0(message2).toString() : null;
                        simpleName = (string2 == null || AbstractC3149m.m6721t0(string2)) ? null : string2;
                        if (simpleName == null) {
                            simpleName = thM8182b2.getClass().getSimpleName();
                        }
                    }
                    Toast.makeText(context2, "删除失败: ".concat(simpleName), 1).show();
                    return r2;
                }
                interfaceC1809a18.setValue(null);
                interfaceC1809a19.setValue(null);
                interfaceC1809a110.setValue(C4173t.f13710g);
                List list2 = (List) interfaceC1809a111.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list2) {
                    if (!((C1391o) obj7).f4617a.equals(c1391o.f4617a)) {
                        arrayList.add(obj7);
                    }
                }
                interfaceC1809a111.setValue(arrayList);
                int iIntValue = ((Number) interfaceC1809a112.getValue()).intValue() - 1;
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                interfaceC1809a112.setValue(Integer.valueOf(iIntValue));
                AbstractC3199a.m6848u((Number) interfaceC1809a113.getValue(), 1, interfaceC1809a113);
                Toast.makeText(context2, "线上插件已删除，本地插件不受影响", 0).show();
                return r2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2173g1(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f7223k = interfaceC1809a1;
        this.f7224l = interfaceC1809a12;
        this.f7225m = context;
        this.f7226n = interfaceC1809a13;
        this.f7227o = interfaceC1809a14;
        this.f7228p = interfaceC1809a15;
        this.f7229q = interfaceC1809a16;
        this.f7230r = interfaceC1809a17;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: fg.p */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2173g1(EnumC2164d1 enumC2164d1, C2176h1 c2176h1, InterfaceC1235p interfaceC1235p, Object obj, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f7229q = enumC2164d1;
        this.f7228p = c2176h1;
        this.f7230r = (AbstractC6044i) interfaceC1235p;
        this.f7226n = obj;
    }
}
