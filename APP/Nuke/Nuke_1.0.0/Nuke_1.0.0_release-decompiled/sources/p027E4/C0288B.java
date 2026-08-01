package p027E4;

import p118X3.AbstractC1687I;
import p118X3.C1711u;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: E4.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0288B extends AbstractC1687I {

    /* JADX INFO: renamed from: f */
    public final C1711u f920f;

    /* JADX INFO: renamed from: g */
    public final long f921g;

    public C0288B(C1711u c1711u, long j5) {
        this.f920f = c1711u;
        this.f921g = j5;
    }

    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: c */
    public final long mo505c() {
        return this.f921g;
    }

    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: d */
    public final C1711u mo506d() {
        return this.f920f;
    }

    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: f */
    public final InterfaceC2708g mo507f() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
