package p080f9;

import bsh.C1189h4;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5110v;

/* JADX INFO: renamed from: f9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2355b extends AbstractC5110v {

    /* JADX INFO: renamed from: q */
    public final int f6479q;

    /* JADX INFO: renamed from: r */
    public final int f6480r;

    /* JADX INFO: renamed from: s */
    public boolean f6481s;

    /* JADX INFO: renamed from: t */
    public int f6482t;

    public C2355b(char c10, char c11, int i10) {
        this.f6479q = i10;
        this.f6480r = c11;
        boolean z10 = false;
        if (i10 <= 0 ? AbstractC1061t.m3843d(c10, c11) >= 0 : AbstractC1061t.m3843d(c10, c11) <= 0) {
            z10 = true;
        }
        this.f6481s = z10;
        this.f6482t = z10 ? c10 : c11;
    }

    @Override // p185m8.AbstractC5110v
    /* JADX INFO: renamed from: g */
    public char mo8551g() {
        int i10 = this.f6482t;
        if (i10 != this.f6480r) {
            this.f6482t = this.f6479q + i10;
        } else {
            if (!this.f6481s) {
                C1189h4.m4429a();
                return (char) 0;
            }
            this.f6481s = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6481s;
    }
}
