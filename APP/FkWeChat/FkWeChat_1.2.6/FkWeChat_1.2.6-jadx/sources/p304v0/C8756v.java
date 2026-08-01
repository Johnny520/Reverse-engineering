package p304v0;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.C1047m;
import p102h1.AbstractC2819a0;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p163l.AbstractC4336n3;
import p163l.C4271b;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;

/* JADX INFO: renamed from: v0.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8756v implements InterfaceC8753s {

    /* JADX INFO: renamed from: b */
    public static final a f29142b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2843x f29143c = AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: v0.t
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C8756v.m33587f((InterfaceC2821b0) obj, (C8756v) obj2);
        }
    }, new InterfaceC0184l() { // from class: v0.u
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C8756v.m33588g(((Float) obj).floatValue());
        }
    });

    /* JADX INFO: renamed from: a */
    public final C4271b f29144a;

    public C8756v() {
        this(new C4271b(Float.valueOf(0.0f), AbstractC4336n3.m17025t(C1047m.f3206a), null, null, 12, null));
    }

    /* JADX INFO: renamed from: f */
    public static Float m33587f(InterfaceC2821b0 interfaceC2821b0, C8756v c8756v) {
        return (Float) c8756v.f29144a.m16795m();
    }

    /* JADX INFO: renamed from: g */
    public static C8756v m33588g(float f10) {
        return new C8756v(new C4271b(Float.valueOf(f10), AbstractC4336n3.m17025t(C1047m.f3206a), null, null, 12, null));
    }

    @Override // p304v0.InterfaceC8753s
    /* JADX INFO: renamed from: a */
    public float mo33582a() {
        return ((Number) this.f29144a.m16795m()).floatValue();
    }

    @Override // p304v0.InterfaceC8753s
    /* JADX INFO: renamed from: b */
    public Object mo33583b(float f10, InterfaceC5976f interfaceC5976f) {
        Object objM16802t = this.f29144a.m16802t(AbstractC6533b.m25847c(f10), interfaceC5976f);
        return objM16802t == AbstractC6325c.m24992g() ? objM16802t : C4700i0.f13910a;
    }

    @Override // p304v0.InterfaceC8753s
    /* JADX INFO: renamed from: c */
    public Object mo33584c(InterfaceC5976f interfaceC5976f) {
        Object objM16787f = C4271b.m16787f(this.f29144a, AbstractC6533b.m25847c(1.0f), null, null, null, interfaceC5976f, 14, null);
        return objM16787f == AbstractC6325c.m24992g() ? objM16787f : C4700i0.f13910a;
    }

    @Override // p304v0.InterfaceC8753s
    /* JADX INFO: renamed from: d */
    public boolean mo33585d() {
        return this.f29144a.m16798p();
    }

    @Override // p304v0.InterfaceC8753s
    /* JADX INFO: renamed from: e */
    public Object mo33586e(InterfaceC5976f interfaceC5976f) {
        Object objM16787f = C4271b.m16787f(this.f29144a, AbstractC6533b.m25847c(0.0f), null, null, null, interfaceC5976f, 14, null);
        return objM16787f == AbstractC6325c.m24992g() ? objM16787f : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: v0.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m33590a() {
            return C8756v.f29143c;
        }

        public a() {
        }
    }

    public C8756v(C4271b c4271b) {
        this.f29144a = c4271b;
    }
}
