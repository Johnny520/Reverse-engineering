package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import okio.C5799e;
import p185m8.AbstractC5067b0;
import p376zd.AbstractC10007o;
import p376zd.AbstractC9988e0;
import p376zd.AbstractC9990f0;
import p376zd.C10009p;
import p376zd.C9979b0;
import p376zd.C9980b1;
import p376zd.C9982c0;
import p376zd.C9983c1;
import p376zd.C9987e;
import p376zd.InterfaceC10020u0;
import p376zd.InterfaceC10024w0;

/* JADX INFO: renamed from: okio.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5796b extends AbstractC5795a {
    /* JADX INFO: renamed from: c */
    private final List m23288c(C5799e c5799e, boolean z10) throws IOException {
        File file = c5799e.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z10) {
                return null;
            }
            if (file.exists()) {
                C9980b1.m38629a("failed to list ", c5799e);
                return null;
            }
            C9983c1.m38641a("no such file: ", c5799e);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(c5799e.m23304m(str));
        }
        AbstractC5067b0.m20481C(arrayList);
        return arrayList;
    }

    @Override // okio.AbstractC5795a
    public InterfaceC10020u0 appendingSink(C5799e c5799e, boolean z10) throws IOException {
        c5799e.getClass();
        if (z10) {
            m23290e(c5799e);
        }
        return AbstractC9988e0.m38649d(c5799e.toFile(), true);
    }

    @Override // okio.AbstractC5795a
    public void atomicMove(C5799e c5799e, C5799e c5799e2) throws IOException {
        c5799e.getClass();
        c5799e2.getClass();
        if (c5799e.toFile().renameTo(c5799e2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + c5799e + " to " + c5799e2);
    }

    @Override // okio.AbstractC5795a
    public C5799e canonicalize(C5799e c5799e) throws IOException {
        c5799e.getClass();
        File canonicalFile = c5799e.toFile().getCanonicalFile();
        if (canonicalFile.exists()) {
            return C5799e.a.m23309d(C5799e.f18171r, canonicalFile, false, 1, null);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // okio.AbstractC5795a
    public void createDirectory(C5799e c5799e, boolean z10) throws IOException {
        c5799e.getClass();
        if (c5799e.toFile().mkdir()) {
            return;
        }
        C10009p c10009pMetadataOrNull = metadataOrNull(c5799e);
        if (c10009pMetadataOrNull == null || !c10009pMetadataOrNull.m38819e()) {
            C9980b1.m38629a("failed to create directory: ", c5799e);
        } else if (z10) {
            C9982c0.m38640a(c5799e, " already exists.");
        }
    }

    @Override // okio.AbstractC5795a
    public void createSymlink(C5799e c5799e, C5799e c5799e2) throws IOException {
        c5799e.getClass();
        c5799e2.getClass();
        throw new IOException("unsupported");
    }

    /* JADX INFO: renamed from: d */
    public final void m23289d(C5799e c5799e) throws IOException {
        if (exists(c5799e)) {
            C9982c0.m38640a(c5799e, " already exists.");
        }
    }

    @Override // okio.AbstractC5795a
    public void delete(C5799e c5799e, boolean z10) throws IOException {
        c5799e.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = c5799e.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            C9980b1.m38629a("failed to delete ", c5799e);
        } else if (z10) {
            C9983c1.m38641a("no such file: ", c5799e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m23290e(C5799e c5799e) throws IOException {
        if (exists(c5799e)) {
            return;
        }
        C9982c0.m38640a(c5799e, " doesn't exist.");
    }

    @Override // okio.AbstractC5795a
    public List list(C5799e c5799e) throws IOException {
        c5799e.getClass();
        List listM23288c = m23288c(c5799e, true);
        listM23288c.getClass();
        return listM23288c;
    }

    @Override // okio.AbstractC5795a
    public List listOrNull(C5799e c5799e) {
        c5799e.getClass();
        return m23288c(c5799e, false);
    }

    @Override // okio.AbstractC5795a
    public C10009p metadataOrNull(C5799e c5799e) {
        c5799e.getClass();
        File file = c5799e.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C10009p(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.AbstractC5795a
    public AbstractC10007o openReadOnly(C5799e c5799e) {
        c5799e.getClass();
        return new C9979b0(false, new RandomAccessFile(c5799e.toFile(), "r"));
    }

    @Override // okio.AbstractC5795a
    public AbstractC10007o openReadWrite(C5799e c5799e, boolean z10, boolean z11) throws IOException {
        c5799e.getClass();
        if (z10 && z11) {
            C9987e.m38645a("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        if (z10) {
            m23289d(c5799e);
        }
        if (z11) {
            m23290e(c5799e);
        }
        return new C9979b0(true, new RandomAccessFile(c5799e.toFile(), "rw"));
    }

    @Override // okio.AbstractC5795a
    public InterfaceC10020u0 sink(C5799e c5799e, boolean z10) throws IOException {
        c5799e.getClass();
        if (z10) {
            m23289d(c5799e);
        }
        return AbstractC9990f0.m38658c(c5799e.toFile(), false, 1, null);
    }

    @Override // okio.AbstractC5795a
    public InterfaceC10024w0 source(C5799e c5799e) {
        c5799e.getClass();
        return AbstractC9988e0.m38653h(c5799e.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
