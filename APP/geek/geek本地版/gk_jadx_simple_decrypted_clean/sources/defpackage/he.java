package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he extends cq implements wm {
    public static final he c = null;
    public static final he d = null;
    public static final he e = null;
    public static final he f = null;
    public static final he g = null;
    public final /* synthetic */ int b;

    static {
        int r1 = 2;
        c = new he(r1, 0);
        d = new he(r1, 1);
        e = new he(r1, 2);
        f = new he(r1, 3);
        g = new he(r1, 4);
    }

    public /* synthetic */ he(int r1, int r2) {
        this.b = r2;
        super(r1);
    }

    @Override // defpackage.wm
    public final Object e(Object r2, Object r3) {
        switch(this.b) {
            case 0: goto L15;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        ee r32 = (ee) r3;
        return (v60) r2;
    L8:
        z30.m(r2);
        ee r33 = (ee) r3;
        return null;
    L10:
        ee r34 = (ee) r3;
        return r2;
    L12:
        Boolean r22 = (Boolean) r2;
        r22.getClass();
        ee r35 = (ee) r3;
        return r22;
    L5:
        return ((ge) r2).i((ee) r3);
    L15:
        return ((ge) r2).i((ee) r3);
    }
}
