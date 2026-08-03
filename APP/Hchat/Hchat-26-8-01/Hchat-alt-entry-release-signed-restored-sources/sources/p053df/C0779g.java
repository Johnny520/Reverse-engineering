package p053df;

import com.alibaba.fastjson2.JSONB;
import java.io.IOException;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import okhttp3.HttpUrl;
import p020b5.C0192k;
import p067ef.C0918c;
import p302ud.C4325u;

/* JADX INFO: renamed from: df.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0779g extends AbstractC0774b {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f2344g = AbstractC2846d.m6274b(C0779g.class);

    /* JADX INFO: renamed from: h */
    public static final C0918c f2345h = new C0918c(-1, "stub", "stub", "stub", HttpUrl.FRAGMENT_ENCODE_SET);

    /* JADX INFO: renamed from: d */
    public final C4325u f2346d;

    /* JADX INFO: renamed from: e */
    public C0781i f2347e;

    /* JADX INFO: renamed from: f */
    public C0773a f2348f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0779g(C4325u c4325u) {
        this.f2346d = c4325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2012e(int i9, C0777e c0777e) throws IOException {
        long j3 = c0777e.f2340h;
        StringBuilder sb2 = new StringBuilder(16);
        for (int i10 = 0; i10 < i9; i10++) {
            short sM2007g = (short) c0777e.m2007g();
            if (sM2007g == 0) {
                break;
            }
            sb2.append((char) sM2007g);
        }
        c0777e.m2010k(j3 + ((long) i9), "readScriptOrVariantChar");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static char[] m2013f(byte b10, byte b11, char c10) {
        if (((b10 >> 7) & 1) != 1) {
            return new char[]{(char) b10, (char) b11};
        }
        return new char[]{(char) ((b11 & 31) + c10), (char) (((b11 & 224) >> 5) + ((b10 & 3) << 3) + c10), (char) (((b10 & JSONB.Constants.BC_STR_UTF16LE) >> 2) + c10)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0192k m2014d() throws IOException {
        this.f2330b.m2003a(8, "value size");
        C0777e c0777e = this.f2330b;
        int iM2007g = c0777e.m2007g();
        if (iM2007g == 0) {
            return new C0192k(this.f2330b.m2007g(), this.f2330b.m2006e(), 1);
        }
        c0777e.m2011l(0, iM2007g, "value res0 not 0");
        throw null;
    }
}
