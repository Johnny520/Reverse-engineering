package p148k;

import androidx.compose.runtime.AbstractC0471c3;
import androidx.compose.runtime.InterfaceC0491f2;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: k.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3892o {

    /* JADX INFO: renamed from: a */
    public final AbstractC3901v f11241a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3903x f11242b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0491f2 f11243c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3883j0 f11244d;

    public /* synthetic */ C3892o(AbstractC3901v abstractC3901v, AbstractC3903x abstractC3903x, float f10, InterfaceC3883j0 interfaceC3883j0, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC3901v, abstractC3903x, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? AbstractC3866b.m15324d(false, null, 3, null) : interfaceC3883j0);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC3903x m15450a() {
        return this.f11242b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3883j0 m15451b() {
        return this.f11244d;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC3901v m15452c() {
        return this.f11241a;
    }

    /* JADX INFO: renamed from: d */
    public final float m15453d() {
        return this.f11243c.mo1663b();
    }

    /* JADX INFO: renamed from: e */
    public final void m15454e(InterfaceC3883j0 interfaceC3883j0) {
        this.f11244d = interfaceC3883j0;
    }

    public C3892o(AbstractC3901v abstractC3901v, AbstractC3903x abstractC3903x, float f10, InterfaceC3883j0 interfaceC3883j0) {
        this.f11241a = abstractC3901v;
        this.f11242b = abstractC3903x;
        this.f11243c = AbstractC0471c3.m1561a(f10);
        this.f11244d = interfaceC3883j0;
    }
}
