package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import p359.AbstractC8915;
import p359.InterfaceC8911;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class NotFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final InterfaceC8911 filter;

    public NotFileFilter(InterfaceC8911 interfaceC8911) {
        Objects.requireNonNull(interfaceC8911, "filter");
        this.filter = interfaceC8911;
    }

    private FileVisitResult not(FileVisitResult fileVisitResult) {
        FileVisitResult fileVisitResult2 = FileVisitResult.CONTINUE;
        return fileVisitResult == fileVisitResult2 ? FileVisitResult.TERMINATE : fileVisitResult2;
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return not(this.filter.accept(path, basicFileAttributes));
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

    @Override // p359.AbstractC8915
    public String toString() {
        return "NOT (" + this.filter.toString() + ")";
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }
}
