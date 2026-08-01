package p057e1;

import androidx.compose.runtime.AbstractC0557o5;
import androidx.compose.runtime.C0479d4;
import androidx.compose.runtime.C0534l3;
import androidx.compose.runtime.InterfaceC0465b4;
import androidx.compose.runtime.InterfaceC0472c4;
import androidx.compose.runtime.InterfaceC0544n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p117i.AbstractC3044c1;
import p117i.AbstractC3047d1;
import p117i.AbstractC3050e1;
import p117i.C3082r0;
import p117i.C3084s0;
import p150k1.InterfaceC3915h;
import p172l8.C4700i0;
import p349y0.C9508c;

/* JADX INFO: renamed from: e1.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1992t implements InterfaceC0465b4 {

    /* JADX INFO: renamed from: a */
    public Set f5527a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3915h f5528b;

    /* JADX INFO: renamed from: c */
    public final C9508c f5529c;

    /* JADX INFO: renamed from: d */
    public C3084s0 f5530d;

    /* JADX INFO: renamed from: e */
    public C9508c f5531e;

    /* JADX INFO: renamed from: f */
    public final C9508c f5532f;

    /* JADX INFO: renamed from: g */
    public final C9508c f5533g;

    /* JADX INFO: renamed from: h */
    public C3084s0 f5534h;

    /* JADX INFO: renamed from: i */
    public C3082r0 f5535i;

    /* JADX INFO: renamed from: j */
    public ArrayList f5536j;

    /* JADX INFO: renamed from: k */
    public AbstractC3047d1 f5537k;

    public C1992t() {
        C9508c c9508c = new C9508c(new C0479d4[16], 0);
        this.f5529c = c9508c;
        this.f5530d = AbstractC3050e1.m11284b();
        this.f5531e = c9508c;
        this.f5532f = new C9508c(new Object[16], 0);
        this.f5533g = new C9508c(new InterfaceC0173a[16], 0);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m7186p(C0479d4 c0479d4, C9508c c9508c) {
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            InterfaceC0472c4 interfaceC0472c4M1601b = ((C0479d4) objArr[i10]).m1601b();
            if (interfaceC0472c4M1601b instanceof C1987o) {
                C9508c c9508cM7170a = ((C1987o) interfaceC0472c4M1601b).m7170a();
                if (c9508cM7170a.m37043p(c0479d4) || m7186p(c0479d4, c9508cM7170a)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: a */
    public void mo1537a(C0534l3 c0534l3) {
        C9508c c9508c;
        C3082r0 c3082r0 = this.f5535i;
        if (c3082r0 == null || ((C1987o) c3082r0.m11238e(c0534l3)) == null) {
            return;
        }
        ArrayList arrayList = this.f5536j;
        if (arrayList != null && (c9508c = (C9508c) AbstractC0557o5.m2118i(arrayList)) != null) {
            this.f5531e = c9508c;
        }
        c3082r0.m11526u(c0534l3);
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: b */
    public void mo1538b(C0534l3 c0534l3) {
        C3082r0 c3082r0 = this.f5535i;
        C1987o c1987o = c3082r0 != null ? (C1987o) c3082r0.m11238e(c0534l3) : null;
        if (c1987o != null) {
            ArrayList arrayListM2112c = this.f5536j;
            if (arrayListM2112c == null) {
                arrayListM2112c = AbstractC0557o5.m2112c(null, 1, null);
                this.f5536j = arrayListM2112c;
            }
            AbstractC0557o5.m2119j(arrayListM2112c, this.f5531e);
            this.f5531e = c1987o.m7170a();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: c */
    public void mo1539c(C0479d4 c0479d4) {
        if (!this.f5530d.m11268a(c0479d4)) {
            AbstractC3047d1 abstractC3047d1 = this.f5537k;
            if (abstractC3047d1 == null || !abstractC3047d1.m11268a(c0479d4)) {
                m7196s(c0479d4);
                return;
            }
            return;
        }
        this.f5530d.m11553y(c0479d4);
        if (!this.f5531e.m37043p(c0479d4) && !this.f5529c.m37043p(c0479d4)) {
            m7186p(c0479d4, this.f5529c);
        }
        Set set = this.f5527a;
        if (set == null) {
            return;
        }
        set.add(c0479d4.m1601b());
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: d */
    public void mo1540d(C0479d4 c0479d4) {
        this.f5531e.m37029b(c0479d4);
        this.f5530d.m11536h(c0479d4);
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: e */
    public void mo1541e(InterfaceC0544n interfaceC0544n) {
        C3084s0 c3084s0M11284b = this.f5534h;
        if (c3084s0M11284b == null) {
            c3084s0M11284b = AbstractC3050e1.m11284b();
            this.f5534h = c3084s0M11284b;
        }
        c3084s0M11284b.m11552x(interfaceC0544n);
        m7196s(interfaceC0544n);
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: f */
    public void mo1542f(InterfaceC0544n interfaceC0544n) {
        m7196s(interfaceC0544n);
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: g */
    public void mo1543g(C0534l3 c0534l3) {
        Set set = this.f5527a;
        if (set == null) {
            return;
        }
        C1987o c1987o = new C1987o(set);
        C3082r0 c3082r0M11262b = this.f5535i;
        if (c3082r0M11262b == null) {
            c3082r0M11262b = AbstractC3044c1.m11262b();
            this.f5535i = c3082r0M11262b;
        }
        c3082r0M11262b.m11529x(c0534l3, c1987o);
        this.f5531e.m37029b(new C0479d4(c1987o, -1));
    }

    @Override // androidx.compose.runtime.InterfaceC0465b4
    /* JADX INFO: renamed from: h */
    public void mo1544h(InterfaceC0173a interfaceC0173a) {
        this.f5533g.m37029b(interfaceC0173a);
    }

    /* JADX INFO: renamed from: i */
    public final void m7187i() {
        this.f5527a = null;
        this.f5528b = null;
        this.f5529c.m37035h();
        this.f5530d.m11541m();
        this.f5531e = this.f5529c;
        this.f5532f.m37035h();
        this.f5533g.m37035h();
        this.f5534h = null;
        this.f5535i = null;
        this.f5536j = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m7188j() {
        Set set = this.f5527a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objM7128a = C1971a0.f5486a.m7128a("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC0472c4 interfaceC0472c4 = (InterfaceC0472c4) it.next();
                it.remove();
                interfaceC0472c4.mo1532b();
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            C1971a0.f5486a.m7129b(objM7128a);
        } catch (Throwable th) {
            C1971a0.f5486a.m7129b(objM7128a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7189k(InterfaceC0544n interfaceC0544n) {
        if (this.f5532f.m37043p(interfaceC0544n)) {
            interfaceC0544n.mo1932j();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7190l(C9508c c9508c) {
        Set set = this.f5527a;
        if (set == null) {
            return;
        }
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            C0479d4 c0479d4 = (C0479d4) objArr[i10];
            InterfaceC0472c4 interfaceC0472c4M1601b = c0479d4.m1601b();
            set.remove(interfaceC0472c4M1601b);
            try {
                interfaceC0472c4M1601b.mo1534i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                InterfaceC3915h interfaceC3915h = this.f5528b;
                if (interfaceC3915h != null) {
                    interfaceC3915h.mo15596a(th, c0479d4);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7191m() {
        Object objM7128a;
        Set set = this.f5527a;
        if (set == null) {
            return;
        }
        this.f5537k = null;
        if (this.f5532f.m37039l() != 0) {
            objM7128a = C1971a0.f5486a.m7128a("Compose:onForgotten");
            try {
                C3084s0 c3084s0 = this.f5534h;
                int iM37039l = this.f5532f.m37039l();
                while (true) {
                    iM37039l--;
                    if (-1 >= iM37039l) {
                        break;
                    }
                    Object obj = this.f5532f.f32299q[iM37039l];
                    try {
                        if (obj instanceof C0479d4) {
                            InterfaceC0472c4 interfaceC0472c4M1601b = ((C0479d4) obj).m1601b();
                            set.remove(interfaceC0472c4M1601b);
                            interfaceC0472c4M1601b.mo1533g();
                        }
                        if (obj instanceof InterfaceC0544n) {
                            if (c3084s0 == null || !c3084s0.m11268a(obj)) {
                                ((InterfaceC0544n) obj).mo1932j();
                            } else {
                                ((InterfaceC0544n) obj).mo1931h();
                            }
                        }
                        C4700i0 c4700i0 = C4700i0.f13910a;
                    } catch (Throwable th) {
                        InterfaceC3915h interfaceC3915h = this.f5528b;
                        if (interfaceC3915h != null) {
                            interfaceC3915h.mo15596a(th, obj);
                        }
                        throw th;
                    }
                }
                C4700i0 c4700i02 = C4700i0.f13910a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f5529c.m37039l() != 0) {
            C1971a0 c1971a0 = C1971a0.f5486a;
            objM7128a = c1971a0.m7128a("Compose:onRemembered");
            try {
                m7190l(this.f5529c);
                C4700i0 c4700i03 = C4700i0.f13910a;
                c1971a0.m7129b(objM7128a);
            } finally {
                C1971a0.f5486a.m7129b(objM7128a);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7192n() {
        if (this.f5533g.m37039l() != 0) {
            Object objM7128a = C1971a0.f5486a.m7128a("Compose:sideeffects");
            try {
                C9508c c9508c = this.f5533g;
                Object[] objArr = c9508c.f32299q;
                int iM37039l = c9508c.m37039l();
                for (int i10 = 0; i10 < iM37039l; i10++) {
                    ((InterfaceC0173a) objArr[i10]).invoke();
                }
                this.f5533g.m37035h();
                C4700i0 c4700i0 = C4700i0.f13910a;
                C1971a0.f5486a.m7129b(objM7128a);
            } catch (Throwable th) {
                C1971a0.f5486a.m7129b(objM7128a);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC3047d1 m7193o() {
        if (!this.f5530d.m11272e()) {
            return null;
        }
        C3084s0 c3084s0 = this.f5530d;
        this.f5530d = AbstractC3050e1.m11284b();
        this.f5529c.m37035h();
        return c3084s0;
    }

    /* JADX INFO: renamed from: q */
    public final void m7194q(AbstractC3047d1 abstractC3047d1) {
        this.f5537k = abstractC3047d1;
    }

    /* JADX INFO: renamed from: r */
    public final void m7195r(Set set, InterfaceC3915h interfaceC3915h) {
        m7187i();
        this.f5527a = set;
        this.f5528b = interfaceC3915h;
    }

    /* JADX INFO: renamed from: s */
    public final void m7196s(Object obj) {
        this.f5532f.m37029b(obj);
    }
}
