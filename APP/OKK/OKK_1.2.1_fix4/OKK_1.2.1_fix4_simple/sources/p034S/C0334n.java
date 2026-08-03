package p034S;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

    public C0334n(int r1, int r2, long r3, long r5) {
        this.f646a = r1;
        this.f647b = r2;
        this.f648c = r3;
        this.f649d = r5;
    }

    /* JADX INFO: renamed from: a */
    public static C0334n m752a(File r9) {
        DataInputStream r02 = new DataInputStream(new FileInputStream(r9));
        C0334n r92 = new C0334n(r02.readInt(), r02.readInt(), r02.readLong(), r02.readLong());     // Catch: Throwable -> L6
        r02.close();
        return r92;
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    /* JADX INFO: renamed from: b */
    public final void m753b(File r4) {
        r4.delete();
        DataOutputStream r02 = new DataOutputStream(new FileOutputStream(r4));
        r02.writeInt(this.f646a);     // Catch: Throwable -> L6
        r02.writeInt(this.f647b);     // Catch: Throwable -> L6
        r02.writeLong(this.f648c);     // Catch: Throwable -> L6
        r02.writeLong(this.f649d);     // Catch: Throwable -> L6
        r02.close();
        return;
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L9
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
    L21:
        return false;
    L8:
        if ((r7 instanceof C0334n) == false) goto L21;
        C0334n r72 = (C0334n) r7;
        if (this.f647b != r72.f647b) goto L20;
        if (this.f648c != r72.f648c) goto L20;
        if (this.f646a != r72.f646a) goto L20;
        if (this.f649d != r72.f649d) goto L20;
        return true;
    L20:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f647b), Long.valueOf(this.f648c), Integer.valueOf(this.f646a), Long.valueOf(this.f649d)});
    }
}
