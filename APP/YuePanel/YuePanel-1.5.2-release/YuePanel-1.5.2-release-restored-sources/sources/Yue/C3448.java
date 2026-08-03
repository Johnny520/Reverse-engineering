package Yue;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"})
public final class C3448 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final byte[] m524(@InterfaceC6399 AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m525(@InterfaceC6399 AtomicFile atomicFile, @InterfaceC6399 Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ String m9113(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C3794.f505;
        }
        return m525(atomicFile, charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m9114(@InterfaceC6399 AtomicFile atomicFile, @InterfaceC6399 InterfaceC5124<? super FileOutputStream, C8107> interfaceC5124) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            interfaceC5124.invoke(fileOutputStreamStartWrite);
            C5437.m16930(1);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
            C5437.m16929(1);
        } catch (Throwable th) {
            C5437.m16930(1);
            atomicFile.failWrite(fileOutputStreamStartWrite);
            C5437.m16929(1);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m9115(@InterfaceC6399 AtomicFile atomicFile, @InterfaceC6399 byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m9116(@InterfaceC6399 AtomicFile atomicFile, @InterfaceC6399 String str, @InterfaceC6399 Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        m9115(atomicFile, bytes);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m9117(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C3794.f505;
        }
        m9116(atomicFile, str, charset);
    }
}
