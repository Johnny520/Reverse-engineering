package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import nuke.module.wechat.p002ai.AIModelInfo;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867x0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12746h;

    /* JADX INFO: renamed from: i */
    public final Object f12747i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f12748j;

    public C0867x0(qv0 qv0Var, tv0 tv0Var) {
        this.f12746h = 3;
        this.f12748j = qv0Var;
        this.f12747i = tv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws Throwable {
        int i = this.f12746h;
        a83 a83Var = a83.f116a;
        Object obj = this.f12747i;
        Object obj2 = this.f12748j;
        switch (i) {
            case 0:
                ((in0) obj).mo5j(((AIModelInfo) obj2).getId());
                return a83Var;
            case 1:
                AtomicLong atomicLong = AbstractC0933yr.f13595a;
                ((xk1) obj2).setValue((C0971zq) obj);
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
                    if (!tv0Var.m5438b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } while (tv0Var.m5438b(false, this));
                    cg0 cg0Var2 = cg0.NO_ERROR;
                    try {
                        cg0Var = cg0.CANCEL;
                        qv0Var.m4281b(cg0Var2, cg0Var, null);
                        this = cg0Var2;
                    } catch (IOException e2) {
                        iOException = e2;
                        cg0 cg0Var3 = cg0.PROTOCOL_ERROR;
                        qv0Var.m4281b(cg0Var3, cg0Var3, iOException);
                        this = cg0Var3;
                    }
                    ug3.m5494b(tv0Var);
                    return a83Var;
                    this = cg0Var;
                } catch (Throwable th3) {
                    th = th3;
                }
                qv0Var.m4281b(this, cg0Var, iOException);
                ug3.m5494b(tv0Var);
                throw th;
        }
    }

    public /* synthetic */ C0867x0(int i, Object obj, Object obj2) {
        this.f12746h = i;
        this.f12747i = obj;
        this.f12748j = obj2;
    }
}
