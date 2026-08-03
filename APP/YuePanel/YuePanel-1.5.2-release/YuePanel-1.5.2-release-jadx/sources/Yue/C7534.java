package Yue;

import android.util.SparseArray;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
public final class C7534 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۡ$ۥ */
    public static final class C1284 extends AbstractC5455 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22800;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseArray<T> f22801;

        public C1284(SparseArray<T> sparseArray) {
            this.f22801 = sparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22800 < this.f22801.size();
        }

        @Override // Yue.AbstractC5455
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo471() {
            SparseArray<T> sparseArray = this.f22801;
            int i = this.f22800;
            this.f22800 = i + 1;
            return sparseArray.keyAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m23594() {
            return this.f22800;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m23595(int i) {
            this.f22800 = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۡ$ۥ۟ */
    public static final class C1285<T> implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22802;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseArray<T> f22803;

        public C1285(SparseArray<T> sparseArray) {
            this.f22803 = sparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22802 < this.f22803.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f22803;
            int i = this.f22802;
            this.f22802 = i + 1;
            return sparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m3716() {
            return this.f22802;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m3717(int i) {
            this.f22802 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final <T> boolean m3714(@InterfaceC6399 SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> boolean m3715(@InterfaceC6399 SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> boolean m23581(@InterfaceC6399 SparseArray<T> sparseArray, T t) {
        return sparseArray.indexOfValue(t) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> void m23582(@InterfaceC6399 SparseArray<T> sparseArray, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, C8107> interfaceC5138) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            interfaceC5138.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m23583(@InterfaceC6399 SparseArray<T> sparseArray, int i, T t) {
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> T m23584(@InterfaceC6399 SparseArray<T> sparseArray, int i, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        T t = sparseArray.get(i);
        return t == null ? interfaceC5122.invoke() : t;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> int m23585(@InterfaceC6399 SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m23586(@InterfaceC6399 SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> boolean m23587(@InterfaceC6399 SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> AbstractC5455 m23588(@InterfaceC6399 SparseArray<T> sparseArray) {
        return new C1284(sparseArray);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> SparseArray<T> m23589(@InterfaceC6399 SparseArray<T> sparseArray, @InterfaceC6399 SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        m23590(sparseArray3, sparseArray);
        m23590(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> void m23590(@InterfaceC6399 SparseArray<T> sparseArray, @InterfaceC6399 SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> boolean m23591(@InterfaceC6399 SparseArray<T> sparseArray, int i, T t) {
        int iIndexOfKey = sparseArray.indexOfKey(i);
        if (iIndexOfKey < 0 || !C5499.m17094(t, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> void m23592(@InterfaceC6399 SparseArray<T> sparseArray, int i, T t) {
        sparseArray.put(i, t);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> Iterator<T> m23593(@InterfaceC6399 SparseArray<T> sparseArray) {
        return new C1285(sparseArray);
    }
}
