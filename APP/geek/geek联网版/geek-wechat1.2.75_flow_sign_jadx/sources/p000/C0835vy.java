package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: vy */
/* JADX INFO: loaded from: classes.dex */
public final class C0835vy {

    /* JADX INFO: renamed from: a */
    public final int f5013a;

    /* JADX INFO: renamed from: b */
    public final int f5014b;

    /* JADX INFO: renamed from: c */
    public final long f5015c;

    /* JADX INFO: renamed from: d */
    public final long f5016d;

    public C0835vy(int i, int i2, long j, long j2) {
        this.f5013a = i;
        this.f5014b = i2;
        this.f5015c = j;
        this.f5016d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C0835vy m2581a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0835vy c0835vy = new C0835vy(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0835vy;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2582b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f5013a);
            dataOutputStream.writeInt(this.f5014b);
            dataOutputStream.writeLong(this.f5015c);
            dataOutputStream.writeLong(this.f5016d);
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
        if (obj != null && (obj instanceof C0835vy)) {
            C0835vy c0835vy = (C0835vy) obj;
            if (this.f5014b == c0835vy.f5014b && this.f5015c == c0835vy.f5015c && this.f5013a == c0835vy.f5013a && this.f5016d == c0835vy.f5016d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5014b), Long.valueOf(this.f5015c), Integer.valueOf(this.f5013a), Long.valueOf(this.f5016d));
    }
}
