package org.apache.commons.p014io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import p375.InterfaceC9740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class TrueFileFilter implements InterfaceC9740, Serializable {
    public static final InterfaceC9740 INSTANCE;
    private static final String TO_STRING = Boolean.TRUE.toString();
    public static final InterfaceC9740 TRUE;
    private static final long serialVersionUID = 8782512160909720199L;

    static {
        TrueFileFilter trueFileFilter = new TrueFileFilter();
        TRUE = trueFileFilter;
        INSTANCE = trueFileFilter;
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return FileVisitResult.CONTINUE;
    }

    @Override // p375.InterfaceC9740, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p375.InterfaceC9740
    public InterfaceC9740 negate() {
        return FalseFileFilter.INSTANCE;
    }

    /* JADX INFO: renamed from: or */
    public InterfaceC9740 m526or(InterfaceC9740 interfaceC9740) {
        return INSTANCE;
    }

    public String toString() {
        return TO_STRING;
    }

    @Override // p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }

    @Override // p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // p375.InterfaceC9740
    public InterfaceC9740 and(InterfaceC9740 interfaceC9740) {
        return interfaceC9740;
    }
}
