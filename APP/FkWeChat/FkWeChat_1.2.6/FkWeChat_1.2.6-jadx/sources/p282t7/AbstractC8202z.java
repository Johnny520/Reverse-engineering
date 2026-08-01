package p282t7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: t7.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8202z implements InterfaceC8197u {

    /* JADX INFO: renamed from: c */
    public final boolean f27511c;

    /* JADX INFO: renamed from: d */
    public final Map f27512d;

    public AbstractC8202z(boolean z10, Map map) {
        map.getClass();
        this.f27511c = z10;
        Map mapM31863a = z10 ? AbstractC8189m.m31863a() : new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add((String) list.get(i10));
            }
            mapM31863a.put(str, arrayList);
        }
        this.f27512d = mapM31863a;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: a */
    public Set mo7356a() {
        return AbstractC8188l.m31862a(this.f27512d.entrySet());
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: b */
    public final boolean mo7357b() {
        return this.f27511c;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: c */
    public void mo7358c(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        for (Map.Entry entry : this.f27512d.entrySet()) {
            interfaceC0188p.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: d */
    public List mo7359d(String str) {
        str.getClass();
        return m31888f(str);
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: e */
    public String mo12334e(String str) {
        str.getClass();
        List listM31888f = m31888f(str);
        if (listM31888f != null) {
            return (String) AbstractC5081g0.m20578l0(listM31888f);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC8197u)) {
            return false;
        }
        InterfaceC8197u interfaceC8197u = (InterfaceC8197u) obj;
        if (this.f27511c != interfaceC8197u.mo7357b()) {
            return false;
        }
        return AbstractC8175a0.m31828c(mo7356a(), interfaceC8197u.mo7356a());
    }

    /* JADX INFO: renamed from: f */
    public final List m31888f(String str) {
        return (List) this.f27512d.get(str);
    }

    public int hashCode() {
        return AbstractC8175a0.m31829d(mo7356a(), Boolean.hashCode(this.f27511c) * 31);
    }

    @Override // p282t7.InterfaceC8197u
    public boolean isEmpty() {
        return this.f27512d.isEmpty();
    }

    @Override // p282t7.InterfaceC8197u
    public Set names() {
        return AbstractC8188l.m31862a(this.f27512d.keySet());
    }
}
