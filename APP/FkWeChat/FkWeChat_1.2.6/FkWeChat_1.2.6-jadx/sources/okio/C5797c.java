package okio;

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
import okio.C5799e;
import p024b9.AbstractC1052o0;
import p185m8.AbstractC5067b0;
import p185m8.AbstractC5112w;
import p341x8.AbstractC9466c;
import p376zd.AbstractC10007o;
import p376zd.AbstractC9988e0;
import p376zd.C10009p;
import p376zd.C10023w;
import p376zd.C9980b1;
import p376zd.C9983c1;
import p376zd.C9985d0;
import p376zd.C9987e;
import p376zd.InterfaceC10020u0;
import p376zd.InterfaceC10024w0;

/* JADX INFO: renamed from: okio.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5797c extends C5798d {

    /* JADX INFO: renamed from: q */
    public final FileSystem f18170q;

    public C5797c(FileSystem fileSystem) {
        fileSystem.getClass();
        this.f18170q = fileSystem;
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public InterfaceC10020u0 appendingSink(C5799e c5799e, boolean z10) throws IOException {
        c5799e.getClass();
        List listM20787c = AbstractC5112w.m20787c();
        listM20787c.add(StandardOpenOption.APPEND);
        if (!z10) {
            listM20787c.add(StandardOpenOption.CREATE);
        }
        List listM20785a = AbstractC5112w.m20785a(listM20787c);
        Path pathM23292j = m23292j(c5799e);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM20785a.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM23292j, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        outputStreamNewOutputStream.getClass();
        return AbstractC9988e0.m38650e(outputStreamNewOutputStream);
    }

    @Override // okio.C5798d, okio.C5796b, okio.AbstractC5795a
    public void atomicMove(C5799e c5799e, C5799e c5799e2) throws IOException {
        c5799e.getClass();
        c5799e2.getClass();
        try {
            Files.move(m23292j(c5799e), m23292j(c5799e2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)).getClass();
        } catch (UnsupportedOperationException unused) {
            C10023w.m38841a("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public final List m23291c(C5799e c5799e, boolean z10) throws IOException {
        Path pathM23292j = m23292j(c5799e);
        try {
            List listM36883b = AbstractC9466c.m36883b(pathM23292j, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listM36883b.iterator();
            while (it.hasNext()) {
                arrayList.add(C5799e.a.m23311f(C5799e.f18171r, (Path) it.next(), false, 1, null));
            }
            AbstractC5067b0.m20481C(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z10) {
                return null;
            }
            if (Files.exists(pathM23292j, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                C9980b1.m38629a("failed to list ", c5799e);
                return null;
            }
            C9983c1.m38641a("no such file: ", c5799e);
            return null;
        }
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public C5799e canonicalize(C5799e c5799e) throws IOException {
        c5799e.getClass();
        try {
            C5799e.a aVar = C5799e.f18171r;
            Path realPath = m23292j(c5799e).toRealPath(new LinkOption[0]);
            realPath.getClass();
            return C5799e.a.m23311f(aVar, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            C9983c1.m38641a("no such file: ", c5799e);
            return null;
        }
    }

    @Override // okio.AbstractC5795a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18170q.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @Override // okio.C5796b, okio.AbstractC5795a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createDirectory(okio.C5799e r4, boolean r5) throws java.io.IOException {
        /*
            r3 = this;
            r4.getClass()
            zd.p r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L12
            boolean r0 = r0.m38819e()
            r2 = 1
            if (r0 != r2) goto L12
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L1e
            if (r5 != 0) goto L18
            goto L1e
        L18:
            java.lang.String r5 = " already exists."
            p376zd.C9982c0.m38640a(r4, r5)
            return
        L1e:
            java.nio.file.Path r5 = r3.m23292j(r4)     // Catch: java.io.IOException -> L32
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L32
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L32
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L32
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch: java.io.IOException -> L32
            r5.getClass()     // Catch: java.io.IOException -> L32
            return
        L32:
            r5 = move-exception
            if (r2 == 0) goto L36
            return
        L36:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to create directory: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C5797c.createDirectory(okio.e, boolean):void");
    }

    @Override // okio.C5798d, okio.C5796b, okio.AbstractC5795a
    public void createSymlink(C5799e c5799e, C5799e c5799e2) {
        c5799e.getClass();
        c5799e2.getClass();
        Files.createSymbolicLink(m23292j(c5799e), m23292j(c5799e2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public void delete(C5799e c5799e, boolean z10) throws IOException {
        c5799e.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathM23292j = m23292j(c5799e);
        try {
            Files.delete(pathM23292j);
        } catch (NoSuchFileException unused) {
            if (z10) {
                C9983c1.m38641a("no such file: ", c5799e);
            }
        } catch (IOException unused2) {
            if (Files.exists(pathM23292j, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                C9980b1.m38629a("failed to delete ", c5799e);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final Path m23292j(C5799e c5799e) {
        Path path = this.f18170q.getPath(c5799e.toString(), new String[0]);
        path.getClass();
        return path;
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public List list(C5799e c5799e) throws IOException {
        c5799e.getClass();
        List listM23291c = m23291c(c5799e, true);
        listM23291c.getClass();
        return listM23291c;
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public List listOrNull(C5799e c5799e) {
        c5799e.getClass();
        return m23291c(c5799e, false);
    }

    @Override // okio.C5798d, okio.C5796b, okio.AbstractC5795a
    public C10009p metadataOrNull(C5799e c5799e) {
        c5799e.getClass();
        return m23293f(m23292j(c5799e));
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public AbstractC10007o openReadOnly(C5799e c5799e) throws IOException {
        c5799e.getClass();
        try {
            FileChannel fileChannelOpen = FileChannel.open(m23292j(c5799e), StandardOpenOption.READ);
            fileChannelOpen.getClass();
            return new C9985d0(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            C9983c1.m38641a("no such file: ", c5799e);
            return null;
        }
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public AbstractC10007o openReadWrite(C5799e c5799e, boolean z10, boolean z11) throws IOException {
        c5799e.getClass();
        if (z10 && z11) {
            C9987e.m38645a("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        List listM20787c = AbstractC5112w.m20787c();
        listM20787c.add(StandardOpenOption.READ);
        listM20787c.add(StandardOpenOption.WRITE);
        if (z10) {
            listM20787c.add(StandardOpenOption.CREATE_NEW);
        } else if (!z11) {
            listM20787c.add(StandardOpenOption.CREATE);
        }
        List listM20785a = AbstractC5112w.m20785a(listM20787c);
        try {
            Path pathM23292j = m23292j(c5799e);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM20785a.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathM23292j, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            fileChannelOpen.getClass();
            return new C9985d0(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            C9983c1.m38641a("no such file: ", c5799e);
            return null;
        }
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public InterfaceC10020u0 sink(C5799e c5799e, boolean z10) throws IOException {
        c5799e.getClass();
        List listM20787c = AbstractC5112w.m20787c();
        if (z10) {
            listM20787c.add(StandardOpenOption.CREATE_NEW);
        }
        List listM20785a = AbstractC5112w.m20785a(listM20787c);
        try {
            Path pathM23292j = m23292j(c5799e);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM20785a.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM23292j, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            outputStreamNewOutputStream.getClass();
            return AbstractC9988e0.m38650e(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            C9983c1.m38641a("no such file: ", c5799e);
            return null;
        }
    }

    @Override // okio.C5796b, okio.AbstractC5795a
    public InterfaceC10024w0 source(C5799e c5799e) throws IOException {
        c5799e.getClass();
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(m23292j(c5799e), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            inputStreamNewInputStream.getClass();
            return AbstractC9988e0.m38654i(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            C9983c1.m38641a("no such file: ", c5799e);
            return null;
        }
    }

    @Override // okio.C5798d, okio.C5796b
    public String toString() {
        String strMo3794w = AbstractC1052o0.m3807b(this.f18170q.getClass()).mo3794w();
        strMo3794w.getClass();
        return strMo3794w;
    }
}
