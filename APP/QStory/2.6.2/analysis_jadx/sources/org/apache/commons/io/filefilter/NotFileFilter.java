package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import p359.AbstractC8925;
import p359.InterfaceC8921;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class NotFileFilter extends AbstractC8925 implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final InterfaceC8921 filter;

    public NotFileFilter(InterfaceC8921 interfaceC8921) {
        Objects.requireNonNull(interfaceC8921, "filter");
        this.filter = interfaceC8921;
    }

    private FileVisitResult not(FileVisitResult fileVisitResult) {
        FileVisitResult fileVisitResult2 = FileVisitResult.CONTINUE;
        return fileVisitResult == fileVisitResult2 ? FileVisitResult.TERMINATE : fileVisitResult2;
    }

    @Override // p359.InterfaceC8921
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return not(this.filter.accept(path, basicFileAttributes));
    }

    @Override // p359.InterfaceC8921
    public InterfaceC8921 and(InterfaceC8921 interfaceC8921) {
        return new AndFileFilter(this, interfaceC8921);
    }

    @Override // p359.InterfaceC8921, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p359.InterfaceC8921
    public InterfaceC8921 negate() {
        return new NotFileFilter(this);
    }

    public InterfaceC8921 or(InterfaceC8921 interfaceC8921) {
        return new OrFileFilter(this, interfaceC8921);
    }

    @Override // p359.AbstractC8925
    public String toString() {
        return "NOT (" + this.filter.toString() + ")";
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }
}
