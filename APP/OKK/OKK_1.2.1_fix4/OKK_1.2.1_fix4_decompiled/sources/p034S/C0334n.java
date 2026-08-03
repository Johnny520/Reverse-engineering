package p034S;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: S.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0334n {

    /* JADX INFO: renamed from: a */
    public final int f646a;

    /* JADX INFO: renamed from: b */
    public final int f647b;

    /* JADX INFO: renamed from: c */
    public final long f648c;

    /* JADX INFO: renamed from: d */
    public final long f649d;

    public C0334n(int i2, int i3, long j2, long j3) {
        this.f646a = i2;
        this.f647b = i3;
        this.f648c = j2;
        this.f649d = j3;
    }

    /* JADX INFO: renamed from: a */
    public static C0334n m752a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0334n c0334n = new C0334n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0334n;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m753b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f646a);
            dataOutputStream.writeInt(this.f647b);
            dataOutputStream.writeLong(this.f648c);
            dataOutputStream.writeLong(this.f649d);
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
        if (obj == null || !(obj instanceof C0334n)) {
            return false;
        }
        C0334n c0334n = (C0334n) obj;
        return this.f647b == c0334n.f647b && this.f648c == c0334n.f648c && this.f646a == c0334n.f646a && this.f649d == c0334n.f649d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f647b), Long.valueOf(this.f648c), Integer.valueOf(this.f646a), Long.valueOf(this.f649d));
    }
}
