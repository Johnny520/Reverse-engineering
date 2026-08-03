package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
public abstract class AbstractC5385 extends Yue.AbstractC0730 {
    public AbstractC5385(@Yue.InterfaceC4543 Yue.InterfaceC1598<java.lang.Object> r2) {
            r1 = this;
            r1.<init>(r2)
            if (r2 == 0) goto L1a
            Yue.ۥ۟ۧۦۥ r2 = r2.getContext()
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
            if (r2 != r0) goto Le
            goto L1a
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L1a:
            return
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
            return r0
    }
}
