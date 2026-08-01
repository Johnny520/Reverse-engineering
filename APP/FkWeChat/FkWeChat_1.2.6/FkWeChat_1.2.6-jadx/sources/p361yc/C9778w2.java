package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.w2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9778w2 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public short[] f33062a;

    /* JADX INFO: renamed from: b */
    public int f33063b;

    public C9778w2(short[] sArr) {
        sArr.getClass();
        this.f33062a = sArr;
        this.f33063b = sArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        short[] sArr = this.f33062a;
        if (sArr.length < i10) {
            this.f33062a = Arrays.copyOf(sArr, AbstractC2368o.m8578e(i10, sArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f33063b;
    }

    /* JADX INFO: renamed from: e */
    public final void m38075e(short s10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        short[] sArr = this.f33062a;
        int iMo37798d = mo37798d();
        this.f33063b = iMo37798d + 1;
        sArr[iMo37798d] = s10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] mo37796a() {
        return Arrays.copyOf(this.f33062a, mo37798d());
    }
}
