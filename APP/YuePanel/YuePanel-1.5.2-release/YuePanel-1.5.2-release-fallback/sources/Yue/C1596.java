package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1596 implements Yue.InterfaceC1662 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632 f5008;

    public C1596(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            r0 = this;
            r0.<init>()
            r0.f5008 = r1
            return
    }

    @Override // Yue.InterfaceC1662
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getCoroutineContext() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.f5008
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CoroutineScope(coroutineContext="
            r0.append(r1)
            Yue.ۥ۟ۧۦۥ r1 = r2.getCoroutineContext()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
