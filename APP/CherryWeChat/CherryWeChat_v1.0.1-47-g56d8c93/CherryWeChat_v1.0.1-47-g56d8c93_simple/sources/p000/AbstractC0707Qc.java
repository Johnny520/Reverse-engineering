package p000;

/* JADX INFO: renamed from: Qc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707Qc {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2413qd f2273a = null;

    static {
        int r1 = AbstractC1356eA.f4858a;
        String r0 = System.getProperty("kotlinx.coroutines.main.delay");     // Catch: SecurityException -> L5
    L6:
        if (r0 == null) goto L8;
        boolean r02 = Boolean.parseBoolean(r0);
    L9:
        if (r02 == true) goto L11;
        InterfaceC2413qd r03 = RunnableC0664Pc.f2120h;
    L14:
        f2273a = r03;
        return;
    L11:
        C1498hd r04 = AbstractC1499he.f5282a;
        C2283nk r05 = AbstractC1106Zp.f3500a;
        C2283nk r12 = r05.f8019d;
        r03 = r05;
        if (r05 != null) goto L14;
        r03 = RunnableC0664Pc.f2120h;
        goto L14
    L8:
        r02 = false;
    L5:
        r0 = null;
        goto L6
    }
}
