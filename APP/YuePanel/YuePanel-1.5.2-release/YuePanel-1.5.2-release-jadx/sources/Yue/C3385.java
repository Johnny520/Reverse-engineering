package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3385 extends AbstractC4883 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final float[] f5442;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5443;

    public C3385(@InterfaceC6399 float[] fArr) {
        C5499.m17103(fArr, "array");
        this.f5442 = fArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5443 < this.f5442.length;
    }

    @Override // Yue.AbstractC4883
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo470() {
        try {
            float[] fArr = this.f5442;
            int i = this.f5443;
            this.f5443 = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5443--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
