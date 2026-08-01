package gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: gb.m1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2690m1 {

    /* JADX INFO: renamed from: e */
    public static final a f7037e = new a(null);

    /* JADX INFO: renamed from: a */
    public final C2690m1 f7038a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6015k1 f7039b;

    /* JADX INFO: renamed from: c */
    public final List f7040c;

    /* JADX INFO: renamed from: d */
    public final Map f7041d;

    public C2690m1(C2690m1 c2690m1, InterfaceC6015k1 interfaceC6015k1, List list, Map map) {
        this.f7038a = c2690m1;
        this.f7039b = interfaceC6015k1;
        this.f7040c = list;
        this.f7041d = map;
    }

    /* JADX INFO: renamed from: a */
    public final List m9513a() {
        return this.f7040c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC6015k1 m9514b() {
        return this.f7039b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2643a2 m9515c(InterfaceC2716u1 interfaceC2716u1) {
        interfaceC2716u1.getClass();
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1.mo5602u();
        if (interfaceC6004hMo5602u instanceof InterfaceC6018l1) {
            return (InterfaceC2643a2) this.f7041d.get(interfaceC6004hMo5602u);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9516d(InterfaceC6015k1 interfaceC6015k1) {
        interfaceC6015k1.getClass();
        if (AbstractC1061t.m3842c(this.f7039b, interfaceC6015k1)) {
            return true;
        }
        C2690m1 c2690m1 = this.f7038a;
        return c2690m1 != null ? c2690m1.m9516d(interfaceC6015k1) : false;
    }

    /* JADX INFO: renamed from: gb.m1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2690m1 m9517a(C2690m1 c2690m1, InterfaceC6015k1 interfaceC6015k1, List list) {
            interfaceC6015k1.getClass();
            list.getClass();
            List listMo5600d = interfaceC6015k1.mo5591o().mo5600d();
            listMo5600d.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo5600d, 10));
            Iterator it = listMo5600d.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC6018l1) it.next()).mo12664a());
            }
            return new C2690m1(c2690m1, interfaceC6015k1, list, AbstractC5109u0.m20778s(AbstractC5081g0.m20574h1(arrayList, list)), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C2690m1(C2690m1 c2690m1, InterfaceC6015k1 interfaceC6015k1, List list, Map map, AbstractC1043k abstractC1043k) {
        this(c2690m1, interfaceC6015k1, list, map);
    }
}
