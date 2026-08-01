package p117i;

import java.util.Arrays;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p132j.AbstractC3492d;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3067k0 extends AbstractC3089v {
    public /* synthetic */ C3067k0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11381d(long j10) {
        m11384g(this.f8228b + 1);
        long[] jArr = this.f8227a;
        int i10 = this.f8228b;
        jArr[i10] = j10;
        this.f8228b = i10 + 1;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11382e(int i10, long[] jArr) {
        jArr.getClass();
        if (i10 < 0 || i10 > this.f8228b) {
            AbstractC3492d.m13017c(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        if (jArr.length == 0) {
            return false;
        }
        m11384g(this.f8228b + jArr.length);
        long[] jArr2 = this.f8227a;
        int i11 = this.f8228b;
        if (i10 != i11) {
            AbstractC5102r.m20659k(jArr2, jArr2, jArr.length + i10, i10, i11);
        }
        AbstractC5102r.m20664p(jArr, jArr2, i10, 0, 0, 12, null);
        this.f8228b += jArr.length;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m11383f() {
        this.f8228b = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m11384g(int i10) {
        long[] jArr = this.f8227a;
        if (jArr.length < i10) {
            this.f8227a = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m11385h(int i10) {
        if (i10 < 0 || i10 >= this.f8228b) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        long[] jArr = this.f8227a;
        long j10 = jArr[i10];
        int i11 = this.f8228b;
        if (i10 != i11 - 1) {
            AbstractC5102r.m20659k(jArr, jArr, i10, i10 + 1, i11);
        }
        this.f8228b--;
        return j10;
    }

    /* JADX INFO: renamed from: i */
    public final void m11386i(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f8228b) || i11 < 0 || i11 > i12) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        if (i11 < i10) {
            AbstractC3492d.m13015a("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f8228b;
            if (i11 < i13) {
                long[] jArr = this.f8227a;
                AbstractC5102r.m20659k(jArr, jArr, i10, i11, i13);
            }
            this.f8228b -= i11 - i10;
        }
    }

    public C3067k0(int i10) {
        super(i10, null);
    }
}
