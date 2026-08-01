package p080f9;

import bsh.C1189h4;
import p185m8.AbstractC5101q0;

/* JADX INFO: renamed from: f9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2362i extends AbstractC5101q0 {

    /* JADX INFO: renamed from: q */
    public final int f6491q;

    /* JADX INFO: renamed from: r */
    public final int f6492r;

    /* JADX INFO: renamed from: s */
    public boolean f6493s;

    /* JADX INFO: renamed from: t */
    public int f6494t;

    public C2362i(int i10, int i11, int i12) {
        this.f6491q = i12;
        this.f6492r = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f6493s = z10;
        this.f6494t = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6493s;
    }

    @Override // p185m8.AbstractC5101q0
    public int nextInt() {
        int i10 = this.f6494t;
        if (i10 != this.f6492r) {
            this.f6494t = this.f6491q + i10;
            return i10;
        }
        if (this.f6493s) {
            this.f6493s = false;
            return i10;
        }
        C1189h4.m4429a();
        return 0;
    }
}
