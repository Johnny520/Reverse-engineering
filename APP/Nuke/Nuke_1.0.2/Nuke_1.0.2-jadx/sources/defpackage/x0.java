package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import nuke.module.wechat.ai.AIModelInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements xm0 {
    public final /* synthetic */ int h;
    public final Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x0(qv0 qv0Var, tv0 tv0Var) {
        this.h = 3;
        this.j = qv0Var;
        this.i = tv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x002b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x0013 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: x0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: cg0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: cg0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: cg0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // defpackage.xm0
    public final Object a() throws Throwable {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ((in0) obj).j(((AIModelInfo) obj2).getId());
                return a83Var;
            case 1:
                AtomicLong atomicLong = yr.a;
                ((xk1) obj2).setValue((zq) obj);
                return a83Var;
            case 2:
                ((xk1) obj2).setValue((xt0) obj);
                return a83Var;
            default:
                qv0 qv0Var = (qv0) obj2;
                tv0 tv0Var = (tv0) obj;
                cg0 cg0Var = cg0.INTERNAL_ERROR;
                IOException iOException = null;
                try {
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        iOException = e;
                    }
                    if (!tv0Var.b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } while (tv0Var.b(false, this));
                    cg0 cg0Var2 = cg0.NO_ERROR;
                    try {
                        cg0Var = cg0.CANCEL;
                        qv0Var.b(cg0Var2, cg0Var, null);
                        this = cg0Var2;
                    } catch (IOException e2) {
                        iOException = e2;
                        cg0 cg0Var3 = cg0.PROTOCOL_ERROR;
                        qv0Var.b(cg0Var3, cg0Var3, iOException);
                        this = cg0Var3;
                    }
                    ug3.b(tv0Var);
                    return a83Var;
                    this = cg0Var;
                } catch (Throwable th3) {
                    th = th3;
                }
                qv0Var.b(this, cg0Var, iOException);
                ug3.b(tv0Var);
                throw th;
        }
    }

    public /* synthetic */ x0(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }
}
