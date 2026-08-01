package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import org.apache.commons.io.IOCase;
import p359.AbstractC8915;
import p359.C8910;
import p359.InterfaceC8911;
import p361.AbstractC8920;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PrefixFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = 8533897440809599867L;
    private final IOCase isCase;
    private final String[] prefixes;

    public PrefixFileFilter(List<String> list, IOCase iOCase) {
        Objects.requireNonNull(list, "prefixes");
        this.prefixes = (String[]) list.toArray(InterfaceC8911.f25103);
        this.isCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return this.isCase.checkStartsWith(str, str2);
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        OpenOption[] openOptionArr = AbstractC8920.f25118;
        Path fileName = path != null ? path.getFileName() : null;
        return toFileVisitResult(accept(fileName != null ? fileName.toFile() : null));
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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.prefixes, sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(str);
    }

    public PrefixFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file == null ? null : file.getName());
    }

    public PrefixFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    private boolean accept(String str) {
        return Stream.of((Object[]) this.prefixes).anyMatch(new C8910(this, str, 1));
    }

    public PrefixFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String str, IOCase iOCase) {
        Objects.requireNonNull(str, "prefix");
        this.prefixes = new String[]{str};
        this.isCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String[] strArr, IOCase iOCase) {
        Objects.requireNonNull(strArr, "prefixes");
        this.prefixes = (String[]) strArr.clone();
        this.isCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }
}
