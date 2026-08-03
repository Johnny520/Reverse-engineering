package p164l5;

import androidx.lifecycle.C0119x;
import p046d6.C0709f;
import p074f5.EnumC1070f;
import p150k5.C2270u;
import p283t5.InterfaceC4121d;

/* JADX INFO: renamed from: l5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2480b extends AbstractC2479a0 implements InterfaceC4121d {

    /* JADX INFO: renamed from: f */
    public static final EnumC1070f f8119f = EnumC1070f.ARRAY_PAYLOAD;

    /* JADX INFO: renamed from: d */
    public final int f8120d;

    /* JADX INFO: renamed from: e */
    public final int f8121e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2480b(C2270u c2270u, int i9) {
        super(c2270u, f8119f, i9);
        C0119x c0119x = c2270u.f7532b;
        int iM585P = c0119x.m585P(i9 + 2);
        if (iM585P == 0) {
            this.f8120d = 1;
            this.f8121e = 0;
            return;
        }
        this.f8120d = iM585P;
        int iM583N = c0119x.m583N(i9 + 4);
        this.f8121e = iM583N;
        if (((long) iM585P) * ((long) iM583N) > 2147483647L) {
            throw new C0709f(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p164l5.AbstractC2479a0, p283t5.InterfaceC4121d
    /* JADX INFO: renamed from: c */
    public final int mo5877c() {
        return (((this.f8120d * this.f8121e) + 1) / 2) + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m5879t() {
        return this.f8120d;
    }
}
