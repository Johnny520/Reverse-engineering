package yyds;

import java.util.Random;

/* JADX INFO: renamed from: yyds.ᛳᛷᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0638 extends AbstractC2497 {
    @Override // yyds.AbstractC2497
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int mo1529(int i) {
        return (mo1532().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // yyds.AbstractC2497
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int mo1530() {
        return mo1532().nextInt();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int m1531(int i) {
        return mo1532().nextInt(i);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public abstract Random mo1532();

    @Override // yyds.AbstractC2497
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final long mo1533() {
        return mo1532().nextLong();
    }
}
