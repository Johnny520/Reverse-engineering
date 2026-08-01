package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9711j extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public byte[] f32961a;

    /* JADX INFO: renamed from: b */
    public int f32962b;

    public C9711j(byte[] bArr) {
        bArr.getClass();
        this.f32961a = bArr;
        this.f32962b = bArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        byte[] bArr = this.f32961a;
        if (bArr.length < i10) {
            this.f32961a = Arrays.copyOf(bArr, AbstractC2368o.m8578e(i10, bArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f32962b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37929e(byte b10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        byte[] bArr = this.f32961a;
        int iMo37798d = mo37798d();
        this.f32962b = iMo37798d + 1;
        bArr[iMo37798d] = b10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] mo37796a() {
        return Arrays.copyOf(this.f32961a, mo37798d());
    }
}
