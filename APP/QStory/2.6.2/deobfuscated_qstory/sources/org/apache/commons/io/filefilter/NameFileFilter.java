package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import org.apache.commons.io.IOCase;
import p359.AbstractC8925;
import p359.C8920;
import p359.InterfaceC8921;
import p361.AbstractC8930;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class NameFileFilter extends AbstractC8925 implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    private final IOCase ioCase;
    private final String[] names;

    public NameFileFilter(List<String> list, IOCase iOCase) {
        Objects.requireNonNull(list, "names");
        this.names = (String[]) list.toArray(InterfaceC8921.f25114);
        this.ioCase = toIOCase(iOCase);
    }

    private boolean acceptBaseName(String str) {
        return Stream.of((Object[]) this.names).anyMatch(new C8920(this, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$acceptBaseName$0(String str, String str2) {
        return this.ioCase.checkEquals(str, str2);
    }

    private IOCase toIOCase(IOCase iOCase) {
        return IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FileFilter
    public boolean accept(File file) {
        return file != null && acceptBaseName(file.getName());
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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.names, sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return acceptBaseName(str);
    }

    @Override // p359.InterfaceC8921
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(acceptBaseName(AbstractC8930.m14535(path)));
    }

    public NameFileFilter(List<String> list) {
        this(list, (IOCase) null);
    }

    public NameFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public NameFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public NameFileFilter(String str, IOCase iOCase) {
        Objects.requireNonNull(str, "name");
        this.names = new String[]{str};
        this.ioCase = toIOCase(iOCase);
    }

    public NameFileFilter(String[] strArr, IOCase iOCase) {
        Objects.requireNonNull(strArr, "names");
        this.names = (String[]) strArr.clone();
        this.ioCase = toIOCase(iOCase);
    }
}
