package org.apache.commons.p014io.filefilter;

import androidx.compose.foundation.lazy.layout.C1520;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import p375.AbstractC9744;
import p375.InterfaceC9740;
import p392.AbstractC9814;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class EmptyFileFilter extends AbstractC9744 implements Serializable {
    public static final InterfaceC9740 EMPTY;
    public static final InterfaceC9740 NOT_EMPTY;
    private static final long serialVersionUID = 3631422087512832211L;

    static {
        EmptyFileFilter emptyFileFilter = new EmptyFileFilter();
        EMPTY = emptyFileFilter;
        NOT_EMPTY = emptyFileFilter.negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) throws IOException {
        if (!Files.isDirectory(path, new LinkOption[0])) {
            return toFileVisitResult(Files.size(path) == 0);
        }
        Stream<Path> list = Files.list(path);
        try {
            FileVisitResult fileVisitResult = toFileVisitResult(!list.findFirst().isPresent());
            list.close();
            return fileVisitResult;
        } catch (Throwable th) {
            if (list != null) {
                try {
                    list.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        if (file == null) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.length() == 0;
        }
        File[] fileArrListFiles = file.listFiles();
        byte[] bArr = AbstractC9814.f25560;
        return (fileArrListFiles == null ? 0 : fileArrListFiles.length) == 0;
    }

    @Override // p375.InterfaceC9740
    public InterfaceC9740 and(InterfaceC9740 interfaceC9740) {
        return new AndFileFilter(this, interfaceC9740);
    }

    @Override // p375.InterfaceC9740, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p375.InterfaceC9740
    public InterfaceC9740 negate() {
        return new NotFileFilter(this);
    }

    /* JADX INFO: renamed from: or */
    public InterfaceC9740 m513or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        if (path == null) {
            return toFileVisitResult(true);
        }
        return get(new C1520(this, 7, path));
    }
}
