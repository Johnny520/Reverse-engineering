package org.apache.commons.p014io.monitor;

import bsh.classpath.C3435;
import bsh.classpath.C3436;
import com.alibaba.fastjson2.util.C3678;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
import org.apache.commons.p014io.IOCase;
import org.apache.commons.p014io.comparator.C6457;
import org.apache.commons.p014io.comparator.NameFileComparator;
import org.apache.commons.p014io.filefilter.TrueFileFilter;
import p392.AbstractC9810;
import p393.C9820;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FileAlterationObserver implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final Comparator<File> comparator;
    private final transient FileFilter fileFilter;
    private final transient List<InterfaceC6463> listeners;
    private final FileEntry rootEntry;

    private FileAlterationObserver(C6459 c6459) {
        c6459.getClass();
        C9820 c9820 = c6459.f25563;
        if (c9820 == null) {
            throw new IllegalStateException("origin == null");
        }
        String simpleName = C9820.class.getSimpleName();
        InputStream inputStream = c9820.f25564;
        throw new UnsupportedOperationException(String.format("%s#getFile() for %s origin %s", simpleName, inputStream.getClass().getSimpleName(), inputStream));
    }

    public static C6459 builder() {
        return new C6459();
    }

    private void checkAndFire(FileEntry fileEntry, FileEntry[] fileEntryArr, File[] fileArr) {
        FileEntry[] fileEntryArr2 = fileArr.length > 0 ? new FileEntry[fileArr.length] : FileEntry.EMPTY_FILE_ENTRY_ARRAY;
        int i = 0;
        for (FileEntry fileEntry2 : fileEntryArr) {
            while (i < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i]) > 0) {
                FileEntry fileEntryLambda$listFileEntries$5 = lambda$listFileEntries$5(fileEntry, fileArr[i]);
                fileEntryArr2[i] = fileEntryLambda$listFileEntries$5;
                fireOnCreate(fileEntryLambda$listFileEntries$5);
                i++;
            }
            if (i >= fileArr.length || this.comparator.compare(fileEntry2.getFile(), fileArr[i]) != 0) {
                checkAndFire(fileEntry2, fileEntry2.getChildren(), AbstractC9810.f25553);
                fireOnDelete(fileEntry2);
            } else {
                fireOnChange(fileEntry2, fileArr[i]);
                checkAndFire(fileEntry2, fileEntry2.getChildren(), listFiles(fileArr[i]));
                fileEntryArr2[i] = fileEntry2;
                i++;
            }
        }
        while (i < fileArr.length) {
            FileEntry fileEntryLambda$listFileEntries$52 = lambda$listFileEntries$5(fileEntry, fileArr[i]);
            fileEntryArr2[i] = fileEntryLambda$listFileEntries$52;
            fireOnCreate(fileEntryLambda$listFileEntries$52);
            i++;
        }
        fileEntry.setChildren(fileEntryArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createFileEntry, reason: merged with bridge method [inline-methods] */
    public FileEntry lambda$listFileEntries$5(FileEntry fileEntry, File file) {
        FileEntry fileEntryNewChildInstance = fileEntry.newChildInstance(file);
        fileEntryNewChildInstance.refresh(file);
        fileEntryNewChildInstance.setChildren(listFileEntries(file, fileEntryNewChildInstance));
        return fileEntryNewChildInstance;
    }

    private void fireOnChange(FileEntry fileEntry, File file) {
        if (fileEntry.refresh(file)) {
            this.listeners.forEach(new C3678(fileEntry, 5, file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireOnCreate(FileEntry fileEntry) {
        this.listeners.forEach(new C6462(fileEntry, 0));
        Stream.of((Object[]) fileEntry.getChildren()).forEach(new C6461(this, 0));
    }

    private void fireOnDelete(FileEntry fileEntry) {
        this.listeners.forEach(new C6462(fileEntry, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAndNotify$0(InterfaceC6463 interfaceC6463) {
        interfaceC6463.m11578();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAndNotify$1(InterfaceC6463 interfaceC6463) {
        interfaceC6463.m11579();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fireOnChange$2(FileEntry fileEntry, File file, InterfaceC6463 interfaceC6463) {
        if (fileEntry.isDirectory()) {
            interfaceC6463.m11577();
        } else {
            interfaceC6463.m11580();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fireOnCreate$3(FileEntry fileEntry, InterfaceC6463 interfaceC6463) {
        if (fileEntry.isDirectory()) {
            fileEntry.getFile();
            interfaceC6463.m11581();
        } else {
            fileEntry.getFile();
            interfaceC6463.m11582();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fireOnDelete$4(FileEntry fileEntry, InterfaceC6463 interfaceC6463) {
        if (fileEntry.isDirectory()) {
            fileEntry.getFile();
            interfaceC6463.m11576();
        } else {
            fileEntry.getFile();
            interfaceC6463.m11575();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FileEntry[] lambda$listFileEntries$6(int i) {
        return new FileEntry[i];
    }

    private FileEntry[] listFileEntries(File file, FileEntry fileEntry) {
        return (FileEntry[]) Stream.of((Object[]) listFiles(file)).map(new C6457(this, fileEntry, 1)).toArray(new C3435(4));
    }

    private File[] listFiles(File file) {
        return file.isDirectory() ? sort(file.listFiles(this.fileFilter)) : AbstractC9810.f25553;
    }

    private File[] sort(File[] fileArr) {
        if (fileArr == null) {
            return AbstractC9810.f25553;
        }
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, this.comparator);
        }
        return fileArr;
    }

    private static Comparator<File> toComparator(IOCase iOCase) {
        int i = AbstractC6460.f15857[IOCase.value(iOCase, IOCase.SYSTEM).ordinal()];
        return i != 1 ? i != 2 ? NameFileComparator.NAME_COMPARATOR : NameFileComparator.NAME_INSENSITIVE_COMPARATOR : NameFileComparator.NAME_SYSTEM_COMPARATOR;
    }

    public void addListener(InterfaceC6463 interfaceC6463) {
        if (interfaceC6463 != null) {
            this.listeners.add(interfaceC6463);
        }
    }

    public void checkAndNotify() {
        this.listeners.forEach(new C6461(this, 1));
        File file = this.rootEntry.getFile();
        boolean zExists = file.exists();
        FileEntry fileEntry = this.rootEntry;
        if (zExists) {
            checkAndFire(fileEntry, fileEntry.getChildren(), listFiles(file));
        } else if (fileEntry.isExists()) {
            FileEntry fileEntry2 = this.rootEntry;
            checkAndFire(fileEntry2, fileEntry2.getChildren(), AbstractC9810.f25553);
        }
        this.listeners.forEach(new C6461(this, 2));
    }

    public Comparator<File> getComparator() {
        return this.comparator;
    }

    public File getDirectory() {
        return this.rootEntry.getFile();
    }

    public FileFilter getFileFilter() {
        return this.fileFilter;
    }

    public Iterable<InterfaceC6463> getListeners() {
        return new ArrayList(this.listeners);
    }

    public void initialize() {
        FileEntry fileEntry = this.rootEntry;
        fileEntry.refresh(fileEntry.getFile());
        FileEntry fileEntry2 = this.rootEntry;
        fileEntry2.setChildren(listFileEntries(fileEntry2.getFile(), this.rootEntry));
    }

    public void removeListener(InterfaceC6463 interfaceC6463) {
        if (interfaceC6463 != null) {
            this.listeners.removeIf(new C3436(3));
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "[file='" + getDirectory().getPath() + "', " + this.fileFilter.toString() + ", listeners=" + this.listeners.size() + "]";
    }

    public void destroy() {
    }

    public /* synthetic */ FileAlterationObserver(C6459 c6459, AbstractC6460 abstractC6460) {
        this(c6459);
    }

    @Deprecated
    public FileAlterationObserver(File file) {
        this(file, (FileFilter) null);
    }

    @Deprecated
    public FileAlterationObserver(File file, FileFilter fileFilter) {
        this(file, fileFilter, (IOCase) null);
    }

    @Deprecated
    public FileAlterationObserver(File file, FileFilter fileFilter, IOCase iOCase) {
        this(new FileEntry(file), fileFilter, iOCase);
    }

    private FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, Comparator<File> comparator) {
        this.listeners = new CopyOnWriteArrayList();
        Objects.requireNonNull(fileEntry, "rootEntry");
        Objects.requireNonNull(fileEntry.getFile(), "rootEntry.getFile()");
        this.rootEntry = fileEntry;
        this.fileFilter = fileFilter == null ? TrueFileFilter.INSTANCE : fileFilter;
        Objects.requireNonNull(comparator, "comparator");
        this.comparator = comparator;
    }

    public FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, IOCase iOCase) {
        this(fileEntry, fileFilter, toComparator(iOCase));
    }

    @Deprecated
    public FileAlterationObserver(String str) {
        this(new File(str));
    }

    @Deprecated
    public FileAlterationObserver(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter);
    }

    @Deprecated
    public FileAlterationObserver(String str, FileFilter fileFilter, IOCase iOCase) {
        this(new File(str), fileFilter, iOCase);
    }
}
