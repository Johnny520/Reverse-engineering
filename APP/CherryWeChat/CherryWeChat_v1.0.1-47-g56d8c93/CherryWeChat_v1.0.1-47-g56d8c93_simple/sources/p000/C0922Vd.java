package p000;

/* JADX INFO: renamed from: Vd */
/* JADX INFO: loaded from: classes.dex */
public final class C0922Vd {

    /* JADX INFO: renamed from: b */
    public static final C0922Vd f2878b = null;

    /* JADX INFO: renamed from: c */
    public static final C0922Vd f2879c = null;

    /* JADX INFO: renamed from: d */
    public static final C0922Vd f2880d = null;

    /* JADX INFO: renamed from: e */
    public static final C0922Vd f2881e = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2882a;

    static {
        f2878b = new C0922Vd(0);
        f2879c = new C0922Vd(1);
        f2880d = new C0922Vd(2);
        f2881e = new C0922Vd(3);
    }

    public /* synthetic */ C0922Vd(int r1) {
        this.f2882a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1782a(int r2) {
        switch(this.f2882a) {
            case 0: goto L19;
            case 1: goto L16;
            case 2: goto L10;
            default: goto L5;
        };
    L16:
        return false;
    L5:
        if (r2 != 2) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r2 != 3) goto L12;
    L14:
        return false;
    L12:
        if (r2 == 5) goto L14;
        return true;
    L19:
        if (r2 != 2) goto L21;
        return true;
    L21:
        return false;
    }
}
