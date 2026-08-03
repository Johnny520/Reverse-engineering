package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Lh */
/* JADX INFO: loaded from: classes.dex */
public final class C0497Lh {

    /* JADX INFO: renamed from: a */
    public String f1625a;

    /* JADX INFO: renamed from: b */
    public String f1626b;

    /* JADX INFO: renamed from: c */
    public List f1627c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0497Lh)) {
            return false;
        }
        C0497Lh c0497Lh = (C0497Lh) obj;
        return Objects.equals(this.f1625a, c0497Lh.f1625a) && Objects.equals(this.f1626b, c0497Lh.f1626b) && Objects.equals(this.f1627c, c0497Lh.f1627c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1625a, this.f1626b, this.f1627c);
    }
}
