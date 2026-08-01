package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9696g extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public boolean[] f32937a;

    /* JADX INFO: renamed from: b */
    public int f32938b;

    public C9696g(boolean[] zArr) {
        zArr.getClass();
        this.f32937a = zArr;
        this.f32938b = zArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        boolean[] zArr = this.f32937a;
        if (zArr.length < i10) {
            this.f32937a = Arrays.copyOf(zArr, AbstractC2368o.m8578e(i10, zArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f32938b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37897e(boolean z10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        boolean[] zArr = this.f32937a;
        int iMo37798d = mo37798d();
        this.f32938b = iMo37798d + 1;
        zArr[iMo37798d] = z10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] mo37796a() {
        return Arrays.copyOf(this.f32937a, mo37798d());
    }
}
