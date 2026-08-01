package p361yc;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p172l8.C4696g0;

/* JADX INFO: renamed from: yc.q3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9750q3 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public short[] f33019a;

    /* JADX INFO: renamed from: b */
    public int f33020b;

    public C9750q3(short[] sArr) {
        sArr.getClass();
        this.f33019a = sArr;
        this.f33020b = C4696g0.m18769t(sArr);
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo37796a() {
        return C4696g0.m18762a(m38023f());
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        if (C4696g0.m18769t(this.f33019a) < i10) {
            short[] sArr = this.f33019a;
            this.f33019a = C4696g0.m18764e(Arrays.copyOf(sArr, AbstractC2368o.m8578e(i10, C4696g0.m18769t(sArr) * 2)));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f33020b;
    }

    /* JADX INFO: renamed from: e */
    public final void m38022e(short s10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        short[] sArr = this.f33019a;
        int iMo37798d = mo37798d();
        this.f33020b = iMo37798d + 1;
        C4696g0.m18773x(sArr, iMo37798d, s10);
    }

    /* JADX INFO: renamed from: f */
    public short[] m38023f() {
        return C4696g0.m18764e(Arrays.copyOf(this.f33019a, mo37798d()));
    }

    public /* synthetic */ C9750q3(short[] sArr, AbstractC1043k abstractC1043k) {
        this(sArr);
    }
}
