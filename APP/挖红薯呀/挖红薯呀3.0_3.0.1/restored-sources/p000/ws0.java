package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ws0 {

    /* JADX INFO: renamed from: a */
    public final int f7183a;

    /* JADX INFO: renamed from: b */
    public final int f7184b;

    /* JADX INFO: renamed from: c */
    public final long f7185c;

    /* JADX INFO: renamed from: d */
    public final long f7186d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ws0(int i, int i2, long j, long j2) {
        this.f7183a = i;
        this.f7184b = i2;
        this.f7185c = j;
        this.f7186d = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public static ws0 m5026a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            ws0 ws0Var = new ws0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return ws0Var;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5027b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f7183a);
            dataOutputStream.writeInt(this.f7184b);
            dataOutputStream.writeLong(this.f7185c);
            dataOutputStream.writeLong(this.f7186d);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ws0)) {
            ws0 ws0Var = (ws0) obj;
            if (this.f7184b == ws0Var.f7184b && this.f7185c == ws0Var.f7185c && this.f7183a == ws0Var.f7183a && this.f7186d == ws0Var.f7186d) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7184b), Long.valueOf(this.f7185c), Integer.valueOf(this.f7183a), Long.valueOf(this.f7186d));
    }
}
