package p314v7;

import p152k7.AbstractC2331a;
import p209o7.AbstractC3071e;
import p241q7.InterfaceC3444a;
import p257r7.C3716f;

/* JADX INFO: renamed from: v7.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4520z extends AbstractC3071e implements InterfaceC3444a {

    /* JADX INFO: renamed from: m */
    public final C3716f f14895m;

    /* JADX INFO: renamed from: n */
    public final C4485a0 f14896n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4520z(int i9) {
        super(2);
        C3716f c3716f = new C3716f(i9);
        this.f14895m = c3716f;
        C4485a0 c4485a0 = new C4485a0(i9 - 4, 0);
        this.f14896n = c4485a0;
        m6540P(0, c3716f);
        m6540P(1, c4485a0);
        c3716f.f7660j = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static String m8943Q(int i9, String str) {
        int length = str.length();
        if (length >= i9) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        int i10 = i9 - length;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append('#');
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static boolean m8944R(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte b10 : bArr) {
            if (b10 != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static char[] m8945S(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        int i9 = -1;
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if (cArr[i10] != 0) {
                i9 = i10;
            }
        }
        if (i9 == -1) {
            return null;
        }
        int i11 = i9 + 1;
        if (i11 == cArr.length) {
            return cArr;
        }
        char[] cArr2 = new char[i11];
        System.arraycopy(cArr, 0, cArr2, 0, i11);
        return cArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        this.f14895m.mo633k(mo5551p());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p241q7.InterfaceC3444a
    /* JADX INFO: renamed from: m */
    public final void mo1926m(AbstractC2331a abstractC2331a) {
        if (abstractC2331a == this.f14895m) {
            this.f14896n.m7720Q(r0.f12083n - 4);
        }
    }

    @Override // p209o7.AbstractC3071e, p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public final void mo1891N() {
    }
}
