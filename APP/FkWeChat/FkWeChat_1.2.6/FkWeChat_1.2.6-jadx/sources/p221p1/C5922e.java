package p221p1;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p172l8.C4700i0;
import p290u1.InterfaceC8484c;

/* JADX INFO: renamed from: p1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5922e implements InterfaceC3175e {

    /* JADX INFO: renamed from: q */
    public InterfaceC5919b f18822q = C5932o.f18833q;

    /* JADX INFO: renamed from: r */
    public C5928k f18823r;

    /* JADX INFO: renamed from: s */
    public InterfaceC8484c f18824s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0173a f18825t;

    /* JADX INFO: renamed from: p1.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0184l f18826r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0184l interfaceC0184l) {
            super(1);
            this.f18826r = interfaceC0184l;
        }

        /* JADX INFO: renamed from: a */
        public final void m23835a(InterfaceC8484c interfaceC8484c) {
            this.f18826r.mo27m(interfaceC8484c);
            interfaceC8484c.mo18034W1();
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m23835a((InterfaceC8484c) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m23827b() {
        return this.f18822q.mo17555b();
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f18822q.getDensity().mo1231c1();
    }

    /* JADX INFO: renamed from: d */
    public final C5928k m23828d() {
        return this.f18823r;
    }

    /* JADX INFO: renamed from: g */
    public final C5928k m23829g(InterfaceC0184l interfaceC0184l) {
        return m23830l(new a(interfaceC0184l));
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f18822q.getDensity().getDensity();
    }

    public final EnumC3191u getLayoutDirection() {
        return this.f18822q.getLayoutDirection();
    }

    /* JADX INFO: renamed from: l */
    public final C5928k m23830l(InterfaceC0184l interfaceC0184l) {
        C5928k c5928k = new C5928k(interfaceC0184l);
        this.f18823r = c5928k;
        return c5928k;
    }

    /* JADX INFO: renamed from: o */
    public final void m23831o(InterfaceC5919b interfaceC5919b) {
        this.f18822q = interfaceC5919b;
    }

    /* JADX INFO: renamed from: q */
    public final void m23832q(InterfaceC8484c interfaceC8484c) {
        this.f18824s = interfaceC8484c;
    }

    /* JADX INFO: renamed from: t */
    public final void m23833t(C5928k c5928k) {
        this.f18823r = c5928k;
    }

    /* JADX INFO: renamed from: u */
    public final void m23834u(InterfaceC0173a interfaceC0173a) {
        this.f18825t = interfaceC0173a;
    }
}
