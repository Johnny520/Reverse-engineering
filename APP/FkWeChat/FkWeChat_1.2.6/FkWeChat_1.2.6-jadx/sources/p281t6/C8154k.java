package p281t6;

import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p185m8.AbstractC5068b1;
import p281t6.InterfaceC8141d0;

/* JADX INFO: renamed from: t6.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8154k implements InterfaceC8141d0 {

    /* JADX INFO: renamed from: c */
    public static final C8154k f27275c = new C8154k();

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
        InterfaceC8141d0.b.m31613a(this, interfaceC0188p);
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: d */
    public List mo7359d(String str) {
        str.getClass();
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC8141d0) && ((InterfaceC8141d0) obj).isEmpty();
    }

    @Override // p282t7.InterfaceC8197u
    public boolean isEmpty() {
        return true;
    }

    @Override // p282t7.InterfaceC8197u
    public Set names() {
        return AbstractC5068b1.m20483e();
    }

    public String toString() {
        return "Parameters " + mo7356a();
    }
}
