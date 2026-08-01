package p332x;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p102h1.AbstractC2820b;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: x.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9246e extends AbstractC9242c1 {

    /* JADX INFO: renamed from: M */
    public static final a f31578M = new a(null);

    /* JADX INFO: renamed from: N */
    public static final InterfaceC2843x f31579N = AbstractC2820b.m10040b(new InterfaceC0188p() { // from class: x.b
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C9246e.m36043r0((InterfaceC2821b0) obj, (C9246e) obj2);
        }
    }, new InterfaceC0184l() { // from class: x.c
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C9246e.m36044s0((List) obj);
        }
    });

    /* JADX INFO: renamed from: L */
    public InterfaceC0512i2 f31580L;

    public C9246e(int i10, float f10, InterfaceC0173a interfaceC0173a) {
        super(i10, f10);
        this.f31580L = AbstractC0522j5.m1773e(interfaceC0173a, null, 2, null);
    }

    /* JADX INFO: renamed from: r0 */
    public static List m36043r0(InterfaceC2821b0 interfaceC2821b0, C9246e c9246e) {
        return AbstractC5114x.m20803r(Integer.valueOf(c9246e.m36036x()), Float.valueOf(AbstractC2368o.m8585l(c9246e.m36037y(), -0.5f, 0.5f)), Integer.valueOf(c9246e.mo35999J()));
    }

    /* JADX INFO: renamed from: s0 */
    public static C9246e m36044s0(final List list) {
        Object obj = list.get(0);
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        obj2.getClass();
        return new C9246e(iIntValue, ((Float) obj2).floatValue(), new InterfaceC0173a() { // from class: x.d
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Integer.valueOf(C9246e.m36045t0(list));
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static int m36045t0(List list) {
        Object obj = list.get(2);
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    @Override // p332x.AbstractC9242c1
    /* JADX INFO: renamed from: J */
    public int mo35999J() {
        return ((Number) ((InterfaceC0173a) this.f31580L.getValue()).invoke()).intValue();
    }

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC0512i2 m36047v0() {
        return this.f31580L;
    }

    /* JADX INFO: renamed from: x.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m36048a() {
            return C9246e.f31579N;
        }

        public a() {
        }
    }
}
