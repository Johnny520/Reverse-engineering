package p261rc;

import java.io.File;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: rc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6588f {

    /* JADX INFO: renamed from: a */
    public final File f20651a;

    public C6588f(File file) {
        file.getClass();
        this.f20651a = file;
    }

    /* JADX INFO: renamed from: a */
    public final File m26155a() {
        return this.f20651a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6588f) {
            return AbstractC1061t.m3842c(toString(), ((C6588f) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String string = this.f20651a.toString();
        string.getClass();
        return string;
    }
}
