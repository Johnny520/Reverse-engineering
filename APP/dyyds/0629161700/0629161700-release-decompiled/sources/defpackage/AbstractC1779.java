package defpackage;

/* JADX INFO: renamed from: ᲀᲈᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1779 {
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static long m3178(java.io.FileDescriptor r0, long r1, int r3) {
            long r0 = android.system.Os.lseek(r0, r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3179(java.io.FileDescriptor r0) {
            android.system.Os.close(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.io.FileDescriptor m3180(java.io.FileDescriptor r0) {
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)
            return r0
    }
}
