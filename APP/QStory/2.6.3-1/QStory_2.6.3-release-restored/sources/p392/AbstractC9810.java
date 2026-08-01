package p392;

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
import org.apache.commons.p014io.filefilter.SymbolicLinkFileFilter;
import org.apache.commons.p014io.filefilter.TrueFileFilter;
import p352.C9620;
import p377.AbstractC9749;
import p377.C9751;
import p377.C9752;
import p377.C9753;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9810 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final File[] f25553;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
        f25553 = new File[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m15142(File file) {
        try {
            m15143(file);
            try {
                Path path = file.toPath();
                OpenOption[] openOptionArr = AbstractC9749.f25463;
                int i = C9751.f25464;
                C9752 c9752 = new C9752();
                c9752.f25471 = new C9753();
                c9752.f25470 = new SymbolicLinkFileFilter(FileVisitResult.TERMINATE, FileVisitResult.CONTINUE);
                c9752.f25472 = TrueFileFilter.INSTANCE;
                c9752.f25473 = UnaryOperator.identity();
                c9752.f25471 = new C9753();
                C9751 c9751 = new C9751(c9752);
                Files.walkFileTree(path, c9751);
                return c9751.f25467.f25476.f25477;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        } catch (FileNotFoundException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m15143(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            return;
        }
        if (file.exists()) {
            C9620.m15031(file, "Parameter 'directory' is not a directory: '", "'");
            return;
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m15144(File file) {
        try {
            Objects.requireNonNull(file, "file");
            return Files.getLastModifiedTime(file.toPath(), new LinkOption[0]).toMillis();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
