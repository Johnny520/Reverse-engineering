package p241q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p023b8.AbstractC1012e;
import p023b8.C1009b;
import p024b9.AbstractC1061t;
import p034c7.AbstractC1370i0;
import p034c7.AbstractC1377m;
import p034c7.C1357c;
import p034c7.InterfaceC1359d;
import p034c7.InterfaceC1368h0;
import p034c7.InterfaceC1372j0;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p185m8.AbstractC5114x;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p299ub.AbstractC8621f0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: q7.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6319w extends C1357c implements InterfaceC6297k {

    /* JADX INFO: renamed from: G */
    public final C6319w f19826G;

    /* JADX INFO: renamed from: H */
    public final AbstractC6299l f19827H;

    /* JADX INFO: renamed from: I */
    public final List f19828I;

    /* JADX INFO: renamed from: J */
    public C1357c f19829J;

    /* JADX INFO: renamed from: K */
    public final List f19830K;

    /* JADX INFO: renamed from: q7.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f19831q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f19832r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ List f19833s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f19834t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, int i10, InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
            this.f19833s = list;
            this.f19834t = i10;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f19831q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC1368h0 interfaceC1368h0 = (InterfaceC1368h0) ((AbstractC1012e) this.f19832r).m3752c();
                interfaceC1368h0.getClass();
                C6286e0 c6286e0 = (C6286e0) interfaceC1368h0;
                C6318v c6318v = new C6318v(new C6317u(c6286e0));
                if (AbstractC1370i0.m5404b(c6286e0)) {
                    return C4700i0.f13910a;
                }
                InterfaceC0188p interfaceC0188p = (InterfaceC0188p) this.f19833s.get(this.f19834t);
                this.f19831q = 1;
                if (interfaceC0188p.invoke(c6318v, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(AbstractC1012e abstractC1012e, C4700i0 c4700i0, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f19833s, this.f19834t, interfaceC5976f);
            aVar.f19832r = abstractC1012e;
            return aVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6319w(C6319w c6319w, AbstractC6299l abstractC6299l, boolean z10, InterfaceC1359d interfaceC1359d) {
        super(z10, interfaceC1359d);
        abstractC6299l.getClass();
        interfaceC1359d.getClass();
        this.f19826G = c6319w;
        this.f19827H = abstractC6299l;
        this.f19828I = new ArrayList();
        this.f19830K = new ArrayList();
    }

    /* JADX INFO: renamed from: T */
    public final C1357c m24977T() throws C1009b {
        C1357c c1357c = this.f19829J;
        if (c1357c == null) {
            c1357c = new C1357c(mo3742p(), AbstractC6312r0.m24963a(this).m5377Q());
            ArrayList arrayList = new ArrayList();
            for (C6319w parent = this; parent != null; parent = parent.getParent()) {
                arrayList.add(parent);
            }
            for (int iM20802q = AbstractC5114x.m20802q(arrayList); -1 < iM20802q; iM20802q--) {
                C1357c c1357c2 = (C1357c) arrayList.get(iM20802q);
                c1357c.m3723B(c1357c2);
                c1357c.m5378R().m3723B(c1357c2.m5378R());
                c1357c.m5379S().m3723B(c1357c2.m5379S());
            }
            List list = this.f19830K;
            int iM20802q2 = AbstractC5114x.m20802q(list);
            if (iM20802q2 >= 0) {
                int i10 = 0;
                while (true) {
                    c1357c.m3749w(C1357c.f4016z.m5380a(), new a(list, i10, null));
                    if (i10 == iM20802q2) {
                        break;
                    }
                    i10++;
                }
            }
            this.f19829J = c1357c;
        }
        return c1357c;
    }

    @Override // p241q7.InterfaceC6297k
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public C6319w mo24909c(AbstractC6299l abstractC6299l) {
        Object next;
        abstractC6299l.getClass();
        Iterator it = this.f19828I.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1061t.m3842c(((C6319w) next).f19827H, abstractC6299l)) {
                break;
            }
        }
        C6319w c6319w = (C6319w) next;
        if (c6319w != null) {
            return c6319w;
        }
        C6319w c6319w2 = new C6319w(this, abstractC6299l, mo3742p(), m5377Q());
        this.f19828I.add(c6319w2);
        return c6319w2;
    }

    /* JADX INFO: renamed from: W */
    public final List m24979W() {
        return this.f19828I;
    }

    /* JADX INFO: renamed from: X */
    public final List m24980X() {
        return this.f19830K;
    }

    @Override // p241q7.InterfaceC6297k
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public C6319w getParent() {
        return this.f19826G;
    }

    /* JADX INFO: renamed from: Z */
    public final AbstractC6299l m24982Z() {
        return this.f19827H;
    }

    @Override // p241q7.InterfaceC6297k
    /* JADX INFO: renamed from: a */
    public Object mo24907a(InterfaceC1372j0 interfaceC1372j0) {
        interfaceC1372j0.getClass();
        return AbstractC1377m.m5440i(this, interfaceC1372j0);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m24983a0() {
        this.f19829J = null;
        Iterator it = this.f19828I.iterator();
        while (it.hasNext()) {
            ((C6319w) it.next()).m24983a0();
        }
    }

    @Override // p241q7.InterfaceC6297k
    /* JADX INFO: renamed from: b */
    public void mo24908b(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        this.f19830K.add(interfaceC0188p);
        this.f19829J = null;
    }

    @Override // p023b8.AbstractC1011d
    /* JADX INFO: renamed from: g */
    public void mo3735g() {
        m24983a0();
    }

    @Override // p023b8.AbstractC1011d
    public String toString() {
        C6319w parent = getParent();
        String string = parent != null ? parent.toString() : null;
        AbstractC6299l abstractC6299l = this.f19827H;
        if (string == null) {
            if (abstractC6299l instanceof C6316t0) {
                return "/";
            }
            return "/" + this.f19827H;
        }
        if (abstractC6299l instanceof C6316t0) {
            return AbstractC8621f0.m33132d0(string, '/', false, 2, null) ? string : string.concat("/");
        }
        if (AbstractC8621f0.m33132d0(string, '/', false, 2, null)) {
            return string + this.f19827H;
        }
        return string + '/' + this.f19827H;
    }
}
