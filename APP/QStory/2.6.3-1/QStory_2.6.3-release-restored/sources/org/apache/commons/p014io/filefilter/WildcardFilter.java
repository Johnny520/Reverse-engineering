package org.apache.commons.p014io.filefilter;

import bsh.C3477;
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
import org.apache.commons.compress.archivers.zip.C6421;
import org.apache.commons.p014io.IOCase;
import p375.AbstractC9744;
import p375.C9742;
import p375.InterfaceC9740;
import p377.AbstractC9749;
import p392.AbstractC9809;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class WildcardFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final String[] wildcards;

    public WildcardFilter(List<String> list) {
        Objects.requireNonNull(list, "wildcards");
        this.wildcards = (String[]) list.toArray(InterfaceC9740.f25448);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$0(File file, String str) {
        String name = file.getName();
        String[] strArr = AbstractC9809.f25552;
        return AbstractC9809.m15140(name, str, IOCase.SENSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$1(String str, String str2) {
        String[] strArr = AbstractC9809.f25552;
        return AbstractC9809.m15140(str, str2, IOCase.SENSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$accept$2(Path path, String str) {
        String strM15107 = AbstractC9749.m15107(path);
        String[] strArr = AbstractC9809.f25552;
        return AbstractC9809.m15140(strM15107, str, IOCase.SENSITIVE);
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return Files.isDirectory(path, new LinkOption[0]) ? FileVisitResult.TERMINATE : AbstractC9744.toDefaultFileVisitResult(Stream.of((Object[]) this.wildcards).anyMatch(new C3477(path, 3)));
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
    public InterfaceC9740 m528or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    public WildcardFilter(String str) {
        Objects.requireNonNull(str, "wildcard");
        this.wildcards = new String[]{str};
    }

    public WildcardFilter(String... strArr) {
        Objects.requireNonNull(strArr, "wildcards");
        this.wildcards = (String[]) strArr.clone();
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file == null || !new File(file, str).isDirectory()) {
            return Stream.of((Object[]) this.wildcards).anyMatch(new C6421(str, 1));
        }
        return false;
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        if (isDirectory(file)) {
            return false;
        }
        return Stream.of((Object[]) this.wildcards).anyMatch(new C9742(file, 2));
    }
}
