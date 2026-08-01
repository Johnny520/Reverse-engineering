package p377;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.UnaryOperator;
import org.apache.commons.io.filefilter.SymbolicLinkFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import p330.C8796;
import p361.AbstractC8930;
import p361.C8932;
import p361.C8933;
import p361.C8934;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8981 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final File[] f25229;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
        f25229 = new File[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m14570(File file) {
        try {
            m14571(file);
            try {
                Path path = file.toPath();
                OpenOption[] openOptionArr = AbstractC8930.f25129;
                int i = C8932.f25130;
                C8933 c8933 = new C8933();
                c8933.f25138 = new C8934();
                c8933.f25139 = new SymbolicLinkFileFilter(FileVisitResult.TERMINATE, FileVisitResult.CONTINUE);
                c8933.f25137 = TrueFileFilter.INSTANCE;
                c8933.f25136 = UnaryOperator.identity();
                c8933.f25138 = new C8934();
                C8932 c8932 = new C8932(c8933);
                Files.walkFileTree(path, c8932);
                return c8932.f25133.f25142.f25143;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        } catch (FileNotFoundException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14571(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            return;
        }
        if (file.exists()) {
            C8796.m14448(file, "Parameter 'directory' is not a directory: '", "'");
            return;
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m14572(File file) {
        try {
            Objects.requireNonNull(file, "file");
            return Files.getLastModifiedTime(file.toPath(), new LinkOption[0]).toMillis();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
