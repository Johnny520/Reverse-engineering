package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: oh */
/* JADX INFO: loaded from: classes.dex */
public final class C2323oh {

    /* JADX INFO: renamed from: a */
    public final File f8169a;

    /* JADX INFO: renamed from: b */
    public final Object f8170b;

    public C2323oh(File r1, List r2) {
        this.f8169a = r1;
        this.f8170b = r2;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C2323oh) == false) goto L16;
        C2323oh r32 = (C2323oh) r3;
        if (this.f8169a.equals(r32.f8169a) == true) goto L11;
        return false;
    L11:
        if (this.f8170b.equals(r32.f8170b) == true) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f8169a.hashCode() * 31;
        return this.f8170b.hashCode() + r0;
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f8169a + ", segments=" + this.f8170b + ')';
    }
}
