package p176i1;

import p011B4.AbstractC0231b;
import p095T.C1305C;

/* JADX INFO: renamed from: i1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2283D {

    /* JADX INFO: renamed from: a */
    public final int f7435a;

    /* JADX INFO: renamed from: b */
    public final boolean f7436b;

    /* JADX INFO: renamed from: c */
    public final boolean f7437c;

    /* JADX INFO: renamed from: d */
    public final boolean f7438d;

    /* JADX INFO: renamed from: e */
    public final boolean f7439e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2283D(boolean z5) {
        this(z5, EnumC2284E.f7440d, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2283D)) {
            return false;
        }
        C2283D c2283d = (C2283D) obj;
        return this.f7435a == c2283d.f7435a && this.f7436b == c2283d.f7436b && this.f7437c == c2283d.f7437c && this.f7438d == c2283d.f7438d && this.f7439e == c2283d.f7439e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m395f(this.f7435a * 31, 31, this.f7436b), 31, this.f7437c), 31, this.f7438d), 31, this.f7439e);
    }

    public C2283D(boolean z5, EnumC2284E enumC2284E, boolean z6) {
        C1305C c1305c = AbstractC2298n.f7490a;
        int i5 = !z5 ? 262152 : 262144;
        i5 = enumC2284E == EnumC2284E.f7441e ? i5 | 8192 : i5;
        i5 = z6 ? i5 : i5 | 512;
        boolean z7 = enumC2284E == EnumC2284E.f7440d;
        this.f7435a = i5;
        this.f7436b = z7;
        this.f7437c = true;
        this.f7438d = true;
        this.f7439e = true;
    }
}
