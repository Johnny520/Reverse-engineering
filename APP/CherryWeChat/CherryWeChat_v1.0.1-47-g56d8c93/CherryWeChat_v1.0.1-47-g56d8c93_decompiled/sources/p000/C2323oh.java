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

    public C2323oh(File file, List list) {
        this.f8169a = file;
        this.f8170b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2323oh)) {
            return false;
        }
        C2323oh c2323oh = (C2323oh) obj;
        return this.f8169a.equals(c2323oh.f8169a) && this.f8170b.equals(c2323oh.f8170b);
    }

    public final int hashCode() {
        return this.f8170b.hashCode() + (this.f8169a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f8169a + ", segments=" + this.f8170b + ')';
    }
}
