package p112hb;

import gb.AbstractC2650c1;
import gb.AbstractC2673i0;
import gb.AbstractC2683k2;
import gb.AbstractC2687l2;
import gb.AbstractC2702q;
import gb.AbstractC2706r0;
import gb.C2703q0;
import gb.C2715u0;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lb.AbstractC4734d;
import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import p160kb.EnumC4222b;
import p160kb.InterfaceC4229i;
import p185m8.AbstractC5116y;
import p215oc.C5729x;
import p285ta.C8211c;
import p376zd.C9987e;

/* JADX INFO: renamed from: hb.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2948g extends AbstractC2702q {

    /* JADX INFO: renamed from: hb.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC2948g {

        /* JADX INFO: renamed from: a */
        public static final a f7783a = new a();
    }

    /* JADX INFO: renamed from: hb.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0184l {
        public b(Object obj) {
            super(1, obj, AbstractC2948g.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final AbstractC2687l2 mo27m(InterfaceC4229i interfaceC4229i) {
            interfaceC4229i.getClass();
            return ((AbstractC2948g) this.f3190r).mo9561a(interfaceC4229i);
        }
    }

    @Override // gb.AbstractC2702q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2687l2 mo9561a(InterfaceC4229i interfaceC4229i) {
        AbstractC2687l2 abstractC2687l2M9624e;
        interfaceC4229i.getClass();
        if (!(interfaceC4229i instanceof AbstractC2706r0)) {
            C9987e.m38645a("Failed requirement.");
            return null;
        }
        AbstractC2687l2 abstractC2687l2Mo9510W0 = ((AbstractC2706r0) interfaceC4229i).mo9510W0();
        if (abstractC2687l2Mo9510W0 instanceof AbstractC2650c1) {
            abstractC2687l2M9624e = m10844c((AbstractC2650c1) abstractC2687l2Mo9510W0);
        } else {
            if (!(abstractC2687l2Mo9510W0 instanceof AbstractC2673i0)) {
                C5729x.m23182a();
                return null;
            }
            AbstractC2673i0 abstractC2673i0 = (AbstractC2673i0) abstractC2687l2Mo9510W0;
            AbstractC2650c1 abstractC2650c1M10844c = m10844c(abstractC2673i0.m9451b1());
            AbstractC2650c1 abstractC2650c1M10844c2 = m10844c(abstractC2673i0.m9452c1());
            abstractC2687l2M9624e = (abstractC2650c1M10844c == abstractC2673i0.m9451b1() && abstractC2650c1M10844c2 == abstractC2673i0.m9452c1()) ? abstractC2687l2Mo9510W0 : C2715u0.m9624e(abstractC2650c1M10844c, abstractC2650c1M10844c2);
        }
        return AbstractC2683k2.m9490c(abstractC2687l2M9624e, abstractC2687l2Mo9510W0, new b(this));
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2650c1 m10844c(AbstractC2650c1 abstractC2650c1) {
        AbstractC2706r0 type;
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2650c1.mo9332T0();
        C2703q0 c2703q0M9574q = null;
        abstractC2687l2Mo9510W0 = null;
        AbstractC2687l2 abstractC2687l2Mo9510W0 = null;
        if (!(interfaceC2716u1Mo9332T0 instanceof C8211c)) {
            if (!(interfaceC2716u1Mo9332T0 instanceof C2703q0) || !abstractC2650c1.mo9258U0()) {
                return abstractC2650c1;
            }
            C2703q0 c2703q0 = (C2703q0) interfaceC2716u1Mo9332T0;
            Collection collectionMo9546n = c2703q0.mo9546n();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collectionMo9546n, 10));
            Iterator it = collectionMo9546n.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                arrayList.add(AbstractC4734d.m18901B((AbstractC2706r0) it.next()));
                z10 = true;
            }
            if (z10) {
                AbstractC2706r0 abstractC2706r0M9571j = c2703q0.m9571j();
                c2703q0M9574q = new C2703q0(arrayList).m9574q(abstractC2706r0M9571j != null ? AbstractC4734d.m18901B(abstractC2706r0M9571j) : null);
            }
            if (c2703q0M9574q != null) {
                c2703q0 = c2703q0M9574q;
            }
            return c2703q0.m9570h();
        }
        C8211c c8211c = (C8211c) interfaceC2716u1Mo9332T0;
        InterfaceC2643a2 interfaceC2643a2Mo10870b = c8211c.mo10870b();
        if (interfaceC2643a2Mo10870b.mo9335b() != EnumC2691m2.f7043v) {
            interfaceC2643a2Mo10870b = null;
        }
        if (interfaceC2643a2Mo10870b != null && (type = interfaceC2643a2Mo10870b.getType()) != null) {
            abstractC2687l2Mo9510W0 = type.mo9510W0();
        }
        AbstractC2687l2 abstractC2687l2 = abstractC2687l2Mo9510W0;
        if (c8211c.m31902e() == null) {
            InterfaceC2643a2 interfaceC2643a2Mo10870b2 = c8211c.mo10870b();
            Collection collectionMo9546n2 = c8211c.mo9546n();
            ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(collectionMo9546n2, 10));
            Iterator it2 = collectionMo9546n2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC2706r0) it2.next()).mo9510W0());
            }
            c8211c.m31904g(new C2956o(interfaceC2643a2Mo10870b2, arrayList2, null, 4, null));
        }
        EnumC4222b enumC4222b = EnumC4222b.f12410q;
        C2956o c2956oM31902e = c8211c.m31902e();
        c2956oM31902e.getClass();
        return new C2951j(enumC4222b, c2956oM31902e, abstractC2687l2, abstractC2650c1.mo9331S0(), abstractC2650c1.mo9258U0(), false, 32, null);
    }
}
