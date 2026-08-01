package org.apache.commons.p014io.filefilter;

import androidx.compose.foundation.lazy.layout.C1520;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import p375.AbstractC9744;
import p375.InterfaceC9740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class HiddenFileFilter extends AbstractC9744 implements Serializable {
    public static final InterfaceC9740 HIDDEN;
    public static final InterfaceC9740 VISIBLE;
    private static final long serialVersionUID = 8930842316112759062L;

    static {
        HiddenFileFilter hiddenFileFilter = new HiddenFileFilter();
        HIDDEN = hiddenFileFilter;
        VISIBLE = hiddenFileFilter.negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) {
        return toFileVisitResult(path == null || Files.isHidden(path));
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        return file == null || file.isHidden();
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
    public InterfaceC9740 m516or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new C1520(this, 8, path));
    }
}
