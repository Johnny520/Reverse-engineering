package p217of;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import nf.InterfaceC2999a;
import p012ah.C0086a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: of.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3135a implements InterfaceC2999a {

    /* JADX INFO: renamed from: a */
    public final C3136b f10170a;

    /* JADX INFO: renamed from: b */
    public final ZipEntry f10171b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3135a(C3136b c3136b, ZipEntry zipEntry) {
        this.f10170a = c3136b;
        this.f10171b = zipEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: a */
    public final boolean mo6397a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: b */
    public final InputStream mo6398b() {
        try {
            return this.f10170a.m6673a(this);
        } catch (Exception e6) {
            C0086a.m457p(AbstractC4855en.m9263g("Failed to open input stream for entry: ", this.f10171b.getName()), e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: c */
    public final long mo6399c() {
        return this.f10171b.getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: d */
    public final long mo6400d() {
        return this.f10171b.getCompressedSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    public final byte[] getBytes() {
        try {
            BufferedInputStream bufferedInputStreamM6673a = this.f10170a.m6673a(this);
            try {
                byte[] allBytes = bufferedInputStreamM6673a.readAllBytes();
                bufferedInputStreamM6673a.close();
                return allBytes;
            } finally {
            }
        } catch (Exception e6) {
            C0086a.m457p(AbstractC4855en.m9263g("Failed to read bytes for entry: ", this.f10171b.getName()), e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    public final String getName() {
        return this.f10171b.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    public final boolean isDirectory() {
        return this.f10171b.isDirectory();
    }
}
