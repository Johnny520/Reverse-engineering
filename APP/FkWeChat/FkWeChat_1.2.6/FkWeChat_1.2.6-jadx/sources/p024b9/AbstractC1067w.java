package p024b9;

import java.io.Serializable;

/* JADX INFO: renamed from: b9.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1067w implements InterfaceC1051o, Serializable {

    /* JADX INFO: renamed from: q */
    public final int f3218q;

    public AbstractC1067w(int i10) {
        this.f3218q = i10;
    }

    @Override // p024b9.InterfaceC1051o
    public int getArity() {
        return this.f3218q;
    }

    public String toString() {
        String strM3816k = AbstractC1052o0.m3816k(this);
        strM3816k.getClass();
        return strM3816k;
    }
}
