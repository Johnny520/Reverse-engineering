package p264s0;

import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6431g;
import p248r.InterfaceC6434j;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: s0.z7 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7039z7 {

    /* JADX INFO: renamed from: a */
    public final C6664b8 f23414a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6434j f23415b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6434j f23416c;

    /* JADX INFO: renamed from: s0.z7$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f23417q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ boolean f23419s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC6431g f23420t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, InterfaceC6431g interfaceC6431g, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f23419s = z10;
            this.f23420t = interfaceC6431g;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C7039z7.this.new a(this.f23419s, this.f23420t, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f23417q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC6434j interfaceC6434jM27721a = C7039z7.this.m27721a(this.f23419s);
                InterfaceC6431g interfaceC6431g = this.f23420t;
                this.f23417q = 1;
                if (interfaceC6434jM27721a.mo25464b(interfaceC6431g, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    public C7039z7(C6664b8 c6664b8, InterfaceC6434j interfaceC6434j, InterfaceC6434j interfaceC6434j2) {
        this.f23414a = c6664b8;
        this.f23415b = interfaceC6434j;
        this.f23416c = interfaceC6434j2;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6434j m27721a(boolean z10) {
        return z10 ? this.f23415b : this.f23416c;
    }

    /* JADX INFO: renamed from: b */
    public final void m27722b(boolean z10, float f10, InterfaceC6431g interfaceC6431g, InterfaceC2165o0 interfaceC2165o0) {
        C6664b8 c6664b8 = this.f23414a;
        c6664b8.m26393A(z10, f10 - (z10 ? c6664b8.m26429q() : c6664b8.m26428p()));
        AbstractC2148k.m7817d(interfaceC2165o0, null, null, new a(z10, interfaceC6431g, null), 3, null);
    }

    /* JADX INFO: renamed from: c */
    public final int m27723c(float f10) {
        return Float.compare(Math.abs(this.f23414a.m26429q() - f10), Math.abs(this.f23414a.m26428p() - f10));
    }
}
