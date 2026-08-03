package Yue;

import Yue.C5385;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5062 extends AbstractC7103 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0631 f12003 = new C0631(null);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C6149 f12004 = C6149.f15045.m18955(C5375.f13184);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final List<String> f1251;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<String> f12005;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۤ$ۥ */
    public static final class C0630 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6489
        public final Charset f1252;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final List<String> f1253;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<String> f12006;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC5573
        public C0630() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۠ۤۨۥ.ۥ۟.ۥ۟۟۟۠(Yue.ۥ۠ۤۨۥ$ۥ۟, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset, int, java.lang.Object):java.lang.String */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C0630 m1886(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            List<String> list = this.f1253;
            C5385.C0736 c0736 = C5385.f13231;
            list.add(C5385.C0736.m16849(c0736, str, 0, 0, C5385.f13241, false, false, true, false, this.f1252, 91, null));
            this.f12006.add(C5385.C0736.m16849(c0736, str2, 0, 0, C5385.f13241, false, false, true, false, this.f1252, 91, null));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0630 m1887(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            List<String> list = this.f1253;
            C5385.C0736 c0736 = C5385.f13231;
            list.add(C5385.C0736.m16849(c0736, str, 0, 0, C5385.f13241, true, false, true, false, this.f1252, 83, null));
            this.f12006.add(C5385.C0736.m16849(c0736, str2, 0, 0, C5385.f13241, true, false, true, false, this.f1252, 83, null));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5062 m15596() {
            return new C5062(this.f1253, this.f12006);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC5573
        public C0630(@InterfaceC6489 Charset charset) {
            this.f1252 = charset;
            this.f1253 = new ArrayList();
            this.f12006 = new ArrayList();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.nio.charset.Charset:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.nio.charset.Charset) : (r1v0 java.nio.charset.Charset))
 A[MD:(java.nio.charset.Charset):void (m)] (LINE:5) call: Yue.ۥ۠ۢۦۤ.ۥ.<init>(java.nio.charset.Charset):void type: THIS */
        public /* synthetic */ C0630(Charset charset, int i, C4335 c4335) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۤ$ۥ۟ */
    public static final class C0631 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۢۦۤ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0631(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0631() {
        }
    }

    public C5062(@InterfaceC6399 List<String> list, @InterfaceC6399 List<String> list2) {
        C5499.m17103(list, "encodedNames");
        C5499.m17103(list2, "encodedValues");
        this.f1251 = C8158.m26889(list);
        this.f12005 = C8158.m26889(list2);
    }

    @Override // Yue.AbstractC7103
    /* JADX INFO: renamed from: ۥ */
    public long mo1884() {
        return m15595(null, true);
    }

    @Override // Yue.AbstractC7103
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public C6149 mo1885() {
        return f12004;
    }

    @Override // Yue.AbstractC7103
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo15588(@InterfaceC6399 InterfaceC3603 interfaceC3603) throws IOException {
        C5499.m17103(interfaceC3603, "sink");
        m15595(interfaceC3603, false);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "size", imports = {}))
    @InterfaceC5572(name = "-deprecated_size")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final int m15589() {
        return m15593();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String m15590(int i) {
        return this.f1251.get(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final String m15591(int i) {
        return this.f12005.get(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final String m15592(int i) {
        return C5385.C0736.m16850(C5385.f13231, m15590(i), 0, 0, true, 3, null);
    }

    @InterfaceC5572(name = "size")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int m15593() {
        return this.f1251.size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final String m15594(int i) {
        return C5385.C0736.m16850(C5385.f13231, m15591(i), 0, 0, true, 3, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final long m15595(InterfaceC3603 interfaceC3603, boolean z) throws EOFException {
        C3600 c3600Mo9605;
        if (z) {
            c3600Mo9605 = new C3600();
        } else {
            C5499.m17100(interfaceC3603);
            c3600Mo9605 = interfaceC3603.mo9605();
        }
        int size = this.f1251.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c3600Mo9605.writeByte(38);
            }
            c3600Mo9605.mo9638(this.f1251.get(i));
            c3600Mo9605.writeByte(61);
            c3600Mo9605.mo9638(this.f12005.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jM9684 = c3600Mo9605.m9684();
        c3600Mo9605.m9603();
        return jM9684;
    }
}
