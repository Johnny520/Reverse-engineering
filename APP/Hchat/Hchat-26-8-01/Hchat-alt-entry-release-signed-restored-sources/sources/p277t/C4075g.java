package p277t;

import android.content.Context;
import ci.C0589j;
import gb.AbstractC1378b;
import gb.AbstractC1387k;
import gb.AbstractC1393q;
import gb.C1382f;
import gb.C1389m;
import gb.C1394r;
import gg.AbstractC1416l;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p011ab.C0045e;
import p027c0.C0368m;
import p028c1.C0372b;
import p036c9.C0479q0;
import p065eb.C0859c0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p332wb.C4804d4;
import p332wb.C5071la;
import p332wb.C5391v0;
import p332wb.EnumC5358u0;
import p339x1.AbstractC5614i1;
import p345x8.AbstractC5731x;
import p370yf.AbstractC6044i;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: t.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4075g extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13507h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f13508i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13509j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13510k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f13511l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f13512m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4075g(Context context, Object obj, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f13507h = i9;
        this.f13508i = context;
        this.f13509j = obj;
        this.f13510k = interfaceC1809a1;
        this.f13511l = interfaceC1809a12;
        this.f13512m = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f13507h) {
            case 0:
                C4075g c4075g = new C4075g((C4076h) this.f13509j, (AbstractC5614i1) this.f13510k, (C0372b) this.f13511l, (C0045e) this.f13512m, interfaceC5557c, 0);
                c4075g.f13508i = obj;
                return c4075g;
            case 1:
                C4075g c4075g2 = new C4075g((String) this.f13509j, (InterfaceC1809a1) this.f13510k, (InterfaceC1809a1) this.f13511l, (InterfaceC1809a1) this.f13512m, interfaceC5557c, 1);
                c4075g2.f13508i = obj;
                return c4075g2;
            case 2:
                return new C4075g((Context) this.f13508i, (C5391v0) this.f13509j, (InterfaceC1809a1) this.f13510k, (InterfaceC1809a1) this.f13511l, (InterfaceC1809a1) this.f13512m, interfaceC5557c, 2);
            case 3:
                return new C4075g((Context) this.f13508i, (C4804d4) this.f13509j, (InterfaceC1809a1) this.f13510k, (InterfaceC1809a1) this.f13511l, (InterfaceC1809a1) this.f13512m, interfaceC5557c, 3);
            default:
                return new C4075g((Context) this.f13508i, (C0859c0) this.f13509j, (InterfaceC1809a1) this.f13510k, (InterfaceC1809a1) this.f13511l, (InterfaceC1809a1) this.f13512m, interfaceC5557c, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f13507h) {
            case 0:
                return ((C4075g) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C4075g) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 2:
                C4075g c4075g = (C4075g) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c4075g.invokeSuspend(c3967n);
                return c3967n;
            case 3:
                C4075g c4075g2 = (C4075g) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c4075g2.invokeSuspend(c3967n2);
                return c3967n2;
            default:
                return ((C4075g) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        Object c3959f2;
        C1389m c1389m;
        int i9 = this.f13507h;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f13512m;
        Object obj3 = this.f13511l;
        Object obj4 = this.f13510k;
        Object obj5 = this.f13509j;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f13508i;
                C4076h c4076h = (C4076h) obj5;
                AbstractC3603v.m7563q(interfaceC3599t, null, new C0368m(c4076h, (AbstractC5614i1) obj4, (C0372b) obj3, null, 16), 3);
                return AbstractC3603v.m7563q(interfaceC3599t, null, new C0589j(c4076h, (C0045e) obj2, (InterfaceC5557c) null, 14), 3);
            case 1:
                AbstractC1089i.m2732I0(obj);
                String str = (String) obj5;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj2;
                try {
                    OkHttpClient okHttpClient = AbstractC5731x.f23348a;
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    c3959f = AbstractC5731x.m10415p((String) interfaceC1809a1.getValue(), str, (String) interfaceC1809a12.getValue(), (String) interfaceC1809a13.getValue());
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return new C3960g(c3959f);
            case 2:
                AbstractC1089i.m2732I0(obj);
                C5391v0 c5391v0 = (C5391v0) obj5;
                AbstractC4955ho.m9501a6(c5391v0.f21259b, c5391v0.f21263f, new C5071la((InterfaceC1809a1) obj4, (InterfaceC1809a1) obj3, (InterfaceC1809a1) obj2, 15));
                return c3967n;
            case 3:
                AbstractC1089i.m2732I0(obj);
                AbstractC4955ho.m9501a6(EnumC5358u0.f20979h, false, new C0479q0((C4804d4) obj5, (InterfaceC1809a1) obj4, (InterfaceC1809a1) obj3, (InterfaceC1809a1) obj2, 23));
                return c3967n;
            default:
                AbstractC1089i.m2732I0(obj);
                Context context = (Context) this.f13508i;
                String str2 = ((C0859c0) obj5).f2626a;
                String str3 = (String) ((Map) ((InterfaceC1809a1) obj4).getValue()).get(str2);
                String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (str3 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String string = AbstractC3149m.m6703R0(str3).toString();
                String str5 = (String) ((Map) ((InterfaceC1809a1) obj3).getValue()).get(str2);
                if (str5 != null) {
                    str4 = str5;
                }
                String string2 = AbstractC3149m.m6703R0(str4).toString();
                List list = (List) ((Map) ((InterfaceC1809a1) obj2).getValue()).get(str2);
                if (list == null) {
                    list = C4173t.f13710g;
                }
                context.getClass();
                string2.getClass();
                try {
                    Object objM3764a = AbstractC1387k.m3764a(context, str2, string, string2, list);
                    AbstractC1089i.m2732I0(objM3764a);
                    C1394r c1394r = (C1394r) objM3764a;
                    C1389m c1389mM3794f = AbstractC1393q.m3794f(AbstractC1393q.m3795g(context).optJSONObject(str2));
                    try {
                        Object objM3762n = AbstractC1378b.m3762n(context, c1394r, c1389mM3794f);
                        AbstractC1089i.m2732I0(objM3762n);
                        c1389m = (C1389m) objM3762n;
                    } catch (C1382f e6) {
                        if (c1389mM3794f == null || !AbstractC1416l.m3825a(e6.f4589g, "PLUGIN_NOT_FOUND")) {
                            throw e6;
                        }
                        AbstractC1393q.m3797i(context, str2);
                        Object objM3762n2 = AbstractC1378b.m3762n(context, c1394r, null);
                        AbstractC1089i.m2732I0(objM3762n2);
                        c1389m = (C1389m) objM3762n2;
                    }
                    AbstractC1393q.m3799k(context, str2, c1389m);
                    c3959f2 = c1389m;
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                return new C3960g(c3959f2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4075g(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f13507h = i9;
        this.f13509j = obj;
        this.f13510k = obj2;
        this.f13511l = obj3;
        this.f13512m = obj4;
    }
}
