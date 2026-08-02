package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gq extends hq {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(gq.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final fq k;
    public final boolean l;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r7v0 fq)
  (r8v0 boolean)
  (wrap:zd0:0x0003: SGET  A[WRAPPED] (LINE:4) zd0.h zd0)
  (-3 int)
  (wrap:hn:0x0001: SGET  A[WRAPPED] (LINE:2) hn.h hn)
 A[MD:(fq, boolean, a20, int, hn):void (m)] (LINE:9) call: gq.<init>(fq, boolean, a20, int, hn):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gq(fq fqVar, boolean z) {
        this(fqVar, z, zd0.h, -3, hn.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq, defpackage.zj0
    public final Object a(ak0 ak0Var, t00 t00Var) throws Throwable {
        int i = this.i;
        k20 k20Var = k20.h;
        if (i == -3) {
            boolean z = this.l;
            if (z && m.getAndSet(this, 1) == 1) {
                s.l("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objH = ci0.H(ak0Var, this.k, z, t00Var);
            if (objH == k20Var) {
                return objH;
            }
        } else {
            Object objA = super.a(ak0Var, t00Var);
            if (objA == k20Var) {
                return objA;
            }
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final String b() {
        return "channel=" + this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final Object c(o32 o32Var, t00 t00Var) throws Throwable {
        Object objH = ci0.H(new to2(o32Var), this.k, this.l, t00Var);
        return objH == k20.h ? objH : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final hq d(a20 a20Var, int i, hn hnVar) {
        return new gq(this.k, this.l, a20Var, i, hnVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final zj0 e() {
        return new gq(this.k, this.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final fq f(j20 j20Var) {
        if (!this.l || m.getAndSet(this, 1) != 1) {
            return this.i == -3 ? this.k : super.f(j20Var);
        }
        s.l("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public gq(fq fqVar, boolean z, a20 a20Var, int i, hn hnVar) {
        super(a20Var, i, hnVar);
        this.k = fqVar;
        this.l = z;
    }
}
