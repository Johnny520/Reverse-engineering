package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rx extends defpackage.m {
    @Override // defpackage.az
    public final int c(int r2, int r3) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            int r2 = r0.nextInt(r2, r3)
            return r2
    }

    @Override // defpackage.m
    public final java.util.Random d() {
            r2 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            java.lang.String r1 = "current(...)"
            defpackage.ip.n(r1, r0)
            return r0
    }
}
