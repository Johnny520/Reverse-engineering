package p057e1;

import androidx.compose.runtime.C0479d4;
import androidx.compose.runtime.InterfaceC0472c4;
import java.util.Set;
import p349y0.C9508c;

/* JADX INFO: renamed from: e1.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1987o implements InterfaceC0472c4 {

    /* JADX INFO: renamed from: q */
    public final Set f5520q;

    /* JADX INFO: renamed from: r */
    public final C9508c f5521r = new C9508c(new C0479d4[16], 0);

    public C1987o(Set set) {
        this.f5520q = set;
    }

    /* JADX INFO: renamed from: a */
    public final C9508c m7170a() {
        return this.f5521r;
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: i */
    public void mo1534i() {
        C9508c c9508c = this.f5521r;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            InterfaceC0472c4 interfaceC0472c4M1601b = ((C0479d4) objArr[i10]).m1601b();
            this.f5520q.remove(interfaceC0472c4M1601b);
            interfaceC0472c4M1601b.mo1534i();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: b */
    public void mo1532b() {
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: g */
    public void mo1533g() {
    }
}
