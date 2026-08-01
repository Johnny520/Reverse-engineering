package org.apache.commons.io.filefilter;

import androidx.compose.foundation.lazy.layout.C0679;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import p359.AbstractC8915;
import p359.InterfaceC8911;
import p376.AbstractC8985;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class EmptyFileFilter extends AbstractC8915 implements Serializable {
    public static final InterfaceC8911 EMPTY;
    public static final InterfaceC8911 NOT_EMPTY;
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

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        if (file == null) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.length() == 0;
        }
        File[] fileArrListFiles = file.listFiles();
        byte[] bArr = AbstractC8985.f25215;
        return (fileArrListFiles == null ? 0 : fileArrListFiles.length) == 0;
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 and(InterfaceC8911 interfaceC8911) {
        return new AndFileFilter(this, interfaceC8911);
    }

    @Override // p359.InterfaceC8911, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 negate() {
        return new NotFileFilter(this);
    }

    public InterfaceC8911 or(InterfaceC8911 interfaceC8911) {
        return new OrFileFilter(this, interfaceC8911);
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        if (path == null) {
            return toFileVisitResult(true);
        }
        return get(new C0679(this, 7, path));
    }
}
