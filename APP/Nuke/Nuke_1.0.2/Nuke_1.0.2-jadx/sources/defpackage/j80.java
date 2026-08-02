package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j80 extends RuntimeException {
    public final ex h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j80(ex exVar) {
        this.h = exVar;
        if (exVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = exVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            fx fxVar = (fx) list.get(i);
            if (!mg.Y(iArr, fxVar.a)) {
                if (fxVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((fx) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        iu.i0(arrayList);
                    }
                } else {
                    arrayList.add(fxVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((fx) arrayList.get(i4)).a, "SourceFile", 1);
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
        ex exVar = this.h;
        if (!exVar.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        pb1 pb1VarE = eu.E();
        List list = exVar.a;
        list.getClass();
        bf1 bf1Var = new bf1(list);
        int iA = bf1Var.a();
        for (int i = 0; i < iA; i++) {
            ((fx) bf1Var.get(i)).getClass();
        }
        pb1 pb1VarZ = eu.z(pb1VarE);
        pb1VarZ.getClass();
        bf1 bf1Var2 = new bf1(pb1VarZ);
        int iA2 = bf1Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) bf1Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
