package p303v;

import androidx.compose.foundation.lazy.layout.C0426u0;
import androidx.compose.foundation.lazy.layout.InterfaceC0442z1;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8682a implements InterfaceC8702j0 {

    /* JADX INFO: renamed from: a */
    public final int f28800a;

    /* JADX INFO: renamed from: c */
    public C0426u0.b f28802c;

    /* JADX INFO: renamed from: d */
    public boolean f28803d;

    /* JADX INFO: renamed from: f */
    public float f28805f;

    /* JADX INFO: renamed from: b */
    public int f28801b = -1;

    /* JADX INFO: renamed from: e */
    public int f28804e = -1;

    public C8682a(int i10) {
        this.f28800a = i10;
    }

    @Override // p303v.InterfaceC8702j0
    /* JADX INFO: renamed from: a */
    public void mo33360a(InterfaceC0442z1 interfaceC0442z1, int i10) {
        int iMo1417b = interfaceC0442z1.mo1417b() == -1 ? this.f28800a : interfaceC0442z1.mo1417b();
        for (int i11 = 0; i11 < iMo1417b; i11++) {
            interfaceC0442z1.mo1416a(i10 + i11);
        }
    }

    @Override // p303v.InterfaceC8702j0
    /* JADX INFO: renamed from: c */
    public void mo33361c(InterfaceC8700i0 interfaceC8700i0, float f10, InterfaceC8729x interfaceC8729x) {
        C0426u0.b bVar;
        C0426u0.b bVar2;
        if (!interfaceC8729x.mo33395k().isEmpty()) {
            boolean z10 = f10 < 0.0f;
            int iM33363e = m33363e(interfaceC8729x, z10);
            if (iM33363e >= 0 && iM33363e < interfaceC8729x.mo33393i()) {
                if (iM33363e != this.f28801b) {
                    if (this.f28803d != z10) {
                        m33365g();
                    }
                    this.f28803d = z10;
                    this.f28801b = iM33363e;
                    this.f28802c = InterfaceC8700i0.m33425b(interfaceC8700i0, iM33363e, null, 2, null);
                }
                if (z10) {
                    InterfaceC8709n interfaceC8709n = (InterfaceC8709n) AbstractC5081g0.m20587u0(interfaceC8729x.mo33395k());
                    if (((interfaceC8709n.getOffset() + interfaceC8709n.mo33408a()) + interfaceC8729x.mo33394j()) - interfaceC8729x.mo33389d() < (-f10) && (bVar2 = this.f28802c) != null) {
                        bVar2.mo1170a();
                    }
                } else if (interfaceC8729x.mo33392h() - ((InterfaceC8709n) AbstractC5081g0.m20576j0(interfaceC8729x.mo33395k())).getOffset() < f10 && (bVar = this.f28802c) != null) {
                    bVar.mo1170a();
                }
            }
        }
        this.f28805f = f10;
    }

    @Override // p303v.InterfaceC8702j0
    /* JADX INFO: renamed from: d */
    public void mo33362d(InterfaceC8700i0 interfaceC8700i0, InterfaceC8729x interfaceC8729x) {
        m33364f(interfaceC8729x, this.f28801b, this.f28803d);
        int iMo33393i = interfaceC8729x.mo33393i();
        int i10 = this.f28804e;
        if (i10 != -1 && this.f28805f != 0.0f && i10 != iMo33393i && !interfaceC8729x.mo33395k().isEmpty()) {
            int iM33363e = m33363e(interfaceC8729x, this.f28805f < 0.0f);
            if (iM33363e >= 0 && iM33363e < iMo33393i) {
                this.f28801b = iM33363e;
                this.f28802c = InterfaceC8700i0.m33425b(interfaceC8700i0, iM33363e, null, 2, null);
            }
        }
        this.f28804e = iMo33393i;
    }

    /* JADX INFO: renamed from: e */
    public final int m33363e(InterfaceC8729x interfaceC8729x, boolean z10) {
        return z10 ? ((InterfaceC8709n) AbstractC5081g0.m20587u0(interfaceC8729x.mo33395k())).getIndex() + 1 : ((InterfaceC8709n) AbstractC5081g0.m20576j0(interfaceC8729x.mo33395k())).getIndex() - 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m33364f(InterfaceC8729x interfaceC8729x, int i10, boolean z10) {
        if (i10 == -1 || interfaceC8729x.mo33395k().isEmpty() || i10 == m33363e(interfaceC8729x, z10)) {
            return;
        }
        m33365g();
    }

    /* JADX INFO: renamed from: g */
    public final void m33365g() {
        this.f28801b = -1;
        C0426u0.b bVar = this.f28802c;
        if (bVar != null) {
            bVar.cancel();
        }
        this.f28802c = null;
    }
}
