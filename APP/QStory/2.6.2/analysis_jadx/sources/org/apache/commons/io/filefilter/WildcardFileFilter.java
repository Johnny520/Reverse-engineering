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
import p359.C8928;
import p359.InterfaceC8921;
import p361.AbstractC8930;
import p377.AbstractC8980;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class WildcardFileFilter extends AbstractC8925 implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final IOCase ioCase;
    private final String[] wildcards;

    private WildcardFileFilter(IOCase iOCase, String... strArr) {
        this.wildcards = (String[]) ((String[]) requireWildcards(strArr)).clone();
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    private boolean accept(String str) {
        return Stream.of((Object[]) this.wildcards).anyMatch(new C8920(this, str, 3));
    }

    public static C8928 builder() {
        C8928 c8928 = new C8928();
        c8928.f25123 = IOCase.SENSITIVE;
        return c8928;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return AbstractC8980.m14568(str, str2, this.ioCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T requireWildcards(T t) {
        Objects.requireNonNull(t, "wildcards");
        return t;
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
        append(this.wildcards, sb);
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

    private WildcardFileFilter(C8928 c8928) {
        this(c8928.f25123, (String[]) null);
    }

    @Deprecated
    public WildcardFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    @Deprecated
    public WildcardFileFilter(List<String> list, IOCase iOCase) {
        this(iOCase, (String[]) ((List) requireWildcards(list)).toArray(InterfaceC8921.f25114));
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
