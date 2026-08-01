package org.apache.commons.io.filefilter;

import bsh.C2644;
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
import org.apache.commons.compress.archivers.zip.C5591;
import org.apache.commons.io.IOCase;
import p359.AbstractC8915;
import p359.C8913;
import p359.InterfaceC8911;
import p361.AbstractC8920;
import p376.AbstractC8980;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class WildcardFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final String[] wildcards;

    public WildcardFilter(List<String> list) {
        Objects.requireNonNull(list, "wildcards");
        this.wildcards = (String[]) list.toArray(InterfaceC8911.f25103);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$0(File file, String str) {
        String name = file.getName();
        String[] strArr = AbstractC8980.f25207;
        return AbstractC8980.m14581(name, str, IOCase.SENSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$1(String str, String str2) {
        String[] strArr = AbstractC8980.f25207;
        return AbstractC8980.m14581(str, str2, IOCase.SENSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$2(Path path, String str) {
        String strM14548 = AbstractC8920.m14548(path);
        String[] strArr = AbstractC8980.f25207;
        return AbstractC8980.m14581(strM14548, str, IOCase.SENSITIVE);
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return Files.isDirectory(path, new LinkOption[0]) ? FileVisitResult.TERMINATE : AbstractC8915.toDefaultFileVisitResult(Stream.of((Object[]) this.wildcards).anyMatch(new C2644(path, 3)));
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

    public WildcardFilter(String str) {
        Objects.requireNonNull(str, "wildcard");
        this.wildcards = new String[]{str};
    }

    public WildcardFilter(String... strArr) {
        Objects.requireNonNull(strArr, "wildcards");
        this.wildcards = (String[]) strArr.clone();
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file == null || !new File(file, str).isDirectory()) {
            return Stream.of((Object[]) this.wildcards).anyMatch(new C5591(str, 1));
        }
        return false;
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        if (isDirectory(file)) {
            return false;
        }
        return Stream.of((Object[]) this.wildcards).anyMatch(new C8913(file, 2));
    }
}
