package Yue;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
public final class C7535 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۢ$ۥ */
    public static final class C1286 extends AbstractC5455 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22804;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseBooleanArray f22805;

        public C1286(SparseBooleanArray sparseBooleanArray) {
            this.f22805 = sparseBooleanArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22804 < this.f22805.size();
        }

        @Override // Yue.AbstractC5455
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo471() {
            SparseBooleanArray sparseBooleanArray = this.f22805;
            int i = this.f22804;
            this.f22804 = i + 1;
            return sparseBooleanArray.keyAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m23609() {
            return this.f22804;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m23610(int i) {
            this.f22804 = i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۢ$ۥ۟ */
    public static final class C1287 extends AbstractC3569 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22806;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ SparseBooleanArray f22807;

        public C1287(SparseBooleanArray sparseBooleanArray) {
            this.f22807 = sparseBooleanArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22806 < this.f22807.size();
        }

        @Override // Yue.AbstractC3569
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo465() {
            SparseBooleanArray sparseBooleanArray = this.f22807;
            int i = this.f22806;
            this.f22806 = i + 1;
            return sparseBooleanArray.valueAt(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m23611() {
            return this.f22806;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m23612(int i) {
            this.f22806 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final boolean m3718(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, int i) {
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m3719(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, int i) {
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m23596(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, boolean z) {
        return sparseBooleanArray.indexOfValue(z) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m23597(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Boolean, C8107> interfaceC5138) {
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            interfaceC5138.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m23598(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        return sparseBooleanArray.get(i, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m23599(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, int i, @InterfaceC6399 InterfaceC5122<Boolean> interfaceC5122) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : interfaceC5122.invoke().booleanValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m23600(@InterfaceC6399 SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m23601(@InterfaceC6399 SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m23602(@InterfaceC6399 SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final AbstractC5455 m23603(@InterfaceC6399 SparseBooleanArray sparseBooleanArray) {
        return new C1286(sparseBooleanArray);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final SparseBooleanArray m23604(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, @InterfaceC6399 SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        m23605(sparseBooleanArray3, sparseBooleanArray);
        m23605(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m23605(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, @InterfaceC6399 SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m23606(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i);
        if (iIndexOfKey < 0 || z != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m23607(@InterfaceC6399 SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        sparseBooleanArray.put(i, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final AbstractC3569 m23608(@InterfaceC6399 SparseBooleanArray sparseBooleanArray) {
        return new C1287(sparseBooleanArray);
    }
}
