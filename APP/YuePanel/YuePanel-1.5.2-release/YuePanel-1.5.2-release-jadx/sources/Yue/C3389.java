package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3389 implements Iterator {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Object[] f5448;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f5449;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f5450;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3389(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5450 < this.f5449;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f5450;
        if (i >= this.f5449) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f5448;
        this.f5450 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3389(Object[] objArr, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i > objArr.length) {
            throw new IllegalArgumentException();
        }
        if (i2 > objArr.length - i) {
            throw new IllegalArgumentException();
        }
        this.f5448 = objArr;
        this.f5450 = i;
        this.f5449 = i2 + i;
    }
}
