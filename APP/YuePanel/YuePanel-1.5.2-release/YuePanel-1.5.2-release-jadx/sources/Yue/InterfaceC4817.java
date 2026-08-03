package Yue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4817 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0499 f1135 = C0499.f1137;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final InterfaceC4817 f1136 = new C0499.C4818();

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ$ۥ */
    public static final class C0499 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ C0499 f1137 = new C0499();

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4818 implements InterfaceC4817 {
            @InterfaceC6399
            public String toString() {
                return "FileSystem.SYSTEM";
            }

            @Override // Yue.InterfaceC4817
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public InterfaceC7506 mo1729(@InterfaceC6399 File file) throws FileNotFoundException {
                C5499.m17103(file, "file");
                return C6542.m20846(file);
            }

            @Override // Yue.InterfaceC4817
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟ */
            public InterfaceC7472 mo1730(@InterfaceC6399 File file) throws FileNotFoundException {
                C5499.m17103(file, "file");
                try {
                    return C6543.m20865(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C6543.m20865(file, false, 1, null);
                }
            }

            @Override // Yue.InterfaceC4817
            /* JADX INFO: renamed from: ۥ۟۟ */
            public void mo14621(@InterfaceC6399 File file) throws IOException {
                C5499.m17103(file, "directory");
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        C5499.m17102(file2, "file");
                        mo14621(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // Yue.InterfaceC4817
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public boolean mo14622(@InterfaceC6399 File file) {
                C5499.m17103(file, "file");
                return file.exists();
            }

            @Override // Yue.InterfaceC4817
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public void mo14623(@InterfaceC6399 File file, @InterfaceC6399 File file2) throws IOException {
                C5499.m17103(file, "from");
                C5499.m17103(file2, C5905.f14738);
                mo14624(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // Yue.InterfaceC4817
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public void mo14624(@InterfaceC6399 File file) throws IOException {
                C5499.m17103(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // Yue.InterfaceC4817
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
            public InterfaceC7472 mo14625(@InterfaceC6399 File file) throws FileNotFoundException {
                C5499.m17103(file, "file");
                try {
                    return C6542.m3009(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C6542.m3009(file);
                }
            }

            @Override // Yue.InterfaceC4817
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
            public long mo14626(@InterfaceC6399 File file) {
                C5499.m17103(file, "file");
                return file.length();
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    InterfaceC7506 mo1729(@InterfaceC6399 File file) throws FileNotFoundException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    InterfaceC7472 mo1730(@InterfaceC6399 File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    void mo14621(@InterfaceC6399 File file) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    boolean mo14622(@InterfaceC6399 File file);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    void mo14623(@InterfaceC6399 File file, @InterfaceC6399 File file2) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    void mo14624(@InterfaceC6399 File file) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    InterfaceC7472 mo14625(@InterfaceC6399 File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    long mo14626(@InterfaceC6399 File file);
}
