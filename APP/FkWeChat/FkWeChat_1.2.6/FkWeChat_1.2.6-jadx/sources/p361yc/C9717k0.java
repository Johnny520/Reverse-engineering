package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9717k0 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public float[] f32980a;

    /* JADX INFO: renamed from: b */
    public int f32981b;

    public C9717k0(float[] fArr) {
        fArr.getClass();
        this.f32980a = fArr;
        this.f32981b = fArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        float[] fArr = this.f32980a;
        if (fArr.length < i10) {
            this.f32980a = Arrays.copyOf(fArr, AbstractC2368o.m8578e(i10, fArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f32981b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37951e(float f10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        float[] fArr = this.f32980a;
        int iMo37798d = mo37798d();
        this.f32981b = iMo37798d + 1;
        fArr[iMo37798d] = f10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] mo37796a() {
        return Arrays.copyOf(this.f32980a, mo37798d());
    }
}
