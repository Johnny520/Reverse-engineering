package p361yc;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p098g9.InterfaceC2549c;
import p300uc.InterfaceC8647b;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: yc.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9761t implements InterfaceC9774v2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f33033a;

    /* JADX INFO: renamed from: b */
    public final C9771v f33034b;

    /* JADX INFO: renamed from: yc.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC2549c f33036r;

        public a(InterfaceC2549c interfaceC2549c) {
            this.f33036r = interfaceC2549c;
        }

        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return new C9726m((InterfaceC8647b) C9761t.this.m38054b().mo27m(this.f33036r));
        }
    }

    public C9761t(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        this.f33033a = interfaceC0184l;
        this.f33034b = new C9771v();
    }

    @Override // p361yc.InterfaceC9774v2
    /* JADX INFO: renamed from: a */
    public InterfaceC8647b mo38053a(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        Object obj = this.f33034b.get(AbstractC9886a.m38367b(interfaceC2549c));
        obj.getClass();
        C9738o1 c9738o1 = (C9738o1) obj;
        Object objM37990a = c9738o1.f33007a.get();
        if (objM37990a == null) {
            objM37990a = c9738o1.m37990a(new a(interfaceC2549c));
        }
        return ((C9726m) objM37990a).f32992a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l m38054b() {
        return this.f33033a;
    }
}
