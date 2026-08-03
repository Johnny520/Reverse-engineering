package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3821<E> {

    /* JADX INFO: renamed from: ۥ */
    public E[] f523;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f524;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f7216;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f7217;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3821() {
        this(8);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m869(E e) {
        int i = (this.f524 - 1) & this.f7217;
        this.f524 = i;
        this.f523[i] = e;
        if (i == this.f7216) {
            m10536();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m870(E e) {
        E[] eArr = this.f523;
        int i = this.f7216;
        eArr[i] = e;
        int i2 = this.f7217 & (i + 1);
        this.f7216 = i2;
        if (i2 == this.f524) {
            m10536();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m10535() {
        m10544(m10545());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m10536() {
        E[] eArr = this.f523;
        int length = eArr.length;
        int i = this.f524;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i3];
        System.arraycopy(eArr, i, eArr2, 0, i2);
        System.arraycopy(this.f523, 0, eArr2, i2, this.f524);
        this.f523 = eArr2;
        this.f524 = 0;
        this.f7216 = length;
        this.f7217 = i3 - 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public E m10537(int i) {
        if (i < 0 || i >= m10545()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f523[this.f7217 & (this.f524 + i)];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public E m10538() {
        int i = this.f524;
        if (i != this.f7216) {
            return this.f523[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public E m10539() {
        int i = this.f524;
        int i2 = this.f7216;
        if (i != i2) {
            return this.f523[(i2 - 1) & this.f7217];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m10540() {
        return this.f524 == this.f7216;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public E m10541() {
        int i = this.f524;
        if (i == this.f7216) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f523;
        E e = eArr[i];
        eArr[i] = null;
        this.f524 = (i + 1) & this.f7217;
        return e;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public E m10542() {
        int i = this.f524;
        int i2 = this.f7216;
        if (i == i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f7217 & (i2 - 1);
        E[] eArr = this.f523;
        E e = eArr[i3];
        eArr[i3] = null;
        this.f7216 = i3;
        return e;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m10543(int i) {
        int i2;
        if (i <= 0) {
            return;
        }
        if (i > m10545()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f7216;
        int i4 = i < i3 ? i3 - i : 0;
        int i5 = i4;
        while (true) {
            i2 = this.f7216;
            if (i5 >= i2) {
                break;
            }
            this.f523[i5] = null;
            i5++;
        }
        int i6 = i2 - i4;
        int i7 = i - i6;
        this.f7216 = i2 - i6;
        if (i7 > 0) {
            int length = this.f523.length;
            this.f7216 = length;
            int i8 = length - i7;
            for (int i9 = i8; i9 < this.f7216; i9++) {
                this.f523[i9] = null;
            }
            this.f7216 = i8;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m10544(int i) {
        if (i <= 0) {
            return;
        }
        if (i > m10545()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f523.length;
        int i2 = this.f524;
        if (i < length - i2) {
            length = i2 + i;
        }
        while (i2 < length) {
            this.f523[i2] = null;
            i2++;
        }
        int i3 = this.f524;
        int i4 = length - i3;
        int i5 = i - i4;
        this.f524 = this.f7217 & (i3 + i4);
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                this.f523[i6] = null;
            }
            this.f524 = i5;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m10545() {
        return (this.f7216 - this.f524) & this.f7217;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3821(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f7217 = i - 1;
        this.f523 = (E[]) new Object[i];
    }
}
