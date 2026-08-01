package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9772v0 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public int[] f33054a;

    /* JADX INFO: renamed from: b */
    public int f33055b;

    public C9772v0(int[] iArr) {
        iArr.getClass();
        this.f33054a = iArr;
        this.f33055b = iArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        int[] iArr = this.f33054a;
        if (iArr.length < i10) {
            this.f33054a = Arrays.copyOf(iArr, AbstractC2368o.m8578e(i10, iArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f33055b;
    }

    /* JADX INFO: renamed from: e */
    public final void m38067e(int i10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        int[] iArr = this.f33054a;
        int iMo37798d = mo37798d();
        this.f33055b = iMo37798d + 1;
        iArr[iMo37798d] = i10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] mo37796a() {
        return Arrays.copyOf(this.f33054a, mo37798d());
    }
}
