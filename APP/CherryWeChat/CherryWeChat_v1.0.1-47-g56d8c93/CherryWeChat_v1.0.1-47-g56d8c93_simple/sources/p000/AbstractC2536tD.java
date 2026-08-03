package p000;

/* JADX INFO: renamed from: tD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2536tD {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0671Pj f8842a = null;

    static {
        if (AbstractC2092jD.f7368e == true) goto L5;
    L9:
        C2450rD r0 = new C2450rD(0);
    L10:
        f8842a = r0;
        return;
    L5:
        if (AbstractC2092jD.f7367d == false) goto L9;
        if (AbstractC2783z2.m5355a() == true) goto L9;
        r0 = new C2450rD(1);
        goto L10
    }

    /* JADX INFO: renamed from: a */
    public static int m5015a(byte[] r3, int r4, int r5) {
        byte r0 = r3[r4 - 1];
        int r52 = r5 - r4;
        if (r52 == 0) goto L15;
        if (r52 == 1) goto L13;
        if (r52 != 2) goto L11;
        return m5018d(r0, r3[r4], r3[r4 + 1]);
    L11:
        throw new AssertionError();
    L13:
        return m5017c(r0, r3[r4]);
    L15:
        if (r0 <= (-12)) goto L18;
        return -1;
    L18:
        return r0;
    }

    /* JADX INFO: renamed from: b */
    public static int m5016b(String r8) {
        int r0 = r8.length();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L7;
        if (r8.charAt(r2) >= 128) goto L7;
        r2 = r2 + 1;
    L7:
        int r3 = r0;
    L8:
        if (r2 >= r0) goto L28;
        char r4 = r8.charAt(r2);
        if (r4 >= 2048) goto L12;
        r3 = r3 + ((127 - r4) >>> 31);
        r2 = r2 + 1;
        goto L8
    L12:
        int r42 = r8.length();
    L13:
        if (r2 >= r42) goto L27;
        char r6 = r8.charAt(r2);
        if (r6 >= 2048) goto L17;
        r1 = r1 + ((127 - r6) >>> 31);
    L26:
        r2 = r2 + 1;
        goto L13
    L17:
        r1 = r1 + 2;
        if (55296 > r6) goto L26;
        if (r6 > 57343) goto L26;
        if (Character.codePointAt(r8, r2) < 65536) goto L25;
        r2 = r2 + 1;
        goto L26
    L25:
        throw new C2493sD(r2, r42);
    L27:
        r3 = r3 + r1;
    L28:
        if (r3 < r0) goto L31;
        return r3;
    L31:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) r3) + 4294967296L));
    }

    /* JADX INFO: renamed from: c */
    public static int m5017c(int r1, int r2) {
        if (r1 <= (-12)) goto L5;
        return -1;
    L5:
        if (r2 <= (-65)) goto L8;
        return -1;
    L8:
        return r1 ^ (r2 << 8);
    }

    /* JADX INFO: renamed from: d */
    public static int m5018d(int r1, int r2, int r3) {
        if (r1 <= (-12)) goto L5;
        return -1;
    L5:
        if (r2 > (-65)) goto L12;
        if (r3 <= (-65)) goto L9;
        return -1;
    L9:
        return (r1 ^ (r2 << 8)) ^ (r3 << 16);
    L12:
        return -1;
    }
}
