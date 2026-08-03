package bsh;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileReader extends InputStreamReader {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FileReader(String str) {
        this(new FileInputStream(str));
    }

    public FileReader(File file) {
        this(new FileInputStream(file));
    }

    public FileReader(FileDescriptor fileDescriptor) {
        this(new FileInputStream(fileDescriptor));
    }

    public FileReader(InputStream inputStream) {
        super(inputStream, StandardCharsets.UTF_8);
    }
}
