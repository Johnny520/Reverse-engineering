package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
@Yue.InterfaceC5840({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class AbstractC1600 extends Yue.AbstractC0730 {

    @Yue.InterfaceC4543
    private final Yue.InterfaceC1632 _context;

    @Yue.InterfaceC4543
    private transient Yue.InterfaceC1598<java.lang.Object> intercepted;

    public AbstractC1600(@Yue.InterfaceC4543 Yue.InterfaceC1598<java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            Yue.ۥ۟ۧۦۥ r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
    }

    public AbstractC1600(@Yue.InterfaceC4543 Yue.InterfaceC1598<java.lang.Object> r1, @Yue.InterfaceC4543 Yue.InterfaceC1632 r2) {
            r0 = this;
            r0.<init>(r1)
            r0._context = r2
            return
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1._context
            Yue.C3329.m13903(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final Yue.InterfaceC1598<java.lang.Object> intercepted() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<java.lang.Object> r0 = r2.intercepted
            if (r0 != 0) goto L1b
            Yue.ۥ۟ۧۦۥ r0 = r2.getContext()
            Yue.ۥ۟ۧۤۥ$ۥ۟ r1 = Yue.InterfaceC1601.f5016
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r1)
            Yue.ۥ۟ۧۤۥ r0 = (Yue.InterfaceC1601) r0
            if (r0 == 0) goto L18
            Yue.ۥ۟ۧۤۢ r0 = r0.interceptContinuation(r2)
            if (r0 != 0) goto L19
        L18:
            r0 = r2
        L19:
            r2.intercepted = r0
        L1b:
            return r0
    }

    @Override // Yue.AbstractC0730
    public void releaseIntercepted() {
            r3 = this;
            Yue.ۥ۟ۧۤۢ<java.lang.Object> r0 = r3.intercepted
            if (r0 == 0) goto L18
            if (r0 == r3) goto L18
            Yue.ۥ۟ۧۦۥ r1 = r3.getContext()
            Yue.ۥ۟ۧۤۥ$ۥ۟ r2 = Yue.InterfaceC1601.f5016
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r1.get(r2)
            Yue.C3329.m13903(r1)
            Yue.ۥ۟ۧۤۥ r1 = (Yue.InterfaceC1601) r1
            r1.releaseInterceptedContinuation(r0)
        L18:
            Yue.ۥ۟ۦۣۡ r0 = Yue.C1416.f4518
            r3.intercepted = r0
            return
    }
}
