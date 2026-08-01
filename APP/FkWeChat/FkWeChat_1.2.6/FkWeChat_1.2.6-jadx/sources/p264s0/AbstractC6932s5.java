package p264s0;

import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.C1055q;
import p049d9.AbstractC1925a;
import p121i3.C3179i;
import p135j2.C3526g2;
import p135j2.C3547m;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: s0.s5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6932s5 {

    /* JADX INFO: renamed from: a */
    public static final C3547m f22740a = new C3547m(b.f22745y);

    /* JADX INFO: renamed from: b */
    public static final C3526g2 f22741b = new C3526g2(a.f22744y);

    /* JADX INFO: renamed from: c */
    public static final AbstractC0506h3 f22742c = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: s0.q5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return Boolean.valueOf(AbstractC6932s5.m27499b());
        }
    });

    /* JADX INFO: renamed from: d */
    public static final AbstractC0506h3 f22743d = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: s0.r5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC6932s5.m27498a();
        }
    });

    /* JADX INFO: renamed from: s0.s5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final a f22744y = new a();

        public a() {
            super(2, AbstractC1925a.class, "min", "min(II)I", 1);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m27504y(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        /* JADX INFO: renamed from: y */
        public final Integer m27504y(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }
    }

    /* JADX INFO: renamed from: s0.s5$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final b f22745y = new b();

        public b() {
            super(2, AbstractC1925a.class, "min", "min(II)I", 1);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m27505y(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        /* JADX INFO: renamed from: y */
        public final Integer m27505y(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3179i m27498a() {
        return C3179i.m12001h(C3179i.m12003k(48));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27499b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC0506h3 m27500c() {
        return f22743d;
    }

    /* JADX INFO: renamed from: d */
    public static final C3526g2 m27501d() {
        return f22741b;
    }

    /* JADX INFO: renamed from: e */
    public static final C3547m m27502e() {
        return f22740a;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC4507m m27503f(InterfaceC4507m interfaceC4507m) {
        return interfaceC4507m.mo17445i(C6758h6.f21509b);
    }
}
