package p125i7;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p281t6.C8164q;
import p281t6.InterfaceC8163p;

/* JADX INFO: renamed from: i7.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3246x implements InterfaceC8163p {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8163p f8762c;

    /* JADX INFO: renamed from: d */
    public final C8164q f8763d;

    /* JADX INFO: renamed from: e */
    public final Set f8764e;

    /* JADX INFO: renamed from: f */
    public final boolean f8765f;

    public C3246x(InterfaceC8163p interfaceC8163p) {
        interfaceC8163p.getClass();
        this.f8762c = interfaceC8163p;
        this.f8763d = new C8164q(0, 1, null);
        this.f8764e = new LinkedHashSet();
        this.f8765f = interfaceC8163p.mo7357b();
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: a */
    public Set mo7356a() {
        Set setM20503l = AbstractC5071c1.m20503l(this.f8762c.mo7356a(), this.f8763d.m31658o().mo7356a());
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM20503l) {
            if (!this.f8764e.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return AbstractC5081g0.m20564c1(arrayList);
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: b */
    public boolean mo7357b() {
        return this.f8765f;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: c */
    public void mo7358c(InterfaceC0188p interfaceC0188p) {
        InterfaceC8163p.b.m31654a(this, interfaceC0188p);
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: d */
    public List mo7359d(String str) {
        str.getClass();
        if (this.f8764e.contains(str)) {
            return null;
        }
        return this.f8763d.m31883h(str) ? this.f8763d.m31885j(str) : this.f8762c.mo7359d(str);
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: e */
    public String mo12334e(String str) {
        return InterfaceC8163p.b.m31655b(this, str);
    }
}
