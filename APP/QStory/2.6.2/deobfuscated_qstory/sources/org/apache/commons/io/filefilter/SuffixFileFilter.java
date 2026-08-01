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
public class SuffixFileFilter extends AbstractC8925 implements Serializable {
    private static final long serialVersionUID = -3389157631240246157L;
    private final IOCase ioCase;
    private final String[] suffixes;

    public SuffixFileFilter(List<String> list, IOCase iOCase) {
        Objects.requireNonNull(list, "suffixes");
        this.suffixes = (String[]) list.toArray(InterfaceC8921.f25114);
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    private boolean accept(String str) {
        return Stream.of((Object[]) this.suffixes).anyMatch(new C8920(this, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return this.ioCase.checkEndsWith(str, str2);
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
        append(this.suffixes, sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(str);
    }

    @Override // p359.InterfaceC8921
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(accept(AbstractC8930.m14535(path)));
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getName());
    }

    public SuffixFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String str, IOCase iOCase) {
        Objects.requireNonNull(str, "suffix");
        this.suffixes = new String[]{str};
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String[] strArr, IOCase iOCase) {
        Objects.requireNonNull(strArr, "suffixes");
        this.suffixes = (String[]) strArr.clone();
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }
}
