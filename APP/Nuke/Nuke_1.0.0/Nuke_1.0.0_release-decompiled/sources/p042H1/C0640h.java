package p042H1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: H1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0640h {

    /* JADX INFO: renamed from: a */
    public final int f2036a;

    /* JADX INFO: renamed from: b */
    public final int f2037b;

    /* JADX INFO: renamed from: c */
    public final long f2038c;

    /* JADX INFO: renamed from: d */
    public final long f2039d;

    public C0640h(int i5, int i6, long j5, long j6) {
        this.f2036a = i5;
        this.f2037b = i6;
        this.f2038c = j5;
        this.f2039d = j6;
    }

    /* JADX INFO: renamed from: a */
    public static C0640h m1111a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0640h c0640h = new C0640h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0640h;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1112b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2036a);
            dataOutputStream.writeInt(this.f2037b);
            dataOutputStream.writeLong(this.f2038c);
            dataOutputStream.writeLong(this.f2039d);
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
        if (obj != null && (obj instanceof C0640h)) {
            C0640h c0640h = (C0640h) obj;
            if (this.f2037b == c0640h.f2037b && this.f2038c == c0640h.f2038c && this.f2036a == c0640h.f2036a && this.f2039d == c0640h.f2039d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2037b), Long.valueOf(this.f2038c), Integer.valueOf(this.f2036a), Long.valueOf(this.f2039d));
    }
}
