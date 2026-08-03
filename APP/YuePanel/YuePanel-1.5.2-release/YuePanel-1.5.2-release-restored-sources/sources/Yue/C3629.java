package Yue;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "ByteStreamsKt")
public final class C3629 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۣ$ۥ */
    public static final class C0197 extends AbstractC3627 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6366 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f6367;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f6368;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ BufferedInputStream f6369;

        public C0197(BufferedInputStream bufferedInputStream) {
            this.f6369 = bufferedInputStream;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            m9796();
            return !this.f6368;
        }

        @Override // Yue.AbstractC3627
        /* JADX INFO: renamed from: ۥ۟ */
        public byte mo466() throws IOException {
            m9796();
            if (this.f6368) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b = (byte) this.f6366;
            this.f6367 = false;
            return b;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m9793() {
            return this.f6368;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m9794() {
            return this.f6366;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m9795() {
            return this.f6367;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m9796() throws IOException {
            if (this.f6367 || this.f6368) {
                return;
            }
            int i = this.f6369.read();
            this.f6366 = i;
            this.f6367 = true;
            this.f6368 = i == -1;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m9797(boolean z) {
            this.f6368 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m9798(int i) {
            this.f6366 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m9799(boolean z) {
            this.f6367 = z;
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final BufferedInputStream m684(InputStream inputStream, int i) {
        C5499.m17103(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final BufferedOutputStream m685(OutputStream outputStream, int i) {
        C5499.m17103(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ BufferedInputStream m9773(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C5499.m17103(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ BufferedOutputStream m9774(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C5499.m17103(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final BufferedReader m9775(InputStream inputStream, Charset charset) {
        C5499.m17103(inputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ BufferedReader m9776(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(inputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final BufferedWriter m9777(OutputStream outputStream, Charset charset) {
        C5499.m17103(outputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ BufferedWriter m9778(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(outputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final ByteArrayInputStream m9779(String str, Charset charset) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ ByteArrayInputStream m9780(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(str, "<this>");
        C5499.m17103(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m9781(@InterfaceC6399 InputStream inputStream, @InterfaceC6399 OutputStream outputStream, int i) throws IOException {
        C5499.m17103(inputStream, "<this>");
        C5499.m17103(outputStream, "out");
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ long m9782(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m9781(inputStream, outputStream, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final ByteArrayInputStream m9783(byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final ByteArrayInputStream m9784(byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final AbstractC3627 m9785(@InterfaceC6399 BufferedInputStream bufferedInputStream) {
        C5499.m17103(bufferedInputStream, "<this>");
        return new C0197(bufferedInputStream);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final byte[] m9786(@InterfaceC6399 InputStream inputStream) {
        C5499.m17103(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m9782(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C5499.m17102(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @InterfaceC4374(errorSince = "1.5", warningSince = "1.3")
    @InterfaceC6399
    @InterfaceC4372(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @InterfaceC7097(expression = "readBytes()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final byte[] m9787(@InterfaceC6399 InputStream inputStream, int i) {
        C5499.m17103(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        m9782(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C5499.m17102(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m9788(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return m9787(inputStream, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final InputStreamReader m9789(InputStream inputStream, Charset charset) {
        C5499.m17103(inputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ InputStreamReader m9790(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(inputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final OutputStreamWriter m9791(OutputStream outputStream, Charset charset) {
        C5499.m17103(outputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ OutputStreamWriter m9792(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(outputStream, "<this>");
        C5499.m17103(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
