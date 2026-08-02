package defpackage;

import java.util.concurrent.CancellationException;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends tw2 implements mn0 {
    public final /* synthetic */ int l = 1;
    public o72 m;
    public o72 n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ am2 q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(o72 o72Var, am2 am2Var, t00 t00Var) {
        super(2, t00Var);
        this.n = o72Var;
        this.q = am2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((dc0) p((t00) obj2, (in0) obj)).r(a83Var);
            default:
                return ((dc0) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        am2 am2Var = this.q;
        switch (i) {
            case 0:
                dc0 dc0Var = new dc0(this.n, am2Var, t00Var);
                dc0Var.p = obj;
                return dc0Var;
            default:
                dc0 dc0Var2 = new dc0(am2Var, t00Var);
                dc0Var2.p = obj;
                return dc0Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:35|36|(1:39)|(0)|15|90|42|(2:48|(2:50|(0)))(2:44|(1:46))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:42:0x00c1, B:44:0x00c7, B:48:0x00d9, B:50:0x00dd), top: B:90:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:42:0x00c1, B:44:0x00c7, B:48:0x00d9, B:50:0x00dd), top: B:90:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d4 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00db -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e8 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f6 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0142 -> B:80:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0146 -> B:82:0x0148). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws Throwable {
        in0 in0Var;
        Object obj2;
        j20 j20Var;
        o72 o72Var;
        o72 o72Var2;
        o72 o72Var3;
        j20 j20Var2;
        j20 j20Var3;
        Object obj3;
        Object objF;
        qb0 qb0Var;
        Object obj4;
        int i = this.l;
        k20 k20Var = k20.h;
        am2 am2Var = this.q;
        a83 a83Var = a83.a;
        t00 t00Var = null;
        switch (i) {
            case 0:
                o72 o72Var4 = this.n;
                int i2 = this.o;
                if (i2 != 0) {
                    if (i2 == 1) {
                        o72 o72Var5 = this.m;
                        in0Var = (in0) this.p;
                        fg1.T(obj);
                        qb0 qb0Var2 = (qb0) obj;
                        o72Var5.i = qb0Var2;
                        obj2 = o72Var4.i;
                        if (!(obj2 instanceof pb0) || (obj2 instanceof mb0)) {
                            break;
                        } else {
                            nb0 nb0Var = obj2 instanceof nb0 ? (nb0) obj2 : null;
                            if (nb0Var != null) {
                                in0Var.j(nb0Var);
                            }
                            jn jnVar = am2Var.C;
                            if (jnVar == null) {
                                o72Var5 = o72Var4;
                                qb0Var2 = null;
                                o72Var5.i = qb0Var2;
                                obj2 = o72Var4.i;
                                if (!(obj2 instanceof pb0)) {
                                }
                                break;
                            } else {
                                this.p = in0Var;
                                this.m = o72Var4;
                                this.o = 1;
                                obj = jnVar.w(this);
                                if (obj != k20Var) {
                                    o72Var5 = o72Var4;
                                    qb0 qb0Var22 = (qb0) obj;
                                    o72Var5.i = qb0Var22;
                                    obj2 = o72Var4.i;
                                    if (!(obj2 instanceof pb0)) {
                                    }
                                    break;
                                }
                            }
                        }
                    } else {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    fg1.T(obj);
                    in0Var = (in0) this.p;
                    obj2 = o72Var4.i;
                    if (!(obj2 instanceof pb0)) {
                    }
                    break;
                }
                break;
            default:
                switch (this.o) {
                    case 0:
                        fg1.T(obj);
                        j20Var = (j20) this.p;
                        if (te.Q(j20Var)) {
                            o72Var = new o72();
                            jn jnVar2 = am2Var.C;
                            if (jnVar2 != null) {
                                this.p = j20Var;
                                this.m = o72Var;
                                this.n = o72Var;
                                this.o = 1;
                                obj = jnVar2.w(this);
                                if (obj != k20Var) {
                                    o72Var2 = o72Var;
                                    qb0Var = (qb0) obj;
                                    o72Var.i = qb0Var;
                                    obj4 = o72Var2.i;
                                    if (obj4 instanceof ob0) {
                                        this.p = j20Var;
                                        this.m = o72Var2;
                                        this.n = null;
                                        this.o = 2;
                                        if (am2.Q0(am2Var, (ob0) obj4, this) != k20Var) {
                                            o72Var3 = o72Var2;
                                            j20Var2 = j20Var;
                                            dc0 dc0Var = new dc0(o72Var3, am2Var, null);
                                            this.p = j20Var2;
                                            this.m = o72Var3;
                                            this.o = 3;
                                            im2 im2Var = am2Var.U;
                                            objF = im2Var.f(bl1.i, new b2(dc0Var, im2Var, t00Var, 17), this);
                                            if (objF != k20Var) {
                                                objF = a83Var;
                                            }
                                            if (objF == k20Var) {
                                            }
                                            j20Var = j20Var2;
                                            obj3 = o72Var3.i;
                                            if (obj3 instanceof pb0) {
                                                this.p = j20Var;
                                                this.m = null;
                                                this.o = 4;
                                                if (am2.R0(am2Var, (pb0) obj3, this) == k20Var) {
                                                }
                                                break;
                                            } else if (obj3 instanceof mb0) {
                                                this.p = j20Var;
                                                this.m = null;
                                                this.o = 5;
                                                if (am2.P0(am2Var, this) == k20Var) {
                                                }
                                            }
                                        }
                                    }
                                    if (te.Q(j20Var)) {
                                        break;
                                    }
                                }
                            } else {
                                o72Var2 = o72Var;
                                qb0Var = null;
                                o72Var.i = qb0Var;
                                obj4 = o72Var2.i;
                                if (obj4 instanceof ob0) {
                                }
                                if (te.Q(j20Var)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        o72Var = this.n;
                        o72Var2 = this.m;
                        j20Var = (j20) this.p;
                        fg1.T(obj);
                        qb0Var = (qb0) obj;
                        o72Var.i = qb0Var;
                        obj4 = o72Var2.i;
                        if (obj4 instanceof ob0) {
                        }
                        if (te.Q(j20Var)) {
                        }
                        break;
                    case 2:
                        o72Var3 = this.m;
                        j20Var2 = (j20) this.p;
                        fg1.T(obj);
                        dc0 dc0Var2 = new dc0(o72Var3, am2Var, null);
                        this.p = j20Var2;
                        this.m = o72Var3;
                        this.o = 3;
                        im2 im2Var2 = am2Var.U;
                        objF = im2Var2.f(bl1.i, new b2(dc0Var2, im2Var2, t00Var, 17), this);
                        if (objF != k20Var) {
                        }
                        if (objF == k20Var) {
                        }
                        j20Var = j20Var2;
                        obj3 = o72Var3.i;
                        if (obj3 instanceof pb0) {
                        }
                        if (te.Q(j20Var)) {
                        }
                        break;
                    case 3:
                        o72Var3 = this.m;
                        j20Var2 = (j20) this.p;
                        try {
                            fg1.T(obj);
                        } catch (CancellationException unused) {
                            j20Var3 = j20Var2;
                            this.p = j20Var3;
                            this.m = null;
                            this.o = 6;
                            if (am2.P0(am2Var, this) == k20Var) {
                            }
                            j20Var = j20Var3;
                            if (te.Q(j20Var)) {
                            }
                        }
                        j20Var = j20Var2;
                        obj3 = o72Var3.i;
                        if (obj3 instanceof pb0) {
                        }
                        if (te.Q(j20Var)) {
                        }
                        break;
                    case 4:
                        j20Var3 = (j20) this.p;
                        try {
                            fg1.T(obj);
                        } catch (CancellationException unused2) {
                            this.p = j20Var3;
                            this.m = null;
                            this.o = 6;
                            if (am2.P0(am2Var, this) == k20Var) {
                                return k20Var;
                            }
                        }
                        j20Var = j20Var3;
                        if (te.Q(j20Var)) {
                        }
                        break;
                    case 5:
                        j20Var3 = (j20) this.p;
                        fg1.T(obj);
                        j20Var = j20Var3;
                        if (te.Q(j20Var)) {
                        }
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        j20Var3 = (j20) this.p;
                        fg1.T(obj);
                        j20Var = j20Var3;
                        if (te.Q(j20Var)) {
                        }
                        break;
                    default:
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(am2 am2Var, t00 t00Var) {
        super(2, t00Var);
        this.q = am2Var;
    }
}
