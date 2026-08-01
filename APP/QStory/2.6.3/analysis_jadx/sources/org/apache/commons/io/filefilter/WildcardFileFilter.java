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
import p359.AbstractC8915;
import p359.C8910;
import p359.C8918;
import p359.InterfaceC8911;
import p361.AbstractC8920;
import p376.AbstractC8980;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class WildcardFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final IOCase ioCase;
    private final String[] wildcards;

    private WildcardFileFilter(IOCase iOCase, String... strArr) {
        this.wildcards = (String[]) ((String[]) requireWildcards(strArr)).clone();
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    private boolean accept(String str) {
        return Stream.of((Object[]) this.wildcards).anyMatch(new C8910(this, str, 3));
    }

    public static C8918 builder() {
        C8918 c8918 = new C8918();
        c8918.f25112 = IOCase.SENSITIVE;
        return c8918;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return AbstractC8980.m14581(str, str2, this.ioCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T requireWildcards(T t) {
        Objects.requireNonNull(t, "wildcards");
        return t;
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
        append(this.wildcards, sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(str);
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(accept(AbstractC8920.m14548(path)));
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getName());
    }

    private WildcardFileFilter(C8918 c8918) {
        this(c8918.f25112, (String[]) null);
    }

    @Deprecated
    public WildcardFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    @Deprecated
    public WildcardFileFilter(List<String> list, IOCase iOCase) {
        this(iOCase, (String[]) ((List) requireWildcards(list)).toArray(InterfaceC8911.f25103));
    }

    @Deprecated
    public WildcardFileFilter(String str) {
        this(IOCase.SENSITIVE, (String) requireWildcards(str));
    }

    @Deprecated
    public WildcardFileFilter(String... strArr) {
        this(IOCase.SENSITIVE, strArr);
    }

    @Deprecated
    public WildcardFileFilter(String str, IOCase iOCase) {
        this(iOCase, str);
    }

    @Deprecated
    public WildcardFileFilter(String[] strArr, IOCase iOCase) {
        this(iOCase, strArr);
    }
}
