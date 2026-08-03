package p001;

import java.io.File;

/* JADX INFO: renamed from: ۟.d9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0186d9 implements InterfaceC0160bb, InterfaceC0262j1 {

    /* JADX INFO: renamed from: ۥ */
    public C0206f1 f757;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f758;

    @Override // p001.InterfaceC0160bb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // p001.InterfaceC0160bb
    public final String getDatabaseName() {
        throw null;
    }

    @Override // p001.InterfaceC0160bb
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }

    @Override // p001.InterfaceC0262j1
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC0160bb mo1048() {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final void m1049(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    @Override // p001.InterfaceC0160bb
    /* JADX INFO: renamed from: ۥ۠ۡ */
    public final synchronized InterfaceC0146ab mo1024() {
        if (!this.f758) {
            m1050(true);
            this.f758 = true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m1050(boolean z) {
        getDatabaseName();
        throw null;
    }
}
