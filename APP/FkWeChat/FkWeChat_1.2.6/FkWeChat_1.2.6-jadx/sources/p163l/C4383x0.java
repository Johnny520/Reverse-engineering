package p163l;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p117i.C3055g0;
import p117i.C3058h0;

/* JADX INFO: renamed from: l.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4383x0 implements InterfaceC4283d0 {

    /* JADX INFO: renamed from: a */
    public final b f12831a;

    /* JADX INFO: renamed from: l.x0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC4388y0 {
        public b() {
            super(null);
        }

        /* JADX INFO: renamed from: f */
        public a m17159f(Object obj, int i10) {
            a aVar = new a(obj, null, 0, 6, null);
            m17167c().m11326r(i10, aVar);
            return aVar;
        }
    }

    public C4383x0(b bVar) {
        this.f12831a = bVar;
    }

    @Override // p163l.InterfaceC4283d0, p163l.InterfaceC4317k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4386x3 mo16829a(InterfaceC4365t2 interfaceC4365t2) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i10;
        C3055g0 c3055g0 = new C3055g0(this.f12831a.m17167c().m11451d() + 2);
        C3058h0 c3058h0 = new C3058h0(this.f12831a.m17167c().m11451d());
        C3058h0 c3058h0M17167c = this.f12831a.m17167c();
        int[] iArr3 = c3058h0M17167c.f8156b;
        Object[] objArr = c3058h0M17167c.f8157c;
        long[] jArr3 = c3058h0M17167c.f8155a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            a aVar = (a) objArr[i15];
                            c3055g0.m11303j(i16);
                            i10 = i12;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            c3058h0.m11326r(i16, new C4381w3((AbstractC4357s) interfaceC4365t2.mo17122a().mo27m(aVar.m17151b()), aVar.m17150a(), aVar.m17158d(), null));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.f12831a.m17167c().m11448a(0)) {
            c3055g0.m11302i(0, 0);
        }
        if (!this.f12831a.m17167c().m11448a(this.f12831a.m17166b())) {
            c3055g0.m11303j(this.f12831a.m17166b());
        }
        c3055g0.m11310q();
        return new C4386x3(c3055g0, c3058h0, this.f12831a.m17166b(), this.f12831a.m17165a(), AbstractC4298g0.m16929d(), AbstractC4372v.f12793a.m17129a(), null);
    }

    /* JADX INFO: renamed from: l.x0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC4378w0 {

        /* JADX INFO: renamed from: c */
        public int f12832c;

        public /* synthetic */ a(Object obj, InterfaceC4288e0 interfaceC4288e0, int i10, int i11, AbstractC1043k abstractC1043k) {
            this(obj, (i11 & 2) != 0 ? AbstractC4298g0.m16929d() : interfaceC4288e0, (i11 & 4) != 0 ? AbstractC4372v.f12793a.m17129a() : i10, null);
        }

        /* JADX INFO: renamed from: d */
        public final int m17158d() {
            return this.f12832c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(aVar.m17151b(), m17151b()) && AbstractC1061t.m3842c(aVar.m17150a(), m17150a()) && AbstractC4372v.m17126c(aVar.f12832c, this.f12832c);
        }

        public int hashCode() {
            Object objM17151b = m17151b();
            return ((((objM17151b != null ? objM17151b.hashCode() : 0) * 31) + AbstractC4372v.m17127d(this.f12832c)) * 31) + m17150a().hashCode();
        }

        public /* synthetic */ a(Object obj, InterfaceC4288e0 interfaceC4288e0, int i10, AbstractC1043k abstractC1043k) {
            this(obj, interfaceC4288e0, i10);
        }

        public a(Object obj, InterfaceC4288e0 interfaceC4288e0, int i10) {
            super(obj, interfaceC4288e0, null);
            this.f12832c = i10;
        }
    }
}
