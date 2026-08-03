package p281t3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: t3.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4111h {

    /* JADX INFO: renamed from: a */
    public final int f13603a;

    /* JADX INFO: renamed from: b */
    public final int f13604b;

    /* JADX INFO: renamed from: c */
    public final long f13605c;

    /* JADX INFO: renamed from: d */
    public final long f13606d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4111h(int i9, int i10, long j3, long j4) {
        this.f13603a = i9;
        this.f13604b = i10;
        this.f13605c = j3;
        this.f13606d = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public static C4111h m8304a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C4111h c4111h = new C4111h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c4111h;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8305b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f13603a);
            dataOutputStream.writeInt(this.f13604b);
            dataOutputStream.writeLong(this.f13605c);
            dataOutputStream.writeLong(this.f13606d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C4111h)) {
            C4111h c4111h = (C4111h) obj;
            if (this.f13604b == c4111h.f13604b && this.f13605c == c4111h.f13605c && this.f13603a == c4111h.f13603a && this.f13606d == c4111h.f13606d) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13604b), Long.valueOf(this.f13605c), Integer.valueOf(this.f13603a), Long.valueOf(this.f13606d));
    }
}
