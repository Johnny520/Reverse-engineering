package gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: gb.v1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2719v1 extends AbstractC2655d2 {

    /* JADX INFO: renamed from: c */
    public static final a f7113c = new a(null);

    /* JADX INFO: renamed from: i */
    public static final AbstractC2655d2 m9645i(InterfaceC2716u1 interfaceC2716u1, List list) {
        return f7113c.m9649b(interfaceC2716u1, list);
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC2719v1 m9646j(Map map) {
        return f7113c.m9650c(map);
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: e */
    public InterfaceC2643a2 mo7021e(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return mo9487k(abstractC2706r0.mo9332T0());
    }

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC2643a2 mo9487k(InterfaceC2716u1 interfaceC2716u1);

    /* JADX INFO: renamed from: gb.v1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: gb.v1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10087a extends AbstractC2719v1 {

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Map f7114d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ boolean f7115e;

            public C10087a(Map map, boolean z10) {
                this.f7114d = map;
                this.f7115e = z10;
            }

            @Override // gb.AbstractC2655d2
            /* JADX INFO: renamed from: a */
            public boolean mo9355a() {
                return this.f7115e;
            }

            @Override // gb.AbstractC2655d2
            /* JADX INFO: renamed from: f */
            public boolean mo7022f() {
                return this.f7114d.isEmpty();
            }

            @Override // gb.AbstractC2719v1
            /* JADX INFO: renamed from: k */
            public InterfaceC2643a2 mo9487k(InterfaceC2716u1 interfaceC2716u1) {
                interfaceC2716u1.getClass();
                return (InterfaceC2643a2) this.f7114d.get(interfaceC2716u1);
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ AbstractC2719v1 m9647e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.m9651d(map, z10);
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2655d2 m9648a(AbstractC2706r0 abstractC2706r0) {
            abstractC2706r0.getClass();
            return m9649b(abstractC2706r0.mo9332T0(), abstractC2706r0.mo9330R0());
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC2655d2 m9649b(InterfaceC2716u1 interfaceC2716u1, List list) {
            interfaceC2716u1.getClass();
            list.getClass();
            List listMo5600d = interfaceC2716u1.mo5600d();
            listMo5600d.getClass();
            InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) AbstractC5081g0.m20589w0(listMo5600d);
            if (interfaceC6018l1 == null || !interfaceC6018l1.mo23996s0()) {
                return new C2689m0(listMo5600d, list);
            }
            List listMo5600d2 = interfaceC2716u1.mo5600d();
            listMo5600d2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo5600d2, 10));
            Iterator it = listMo5600d2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC6018l1) it.next()).mo5591o());
            }
            return m9647e(this, AbstractC5109u0.m20778s(AbstractC5081g0.m20574h1(arrayList, list)), false, 2, null);
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC2719v1 m9650c(Map map) {
            map.getClass();
            return m9647e(this, map, false, 2, null);
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC2719v1 m9651d(Map map, boolean z10) {
            map.getClass();
            return new C10087a(map, z10);
        }

        public a() {
        }
    }
}
