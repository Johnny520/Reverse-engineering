package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3380 extends AbstractC3627 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f5424;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5425;

    public C3380(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "array");
        this.f5424 = bArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5425 < this.f5424.length;
    }

    @Override // Yue.AbstractC3627
    /* JADX INFO: renamed from: ۥ۟ */
    public byte mo466() {
        try {
            byte[] bArr = this.f5424;
            int i = this.f5425;
            this.f5425 = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5425--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
