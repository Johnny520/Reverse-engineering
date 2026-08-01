package p166l2;

import p010a9.InterfaceC0184l;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p121i3.C3189s;
import p135j2.AbstractC3499a;
import p135j2.AbstractC3545l1;
import p135j2.C3575v;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: l2.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4555j1 {

    /* JADX INFO: renamed from: a */
    public static final C4555j1 f13404a = new C4555j1();

    /* JADX INFO: renamed from: l2.j1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3552n0 {

        /* JADX INFO: renamed from: q */
        public final InterfaceC3563r f13405q;

        /* JADX INFO: renamed from: r */
        public final c f13406r;

        /* JADX INFO: renamed from: s */
        public final d f13407s;

        public a(InterfaceC3563r interfaceC3563r, c cVar, d dVar) {
            this.f13405q = interfaceC3563r;
            this.f13406r = cVar;
            this.f13407s = dVar;
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: S */
        public int mo13146S(int i10) {
            return this.f13405q.mo13146S(i10);
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: W */
        public int mo13147W(int i10) {
            return this.f13405q.mo13147W(i10);
        }

        @Override // p135j2.InterfaceC3552n0
        /* JADX INFO: renamed from: X */
        public AbstractC3545l1 mo13148X(long j10) {
            d dVar = this.f13407s;
            d dVar2 = d.f13412q;
            c cVar = this.f13406r;
            if (dVar == dVar2) {
                c cVar2 = c.f13409r;
                InterfaceC3563r interfaceC3563r = this.f13405q;
                return new b(cVar == cVar2 ? interfaceC3563r.mo13147W(C3173c.m11972k(j10)) : interfaceC3563r.mo13146S(C3173c.m11972k(j10)), C3173c.m11968g(j10) ? C3173c.m11972k(j10) : 32767);
            }
            c cVar3 = c.f13409r;
            InterfaceC3563r interfaceC3563r2 = this.f13405q;
            return new b(C3173c.m11969h(j10) ? C3173c.m11973l(j10) : 32767, cVar == cVar3 ? interfaceC3563r2.mo13150t(C3173c.m11973l(j10)) : interfaceC3563r2.mo13151z0(C3173c.m11973l(j10)));
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: o */
        public Object mo13149o() {
            return this.f13405q.mo13149o();
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: t */
        public int mo13150t(int i10) {
            return this.f13405q.mo13150t(i10);
        }

        @Override // p135j2.InterfaceC3563r
        /* JADX INFO: renamed from: z0 */
        public int mo13151z0(int i10) {
            return this.f13405q.mo13151z0(i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: l2.j1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: q */
        public static final c f13408q = new c("Min", 0);

        /* JADX INFO: renamed from: r */
        public static final c f13409r = new c("Max", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ c[] f13410s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f13411t;

        static {
            c[] cVarArrM17997a = m17997a();
            f13410s = cVarArrM17997a;
            f13411t = AbstractC7198b.m28437a(cVarArrM17997a);
        }

        public c(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ c[] m17997a() {
            return new c[]{f13408q, f13409r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f13410s.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: l2.j1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: q */
        public static final d f13412q = new d("Width", 0);

        /* JADX INFO: renamed from: r */
        public static final d f13413r = new d("Height", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ d[] f13414s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f13415t;

        static {
            d[] dVarArrM17998a = m17998a();
            f13414s = dVarArrM17998a;
            f13415t = AbstractC7198b.m28437a(dVarArrM17998a);
        }

        public d(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ d[] m17998a() {
            return new d[]{f13412q, f13413r};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f13414s.clone();
        }
    }

    /* JADX INFO: renamed from: l2.j1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface e {
        /* JADX INFO: renamed from: d */
        InterfaceC3558p0 mo17630d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10);
    }

    /* JADX INFO: renamed from: a */
    public final int m17993a(e eVar, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return eVar.mo17630d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f13409r, d.f13413r), AbstractC3174d.m11985b(0, i10, 0, 0, 13, null)).mo13077a();
    }

    /* JADX INFO: renamed from: b */
    public final int m17994b(e eVar, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return eVar.mo17630d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f13409r, d.f13412q), AbstractC3174d.m11985b(0, 0, 0, i10, 7, null)).mo13078e();
    }

    /* JADX INFO: renamed from: c */
    public final int m17995c(e eVar, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return eVar.mo17630d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f13408q, d.f13413r), AbstractC3174d.m11985b(0, i10, 0, 0, 13, null)).mo13077a();
    }

    /* JADX INFO: renamed from: d */
    public final int m17996d(e eVar, InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return eVar.mo17630d(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), new a(interfaceC3563r, c.f13408q, d.f13412q), AbstractC3174d.m11985b(0, 0, 0, i10, 7, null)).mo13078e();
    }

    /* JADX INFO: renamed from: l2.j1$b */
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
