package p006D;

/* JADX INFO: renamed from: D.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0120p0 {
    /* JADX INFO: renamed from: a */
    public static int m427a(int r4) {
        int r02 = 0;
        int r2 = 1;
    L4:
        if (r2 > 256) goto L33;
        if ((r4 & r2) == 0) goto L32;
        if (r2 != 1) goto L9;
        int r3 = AbstractC0130v.m456u();
    L24:
        r02 = r02 | r3;
        goto L32
    L9:
        if (r2 != 2) goto L11;
        r3 = AbstractC0130v.m459x();
        goto L24
    L11:
        if (r2 != 4) goto L13;
        r3 = AbstractC0130v.m460y();
        goto L24
    L13:
        if (r2 != 8) goto L15;
        r3 = AbstractC0130v.m437b();
        goto L24
    L15:
        if (r2 != 16) goto L17;
        r3 = AbstractC0130v.m461z();
        goto L24
    L17:
        if (r2 != 32) goto L19;
        r3 = AbstractC0130v.m433A();
        goto L24
    L19:
        if (r2 != 64) goto L21;
        r3 = AbstractC0130v.m434B();
        goto L24
    L21:
        if (r2 != 128) goto L32;
        r3 = AbstractC0130v.m435C();
    L32:
        r2 = r2 << 1;
        goto L4
    L33:
        return r02;
    }
}
