package p023b8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0189q;
import p023b8.AbstractC1017j;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p282t7.AbstractC8180d;
import p282t7.InterfaceC8176b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: b8.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1011d {
    private volatile /* synthetic */ Object interceptors$delegate;

    /* JADX INFO: renamed from: q */
    public final InterfaceC8176b f3154q;

    /* JADX INFO: renamed from: r */
    public final List f3155r;

    /* JADX INFO: renamed from: s */
    public int f3156s;

    /* JADX INFO: renamed from: t */
    public boolean f3157t;

    /* JADX INFO: renamed from: u */
    public C1016i f3158u;

    public AbstractC1011d(C1016i... c1016iArr) {
        c1016iArr.getClass();
        this.f3154q = AbstractC8180d.m31846a(true);
        this.f3155r = AbstractC5114x.m20806u(Arrays.copyOf(c1016iArr, c1016iArr.length));
        this.interceptors$delegate = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m3723B(AbstractC1011d abstractC1011d) {
        abstractC1011d.getClass();
        if (m3739l(abstractC1011d)) {
            return;
        }
        m3725D(abstractC1011d);
        m3724C(abstractC1011d);
    }

    /* JADX INFO: renamed from: C */
    public final void m3724C(AbstractC1011d abstractC1011d) {
        if (this.f3156s == 0) {
            m3730J(abstractC1011d);
        } else {
            m3728H();
        }
        for (Object obj : abstractC1011d.f3155r) {
            C1016i c1016iM3718f = obj instanceof C1016i ? (C1016i) obj : null;
            if (c1016iM3718f == null) {
                obj.getClass();
                c1016iM3718f = ((C1010c) obj).m3718f();
            }
            if (obj instanceof C1010c) {
                C1010c c1010c = (C1010c) obj;
                if (!c1010c.m3721i()) {
                    C1010c c1010cM3740n = m3740n(c1016iM3718f);
                    c1010cM3740n.getClass();
                    c1010c.m3714b(c1010cM3740n);
                    this.f3156s += c1010c.m3720h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3725D(AbstractC1011d abstractC1011d) {
        abstractC1011d.getClass();
        List listM20560a1 = AbstractC5081g0.m20560a1(abstractC1011d.f3155r);
        while (!listM20560a1.isEmpty()) {
            Iterator it = listM20560a1.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C1016i c1016iM3718f = next instanceof C1016i ? (C1016i) next : null;
                if (c1016iM3718f == null) {
                    next.getClass();
                    c1016iM3718f = ((C1010c) next).m3718f();
                }
                if (m3745s(c1016iM3718f)) {
                    it.remove();
                } else if (m3748v(next, c1016iM3718f)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3726E(List list) {
        m3729I(list);
        this.f3157t = false;
        this.f3158u = null;
    }

    /* JADX INFO: renamed from: G */
    public final void m3727G(AbstractC1011d abstractC1011d) {
        abstractC1011d.getClass();
        this.f3155r.clear();
        if (this.f3156s == 0) {
            m3739l(abstractC1011d);
        } else {
            C10010p0.m38820a("Check failed.");
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m3728H() {
        m3729I(null);
        this.f3157t = false;
        this.f3158u = null;
    }

    /* JADX INFO: renamed from: I */
    public final void m3729I(List list) {
        this.interceptors$delegate = list;
    }

    /* JADX INFO: renamed from: J */
    public final void m3730J(AbstractC1011d abstractC1011d) {
        m3729I(abstractC1011d.m3732L());
        this.f3157t = true;
        this.f3158u = null;
    }

    /* JADX INFO: renamed from: K */
    public final void m3731K(C1010c c1010c) {
        m3729I(c1010c.m3722j());
        this.f3157t = false;
        this.f3158u = c1010c.m3718f();
    }

    /* JADX INFO: renamed from: L */
    public final List m3732L() {
        if (m3743q() == null) {
            m3736h();
        }
        this.f3157t = true;
        List listM3743q = m3743q();
        listM3743q.getClass();
        return listM3743q;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m3733M(C1016i c1016i, InterfaceC0189q interfaceC0189q) {
        List listM3743q = m3743q();
        if (this.f3155r.isEmpty() || listM3743q == null || this.f3157t || !AbstractC1064u0.m3866n(listM3743q)) {
            return false;
        }
        if (AbstractC1061t.m3842c(this.f3158u, c1016i)) {
            listM3743q.add(interfaceC0189q);
            return true;
        }
        if (!AbstractC1061t.m3842c(c1016i, AbstractC5081g0.m20587u0(this.f3155r)) && m3741o(c1016i) != AbstractC5114x.m20802q(this.f3155r)) {
            return false;
        }
        C1010c c1010cM3740n = m3740n(c1016i);
        c1010cM3740n.getClass();
        c1010cM3740n.m3713a(interfaceC0189q);
        listM3743q.add(interfaceC0189q);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3734f(C1016i c1016i) {
        c1016i.getClass();
        if (m3745s(c1016i)) {
            return;
        }
        this.f3155r.add(c1016i);
    }

    public final InterfaceC8176b getAttributes() {
        return this.f3154q;
    }

    /* JADX INFO: renamed from: h */
    public final List m3736h() {
        int iM20802q;
        int i10 = this.f3156s;
        if (i10 == 0) {
            m3726E(AbstractC5114x.m20800o());
            return AbstractC5114x.m20800o();
        }
        List list = this.f3155r;
        int i11 = 0;
        if (i10 == 1 && (iM20802q = AbstractC5114x.m20802q(list)) >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i12);
                C1010c c1010c = obj instanceof C1010c ? (C1010c) obj : null;
                if (c1010c != null && !c1010c.m3721i()) {
                    List listM3722j = c1010c.m3722j();
                    m3731K(c1010c);
                    return listM3722j;
                }
                if (i12 == iM20802q) {
                    break;
                }
                i12++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int iM20802q2 = AbstractC5114x.m20802q(list);
        if (iM20802q2 >= 0) {
            while (true) {
                Object obj2 = list.get(i11);
                C1010c c1010c2 = obj2 instanceof C1010c ? (C1010c) obj2 : null;
                if (c1010c2 != null) {
                    c1010c2.m3715c(arrayList);
                }
                if (i11 == iM20802q2) {
                    break;
                }
                i11++;
            }
        }
        m3726E(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC1012e m3737i(Object obj, Object obj2, InterfaceC5980j interfaceC5980j) {
        return AbstractC1013f.m3753a(obj, m3732L(), obj2, interfaceC5980j, mo3742p());
    }

    /* JADX INFO: renamed from: j */
    public final Object m3738j(Object obj, Object obj2, InterfaceC5976f interfaceC5976f) {
        return m3737i(obj, obj2, interfaceC5976f.getContext()).mo3706a(obj2, interfaceC5976f);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3739l(AbstractC1011d abstractC1011d) {
        if (abstractC1011d.f3155r.isEmpty()) {
            return true;
        }
        int i10 = 0;
        if (!this.f3155r.isEmpty()) {
            return false;
        }
        List list = abstractC1011d.f3155r;
        int iM20802q = AbstractC5114x.m20802q(list);
        if (iM20802q >= 0) {
            while (true) {
                Object obj = list.get(i10);
                if (obj instanceof C1016i) {
                    this.f3155r.add(obj);
                } else if (obj instanceof C1010c) {
                    C1010c c1010c = (C1010c) obj;
                    this.f3155r.add(new C1010c(c1010c.m3718f(), c1010c.m3719g(), c1010c.m3722j()));
                }
                if (i10 == iM20802q) {
                    break;
                }
                i10++;
            }
        }
        this.f3156s += abstractC1011d.f3156s;
        m3730J(abstractC1011d);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final C1010c m3740n(C1016i c1016i) {
        List list = this.f3155r;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == c1016i) {
                C1010c c1010c = new C1010c(c1016i, AbstractC1017j.c.f3164a);
                list.set(i10, c1010c);
                return c1010c;
            }
            if (obj instanceof C1010c) {
                C1010c c1010c2 = (C1010c) obj;
                if (c1010c2.m3718f() == c1016i) {
                    return c1010c2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m3741o(C1016i c1016i) {
        List list = this.f3155r;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == c1016i || ((obj instanceof C1010c) && ((C1010c) obj).m3718f() == c1016i)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo3742p();

    /* JADX INFO: renamed from: q */
    public final List m3743q() {
        return (List) this.interceptors$delegate;
    }

    /* JADX INFO: renamed from: r */
    public final List m3744r() {
        List list = this.f3155r;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        for (Object obj : list) {
            C1016i c1016i = obj instanceof C1016i ? (C1016i) obj : null;
            if (c1016i == null) {
                C1010c c1010c = obj instanceof C1010c ? (C1010c) obj : null;
                C1016i c1016iM3718f = c1010c != null ? c1010c.m3718f() : null;
                c1016iM3718f.getClass();
                c1016i = c1016iM3718f;
            }
            arrayList.add(c1016i);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3745s(C1016i c1016i) {
        List list = this.f3155r;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == c1016i) {
                return true;
            }
            if ((obj instanceof C1010c) && ((C1010c) obj).m3718f() == c1016i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m3746t(C1016i c1016i, C1016i c1016i2) throws C1009b {
        AbstractC1017j abstractC1017jM3719g;
        C1016i c1016iM3757a;
        c1016i.getClass();
        c1016i2.getClass();
        if (m3745s(c1016i2)) {
            return;
        }
        int iM3741o = m3741o(c1016i);
        if (iM3741o == -1) {
            throw new C1009b("Phase " + c1016i + " was not registered for this pipeline");
        }
        int i10 = iM3741o + 1;
        int iM20802q = AbstractC5114x.m20802q(this.f3155r);
        if (i10 <= iM20802q) {
            while (true) {
                Object obj = this.f3155r.get(i10);
                C1010c c1010c = obj instanceof C1010c ? (C1010c) obj : null;
                if (c1010c != null && (abstractC1017jM3719g = c1010c.m3719g()) != null) {
                    AbstractC1017j.a aVar = abstractC1017jM3719g instanceof AbstractC1017j.a ? (AbstractC1017j.a) abstractC1017jM3719g : null;
                    if (aVar != null && (c1016iM3757a = aVar.m3757a()) != null && AbstractC1061t.m3842c(c1016iM3757a, c1016i)) {
                        iM3741o = i10;
                    }
                    if (i10 == iM20802q) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f3155r.add(iM3741o + 1, new C1010c(c1016i2, new AbstractC1017j.a(c1016i)));
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m3747u(C1016i c1016i, C1016i c1016i2) throws C1009b {
        c1016i.getClass();
        c1016i2.getClass();
        if (m3745s(c1016i2)) {
            return;
        }
        int iM3741o = m3741o(c1016i);
        if (iM3741o != -1) {
            this.f3155r.add(iM3741o, new C1010c(c1016i2, new AbstractC1017j.b(c1016i)));
            return;
        }
        throw new C1009b("Phase " + c1016i + " was not registered for this pipeline");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3748v(Object obj, C1016i c1016i) throws C1009b {
        AbstractC1017j abstractC1017jM3719g;
        if (obj == c1016i) {
            abstractC1017jM3719g = AbstractC1017j.c.f3164a;
        } else {
            obj.getClass();
            abstractC1017jM3719g = ((C1010c) obj).m3719g();
        }
        if (abstractC1017jM3719g instanceof AbstractC1017j.c) {
            m3734f(c1016i);
            return true;
        }
        if (abstractC1017jM3719g instanceof AbstractC1017j.b) {
            AbstractC1017j.b bVar = (AbstractC1017j.b) abstractC1017jM3719g;
            if (m3745s(bVar.m3758a())) {
                m3747u(bVar.m3758a(), c1016i);
                return true;
            }
        }
        if (!(abstractC1017jM3719g instanceof AbstractC1017j.a)) {
            return false;
        }
        m3746t(((AbstractC1017j.a) abstractC1017jM3719g).m3757a(), c1016i);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m3749w(C1016i c1016i, InterfaceC0189q interfaceC0189q) throws C1009b {
        c1016i.getClass();
        interfaceC0189q.getClass();
        C1010c c1010cM3740n = m3740n(c1016i);
        if (c1010cM3740n == null) {
            throw new C1009b("Phase " + c1016i + " was not registered for this pipeline");
        }
        if (m3733M(c1016i, interfaceC0189q)) {
            this.f3156s++;
            return;
        }
        c1010cM3740n.m3713a(interfaceC0189q);
        this.f3156s++;
        m3728H();
        mo3735g();
    }

    /* JADX INFO: renamed from: y */
    public final List m3750y(C1016i c1016i) {
        Object next;
        c1016i.getClass();
        List list = this.f3155r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1010c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1061t.m3842c(((C1010c) next).m3718f(), c1016i)) {
                break;
            }
        }
        C1010c c1010c = (C1010c) next;
        List listM3722j = c1010c != null ? c1010c.m3722j() : null;
        return listM3722j == null ? AbstractC5114x.m20800o() : listM3722j;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m3751z() {
        return this.f3156s == 0;
    }

    /* JADX INFO: renamed from: g */
    public void mo3735g() {
    }
}
