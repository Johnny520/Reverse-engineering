package org.apache.commons.io.filefilter;

import androidx.compose.foundation.lazy.layout.C0679;
import java.io.File;
import java.io.Serializable;
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
import p359.AbstractC8915;
import p359.InterfaceC8911;
import p361.AbstractC8920;
import p376.AbstractC8981;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class AgeFileFilter extends AbstractC8915 implements Serializable {
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
        OpenOption[] openOptionArr = AbstractC8920.f25118;
        FileTime fileTimeFrom = FileTime.from(instant);
        Objects.requireNonNull(path, "path");
        return toFileVisitResult(z != (!Files.notExists(path, new LinkOption[0]) && Files.getLastModifiedTime(path, linkOptionArr).compareTo(fileTimeFrom) > 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean accept(java.io.File r6) {
        /*
            r5 = this;
            boolean r0 = r5.acceptOlder
            java.time.Instant r5 = r5.cutoffInstant
            java.io.File[] r1 = p376.AbstractC8981.f25208
            java.lang.String r1 = "instant"
            java.util.Objects.requireNonNull(r5, r1)
            java.nio.file.Path r6 = r6.toPath()     // Catch: java.io.IOException -> L38
            r1 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]     // Catch: java.io.IOException -> L38
            java.nio.file.OpenOption[] r3 = p361.AbstractC8920.f25118     // Catch: java.io.IOException -> L38
            java.nio.file.attribute.FileTime r5 = java.nio.file.attribute.FileTime.from(r5)     // Catch: java.io.IOException -> L38
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]     // Catch: java.io.IOException -> L38
            java.lang.String r4 = "path"
            java.util.Objects.requireNonNull(r6, r4)     // Catch: java.io.IOException -> L38
            boolean r3 = java.nio.file.Files.notExists(r6, r3)     // Catch: java.io.IOException -> L38
            r4 = 1
            if (r3 == 0) goto L27
            goto L33
        L27:
            java.nio.file.attribute.FileTime r6 = java.nio.file.Files.getLastModifiedTime(r6, r2)     // Catch: java.io.IOException -> L38
            int r5 = r6.compareTo(r5)     // Catch: java.io.IOException -> L38
            if (r5 <= 0) goto L33
            r5 = r4
            goto L34
        L33:
            r5 = r1
        L34:
            if (r0 == r5) goto L37
            return r4
        L37:
            return r1
        L38:
            r5 = move-exception
            java.io.UncheckedIOException r6 = new java.io.UncheckedIOException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.filefilter.AgeFileFilter.accept(java.io.File):boolean");
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
        return super.toString() + "(" + (this.acceptOlder ? "<=" : ">") + this.cutoffInstant + ")";
    }

    public AgeFileFilter(Date date, boolean z) {
        this(date.toInstant(), z);
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z) {
        this(AbstractC8981.m14585(file), z);
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

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return get(new C0679(this, 6, path));
    }
}
