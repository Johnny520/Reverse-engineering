package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: tn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0770tn extends RuntimeException {

    /* JADX INFO: renamed from: d */
    public final C0093ci f6016d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0770tn(C0093ci c0093ci) {
        this.f6016d = c0093ci;
        if (c0093ci.m538a()) {
            return;
        }
        ArrayList arrayListM3488q = rd0.m3488q(c0093ci);
        int size = arrayListM3488q.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((C0130di) arrayListM3488q.get(i)).f1110a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        C0093ci c0093ci = this.f6016d;
        if (!c0093ci.m538a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        int i = 0;
        if (c0093ci.m538a()) {
            wa0 wa0Var = new wa0(10);
            List list = c0093ci.f816a;
            list.getClass();
            nd0 nd0Var = new nd0(list);
            int iMo6a = nd0Var.mo6a();
            for (int i2 = 0; i2 < iMo6a; i2++) {
                ((C0130di) nd0Var.get(i2)).getClass();
            }
            wa0 wa0VarM2772l = o30.m2772l(wa0Var);
            wa0VarM2772l.getClass();
            nd0 nd0Var2 = new nd0(wa0VarM2772l);
            int iMo6a2 = nd0Var2.mo6a();
            while (i < iMo6a2) {
                String str = (String) nd0Var2.get(i);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
                i++;
            }
        } else {
            ArrayList arrayListM3488q = rd0.m3488q(c0093ci);
            int size = arrayListM3488q.size();
            while (i < size) {
                C0130di c0130di = (C0130di) arrayListM3488q.get(i);
                sb.append("\tat $$compose.m$");
                sb.append(c0130di.f1110a);
                sb.append("(SourceFile:1)\n");
                i++;
            }
        }
        return sb.toString();
    }
}
