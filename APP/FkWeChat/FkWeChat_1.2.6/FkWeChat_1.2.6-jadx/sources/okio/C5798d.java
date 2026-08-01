package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import okio.C5799e;
import p376zd.C10009p;
import p376zd.C10023w;

/* JADX INFO: renamed from: okio.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5798d extends C5796b {
    @Override // okio.C5796b, okio.AbstractC5795a
    public void atomicMove(C5799e c5799e, C5799e c5799e2) throws IOException {
        c5799e.getClass();
        c5799e2.getClass();
        try {
            Files.move(c5799e.m23307s(), c5799e2.m23307s(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            C10023w.m38841a("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public void createSymlink(C5799e c5799e, C5799e c5799e2) throws IOException {
        c5799e.getClass();
        c5799e2.getClass();
        Files.createSymbolicLink(c5799e.m23307s(), c5799e2.m23307s(), new FileAttribute[0]);
    }

    /* JADX INFO: renamed from: f */
    public final C10009p m23293f(Path path) {
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            C5799e c5799eM23311f = symbolicLink != null ? C5799e.a.m23311f(C5799e.f18171r, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM23294h = fileTimeCreationTime != null ? m23294h(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM23294h2 = fileTimeLastModifiedTime != null ? m23294h(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C10009p(zIsRegularFile, zIsDirectory, c5799eM23311f, lValueOf, lM23294h, lM23294h2, fileTimeLastAccessTime != null ? m23294h(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Long m23294h(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public C10009p metadataOrNull(C5799e c5799e) {
        c5799e.getClass();
        return m23293f(c5799e.m23307s());
    }

    @Override // okio.C5796b
    public String toString() {
        return "NioSystemFileSystem";
    }
}
