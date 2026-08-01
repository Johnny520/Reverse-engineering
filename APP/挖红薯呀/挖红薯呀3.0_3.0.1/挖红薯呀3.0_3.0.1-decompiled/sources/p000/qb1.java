package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qb1 implements InterfaceC0082c8, pb1 {

    /* JADX INFO: renamed from: d */
    public final Object f5106d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qb1(float f, float f2, AbstractC0046b8 abstractC0046b8) {
        int i = nb1.f4233a;
        this.f5106d = new C0948y2(abstractC0046b8 != null ? new C0910x1(f, f2, abstractC0046b8) : new C0910x1(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pb1, p000.mb1
    /* JADX INFO: renamed from: a */
    public boolean mo2486a() {
        ((C0948y2) this.f5106d).getClass();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: b */
    public long mo2487b(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return ((C0948y2) this.f5106d).mo2487b(abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public long m3211d(long j) {
        C0620pm c0620pm = (C0620pm) this.f5106d;
        c0620pm.getClass();
        if (rb1.m3436b(j) <= 0.0f || rb1.m3437c(j) <= 0.0f) {
            w10.m4824b("maximumVelocity should be a positive value. You specified=" + ((Object) rb1.m3440f(j)));
        }
        return g60.m1203b(c0620pm.f4925a.m4195b(rb1.m3436b(j)), c0620pm.f4926b.m4195b(rb1.m3437c(j)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: e */
    public AbstractC0046b8 mo376e(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return ((C0948y2) this.f5106d).mo376e(j, abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0082c8
    public InterfaceC0185eu get(int i) {
        return (InterfaceC0185eu) this.f5106d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: h */
    public AbstractC0046b8 mo379h(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return ((C0948y2) this.f5106d).mo379h(j, abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: i */
    public AbstractC0046b8 mo2488i(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return ((C0948y2) this.f5106d).mo2488i(abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    public qb1() {
        this.f5106d = new C0620pm();
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [hd1.a(android.view.WindowInsetsAnimation):id1, y2.<init>(eu):void] */
    public /* synthetic */ qb1(Object obj) {
        this.f5106d = obj;
    }
}
