package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3386 extends AbstractC5455 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final int[] f5444;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5445;

    public C3386(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "array");
        this.f5444 = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5445 < this.f5444.length;
    }

    @Override // Yue.AbstractC5455
    /* JADX INFO: renamed from: ۥ۟ */
    public int mo471() {
        try {
            int[] iArr = this.f5444;
            int i = this.f5445;
            this.f5445 = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5445--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
