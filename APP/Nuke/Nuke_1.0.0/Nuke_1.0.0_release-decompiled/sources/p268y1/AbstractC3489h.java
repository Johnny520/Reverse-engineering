package p268y1;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: y1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3489h {
    /* JADX INFO: renamed from: a */
    public static void m5745a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static FileDescriptor m5746b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static long m5747c(FileDescriptor fileDescriptor, long j5, int i5) {
        return Os.lseek(fileDescriptor, j5, i5);
    }
}
