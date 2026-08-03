package okhttp3.internal.p220io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import okio.Source;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class SystemFileSystem implements FileSystem {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public Sink appendingSink(File file) {
                file.getClass();
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public void delete(File file) throws IOException {
                file.getClass();
                if (file.delete() || !file.exists()) {
                    return;
                }
                C2104o.m5285j(file, "failed to delete ");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public void deleteContents(File file) throws IOException {
                file.getClass();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    C2104o.m5285j(file, "not a readable directory: ");
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        C2104o.m5285j(file2, "failed to delete ");
                        return;
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public boolean exists(File file) {
                file.getClass();
                return file.exists();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public void rename(File file, File file2) throws IOException {
                file.getClass();
                file2.getClass();
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public Sink sink(File file) {
                file.getClass();
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public long size(File file) {
                file.getClass();
                return file.length();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.p220io.FileSystem
            public Source source(File file) {
                file.getClass();
                return Okio.source(file);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }
    }

    Sink appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    Sink sink(File file);

    long size(File file);

    Source source(File file);
}
