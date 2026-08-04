package yyds;

/* JADX INFO: renamed from: yyds.ᲀᲀᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2068 implements InterfaceC1863 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f10221;

    public C2068(String str) {
        this.f10221 = AbstractC2431.m4474(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2068)) {
            return false;
        }
        return this.f10221.equals(((C2068) obj).f10221);
    }

    public final int hashCode() {
        return this.f10221.hashCode();
    }

    public final String toString() {
        return AbstractC2431.m4476(this.f10221);
    }
}
