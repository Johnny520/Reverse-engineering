package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3393 extends AbstractC5880 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final long[] f5464;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5465;

    public C3393(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "array");
        this.f5464 = jArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5465 < this.f5464.length;
    }

    @Override // Yue.AbstractC5880
    /* JADX INFO: renamed from: ۥ۟ */
    public long mo479() {
        try {
            long[] jArr = this.f5464;
            int i = this.f5465;
            this.f5465 = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5465--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
