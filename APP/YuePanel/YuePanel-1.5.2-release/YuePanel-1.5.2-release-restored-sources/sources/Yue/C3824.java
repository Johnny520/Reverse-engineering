package Yue;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3824 implements Iterator {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f7221;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f7222;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f7223;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f7224;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ C3825 f7225;

    public C3824(C3825 c3825) {
        this.f7225 = c3825;
        int i = c3825.f7230;
        this.f7221 = i;
        this.f7222 = c3825.f7229;
        this.f7223 = c3825.f7228;
        this.f7224 = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        m873();
        return this.f7223 > 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        m873();
        int i = this.f7223;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.f7223 = i - 1;
        Object[] objArr = this.f7225.f7234;
        int i2 = this.f7224;
        Object obj = objArr[i2];
        this.f7224 = (i2 + 1) & this.f7225.f7233;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m873() {
        if (this.f7221 != this.f7225.f7230) {
            throw new ConcurrentModificationException();
        }
        if (this.f7222 != this.f7225.f7229) {
            throw new ConcurrentModificationException();
        }
    }
}
