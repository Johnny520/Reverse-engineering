package org.apache.commons.p014io.filefilter;

import androidx.compose.foundation.lazy.layout.C1520;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import p375.AbstractC9744;
import p375.InterfaceC9740;
import p377.AbstractC9749;
import p392.AbstractC9810;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class AgeFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final Instant cutoffInstant;

    public AgeFileFilter(long j) {
        this(Instant.ofEpochMilli(j), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FileVisitResult lambda$accept$0(Path path) {
        boolean z = this.acceptOlder;
        Instant instant = this.cutoffInstant;
        LinkOption[] linkOptionArr = new LinkOption[0];
        OpenOption[] openOptionArr = AbstractC9749.f25463;
        FileTime fileTimeFrom = FileTime.from(instant);
        Objects.requireNonNull(path, "path");
        return toFileVisitResult(z != (!Files.notExists(path, new LinkOption[0]) && Files.getLastModifiedTime(path, linkOptionArr).compareTo(fileTimeFrom) > 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean accept(File file) {
        boolean z;
        boolean z2 = this.acceptOlder;
        Instant instant = this.cutoffInstant;
        File[] fileArr = AbstractC9810.f25553;
        Objects.requireNonNull(instant, "instant");
        try {
            Path path = file.toPath();
            LinkOption[] linkOptionArr = new LinkOption[0];
            OpenOption[] openOptionArr = AbstractC9749.f25463;
            FileTime fileTimeFrom = FileTime.from(instant);
            Objects.requireNonNull(path, "path");
            if (!Files.notExists(path, new LinkOption[0])) {
                if (Files.getLastModifiedTime(path, linkOptionArr).compareTo(fileTimeFrom) > 0) {
                    z = true;
                }
                return z2 == z;
            }
            z = false;
            if (z2 == z) {
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
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
    public InterfaceC9740 m506or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        return super.toString() + "(" + (this.acceptOlder ? "<=" : ">") + this.cutoffInstant + ")";
    }

    public AgeFileFilter(Date date, boolean z) {
        this(date.toInstant(), z);
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z) {
        this(AbstractC9810.m15144(file), z);
    }

    public AgeFileFilter(Instant instant) {
        this(instant, true);
    }

    public AgeFileFilter(Instant instant, boolean z) {
        this.acceptOlder = z;
        this.cutoffInstant = instant;
    }

    public AgeFileFilter(Date date) {
        this(date, true);
    }

    public AgeFileFilter(long j, boolean z) {
        this(Instant.ofEpochMilli(j), z);
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new C1520(this, 6, path));
    }
}
