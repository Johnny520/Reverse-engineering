package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class rx extends m {
    @Override // defpackage.az
    public final int c(int r2, int r3) {
        return ThreadLocalRandom.current().nextInt(r2, r3);
    }

    @Override // defpackage.m
    public final Random d() {
        ThreadLocalRandom r0 = ThreadLocalRandom.current();
        ip.n("current(...)", r0);
        return r0;
    }
}
