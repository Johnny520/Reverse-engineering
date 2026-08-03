package p001;

import java.util.Random;

/* JADX INFO: renamed from: ۟.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0190e extends AbstractC0255i8 {
    @Override // p001.AbstractC0255i8
    /* JADX INFO: renamed from: ۥ */
    public final int mo844(int i) {
        return ((-i) >> 31) & (mo1051().nextInt() >>> (32 - i));
    }

    @Override // p001.AbstractC0255i8
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo845() {
        return mo1051().nextInt();
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public abstract Random mo1051();

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final int m1052(int i) {
        return mo1051().nextInt(i);
    }
}
