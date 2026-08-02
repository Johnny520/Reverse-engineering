package p000;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w42 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public Object f12347l;

    /* JADX INFO: renamed from: m */
    public Object f12348m;

    /* JADX INFO: renamed from: n */
    public QuickJs f12349n;

    /* JADX INFO: renamed from: o */
    public long f12350o;

    /* JADX INFO: renamed from: p */
    public int f12351p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ mn0 f12352q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object[] f12353r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ QuickJs f12354s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ long f12355t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f12356u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(mn0 mn0Var, Object[] objArr, QuickJs quickJs, long j, long j2, t00 t00Var) {
        super(2, t00Var);
        this.f12352q = mn0Var;
        this.f12353r = objArr;
        this.f12354s = quickJs;
        this.f12355t = j;
        this.f12356u = j2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((w42) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new w42(this.f12352q, this.f12353r, this.f12354s, this.f12355t, this.f12356u, t00Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        if (r1 == r8) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #1 {all -> 0x00be, blocks: (B:31:0x00a8, B:33:0x00ae), top: B:68:0x00a8, outer: #0 }] */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        Throwable th;
        long j;
        QuickJs quickJs;
        il1 il1Var;
        il1 il1Var2;
        Object objMo12g;
        QuickJs quickJs2;
        long j2;
        Object obj2;
        il1 il1Var3;
        int i = this.f12351p;
        QuickJs quickJs3 = this.f12354s;
        k20 k20Var = k20.f5323h;
        try {
        } catch (Throwable th2) {
            th = th2;
            il1 il1Var4 = quickJs3.jsMutex;
            this.f12347l = th;
            this.f12348m = il1Var4;
            this.f12349n = quickJs3;
            long j3 = this.f12356u;
            this.f12350o = j3;
            this.f12351p = 3;
            kl1 kl1Var = (kl1) il1Var4;
            if (kl1Var.m2720d(this) != k20Var) {
                j = j3;
                quickJs = quickJs3;
                il1Var = kl1Var;
            }
            return k20Var;
        }
        if (i == 0) {
            fg1.m1627T(obj);
            mn0 mn0Var = this.f12352q;
            Object[] objArr = this.f12353r;
            c11 c11VarM799X = ci0.m799X(2, objArr.length);
            c11VarM799X.getClass();
            Object[] objArrM3093h0 = c11VarM799X.isEmpty() ? AbstractC0460mg.m3093h0(objArr, 0, 0) : AbstractC0460mg.m3093h0(objArr, c11VarM799X.f25h, c11VarM799X.f26i + 1);
            this.f12351p = 1;
            objMo12g = mn0Var.mo12g(objArrM3093h0, this);
            if (objMo12g == k20Var) {
            }
            return k20Var;
        }
        if (i == 1) {
            fg1.m1627T(obj);
            objMo12g = obj;
        } else if (i == 2) {
            long j4 = this.f12350o;
            QuickJs quickJs4 = this.f12349n;
            il1Var3 = (il1) this.f12348m;
            obj2 = this.f12347l;
            fg1.m1627T(obj);
            quickJs2 = quickJs4;
            j2 = j4;
            try {
                if (!quickJs2.isClosed()) {
                    quickJs2.invokeJsFunction(quickJs2.context, quickJs2.globals, j2, new Object[]{obj2});
                }
                ((kl1) il1Var3).m2722f(null);
                il1 il1Var5 = quickJs3.jsMutex;
                this.f12347l = il1Var5;
                this.f12348m = quickJs3;
                this.f12349n = null;
                this.f12351p = 4;
                kl1 kl1Var2 = (kl1) il1Var5;
                Object objM2720d = kl1Var2.m2720d(this);
                il1Var2 = kl1Var2;
            } finally {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quickJs3 = (QuickJs) this.f12348m;
                il1 il1Var6 = (il1) this.f12347l;
                fg1.m1627T(obj);
                il1Var2 = il1Var6;
                il1 il1Var7 = il1Var2;
                try {
                    if (!quickJs3.isClosed()) {
                        do {
                        } while (quickJs3.executePendingJob(quickJs3.context, quickJs3.globals));
                    }
                    ((kl1) il1Var7).m2722f(null);
                    return a83.f116a;
                } catch (Throwable th3) {
                    ((kl1) il1Var7).m2722f(null);
                    throw th3;
                }
            }
            long j5 = this.f12350o;
            QuickJs quickJs5 = this.f12349n;
            il1Var = (il1) this.f12348m;
            th = (Throwable) this.f12347l;
            fg1.m1627T(obj);
            quickJs = quickJs5;
            j = j5;
            try {
                if (!quickJs.isClosed()) {
                    quickJs.invokeJsFunction(quickJs.context, quickJs.globals, j, new Object[]{th});
                }
                il1 il1Var52 = quickJs3.jsMutex;
                this.f12347l = il1Var52;
                this.f12348m = quickJs3;
                this.f12349n = null;
                this.f12351p = 4;
                kl1 kl1Var22 = (kl1) il1Var52;
                Object objM2720d2 = kl1Var22.m2720d(this);
                il1Var2 = kl1Var22;
            } finally {
            }
        }
        il1 il1Var8 = quickJs3.jsMutex;
        long j6 = this.f12355t;
        this.f12347l = objMo12g;
        this.f12348m = il1Var8;
        this.f12349n = quickJs3;
        this.f12350o = j6;
        this.f12351p = 2;
        kl1 kl1Var3 = (kl1) il1Var8;
        if (kl1Var3.m2720d(this) != k20Var) {
            quickJs2 = quickJs3;
            j2 = j6;
            obj2 = objMo12g;
            il1Var3 = kl1Var3;
            if (!quickJs2.isClosed()) {
            }
            ((kl1) il1Var3).m2722f(null);
            il1 il1Var522 = quickJs3.jsMutex;
            this.f12347l = il1Var522;
            this.f12348m = quickJs3;
            this.f12349n = null;
            this.f12351p = 4;
            kl1 kl1Var222 = (kl1) il1Var522;
            Object objM2720d22 = kl1Var222.m2720d(this);
            il1Var2 = kl1Var222;
        }
        return k20Var;
    }
}
