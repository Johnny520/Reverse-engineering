package p333x0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.C0460b;
import androidx.compose.runtime.C0556o4;
import androidx.compose.runtime.InterfaceC0465b4;
import androidx.compose.runtime.InterfaceC0474d;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1064u0;
import p333x0.AbstractC9298d;
import p333x0.C9303i;

/* JADX INFO: renamed from: x0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9297c extends AbstractC9304j {

    /* JADX INFO: renamed from: a */
    public final C9303i f31794a = new C9303i();

    /* JADX INFO: renamed from: b */
    public final C9303i f31795b = new C9303i();

    /* JADX INFO: renamed from: a */
    public final void m36223a() {
        this.f31795b.m36247a();
        this.f31794a.m36247a();
    }

    /* JADX INFO: renamed from: b */
    public final void m36224b(InterfaceC0173a interfaceC0173a, int i10, C0460b c0460b) {
        C9303i c9303i = this.f31794a;
        AbstractC9298d.o oVar = AbstractC9298d.o.f31822c;
        c9303i.m36256j(oVar);
        C9303i c9303iM36262a = C9303i.b.m36262a(c9303i);
        C9303i.b.m36263b(c9303iM36262a, AbstractC9298d.t.m36235a(0), interfaceC0173a);
        c9303iM36262a.f31840c[c9303iM36262a.f31841d - c9303iM36262a.f31838a[c9303iM36262a.f31839b - 1].m36232d()] = i10;
        C9303i.b.m36263b(c9303iM36262a, AbstractC9298d.t.m36235a(1), c0460b);
        c9303i.m36249c(oVar);
        C9303i c9303i2 = this.f31795b;
        AbstractC9298d.u uVar = AbstractC9298d.u.f31827c;
        c9303i2.m36256j(uVar);
        C9303i c9303iM36262a2 = C9303i.b.m36262a(c9303i2);
        c9303iM36262a2.f31840c[c9303iM36262a2.f31841d - c9303iM36262a2.f31838a[c9303iM36262a2.f31839b - 1].m36232d()] = i10;
        C9303i.b.m36263b(c9303iM36262a2, AbstractC9298d.t.m36235a(0), c0460b);
        c9303i2.m36249c(uVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m36225c() {
        if (!this.f31795b.m36253g()) {
            AbstractC0468c0.m1548b("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f31795b.m36254h(this.f31794a);
    }

    /* JADX INFO: renamed from: d */
    public final void m36226d(InterfaceC0474d interfaceC0474d, C0556o4 c0556o4, InterfaceC0465b4 interfaceC0465b4, InterfaceC9300f interfaceC9300f) {
        if (!this.f31795b.m36252f()) {
            AbstractC0468c0.m1548b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f31794a.m36250d(interfaceC0474d, c0556o4, interfaceC0465b4, interfaceC9300f);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36227e() {
        return this.f31794a.m36252f();
    }

    /* JADX INFO: renamed from: f */
    public final void m36228f(Object obj, InterfaceC0188p interfaceC0188p) {
        C9303i c9303i = this.f31794a;
        AbstractC9298d.g0 g0Var = AbstractC9298d.g0.f31811c;
        c9303i.m36256j(g0Var);
        C9303i c9303iM36262a = C9303i.b.m36262a(c9303i);
        C9303i.b.m36263b(c9303iM36262a, AbstractC9298d.t.m36235a(0), obj);
        int iM36235a = AbstractC9298d.t.m36235a(1);
        interfaceC0188p.getClass();
        C9303i.b.m36263b(c9303iM36262a, iM36235a, (InterfaceC0188p) AbstractC1064u0.m3858f(interfaceC0188p, 2));
        c9303i.m36249c(g0Var);
    }
}
