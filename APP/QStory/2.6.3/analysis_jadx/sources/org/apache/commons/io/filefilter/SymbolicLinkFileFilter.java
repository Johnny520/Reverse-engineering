package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import p359.AbstractC8915;
import p359.InterfaceC8911;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class SymbolicLinkFileFilter extends AbstractC8915 implements Serializable {
    public static final SymbolicLinkFileFilter INSTANCE = new SymbolicLinkFileFilter();
    private static final long serialVersionUID = 1;

    public SymbolicLinkFileFilter() {
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return isSymbolicLink(file.toPath());
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 and(InterfaceC8911 interfaceC8911) {
        return new AndFileFilter(this, interfaceC8911);
    }

    public boolean isSymbolicLink(Path path) {
        return Files.isSymbolicLink(path);
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

    public SymbolicLinkFileFilter(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        super(fileVisitResult, fileVisitResult2);
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(isSymbolicLink(path));
    }
}
