package p000;

/* JADX INFO: renamed from: ID */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0358ID extends AbstractC0315HD {

    /* JADX INFO: renamed from: a */
    public C0552Mt[] f1222a;

    /* JADX INFO: renamed from: b */
    public String f1223b;

    /* JADX INFO: renamed from: c */
    public int f1224c;

    public AbstractC0358ID() {
        this.f1222a = null;
        this.f1224c = 0;
    }

    public C0552Mt[] getPathData() {
        return this.f1222a;
    }

    public String getPathName() {
        return this.f1223b;
    }

    public void setPathData(C0552Mt[] c0552MtArr) {
        if (!AbstractC1406fG.m2682G(this.f1222a, c0552MtArr)) {
            this.f1222a = AbstractC1406fG.m2690P(c0552MtArr);
            return;
        }
        C0552Mt[] c0552MtArr2 = this.f1222a;
        for (int i = 0; i < c0552MtArr.length; i++) {
            c0552MtArr2[i].f1820a = c0552MtArr[i].f1820a;
            int i2 = 0;
            while (true) {
                float[] fArr = c0552MtArr[i].f1821b;
                if (i2 < fArr.length) {
                    c0552MtArr2[i].f1821b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC0358ID(AbstractC0358ID abstractC0358ID) {
        this.f1222a = null;
        this.f1224c = 0;
        this.f1223b = abstractC0358ID.f1223b;
        this.f1222a = AbstractC1406fG.m2690P(abstractC0358ID.f1222a);
    }
}
