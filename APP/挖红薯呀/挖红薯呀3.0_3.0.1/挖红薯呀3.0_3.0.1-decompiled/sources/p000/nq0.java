package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 extends AbstractC0597p {

    /* JADX INFO: renamed from: d */
    public final gq0 f4303d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nq0(gq0 gq0Var) {
        this.f4303d = gq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        gq0 gq0Var = this.f4303d;
        gq0Var.getClass();
        return gq0Var.f2038e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4303d.containsValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        l91 l91Var = this.f4303d.f2037d;
        m91[] m91VarArr = new m91[8];
        for (int i = 0; i < 8; i++) {
            m91VarArr[i] = new n91(2);
        }
        return new mq0(l91Var, m91VarArr);
    }
}
