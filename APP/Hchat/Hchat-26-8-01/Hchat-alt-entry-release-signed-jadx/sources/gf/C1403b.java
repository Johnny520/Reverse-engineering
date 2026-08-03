package gf;

import ac.C0058k;

/* JADX INFO: renamed from: gf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1403b {

    /* JADX INFO: renamed from: a */
    public final int f4702a;

    /* JADX INFO: renamed from: b */
    public final int f4703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f4704c;

    /* JADX INFO: renamed from: d */
    public static final C1403b f4679d = new C1403b(1, 0, 10);

    /* JADX INFO: renamed from: e */
    public static final C1403b f4680e = new C1403b(1, 2, 21);

    /* JADX INFO: renamed from: f */
    public static final C1403b f4681f = new C1403b(1, 1, 23);

    /* JADX INFO: renamed from: g */
    public static final C1403b f4682g = new C1403b(1, 1, 24);

    /* JADX INFO: renamed from: h */
    public static final C1403b f4683h = new C1403b(1, 0, 25);

    /* JADX INFO: renamed from: i */
    public static final C1403b f4684i = new C1403b(2, 0, 26);

    /* JADX INFO: renamed from: j */
    public static final C1403b f4685j = new C1403b(2, 2, 27);

    /* JADX INFO: renamed from: k */
    public static final C1403b f4686k = new C1403b(2, 1, 28);

    /* JADX INFO: renamed from: l */
    public static final C1403b f4687l = new C1403b(2, 1, 0);

    /* JADX INFO: renamed from: m */
    public static final C1403b f4688m = new C1403b(2, 1, 1);

    /* JADX INFO: renamed from: n */
    public static final C1403b f4689n = new C1403b(2, 1, 2);

    /* JADX INFO: renamed from: o */
    public static final C1403b f4690o = new C1403b(2, 3, 3);

    /* JADX INFO: renamed from: p */
    public static final C1403b f4691p = new C1403b(2, 2, 4);

    /* JADX INFO: renamed from: q */
    public static final C1403b f4692q = new C1403b(2, 2, 5);

    /* JADX INFO: renamed from: r */
    public static final C1403b f4693r = new C1403b(2, 2, 6);

    /* JADX INFO: renamed from: s */
    public static final C1403b f4694s = new C1403b(2, 2, 7);

    /* JADX INFO: renamed from: t */
    public static final C1403b f4695t = new C1403b(3, 0, 8);

    /* JADX INFO: renamed from: u */
    public static final C1403b f4696u = new C1403b(3, 2, 9);

    /* JADX INFO: renamed from: v */
    public static final C1403b f4697v = new C1403b(3, 1, 11);

    /* JADX INFO: renamed from: w */
    public static final C1403b f4698w = new C1403b(3, 1, 12);

    /* JADX INFO: renamed from: x */
    public static final C1403b f4699x = new C1403b(3, 1, 13);

    /* JADX INFO: renamed from: y */
    public static final C1403b f4700y = new C1403b(3, -1, 14);

    /* JADX INFO: renamed from: z */
    public static final C1403b f4701z = new C1403b(3, -1, 15);

    /* JADX INFO: renamed from: A */
    public static final C1403b f4673A = new C1403b(4, -1, 16);

    /* JADX INFO: renamed from: B */
    public static final C1403b f4674B = new C1403b(4, -1, 17);

    /* JADX INFO: renamed from: C */
    public static final C1403b f4675C = new C1403b(5, 1, 18);

    /* JADX INFO: renamed from: D */
    public static final C1403b f4676D = new C1403b(-1, -1, 19);

    /* JADX INFO: renamed from: E */
    public static final C1403b f4677E = new C1403b(-1, -1, 20);

    /* JADX INFO: renamed from: F */
    public static final C1403b f4678F = new C1403b(-1, -1, 22);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1403b(int i9, int i10, int i11) {
        this.f4704c = i11;
        this.f4702a = i9;
        this.f4703b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m3808a(int i9) {
        return (i9 >> 8) & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m3810c(int i9) {
        return (i9 >> 8) & 15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m3811d(int i9) {
        return (i9 >> 12) & 15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m3812e(C1402a c1402a, int i9, C0058k c0058k) {
        int iM3811d = m3811d(i9);
        int iM346L = c0058k.m346L();
        int iM346L2 = c0058k.m346L();
        int[] iArr = c1402a.f4667i;
        iArr[0] = iM346L2 & 15;
        iArr[1] = (iM346L2 >> 4) & 15;
        iArr[2] = m3810c(iM346L2);
        iArr[3] = m3811d(iM346L2);
        iArr[4] = m3810c(i9);
        c1402a.f4668j = iM3811d;
        c1402a.f4671m = iM346L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m3813f(C1402a c1402a, int i9, C0058k c0058k) {
        int iM3808a = m3808a(i9);
        int iM346L = c0058k.m346L();
        int iM346L2 = c0058k.m346L();
        int[] iArr = c1402a.f4667i;
        if (iArr.length < iM3808a) {
            iArr = new int[iM3808a];
            c1402a.f4667i = iArr;
        }
        for (int i10 = 0; i10 < iM3808a; i10++) {
            iArr[i10] = iM346L2;
            iM346L2++;
        }
        c1402a.f4668j = iM3808a;
        c1402a.f4671m = iM346L;
    }

    /* JADX INFO: renamed from: b */
    private final void m3809b(C1402a c1402a, int i9, C0058k c0058k) {
    }
}
