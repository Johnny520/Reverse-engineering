package ve;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import p012ah.C0086a;

/* JADX INFO: renamed from: ve.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4549a {

    /* JADX INFO: renamed from: a */
    public static final Path f15008a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            Path pathCreateTempDirectory = Files.createTempDirectory("jadx-temp-", new FileAttribute[0]);
            f15008a = pathCreateTempDirectory;
            pathCreateTempDirectory.toFile().deleteOnExit();
        } catch (Exception e6) {
            C0086a.m457p("Failed to create temp directory", e6);
        }
    }
}
