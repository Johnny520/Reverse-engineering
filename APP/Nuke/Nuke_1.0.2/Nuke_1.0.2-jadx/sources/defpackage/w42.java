package defpackage;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w42 extends tw2 implements mn0 {
    public Object l;
    public Object m;
    public QuickJs n;
    public long o;
    public int p;
    public final /* synthetic */ mn0 q;
    public final /* synthetic */ Object[] r;
    public final /* synthetic */ QuickJs s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(mn0 mn0Var, Object[] objArr, QuickJs quickJs, long j, long j2, t00 t00Var) {
        super(2, t00Var);
        this.q = mn0Var;
        this.r = objArr;
        this.s = quickJs;
        this.t = j;
        this.u = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((w42) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new w42(this.q, this.r, this.s, this.t, this.u, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        if (r1 == r8) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #1 {all -> 0x00be, blocks: (B:31:0x00a8, B:33:0x00ae), top: B:68:0x00a8, outer: #0 }] */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        Throwable th;
        long j;
        QuickJs quickJs;
        il1 il1Var;
        il1 il1Var2;
        Object objG;
        QuickJs quickJs2;
        long j2;
        Object obj2;
        il1 il1Var3;
        int i = this.p;
        QuickJs quickJs3 = this.s;
        k20 k20Var = k20.h;
        try {
        } catch (Throwable th2) {
            th = th2;
            il1 il1Var4 = quickJs3.jsMutex;
            this.l = th;
            this.m = il1Var4;
            this.n = quickJs3;
            long j3 = this.u;
            this.o = j3;
            this.p = 3;
            kl1 kl1Var = (kl1) il1Var4;
            if (kl1Var.d(this) != k20Var) {
                j = j3;
                quickJs = quickJs3;
                il1Var = kl1Var;
            }
            return k20Var;
        }
        if (i == 0) {
            fg1.T(obj);
            mn0 mn0Var = this.q;
            Object[] objArr = this.r;
            c11 c11VarX = ci0.X(2, objArr.length);
            c11VarX.getClass();
            Object[] objArrH0 = c11VarX.isEmpty() ? mg.h0(objArr, 0, 0) : mg.h0(objArr, c11VarX.h, c11VarX.i + 1);
            this.p = 1;
            objG = mn0Var.g(objArrH0, this);
            if (objG == k20Var) {
            }
            return k20Var;
        }
        if (i == 1) {
            fg1.T(obj);
            objG = obj;
        } else if (i == 2) {
            long j4 = this.o;
            QuickJs quickJs4 = this.n;
            il1Var3 = (il1) this.m;
            obj2 = this.l;
            fg1.T(obj);
            quickJs2 = quickJs4;
            j2 = j4;
            try {
                if (!quickJs2.isClosed()) {
                    quickJs2.invokeJsFunction(quickJs2.context, quickJs2.globals, j2, new Object[]{obj2});
                }
                ((kl1) il1Var3).f(null);
                il1 il1Var5 = quickJs3.jsMutex;
                this.l = il1Var5;
                this.m = quickJs3;
                this.n = null;
                this.p = 4;
                kl1 kl1Var2 = (kl1) il1Var5;
                Object objD = kl1Var2.d(this);
                il1Var2 = kl1Var2;
            } finally {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quickJs3 = (QuickJs) this.m;
                il1 il1Var6 = (il1) this.l;
                fg1.T(obj);
                il1Var2 = il1Var6;
                il1 il1Var7 = il1Var2;
                try {
                    if (!quickJs3.isClosed()) {
                        do {
                        } while (quickJs3.executePendingJob(quickJs3.context, quickJs3.globals));
                    }
                    ((kl1) il1Var7).f(null);
                    return a83.a;
                } catch (Throwable th3) {
                    ((kl1) il1Var7).f(null);
                    throw th3;
                }
            }
            long j5 = this.o;
            QuickJs quickJs5 = this.n;
            il1Var = (il1) this.m;
            th = (Throwable) this.l;
            fg1.T(obj);
            quickJs = quickJs5;
            j = j5;
            try {
                if (!quickJs.isClosed()) {
                    quickJs.invokeJsFunction(quickJs.context, quickJs.globals, j, new Object[]{th});
                }
                il1 il1Var52 = quickJs3.jsMutex;
                this.l = il1Var52;
                this.m = quickJs3;
                this.n = null;
                this.p = 4;
                kl1 kl1Var22 = (kl1) il1Var52;
                Object objD2 = kl1Var22.d(this);
                il1Var2 = kl1Var22;
            } finally {
            }
        }
        il1 il1Var8 = quickJs3.jsMutex;
        long j6 = this.t;
        this.l = objG;
        this.m = il1Var8;
        this.n = quickJs3;
        this.o = j6;
        this.p = 2;
        kl1 kl1Var3 = (kl1) il1Var8;
        if (kl1Var3.d(this) != k20Var) {
            quickJs2 = quickJs3;
            j2 = j6;
            obj2 = objG;
            il1Var3 = kl1Var3;
            if (!quickJs2.isClosed()) {
            }
            ((kl1) il1Var3).f(null);
            il1 il1Var522 = quickJs3.jsMutex;
            this.l = il1Var522;
            this.m = quickJs3;
            this.n = null;
            this.p = 4;
            kl1 kl1Var222 = (kl1) il1Var522;
            Object objD22 = kl1Var222.d(this);
            il1Var2 = kl1Var222;
        }
        return k20Var;
    }
}
