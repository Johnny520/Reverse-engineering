package p000;

/* JADX INFO: renamed from: bv */
/* JADX INFO: loaded from: classes.dex */
public final class C1236bv {

    /* JADX INFO: renamed from: a */
    public final AbstractC0043B f4203a;

    /* JADX INFO: renamed from: b */
    public final String f4204b;

    /* JADX INFO: renamed from: c */
    public final Object[] f4205c;

    /* JADX INFO: renamed from: d */
    public final int f4206d;

    public C1236bv(AbstractC0043B r4, String r5, Object[] r6) {
        this.f4203a = r4;
        this.f4204b = r5;
        this.f4205c = r6;
        char r42 = r5.charAt(0);
        if (r42 >= 55296) goto L6;
        this.f4206d = r42;
        return;
    L6:
        int r43 = r42 & 8191;
        int r0 = 13;
        int r1 = 1;
    L7:
        int r2 = r1 + 1;
        char r12 = r5.charAt(r1);
        if (r12 < 55296) goto L10;
        r43 = r43 | ((r12 & 8191) << r0);
        r0 = r0 + 13;
        r1 = r2;
        goto L7
    L10:
        this.f4206d = r43 | (r12 << r0);
    }
}
