package Yue;

import Yue.C6618;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
public class C5581 extends AbstractC4819 {
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    private final List<C6618> m17355(C6618 c6618, boolean z) throws IOException {
        File fileM21043 = c6618.m21043();
        String[] list = fileM21043.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C5499.m17100(str);
                arrayList.add(c6618.m21041(str));
            }
            C3884.m10767(arrayList);
            return arrayList;
        }
        if (!z) {
            return null;
        }
        if (fileM21043.exists()) {
            throw new IOException("failed to list " + c6618);
        }
        throw new FileNotFoundException("no such file: " + c6618);
    }

    @InterfaceC6399
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC7472 mo14638(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        if (z) {
            m17357(c6618);
        }
        return C6542.m20841(c6618.m21043(), true);
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14639(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        if (c6618.m21043().renameTo(c66182.m21043())) {
            return;
        }
        throw new IOException("failed to move " + c6618 + " to " + c66182);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public C6618 mo14640(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        File canonicalFile = c6618.m21043().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        C6618.C1032 c1032 = C6618.f16986;
        C5499.m17100(canonicalFile);
        return C6618.C1032.m21046(c1032, canonicalFile, false, 1, null);
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo14645(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "dir");
        if (c6618.m21043().mkdir()) {
            return;
        }
        C4811 c4811Mo14657 = mo14657(c6618);
        if (c4811Mo14657 == null || !c4811Mo14657.m14597()) {
            throw new IOException("failed to create directory: " + c6618);
        }
        if (z) {
            throw new IOException(c6618 + " already exists.");
        }
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14646(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        throw new IOException("unsupported");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo14648(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileM21043 = c6618.m21043();
        if (fileM21043.delete()) {
            return;
        }
        if (fileM21043.exists()) {
            throw new IOException("failed to delete " + c6618);
        }
        if (z) {
            throw new FileNotFoundException("no such file: " + c6618);
        }
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public List<C6618> mo14652(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "dir");
        List<C6618> listM17355 = m17355(c6618, true);
        C5499.m17100(listM17355);
        return listM17355;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public List<C6618> mo14653(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "dir");
        return m17355(c6618, false);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public C4811 mo14657(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "path");
        File fileM21043 = c6618.m21043();
        boolean zIsFile = fileM21043.isFile();
        boolean zIsDirectory = fileM21043.isDirectory();
        long jLastModified = fileM21043.lastModified();
        long length = fileM21043.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileM21043.exists()) {
            return new C4811(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public AbstractC4809 mo14658(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "file");
        return new C5569(false, new RandomAccessFile(c6618.m21043(), "r"));
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC4809 mo14660(@InterfaceC6399 C6618 c6618, boolean z, boolean z2) throws IOException {
        C5499.m17103(c6618, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z) {
            m17356(c6618);
        }
        if (z2) {
            m17357(c6618);
        }
        return new C5569(true, new RandomAccessFile(c6618.m21043(), "rw"));
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public InterfaceC7472 mo14662(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        if (z) {
            m17356(c6618);
        }
        return C6543.m20865(c6618.m21043(), false, 1, null);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public InterfaceC7506 mo14663(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "file");
        return C6542.m20846(c6618.m21043());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m17356(C6618 c6618) throws IOException {
        if (m14651(c6618)) {
            throw new IOException(c6618 + " already exists.");
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m17357(C6618 c6618) throws IOException {
        if (m14651(c6618)) {
            return;
        }
        throw new IOException(c6618 + " doesn't exist.");
    }
}
