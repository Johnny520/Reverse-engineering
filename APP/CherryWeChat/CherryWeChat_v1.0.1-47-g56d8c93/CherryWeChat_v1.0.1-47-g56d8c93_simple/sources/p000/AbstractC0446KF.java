package p000;

/* JADX INFO: renamed from: KF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0446KF {
    /* JADX INFO: renamed from: a */
    public static int m895a(int r5) {
        int r0 = 0;
        int r2 = 1;
    L4:
        if (r2 > 512) goto L35;
        if ((r5 & r2) == 0) goto L34;
        if (r2 != 1) goto L9;
        int r3 = AbstractC0773S.m1590u();
    L25:
        r0 = r0 | r3;
        goto L34
    L9:
        if (r2 != 2) goto L11;
        r3 = AbstractC0773S.m1594y();
        goto L25
    L11:
        if (r2 != 4) goto L13;
        r3 = AbstractC0773S.m1595z();
        goto L25
    L13:
        if (r2 != 8) goto L15;
        r3 = AbstractC0773S.m1566A();
        goto L25
    L15:
        if (r2 != 16) goto L17;
        r3 = AbstractC0773S.m1567B();
        goto L25
    L17:
        if (r2 != 32) goto L19;
        r3 = AbstractC0773S.m1568C();
        goto L25
    L19:
        if (r2 != 64) goto L21;
        r3 = AbstractC0773S.m1569D();
        goto L25
    L21:
        if (r2 == 128) goto L26;
        if (r2 != 512) goto L34;
        r3 = AbstractC0499Lj.m964b();
        goto L25
    L26:
        r3 = AbstractC0360IF.m798a();
    L34:
        r2 = r2 << 1;
        goto L4
    L35:
        return r0;
    }
}
