package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: Cu */
/* JADX INFO: loaded from: classes.dex */
public final class C0123Cu {

    /* JADX INFO: renamed from: a */
    public final int f291a;

    /* JADX INFO: renamed from: b */
    public final int f292b;

    /* JADX INFO: renamed from: c */
    public final long f293c;

    /* JADX INFO: renamed from: d */
    public final long f294d;

    public C0123Cu(int i, int i2, long j, long j2) {
        this.f291a = i;
        this.f292b = i2;
        this.f293c = j;
        this.f294d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C0123Cu m199a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0123Cu c0123Cu = new C0123Cu(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0123Cu;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m200b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f291a);
            dataOutputStream.writeInt(this.f292b);
            dataOutputStream.writeLong(this.f293c);
            dataOutputStream.writeLong(this.f294d);
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
        if (obj != null && (obj instanceof C0123Cu)) {
            C0123Cu c0123Cu = (C0123Cu) obj;
            if (this.f292b == c0123Cu.f292b && this.f293c == c0123Cu.f293c && this.f291a == c0123Cu.f291a && this.f294d == c0123Cu.f294d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f292b), Long.valueOf(this.f293c), Integer.valueOf(this.f291a), Long.valueOf(this.f294d));
    }
}
