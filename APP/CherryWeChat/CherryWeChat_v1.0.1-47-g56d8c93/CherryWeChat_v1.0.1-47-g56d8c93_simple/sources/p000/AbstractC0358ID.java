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

    public void setPathData(C0552Mt[] r7) {
        if (AbstractC1406fG.m2682G(this.f1222a, r7) == true) goto L6;
        this.f1222a = AbstractC1406fG.m2690P(r7);
        return;
    L6:
        C0552Mt[] r0 = this.f1222a;
        int r2 = 0;
    L8:
        if (r2 >= r7.length) goto L14;
        r0[r2].f1820a = r7[r2].f1820a;
        int r3 = 0;
    L10:
        float[] r4 = r7[r2].f1821b;
        if (r3 >= r4.length) goto L13;
        r0[r2].f1821b[r3] = r4[r3];
        r3 = r3 + 1;
        goto L10
    L13:
        r2 = r2 + 1;
        goto L8
    }

    public AbstractC0358ID(AbstractC0358ID r2) {
        this.f1222a = null;
        this.f1224c = 0;
        this.f1223b = r2.f1223b;
        this.f1222a = AbstractC1406fG.m2690P(r2.f1222a);
    }
}
