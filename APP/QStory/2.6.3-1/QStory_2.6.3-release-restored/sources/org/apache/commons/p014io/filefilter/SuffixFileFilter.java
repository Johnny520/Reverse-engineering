package org.apache.commons.p014io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import org.apache.commons.p014io.IOCase;
import p375.AbstractC9744;
import p375.C9739;
import p375.InterfaceC9740;
import p377.AbstractC9749;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class SuffixFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = -3389157631240246157L;
    private final IOCase ioCase;
    private final String[] suffixes;

    public SuffixFileFilter(List<String> list, IOCase iOCase) {
        Objects.requireNonNull(list, "suffixes");
        this.suffixes = (String[]) list.toArray(InterfaceC9740.f25448);
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    private boolean accept(String str) {
        return Stream.of((Object[]) this.suffixes).anyMatch(new C9739(this, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return this.ioCase.checkEndsWith(str, str2);
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
    public InterfaceC9740 m524or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.suffixes, sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(str);
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(accept(AbstractC9749.m15107(path)));
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
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
