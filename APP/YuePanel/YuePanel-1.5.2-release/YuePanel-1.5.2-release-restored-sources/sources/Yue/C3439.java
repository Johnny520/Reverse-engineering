package Yue;

import Yue.C7797;
import Yue.InterfaceC7788;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3439<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String f5517 = "AsyncListUtil";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean f5518 = false;

    /* JADX INFO: renamed from: ۥ */
    public final Class<T> f285;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f286;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final AbstractC3440<T> f5519;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final AbstractC3441 f5520;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C7797<T> f5521;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final InterfaceC7788.InterfaceC1355<T> f5522;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC7788.InterfaceC1354<T> f5523;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f5527;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final InterfaceC7788.InterfaceC1355<T> f5533;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final InterfaceC7788.InterfaceC1354<T> f5534;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int[] f5524 = new int[2];

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int[] f5525 = new int[2];

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int[] f5526 = new int[2];

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f5528 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f5529 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f5530 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f5531 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final SparseIntArray f5532 = new SparseIntArray();

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۢ$ۥ */
    public class C0135 implements InterfaceC7788.InterfaceC1355<T> {
        public C0135() {
        }

        @Override // Yue.InterfaceC7788.InterfaceC1355
        /* JADX INFO: renamed from: ۥ */
        public void mo505(int i, int i2) {
            if (m9043(i)) {
                C7797.C1362<T> c1362M24765 = C3439.this.f5521.m24765(i2);
                if (c1362M24765 != null) {
                    C3439.this.f5523.mo9046(c1362M24765);
                    return;
                }
                Log.e(C3439.f5517, "tile not found @" + i2);
            }
        }

        @Override // Yue.InterfaceC7788.InterfaceC1355
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo506(int i, int i2) {
            if (m9043(i)) {
                C3439 c3439 = C3439.this;
                c3439.f5529 = i2;
                c3439.f5520.m9057();
                C3439 c34392 = C3439.this;
                c34392.f5530 = c34392.f5531;
                m9044();
                C3439 c34393 = C3439.this;
                c34393.f5527 = false;
                c34393.m9041();
            }
        }

        @Override // Yue.InterfaceC7788.InterfaceC1355
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo9042(int i, C7797.C1362<T> c1362) {
            if (!m9043(i)) {
                C3439.this.f5523.mo9046(c1362);
                return;
            }
            C7797.C1362<T> c1362M3895 = C3439.this.f5521.m3895(c1362);
            if (c1362M3895 != null) {
                Log.e(C3439.f5517, "duplicate tile @" + c1362M3895.f3089);
                C3439.this.f5523.mo9046(c1362M3895);
            }
            int i2 = c1362.f3089 + c1362.f23357;
            int i3 = 0;
            while (i3 < C3439.this.f5532.size()) {
                int iKeyAt = C3439.this.f5532.keyAt(i3);
                if (c1362.f3089 > iKeyAt || iKeyAt >= i2) {
                    i3++;
                } else {
                    C3439.this.f5532.removeAt(i3);
                    C3439.this.f5520.m9058(iKeyAt);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m9043(int i) {
            return i == C3439.this.f5531;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m9044() {
            for (int i = 0; i < C3439.this.f5521.m24766(); i++) {
                C3439 c3439 = C3439.this;
                c3439.f5523.mo9046(c3439.f5521.m24763(i));
            }
            C3439.this.f5521.m3896();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۢ$ۥ۟ */
    public class C0136 implements InterfaceC7788.InterfaceC1354<T> {

        /* JADX INFO: renamed from: ۥ */
        public C7797.C1362<T> f288;

        /* JADX INFO: renamed from: ۥ۟ */
        public final SparseBooleanArray f289 = new SparseBooleanArray();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f5535;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f5536;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f5537;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f5538;

        public C0136() {
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ */
        public void mo507(int i, int i2, int i3, int i4, int i5) {
            if (i > i2) {
                return;
            }
            int iM9050 = m9050(i);
            int iM90502 = m9050(i2);
            this.f5537 = m9050(i3);
            int iM90503 = m9050(i4);
            this.f5538 = iM90503;
            if (i5 == 1) {
                m9054(this.f5537, iM90502, i5, true);
                m9054(iM90502 + C3439.this.f286, this.f5538, i5, false);
            } else {
                m9054(iM9050, iM90503, i5, false);
                m9054(this.f5537, iM9050 - C3439.this.f286, i5, true);
            }
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo508(int i, int i2) {
            if (m9051(i)) {
                return;
            }
            C7797.C1362<T> c1362M9047 = m9047();
            c1362M9047.f3089 = i;
            int iMin = Math.min(C3439.this.f286, this.f5536 - i);
            c1362M9047.f23357 = iMin;
            C3439.this.f5519.m509(c1362M9047.f3088, c1362M9047.f3089, iMin);
            m9049(i2);
            m9048(c1362M9047);
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo9045(int i) {
            this.f5535 = i;
            this.f289.clear();
            int iM9056 = C3439.this.f5519.m9056();
            this.f5536 = iM9056;
            C3439.this.f5522.mo506(this.f5535, iM9056);
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo9046(C7797.C1362<T> c1362) {
            C3439.this.f5519.m9055(c1362.f3088, c1362.f23357);
            c1362.f23358 = this.f288;
            this.f288 = c1362;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C7797.C1362<T> m9047() {
            C7797.C1362<T> c1362 = this.f288;
            if (c1362 != null) {
                this.f288 = c1362.f23358;
                return c1362;
            }
            C3439 c3439 = C3439.this;
            return new C7797.C1362<>(c3439.f285, c3439.f286);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m9048(C7797.C1362<T> c1362) {
            this.f289.put(c1362.f3089, true);
            C3439.this.f5522.mo9042(this.f5535, c1362);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m9049(int i) {
            int iM510 = C3439.this.f5519.m510();
            while (this.f289.size() >= iM510) {
                int iKeyAt = this.f289.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f289;
                int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.f5537 - iKeyAt;
                int i3 = iKeyAt2 - this.f5538;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    m9053(iKeyAt);
                } else {
                    if (i3 <= 0) {
                        return;
                    }
                    if (i2 >= i3 && i != 1) {
                        return;
                    } else {
                        m9053(iKeyAt2);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m9050(int i) {
            return i - (i % C3439.this.f286);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m9051(int i) {
            return this.f289.get(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m9052(String str, Object... objArr) {
            Log.d(C3439.f5517, "[BKGR] " + String.format(str, objArr));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m9053(int i) {
            this.f289.delete(i);
            C3439.this.f5522.mo505(this.f5535, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m9054(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                C3439.this.f5523.mo508(z ? (i2 + i) - i4 : i4, i3);
                i4 += C3439.this.f286;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC3440<T> {
        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ */
        public abstract void m509(@InterfaceC6391 T[] tArr, int i, int i2);

        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ۟ */
        public int m510() {
            return 10;
        }

        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m9055(@InterfaceC6391 T[] tArr, int i) {
        }

        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public abstract int m9056();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC3441 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f290 = 0;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f291 = 1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f5540 = 2;

        @InterfaceC8086
        /* JADX INFO: renamed from: ۥ */
        public void m511(@InterfaceC6391 int[] iArr, @InterfaceC6391 int[] iArr2, int i) {
            int i2 = iArr[1];
            int i3 = iArr[0];
            int i4 = (i2 - i3) + 1;
            int i5 = i4 / 2;
            iArr2[0] = i3 - (i == 1 ? i4 : i5);
            if (i != 2) {
                i4 = i5;
            }
            iArr2[1] = i2 + i4;
        }

        @InterfaceC8086
        /* JADX INFO: renamed from: ۥ۟ */
        public abstract void m512(@InterfaceC6391 int[] iArr);

        @InterfaceC8086
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public abstract void m9057();

        @InterfaceC8086
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public abstract void m9058(int i);
    }

    public C3439(@InterfaceC6391 Class<T> cls, int i, @InterfaceC6391 AbstractC3440<T> abstractC3440, @InterfaceC6391 AbstractC3441 abstractC3441) {
        C0135 c0135 = new C0135();
        this.f5533 = c0135;
        C0136 c0136 = new C0136();
        this.f5534 = c0136;
        this.f285 = cls;
        this.f286 = i;
        this.f5519 = abstractC3440;
        this.f5520 = abstractC3441;
        this.f5521 = new C7797<>(i);
        C6205 c6205 = new C6205();
        this.f5522 = c6205.mo2690(c0135);
        this.f5523 = c6205.mo2691(c0136);
        m9040();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public T m503(int i) {
        if (i < 0 || i >= this.f5529) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.f5529);
        }
        T tM24764 = this.f5521.m24764(i);
        if (tM24764 == null && !m9037()) {
            this.f5532.put(i, 0);
        }
        return tM24764;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m504() {
        return this.f5529;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m9037() {
        return this.f5531 != this.f5530;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m9038(String str, Object... objArr) {
        Log.d(f5517, "[MAIN] " + String.format(str, objArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m9039() {
        if (m9037()) {
            return;
        }
        m9041();
        this.f5527 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m9040() {
        this.f5532.clear();
        InterfaceC7788.InterfaceC1354<T> interfaceC1354 = this.f5523;
        int i = this.f5531 + 1;
        this.f5531 = i;
        interfaceC1354.mo9045(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m9041() {
        int i;
        this.f5520.m512(this.f5524);
        int[] iArr = this.f5524;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.f5529) {
            return;
        }
        if (this.f5527) {
            int[] iArr2 = this.f5525;
            if (i2 > iArr2[1] || (i = iArr2[0]) > i3) {
                this.f5528 = 0;
            } else if (i2 < i) {
                this.f5528 = 1;
            } else if (i2 > i) {
                this.f5528 = 2;
            }
        } else {
            this.f5528 = 0;
        }
        int[] iArr3 = this.f5525;
        iArr3[0] = i2;
        iArr3[1] = i3;
        this.f5520.m511(iArr, this.f5526, this.f5528);
        int[] iArr4 = this.f5526;
        iArr4[0] = Math.min(this.f5524[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f5526;
        iArr5[1] = Math.max(this.f5524[1], Math.min(iArr5[1], this.f5529 - 1));
        InterfaceC7788.InterfaceC1354<T> interfaceC1354 = this.f5523;
        int[] iArr6 = this.f5524;
        int i4 = iArr6[0];
        int i5 = iArr6[1];
        int[] iArr7 = this.f5526;
        interfaceC1354.mo507(i4, i5, iArr7[0], iArr7[1], this.f5528);
    }
}
