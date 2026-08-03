package Yue;

import android.util.SparseLongArray;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class C7537 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۤ$ۥ */
    public static final class C1290 extends AbstractC5455 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22812;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseLongArray f22813;

        public C1290(SparseLongArray sparseLongArray) {
            this.f22813 = sparseLongArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22812 < this.f22813.size();
        }

        @Override // Yue.AbstractC5455
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo471() {
            SparseLongArray sparseLongArray = this.f22813;
            int i = this.f22812;
            this.f22812 = i + 1;
            return sparseLongArray.keyAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m23643() {
            return this.f22812;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m23644(int i) {
            this.f22812 = i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۤ$ۥ۟ */
    public static final class C1291 extends AbstractC5880 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22814;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseLongArray f22815;

        public C1291(SparseLongArray sparseLongArray) {
            this.f22815 = sparseLongArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22814 < this.f22815.size();
        }

        @Override // Yue.AbstractC5880
        /* JADX INFO: renamed from: ۥ۟ */
        public long mo479() {
            SparseLongArray sparseLongArray = this.f22815;
            int i = this.f22814;
            this.f22814 = i + 1;
            return sparseLongArray.valueAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m23645() {
            return this.f22814;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m23646(int i) {
            this.f22814 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final boolean m3722(@InterfaceC6399 SparseLongArray sparseLongArray, int i) {
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m3723(@InterfaceC6399 SparseLongArray sparseLongArray, int i) {
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m23630(@InterfaceC6399 SparseLongArray sparseLongArray, long j) {
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m23631(@InterfaceC6399 SparseLongArray sparseLongArray, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Long, C8107> interfaceC5138) {
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            interfaceC5138.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m23632(@InterfaceC6399 SparseLongArray sparseLongArray, int i, long j) {
        return sparseLongArray.get(i, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long m23633(@InterfaceC6399 SparseLongArray sparseLongArray, int i, @InterfaceC6399 InterfaceC5122<Long> interfaceC5122) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : interfaceC5122.invoke().longValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m23634(@InterfaceC6399 SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m23635(@InterfaceC6399 SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m23636(@InterfaceC6399 SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final AbstractC5455 m23637(@InterfaceC6399 SparseLongArray sparseLongArray) {
        return new C1290(sparseLongArray);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final SparseLongArray m23638(@InterfaceC6399 SparseLongArray sparseLongArray, @InterfaceC6399 SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        m23639(sparseLongArray3, sparseLongArray);
        m23639(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m23639(@InterfaceC6399 SparseLongArray sparseLongArray, @InterfaceC6399 SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m23640(@InterfaceC6399 SparseLongArray sparseLongArray, int i, long j) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey < 0 || j != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m23641(@InterfaceC6399 SparseLongArray sparseLongArray, int i, long j) {
        sparseLongArray.put(i, j);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final AbstractC5880 m23642(@InterfaceC6399 SparseLongArray sparseLongArray) {
        return new C1291(sparseLongArray);
    }
}
