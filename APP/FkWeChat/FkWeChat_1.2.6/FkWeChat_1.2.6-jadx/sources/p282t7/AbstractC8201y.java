package p282t7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: t7.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8201y implements InterfaceC8198v {

    /* JADX INFO: renamed from: a */
    public final boolean f27509a;

    /* JADX INFO: renamed from: b */
    public final Map f27510b;

    public AbstractC8201y(boolean z10, int i10) {
        this.f27509a = z10;
        this.f27510b = z10 ? AbstractC8189m.m31863a() : new LinkedHashMap(i10);
    }

    /* JADX INFO: renamed from: e */
    public static C4700i0 m31880e(AbstractC8201y abstractC8201y, String str, List list) {
        str.getClass();
        list.getClass();
        abstractC8201y.mo31878c(str, list);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static C4700i0 m31881f(AbstractC8201y abstractC8201y, String str, List list) {
        str.getClass();
        list.getClass();
        abstractC8201y.m31882g(str, list);
        return C4700i0.f13910a;
    }

    @Override // p282t7.InterfaceC8198v
    /* JADX INFO: renamed from: a */
    public void mo31876a(InterfaceC8197u interfaceC8197u) {
        interfaceC8197u.getClass();
        interfaceC8197u.mo7358c(new InterfaceC0188p() { // from class: t7.w
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC8201y.m31880e(this.f27507q, (String) obj, (List) obj2);
            }
        });
    }

    @Override // p282t7.InterfaceC8198v
    /* JADX INFO: renamed from: b */
    public void mo31877b(InterfaceC8197u interfaceC8197u) {
        interfaceC8197u.getClass();
        interfaceC8197u.mo7358c(new InterfaceC0188p() { // from class: t7.x
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC8201y.m31881f(this.f27508q, (String) obj, (List) obj2);
            }
        });
    }

    @Override // p282t7.InterfaceC8198v
    /* JADX INFO: renamed from: c */
    public void mo31878c(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        List listM31884i = m31884i(str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo31657n((String) it.next());
        }
        AbstractC5070c0.m20492E(listM31884i, iterable);
    }

    @Override // p282t7.InterfaceC8198v
    /* JADX INFO: renamed from: d */
    public void mo31879d(String str, String str2) {
        str.getClass();
        str2.getClass();
        mo31657n(str2);
        m31884i(str).add(str2);
    }

    /* JADX INFO: renamed from: g */
    public void m31882g(String str, Iterable iterable) {
        Set setM20483e;
        str.getClass();
        iterable.getClass();
        List list = (List) this.f27510b.get(str);
        if (list == null || (setM20483e = AbstractC5081g0.m20564c1(list)) == null) {
            setM20483e = AbstractC5068b1.m20483e();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!setM20483e.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        mo31878c(str, arrayList);
    }

    /* JADX INFO: renamed from: h */
    public boolean m31883h(String str) {
        str.getClass();
        return this.f27510b.containsKey(str);
    }

    /* JADX INFO: renamed from: i */
    public final List m31884i(String str) {
        List list = (List) this.f27510b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo31656m(str);
        this.f27510b.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public List m31885j(String str) {
        str.getClass();
        return (List) this.f27510b.get(str);
    }

    /* JADX INFO: renamed from: k */
    public final Map m31886k() {
        return this.f27510b;
    }

    /* JADX INFO: renamed from: l */
    public Set m31887l() {
        return this.f27510b.keySet();
    }

    /* JADX INFO: renamed from: m */
    public void mo31656m(String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: n */
    public void mo31657n(String str) {
        str.getClass();
    }
}
