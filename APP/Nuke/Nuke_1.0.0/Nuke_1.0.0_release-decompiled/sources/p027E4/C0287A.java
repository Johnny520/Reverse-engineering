package p027E4;

import java.io.IOException;
import p118X3.AbstractC1687I;
import p118X3.C1711u;
import p179i4.AbstractC2352g;
import p208n4.C2716o;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: E4.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0287A extends AbstractC1687I {

    /* JADX INFO: renamed from: f */
    public final AbstractC1687I f917f;

    /* JADX INFO: renamed from: g */
    public final C2716o f918g;

    /* JADX INFO: renamed from: h */
    public IOException f919h;

    public C0287A(AbstractC1687I abstractC1687I) {
        this.f917f = abstractC1687I;
        this.f918g = AbstractC2352g.m4199l(new C0339z(this, abstractC1687I.mo507f()));
    }

    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: c */
    public final long mo505c() {
        return this.f917f.mo505c();
    }

    @Override // p118X3.AbstractC1687I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f917f.close();
    }

    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: d */
    public final C1711u mo506d() {
        return this.f917f.mo506d();
    }

    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: f */
    public final InterfaceC2708g mo507f() {
        return this.f918g;
    }
}
