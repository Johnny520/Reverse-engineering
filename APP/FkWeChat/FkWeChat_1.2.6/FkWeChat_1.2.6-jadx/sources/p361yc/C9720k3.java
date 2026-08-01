package p361yc;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p172l8.C4686b0;

/* JADX INFO: renamed from: yc.k3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9720k3 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public int[] f32986a;

    /* JADX INFO: renamed from: b */
    public int f32987b;

    public C9720k3(int[] iArr) {
        iArr.getClass();
        this.f32986a = iArr;
        this.f32987b = C4686b0.m18717t(iArr);
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo37796a() {
        return C4686b0.m18710a(m37958f());
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        if (C4686b0.m18717t(this.f32986a) < i10) {
            int[] iArr = this.f32986a;
            this.f32986a = C4686b0.m18712e(Arrays.copyOf(iArr, AbstractC2368o.m8578e(i10, C4686b0.m18717t(iArr) * 2)));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f32987b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37957e(int i10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        int[] iArr = this.f32986a;
        int iMo37798d = mo37798d();
        this.f32987b = iMo37798d + 1;
        C4686b0.m18721x(iArr, iMo37798d, i10);
    }

    /* JADX INFO: renamed from: f */
    public int[] m37958f() {
        return C4686b0.m18712e(Arrays.copyOf(this.f32986a, mo37798d()));
    }

    public /* synthetic */ C9720k3(int[] iArr, AbstractC1043k abstractC1043k) {
        this(iArr);
    }
}
