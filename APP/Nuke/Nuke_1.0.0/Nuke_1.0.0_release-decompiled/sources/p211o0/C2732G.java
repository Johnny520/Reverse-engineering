package p211o0;

import p117X2.AbstractC1665j;
import p204n0.C2684c;

/* JADX INFO: renamed from: o0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2732G extends AbstractC2767z {

    /* JADX INFO: renamed from: f */
    public final C2684c f8677f;

    public C2732G(C2684c c2684c) {
        this.f8677f = c2684c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2732G) {
            return AbstractC1665j.m2981a(this.f8677f, ((C2732G) obj).f8677f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8677f.hashCode();
    }

    @Override // p211o0.AbstractC2767z
    /* JADX INFO: renamed from: k */
    public final C2684c mo4788k() {
        return this.f8677f;
    }
}
