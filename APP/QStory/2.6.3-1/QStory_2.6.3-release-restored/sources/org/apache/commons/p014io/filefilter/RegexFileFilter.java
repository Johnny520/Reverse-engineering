package org.apache.commons.p014io.filefilter;

import com.alibaba.fastjson2.reader.C3533;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.p014io.IOCase;
import p375.AbstractC9744;
import p375.C9746;
import p375.InterfaceC9740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class RegexFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final transient Function<Path, String> pathToString;
    private final Pattern pattern;

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        Objects.requireNonNull(pattern, "pattern");
        this.pattern = pattern;
        this.pathToString = function == null ? new C3533(28) : function;
    }

    private static Pattern compile(String str, int i) {
        Objects.requireNonNull(str, "pattern");
        return Pattern.compile(str, i);
    }

    private static int toFlags(IOCase iOCase) {
        return IOCase.isCaseSensitive(iOCase) ? 0 : 2;
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        String strApply = this.pathToString.apply(path);
        return toFileVisitResult(strApply != null && this.pattern.matcher(strApply).matches());
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
    public InterfaceC9740 m522or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        return "RegexFileFilter [pattern=" + this.pattern + "]";
    }

    public RegexFileFilter(Pattern pattern) {
        this(pattern, new C9746());
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

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }
}
