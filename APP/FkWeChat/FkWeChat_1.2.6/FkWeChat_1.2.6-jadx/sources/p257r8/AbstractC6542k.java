package p257r8;

import p024b9.AbstractC1052o0;
import p024b9.InterfaceC1051o;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: r8.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6542k extends AbstractC6541j implements InterfaceC1051o {

    /* JADX INFO: renamed from: q */
    public final int f20497q;

    public AbstractC6542k(int i10, InterfaceC5976f interfaceC5976f) {
        super(interfaceC5976f);
        this.f20497q = i10;
    }

    @Override // p024b9.InterfaceC1051o
    public int getArity() {
        return this.f20497q;
    }

    @Override // p257r8.AbstractC6532a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM3815j = AbstractC1052o0.m3815j(this);
        strM3815j.getClass();
        return strM3815j;
    }
}
