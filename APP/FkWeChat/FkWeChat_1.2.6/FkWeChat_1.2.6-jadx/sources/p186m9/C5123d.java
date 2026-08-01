package p186m9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5692c;

/* JADX INFO: renamed from: m9.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5123d {

    /* JADX INFO: renamed from: a */
    public static final C5123d f15436a = new C5123d();

    /* JADX INFO: renamed from: b */
    public static final Set f15437b;

    static {
        Set set = EnumC5132m.f15465v;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(C5135p.m20963c((EnumC5132m) it.next()));
        }
        List listM20534F0 = AbstractC5081g0.m20534F0(AbstractC5081g0.m20534F0(AbstractC5081g0.m20534F0(arrayList, C5135p.a.f15586h.m23016m()), C5135p.a.f15590j.m23016m()), C5135p.a.f15608s.m23016m());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5691b.a aVar = C5691b.f17894d;
        Iterator it2 = listM20534F0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.m22993c((C5692c) it2.next()));
        }
        f15437b = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public final Set m20826a() {
        return f15437b;
    }

    /* JADX INFO: renamed from: b */
    public final Set m20827b() {
        return f15437b;
    }
}
