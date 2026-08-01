package p045d5;

import ae.C0307f;
import p254r5.AbstractC6487a;
import p254r5.C6488a0;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6506k;
import p254r5.C6509n;
import p254r5.C6510o;
import p254r5.C6517v;
import p254r5.C6519x;
import p309v5.AbstractC8824f;

/* JADX INFO: renamed from: d5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1882d extends AbstractC8824f {
    public C1882d(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public void m6709E(int i10, AbstractC6487a abstractC6487a) {
        if ((abstractC6487a instanceof C6492c0) || (abstractC6487a instanceof C6496e0) || (abstractC6487a instanceof C6510o) || (abstractC6487a instanceof C6517v) || (abstractC6487a instanceof C6509n) || (abstractC6487a instanceof C6506k) || (abstractC6487a instanceof C6519x) || (abstractC6487a instanceof C6488a0)) {
            m33889y(i10, abstractC6487a);
        } else {
            C0307f.m923a("bad type for bootstrap argument: ", abstractC6487a.getClass());
        }
    }

    public AbstractC6487a get(int i10) {
        return (AbstractC6487a) m33887w(i10);
    }
}
