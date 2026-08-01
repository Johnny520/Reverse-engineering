package p350y1;

import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p121i3.EnumC3191u;
import p172l8.C4700i0;
import p250r1.C6461k;
import p265s1.AbstractC7133r1;
import p290u1.InterfaceC8485d;
import p290u1.InterfaceC8487f;
import p334x1.AbstractC9307c;

/* JADX INFO: renamed from: y1.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9529q extends AbstractC9307c {

    /* JADX INFO: renamed from: m */
    public static final int f32501m = 8;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0512i2 f32502g = AbstractC0522j5.m1773e(C6461k.m25615c(C6461k.f20335b.m25627b()), null, 2, null);

    /* JADX INFO: renamed from: h */
    public final InterfaceC0512i2 f32503h = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: i */
    public final C9525m f32504i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0512i2 f32505j;

    /* JADX INFO: renamed from: k */
    public float f32506k;

    /* JADX INFO: renamed from: l */
    public AbstractC7133r1 f32507l;

    /* JADX INFO: renamed from: y1.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m37296a() {
            C9529q.this.m37291p(C4700i0.f13910a);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m37296a();
            return C4700i0.f13910a;
        }
    }

    public C9529q(C9515c c9515c) {
        C9525m c9525m = new C9525m(c9515c);
        c9525m.m37260o(new a());
        this.f32504i = c9525m;
        this.f32505j = AbstractC0473c5.m1570i(C4700i0.f13910a, AbstractC0473c5.m1572k());
        this.f32506k = 1.0f;
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: a */
    public boolean mo36267a(float f10) {
        this.f32506k = f10;
        return true;
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: b */
    public boolean mo36268b(AbstractC7133r1 abstractC7133r1) {
        this.f32507l = abstractC7133r1;
        return true;
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: h */
    public long mo36269h() {
        return m37289n();
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: j */
    public void mo36270j(InterfaceC8487f interfaceC8487f) {
        C9525m c9525m = this.f32504i;
        AbstractC7133r1 abstractC7133r1M37256k = this.f32507l;
        if (abstractC7133r1M37256k == null) {
            abstractC7133r1M37256k = c9525m.m37256k();
        }
        if (m37287l() && interfaceC8487f.getLayoutDirection() == EnumC3191u.f8485r) {
            long jMo18030G1 = interfaceC8487f.mo18030G1();
            InterfaceC8485d interfaceC8485dMo18044n1 = interfaceC8487f.mo18044n1();
            long jMo32628b = interfaceC8485dMo18044n1.mo32628b();
            interfaceC8485dMo18044n1.mo32635i().mo27841n();
            try {
                interfaceC8485dMo18044n1.mo32632f().mo32642g(-1.0f, 1.0f, jMo18030G1);
                c9525m.m37254i(interfaceC8487f, this.f32506k, abstractC7133r1M37256k);
            } finally {
                interfaceC8485dMo18044n1.mo32635i().mo27847w();
                interfaceC8485dMo18044n1.mo32633g(jMo32628b);
            }
        } else {
            c9525m.m37254i(interfaceC8487f, this.f32506k, abstractC7133r1M37256k);
        }
        m37288m();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m37287l() {
        return ((Boolean) this.f32503h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final C4700i0 m37288m() {
        this.f32505j.getValue();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: n */
    public final long m37289n() {
        return ((C6461k) this.f32502g.getValue()).m25625m();
    }

    /* JADX INFO: renamed from: o */
    public final void m37290o(boolean z10) {
        this.f32503h.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: p */
    public final void m37291p(C4700i0 c4700i0) {
        this.f32505j.setValue(c4700i0);
    }

    /* JADX INFO: renamed from: q */
    public final void m37292q(AbstractC7133r1 abstractC7133r1) {
        this.f32504i.m37259n(abstractC7133r1);
    }

    /* JADX INFO: renamed from: r */
    public final void m37293r(String str) {
        this.f32504i.m37261p(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m37294s(long j10) {
        this.f32502g.setValue(C6461k.m25615c(j10));
    }

    /* JADX INFO: renamed from: t */
    public final void m37295t(long j10) {
        this.f32504i.m37262q(j10);
    }
}
