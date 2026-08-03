package p255r4;

import bsh.C0353j;
import java.io.IOException;
import p073f4.C1064a;
import p121i4.C1957a;
import p227p4.C3304i;
import p227p4.C3310o;
import p227p4.C3318w;
import p311v4.C4476y;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3687o extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final C1957a f11990k;

    /* JADX INFO: renamed from: l */
    public byte[] f11991l;

    /* JADX INFO: renamed from: m */
    public final boolean f11992m;

    /* JADX INFO: renamed from: n */
    public final C4476y f11993n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3687o(C1957a c1957a, boolean z9, C4476y c4476y) {
        super(1, -1);
        if (c1957a == null) {
            C0353j.m1305c("code == null");
            throw null;
        }
        this.f11990k = c1957a;
        this.f11992m = z9;
        this.f11993n = c4476y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11896z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        try {
            byte[] bArrM7695n = m7695n(c3680k0.f11995b, null, null, false);
            this.f11991l = bArrM7695n;
            m7684k(bArrM7695n.length);
        } catch (RuntimeException e6) {
            throw C1064a.m2686b("...while placing debug info for ".concat(this.f11993n.mo4901a()), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        throw new RuntimeException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        if (c6090d.m10829d()) {
            c6090d.m10828c(m7682g().concat(" debug info"));
            m7695n(c3689p, null, c6090d, true);
        }
        c6090d.m10833i(this.f11991l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final byte[] m7695n(C3689p c3689p, String str, C6090d c6090d, boolean z9) {
        C1957a c1957a = this.f11990k;
        c1957a.m4844j();
        C3318w c3318w = (C3318w) c1957a.f6626k;
        c1957a.m4844j();
        C3310o c3310o = (C3310o) c1957a.f6627l;
        c1957a.m4844j();
        C3304i c3304i = (C3304i) c1957a.f6628m;
        C3685n c3685n = new C3685n(c3318w, c3310o, c3689p, c3304i.m6991o(), c3304i.f10491i, this.f11992m, this.f11993n);
        if (c6090d == null) {
            try {
                return c3685n.m7688c();
            } catch (IOException e6) {
                throw C1064a.m2686b("...while encoding debug info", e6);
            }
        }
        c3685n.f11984l = str;
        c3685n.f11983k = c6090d;
        c3685n.f11985m = z9;
        try {
            return c3685n.m7688c();
        } catch (IOException e7) {
            throw C1064a.m2686b("...while encoding debug info", e7);
        }
    }

    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
    }
}
