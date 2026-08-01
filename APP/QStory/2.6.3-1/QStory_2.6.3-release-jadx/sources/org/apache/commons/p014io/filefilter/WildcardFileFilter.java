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
import p375.C9747;
import p375.InterfaceC9740;
import p377.AbstractC9749;
import p392.AbstractC9809;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class WildcardFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final IOCase ioCase;
    private final String[] wildcards;

    private WildcardFileFilter(IOCase iOCase, String... strArr) {
        this.wildcards = (String[]) ((String[]) requireWildcards(strArr)).clone();
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    private boolean accept(String str) {
        return Stream.of((Object[]) this.wildcards).anyMatch(new C9739(this, str, 3));
    }

    public static C9747 builder() {
        C9747 c9747 = new C9747();
        c9747.f25457 = IOCase.SENSITIVE;
        return c9747;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return AbstractC9809.m15140(str, str2, this.ioCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T requireWildcards(T t) {
        Objects.requireNonNull(t, "wildcards");
        return t;
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
    public InterfaceC9740 m527or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.wildcards, sb);
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

    private WildcardFileFilter(C9747 c9747) {
        this(c9747.f25457, (String[]) null);
    }

    @Deprecated
    public WildcardFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    @Deprecated
    public WildcardFileFilter(List<String> list, IOCase iOCase) {
        this(iOCase, (String[]) ((List) requireWildcards(list)).toArray(InterfaceC9740.f25448));
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
