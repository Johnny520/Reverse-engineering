package Yue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
@InterfaceC5572(name = "TextStreamsKt")
public final class C7756 {

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۧ$ۥ */
    public static final class C1345 extends AbstractC5673 implements InterfaceC5124<String, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ArrayList<String> f23290;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1345(ArrayList<String> arrayList) {
            super(1);
            this.f23290 = arrayList;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(String str) {
            m24648(str);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m24648(@InterfaceC6399 String str) {
            C5499.m17103(str, "it");
            this.f23290.add(str);
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final BufferedReader m3846(Reader reader, int i) {
        C5499.m17103(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final BufferedWriter m3847(Writer writer, int i) {
        C5499.m17103(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ BufferedReader m24635(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C5499.m17103(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ BufferedWriter m24636(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C5499.m17103(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m24637(@InterfaceC6399 Reader reader, @InterfaceC6399 Writer writer, int i) throws IOException {
        C5499.m17103(reader, "<this>");
        C5499.m17103(writer, "out");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += (long) i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ long m24638(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m24637(reader, writer, i);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m24639(@InterfaceC6399 Reader reader, @InterfaceC6399 InterfaceC5124<? super String, C8107> interfaceC5124) {
        C5499.m17103(reader, "<this>");
        C5499.m17103(interfaceC5124, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = m24640(bufferedReader).iterator();
            while (it.hasNext()) {
                interfaceC5124.invoke(it.next());
            }
            C8107 c8107 = C8107.f3222;
            C3849.m904(bufferedReader, null);
        } finally {
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final InterfaceC7326<String> m24640(@InterfaceC6399 BufferedReader bufferedReader) {
        C5499.m17103(bufferedReader, "<this>");
        return C7332.m22870(new C5715(bufferedReader));
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final byte[] m24641(@InterfaceC6399 URL url) throws IOException {
        C5499.m17103(url, "<this>");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            C5499.m17102(inputStreamOpenStream, "it");
            byte[] bArrM9786 = C3629.m9786(inputStreamOpenStream);
            C3849.m904(inputStreamOpenStream, null);
            return bArrM9786;
        } finally {
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final List<String> m24642(@InterfaceC6399 Reader reader) {
        C5499.m17103(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        m24639(reader, new C1345(arrayList));
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String m24643(@InterfaceC6399 Reader reader) {
        C5499.m17103(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m24638(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        C5499.m17102(string, "buffer.toString()");
        return string;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String m24644(URL url, Charset charset) {
        C5499.m17103(url, "<this>");
        C5499.m17103(charset, "charset");
        return new String(m24641(url), charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ String m24645(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(url, "<this>");
        C5499.m17103(charset, "charset");
        return new String(m24641(url), charset);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final StringReader m24646(String str) {
        C5499.m17103(str, "<this>");
        return new StringReader(str);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> T m24647(@InterfaceC6399 Reader reader, @InterfaceC6399 InterfaceC5124<? super InterfaceC7326<String>, ? extends T> interfaceC5124) {
        C5499.m17103(reader, "<this>");
        C5499.m17103(interfaceC5124, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T tInvoke = interfaceC5124.invoke(m24640(bufferedReader));
            C5437.m16930(1);
            C3849.m904(bufferedReader, null);
            C5437.m16929(1);
            return tInvoke;
        } finally {
        }
    }
}
