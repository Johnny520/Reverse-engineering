package p117i;

import java.util.Arrays;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p132j.AbstractC3492d;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3055g0 extends AbstractC3071m {
    public /* synthetic */ C3055g0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    /* JADX INFO: renamed from: i */
    public final void m11302i(int i10, int i11) {
        if (i10 < 0 || i10 > this.f8151b) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        m11306m(this.f8151b + 1);
        int[] iArr = this.f8150a;
        int i12 = this.f8151b;
        if (i10 != i12) {
            AbstractC5102r.m20658j(iArr, iArr, i10 + 1, i10, i12);
        }
        iArr[i10] = i11;
        this.f8151b++;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11303j(int i10) {
        m11306m(this.f8151b + 1);
        int[] iArr = this.f8150a;
        int i11 = this.f8151b;
        iArr[i11] = i10;
        this.f8151b = i11 + 1;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11304k(int i10, int[] iArr) {
        iArr.getClass();
        if (i10 < 0 || i10 > this.f8151b) {
            AbstractC3492d.m13017c(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        if (iArr.length == 0) {
            return false;
        }
        m11306m(this.f8151b + iArr.length);
        int[] iArr2 = this.f8150a;
        int i11 = this.f8151b;
        if (i10 != i11) {
            AbstractC5102r.m20658j(iArr2, iArr2, iArr.length + i10, i10, i11);
        }
        AbstractC5102r.m20663o(iArr, iArr2, i10, 0, 0, 12, null);
        this.f8151b += iArr.length;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m11305l() {
        this.f8151b = 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m11306m(int i10) {
        int[] iArr = this.f8150a;
        if (iArr.length < i10) {
            this.f8150a = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m11307n(int i10) {
        if (i10 < 0 || i10 >= this.f8151b) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        int[] iArr = this.f8150a;
        int i11 = iArr[i10];
        int i12 = this.f8151b;
        if (i10 != i12 - 1) {
            AbstractC5102r.m20658j(iArr, iArr, i10, i10 + 1, i12);
        }
        this.f8151b--;
        return i11;
    }

    /* JADX INFO: renamed from: o */
    public final void m11308o(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f8151b) || i11 < 0 || i11 > i12) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        if (i11 < i10) {
            AbstractC3492d.m13015a("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f8151b;
            if (i11 < i13) {
                int[] iArr = this.f8150a;
                AbstractC5102r.m20658j(iArr, iArr, i10, i11, i13);
            }
            this.f8151b -= i11 - i10;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m11309p(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f8151b) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        int[] iArr = this.f8150a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    /* JADX INFO: renamed from: q */
    public final void m11310q() {
        int i10 = this.f8151b;
        if (i10 == 0) {
            return;
        }
        AbstractC5102r.m20647G(this.f8150a, 0, i10);
    }

    public C3055g0(int i10) {
        super(i10, null);
    }
}
