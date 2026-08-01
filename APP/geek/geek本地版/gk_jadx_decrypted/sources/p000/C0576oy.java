package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: oy */
/* JADX INFO: loaded from: classes.dex */
public final class C0576oy {

    /* JADX INFO: renamed from: a */
    public final int f3617a;

    /* JADX INFO: renamed from: b */
    public final int f3618b;

    /* JADX INFO: renamed from: c */
    public final long f3619c;

    /* JADX INFO: renamed from: d */
    public final long f3620d;

    public C0576oy(int i, int i2, long j, long j2) {
        this.f3617a = i;
        this.f3618b = i2;
        this.f3619c = j;
        this.f3620d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C0576oy m2028a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0576oy c0576oy = new C0576oy(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0576oy;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2029b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3617a);
            dataOutputStream.writeInt(this.f3618b);
            dataOutputStream.writeLong(this.f3619c);
            dataOutputStream.writeLong(this.f3620d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0576oy)) {
            C0576oy c0576oy = (C0576oy) obj;
            if (this.f3618b == c0576oy.f3618b && this.f3619c == c0576oy.f3619c && this.f3617a == c0576oy.f3617a && this.f3620d == c0576oy.f3620d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3618b), Long.valueOf(this.f3619c), Integer.valueOf(this.f3617a), Long.valueOf(this.f3620d));
    }
}
