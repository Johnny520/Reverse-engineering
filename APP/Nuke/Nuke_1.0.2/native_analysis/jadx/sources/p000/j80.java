package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j80 extends RuntimeException {

    /* JADX INFO: renamed from: h */
    public final C0182ex f4912h;

    public j80(C0182ex c0182ex) {
        this.f4912h = c0182ex;
        if (c0182ex.f2665b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c0182ex.f2664a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C0219fx c0219fx = (C0219fx) list.get(i);
            if (!AbstractC0460mg.m3084Y(iArr, c0219fx.f3159a)) {
                if (c0219fx.f3159a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((C0219fx) list.get(i3)).f3159a == 1000) {
                        break;
                    } else {
                        AbstractC0325iu.m2395i0(arrayList);
                    }
                } else {
                    arrayList.add(c0219fx);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((C0219fx) arrayList.get(i4)).f3159a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        C0182ex c0182ex = this.f4912h;
        if (!c0182ex.f2665b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        List list = c0182ex.f2664a;
        list.getClass();
        bf1 bf1Var = new bf1(list);
        int iMo529a = bf1Var.mo529a();
        for (int i = 0; i < iMo529a; i++) {
            ((C0219fx) bf1Var.get(i)).getClass();
        }
        pb1 pb1VarM1476z = AbstractC0179eu.m1476z(pb1VarM1424E);
        pb1VarM1476z.getClass();
        bf1 bf1Var2 = new bf1(pb1VarM1476z);
        int iMo529a2 = bf1Var2.mo529a();
        for (int i2 = 0; i2 < iMo529a2; i2++) {
            String str = (String) bf1Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
