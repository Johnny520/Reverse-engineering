package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲇᲁᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2536 implements Iterable, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f12491;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f12492;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f12493;

    public C2536(int i, int i2, int i3) {
        if (i3 == 0) {
            C0188.m798("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C0188.m798("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f12492 = i;
        this.f12493 = AbstractC1960.m3792(i, i2, i3);
        this.f12491 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2536)) {
            return false;
        }
        if (isEmpty() && ((C2536) obj).isEmpty()) {
            return true;
        }
        C2536 c2536 = (C2536) obj;
        return this.f12492 == c2536.f12492 && this.f12493 == c2536.f12493 && this.f12491 == c2536.f12491;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f12492 * 31) + this.f12493) * 31) + this.f12491;
    }

    public boolean isEmpty() {
        int i = this.f12493;
        int i2 = this.f12491;
        int i3 = this.f12492;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1953(this.f12492, this.f12493, this.f12491);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f12493;
        int i2 = this.f12491;
        int i3 = this.f12492;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
