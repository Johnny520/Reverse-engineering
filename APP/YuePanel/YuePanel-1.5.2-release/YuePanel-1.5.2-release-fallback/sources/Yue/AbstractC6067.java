package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
public abstract class AbstractC6067 extends Yue.AbstractC1600 implements Yue.InterfaceC2850<java.lang.Object>, Yue.InterfaceC6065 {
    private final int arity;

    public AbstractC6067(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AbstractC6067(int r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.arity = r1
            return
    }

    @Override // Yue.InterfaceC2850
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // Yue.AbstractC0730
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ r0 = r2.getCompletion()
            if (r0 != 0) goto L10
            java.lang.String r0 = Yue.C5277.m19907(r2)
            java.lang.String r1 = "renderLambdaToString(this)"
            Yue.C3329.m13905(r0, r1)
            goto L14
        L10:
            java.lang.String r0 = super.toString()
        L14:
            return r0
    }
}
