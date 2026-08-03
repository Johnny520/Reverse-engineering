package Yue;

import Yue.C6618;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n1620#2,3:193\n1#3:196\n37#4,2:197\n37#4,2:199\n37#4,2:201\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:193,3\n104#1:197,2\n125#1:199,2\n138#1:201,2\n*E\n"})
public final class C6373 extends C6374 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final FileSystem f16143;

    public C6373(@InterfaceC6399 FileSystem fileSystem) {
        C5499.m17103(fileSystem, "nioFileSystem");
        this.f16143 = fileSystem;
    }

    @Override // Yue.C6374, Yue.C5581
    @InterfaceC6399
    public String toString() {
        String simpleName = C7071.m21996(this.f16143.getClass()).getSimpleName();
        C5499.m17100(simpleName);
        return simpleName;
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC7472 mo14638(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        List listM10713 = C3879.m10713();
        listM10713.add(StandardOpenOption.APPEND);
        if (!z) {
            listM10713.add(StandardOpenOption.CREATE);
        }
        List listM917 = C3879.m917(listM10713);
        Path pathM19895 = m19895(c6618);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM917.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM19895, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return C6542.m20842(outputStreamNewOutputStream);
    }

    @Override // Yue.C6374, Yue.C5581, Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14639(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        try {
            C5499.m17102(Files.move(m19895(c6618), m19895(c66182), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(this, target, *options)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public C6618 mo14640(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        try {
            C6618.C1032 c1032 = C6618.f16986;
            Path realPath = m19895(c6618).toRealPath(new LinkOption[0]);
            C5499.m17102(realPath, "toRealPath(...)");
            return C6618.C1032.m21048(c1032, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c6618);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // Yue.C5581, Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo14645(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        boolean z2;
        C5499.m17103(c6618, "dir");
        C4811 c4811Mo14657 = mo14657(c6618);
        if (c4811Mo14657 != null) {
            z2 = c4811Mo14657.m14597();
        }
        if (z2 && z) {
            throw new IOException(c6618 + " already exists.");
        }
        try {
            C5499.m17102(Files.createDirectory(m19895(c6618), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createDirectory(this, *attributes)");
        } catch (IOException e) {
            if (z2) {
                return;
            }
            throw new IOException("failed to create directory: " + c6618, e);
        }
    }

    @Override // Yue.C6374, Yue.C5581, Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14646(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        C5499.m17102(Files.createSymbolicLink(m19895(c6618), m19895(c66182), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(this, target, *attributes)");
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo14648(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathM19895 = m19895(c6618);
        try {
            Files.delete(pathM19895);
        } catch (NoSuchFileException unused) {
            if (z) {
                throw new FileNotFoundException("no such file: " + c6618);
            }
        } catch (IOException unused2) {
            if (Files.exists(pathM19895, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to delete " + c6618);
            }
        }
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public List<C6618> mo14652(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "dir");
        List<C6618> listM19894 = m19894(c6618, true);
        C5499.m17100(listM19894);
        return listM19894;
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public List<C6618> mo14653(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "dir");
        return m19894(c6618, false);
    }

    @Override // Yue.C6374, Yue.C5581, Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public C4811 mo14657(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "path");
        return m19896(m19895(c6618));
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public AbstractC4809 mo14658(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "file");
        try {
            FileChannel fileChannelOpen = FileChannel.open(m19895(c6618), StandardOpenOption.READ);
            C5499.m17100(fileChannelOpen);
            return new C6372(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c6618);
        }
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC4809 mo14660(@InterfaceC6399 C6618 c6618, boolean z, boolean z2) throws IOException {
        C5499.m17103(c6618, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        List listM10713 = C3879.m10713();
        listM10713.add(StandardOpenOption.READ);
        listM10713.add(StandardOpenOption.WRITE);
        if (z) {
            listM10713.add(StandardOpenOption.CREATE_NEW);
        } else if (!z2) {
            listM10713.add(StandardOpenOption.CREATE);
        }
        List listM917 = C3879.m917(listM10713);
        try {
            Path pathM19895 = m19895(c6618);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM917.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathM19895, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            C5499.m17100(fileChannelOpen);
            return new C6372(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c6618);
        }
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public InterfaceC7472 mo14662(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        List listM10713 = C3879.m10713();
        if (z) {
            listM10713.add(StandardOpenOption.CREATE_NEW);
        }
        List listM917 = C3879.m917(listM10713);
        try {
            Path pathM19895 = m19895(c6618);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM917.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM19895, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            C5499.m17102(outputStreamNewOutputStream, "newOutputStream(this, *options)");
            return C6542.m20842(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c6618);
        }
    }

    @Override // Yue.C5581, Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public InterfaceC7506 mo14663(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "file");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(m19895(c6618), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            C5499.m17102(inputStreamNewInputStream, "newInputStream(this, *options)");
            return C6542.m20847(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c6618);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final List<C6618> m19894(C6618 c6618, boolean z) throws IOException {
        Path pathM19895 = m19895(c6618);
        try {
            List listM21222 = C6642.m21222(pathM19895, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listM21222.iterator();
            while (it.hasNext()) {
                arrayList.add(C6618.C1032.m21048(C6618.f16986, (Path) it.next(), false, 1, null));
            }
            C3884.m10767(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (Files.exists(pathM19895, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to list " + c6618);
            }
            throw new FileNotFoundException("no such file: " + c6618);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final Path m19895(C6618 c6618) {
        Path path = this.f16143.getPath(c6618.toString(), new String[0]);
        C5499.m17102(path, "getPath(...)");
        return path;
    }
}
