package Yue;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥۡۦۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
public abstract class AbstractC7142 implements Closeable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1187 f21543 = new C1187(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public Reader f21544;

    /* JADX INFO: renamed from: Yue.ۥۡۦۧ۟$ۥ */
    @InterfaceC7507({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class C1186 extends Reader {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3604 f21545;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final Charset f21546;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f21547;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6489
        public Reader f21548;

        public C1186(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 Charset charset) {
            C5499.m17103(interfaceC3604, "source");
            C5499.m17103(charset, "charset");
            this.f21545 = interfaceC3604;
            this.f21546 = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C8107 c8107;
            this.f21547 = true;
            Reader reader = this.f21548;
            if (reader != null) {
                reader.close();
                c8107 = C8107.f3222;
            } else {
                c8107 = null;
            }
            if (c8107 == null) {
                this.f21545.close();
            }
        }

        @Override // java.io.Reader
        public int read(@InterfaceC6399 char[] cArr, int i, int i2) throws IOException {
            C5499.m17103(cArr, "cbuf");
            if (this.f21547) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f21548;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f21545.mo9607(), C8158.m26875(this.f21545, this.f21546));
                this.f21548 = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧ۟$ۥ۟ */
    public static final class C1187 {

        /* JADX INFO: renamed from: Yue.ۥۡۦۧ۟$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C7143 extends AbstractC7142 {

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C6149 f21549;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ long f21550;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC3604 f21551;

            public C7143(C6149 c6149, long j, InterfaceC3604 interfaceC3604) {
                this.f21549 = c6149;
                this.f21550 = j;
                this.f21551 = interfaceC3604;
            }

            @Override // Yue.AbstractC7142
            /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
            public long mo9917() {
                return this.f21550;
            }

            @Override // Yue.AbstractC7142
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ */
            public C6149 mo9918() {
                return this.f21549;
            }

            @Override // Yue.AbstractC7142
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟ۢ */
            public InterfaceC3604 mo9919() {
                return this.f21551;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۧ۟.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1187(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7142 m22391(C1187 c1187, InterfaceC3604 interfaceC3604, C6149 c6149, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                c6149 = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return c1187.m3434(interfaceC3604, c6149, j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7142 m22392(C1187 c1187, C3630 c3630, C6149 c6149, int i, Object obj) {
            if ((i & 1) != 0) {
                c6149 = null;
            }
            return c1187.m3435(c3630, c6149);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7142 m22393(C1187 c1187, String str, C6149 c6149, int i, Object obj) {
            if ((i & 1) != 0) {
                c6149 = null;
            }
            return c1187.m22399(str, c6149);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static /* synthetic */ AbstractC7142 m22394(C1187 c1187, byte[] bArr, C6149 c6149, int i, Object obj) {
            if ((i & 1) != 0) {
                c6149 = null;
            }
            return c1187.m22400(bArr, c6149);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "create")
        /* JADX INFO: renamed from: ۥ */
        public final AbstractC7142 m3434(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6489 C6149 c6149, long j) {
            C5499.m17103(interfaceC3604, "<this>");
            return new C7143(c6149, j, interfaceC3604);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "create")
        /* JADX INFO: renamed from: ۥ۟ */
        public final AbstractC7142 m3435(@InterfaceC6399 C3630 c3630, @InterfaceC6489 C6149 c6149) {
            C5499.m17103(c3630, "<this>");
            return m3434(new C3600().mo9668(c3630), c6149, c3630.m9852());
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AbstractC7142 m22395(@InterfaceC6489 C6149 c6149, long j, @InterfaceC6399 InterfaceC3604 interfaceC3604) {
            C5499.m17103(interfaceC3604, "content");
            return m3434(interfaceC3604, c6149, j);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final AbstractC7142 m22396(@InterfaceC6489 C6149 c6149, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(c3630, "content");
            return m3435(c3630, c6149);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final AbstractC7142 m22397(@InterfaceC6489 C6149 c6149, @InterfaceC6399 String str) {
            C5499.m17103(str, "content");
            return m22399(str, c6149);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final AbstractC7142 m22398(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr) {
            C5499.m17103(bArr, "content");
            return m22400(bArr, c6149);
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡ۠ۥۨ.ۥ۟۟۟ۡ(Yue.ۥۡ۠ۥۨ, java.nio.charset.Charset, int, java.lang.Object):java.nio.charset.Charset */
        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "create")
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final AbstractC7142 m22399(@InterfaceC6399 String str, @InterfaceC6489 C6149 c6149) {
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
            C3600 c3600Mo9649 = new C3600().mo9649(str, charset);
            return m3434(c3600Mo9649, c6149, c3600Mo9649.m9684());
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "create")
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final AbstractC7142 m22400(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149) {
            C5499.m17103(bArr, "<this>");
            return m3434(new C3600().write(bArr), c6149, bArr.length);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1187() {
        }
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final AbstractC7142 m22377(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6489 C6149 c6149, long j) {
        return f21543.m3434(interfaceC3604, c6149, j);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final AbstractC7142 m22378(@InterfaceC6399 C3630 c3630, @InterfaceC6489 C6149 c6149) {
        return f21543.m3435(c3630, c6149);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final AbstractC7142 m22379(@InterfaceC6489 C6149 c6149, long j, @InterfaceC6399 InterfaceC3604 interfaceC3604) {
        return f21543.m22395(c6149, j, interfaceC3604);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final AbstractC7142 m22380(@InterfaceC6489 C6149 c6149, @InterfaceC6399 C3630 c3630) {
        return f21543.m22396(c6149, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final AbstractC7142 m22381(@InterfaceC6489 C6149 c6149, @InterfaceC6399 String str) {
        return f21543.m22397(c6149, str);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC4372(level = EnumC0393.f8970, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC7097(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final AbstractC7142 m22382(@InterfaceC6489 C6149 c6149, @InterfaceC6399 byte[] bArr) {
        return f21543.m22398(c6149, bArr);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final AbstractC7142 m22383(@InterfaceC6399 String str, @InterfaceC6489 C6149 c6149) {
        return f21543.m22399(str, c6149);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final AbstractC7142 m22384(@InterfaceC6399 byte[] bArr, @InterfaceC6489 C6149 c6149) {
        return f21543.m22400(bArr, c6149);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C8158.m26844(mo9919());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final InputStream m3433() {
        return mo9919().mo9607();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C3630 m22385() throws IOException {
        long jMo9917 = mo9917();
        if (jMo9917 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jMo9917);
        }
        InterfaceC3604 interfaceC3604Mo9919 = mo9919();
        try {
            C3630 c3630Mo9648 = interfaceC3604Mo9919.mo9648();
            C3849.m904(interfaceC3604Mo9919, null);
            int iM9852 = c3630Mo9648.m9852();
            if (jMo9917 == -1 || jMo9917 == iM9852) {
                return c3630Mo9648;
            }
            throw new IOException("Content-Length (" + jMo9917 + ") and stream length (" + iM9852 + ") disagree");
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final byte[] m22386() throws IOException {
        long jMo9917 = mo9917();
        if (jMo9917 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jMo9917);
        }
        InterfaceC3604 interfaceC3604Mo9919 = mo9919();
        try {
            byte[] bArrMo9618 = interfaceC3604Mo9919.mo9618();
            C3849.m904(interfaceC3604Mo9919, null);
            int length = bArrMo9618.length;
            if (jMo9917 == -1 || jMo9917 == length) {
                return bArrMo9618;
            }
            throw new IOException("Content-Length (" + jMo9917 + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Reader m22387() {
        Reader reader = this.f21544;
        if (reader != null) {
            return reader;
        }
        C1186 c1186 = new C1186(mo9919(), m22388());
        this.f21544 = c1186;
        return c1186;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Charset m22388() {
        Charset charsetM18951;
        C6149 c6149Mo9918 = mo9918();
        return (c6149Mo9918 == null || (charsetM18951 = c6149Mo9918.m18951(C3794.f505)) == null) ? C3794.f505 : charsetM18951;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final <T> T m22389(InterfaceC5124<? super InterfaceC3604, ? extends T> interfaceC5124, InterfaceC5124<? super T, Integer> interfaceC51242) throws IOException {
        long jMo9917 = mo9917();
        if (jMo9917 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jMo9917);
        }
        InterfaceC3604 interfaceC3604Mo9919 = mo9919();
        try {
            T tInvoke = interfaceC5124.invoke(interfaceC3604Mo9919);
            C5437.m16930(1);
            C3849.m904(interfaceC3604Mo9919, null);
            C5437.m16929(1);
            int iIntValue = interfaceC51242.invoke(tInvoke).intValue();
            if (jMo9917 == -1 || jMo9917 == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jMo9917 + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public abstract long mo9917();

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public abstract C6149 mo9918();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public abstract InterfaceC3604 mo9919();

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final String m22390() throws IOException {
        InterfaceC3604 interfaceC3604Mo9919 = mo9919();
        try {
            String strMo9642 = interfaceC3604Mo9919.mo9642(C8158.m26875(interfaceC3604Mo9919, m22388()));
            C3849.m904(interfaceC3604Mo9919, null);
            return strMo9642;
        } finally {
        }
    }
}
