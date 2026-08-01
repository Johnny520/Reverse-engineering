package org.apache.commons.io.filefilter;

import androidx.compose.foundation.lazy.layout.C0679;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import p359.AbstractC8915;
import p359.InterfaceC8911;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class SizeFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long j, boolean z) {
        if (j < 0) {
            C5925.m11310("The size must be non-negative");
            throw null;
        }
        this.size = j;
        this.acceptLarger = z;
    }

    private boolean accept(long j) {
        return this.acceptLarger != ((j > this.size ? 1 : (j == this.size ? 0 : -1)) < 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) {
        return toFileVisitResult(accept(Files.size(path)));
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
        return super.toString() + "(" + (this.acceptLarger ? ">=" : "<") + this.size + ")";
    }

    @Override // p359.AbstractC8915, java.nio.file.FileVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(accept(Files.size(path)));
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file != null ? file.length() : 0L);
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new C0679(this, 9, path));
    }

    public SizeFileFilter(long j) {
        this(j, true);
    }
}
