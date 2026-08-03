package Yue;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class C7536 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۣ$ۥ */
    public static final class C1288 extends AbstractC5455 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22808;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseIntArray f22809;

        public C1288(SparseIntArray sparseIntArray) {
            this.f22809 = sparseIntArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22808 < this.f22809.size();
        }

        @Override // Yue.AbstractC5455
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo471() {
            SparseIntArray sparseIntArray = this.f22809;
            int i = this.f22808;
            this.f22808 = i + 1;
            return sparseIntArray.keyAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m23626() {
            return this.f22808;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m23627(int i) {
            this.f22808 = i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۣ$ۥ۟ */
    public static final class C1289 extends AbstractC5455 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22810;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseIntArray f22811;

        public C1289(SparseIntArray sparseIntArray) {
            this.f22811 = sparseIntArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22810 < this.f22811.size();
        }

        @Override // Yue.AbstractC5455
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo471() {
            SparseIntArray sparseIntArray = this.f22811;
            int i = this.f22810;
            this.f22810 = i + 1;
            return sparseIntArray.valueAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m23628() {
            return this.f22810;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m23629(int i) {
            this.f22810 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final boolean m3720(@InterfaceC6399 SparseIntArray sparseIntArray, int i) {
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m3721(@InterfaceC6399 SparseIntArray sparseIntArray, int i) {
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m23613(@InterfaceC6399 SparseIntArray sparseIntArray, int i) {
        return sparseIntArray.indexOfValue(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m23614(@InterfaceC6399 SparseIntArray sparseIntArray, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Integer, C8107> interfaceC5138) {
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            interfaceC5138.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m23615(@InterfaceC6399 SparseIntArray sparseIntArray, int i, int i2) {
        return sparseIntArray.get(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m23616(@InterfaceC6399 SparseIntArray sparseIntArray, int i, @InterfaceC6399 InterfaceC5122<Integer> interfaceC5122) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : interfaceC5122.invoke().intValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m23617(@InterfaceC6399 SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m23618(@InterfaceC6399 SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m23619(@InterfaceC6399 SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final AbstractC5455 m23620(@InterfaceC6399 SparseIntArray sparseIntArray) {
        return new C1288(sparseIntArray);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final SparseIntArray m23621(@InterfaceC6399 SparseIntArray sparseIntArray, @InterfaceC6399 SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        m23622(sparseIntArray3, sparseIntArray);
        m23622(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m23622(@InterfaceC6399 SparseIntArray sparseIntArray, @InterfaceC6399 SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m23623(@InterfaceC6399 SparseIntArray sparseIntArray, int i, int i2) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey < 0 || i2 != sparseIntArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(iIndexOfKey);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m23624(@InterfaceC6399 SparseIntArray sparseIntArray, int i, int i2) {
        sparseIntArray.put(i, i2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final AbstractC5455 m23625(@InterfaceC6399 SparseIntArray sparseIntArray) {
        return new C1289(sparseIntArray);
    }
}
