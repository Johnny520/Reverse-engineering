package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9698g1 extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public long[] f32941a;

    /* JADX INFO: renamed from: b */
    public int f32942b;

    public C9698g1(long[] jArr) {
        jArr.getClass();
        this.f32941a = jArr;
        this.f32942b = jArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        long[] jArr = this.f32941a;
        if (jArr.length < i10) {
            this.f32941a = Arrays.copyOf(jArr, AbstractC2368o.m8578e(i10, jArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f32942b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37901e(long j10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        long[] jArr = this.f32941a;
        int iMo37798d = mo37798d();
        this.f32942b = iMo37798d + 1;
        jArr[iMo37798d] = j10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] mo37796a() {
        return Arrays.copyOf(this.f32941a, mo37798d());
    }
}
