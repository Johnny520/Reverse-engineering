package p059e3;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.emoji2.text.C0644c;

/* JADX INFO: renamed from: e3.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2018m implements InterfaceC2021p {

    /* JADX INFO: renamed from: a */
    public InterfaceC0564p5 f5608a;

    /* JADX INFO: renamed from: e3.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C0644c.f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0512i2 f5609a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2018m f5610b;

        public a(InterfaceC0512i2 interfaceC0512i2, C2018m c2018m) {
            this.f5609a = interfaceC0512i2;
            this.f5610b = c2018m;
        }

        @Override // androidx.emoji2.text.C0644c.f
        /* JADX INFO: renamed from: a */
        public void mo2541a(Throwable th) {
            this.f5610b.f5608a = AbstractC2022q.f5615a;
        }

        @Override // androidx.emoji2.text.C0644c.f
        /* JADX INFO: renamed from: b */
        public void mo2542b() {
            this.f5609a.setValue(Boolean.TRUE);
            this.f5610b.f5608a = new C2023r(true);
        }
    }

    public C2018m() {
        this.f5608a = C0644c.m2518i() ? m7286c() : null;
    }

    @Override // p059e3.InterfaceC2021p
    /* JADX INFO: renamed from: a */
    public InterfaceC0564p5 mo7285a() {
        InterfaceC0564p5 interfaceC0564p5 = this.f5608a;
        if (interfaceC0564p5 != null) {
            interfaceC0564p5.getClass();
            return interfaceC0564p5;
        }
        if (!C0644c.m2518i()) {
            return AbstractC2022q.f5615a;
        }
        InterfaceC0564p5 interfaceC0564p5M7286c = m7286c();
        this.f5608a = interfaceC0564p5M7286c;
        interfaceC0564p5M7286c.getClass();
        return interfaceC0564p5M7286c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0564p5 m7286c() {
        C0644c c0644cM2516c = C0644c.m2516c();
        if (c0644cM2516c.m2522g() == 1) {
            return new C2023r(true);
        }
        InterfaceC0512i2 interfaceC0512i2M1773e = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);
        c0644cM2516c.m2530q(new a(interfaceC0512i2M1773e, this));
        return interfaceC0512i2M1773e;
    }
}
