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
public class NameFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    private final IOCase ioCase;
    private final String[] names;

    public NameFileFilter(List<String> list, IOCase iOCase) {
        Objects.requireNonNull(list, "names");
        this.names = (String[]) list.toArray(InterfaceC9740.f25448);
        this.ioCase = toIOCase(iOCase);
    }

    private boolean acceptBaseName(String str) {
        return Stream.of((Object[]) this.names).anyMatch(new C9739(this, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$acceptBaseName$0(String str, String str2) {
        return this.ioCase.checkEquals(str, str2);
    }

    private IOCase toIOCase(IOCase iOCase) {
        return IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        return file != null && acceptBaseName(file.getName());
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
    public InterfaceC9740 m518or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.names, sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return acceptBaseName(str);
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(acceptBaseName(AbstractC9749.m15107(path)));
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
