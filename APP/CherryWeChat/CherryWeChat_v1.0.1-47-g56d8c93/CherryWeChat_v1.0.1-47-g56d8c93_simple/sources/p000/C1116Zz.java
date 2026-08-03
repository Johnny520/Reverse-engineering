package p000;

/* JADX INFO: renamed from: Zz */
/* JADX INFO: loaded from: classes.dex */
public final class C1116Zz {

    /* JADX INFO: renamed from: a */
    public final String f3518a;

    /* JADX INFO: renamed from: b */
    public final String f3519b;

    /* JADX INFO: renamed from: c */
    public final boolean f3520c;

    /* JADX INFO: renamed from: d */
    public final String f3521d;

    /* JADX INFO: renamed from: e */
    public final String f3522e;

    /* JADX INFO: renamed from: f */
    public final C2648vx f3523f;

    /* JADX INFO: renamed from: g */
    public final boolean f3524g;

    public C1116Zz(String r3, String r4, boolean r5, String r6, String r7, C2648vx r8, boolean r9) {
        AbstractC0295Gu.m625r(-47545287964725L);
        AbstractC0295Gu.m625r(-48116518615093L);
        AbstractC0295Gu.m625r(-48133698484277L);
        this.f3518a = r3;
        this.f3519b = r4;
        this.f3520c = r5;
        this.f3521d = r6;
        this.f3522e = r7;
        this.f3523f = r8;
        this.f3524g = r9;
    }

    public /* synthetic */ C1116Zz(String r11, String r12, boolean r13, String r14, String r15, C2648vx r16, int r17) {
        boolean r1 = false;
        if ((r17 & 4) == 0) goto L5;
        boolean r5 = false;
    L7:
        if ((r17 & 8) == 0) goto L9;
        r14 = AbstractC0295Gu.m625r(-48159468288053L);
    L9:
        String r6 = r14;
        if ((r17 & 16) == 0) goto L12;
        String r7 = null;
    L14:
        if ((r17 & 32) == 0) goto L16;
        C2648vx r8 = null;
    L18:
        if ((r17 & 64) != 0) goto L21;
        r1 = true;
    L21:
        this(r11, r12, r5, r6, r7, r8, r1);
        return;
    L16:
        r8 = r16;
        goto L18
    L12:
        r7 = r15;
        goto L14
    L5:
        r5 = r13;
        goto L7
    }
}
