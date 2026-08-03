package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3382 extends AbstractC3781 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final char[] f5431;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5432;

    public C3382(@InterfaceC6399 char[] cArr) {
        C5499.m17103(cArr, "array");
        this.f5431 = cArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5432 < this.f5431.length;
    }

    @Override // Yue.AbstractC3781
    /* JADX INFO: renamed from: ۥ۟ */
    public char mo467() {
        try {
            char[] cArr = this.f5431;
            int i = this.f5432;
            this.f5432 = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5432--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
