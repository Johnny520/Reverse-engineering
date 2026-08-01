package p280t5;

import bsh.C1193i2;
import p239q5.C6267r;
import p309v5.C8829k;

/* JADX INFO: renamed from: t5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8110a extends AbstractC8125p {

    /* JADX INFO: renamed from: a */
    public final C8829k f27061a;

    /* JADX INFO: renamed from: b */
    public int f27062b;

    public C8110a(int i10) {
        this.f27061a = new C8829k(i10);
    }

    @Override // p280t5.AbstractC8125p
    /* JADX INFO: renamed from: a */
    public int mo31330a() {
        return this.f27062b;
    }

    @Override // p280t5.AbstractC8125p
    /* JADX INFO: renamed from: b */
    public C6267r mo31331b(C6267r c6267r) {
        int iM33920z;
        if (c6267r == null) {
            return null;
        }
        try {
            iM33920z = this.f27061a.m33920z(c6267r.m24754t());
        } catch (IndexOutOfBoundsException unused) {
            iM33920z = -1;
        }
        if (iM33920z >= 0) {
            return c6267r.m24745J(iM33920z);
        }
        C1193i2.m4438a("no mapping specified for register");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void mo31332e(int i10, int i11, int i12) {
        if (i10 >= this.f27061a.size()) {
            for (int size = i10 - this.f27061a.size(); size >= 0; size--) {
                this.f27061a.m33917w(-1);
            }
        }
        this.f27061a.m33913I(i10, i11);
        int i13 = i11 + i12;
        if (this.f27062b < i13) {
            this.f27062b = i13;
        }
    }

    /* JADX INFO: renamed from: f */
    public int m31333f(int i10) {
        if (i10 >= this.f27061a.size()) {
            return -1;
        }
        return this.f27061a.m33920z(i10);
    }
}
