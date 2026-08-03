package p047d7;

import java.io.IOException;
import java.io.InputStream;
import p034c7.EnumC0411g;
import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: d7.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0737t extends AbstractC0736s {

    /* JADX INFO: renamed from: m */
    public final EnumC0411g f2190m;

    /* JADX INFO: renamed from: n */
    public final int f2191n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0737t(int i9, EnumC0411g enumC0411g) {
        super(i9);
        this.f2191n = i9;
        this.f2190m = enumC0411g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0736s
    /* JADX INFO: renamed from: S */
    public final int mo1924S(InputStream inputStream) throws IOException {
        m7715M(this.f2191n, false);
        byte[] bArr = this.f12076k;
        int length = bArr.length;
        int i9 = inputStream.read(bArr, 0, length);
        EnumC0411g enumC0411g = this.f2190m;
        if (i9 != length) {
            m7715M(i9, false);
            if (m1932T() == enumC0411g && mo5551p() >= 4) {
                AbstractC2331a.m5534D(this.f12076k, 0, 0);
            }
        }
        return m1932T() != enumC0411g ? i9 : mo1904V(inputStream) + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final EnumC0411g m1932T() {
        int iM5539s = mo5551p() < 4 ? 0 : AbstractC2331a.m5539s(this.f12076k, 0);
        for (EnumC0411g enumC0411g : EnumC0411g.f1121n) {
            if (iM5539s == enumC0411g.f1123g) {
                return enumC0411g;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final boolean m1933U() {
        return m1932T() == this.f2190m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public int mo1904V(InputStream inputStream) {
        return 0;
    }
}
