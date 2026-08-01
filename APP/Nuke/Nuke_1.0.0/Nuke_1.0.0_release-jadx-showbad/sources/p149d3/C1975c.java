package p149d3;

import p117X2.AbstractC1665j;
import p132a3.C1804d;

/* JADX INFO: renamed from: d3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1975c {

    /* JADX INFO: renamed from: a */
    public final String f6672a;

    /* JADX INFO: renamed from: b */
    public final C1804d f6673b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1975c(String str, C1804d c1804d) {
        this.f6672a = str;
        this.f6673b = c1804d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1975c)) {
            return false;
        }
        C1975c c1975c = (C1975c) obj;
        return AbstractC1665j.m2981a(this.f6672a, c1975c.f6672a) && AbstractC1665j.m2981a(this.f6673b, c1975c.f6673b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6673b.hashCode() + (this.f6672a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MatchGroup(value=" + this.f6672a + ", range=" + this.f6673b + ')';
    }
}
