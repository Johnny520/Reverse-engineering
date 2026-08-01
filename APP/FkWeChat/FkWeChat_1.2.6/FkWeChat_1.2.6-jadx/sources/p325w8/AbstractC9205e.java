package p325w8;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: w8.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9205e {
    /* JADX INFO: renamed from: a */
    public static final long m35838a(Reader reader, Writer writer, int i10) throws IOException {
        reader.getClass();
        writer.getClass();
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            writer.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m35839b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m35838a(reader, writer, i10);
    }

    /* JADX INFO: renamed from: c */
    public static final String m35840c(Reader reader) {
        reader.getClass();
        StringWriter stringWriter = new StringWriter();
        m35839b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
