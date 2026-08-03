package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3822 {

    /* JADX INFO: renamed from: ۥ */
    public int[] f525;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f526;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f7218;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f7219;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3822() {
        this(8);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m871(int i) {
        int i2 = (this.f526 - 1) & this.f7219;
        this.f526 = i2;
        this.f525[i2] = i;
        if (i2 == this.f7218) {
            m10547();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m872(int i) {
        int[] iArr = this.f525;
        int i2 = this.f7218;
        iArr[i2] = i;
        int i3 = this.f7219 & (i2 + 1);
        this.f7218 = i3;
        if (i3 == this.f526) {
            m10547();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m10546() {
        this.f7218 = this.f526;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m10547() {
        int[] iArr = this.f525;
        int length = iArr.length;
        int i = this.f526;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.f525, 0, iArr2, i2, this.f526);
        this.f525 = iArr2;
        this.f526 = 0;
        this.f7218 = length;
        this.f7219 = i3 - 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m10548(int i) {
        if (i < 0 || i >= m10556()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f525[this.f7219 & (this.f526 + i)];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m10549() {
        int i = this.f526;
        if (i != this.f7218) {
            return this.f525[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m10550() {
        int i = this.f526;
        int i2 = this.f7218;
        if (i != i2) {
            return this.f525[(i2 - 1) & this.f7219];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m10551() {
        return this.f526 == this.f7218;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m10552() {
        int i = this.f526;
        if (i == this.f7218) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f525[i];
        this.f526 = (i + 1) & this.f7219;
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m10553() {
        int i = this.f526;
        int i2 = this.f7218;
        if (i == i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f7219 & (i2 - 1);
        int i4 = this.f525[i3];
        this.f7218 = i3;
        return i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m10554(int i) {
        if (i <= 0) {
            return;
        }
        if (i > m10556()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f7218 = this.f7219 & (this.f7218 - i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m10555(int i) {
        if (i <= 0) {
            return;
        }
        if (i > m10556()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f526 = this.f7219 & (this.f526 + i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m10556() {
        return (this.f7218 - this.f526) & this.f7219;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3822(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f7219 = i - 1;
        this.f525 = new int[i];
    }
}
