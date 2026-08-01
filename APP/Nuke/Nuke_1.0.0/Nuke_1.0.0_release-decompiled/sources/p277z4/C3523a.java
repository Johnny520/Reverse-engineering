package p277z4;

import p117X2.AbstractC1665j;
import p271y4.AbstractC3501c;

/* JADX INFO: renamed from: z4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3523a {

    /* JADX INFO: renamed from: a */
    public final String f10980a;

    public C3523a(String str) {
        AbstractC1665j.m2985e(str, "descriptor");
        this.f10980a = AbstractC3501c.m5755c(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3523a)) {
            return false;
        }
        return AbstractC1665j.m2981a(this.f10980a, ((C3523a) obj).f10980a);
    }

    public final int hashCode() {
        return this.f10980a.hashCode();
    }

    public final String toString() {
        return AbstractC3501c.m5757e(this.f10980a);
    }
}
