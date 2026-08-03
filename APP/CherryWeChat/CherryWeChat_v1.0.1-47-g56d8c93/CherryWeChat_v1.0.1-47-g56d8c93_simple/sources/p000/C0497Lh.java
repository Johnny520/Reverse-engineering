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

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0497Lh) == true) goto L8;
        return false;
    L8:
        C0497Lh r52 = (C0497Lh) r5;
        if (Objects.equals(this.f1625a, r52.f1625a) == true) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.f1626b, r52.f1626b) == false) goto L15;
        if (Objects.equals(this.f1627c, r52.f1627c) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1625a, this.f1626b, this.f1627c});
    }
}
