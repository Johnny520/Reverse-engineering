package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends defpackage.az {
    @Override // defpackage.az
    public final int a(int r3) {
            r2 = this;
            java.util.Random r0 = r2.d()
            int r0 = r0.nextInt()
            int r1 = 32 - r3
            int r0 = r0 >>> r1
            int r3 = -r3
            int r3 = r3 >> 31
            r3 = r3 & r0
            return r3
    }

    @Override // defpackage.az
    public final int b() {
            r1 = this;
            java.util.Random r0 = r1.d()
            int r0 = r0.nextInt()
            return r0
    }

    public abstract java.util.Random d();
}
