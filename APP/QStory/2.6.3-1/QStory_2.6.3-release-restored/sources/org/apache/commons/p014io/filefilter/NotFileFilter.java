package org.apache.commons.p014io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import p375.AbstractC9744;
import p375.InterfaceC9740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class NotFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final InterfaceC9740 filter;

    public NotFileFilter(InterfaceC9740 interfaceC9740) {
        Objects.requireNonNull(interfaceC9740, "filter");
        this.filter = interfaceC9740;
    }

    private FileVisitResult not(FileVisitResult fileVisitResult) {
        FileVisitResult fileVisitResult2 = FileVisitResult.CONTINUE;
        return fileVisitResult == fileVisitResult2 ? FileVisitResult.TERMINATE : fileVisitResult2;
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return not(this.filter.accept(path, basicFileAttributes));
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
    public InterfaceC9740 m519or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        return "NOT (" + this.filter.toString() + ")";
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }
}
