package p022L;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: L.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0183m {

    /* JADX INFO: renamed from: a */
    public final int f527a;

    /* JADX INFO: renamed from: b */
    public final int f528b;

    /* JADX INFO: renamed from: c */
    public final long f529c;

    /* JADX INFO: renamed from: d */
    public final long f530d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0183m(int i2, int i3, long j2, long j3) {
        this.f527a = i2;
        this.f528b = i3;
        this.f529c = j2;
        this.f530d = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public static C0183m m386a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0183m c0183m = new C0183m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0183m;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m387b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f527a);
            dataOutputStream.writeInt(this.f528b);
            dataOutputStream.writeLong(this.f529c);
            dataOutputStream.writeLong(this.f530d);
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
        if (obj != null && (obj instanceof C0183m)) {
            C0183m c0183m = (C0183m) obj;
            if (this.f528b == c0183m.f528b && this.f529c == c0183m.f529c && this.f527a == c0183m.f527a && this.f530d == c0183m.f530d) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f528b), Long.valueOf(this.f529c), Integer.valueOf(this.f527a), Long.valueOf(this.f530d));
    }
}
