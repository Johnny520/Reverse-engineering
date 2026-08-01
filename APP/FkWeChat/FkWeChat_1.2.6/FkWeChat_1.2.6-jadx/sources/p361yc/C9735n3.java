package p361yc;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p172l8.C4690d0;

/* JADX INFO: renamed from: yc.n3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9735n3 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public long[] f33004a;

    /* JADX INFO: renamed from: b */
    public int f33005b;

    public C9735n3(long[] jArr) {
        jArr.getClass();
        this.f33004a = jArr;
        this.f33005b = C4690d0.m18743t(jArr);
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo37796a() {
        return C4690d0.m18736a(m37987f());
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        if (C4690d0.m18743t(this.f33004a) < i10) {
            long[] jArr = this.f33004a;
            this.f33004a = C4690d0.m18738e(Arrays.copyOf(jArr, AbstractC2368o.m8578e(i10, C4690d0.m18743t(jArr) * 2)));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f33005b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37986e(long j10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        long[] jArr = this.f33004a;
        int iMo37798d = mo37798d();
        this.f33005b = iMo37798d + 1;
        C4690d0.m18747x(jArr, iMo37798d, j10);
    }

    /* JADX INFO: renamed from: f */
    public long[] m37987f() {
        return C4690d0.m18738e(Arrays.copyOf(this.f33004a, mo37798d()));
    }

    public /* synthetic */ C9735n3(long[] jArr, AbstractC1043k abstractC1043k) {
        this(jArr);
    }
}
