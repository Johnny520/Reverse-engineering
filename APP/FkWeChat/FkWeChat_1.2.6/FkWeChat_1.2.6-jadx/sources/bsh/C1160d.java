package bsh;

/* JADX INFO: renamed from: bsh.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1160d extends AbstractC1195i4 {
    public C1160d(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: k */
    public Object[] m4269k(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        int iMo4050r = mo4050r();
        Object[] objArr = new Object[iMo4050r];
        for (int i10 = 0; i10 < iMo4050r; i10++) {
            Object objMo4048p = mo4051s(i10).mo4048p(c1174f1, runnableC1205k2);
            objArr[i10] = objMo4048p;
            if (objMo4048p == Primitive.VOID) {
                throw new C1169e2("Undefined argument: " + mo4051s(i10).getText(), this, c1174f1);
            }
        }
        return objArr;
    }
}
