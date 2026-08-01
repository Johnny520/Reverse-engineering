package org.apache.commons.p014io.monitor;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileTime;
import java.util.Objects;
import p376.AbstractC9748;
import p392.AbstractC9810;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FileEntry implements Serializable {
    static final FileEntry[] EMPTY_FILE_ENTRY_ARRAY = new FileEntry[0];
    private static final long serialVersionUID = -2505664948818681153L;
    private FileEntry[] children;
    private boolean directory;
    private boolean exists;
    private final File file;
    private SerializableFileTime lastModified;
    private long length;
    private String name;
    private final FileEntry parent;

    public FileEntry(FileEntry fileEntry, File file) {
        this.lastModified = SerializableFileTime.EPOCH;
        Objects.requireNonNull(file, "file");
        this.file = file;
        this.parent = fileEntry;
        this.name = file.getName();
    }

    public FileEntry[] getChildren() {
        FileEntry[] fileEntryArr = this.children;
        return fileEntryArr != null ? fileEntryArr : EMPTY_FILE_ENTRY_ARRAY;
    }

    public File getFile() {
        return this.file;
    }

    public long getLastModified() {
        return this.lastModified.toMillis();
    }

    public FileTime getLastModifiedFileTime() {
        return this.lastModified.unwrap();
    }

    public long getLength() {
        return this.length;
    }

    public int getLevel() {
        FileEntry fileEntry = this.parent;
        if (fileEntry == null) {
            return 0;
        }
        return fileEntry.getLevel() + 1;
    }

    public String getName() {
        return this.name;
    }

    public FileEntry getParent() {
        return this.parent;
    }

    public boolean isDirectory() {
        return this.directory;
    }

    public boolean isExists() {
        return this.exists;
    }

    public FileEntry newChildInstance(File file) {
        return new FileEntry(this, file);
    }

    public boolean refresh(File file) {
        FileTime lastModifiedTime;
        boolean z = this.exists;
        SerializableFileTime serializableFileTime = this.lastModified;
        boolean z2 = this.directory;
        long j = this.length;
        this.name = file.getName();
        boolean zExists = Files.exists(file.toPath(), new LinkOption[0]);
        this.exists = zExists;
        this.directory = zExists && file.isDirectory();
        try {
            if (this.exists) {
                File[] fileArr = AbstractC9810.f25553;
                lastModifiedTime = Files.getLastModifiedTime(file.toPath(), new LinkOption[0]);
            } else {
                lastModifiedTime = AbstractC9748.f25461;
            }
            setLastModified(lastModifiedTime);
        } catch (IOException unused) {
            setLastModified(SerializableFileTime.EPOCH);
        }
        this.length = (!this.exists || this.directory) ? 0L : file.length();
        return (this.exists == z && this.lastModified.equals(serializableFileTime) && this.directory == z2 && this.length == j) ? false : true;
    }

    public void setChildren(FileEntry... fileEntryArr) {
        this.children = fileEntryArr;
    }

    public void setDirectory(boolean z) {
        this.directory = z;
    }

    public void setExists(boolean z) {
        this.exists = z;
    }

    public void setLastModified(FileTime fileTime) {
        setLastModified(new SerializableFileTime(fileTime));
    }

    public void setLength(long j) {
        this.length = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setLastModified(long j) {
        setLastModified(FileTime.fromMillis(j));
    }

    public void setLastModified(SerializableFileTime serializableFileTime) {
        this.lastModified = serializableFileTime;
    }

    public FileEntry(File file) {
        this(null, file);
    }
}
