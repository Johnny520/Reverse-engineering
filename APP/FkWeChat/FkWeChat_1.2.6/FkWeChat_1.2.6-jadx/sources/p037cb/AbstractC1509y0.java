package p037cb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import la.AbstractC4727g;
import la.C4728h;
import la.InterfaceC4724d;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p143ja.C3770c;
import p143ja.C3785r;
import p160kb.InterfaceC4230j;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import p229p9.AbstractC6033q1;
import p229p9.C5984a0;
import p229p9.C6008i0;
import p339x6.C9450c;

/* JADX INFO: renamed from: cb.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1509y0 {
    /* JADX INFO: renamed from: a */
    public static final C4711r m5919a(C3770c c3770c, InterfaceC4724d interfaceC4724d, C4728h c4728h) {
        List listM14175V0;
        c3770c.getClass();
        interfaceC4724d.getClass();
        c4728h.getClass();
        List<Integer> listM14170Q0 = c3770c.m14170Q0();
        listM14170Q0.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM14170Q0, 10));
        for (Integer num : listM14170Q0) {
            num.getClass();
            arrayList.add(AbstractC1483l0.m5819b(interfaceC4724d, num.intValue()));
        }
        C4711r c4711rM18815a = AbstractC4717x.m18815a(Integer.valueOf(c3770c.m14173T0()), Integer.valueOf(c3770c.m14172S0()));
        if (AbstractC1061t.m3842c(c4711rM18815a, AbstractC4717x.m18815a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listM14174U0 = c3770c.m14174U0();
            listM14174U0.getClass();
            listM14175V0 = new ArrayList(AbstractC5116y.m20814z(listM14174U0, 10));
            for (Integer num2 : listM14174U0) {
                num2.getClass();
                listM14175V0.add(c4728h.m18894a(num2.intValue()));
            }
        } else {
            if (!AbstractC1061t.m3842c(c4711rM18815a, AbstractC4717x.m18815a(0, Integer.valueOf(arrayList.size())))) {
                C9450c.m36816a("class ", AbstractC1483l0.m5819b(interfaceC4724d, c3770c.m14162I0()), " has illegal multi-field value class representation");
                return null;
            }
            listM14175V0 = c3770c.m14175V0();
        }
        return AbstractC4717x.m18815a(arrayList, listM14175V0);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC6033q1 m5920b(C3770c c3770c, InterfaceC4724d interfaceC4724d, C4728h c4728h, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        InterfaceC4230j interfaceC4230j;
        c3770c.getClass();
        interfaceC4724d.getClass();
        c4728h.getClass();
        interfaceC0184l.getClass();
        interfaceC0184l2.getClass();
        if (c3770c.m14169P0() > 0) {
            C4711r c4711rM5919a = m5919a(c3770c, interfaceC4724d, c4728h);
            List list = (List) c4711rM5919a.m18792a();
            List list2 = (List) c4711rM5919a.m18793b();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC0184l.mo27m(it.next()));
            }
            return new C6008i0(AbstractC5081g0.m20574h1(list, arrayList));
        }
        if (!c3770c.m14198r1()) {
            return null;
        }
        C5695f c5695fM5819b = AbstractC1483l0.m5819b(interfaceC4724d, c3770c.m14166M0());
        C3785r c3785rM18882i = AbstractC4727g.m18882i(c3770c, c4728h);
        if ((c3785rM18882i != null && (interfaceC4230j = (InterfaceC4230j) interfaceC0184l.mo27m(c3785rM18882i)) != null) || (interfaceC4230j = (InterfaceC4230j) interfaceC0184l2.mo27m(c5695fM5819b)) != null) {
            return new C5984a0(c5695fM5819b, interfaceC4230j);
        }
        throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC1483l0.m5819b(interfaceC4724d, c3770c.m14162I0()) + " with property " + c5695fM5819b).toString());
    }
}
