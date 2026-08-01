package p182m5;

import bsh.C1193i2;

/* JADX INFO: renamed from: m5.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4979a0 extends AbstractC4982b0 {

    /* JADX INFO: renamed from: q */
    public int f15117q = -1;

    /* JADX INFO: renamed from: j */
    public final int m20098j() {
        int i10 = this.f15117q;
        if (i10 >= 0) {
            return i10;
        }
        C1193i2.m4438a("index not yet set");
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m20099k() {
        return this.f15117q >= 0;
    }

    /* JADX INFO: renamed from: l */
    public final String m20100l() {
        return "[" + Integer.toHexString(this.f15117q) + ']';
    }

    /* JADX INFO: renamed from: m */
    public final void m20101m(int i10) {
        if (this.f15117q == -1) {
            this.f15117q = i10;
        } else {
            C1193i2.m4438a("index already set");
        }
    }
}
