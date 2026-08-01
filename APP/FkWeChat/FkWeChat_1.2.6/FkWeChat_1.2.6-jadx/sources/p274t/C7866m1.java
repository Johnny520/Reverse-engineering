package p274t;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p121i3.AbstractC3174d;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3520f0;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p151k2.C3945l;
import p151k2.InterfaceC3937d;
import p151k2.InterfaceC3943j;
import p151k2.InterfaceC3944k;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.m1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7866m1 implements InterfaceC3520f0, InterfaceC3937d, InterfaceC3943j {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7888q3 f26209b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0512i2 f26210c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f26211d;

    public C7866m1(InterfaceC7888q3 interfaceC7888q3) {
        this.f26209b = interfaceC7888q3;
        this.f26210c = AbstractC0522j5.m1773e(interfaceC7888q3, null, 2, null);
        this.f26211d = AbstractC0522j5.m1773e(interfaceC7888q3, null, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public static C4700i0 m30413j(AbstractC3545l1 abstractC3545l1, int i10, int i11, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, i10, i11, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    @Override // p135j2.InterfaceC3520f0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo2841d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        final int iMo30230c = m30415m().mo30230c(interfaceC3561q0, interfaceC3561q0.getLayoutDirection());
        final int iMo30229b = m30415m().mo30229b(interfaceC3561q0);
        int iMo30228a = m30415m().mo30228a(interfaceC3561q0, interfaceC3561q0.getLayoutDirection()) + iMo30230c;
        int iMo30231d = m30415m().mo30231d(interfaceC3561q0) + iMo30229b;
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(AbstractC3174d.m11992i(j10, -iMo30228a, -iMo30231d));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, AbstractC3174d.m11990g(j10, abstractC3545l1Mo13148X.m13264M0() + iMo30228a), AbstractC3174d.m11989f(j10, abstractC3545l1Mo13148X.m13259G0() + iMo30231d), null, new InterfaceC0184l() { // from class: t.l1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7866m1.m30413j(abstractC3545l1Mo13148X, iMo30230c, iMo30229b, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7866m1) {
            return AbstractC1061t.m3842c(((C7866m1) obj).f26209b, this.f26209b);
        }
        return false;
    }

    @Override // p151k2.InterfaceC3937d
    /* JADX INFO: renamed from: f */
    public void mo15636f(InterfaceC3944k interfaceC3944k) {
        InterfaceC7888q3 interfaceC7888q3 = (InterfaceC7888q3) interfaceC3944k.mo15645q(AbstractC7913v3.m30552b());
        m30418q(AbstractC7903t3.m30519c(this.f26209b, interfaceC7888q3));
        m30417p(AbstractC7903t3.m30521e(interfaceC7888q3, this.f26209b));
    }

    @Override // p151k2.InterfaceC3943j
    public C3945l getKey() {
        return AbstractC7913v3.m30552b();
    }

    public int hashCode() {
        return this.f26209b.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC7888q3 m30414k() {
        return (InterfaceC7888q3) this.f26211d.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC7888q3 m30415m() {
        return (InterfaceC7888q3) this.f26210c.getValue();
    }

    @Override // p151k2.InterfaceC3943j
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InterfaceC7888q3 getValue() {
        return m30414k();
    }

    /* JADX INFO: renamed from: p */
    public final void m30417p(InterfaceC7888q3 interfaceC7888q3) {
        this.f26211d.setValue(interfaceC7888q3);
    }

    /* JADX INFO: renamed from: q */
    public final void m30418q(InterfaceC7888q3 interfaceC7888q3) {
        this.f26210c.setValue(interfaceC7888q3);
    }
}
