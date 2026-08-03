package Yue;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7797<T> {

    /* JADX INFO: renamed from: ۥ */
    public final int f3086;

    /* JADX INFO: renamed from: ۥ۟ */
    public final SparseArray<C1362<T>> f3087 = new SparseArray<>(10);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C1362<T> f23356;

    /* JADX INFO: renamed from: Yue.ۥۣۣۢۡ$ۥ */
    public static class C1362<T> {

        /* JADX INFO: renamed from: ۥ */
        public final T[] f3088;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3089;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f23357;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C1362<T> f23358;

        public C1362(Class<T> cls, int i) {
            this.f3088 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m3897(int i) {
            int i2 = this.f3089;
            return i2 <= i && i < i2 + this.f23357;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public T m3898(int i) {
            return this.f3088[i - this.f3089];
        }
    }

    public C7797(int i) {
        this.f3086 = i;
    }

    /* JADX INFO: renamed from: ۥ */
    public C1362<T> m3895(C1362<T> c1362) {
        int iIndexOfKey = this.f3087.indexOfKey(c1362.f3089);
        if (iIndexOfKey < 0) {
            this.f3087.put(c1362.f3089, c1362);
            return null;
        }
        C1362<T> c1362ValueAt = this.f3087.valueAt(iIndexOfKey);
        this.f3087.setValueAt(iIndexOfKey, c1362);
        if (this.f23356 == c1362ValueAt) {
            this.f23356 = c1362;
        }
        return c1362ValueAt;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3896() {
        this.f3087.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C1362<T> m24763(int i) {
        return this.f3087.valueAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public T m24764(int i) {
        C1362<T> c1362 = this.f23356;
        if (c1362 == null || !c1362.m3897(i)) {
            int iIndexOfKey = this.f3087.indexOfKey(i - (i % this.f3086));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.f23356 = this.f3087.valueAt(iIndexOfKey);
        }
        return this.f23356.m3898(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C1362<T> m24765(int i) {
        C1362<T> c1362 = this.f3087.get(i);
        if (this.f23356 == c1362) {
            this.f23356 = null;
        }
        this.f3087.delete(i);
        return c1362;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m24766() {
        return this.f3087.size();
    }
}
