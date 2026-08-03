package Yue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
public class C6634 {
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ */
    public static final void m3116(Path path, byte[] bArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(bArr, "array");
        Files.write(path, bArr, StandardOpenOption.APPEND);
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Path m3117(Path path, InterfaceC7326<? extends CharSequence> interfaceC7326, Charset charset) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(interfaceC7326, "lines");
        C5499.m17103(charset, "charset");
        Path pathWrite = Files.write(path, C7342.m22910(interfaceC7326), charset, StandardOpenOption.APPEND);
        C5499.m17102(pathWrite, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Path m21103(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(iterable, "lines");
        C5499.m17103(charset, "charset");
        Path pathWrite = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        C5499.m17102(pathWrite, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Path m21104(Path path, InterfaceC7326 interfaceC7326, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(interfaceC7326, "lines");
        C5499.m17103(charset, "charset");
        Path pathWrite = Files.write(path, C7342.m22910(interfaceC7326), charset, StandardOpenOption.APPEND);
        C5499.m17102(pathWrite, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Path m21105(Path path, Iterable iterable, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(iterable, "lines");
        C5499.m17103(charset, "charset");
        Path pathWrite = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        C5499.m17102(pathWrite, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m21106(@InterfaceC6399 Path path, @InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Charset charset) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charSequence, "text");
        C5499.m17103(charset, "charset");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        C5499.m17102(outputStreamNewOutputStream, "newOutputStream(this, StandardOpenOption.APPEND)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            C3849.m904(outputStreamWriter, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m21107(Path path, CharSequence charSequence, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        m21106(path, charSequence, charset);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final BufferedReader m21108(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ BufferedReader m21109(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C3794.f505;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final BufferedWriter m21110(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ BufferedWriter m21111(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C3794.f505;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m21112(Path path, Charset charset, InterfaceC5124<? super String, C8107> interfaceC5124) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(interfaceC5124, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        C5499.m17102(bufferedReaderNewBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = C7756.m24640(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                interfaceC5124.invoke(it.next());
            }
            C8107 c8107 = C8107.f3222;
            C5437.m16930(1);
            C3849.m904(bufferedReaderNewBufferedReader, null);
            C5437.m16929(1);
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m21113(Path path, Charset charset, InterfaceC5124 interfaceC5124, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(interfaceC5124, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        C5499.m17102(bufferedReaderNewBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = C7756.m24640(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                interfaceC5124.invoke(it.next());
            }
            C8107 c8107 = C8107.f3222;
            C5437.m16930(1);
            C3849.m904(bufferedReaderNewBufferedReader, null);
            C5437.m16929(1);
        } finally {
        }
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final InputStream m21114(Path path, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(openOptionArr, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(inputStreamNewInputStream, "newInputStream(this, *options)");
        return inputStreamNewInputStream;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final OutputStream m21115(Path path, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(openOptionArr, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return outputStreamNewOutputStream;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final byte[] m21116(Path path) throws IOException {
        C5499.m17103(path, "<this>");
        byte[] allBytes = Files.readAllBytes(path);
        C5499.m17102(allBytes, "readAllBytes(this)");
        return allBytes;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final List<String> m21117(Path path, Charset charset) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        C5499.m17102(allLines, "readAllLines(this, charset)");
        return allLines;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ List m21118(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        C5499.m17102(allLines, "readAllLines(this, charset)");
        return allLines;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String m21119(@InterfaceC6399 Path path, @InterfaceC6399 Charset charset) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String strM24643 = C7756.m24643(inputStreamReader);
            C3849.m904(inputStreamReader, null);
            return strM24643;
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ String m21120(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        return m21119(path, charset);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final InputStreamReader m21121(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ InputStreamReader m21122(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <T> T m21123(Path path, Charset charset, InterfaceC5124<? super InterfaceC7326<String>, ? extends T> interfaceC5124) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(interfaceC5124, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            C5499.m17102(bufferedReaderNewBufferedReader, "it");
            T tInvoke = interfaceC5124.invoke(C7756.m24640(bufferedReaderNewBufferedReader));
            C5437.m16930(1);
            C3849.m904(bufferedReaderNewBufferedReader, null);
            C5437.m16929(1);
            return tInvoke;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ Object m21124(Path path, Charset charset, InterfaceC5124 interfaceC5124, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(interfaceC5124, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            C5499.m17102(bufferedReaderNewBufferedReader, "it");
            Object objInvoke = interfaceC5124.invoke(C7756.m24640(bufferedReaderNewBufferedReader));
            C5437.m16930(1);
            C3849.m904(bufferedReaderNewBufferedReader, null);
            C5437.m16929(1);
            return objInvoke;
        } finally {
        }
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final void m21125(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(bArr, "array");
        C5499.m17103(openOptionArr, "options");
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final Path m21126(Path path, InterfaceC7326<? extends CharSequence> interfaceC7326, Charset charset, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(interfaceC7326, "lines");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        Path pathWrite = Files.write(path, C7342.m22910(interfaceC7326), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(pathWrite, "write(this, lines.asIterable(), charset, *options)");
        return pathWrite;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Path m21127(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(iterable, "lines");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        Path pathWrite = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(pathWrite, "write(this, lines, charset, *options)");
        return pathWrite;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ Path m21128(Path path, InterfaceC7326 interfaceC7326, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(interfaceC7326, "lines");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        Path pathWrite = Files.write(path, C7342.m22910(interfaceC7326), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(pathWrite, "write(this, lines.asIterable(), charset, *options)");
        return pathWrite;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ Path m21129(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(iterable, "lines");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        Path pathWrite = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(pathWrite, "write(this, lines, charset, *options)");
        return pathWrite;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final void m21130(@InterfaceC6399 Path path, @InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Charset charset, @InterfaceC6399 OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charSequence, "text");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            C3849.m904(outputStreamWriter, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m21131(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        m21130(path, charSequence, charset, openOptionArr);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final OutputStreamWriter m21132(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ OutputStreamWriter m21133(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }
}
