package p088g0;

import p119i2.AbstractC1923e0;
import p119i2.C1941n0;
import p177m2.InterfaceC2760d;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.C4234d;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: g0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1258b {

    /* JADX INFO: renamed from: h */
    public static C1258b f4118h;

    /* JADX INFO: renamed from: a */
    public final EnumC4243m f4119a;

    /* JADX INFO: renamed from: b */
    public final C1941n0 f4120b;

    /* JADX INFO: renamed from: c */
    public final C4234d f4121c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2760d f4122d;

    /* JADX INFO: renamed from: e */
    public final C1941n0 f4123e;

    /* JADX INFO: renamed from: f */
    public float f4124f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f4125g = Float.NaN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1258b(EnumC4243m enumC4243m, C1941n0 c1941n0, C4234d c4234d, InterfaceC2760d interfaceC2760d) {
        this.f4119a = enumC4243m;
        this.f4120b = c1941n0;
        this.f4121c = c4234d;
        this.f4122d = interfaceC2760d;
        this.f4123e = AbstractC1923e0.m4790h(c1941n0, enumC4243m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m3383a(int i9, long j3) {
        int iM8505i;
        float f3 = this.f4125g;
        float f10 = this.f4124f;
        if (Float.isNaN(f3) || Float.isNaN(f10)) {
            String str = AbstractC1259c.f4126a;
            long jM8509b = AbstractC4232b.m8509b(0, 0, 0, 0, 15);
            C1941n0 c1941n0 = this.f4123e;
            C4234d c4234d = this.f4121c;
            float fM4767b = AbstractC1923e0.m4783a(str, c1941n0, jM8509b, c4234d, this.f4122d, 1, 96).m4767b();
            float fM4767b2 = AbstractC1923e0.m4783a(AbstractC1259c.f4127b, this.f4123e, AbstractC4232b.m8509b(0, 0, 0, 0, 15), c4234d, this.f4122d, 2, 96).m4767b() - fM4767b;
            this.f4125g = fM4767b;
            this.f4124f = fM4767b2;
            f10 = fM4767b2;
            f3 = fM4767b;
        }
        if (i9 != 1) {
            int iRound = Math.round((f10 * (i9 - 1)) + f3);
            iM8505i = iRound >= 0 ? iRound : 0;
            int iM8503g = C4231a.m8503g(j3);
            if (iM8505i > iM8503g) {
                iM8505i = iM8503g;
            }
        } else {
            iM8505i = C4231a.m8505i(j3);
        }
        return AbstractC4232b.m8508a(C4231a.m8506j(j3), C4231a.m8504h(j3), iM8505i, C4231a.m8503g(j3));
    }
}
