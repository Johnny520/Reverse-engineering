package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import p359.InterfaceC8921;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FalseFileFilter implements InterfaceC8921, Serializable {
    public static final InterfaceC8921 FALSE;
    public static final InterfaceC8921 INSTANCE;
    private static final String TO_STRING = Boolean.FALSE.toString();
    private static final long serialVersionUID = 6210271677940926200L;

    static {
        FalseFileFilter falseFileFilter = new FalseFileFilter();
        FALSE = falseFileFilter;
        INSTANCE = falseFileFilter;
    }

    @Override // p359.InterfaceC8921
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return FileVisitResult.TERMINATE;
    }

    @Override // p359.InterfaceC8921
    public InterfaceC8921 and(InterfaceC8921 interfaceC8921) {
        return INSTANCE;
    }

    @Override // p359.InterfaceC8921, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p359.InterfaceC8921
    public InterfaceC8921 negate() {
        return TrueFileFilter.INSTANCE;
    }

    public String toString() {
        return TO_STRING;
    }

    @Override // p359.InterfaceC8921, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }

    @Override // p359.InterfaceC8921, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    public InterfaceC8921 or(InterfaceC8921 interfaceC8921) {
        return interfaceC8921;
    }
}
