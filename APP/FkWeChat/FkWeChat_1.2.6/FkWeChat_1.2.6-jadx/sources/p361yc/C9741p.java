package p361yc;

import java.util.Arrays;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: yc.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9741p extends AbstractC9734n2 {

    /* JADX INFO: renamed from: a */
    public char[] f33010a;

    /* JADX INFO: renamed from: b */
    public int f33011b;

    public C9741p(char[] cArr) {
        cArr.getClass();
        this.f33010a = cArr;
        this.f33011b = cArr.length;
        mo37797b(10);
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: b */
    public void mo37797b(int i10) {
        char[] cArr = this.f33010a;
        if (cArr.length < i10) {
            this.f33010a = Arrays.copyOf(cArr, AbstractC2368o.m8578e(i10, cArr.length * 2));
        }
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: d */
    public int mo37798d() {
        return this.f33011b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37996e(char c10) {
        AbstractC9734n2.m37985c(this, 0, 1, null);
        char[] cArr = this.f33010a;
        int iMo37798d = mo37798d();
        this.f33011b = iMo37798d + 1;
        cArr[iMo37798d] = c10;
    }

    @Override // p361yc.AbstractC9734n2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] mo37796a() {
        return Arrays.copyOf(this.f33010a, mo37798d());
    }
}
