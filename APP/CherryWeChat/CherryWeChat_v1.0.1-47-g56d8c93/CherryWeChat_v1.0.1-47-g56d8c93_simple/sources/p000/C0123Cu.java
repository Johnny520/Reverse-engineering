package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

    public C0123Cu(int r1, int r2, long r3, long r5) {
        this.f291a = r1;
        this.f292b = r2;
        this.f293c = r3;
        this.f294d = r5;
    }

    /* JADX INFO: renamed from: a */
    public static C0123Cu m199a(File r9) {
        DataInputStream r1 = new DataInputStream(new FileInputStream(r9));
        C0123Cu r2 = new C0123Cu(r1.readInt(), r1.readInt(), r1.readLong(), r1.readLong());     // Catch: Throwable -> L6
        r1.close();
        return r2;
    L6:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L10
        throw th;
    L10:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m200b(File r4) {
        r4.delete();
        DataOutputStream r0 = new DataOutputStream(new FileOutputStream(r4));
        r0.writeInt(this.f291a);     // Catch: Throwable -> L6
        r0.writeInt(this.f292b);     // Catch: Throwable -> L6
        r0.writeLong(this.f293c);     // Catch: Throwable -> L6
        r0.writeLong(this.f294d);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L19:
        return false;
    L8:
        if ((r7 instanceof C0123Cu) == false) goto L19;
        C0123Cu r72 = (C0123Cu) r7;
        if (this.f292b != r72.f292b) goto L19;
        if (this.f293c != r72.f293c) goto L19;
        if (this.f291a != r72.f291a) goto L19;
        if (this.f294d != r72.f294d) goto L19;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f292b), Long.valueOf(this.f293c), Integer.valueOf(this.f291a), Long.valueOf(this.f294d)});
    }
}
