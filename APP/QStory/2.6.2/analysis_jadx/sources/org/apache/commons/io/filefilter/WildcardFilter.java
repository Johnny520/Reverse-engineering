package org.apache.commons.io.filefilter;

import bsh.C2643;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import org.apache.commons.compress.archivers.zip.C5590;
import org.apache.commons.io.IOCase;
import p359.AbstractC8925;
import p359.C8923;
import p359.InterfaceC8921;
import p361.AbstractC8930;
import p377.AbstractC8980;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class WildcardFilter extends AbstractC8925 implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final String[] wildcards;

    public WildcardFilter(List<String> list) {
        Objects.requireNonNull(list, "wildcards");
        this.wildcards = (String[]) list.toArray(InterfaceC8921.f25114);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$0(File file, String str) {
        String name = file.getName();
        String[] strArr = AbstractC8980.f25228;
        return AbstractC8980.m14568(name, str, IOCase.SENSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$1(String str, String str2) {
        String[] strArr = AbstractC8980.f25228;
        return AbstractC8980.m14568(str, str2, IOCase.SENSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$2(Path path, String str) {
        String strM14535 = AbstractC8930.m14535(path);
        String[] strArr = AbstractC8980.f25228;
        return AbstractC8980.m14568(strM14535, str, IOCase.SENSITIVE);
    }

    @Override // p359.InterfaceC8921
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return Files.isDirectory(path, new LinkOption[0]) ? FileVisitResult.TERMINATE : AbstractC8925.toDefaultFileVisitResult(Stream.of((Object[]) this.wildcards).anyMatch(new C2643(path, 3)));
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

    public WildcardFilter(String str) {
        Objects.requireNonNull(str, "wildcard");
        this.wildcards = new String[]{str};
    }

    public WildcardFilter(String... strArr) {
        Objects.requireNonNull(strArr, "wildcards");
        this.wildcards = (String[]) strArr.clone();
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file == null || !new File(file, str).isDirectory()) {
            return Stream.of((Object[]) this.wildcards).anyMatch(new C5590(str, 1));
        }
        return false;
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FileFilter
    public boolean accept(File file) {
        if (isDirectory(file)) {
            return false;
        }
        return Stream.of((Object[]) this.wildcards).anyMatch(new C8923(file, 2));
    }
}
