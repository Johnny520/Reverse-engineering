package Yue;

import android.util.LongSparseArray;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,99:1\n77#1,4:100\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:100,4\n*E\n"})
public final class C5886 {

    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ$ۥ */
    public static final class C0891 extends AbstractC5880 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f14601;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ LongSparseArray<T> f14602;

        public C0891(LongSparseArray<T> longSparseArray) {
            this.f14602 = longSparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14601 < this.f14602.size();
        }

        @Override // Yue.AbstractC5880
        /* JADX INFO: renamed from: ۥ۟ */
        public long mo479() {
            LongSparseArray<T> longSparseArray = this.f14602;
            int i = this.f14601;
            this.f14601 = i + 1;
            return longSparseArray.keyAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m18246() {
            return this.f14601;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m18247(int i) {
            this.f14601 = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ$ۥ۟ */
    public static final class C0892<T> implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f14603;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ LongSparseArray<T> f14604;

        public C0892(LongSparseArray<T> longSparseArray) {
            this.f14604 = longSparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14603 < this.f14604.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.f14604;
            int i = this.f14603;
            this.f14603 = i + 1;
            return longSparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m2556() {
            return this.f14603;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m2557(int i) {
            this.f14603 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final <T> boolean m2554(@InterfaceC6399 LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> boolean m2555(@InterfaceC6399 LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> boolean m18233(@InterfaceC6399 LongSparseArray<T> longSparseArray, T t) {
        return longSparseArray.indexOfValue(t) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> void m18234(@InterfaceC6399 LongSparseArray<T> longSparseArray, @InterfaceC6399 InterfaceC5138<? super Long, ? super T, C8107> interfaceC5138) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            interfaceC5138.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m18235(@InterfaceC6399 LongSparseArray<T> longSparseArray, long j, T t) {
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> T m18236(@InterfaceC6399 LongSparseArray<T> longSparseArray, long j, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        T t = longSparseArray.get(j);
        return t == null ? interfaceC5122.invoke() : t;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> int m18237(@InterfaceC6399 LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m18238(@InterfaceC6399 LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> boolean m18239(@InterfaceC6399 LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> AbstractC5880 m18240(@InterfaceC6399 LongSparseArray<T> longSparseArray) {
        return new C0891(longSparseArray);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> LongSparseArray<T> m18241(@InterfaceC6399 LongSparseArray<T> longSparseArray, @InterfaceC6399 LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        m18242(longSparseArray3, longSparseArray);
        m18242(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> void m18242(@InterfaceC6399 LongSparseArray<T> longSparseArray, @InterfaceC6399 LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> boolean m18243(@InterfaceC6399 LongSparseArray<T> longSparseArray, long j, T t) {
        int iIndexOfKey = longSparseArray.indexOfKey(j);
        if (iIndexOfKey < 0 || !C5499.m17094(t, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> void m18244(@InterfaceC6399 LongSparseArray<T> longSparseArray, long j, T t) {
        longSparseArray.put(j, t);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> Iterator<T> m18245(@InterfaceC6399 LongSparseArray<T> longSparseArray) {
        return new C0892(longSparseArray);
    }
}
