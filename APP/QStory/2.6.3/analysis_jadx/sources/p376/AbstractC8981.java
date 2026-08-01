package p376;

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
import p336.C8791;
import p361.AbstractC8920;
import p361.C8922;
import p361.C8923;
import p361.C8924;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8981 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final File[] f25208;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
        f25208 = new File[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m14583(File file) {
        try {
            m14584(file);
            try {
                Path path = file.toPath();
                OpenOption[] openOptionArr = AbstractC8920.f25118;
                int i = C8922.f25119;
                C8923 c8923 = new C8923();
                c8923.f25126 = new C8924();
                c8923.f25125 = new SymbolicLinkFileFilter(FileVisitResult.TERMINATE, FileVisitResult.CONTINUE);
                c8923.f25127 = TrueFileFilter.INSTANCE;
                c8923.f25128 = UnaryOperator.identity();
                c8923.f25126 = new C8924();
                C8922 c8922 = new C8922(c8923);
                Files.walkFileTree(path, c8922);
                return c8922.f25122.f25131.f25132;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        } catch (FileNotFoundException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14584(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            return;
        }
        if (file.exists()) {
            C8791.m14472(file, "Parameter 'directory' is not a directory: '", "'");
            return;
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m14585(File file) {
        try {
            Objects.requireNonNull(file, "file");
            return Files.getLastModifiedTime(file.toPath(), new LinkOption[0]).toMillis();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
