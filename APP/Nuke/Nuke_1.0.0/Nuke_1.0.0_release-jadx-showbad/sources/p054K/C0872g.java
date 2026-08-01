package p054K;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: K.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0872g {

    /* JADX INFO: renamed from: a */
    public final String f2741a;

    /* JADX INFO: renamed from: b */
    public String f2742b;

    /* JADX INFO: renamed from: c */
    public boolean f2743c = false;

    /* JADX INFO: renamed from: d */
    public C0869d f2744d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0872g(String str, String str2) {
        this.f2741a = str;
        this.f2742b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0872g)) {
            return false;
        }
        C0872g c0872g = (C0872g) obj;
        return AbstractC1665j.m2981a(this.f2741a, c0872g.f2741a) && AbstractC1665j.m2981a(this.f2742b, c0872g.f2742b) && this.f2743c == c0872g.f2743c && AbstractC1665j.m2981a(this.f2744d, c0872g.f2744d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM395f = AbstractC0231b.m395f(AbstractC0231b.m394e(this.f2741a.hashCode() * 31, 31, this.f2742b), 31, this.f2743c);
        C0869d c0869d = this.f2744d;
        return iM395f + (c0869d == null ? 0 : c0869d.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f2744d + ", isShowingSubstitution=" + this.f2743c + ')';
    }
}
