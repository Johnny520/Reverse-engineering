package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9667a0 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public double[] f32897a;

    /* JADX INFO: renamed from: b */
    public int f32898b;

    public C9667a0(double[] dArr) {
        dArr.getClass();
        this.f32897a = dArr;
        this.f32898b = dArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        double[] dArr = this.f32897a;
        if (dArr.length < i10) {
            this.f32897a = Arrays.copyOf(dArr, AbstractC2368o.m8578e(i10, dArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f32898b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37799e(double d10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        double[] dArr = this.f32897a;
        int iMo37798d = mo37798d();
        this.f32898b = iMo37798d + 1;
        dArr[iMo37798d] = d10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] mo37796a() {
        return Arrays.copyOf(this.f32897a, mo37798d());
    }
}
