package p112hb;

import gb.AbstractC2675i2;
import gb.AbstractC2706r0;
import gb.AbstractC2719v1;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2716u1;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import p187mb.AbstractC5143c;
import p229p9.InterfaceC6019m;
import p259ra.AbstractC6569n;
import p285ta.AbstractC8213e;

/* JADX INFO: renamed from: hb.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2943b0 {
    /* JADX INFO: renamed from: a */
    public static final AbstractC2706r0 m10754a(AbstractC2706r0 abstractC2706r0) {
        return (AbstractC2706r0) AbstractC5143c.m21149b(abstractC2706r0).m21147d();
    }

    /* JADX INFO: renamed from: b */
    public static final String m10755b(InterfaceC2716u1 interfaceC2716u1) {
        StringBuilder sb2 = new StringBuilder();
        m10756c("type: " + interfaceC2716u1, sb2);
        m10756c("hashCode: " + interfaceC2716u1.hashCode(), sb2);
        m10756c("javaClass: " + interfaceC2716u1.getClass().getCanonicalName(), sb2);
        for (InterfaceC6019m interfaceC6019mMo5602u = interfaceC2716u1.mo5602u(); interfaceC6019mMo5602u != null; interfaceC6019mMo5602u = interfaceC6019mMo5602u.mo7443b()) {
            m10756c("fqName: " + AbstractC6569n.f20552h.mo25906M(interfaceC6019mMo5602u), sb2);
            m10756c("javaClass: " + interfaceC6019mMo5602u.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final StringBuilder m10756c(String str, StringBuilder sb2) {
        str.getClass();
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2706r0 m10757d(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, InterfaceC2966y interfaceC2966y) {
        abstractC2706r0.getClass();
        abstractC2706r02.getClass();
        interfaceC2966y.getClass();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C2963v(abstractC2706r0, null));
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2706r02.mo9332T0();
        while (!arrayDeque.isEmpty()) {
            C2963v c2963v = (C2963v) arrayDeque.poll();
            AbstractC2706r0 abstractC2706r0M10959b = c2963v.m10959b();
            InterfaceC2716u1 interfaceC2716u1Mo9332T02 = abstractC2706r0M10959b.mo9332T0();
            if (interfaceC2966y.mo10961a(interfaceC2716u1Mo9332T02, interfaceC2716u1Mo9332T0)) {
                boolean zMo9258U0 = abstractC2706r0M10959b.mo9258U0();
                for (C2963v c2963vM10958a = c2963v.m10958a(); c2963vM10958a != null; c2963vM10958a = c2963vM10958a.m10958a()) {
                    AbstractC2706r0 abstractC2706r0M10959b2 = c2963vM10958a.m10959b();
                    List listMo9330R0 = abstractC2706r0M10959b2.mo9330R0();
                    if (listMo9330R0 == null || !listMo9330R0.isEmpty()) {
                        Iterator it = listMo9330R0.iterator();
                        while (it.hasNext()) {
                            EnumC2691m2 enumC2691m2Mo9335b = ((InterfaceC2643a2) it.next()).mo9335b();
                            EnumC2691m2 enumC2691m2 = EnumC2691m2.f7042u;
                            if (enumC2691m2Mo9335b != enumC2691m2) {
                                AbstractC2706r0 abstractC2706r0M9392n = AbstractC8213e.m31912h(AbstractC2719v1.f7113c.m9648a(abstractC2706r0M10959b2), false, 1, null).m9361c().m9392n(abstractC2706r0M10959b, enumC2691m2);
                                abstractC2706r0M9392n.getClass();
                                abstractC2706r0M10959b = m10754a(abstractC2706r0M9392n);
                                break;
                            }
                        }
                        abstractC2706r0M10959b = AbstractC2719v1.f7113c.m9648a(abstractC2706r0M10959b2).m9361c().m9392n(abstractC2706r0M10959b, EnumC2691m2.f7042u);
                        abstractC2706r0M10959b.getClass();
                    } else {
                        abstractC2706r0M10959b = AbstractC2719v1.f7113c.m9648a(abstractC2706r0M10959b2).m9361c().m9392n(abstractC2706r0M10959b, EnumC2691m2.f7042u);
                        abstractC2706r0M10959b.getClass();
                    }
                    zMo9258U0 = zMo9258U0 || abstractC2706r0M10959b2.mo9258U0();
                }
                InterfaceC2716u1 interfaceC2716u1Mo9332T03 = abstractC2706r0M10959b.mo9332T0();
                if (interfaceC2966y.mo10961a(interfaceC2716u1Mo9332T03, interfaceC2716u1Mo9332T0)) {
                    return AbstractC2675i2.m9468p(abstractC2706r0M10959b, zMo9258U0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m10755b(interfaceC2716u1Mo9332T03) + ", \n\nsupertype: " + m10755b(interfaceC2716u1Mo9332T0) + " \n" + interfaceC2966y.mo10961a(interfaceC2716u1Mo9332T03, interfaceC2716u1Mo9332T0));
            }
            for (AbstractC2706r0 abstractC2706r03 : interfaceC2716u1Mo9332T02.mo9546n()) {
                abstractC2706r03.getClass();
                arrayDeque.add(new C2963v(abstractC2706r03, c2963v));
            }
        }
        return null;
    }
}
