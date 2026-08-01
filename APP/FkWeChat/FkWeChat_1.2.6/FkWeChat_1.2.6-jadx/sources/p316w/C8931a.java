package p316w;

import androidx.compose.foundation.lazy.layout.C0426u0;
import androidx.compose.foundation.lazy.layout.InterfaceC0442z1;
import p185m8.AbstractC5081g0;
import p219p.EnumC5898w0;
import p233q.AbstractC6083e;
import p349y0.C9508c;

/* JADX INFO: renamed from: w.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8931a implements InterfaceC8971p0 {

    /* JADX INFO: renamed from: a */
    public final int f29566a;

    /* JADX INFO: renamed from: d */
    public boolean f29569d;

    /* JADX INFO: renamed from: f */
    public float f29571f;

    /* JADX INFO: renamed from: b */
    public int f29567b = -1;

    /* JADX INFO: renamed from: c */
    public final C9508c f29568c = new C9508c(new C0426u0.b[16], 0);

    /* JADX INFO: renamed from: e */
    public int f29570e = -1;

    public C8931a(int i10) {
        this.f29566a = i10;
    }

    @Override // p316w.InterfaceC8971p0
    /* JADX INFO: renamed from: a */
    public void mo34290a(InterfaceC0442z1 interfaceC0442z1, int i10) {
        int iMo1417b = interfaceC0442z1.mo1417b() == -1 ? this.f29566a : interfaceC0442z1.mo1417b();
        for (int i11 = 0; i11 < iMo1417b; i11++) {
            interfaceC0442z1.mo1416a(i10 + i11);
        }
    }

    @Override // p316w.InterfaceC8971p0
    /* JADX INFO: renamed from: c */
    public void mo34291c(InterfaceC8969o0 interfaceC8969o0, InterfaceC8935b0 interfaceC8935b0) {
        m34295g(interfaceC8935b0, this.f29567b, this.f29569d);
        int iMo34312i = interfaceC8935b0.mo34312i();
        int i10 = this.f29570e;
        if (i10 != -1 && this.f29571f != 0.0f && i10 != iMo34312i && !interfaceC8935b0.mo34314k().isEmpty()) {
            int iM34294f = m34294f(interfaceC8935b0, this.f29571f < 0.0f);
            int iM34293e = m34293e(interfaceC8935b0, this.f29571f < 0.0f);
            if (iM34293e >= 0 && iM34293e < interfaceC8935b0.mo34312i() && iM34294f != this.f29567b && iM34294f >= 0) {
                this.f29567b = iM34294f;
                this.f29568c.m37035h();
                C9508c c9508c = this.f29568c;
                c9508c.m37031d(c9508c.m37039l(), interfaceC8969o0.mo34362a(iM34294f));
            }
        }
        this.f29570e = iMo34312i;
    }

    @Override // p316w.InterfaceC8971p0
    /* JADX INFO: renamed from: d */
    public void mo34292d(InterfaceC8969o0 interfaceC8969o0, float f10, InterfaceC8935b0 interfaceC8935b0) {
        if (!interfaceC8935b0.mo34314k().isEmpty()) {
            int i10 = 0;
            boolean z10 = f10 < 0.0f;
            int iM34294f = m34294f(interfaceC8935b0, z10);
            int iM34293e = m34293e(interfaceC8935b0, z10);
            if (iM34293e >= 0 && iM34293e < interfaceC8935b0.mo34312i()) {
                if (iM34294f != this.f29567b && iM34294f >= 0) {
                    if (this.f29569d != z10) {
                        C9508c c9508c = this.f29568c;
                        Object[] objArr = c9508c.f32299q;
                        int iM37039l = c9508c.m37039l();
                        for (int i11 = 0; i11 < iM37039l; i11++) {
                            ((C0426u0.b) objArr[i11]).cancel();
                        }
                    }
                    this.f29569d = z10;
                    this.f29567b = iM34294f;
                    this.f29568c.m37035h();
                    C9508c c9508c2 = this.f29568c;
                    c9508c2.m37031d(c9508c2.m37039l(), interfaceC8969o0.mo34362a(iM34294f));
                }
                if (z10) {
                    InterfaceC8964m interfaceC8964m = (InterfaceC8964m) AbstractC5081g0.m20587u0(interfaceC8935b0.mo34314k());
                    if (((AbstractC6083e.m24203b(interfaceC8964m, interfaceC8935b0.mo34309f()) + AbstractC6083e.m24204c(interfaceC8964m, interfaceC8935b0.mo34309f())) + interfaceC8935b0.mo34313j()) - interfaceC8935b0.mo34308d() < (-f10)) {
                        C9508c c9508c3 = this.f29568c;
                        Object[] objArr2 = c9508c3.f32299q;
                        int iM37039l2 = c9508c3.m37039l();
                        while (i10 < iM37039l2) {
                            ((C0426u0.b) objArr2[i10]).mo1170a();
                            i10++;
                        }
                    }
                } else if (interfaceC8935b0.mo34311h() - AbstractC6083e.m24203b((InterfaceC8964m) AbstractC5081g0.m20576j0(interfaceC8935b0.mo34314k()), interfaceC8935b0.mo34309f()) < f10) {
                    C9508c c9508c4 = this.f29568c;
                    Object[] objArr3 = c9508c4.f32299q;
                    int iM37039l3 = c9508c4.m37039l();
                    while (i10 < iM37039l3) {
                        ((C0426u0.b) objArr3[i10]).mo1170a();
                        i10++;
                    }
                }
            }
        }
        this.f29571f = f10;
    }

    /* JADX INFO: renamed from: e */
    public final int m34293e(InterfaceC8935b0 interfaceC8935b0, boolean z10) {
        return z10 ? ((InterfaceC8964m) AbstractC5081g0.m20587u0(interfaceC8935b0.mo34314k())).getIndex() + 1 : ((InterfaceC8964m) AbstractC5081g0.m20576j0(interfaceC8935b0.mo34314k())).getIndex() - 1;
    }

    /* JADX INFO: renamed from: f */
    public final int m34294f(InterfaceC8935b0 interfaceC8935b0, boolean z10) {
        if (z10) {
            InterfaceC8964m interfaceC8964m = (InterfaceC8964m) AbstractC5081g0.m20587u0(interfaceC8935b0.mo34314k());
            return (interfaceC8935b0.mo34309f() == EnumC5898w0.f18786q ? interfaceC8964m.getRow() : interfaceC8964m.mo34405m()) + 1;
        }
        InterfaceC8964m interfaceC8964m2 = (InterfaceC8964m) AbstractC5081g0.m20576j0(interfaceC8935b0.mo34314k());
        return (interfaceC8935b0.mo34309f() == EnumC5898w0.f18786q ? interfaceC8964m2.getRow() : interfaceC8964m2.mo34405m()) - 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m34295g(InterfaceC8935b0 interfaceC8935b0, int i10, boolean z10) {
        if (i10 == -1 || interfaceC8935b0.mo34314k().isEmpty() || i10 == m34294f(interfaceC8935b0, z10)) {
            return;
        }
        m34296h();
    }

    /* JADX INFO: renamed from: h */
    public final void m34296h() {
        this.f29567b = -1;
        C9508c c9508c = this.f29568c;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            ((C0426u0.b) objArr[i10]).cancel();
        }
        this.f29568c.m37035h();
    }
}
