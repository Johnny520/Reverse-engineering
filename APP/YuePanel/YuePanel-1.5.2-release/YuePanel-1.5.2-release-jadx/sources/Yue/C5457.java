package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5457 extends AbstractC5455 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f13416;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f13417;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f13418;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f13419;

    public C5457(int i, int i2, int i3) {
        this.f13416 = i3;
        this.f13417 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f13418 = z;
        this.f13419 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13418;
    }

    @Override // Yue.AbstractC5455
    /* JADX INFO: renamed from: ۥ۟ */
    public int mo471() {
        int i = this.f13419;
        if (i != this.f13417) {
            this.f13419 = this.f13416 + i;
        } else {
            if (!this.f13418) {
                throw new NoSuchElementException();
            }
            this.f13418 = false;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m16968() {
        return this.f13416;
    }
}
