package p000;

import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: Hg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0324Hg {
    /* JADX INFO: renamed from: a */
    public static void m685a(FileDescriptor r0) {
        Os.close(r0);
    }

    /* JADX INFO: renamed from: b */
    public static FileDescriptor m686b(FileDescriptor r0) {
        return Os.dup(r0);
    }

    /* JADX INFO: renamed from: c */
    public static long m687c(FileDescriptor r0, long r1, int r3) {
        return Os.lseek(r0, r1, r3);
    }
}
