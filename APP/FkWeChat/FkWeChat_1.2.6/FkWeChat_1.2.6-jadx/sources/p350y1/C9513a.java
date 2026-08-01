package p350y1;

import p010a9.InterfaceC0184l;
import p120i2.AbstractC3167a;
import p121i3.AbstractC3190t;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p265s1.AbstractC7098k1;
import p265s1.AbstractC7099k2;
import p265s1.AbstractC7133r1;
import p265s1.AbstractC7168z0;
import p265s1.C7094j2;
import p265s1.C7128q1;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7089i2;
import p290u1.C8482a;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9513a {

    /* JADX INFO: renamed from: a */
    public InterfaceC7089i2 f32319a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7088i1 f32320b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3175e f32321c;

    /* JADX INFO: renamed from: d */
    public EnumC3191u f32322d = EnumC3191u.f8484q;

    /* JADX INFO: renamed from: e */
    public long f32323e = C3189s.f8481b.m12088a();

    /* JADX INFO: renamed from: f */
    public int f32324f = C7094j2.f23571b.m27933b();

    /* JADX INFO: renamed from: g */
    public final C8482a f32325g = new C8482a();

    /* JADX INFO: renamed from: a */
    public final void m37076a(InterfaceC8487f interfaceC8487f) {
        InterfaceC8487f.m32658w1(interfaceC8487f, C7128q1.f23644b.m28140a(), 0L, 0L, 0.0f, null, null, AbstractC7168z0.f23700a.m28308a(), 62, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m37077b(int i10, long j10, InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, InterfaceC0184l interfaceC0184l) {
        this.f32321c = interfaceC3175e;
        this.f32322d = enumC3191u;
        InterfaceC7089i2 interfaceC7089i2M27983b = this.f32319a;
        InterfaceC7088i1 interfaceC7088i1M27981a = this.f32320b;
        if (interfaceC7089i2M27983b == null || interfaceC7088i1M27981a == null || ((int) (j10 >> 32)) > interfaceC7089i2M27983b.mo27908e() || ((int) (j10 & 4294967295L)) > interfaceC7089i2M27983b.mo27905a() || !C7094j2.m27928i(this.f32324f, i10)) {
            interfaceC7089i2M27983b = AbstractC7099k2.m27983b((int) (j10 >> 32), (int) (4294967295L & j10), i10, false, null, 24, null);
            interfaceC7088i1M27981a = AbstractC7098k1.m27981a(interfaceC7089i2M27983b);
            this.f32319a = interfaceC7089i2M27983b;
            this.f32320b = interfaceC7088i1M27981a;
            this.f32324f = i10;
        }
        this.f32323e = j10;
        C8482a c8482a = this.f32325g;
        long jM12092d = AbstractC3190t.m12092d(j10);
        C8482a.a aVarM32613x = c8482a.m32613x();
        InterfaceC3175e interfaceC3175eM32615a = aVarM32613x.m32615a();
        EnumC3191u enumC3191uM32616b = aVarM32613x.m32616b();
        InterfaceC7088i1 interfaceC7088i1M32617c = aVarM32613x.m32617c();
        long jM32618d = aVarM32613x.m32618d();
        C8482a.a aVarM32613x2 = c8482a.m32613x();
        aVarM32613x2.m32624j(interfaceC3175e);
        aVarM32613x2.m32625k(enumC3191u);
        aVarM32613x2.m32623i(interfaceC7088i1M27981a);
        aVarM32613x2.m32626l(jM12092d);
        interfaceC7088i1M27981a.mo27841n();
        m37076a(c8482a);
        interfaceC0184l.mo27m(c8482a);
        interfaceC7088i1M27981a.mo27847w();
        C8482a.a aVarM32613x3 = c8482a.m32613x();
        aVarM32613x3.m32624j(interfaceC3175eM32615a);
        aVarM32613x3.m32625k(enumC3191uM32616b);
        aVarM32613x3.m32623i(interfaceC7088i1M32617c);
        aVarM32613x3.m32626l(jM32618d);
        interfaceC7089i2M27983b.mo27906b();
    }

    /* JADX INFO: renamed from: c */
    public final void m37078c(InterfaceC8487f interfaceC8487f, float f10, AbstractC7133r1 abstractC7133r1) {
        InterfaceC7089i2 interfaceC7089i2 = this.f32319a;
        if (!(interfaceC7089i2 != null)) {
            AbstractC3167a.m11956b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC8487f.m32647F0(interfaceC8487f, interfaceC7089i2, 0L, this.f32323e, 0L, 0L, f10, null, abstractC7133r1, 0, 0, 858, null);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7089i2 m37079d() {
        return this.f32319a;
    }
}
