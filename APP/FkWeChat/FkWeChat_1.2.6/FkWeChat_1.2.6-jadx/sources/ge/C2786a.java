package ge;

import me.C5164c;
import ne.C5589a;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: ge.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2786a extends C5589a {

    /* JADX INFO: renamed from: h */
    public static final a f7254h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final C2786a f7255i = new C2786a(new int[0], new char[0], new boolean[0], 0, false);

    /* JADX INFO: renamed from: g */
    public final boolean f7256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2786a(int[] iArr, char[] cArr, boolean[] zArr, int i10, boolean z10) {
        super(iArr, cArr, zArr, i10);
        iArr.getClass();
        cArr.getClass();
        zArr.getClass();
        this.f7256g = z10;
    }

    @Override // ne.C5589a
    /* JADX INFO: renamed from: m */
    public C5589a mo9933m(int[] iArr, char[] cArr, boolean[] zArr, int i10) {
        iArr.getClass();
        cArr.getClass();
        zArr.getClass();
        char c10 = cArr[cArr.length - 1];
        char cM9941e = f7254h.m9941e(c10);
        cArr[cArr.length - 1] = cM9941e;
        return new C2786a(iArr, cArr, zArr, i10, c10 != cM9941e);
    }

    @Override // ne.C5589a
    /* JADX INFO: renamed from: n */
    public C5589a.b mo9934n(C5164c.a aVar) {
        aVar.getClass();
        C5589a.b bVarMo9934n = super.mo9934n(aVar);
        if (bVarMo9934n == null) {
            return null;
        }
        String strM21186c = aVar.m21186c();
        int iM21192i = aVar.m21192i() + bVarMo9934n.m22684b();
        while (iM21192i < strM21186c.length() && (strM21186c.charAt(iM21192i) == ' ' || strM21186c.charAt(iM21192i) == '\t')) {
            iM21192i++;
        }
        int i10 = iM21192i + 3;
        if (i10 <= strM21186c.length() && strM21186c.charAt(iM21192i) == '[' && strM21186c.charAt(iM21192i + 2) == ']') {
            int i11 = iM21192i + 1;
            if (strM21186c.charAt(i11) == 'x' || strM21186c.charAt(i11) == 'X' || strM21186c.charAt(i11) == ' ') {
                return new C5589a.b(i10 - aVar.m21192i(), f7254h.m9940d(bVarMo9934n.m22685c()), bVarMo9934n.m22684b());
            }
        }
        return bVarMo9934n;
    }

    @Override // ne.C5589a
    /* JADX INFO: renamed from: o */
    public C5589a mo9935o() {
        return f7255i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m9936s() {
        return this.f7256g;
    }

    /* JADX INFO: renamed from: ge.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final C2786a m9939c() {
            return C2786a.f7255i;
        }

        /* JADX INFO: renamed from: d */
        public final char m9940d(char c10) {
            return (char) (c10 + 'd');
        }

        /* JADX INFO: renamed from: e */
        public final char m9941e(char c10) {
            return c10 < 128 ? c10 : (char) (c10 - 'd');
        }

        public a() {
        }
    }
}
