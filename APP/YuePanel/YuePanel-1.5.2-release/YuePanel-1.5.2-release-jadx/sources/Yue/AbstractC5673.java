package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5673<R> implements InterfaceC5149<R>, Serializable {
    private final int arity;

    public AbstractC5673(int i) {
        this.arity = i;
    }

    @Override // Yue.InterfaceC5149
    public int getArity() {
        return this.arity;
    }

    @InterfaceC6399
    public String toString() {
        String strM22016 = C7071.m22016(this);
        C5499.m17102(strM22016, "renderLambdaToString(this)");
        return strM22016;
    }
}
