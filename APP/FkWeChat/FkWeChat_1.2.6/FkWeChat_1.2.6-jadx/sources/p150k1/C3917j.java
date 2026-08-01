package p150k1;

import androidx.compose.runtime.C0617x;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p228p8.InterfaceC5980j;
import p333x0.InterfaceC9300f;

/* JADX INFO: renamed from: k1.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3917j implements InterfaceC3915h, InterfaceC9300f, InterfaceC5980j.b {

    /* JADX INFO: renamed from: r */
    public static final a f11381r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final int f11382s = 8;

    /* JADX INFO: renamed from: q */
    public final C0617x f11383q;

    public C3917j(C0617x c0617x) {
        this.f11383q = c0617x;
    }

    /* JADX INFO: renamed from: d */
    public static C3907a m15597d(C3917j c3917j, Object obj) {
        return c3917j.f11383q.m2407s1(obj);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public /* bridge */ InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC5980j.b.a.m23987c(this, cVar);
    }

    @Override // p150k1.InterfaceC3915h
    /* JADX INFO: renamed from: a */
    public boolean mo15596a(Throwable th, final Object obj) {
        return AbstractC3912e.m15589f(th, new InterfaceC0173a() { // from class: k1.i
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3917j.m15597d(this.f11379q, obj);
            }
        });
    }

    @Override // p333x0.InterfaceC9300f
    /* JADX INFO: renamed from: b */
    public List mo15598b(Integer num) {
        return this.f11383q.m2376Z0();
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC5980j.b.a.m23988d(this, interfaceC5980j);
    }

    @Override // p228p8.InterfaceC5980j.b
    public InterfaceC5980j.c getKey() {
        return f11381r;
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public /* bridge */ InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC5980j.b.a.m23986b(this, cVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public /* bridge */ Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC5980j.b.a.m23985a(this, obj, interfaceC0188p);
    }

    /* JADX INFO: renamed from: k1.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5980j.c {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        public a() {
        }
    }
}
