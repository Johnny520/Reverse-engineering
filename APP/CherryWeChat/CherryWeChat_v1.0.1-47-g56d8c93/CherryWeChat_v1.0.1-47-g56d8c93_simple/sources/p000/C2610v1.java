package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2610v1 implements InterfaceC2802zf {

    /* JADX INFO: renamed from: A */
    public static final C2610v1 f8995A = null;

    /* JADX INFO: renamed from: B */
    public static final C2610v1 f8996B = null;

    /* JADX INFO: renamed from: C */
    public static final C2610v1 f8997C = null;

    /* JADX INFO: renamed from: D */
    public static final C2610v1 f8998D = null;

    /* JADX INFO: renamed from: E */
    public static final C2610v1 f8999E = null;

    /* JADX INFO: renamed from: F */
    public static final C2610v1 f9000F = null;

    /* JADX INFO: renamed from: G */
    public static final C2610v1 f9001G = null;

    /* JADX INFO: renamed from: c */
    public static final C2610v1 f9002c = null;

    /* JADX INFO: renamed from: d */
    public static final C2610v1 f9003d = null;

    /* JADX INFO: renamed from: e */
    public static final C2610v1 f9004e = null;

    /* JADX INFO: renamed from: f */
    public static final C2610v1 f9005f = null;

    /* JADX INFO: renamed from: g */
    public static final C2610v1 f9006g = null;

    /* JADX INFO: renamed from: h */
    public static final C2610v1 f9007h = null;

    /* JADX INFO: renamed from: i */
    public static final C2610v1 f9008i = null;

    /* JADX INFO: renamed from: j */
    public static final C2610v1 f9009j = null;

    /* JADX INFO: renamed from: k */
    public static final C2610v1 f9010k = null;

    /* JADX INFO: renamed from: l */
    public static final C2610v1 f9011l = null;

    /* JADX INFO: renamed from: m */
    public static final C2610v1 f9012m = null;

    /* JADX INFO: renamed from: n */
    public static final C2610v1 f9013n = null;

    /* JADX INFO: renamed from: o */
    public static final C2610v1 f9014o = null;

    /* JADX INFO: renamed from: p */
    public static final C2610v1 f9015p = null;

    /* JADX INFO: renamed from: q */
    public static final C2610v1 f9016q = null;

    /* JADX INFO: renamed from: r */
    public static final C2610v1 f9017r = null;

    /* JADX INFO: renamed from: s */
    public static final C2610v1 f9018s = null;

    /* JADX INFO: renamed from: t */
    public static final C2610v1 f9019t = null;

    /* JADX INFO: renamed from: u */
    public static final C2610v1 f9020u = null;

    /* JADX INFO: renamed from: v */
    public static final C2610v1 f9021v = null;

    /* JADX INFO: renamed from: w */
    public static final C2610v1 f9022w = null;

    /* JADX INFO: renamed from: x */
    public static final C2610v1 f9023x = null;

    /* JADX INFO: renamed from: y */
    public static final C2610v1 f9024y = null;

    /* JADX INFO: renamed from: z */
    public static final C2610v1 f9025z = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9026a;

    /* JADX INFO: renamed from: b */
    public final String f9027b;

    static {
        int r2 = 0;
        f9002c = new C2610v1("TINK", r2);
        f9003d = new C2610v1("CRUNCHY", r2);
        f9004e = new C2610v1("LEGACY", r2);
        f9005f = new C2610v1("NO_PREFIX", r2);
        int r22 = 1;
        f9006g = new C2610v1("TINK", r22);
        f9007h = new C2610v1("CRUNCHY", r22);
        f9008i = new C2610v1("NO_PREFIX", r22);
        int r23 = 2;
        f9009j = new C2610v1("TINK", r23);
        f9010k = new C2610v1("CRUNCHY", r23);
        f9011l = new C2610v1("NO_PREFIX", r23);
        int r24 = 3;
        f9012m = new C2610v1("TINK", r24);
        f9013n = new C2610v1("CRUNCHY", r24);
        f9014o = new C2610v1("NO_PREFIX", r24);
        int r25 = 4;
        f9015p = new C2610v1("TINK", r25);
        f9016q = new C2610v1("CRUNCHY", r25);
        f9017r = new C2610v1("NO_PREFIX", r25);
        int r26 = 5;
        f9018s = new C2610v1("SHA1", r26);
        f9019t = new C2610v1("SHA224", r26);
        f9020u = new C2610v1("SHA256", r26);
        f9021v = new C2610v1("SHA384", r26);
        f9022w = new C2610v1("SHA512", r26);
        int r27 = 6;
        f9023x = new C2610v1("TINK", r27);
        f9024y = new C2610v1("CRUNCHY", r27);
        f9025z = new C2610v1("LEGACY", r27);
        f8995A = new C2610v1("NO_PREFIX", r27);
        int r28 = 7;
        f8996B = new C2610v1("ENABLED", r28);
        f8997C = new C2610v1("DISABLED", r28);
        f8998D = new C2610v1("DESTROYED", r28);
        int r29 = 8;
        f8999E = new C2610v1("TINK", r29);
        f9000F = new C2610v1("CRUNCHY", r29);
        f9001G = new C2610v1("NO_PREFIX", r29);
    }

    public /* synthetic */ C2610v1(String r1, int r2) {
        this.f9026a = r2;
        this.f9027b = r1;
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: a */
    public Object mo1291a() {
        return this;
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: i */
    public boolean mo1293i(CharSequence r1, int r2, int r3, C1043YB r4) {
        if (TextUtils.equals(r1.subSequence(r2, r3), this.f9027b) == false) goto L6;
        r4.f3334c = (r4.f3334c & 3) | 4;
        return false;
    L6:
        return true;
    }

    public String toString() {
        switch(this.f9026a) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L5;
            case 10: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return AbstractC2374ph.m4815l(new StringBuilder("<"), this.f9027b, '>');
    L9:
        return this.f9027b;
    L11:
        return this.f9027b;
    L13:
        return this.f9027b;
    L15:
        return this.f9027b;
    L17:
        return this.f9027b;
    L19:
        return this.f9027b;
    L21:
        return this.f9027b;
    L23:
        return this.f9027b;
    L25:
        return this.f9027b;
    }
}
