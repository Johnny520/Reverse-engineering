package org.apache.commons.io.filefilter;

import com.alibaba.fastjson2.reader.C2700;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;
import p359.AbstractC8915;
import p359.C8917;
import p359.InterfaceC8911;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class RegexFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final transient Function<Path, String> pathToString;
    private final Pattern pattern;

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        Objects.requireNonNull(pattern, "pattern");
        this.pattern = pattern;
        this.pathToString = function == null ? new C2700(28) : function;
    }

    private static Pattern compile(String str, int i) {
        Objects.requireNonNull(str, "pattern");
        return Pattern.compile(str, i);
    }

    private static int toFlags(IOCase iOCase) {
        return IOCase.isCaseSensitive(iOCase) ? 0 : 2;
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        String strApply = this.pathToString.apply(path);
        return toFileVisitResult(strApply != null && this.pattern.matcher(strApply).matches());
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
        return "RegexFileFilter [pattern=" + this.pattern + "]";
    }

    public RegexFileFilter(Pattern pattern) {
        this(pattern, new C8917());
    }

    public RegexFileFilter(String str) {
        this(str, 0);
    }

    public RegexFileFilter(String str, int i) {
        this(compile(str, i));
    }

    public RegexFileFilter(String str, IOCase iOCase) {
        this(compile(str, toFlags(iOCase)));
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }
}
