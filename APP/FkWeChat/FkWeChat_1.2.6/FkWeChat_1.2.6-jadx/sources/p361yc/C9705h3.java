package p361yc;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p172l8.C4719z;

/* JADX INFO: renamed from: yc.h3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9705h3 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public byte[] f32950a;

    /* JADX INFO: renamed from: b */
    public int f32951b;

    public C9705h3(byte[] bArr) {
        bArr.getClass();
        this.f32950a = bArr;
        this.f32951b = C4719z.m18830t(bArr);
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo37796a() {
        return C4719z.m18823a(m37915f());
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        if (C4719z.m18830t(this.f32950a) < i10) {
            byte[] bArr = this.f32950a;
            this.f32950a = C4719z.m18825e(Arrays.copyOf(bArr, AbstractC2368o.m8578e(i10, C4719z.m18830t(bArr) * 2)));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f32951b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37914e(byte b10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        byte[] bArr = this.f32950a;
        int iMo37798d = mo37798d();
        this.f32951b = iMo37798d + 1;
        C4719z.m18834x(bArr, iMo37798d, b10);
    }

    /* JADX INFO: renamed from: f */
    public byte[] m37915f() {
        return C4719z.m18825e(Arrays.copyOf(this.f32950a, mo37798d()));
    }

    public /* synthetic */ C9705h3(byte[] bArr, AbstractC1043k abstractC1043k) {
        this(bArr);
    }
}
