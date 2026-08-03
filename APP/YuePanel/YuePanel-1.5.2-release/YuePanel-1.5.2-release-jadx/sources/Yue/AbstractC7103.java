package Yue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥۡۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7103 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C1167 f2683 = new C1167(null);

    /* JADX INFO: renamed from: Yue.ۥۡۦۥ$ۥ */
    public static final class C1167 {

        /* JADX INFO: renamed from: Yue.ۥۡۦۥ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC7507({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nokhttp3/RequestBody$Companion$asRequestBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
        public static final class C7104 extends AbstractC7103 {

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ C6149 f2684;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ File f21455;

            public C7104(C6149 c6149, File file) {
                this.f2684 = c6149;
                this.f21455 = file;
            }

            @Override // Yue.AbstractC7103
            /* JADX INFO: renamed from: ۥ */
            public long mo1884() {
                return this.f21455.length();
            }

            @Override // Yue.AbstractC7103
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟ */
            public C6149 mo1885() {
                return this.f2684;
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            @Override // Yue.AbstractC7103
            /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
            public void mo15588(@InterfaceC6399 InterfaceC3603 interfaceC3603) throws FileNotFoundException {
                C5499.m17103(interfaceC3603, "sink");
                InterfaceC7506 interfaceC7506M20846 = C6542.m20846(this.f21455);
                try {
                    interfaceC3603.mo9610(interfaceC7506M20846);
                    C3849.m904(interfaceC7506M20846, null);
                } finally {
                }
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۦۥ$ۥ$ۥ۟, reason: contains not printable characters */
        public static final class C7105 extends AbstractC7103 {

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ C6149 f2685;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ C3630 f21456;

            public C7105(C6149 c6149, C3630 c3630) {
                this.f2685 = c6149;
                this.f21456 = c3630;
            }

            @Override // Yue.AbstractC7103
            /* JADX INFO: renamed from: ۥ */
            public long mo1884() {
                return this.f21456.m9852();
            }

            @Override // Yue.AbstractC7103
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟ */
            public C6149 mo1885() {
                return this.f2685;
            }

            @Override // Yue.AbstractC7103
            /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
            public void mo15588(@InterfaceC6399 InterfaceC3603 interfaceC3603) throws IOException {
                C5499.m17103(interfaceC3603, "sink");
                interfaceC3603.mo9668(this.f21456);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۦۥ$ۥ$ۥ۟۟, reason: contains not printable characters */
        public static final class C7106 extends AbstractC7103 {

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ C6149 f2686;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ int f21457;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ byte[] f21458;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ int f21459;

            public C7106(C6149 c6149, int i, byte[] bArr, int i2) {
                this.f2686 = c6149;
                this.f21457 = i;
                this.f21458 = bArr;
                this.f21459 = i2;
            }

            @Override // Yue.AbstractC7103
            /* JADX INFO: renamed from: ۥ */
            public long mo1884() {
                return this.f21457;
            }

            @Override // Yue.AbstractC7103
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟ */
            public C6149 mo1885() {
                return this.f2686;
            }

            @Override // Yue.AbstractC7103
            /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
            public void mo15588(@InterfaceC6399 InterfaceC3603 interfaceC3603) throws IOException {
                C5499.m17103(interfaceC3603, "sink");
                interfaceC3603.write(this.f21458, this.f21459, this.f21457);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1167(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7103 m22208(C1167 c1167, C3630 c3630, C6149 c6149, int i, Object obj) {
            if ((i & 1) != 0) {
                c6149 = null;
            }
            return c1167.m3397(c3630, c6149);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7103 m22209(C1167 c1167, C6149 c6149, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return c1167.m22217(c6149, bArr, i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7103 m22210(C1167 c1167, File file, C6149 c6149, int i, Object obj) {
            if ((i & 1) != 0) {
                c6149 = null;
            }
            return c1167.m22218(file, c6149);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7103 m22211(C1167 c1167, String str, C6149 c6149, int i, Object obj) {
            if ((i & 1) != 0) {
                c6149 = null;
            }
            return c1167.m22219(str, c6149);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7103 m22212(C1167 c1167, byte[] bArr, C6149 c6149, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                c6149 = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return c1167.m22223(bArr, c6149, i, i2);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "create")
        /* JADX INFO: renamed from: ۥ */
        public final AbstractC7103 m3397(@InterfaceC6399 C3630 c3630, @InterfaceC6489 C6149 c6149) {
            C5499.m17103(c3630, "<this>");
            return new C7105(c6149, c3630);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        /* JADX INFO: renamed from: ۥ۟ */
        public final AbstractC7103 m3398(@InterfaceC6489 C6149 c6149, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(c3630, "content");
            return m3397(c3630, c6149);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AbstractC7103 m22213(@InterfaceC6489 C6149 c6149, @InterfaceC6399 File file) {
            C5499.m17103(file, "file");
            return m22218(file, c6149);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final AbstractC7103 m22214(@InterfaceC6489 C6149 c6149, @InterfaceC6399 String str) {
            C5499.m17103(str, "content");
            return m22219(str, c6149);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @InterfaceC5573
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final AbstractC7103 m22215(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr) {
            C5499.m17103(bArr, "content");
            return m22209(this, c6149, bArr, 0, 0, 12, null);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @InterfaceC5573
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final AbstractC7103 m22216(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr, int i) {
            C5499.m17103(bArr, "content");
            return m22209(this, c6149, bArr, i, 0, 8, null);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @InterfaceC5573
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final AbstractC7103 m22217(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr, int i, int i2) {
            C5499.m17103(bArr, "content");
            return m22223(bArr, c6149, i, i2);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "create")
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final AbstractC7103 m22218(@InterfaceC6399 File file, @InterfaceC6489 C6149 c6149) {
            C5499.m17103(file, "<this>");
            return new C7104(c6149, file);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "create")
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final AbstractC7103 m22219(@InterfaceC6399 String str, @InterfaceC6489 C6149 c6149) {
            C5499.m17103(str, "<this>");
            Charset charset = C3794.f505;
            if (c6149 != null) {
                Charset charsetM18947 = C6149.m18947(c6149, null, 1, null);
                if (charsetM18947 == null) {
                    c6149 = C6149.f15045.m18956(c6149 + "; charset=utf-8");
                } else {
                    charset = charsetM18947;
                }
            }
            byte[] bytes = str.getBytes(charset);
            C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
            return m22223(bytes, c6149, 0, bytes.length);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "create")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final AbstractC7103 m22220(@InterfaceC6399 byte[] bArr) {
            C5499.m17103(bArr, "<this>");
            return m22212(this, bArr, null, 0, 0, 7, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "create")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final AbstractC7103 m22221(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149) {
            C5499.m17103(bArr, "<this>");
            return m22212(this, bArr, c6149, 0, 0, 6, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "create")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final AbstractC7103 m22222(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149, int i) {
            C5499.m17103(bArr, "<this>");
            return m22212(this, bArr, c6149, i, 0, 4, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "create")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final AbstractC7103 m22223(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149, int i, int i2) {
            C5499.m17103(bArr, "<this>");
            C8158.m26843(bArr.length, i, i2);
            return new C7106(c6149, i2, bArr, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1167() {
        }
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final AbstractC7103 m22193(@InterfaceC6399 C3630 c3630, @InterfaceC6489 C6149 c6149) {
        return f2683.m3397(c3630, c6149);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final AbstractC7103 m22194(@InterfaceC6489 C6149 c6149, @InterfaceC6399 C3630 c3630) {
        return f2683.m3398(c6149, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final AbstractC7103 m22195(@InterfaceC6489 C6149 c6149, @InterfaceC6399 File file) {
        return f2683.m22213(c6149, file);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final AbstractC7103 m22196(@InterfaceC6489 C6149 c6149, @InterfaceC6399 String str) {
        return f2683.m22214(c6149, str);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @InterfaceC5573
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final AbstractC7103 m22197(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr) {
        return f2683.m22215(c6149, bArr);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @InterfaceC5573
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final AbstractC7103 m22198(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr, int i) {
        return f2683.m22216(c6149, bArr, i);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @InterfaceC5573
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final AbstractC7103 m22199(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr, int i, int i2) {
        return f2683.m22217(c6149, bArr, i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final AbstractC7103 m22200(@InterfaceC6399 File file, @InterfaceC6489 C6149 c6149) {
        return f2683.m22218(file, c6149);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final AbstractC7103 m22201(@InterfaceC6399 String str, @InterfaceC6489 C6149 c6149) {
        return f2683.m22219(str, c6149);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "create")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final AbstractC7103 m22202(@InterfaceC6399 byte[] bArr) {
        return f2683.m22220(bArr);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "create")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final AbstractC7103 m22203(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149) {
        return f2683.m22221(bArr, c6149);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "create")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final AbstractC7103 m22204(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149, int i) {
        return f2683.m22222(bArr, c6149, i);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "create")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final AbstractC7103 m22205(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149, int i, int i2) {
        return f2683.m22223(bArr, c6149, i, i2);
    }

    /* JADX INFO: renamed from: ۥ */
    public long mo1884() throws IOException {
        return -1L;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public abstract C6149 mo1885();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m22206() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m22207() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public abstract void mo15588(@InterfaceC6399 InterfaceC3603 interfaceC3603) throws IOException;
}
