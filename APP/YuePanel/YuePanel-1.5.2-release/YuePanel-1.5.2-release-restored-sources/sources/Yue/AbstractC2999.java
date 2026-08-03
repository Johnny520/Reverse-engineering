package Yue;

import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class AbstractC2999 extends AbstractC7000 {
    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟ */
    public int mo67(int i) {
        return C7002.m21628(mo5819().nextInt(), i);
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo5812() {
        return mo5819().nextBoolean();
    }

    @Override // Yue.AbstractC7000
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public byte[] mo5813(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "array");
        mo5819().nextBytes(bArr);
        return bArr;
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public double mo5814() {
        return mo5819().nextDouble();
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float mo5815() {
        return mo5819().nextFloat();
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int mo5816() {
        return mo5819().nextInt();
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int mo5817(int i) {
        return mo5819().nextInt(i);
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public long mo5818() {
        return mo5819().nextLong();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract Random mo5819();
}
