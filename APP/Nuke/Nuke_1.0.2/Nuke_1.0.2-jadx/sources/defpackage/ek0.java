package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 extends u00 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ fk0 m;
    public ak0 n;
    public Serializable o;
    public int p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(fk0 fk0Var, t00 t00Var) {
        super(t00Var);
        this.m = fk0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
