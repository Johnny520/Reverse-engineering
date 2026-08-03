package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3378 extends AbstractC3569 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final boolean[] f5416;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5417;

    public C3378(@InterfaceC6399 boolean[] zArr) {
        C5499.m17103(zArr, "array");
        this.f5416 = zArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5417 < this.f5416.length;
    }

    @Override // Yue.AbstractC3569
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo465() {
        try {
            boolean[] zArr = this.f5416;
            int i = this.f5417;
            this.f5417 = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5417--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
