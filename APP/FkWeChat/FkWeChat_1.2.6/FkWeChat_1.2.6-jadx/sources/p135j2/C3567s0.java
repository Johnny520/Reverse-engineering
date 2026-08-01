package p135j2;

import p010a9.InterfaceC0184l;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p121i3.C3189s;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: j2.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3567s0 {

    /* JADX INFO: renamed from: a */
    public static final C3567s0 f9910a = new C3567s0();

    /* JADX INFO: renamed from: j2.s0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3552n0 {

        /* JADX INFO: renamed from: q */
        public final InterfaceC3563r f9911q;

        /* JADX INFO: renamed from: r */
        public final c f9912r;

        /* JADX INFO: renamed from: s */
        public final d f9913s;

        public a(InterfaceC3563r interfaceC3563r, c cVar, d dVar) {
            this.f9911q = interfaceC3563r;
            this.f9912r = cVar;
            this.f9913s = dVar;
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: S */
        public int mo13146S(int i10) {
            return this.f9911q.mo13146S(i10);
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: W */
        public int mo13147W(int i10) {
            return this.f9911q.mo13147W(i10);
        }

        @Override // p135j2.InterfaceC3552n0
        /* JADX INFO: renamed from: X */
        public AbstractC3545l1 mo13148X(long j10) {
            d dVar = this.f9913s;
            d dVar2 = d.f9918q;
            c cVar = this.f9912r;
            if (dVar == dVar2) {
                c cVar2 = c.f9915r;
                InterfaceC3563r interfaceC3563r = this.f9911q;
                return new b(cVar == cVar2 ? interfaceC3563r.mo13147W(C3173c.m11972k(j10)) : interfaceC3563r.mo13146S(C3173c.m11972k(j10)), C3173c.m11968g(j10) ? C3173c.m11972k(j10) : 32767);
            }
            c cVar3 = c.f9915r;
            InterfaceC3563r interfaceC3563r2 = this.f9911q;
            return new b(C3173c.m11969h(j10) ? C3173c.m11973l(j10) : 32767, cVar == cVar3 ? interfaceC3563r2.mo13150t(C3173c.m11973l(j10)) : interfaceC3563r2.mo13151z0(C3173c.m11973l(j10)));
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: o */
        public Object mo13149o() {
            return this.f9911q.mo13149o();
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: t */
        public int mo13150t(int i10) {
            return this.f9911q.mo13150t(i10);
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: z0 */
        public int mo13151z0(int i10) {
            return this.f9911q.mo13151z0(i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j2.s0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: q */
        public static final c f9914q = new c("Min", 0);

        /* JADX INFO: renamed from: r */
        public static final c f9915r = new c("Max", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ c[] f9916s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f9917t;

        static {
            c[] cVarArrM13352a = m13352a();
            f9916s = cVarArrM13352a;
            f9917t = AbstractC7198b.m28437a(cVarArrM13352a);
        }

        public c(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ c[] m13352a() {
            return new c[]{f9914q, f9915r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f9916s.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j2.s0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: q */
        public static final d f9918q = new d("Width", 0);

        /* JADX INFO: renamed from: r */
        public static final d f9919r = new d("Height", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ d[] f9920s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f9921t;

        static {
            d[] dVarArrM13353a = m13353a();
            f9920s = dVarArrM13353a;
            f9921t = AbstractC7198b.m28437a(dVarArrM13353a);
        }

        public d(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ d[] m13353a() {
            return new d[]{f9918q, f9919r};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f9920s.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m13348a(InterfaceC3520f0 interfaceC3520f0, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3520f0.mo2841d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f9915r, d.f9919r), AbstractC3174d.m11985b(0, i10, 0, 0, 13, null)).mo13077a();
    }

    /* JADX INFO: renamed from: b */
    public final int m13349b(InterfaceC3520f0 interfaceC3520f0, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3520f0.mo2841d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f9915r, d.f9918q), AbstractC3174d.m11985b(0, 0, 0, i10, 7, null)).mo13078e();
    }

    /* JADX INFO: renamed from: c */
    public final int m13350c(InterfaceC3520f0 interfaceC3520f0, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3520f0.mo2841d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f9914q, d.f9919r), AbstractC3174d.m11985b(0, i10, 0, 0, 13, null)).mo13077a();
    }

    /* JADX INFO: renamed from: d */
    public final int m13351d(InterfaceC3520f0 interfaceC3520f0, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3520f0.mo2841d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f9914q, d.f9918q), AbstractC3174d.m11985b(0, 0, 0, i10, 7, null)).mo13078e();
    }

    /* JADX INFO: renamed from: j2.s0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC3545l1 {
        public b(int i10, int i11) {
            m13267T0(C3189s.m12082c((((long) i11) & 4294967295L) | (((long) i10) << 32)));
        }

        @Override // p135j2.InterfaceC3564r0
        /* JADX INFO: renamed from: G */
        public int mo13237G(AbstractC3499a abstractC3499a) {
            return Integer.MIN_VALUE;
        }

        @Override // p135j2.AbstractC3545l1
        /* JADX INFO: renamed from: Q0 */
        public void mo13238Q0(long j10, float f10, InterfaceC0184l interfaceC0184l) {
        }
    }
}
