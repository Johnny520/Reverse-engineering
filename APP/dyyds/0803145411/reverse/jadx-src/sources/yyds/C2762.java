package yyds;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: yyds.ᲈᲁᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2762 extends AbstractC0638 {
    @Override // yyds.AbstractC2497
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final long mo3132(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // yyds.AbstractC2497
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final int mo3133(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // yyds.AbstractC0638
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Random mo1532() {
        return ThreadLocalRandom.current();
    }
}
