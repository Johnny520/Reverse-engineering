package org.apache.commons.io.filefilter;

import com.alibaba.fastjson2.reader.C2699;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;
import p359.AbstractC8925;
import p359.C8927;
import p359.InterfaceC8921;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class RegexFileFilter extends AbstractC8925 implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final transient Function<Path, String> pathToString;
    private final Pattern pattern;

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        Objects.requireNonNull(pattern, "pattern");
        this.pattern = pattern;
        this.pathToString = function == null ? new C2699(28) : function;
    }

    private static Pattern compile(String str, int i) {
        Objects.requireNonNull(str, "pattern");
        return Pattern.compile(str, i);
    }

    private static int toFlags(IOCase iOCase) {
        return IOCase.isCaseSensitive(iOCase) ? 0 : 2;
    }

    @Override // p359.InterfaceC8921
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        String strApply = this.pathToString.apply(path);
        return toFileVisitResult(strApply != null && this.pattern.matcher(strApply).matches());
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
        return "RegexFileFilter [pattern=" + this.pattern + "]";
    }

    public RegexFileFilter(Pattern pattern) {
        this(pattern, new C8927());
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

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }
}
