package p203n;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p117X2.C1671p;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2643a extends AbstractC1184i implements InterfaceC1601c {

    /* JADX INFO: renamed from: h */
    public C2661j f8412h;

    /* JADX INFO: renamed from: i */
    public C1671p f8413i;

    /* JADX INFO: renamed from: j */
    public int f8414j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2647c f8415k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f8416l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2633P f8417m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f8418n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1601c f8419o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2643a(C2647c c2647c, Object obj, C2633P c2633p, long j5, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(1, interfaceC1046d);
        this.f8415k = c2647c;
        this.f8416l = obj;
        this.f8417m = c2633p;
        this.f8418n = j5;
        this.f8419o = interfaceC1601c;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        long j5 = this.f8418n;
        InterfaceC1601c interfaceC1601c = this.f8419o;
        return new C2643a(this.f8415k, this.f8416l, this.f8417m, j5, interfaceC1601c, (InterfaceC1046d) obj).mo8p(C0891q.f2780a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r15) {
        /*
            r14 = this;
            n.P r1 = r14.f8417m
            int r0 = r14.f8414j
            r2 = 1
            n.c r4 = r14.f8415k
            if (r0 == 0) goto L22
            if (r0 != r2) goto L1a
            X2.p r0 = r14.f8413i
            n.j r1 = r14.f8412h
            p127Z2.AbstractC1784a.m3205S(r15)     // Catch: java.util.concurrent.CancellationException -> L15
            r15 = r4
            goto L84
        L15:
            r0 = move-exception
            r15 = r0
        L17:
            r15 = r4
            goto L9c
        L1a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L22:
            p127Z2.AbstractC1784a.m3205S(r15)
            n.j r15 = r4.f8428c     // Catch: java.util.concurrent.CancellationException -> L99
            n.e0 r0 = r4.f8426a     // Catch: java.util.concurrent.CancellationException -> L99
            W2.c r0 = r0.f8459a     // Catch: java.util.concurrent.CancellationException -> L99
            java.lang.Object r3 = r14.f8416l     // Catch: java.util.concurrent.CancellationException -> L99
            java.lang.Object r0 = r0.mo1h(r3)     // Catch: java.util.concurrent.CancellationException -> L99
            n.o r0 = (p203n.AbstractC2670o) r0     // Catch: java.util.concurrent.CancellationException -> L99
            r15.f8479f = r0     // Catch: java.util.concurrent.CancellationException -> L99
            java.lang.Object r15 = r1.f8368c     // Catch: java.util.concurrent.CancellationException -> L99
            T.i0 r0 = r4.f8430e     // Catch: java.util.concurrent.CancellationException -> L99
            r0.setValue(r15)     // Catch: java.util.concurrent.CancellationException -> L99
            T.i0 r15 = r4.f8429d     // Catch: java.util.concurrent.CancellationException -> L99
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L99
            r15.setValue(r0)     // Catch: java.util.concurrent.CancellationException -> L99
            n.j r15 = r4.f8428c     // Catch: java.util.concurrent.CancellationException -> L99
            T.i0 r0 = r15.f8478e     // Catch: java.util.concurrent.CancellationException -> L99
            java.lang.Object r7 = r0.getValue()     // Catch: java.util.concurrent.CancellationException -> L99
            n.o r0 = r15.f8479f     // Catch: java.util.concurrent.CancellationException -> L99
            n.o r8 = p203n.AbstractC2649d.m4612e(r0)     // Catch: java.util.concurrent.CancellationException -> L99
            long r9 = r15.f8480g     // Catch: java.util.concurrent.CancellationException -> L99
            boolean r13 = r15.f8482i     // Catch: java.util.concurrent.CancellationException -> L99
            n.j r5 = new n.j     // Catch: java.util.concurrent.CancellationException -> L99
            n.e0 r6 = r15.f8477d     // Catch: java.util.concurrent.CancellationException -> L99
            r11 = -9223372036854775808
            r5.<init>(r6, r7, r8, r9, r11, r13)     // Catch: java.util.concurrent.CancellationException -> L99
            X2.p r7 = new X2.p     // Catch: java.util.concurrent.CancellationException -> L99
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L99
            long r9 = r14.f8418n     // Catch: java.util.concurrent.CancellationException -> L99
            W2.c r6 = r14.f8419o     // Catch: java.util.concurrent.CancellationException -> L99
            A.D r3 = new A.D     // Catch: java.util.concurrent.CancellationException -> L99
            r8 = 2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L99
            r15 = r4
            r14.f8412h = r5     // Catch: java.util.concurrent.CancellationException -> L8b
            r14.f8413i = r7     // Catch: java.util.concurrent.CancellationException -> L8b
            r14.f8414j = r2     // Catch: java.util.concurrent.CancellationException -> L8b
            r4 = r3
            r0 = r5
            r2 = r9
            r5 = r14
            java.lang.Object r1 = p203n.AbstractC2649d.m4609b(r0, r1, r2, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L8b
            r5 = r0
            P2.a r0 = p079P2.EnumC1152a.f3788d
            if (r1 != r0) goto L82
            return r0
        L82:
            r1 = r5
            r0 = r7
        L84:
            boolean r0 = r0.f5705d     // Catch: java.util.concurrent.CancellationException -> L8b
            if (r0 == 0) goto L8d
            n.g r0 = p203n.EnumC2655g.f8462d     // Catch: java.util.concurrent.CancellationException -> L8b
            goto L8f
        L8b:
            r0 = move-exception
            goto L9c
        L8d:
            n.g r0 = p203n.EnumC2655g.f8463e     // Catch: java.util.concurrent.CancellationException -> L8b
        L8f:
            p203n.C2647c.m4603b(r15)     // Catch: java.util.concurrent.CancellationException -> L8b
            e2.b r2 = new e2.b     // Catch: java.util.concurrent.CancellationException -> L8b
            r3 = 5
            r2.<init>(r3, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L8b
            return r2
        L99:
            r0 = move-exception
            goto L17
        L9c:
            p203n.C2647c.m4603b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p203n.C2643a.mo8p(java.lang.Object):java.lang.Object");
    }
}
