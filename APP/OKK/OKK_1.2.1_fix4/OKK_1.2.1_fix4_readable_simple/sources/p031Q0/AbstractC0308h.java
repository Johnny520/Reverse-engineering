package p031Q0;

import java.io.Serializable;

/* JADX INFO: renamed from: Q0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0308h implements InterfaceC0305e, Serializable {
    private final int arity;

    public AbstractC0308h(int r1) {
        this.arity = r1;
    }

    @Override // p031Q0.InterfaceC0305e
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        AbstractC0314n.f596a.getClass();
        String r02 = C0315o.m708a(this);
        AbstractC0307g.m702d(r02, "renderLambdaToString(...)");
        return r02;
    }
}
