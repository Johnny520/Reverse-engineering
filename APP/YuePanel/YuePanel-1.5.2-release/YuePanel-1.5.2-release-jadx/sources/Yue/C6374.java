package Yue;

import Yue.C6618;
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

/* JADX INFO: renamed from: Yue.ۥۡۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public class C6374 extends C5581 {
    @Override // Yue.C5581
    @InterfaceC6399
    public String toString() {
        return "NioSystemFileSystem";
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14639(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        try {
            Files.move(c6618.m21044(), c66182.m21044(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14646(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        Files.createSymbolicLink(c6618.m21044(), c66182.m21044(), new FileAttribute[0]);
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public C4811 mo14657(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "path");
        return m19896(c6618.m21044());
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final C4811 m19896(@InterfaceC6399 Path path) {
        C5499.m17103(path, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            C6618 c6618M21048 = symbolicLink != null ? C6618.C1032.m21048(C6618.f16986, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM19897 = fileTimeCreationTime != null ? m19897(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM198972 = fileTimeLastModifiedTime != null ? m19897(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C4811(zIsRegularFile, zIsDirectory, c6618M21048, lValueOf, lM19897, lM198972, fileTimeLastAccessTime != null ? m19897(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final Long m19897(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }
}
