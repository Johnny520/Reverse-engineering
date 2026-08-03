package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3384 extends AbstractC4491 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final double[] f5440;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5441;

    public C3384(@InterfaceC6399 double[] dArr) {
        C5499.m17103(dArr, "array");
        this.f5440 = dArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5441 < this.f5440.length;
    }

    @Override // Yue.AbstractC4491
    /* JADX INFO: renamed from: ۥ۟ */
    public double mo469() {
        try {
            double[] dArr = this.f5440;
            int i = this.f5441;
            this.f5441 = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5441--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
