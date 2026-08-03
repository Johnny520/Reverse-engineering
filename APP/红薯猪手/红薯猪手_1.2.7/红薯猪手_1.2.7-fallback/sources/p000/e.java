package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends p000.i8 {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p000.i8
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int mo128(int r3) {
            r2 = this;
            java.util.Random r0 = r2.mo130()
            int r0 = r0.nextInt()
            int r1 = 32 - r3
            int r0 = r0 >>> r1
            int r3 = -r3
            int r3 = r3 >> 31
            r3 = r3 & r0
            return r3
    }

    @Override // p000.i8
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int mo129() {
            r1 = this;
            java.util.Random r0 = r1.mo130()
            int r0 = r0.nextInt()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public abstract java.util.Random mo130();

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final int m131(int r2) {
            r1 = this;
            java.util.Random r0 = r1.mo130()
            int r2 = r0.nextInt(r2)
            return r2
    }
}
