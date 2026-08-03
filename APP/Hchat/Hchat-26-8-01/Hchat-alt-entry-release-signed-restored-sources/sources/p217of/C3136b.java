package p217of;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nf.C3001c;
import nf.InterfaceC3000b;
import p014b.C0126e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p262rf.InterfaceC3802b;
import pf.C3413b;

/* JADX INFO: renamed from: of.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3136b implements InterfaceC3000b {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC2844b f10172k = AbstractC2846d.m6274b(C3136b.class);

    /* JADX INFO: renamed from: g */
    public final File f10173g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3802b f10174h;

    /* JADX INFO: renamed from: i */
    public final boolean f10175i;

    /* JADX INFO: renamed from: j */
    public ZipFile f10176j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3136b(File file, C0126e c0126e) {
        this.f10173g = file;
        InterfaceC3802b interfaceC3802b = (InterfaceC3802b) c0126e.f332h;
        this.f10174h = interfaceC3802b;
        this.f10175i = interfaceC3802b.mo440d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final BufferedInputStream m6673a(C3135a c3135a) {
        ZipFile zipFile = this.f10176j;
        ZipEntry zipEntry = c3135a.f10171b;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        if (this.f10175i) {
            inputStream = new C3413b(inputStream, zipEntry.getSize());
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ZipFile zipFile = this.f10176j;
            if (zipFile != null) {
                zipFile.close();
            }
        } finally {
            this.f10176j = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC3000b
    /* JADX INFO: renamed from: d */
    public final C3001c mo6401d() {
        this.f10176j = new ZipFile(this.f10173g);
        InterfaceC3802b interfaceC3802b = this.f10174h;
        int iMo438b = interfaceC3802b.mo438b();
        if (iMo438b == -1) {
            iMo438b = Integer.MAX_VALUE;
        }
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> enumerationEntries = this.f10176j.entries();
        while (enumerationEntries.hasMoreElements()) {
            C3135a c3135a = new C3135a(this, enumerationEntries.nextElement());
            boolean zMo437a = interfaceC3802b.mo437a(c3135a);
            if (!zMo437a) {
                f10172k.mo6254h(c3135a, "Zip entry '{}' is invalid and excluded from processing");
            }
            if (zMo437a) {
                arrayList.add(c3135a);
                if (arrayList.size() > iMo438b) {
                    C2104o.m5276A(AbstractC0921a.m2249l(arrayList.size(), "Max entries count limit exceeded: "));
                    return null;
                }
            }
        }
        return new C3001c(this, arrayList);
    }
}
