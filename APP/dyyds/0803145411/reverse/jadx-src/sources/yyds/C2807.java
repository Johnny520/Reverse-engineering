package yyds;

/* JADX INFO: renamed from: yyds.ᲈᲈᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2807 extends C2536 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2807 f13686 = new C2807(1, 0, 1);

    @Override // yyds.C2536
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2807)) {
            return false;
        }
        if (isEmpty() && ((C2807) obj).isEmpty()) {
            return true;
        }
        C2807 c2807 = (C2807) obj;
        return this.f12492 == c2807.f12492 && this.f12493 == c2807.f12493;
    }

    @Override // yyds.C2536
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f12492 * 31) + this.f12493;
    }

    @Override // yyds.C2536
    public final boolean isEmpty() {
        return this.f12492 > this.f12493;
    }

    @Override // yyds.C2536
    public final String toString() {
        return this.f12492 + ".." + this.f12493;
    }
}
