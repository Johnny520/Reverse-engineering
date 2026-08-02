package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ww */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0862ww extends RuntimeException {

    /* JADX INFO: renamed from: h */
    public final lk1 f12691h;

    /* JADX INFO: renamed from: i */
    public final lk1 f12692i;

    /* JADX INFO: renamed from: j */
    public final yj1 f12693j;

    /* JADX INFO: renamed from: k */
    public final int f12694k;

    public C0862ww(lk1 lk1Var, lk1 lk1Var2, yj1 yj1Var, int i, Exception exc) {
        super(exc);
        this.f12691h = lk1Var;
        this.f12692i = lk1Var2;
        this.f12693j = yj1Var;
        this.f12694k = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listM1434O;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.f12694k);
        sb.append(":\n            |");
        vo2 vo2VarM5340B = tp0.m5340B(new C0825vw(this, null));
        if (vo2VarM5340B.hasNext()) {
            Object next = vo2VarM5340B.next();
            if (vo2VarM5340B.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (vo2VarM5340B.hasNext()) {
                    arrayList.add(vo2VarM5340B.next());
                }
                listM1434O = arrayList;
            } else {
                listM1434O = AbstractC0179eu.m1434O(next);
            }
        } else {
            listM1434O = be0.f819h;
        }
        sb.append(AbstractC0142du.m1165u0(AbstractC0142du.m1145C0(50, listM1434O), "\n", null, null, null, 62));
        sb.append("\n            ");
        return qv2.m4290T(sb.toString());
    }
}
