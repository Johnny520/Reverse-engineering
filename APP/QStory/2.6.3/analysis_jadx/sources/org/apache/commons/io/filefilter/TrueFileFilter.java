package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import p359.InterfaceC8911;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class TrueFileFilter implements InterfaceC8911, Serializable {
    public static final InterfaceC8911 INSTANCE;
    private static final String TO_STRING = Boolean.TRUE.toString();
    public static final InterfaceC8911 TRUE;
    private static final long serialVersionUID = 8782512160909720199L;

    static {
        TrueFileFilter trueFileFilter = new TrueFileFilter();
        TRUE = trueFileFilter;
        INSTANCE = trueFileFilter;
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return FileVisitResult.CONTINUE;
    }

    @Override // p359.InterfaceC8911, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 negate() {
        return FalseFileFilter.INSTANCE;
    }

    public InterfaceC8911 or(InterfaceC8911 interfaceC8911) {
        return INSTANCE;
    }

    public String toString() {
        return TO_STRING;
    }

    @Override // p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }

    @Override // p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 and(InterfaceC8911 interfaceC8911) {
        return interfaceC8911;
    }
}
