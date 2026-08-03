package p255r4;

import okio.C3193a;
import p000a.AbstractC0000a;
import p096g8.C1361b;
import p129ig.AbstractC2043a;
import p311v4.C4451c0;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3692q0 extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final C4451c0 f12025k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3692q0(C4451c0 c4451c0) {
        super(1, AbstractC2043a.m5026c0(c4451c0.f14760g.length()) + c4451c0.f14761h.f4512c + 1);
        this.f12025k = c4451c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11895y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: e */
    public final int mo7640e(AbstractC3682l0 abstractC3682l0) {
        return this.f12025k.compareTo(((C3692q0) abstractC3682l0).f12025k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return this.f12025k.m8901l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        C4451c0 c4451c0 = this.f12025k;
        C1361b c1361b = c4451c0.f14761h;
        int length = c4451c0.f14760g.length();
        if (c6090d.m10829d()) {
            c6090d.m10827b(AbstractC2043a.m5026c0(length), "utf16_size: ".concat(AbstractC0000a.m48Y0(length)));
            c6090d.m10827b(c1361b.f4512c + 1, c4451c0.m8901l());
        }
        c6090d.m10838n(length);
        int i9 = c1361b.f4512c;
        int i10 = c6090d.f24596c;
        int i11 = i9 + i10;
        if (c6090d.f24594a) {
            c6090d.m10831f(i11);
        } else if (i11 > c6090d.f24595b.length) {
            C6090d.m10825g();
            throw null;
        }
        byte[] bArr = c6090d.f24595b;
        int length2 = bArr.length - i10;
        int i12 = c1361b.f4512c;
        if (length2 < i12) {
            C3193a.m6820i("(out.length - offset) < size()");
            return;
        }
        System.arraycopy(c1361b.f4511b, 0, bArr, i10, i12);
        c6090d.f24596c = i11;
        c6090d.m10834j(0);
    }

    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
    }
}
