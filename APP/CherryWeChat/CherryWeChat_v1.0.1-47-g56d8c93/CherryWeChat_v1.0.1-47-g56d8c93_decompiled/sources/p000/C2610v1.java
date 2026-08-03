package p000;

import android.text.TextUtils;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2610v1 implements InterfaceC2802zf {

    /* JADX INFO: renamed from: A */
    public static final C2610v1 f8995A;

    /* JADX INFO: renamed from: B */
    public static final C2610v1 f8996B;

    /* JADX INFO: renamed from: C */
    public static final C2610v1 f8997C;

    /* JADX INFO: renamed from: D */
    public static final C2610v1 f8998D;

    /* JADX INFO: renamed from: E */
    public static final C2610v1 f8999E;

    /* JADX INFO: renamed from: F */
    public static final C2610v1 f9000F;

    /* JADX INFO: renamed from: G */
    public static final C2610v1 f9001G;

    /* JADX INFO: renamed from: c */
    public static final C2610v1 f9002c;

    /* JADX INFO: renamed from: d */
    public static final C2610v1 f9003d;

    /* JADX INFO: renamed from: e */
    public static final C2610v1 f9004e;

    /* JADX INFO: renamed from: f */
    public static final C2610v1 f9005f;

    /* JADX INFO: renamed from: g */
    public static final C2610v1 f9006g;

    /* JADX INFO: renamed from: h */
    public static final C2610v1 f9007h;

    /* JADX INFO: renamed from: i */
    public static final C2610v1 f9008i;

    /* JADX INFO: renamed from: j */
    public static final C2610v1 f9009j;

    /* JADX INFO: renamed from: k */
    public static final C2610v1 f9010k;

    /* JADX INFO: renamed from: l */
    public static final C2610v1 f9011l;

    /* JADX INFO: renamed from: m */
    public static final C2610v1 f9012m;

    /* JADX INFO: renamed from: n */
    public static final C2610v1 f9013n;

    /* JADX INFO: renamed from: o */
    public static final C2610v1 f9014o;

    /* JADX INFO: renamed from: p */
    public static final C2610v1 f9015p;

    /* JADX INFO: renamed from: q */
    public static final C2610v1 f9016q;

    /* JADX INFO: renamed from: r */
    public static final C2610v1 f9017r;

    /* JADX INFO: renamed from: s */
    public static final C2610v1 f9018s;

    /* JADX INFO: renamed from: t */
    public static final C2610v1 f9019t;

    /* JADX INFO: renamed from: u */
    public static final C2610v1 f9020u;

    /* JADX INFO: renamed from: v */
    public static final C2610v1 f9021v;

    /* JADX INFO: renamed from: w */
    public static final C2610v1 f9022w;

    /* JADX INFO: renamed from: x */
    public static final C2610v1 f9023x;

    /* JADX INFO: renamed from: y */
    public static final C2610v1 f9024y;

    /* JADX INFO: renamed from: z */
    public static final C2610v1 f9025z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9026a;

    /* JADX INFO: renamed from: b */
    public final String f9027b;

    static {
        int i = 0;
        f9002c = new C2610v1("TINK", i);
        f9003d = new C2610v1("CRUNCHY", i);
        f9004e = new C2610v1("LEGACY", i);
        f9005f = new C2610v1("NO_PREFIX", i);
        int i2 = 1;
        f9006g = new C2610v1("TINK", i2);
        f9007h = new C2610v1("CRUNCHY", i2);
        f9008i = new C2610v1("NO_PREFIX", i2);
        int i3 = 2;
        f9009j = new C2610v1("TINK", i3);
        f9010k = new C2610v1("CRUNCHY", i3);
        f9011l = new C2610v1("NO_PREFIX", i3);
        int i4 = 3;
        f9012m = new C2610v1("TINK", i4);
        f9013n = new C2610v1("CRUNCHY", i4);
        f9014o = new C2610v1("NO_PREFIX", i4);
        int i5 = 4;
        f9015p = new C2610v1("TINK", i5);
        f9016q = new C2610v1("CRUNCHY", i5);
        f9017r = new C2610v1("NO_PREFIX", i5);
        int i6 = 5;
        f9018s = new C2610v1("SHA1", i6);
        f9019t = new C2610v1("SHA224", i6);
        f9020u = new C2610v1("SHA256", i6);
        f9021v = new C2610v1("SHA384", i6);
        f9022w = new C2610v1("SHA512", i6);
        int i7 = 6;
        f9023x = new C2610v1("TINK", i7);
        f9024y = new C2610v1("CRUNCHY", i7);
        f9025z = new C2610v1("LEGACY", i7);
        f8995A = new C2610v1("NO_PREFIX", i7);
        int i8 = 7;
        f8996B = new C2610v1("ENABLED", i8);
        f8997C = new C2610v1("DISABLED", i8);
        f8998D = new C2610v1("DESTROYED", i8);
        int i9 = 8;
        f8999E = new C2610v1("TINK", i9);
        f9000F = new C2610v1("CRUNCHY", i9);
        f9001G = new C2610v1("NO_PREFIX", i9);
    }

    public /* synthetic */ C2610v1(String str, int i) {
        this.f9026a = i;
        this.f9027b = str;
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: a */
    public Object mo1291a() {
        return this;
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: i */
    public boolean mo1293i(CharSequence charSequence, int i, int i2, C1043YB c1043yb) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f9027b)) {
            return true;
        }
        c1043yb.f3334c = (c1043yb.f3334c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f9026a) {
            case 0:
                return this.f9027b;
            case 1:
                return this.f9027b;
            case 2:
                return this.f9027b;
            case 3:
                return this.f9027b;
            case 4:
                return this.f9027b;
            case 5:
                return this.f9027b;
            case 6:
                return this.f9027b;
            case 7:
                return this.f9027b;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return this.f9027b;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
            default:
                return super.toString();
            case 10:
                return AbstractC2374ph.m4815l(new StringBuilder("<"), this.f9027b, '>');
        }
    }
}
