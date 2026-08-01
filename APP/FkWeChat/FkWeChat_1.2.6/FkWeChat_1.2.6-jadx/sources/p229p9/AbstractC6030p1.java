package p229p9;

import gb.AbstractC2706r0;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p129ib.C3381l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p327wa.AbstractC9211e;
import sa.AbstractC7259i;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: p9.p1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6030p1 {
    /* JADX INFO: renamed from: d */
    public static final C6050w0 m24045d(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        return m24046e(abstractC2706r0, interfaceC6004hMo5602u instanceof InterfaceC6007i ? (InterfaceC6007i) interfaceC6004hMo5602u : null, 0);
    }

    /* JADX INFO: renamed from: e */
    public static final C6050w0 m24046e(AbstractC2706r0 abstractC2706r0, InterfaceC6007i interfaceC6007i, int i10) {
        if (interfaceC6007i == null || C3381l.m12704m(interfaceC6007i)) {
            return null;
        }
        int size = interfaceC6007i.mo5594z().size() + i10;
        if (interfaceC6007i.mo5577S()) {
            List listSubList = abstractC2706r0.mo9330R0().subList(i10, size);
            InterfaceC6019m interfaceC6019mMo7443b = interfaceC6007i.mo7443b();
            return new C6050w0(interfaceC6007i, listSubList, m24046e(abstractC2706r0, interfaceC6019mMo7443b instanceof InterfaceC6007i ? (InterfaceC6007i) interfaceC6019mMo7443b : null, size));
        }
        if (size != abstractC2706r0.mo9330R0().size()) {
            AbstractC7259i.m28739E(interfaceC6007i);
        }
        return new C6050w0(interfaceC6007i, abstractC2706r0.mo9330R0().subList(i10, abstractC2706r0.mo9330R0().size()), null);
    }

    /* JADX INFO: renamed from: f */
    public static final C5989c m24047f(InterfaceC6018l1 interfaceC6018l1, InterfaceC6019m interfaceC6019m, int i10) {
        return new C5989c(interfaceC6018l1, interfaceC6019m, i10);
    }

    /* JADX INFO: renamed from: g */
    public static final List m24048g(InterfaceC6007i interfaceC6007i) {
        List listM20800o;
        Object next;
        InterfaceC2716u1 interfaceC2716u1Mo5591o;
        interfaceC6007i.getClass();
        List listMo5594z = interfaceC6007i.mo5594z();
        listMo5594z.getClass();
        if (!interfaceC6007i.mo5577S() && !(interfaceC6007i.mo7443b() instanceof InterfaceC5983a)) {
            return listMo5594z;
        }
        List listM28908P = AbstractC7294t.m28908P(AbstractC7294t.m28896D(AbstractC7294t.m28915y(AbstractC7294t.m28906N(AbstractC9211e.m35866u(interfaceC6007i), C6021m1.f18975q), C6024n1.f18976q), C6027o1.f18977q));
        Iterator it = AbstractC9211e.m35866u(interfaceC6007i).iterator();
        while (true) {
            listM20800o = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC5995e) {
                break;
            }
        }
        InterfaceC5995e interfaceC5995e = (InterfaceC5995e) next;
        if (interfaceC5995e != null && (interfaceC2716u1Mo5591o = interfaceC5995e.mo5591o()) != null) {
            listM20800o = interfaceC2716u1Mo5591o.mo5600d();
        }
        if (listM20800o == null) {
            listM20800o = AbstractC5114x.m20800o();
        }
        if (listM28908P.isEmpty() && listM20800o.isEmpty()) {
            List listMo5594z2 = interfaceC6007i.mo5594z();
            listMo5594z2.getClass();
            return listMo5594z2;
        }
        List<InterfaceC6018l1> listM20533E0 = AbstractC5081g0.m20533E0(listM28908P, listM20800o);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20533E0, 10));
        for (InterfaceC6018l1 interfaceC6018l1 : listM20533E0) {
            interfaceC6018l1.getClass();
            arrayList.add(m24047f(interfaceC6018l1, interfaceC6007i, listMo5594z.size()));
        }
        return AbstractC5081g0.m20533E0(listMo5594z, arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m24049h(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        return interfaceC6019m instanceof InterfaceC5983a;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m24050i(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        return !(interfaceC6019m instanceof InterfaceC6016l);
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC7282h m24051j(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        List typeParameters = ((InterfaceC5983a) interfaceC6019m).getTypeParameters();
        typeParameters.getClass();
        return AbstractC5081g0.m20555Y(typeParameters);
    }
}
