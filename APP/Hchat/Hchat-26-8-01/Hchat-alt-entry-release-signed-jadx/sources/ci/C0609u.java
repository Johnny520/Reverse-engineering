package ci;

import android.content.Context;
import gg.AbstractC1416l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p070f0.C0978j;
import p077f8.AbstractC1089i;
import p080fb.C1165q1;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p129ig.AbstractC2043a;
import p190n2.C2884s;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p322w0.C4665p;
import p332wb.AbstractC4955ho;
import p332wb.C5144nh;
import p332wb.EnumC5358u0;
import p345x8.AbstractC5731x;
import p345x8.C5724q;
import p348xb.C5756b;
import p348xb.C5763i;
import p370yf.AbstractC6044i;
import tf.AbstractC4166m;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609u extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1913h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f1914i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1915j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0609u(Object obj, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1913h = i9;
        this.f1914i = obj;
        this.f1915j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1913h) {
            case 0:
                return new C0609u((C4665p) this.f1914i, (C4665p) this.f1915j, interfaceC5557c, 0);
            case 1:
                C0609u c0609u = new C0609u((C0978j) this.f1915j, interfaceC5557c, 1);
                c0609u.f1914i = obj;
                return c0609u;
            case 2:
                return new C0609u((String) this.f1914i, (String) this.f1915j, interfaceC5557c, 2);
            case 3:
                C0609u c0609u2 = new C0609u((String) this.f1915j, interfaceC5557c, 3);
                c0609u2.f1914i = obj;
                return c0609u2;
            case 4:
                return new C0609u((Context) this.f1914i, (InterfaceC1809a1) this.f1915j, interfaceC5557c, 4);
            case 5:
                return new C0609u((String) this.f1914i, (InterfaceC1809a1) this.f1915j, interfaceC5557c, 5);
            case 6:
                return new C0609u((Context) this.f1914i, (C1165q1) this.f1915j, interfaceC5557c, 6);
            default:
                C0609u c0609u3 = new C0609u((C5763i) this.f1915j, interfaceC5557c, 7);
                c0609u3.f1914i = obj;
                return c0609u3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f1913h) {
            case 0:
                C0609u c0609u = (C0609u) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c0609u.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                return ((C0609u) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 2:
                return ((C0609u) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 3:
                return ((C0609u) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 4:
                C0609u c0609u2 = (C0609u) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c0609u2.invokeSuspend(c3967n2);
                return c3967n2;
            case 5:
                C0609u c0609u3 = (C0609u) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c0609u3.invokeSuspend(c3967n3);
                return c3967n3;
            case 6:
                return ((C0609u) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            default:
                C0609u c0609u4 = (C0609u) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n4 = C3967n.f12976a;
                c0609u4.invokeSuspend(c3967n4);
                return c3967n4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        List listM8407P1;
        Object c3959f;
        Object c3959f2;
        int i9 = this.f1913h;
        boolean z9 = true;
        char c10 = 1;
        C3967n c3967n = C3967n.f12976a;
        int i10 = 3;
        InterfaceC5557c interfaceC5557c = null;
        Object obj2 = this.f1915j;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                if (((C4665p) this.f1914i).isEmpty() && ((C4665p) obj2).isEmpty()) {
                    C0571a c0571a = AbstractC0612x.f1922a;
                }
                return c3967n;
            case 1:
                AbstractC1089i.m2732I0(obj);
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1914i;
                C0978j c0978j = (C0978j) obj2;
                InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) c0978j.f3089b.getAndSet(null);
                AtomicReference atomicReference = c0978j.f3089b;
                C3560e1 c3560e1M7563q = AbstractC3603v.m7563q(interfaceC3599t, null, new C0589j(interfaceC3596r0, c0978j, interfaceC5557c, i10), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, c3560e1M7563q)) {
                        if (atomicReference.get() != null) {
                            z9 = false;
                        }
                    }
                }
                return Boolean.valueOf(z9);
            case 2:
                AbstractC1089i.m2732I0(obj);
                ExecutorService executorService = C5724q.f23297a;
                String str = (String) this.f1914i;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                String strM6706U0 = AbstractC3149m.m6706U0(AbstractC3149m.m6703R0(str).toString(), '/');
                boolean zM6721t0 = AbstractC3149m.m6721t0(strM6706U0);
                C4173t c4173t = C4173t.f13710g;
                if (zM6721t0) {
                    listM8407P1 = c4173t;
                } else {
                    if (AbstractC3156t.m6733W(strM6706U0, "/chat/completions", false)) {
                        strM6706U0 = AbstractC3149m.m6687B0(strM6706U0, "/chat/completions").concat("/models");
                    } else if (!AbstractC3156t.m6733W(strM6706U0, "/models", false)) {
                        strM6706U0 = strM6706U0.concat("/models");
                    }
                    listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC0000a.m101y0(strM6706U0, AbstractC3149m.m6687B0(AbstractC3149m.m6687B0(strM6706U0, "/models"), "/v1").concat("/v1/models"))));
                }
                Iterator it = listM8407P1.iterator();
                while (it.hasNext()) {
                    try {
                        Request.Builder builderAddHeader = new Request.Builder().url((String) it.next()).addHeader("Content-Type", "application/json");
                        if (!AbstractC3149m.m6721t0(str2)) {
                            builderAddHeader.addHeader("Authorization", "Bearer " + str2);
                        }
                        Response responseExecute = C5724q.f23299c.newCall(builderAddHeader.get().build()).execute();
                        try {
                            ResponseBody responseBodyBody = responseExecute.body();
                            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                            if (strString == null) {
                                strString = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            c3959f = (!responseExecute.isSuccessful() || AbstractC3149m.m6721t0(strString)) ? c4173t : C5724q.m10378x(strString);
                            responseExecute.close();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC2043a.m5035i(responseExecute, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        c3959f = new C3959f(th4);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        AbstractC0921a.m2261x("[Hchat:AutoReply] 拉取模型列表失败: ", thM8182b.getMessage(), thM8182b);
                        c3959f = c4173t;
                    }
                    List list = (List) c3959f;
                    if (!list.isEmpty()) {
                        return list;
                    }
                }
                return c4173t;
            case 3:
                AbstractC1089i.m2732I0(obj);
                try {
                    c3959f2 = AbstractC5731x.m10403d((String) obj2);
                    break;
                } catch (Throwable th5) {
                    c3959f2 = new C3959f(th5);
                }
                return new C3960g(c3959f2);
            case 4:
                AbstractC1089i.m2732I0(obj);
                AbstractC4955ho.m9501a6(EnumC5358u0.f20978g, false, new C5144nh((InterfaceC1809a1) obj2, 15));
                return c3967n;
            case 5:
                AbstractC1089i.m2732I0(obj);
                String str3 = (String) this.f1914i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj2;
                C3147k c3147k = AbstractC4955ho.f17686a;
                if (!AbstractC1416l.m3825a(str3, ((C2884s) interfaceC1809a1.getValue()).f9316a.f6529h)) {
                    int length = str3.length();
                    interfaceC1809a1.setValue(new C2884s(4, str3, AbstractC1923e0.m4784b(length, length)));
                }
                return c3967n;
            case 6:
                AbstractC1089i.m2732I0(obj);
                Serializable serializableM7884c0 = AbstractC3754e0.m7884c0((Context) this.f1914i, ((C1165q1) obj2).f3889p);
                if (serializableM7884c0 instanceof C3959f) {
                    return null;
                }
                return serializableM7884c0;
            default:
                InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f1914i;
                AbstractC1089i.m2732I0(obj);
                C5763i c5763i = (C5763i) obj2;
                AbstractC3603v.m7563q(interfaceC3599t2, null, new C5756b(c5763i, interfaceC5557c, c10 == true ? 1 : 0), 3);
                AbstractC3603v.m7563q(interfaceC3599t2, null, new C5756b(c5763i, interfaceC5557c, 2), 3);
                AbstractC3603v.m7563q(interfaceC3599t2, null, new C5756b(c5763i, interfaceC5557c, i10), 3);
                return c3967n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0609u(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1913h = i9;
        this.f1915j = obj;
    }
}
