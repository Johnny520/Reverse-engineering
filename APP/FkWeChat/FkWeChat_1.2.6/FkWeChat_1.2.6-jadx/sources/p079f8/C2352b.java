package p079f8;

import ec.AbstractC2210z1;
import ec.C2161n0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import ec.InterfaceC2208z;
import io.ktor.utils.p131io.C3481s;
import io.ktor.utils.p131io.InterfaceC3468g;
import java.io.EOFException;
import java.io.IOException;
import p010a9.InterfaceC0188p;
import p064e8.AbstractC2051d;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p215oc.C5708d;
import p215oc.InterfaceC5718m;
import p215oc.InterfaceC5728w;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: f8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2352b implements InterfaceC3468g {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5718m f6462b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5980j f6463c;

    /* JADX INFO: renamed from: d */
    public C3481s f6464d;

    /* JADX INFO: renamed from: e */
    public final C5708d f6465e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2208z f6466f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5980j f6467g;

    /* JADX INFO: renamed from: f8.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public int f6468q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f6469r;

        /* JADX INFO: renamed from: t */
        public int f6471t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f6469r = obj;
            this.f6471t |= Integer.MIN_VALUE;
            return C2352b.this.mo8541c(0, this);
        }
    }

    /* JADX INFO: renamed from: f8.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f6472q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ int f6474s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f6474s = i10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C2352b.this.new b(this.f6474s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f6472q != 0) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            long jMo23100N = 0;
            while (AbstractC2051d.m7400d(C2352b.this.f6465e) < this.f6474s && jMo23100N >= 0) {
                try {
                    jMo23100N = C2352b.this.f6462b.mo23100N(C2352b.this.f6465e, Long.MAX_VALUE);
                } catch (EOFException unused) {
                    jMo23100N = -1;
                }
            }
            if (jMo23100N == -1) {
                C2352b.this.f6462b.close();
                C2352b.this.m8545i().mo7943r0();
                C2352b.this.f6464d = new C3481s(null);
            }
            return C4700i0.f13910a;
        }
    }

    public C2352b(InterfaceC5718m interfaceC5718m, InterfaceC5980j interfaceC5980j) {
        interfaceC5718m.getClass();
        interfaceC5980j.getClass();
        this.f6462b = interfaceC5718m;
        this.f6463c = interfaceC5980j;
        this.f6465e = new C5708d();
        InterfaceC2208z interfaceC2208zM7948a = AbstractC2210z1.m7948a((InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g));
        this.f6466f = interfaceC2208zM7948a;
        this.f6467g = interfaceC5980j.mo1651c0(interfaceC2208zM7948a).mo1651c0(new C2161n0("RawSourceChannel"));
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: a */
    public Throwable mo8540a() {
        C3481s c3481s = this.f6464d;
        if (c3481s != null) {
            return C3481s.m12994c(c3481s, null, 1, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8541c(int r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p079f8.C2352b.a
            if (r0 == 0) goto L13
            r0 = r7
            f8.b$a r0 = (p079f8.C2352b.a) r0
            int r1 = r0.f6471t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6471t = r1
            goto L18
        L13:
            f8.b$a r0 = new f8.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6469r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f6471t
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            int r6 = r0.f6468q
            p172l8.AbstractC4713t.m18808b(r7)
            goto L51
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L32:
            p172l8.AbstractC4713t.m18808b(r7)
            io.ktor.utils.io.s r7 = r5.f6464d
            if (r7 == 0) goto L3e
            java.lang.Boolean r6 = p257r8.AbstractC6533b.m25845a(r3)
            return r6
        L3e:
            p8.j r7 = r5.f6467g
            f8.b$b r2 = new f8.b$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f6468q = r6
            r0.f6471t = r3
            java.lang.Object r7 = ec.AbstractC2140i.m7762g(r7, r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            oc.d r7 = r5.f6465e
            long r0 = p064e8.AbstractC2051d.m7400d(r7)
            long r6 = (long) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L5d
            goto L5e
        L5d:
            r3 = 0
        L5e:
            java.lang.Boolean r6 = p257r8.AbstractC6533b.m25845a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f8.C2352b.mo8541c(int, p8.f):java.lang.Object");
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: e */
    public InterfaceC5728w mo8542e() {
        return this.f6465e;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: g */
    public void mo8543g(Throwable th) {
        String message;
        String message2;
        if (this.f6464d != null) {
            return;
        }
        InterfaceC2208z interfaceC2208z = this.f6466f;
        String str = "Channel was cancelled";
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        AbstractC2210z1.m7950c(interfaceC2208z, message, th);
        this.f6462b.close();
        if (th != null && (message2 = th.getMessage()) != null) {
            str = message2;
        }
        this.f6464d = new C3481s(new IOException(str, th));
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: h */
    public boolean mo8544h() {
        return this.f6464d != null && this.f6465e.mo23108g();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC2208z m8545i() {
        return this.f6466f;
    }
}
