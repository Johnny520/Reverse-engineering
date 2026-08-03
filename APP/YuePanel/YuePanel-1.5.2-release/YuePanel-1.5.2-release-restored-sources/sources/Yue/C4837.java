package Yue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n231#1:234\n1#2:233\n1#2:235\n*S KotlinDebug\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n*L\n230#1:234\n230#1:235\n*E\n"})
public class C4837 extends C4836 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۥ$ۥ */
    public static final class C0504 extends AbstractC5673 implements InterfaceC5124<String, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ArrayList<String> f10901;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0504(ArrayList<String> arrayList) {
            super(1);
            this.f10901 = arrayList;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(String str) {
            m14741(str);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m14741(@InterfaceC6399 String str) {
            C5499.m17103(str, "it");
            this.f10901.add(str);
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m14712(@InterfaceC6399 File file, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(file, "<this>");
        C5499.m17103(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            C8107 c8107 = C8107.f3222;
            C3849.m904(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m14713(@InterfaceC6399 File file, @InterfaceC6399 String str, @InterfaceC6399 Charset charset) {
        C5499.m17103(file, "<this>");
        C5499.m17103(str, "text");
        C5499.m17103(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        m14712(file, bytes);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m14714(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        m14713(file, str, charset);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final BufferedReader m14715(File file, Charset charset, int i) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ BufferedReader m14716(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C3794.f505;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final BufferedWriter m14717(File file, Charset charset, int i) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ BufferedWriter m14718(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C3794.f505;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.io.FileInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m14719(@InterfaceC6399 File file, int i, @InterfaceC6399 InterfaceC5138<? super byte[], ? super Integer, C8107> interfaceC5138) {
        C5499.m17103(file, "<this>");
        C5499.m17103(interfaceC5138, "action");
        ?? r2 = new byte[C7007.m21661(i, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(r2);
                if (i2 <= 0) {
                    C8107 c8107 = C8107.f3222;
                    C3849.m904(fileInputStream, null);
                    return;
                }
                interfaceC5138.invoke(r2, Integer.valueOf(i2));
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m14720(@InterfaceC6399 File file, @InterfaceC6399 InterfaceC5138<? super byte[], ? super Integer, C8107> interfaceC5138) {
        C5499.m17103(file, "<this>");
        C5499.m17103(interfaceC5138, "action");
        m14719(file, 4096, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final void m14721(@InterfaceC6399 File file, @InterfaceC6399 Charset charset, @InterfaceC6399 InterfaceC5124<? super String, C8107> interfaceC5124) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(interfaceC5124, "action");
        C7756.m24639(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ void m14722(File file, Charset charset, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        m14721(file, charset, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final FileInputStream m14723(File file) {
        C5499.m17103(file, "<this>");
        return new FileInputStream(file);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final FileOutputStream m14724(File file) {
        C5499.m17103(file, "<this>");
        return new FileOutputStream(file);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final PrintWriter m14725(File file, Charset charset) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ PrintWriter m14726(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final byte[] m14727(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrM7123 = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrM7123, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrM7123 = Arrays.copyOf(bArrM7123, i3);
                C5499.m17102(bArrM7123, "copyOf(this, newSize)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    C4780 c4780 = new C4780(8193);
                    c4780.write(i5);
                    C3629.m9782(fileInputStream, c4780, 0, 2, null);
                    int size = c4780.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM1685 = c4780.m1685();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrM7123, size);
                    C5499.m17102(bArrCopyOf, "copyOf(this, newSize)");
                    bArrM7123 = C3404.m7123(bArrM1685, bArrCopyOf, i, 0, c4780.size());
                }
            }
            C3849.m904(fileInputStream, null);
            return bArrM7123;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C3849.m904(fileInputStream, th);
                throw th2;
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final List<String> m14728(@InterfaceC6399 File file, @InterfaceC6399 Charset charset) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        ArrayList arrayList = new ArrayList();
        m14721(file, charset, new C0504(arrayList));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ List m14729(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        return m14728(file, charset);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String m14730(@InterfaceC6399 File file, @InterfaceC6399 Charset charset) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM24643 = C7756.m24643(inputStreamReader);
            C3849.m904(inputStreamReader, null);
            return strM24643;
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ String m14731(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        return m14730(file, charset);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final InputStreamReader m14732(File file, Charset charset) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ InputStreamReader m14733(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> T m14734(@InterfaceC6399 File file, @InterfaceC6399 Charset charset, @InterfaceC6399 InterfaceC5124<? super InterfaceC7326<String>, ? extends T> interfaceC5124) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        C5499.m17103(interfaceC5124, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T tInvoke = interfaceC5124.invoke(C7756.m24640(bufferedReader));
            C5437.m16930(1);
            C3849.m904(bufferedReader, null);
            C5437.m16929(1);
            return tInvoke;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ Object m14735(File file, Charset charset, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object objInvoke = interfaceC5124.invoke(C7756.m24640(bufferedReader));
            C5437.m16930(1);
            C3849.m904(bufferedReader, null);
            C5437.m16929(1);
            return objInvoke;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final void m14736(@InterfaceC6399 File file, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(file, "<this>");
        C5499.m17103(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            C8107 c8107 = C8107.f3222;
            C3849.m904(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final void m14737(@InterfaceC6399 File file, @InterfaceC6399 String str, @InterfaceC6399 Charset charset) {
        C5499.m17103(file, "<this>");
        C5499.m17103(str, "text");
        C5499.m17103(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        m14736(file, bytes);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ void m14738(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        m14737(file, str, charset);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final OutputStreamWriter m14739(File file, Charset charset) {
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ OutputStreamWriter m14740(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        C5499.m17103(file, "<this>");
        C5499.m17103(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }
}
