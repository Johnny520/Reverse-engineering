package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q32 {

    /* JADX INFO: renamed from: a */
    public final int f8717a;

    /* JADX INFO: renamed from: b */
    public final int f8718b;

    /* JADX INFO: renamed from: c */
    public final long f8719c;

    /* JADX INFO: renamed from: d */
    public final long f8720d;

    public q32(int i, int i2, long j, long j2) {
        this.f8717a = i;
        this.f8718b = i2;
        this.f8719c = j;
        this.f8720d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static q32 m4051a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            q32 q32Var = new q32(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return q32Var;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4052b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f8717a);
            dataOutputStream.writeInt(this.f8718b);
            dataOutputStream.writeLong(this.f8719c);
            dataOutputStream.writeLong(this.f8720d);
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
        if (obj != null && (obj instanceof q32)) {
            q32 q32Var = (q32) obj;
            if (this.f8718b == q32Var.f8718b && this.f8719c == q32Var.f8719c && this.f8717a == q32Var.f8717a && this.f8720d == q32Var.f8720d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8718b), Long.valueOf(this.f8719c), Integer.valueOf(this.f8717a), Long.valueOf(this.f8720d));
    }
}
