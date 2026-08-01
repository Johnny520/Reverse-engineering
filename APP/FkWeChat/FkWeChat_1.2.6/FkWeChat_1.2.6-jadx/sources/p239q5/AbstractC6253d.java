package p239q5;

import bsh.C1259t2;
import p254r5.AbstractC6487a;

/* JADX INFO: renamed from: q5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6253d extends AbstractC6257h {

    /* JADX INFO: renamed from: u */
    public final AbstractC6487a f19394u;

    public AbstractC6253d(C6270u c6270u, C6274y c6274y, C6267r c6267r, C6268s c6268s, AbstractC6487a abstractC6487a) {
        super(c6270u, c6274y, c6267r, c6268s);
        if (abstractC6487a != null) {
            this.f19394u = abstractC6487a;
        } else {
            C1259t2.m5095a("cst == null");
            throw null;
        }
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: c */
    public boolean mo24687c(AbstractC6257h abstractC6257h) {
        return super.mo24687c(abstractC6257h) && this.f19394u.equals(((AbstractC6253d) abstractC6257h).m24688v());
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: f */
    public String mo24660f() {
        return this.f19394u.mo6828g();
    }

    /* JADX INFO: renamed from: v */
    public AbstractC6487a m24688v() {
        return this.f19394u;
    }
}
