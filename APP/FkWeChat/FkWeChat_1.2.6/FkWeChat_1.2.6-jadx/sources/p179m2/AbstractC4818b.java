package p179m2;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: m2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4818b implements InterfaceC4843g {

    /* JADX INFO: renamed from: a */
    public String f14347a;

    /* JADX INFO: renamed from: b */
    public final int[] f14348b = new int[2];

    /* JADX INFO: renamed from: c */
    public final int[] m19290c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f14348b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final String m19291d() {
        String str = this.f14347a;
        if (str != null) {
            return str;
        }
        AbstractC1061t.m3851l("text");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void mo19292e(String str) {
        m19293f(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m19293f(String str) {
        this.f14347a = str;
    }
}
