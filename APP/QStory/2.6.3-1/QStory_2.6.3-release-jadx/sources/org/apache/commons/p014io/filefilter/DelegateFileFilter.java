package org.apache.commons.p014io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import p375.AbstractC9744;
import p375.InterfaceC9740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DelegateFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = -8723373124984771318L;
    private final transient FileFilter fileFilter;
    private final transient FilenameFilter fileNameFilter;

    public DelegateFileFilter(FileFilter fileFilter) {
        Objects.requireNonNull(fileFilter, "filter");
        this.fileFilter = fileFilter;
        this.fileNameFilter = null;
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractC9744.toDefaultFileVisitResult(path != null && accept(path.toFile()));
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
    public InterfaceC9740 m511or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        return super.toString() + "(" + Objects.toString(this.fileFilter, Objects.toString(this.fileNameFilter, null)) + ")";
    }

    public DelegateFileFilter(FilenameFilter filenameFilter) {
        Objects.requireNonNull(filenameFilter, "filter");
        this.fileNameFilter = filenameFilter;
        this.fileFilter = null;
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        FileFilter fileFilter = this.fileFilter;
        if (fileFilter != null) {
            return fileFilter.accept(file);
        }
        return super.accept(file);
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FilenameFilter filenameFilter = this.fileNameFilter;
        if (filenameFilter != null) {
            return filenameFilter.accept(file, str);
        }
        return super.accept(file, str);
    }
}
