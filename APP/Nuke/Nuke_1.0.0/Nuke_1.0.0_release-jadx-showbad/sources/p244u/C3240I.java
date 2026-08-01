package p244u;

import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: u.I */
/* JADX INFO: loaded from: classes.dex */
public final class C3240I {

    /* JADX INFO: renamed from: a */
    public final int f10035a;

    /* JADX INFO: renamed from: b */
    public final int f10036b;

    /* JADX INFO: renamed from: c */
    public final int f10037c;

    /* JADX INFO: renamed from: d */
    public final int f10038d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3240I(int i5, int i6, int i7, int i8) {
        this.f10035a = i5;
        this.f10036b = i6;
        this.f10037c = i7;
        this.f10038d = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3240I)) {
            return false;
        }
        C3240I c3240i = (C3240I) obj;
        return this.f10035a == c3240i.f10035a && this.f10036b == c3240i.f10036b && this.f10037c == c3240i.f10037c && this.f10038d == c3240i.f10038d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f10035a * 31) + this.f10036b) * 31) + this.f10037c) * 31) + this.f10038d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f10035a);
        sb.append(", top=");
        sb.append(this.f10036b);
        sb.append(", right=");
        sb.append(this.f10037c);
        sb.append(", bottom=");
        return AbstractC3202a.m5466a(sb, this.f10038d, ')');
    }
}
