package p281t6;

import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p185m8.AbstractC5068b1;
import p281t6.InterfaceC8163p;

/* JADX INFO: renamed from: t6.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8152j implements InterfaceC8163p {

    /* JADX INFO: renamed from: c */
    public static final C8152j f27274c = new C8152j();

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: a */
    public Set mo7356a() {
        return AbstractC5068b1.m20483e();
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: b */
    public boolean mo7357b() {
        return true;
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
        return null;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: e */
    public String mo12334e(String str) {
        return InterfaceC8163p.b.m31655b(this, str);
    }

    public String toString() {
        return "Headers " + mo7356a();
    }
}
