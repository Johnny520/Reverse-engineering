package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3400 extends AbstractC7443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final short[] f5489;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5490;

    public C3400(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "array");
        this.f5489 = sArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5490 < this.f5489.length;
    }

    @Override // Yue.AbstractC7443
    /* JADX INFO: renamed from: ۥ۟ */
    public short mo488() {
        try {
            short[] sArr = this.f5489;
            int i = this.f5490;
            this.f5490 = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5490--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
