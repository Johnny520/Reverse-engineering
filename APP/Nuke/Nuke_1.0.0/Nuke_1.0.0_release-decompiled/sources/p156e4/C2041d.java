package p156e4;

import p117X2.AbstractC1665j;
import p191k4.C2475a;
import p208n4.C2709h;

/* JADX INFO: renamed from: e4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2041d {

    /* JADX INFO: renamed from: d */
    public static final C2709h f6793d;

    /* JADX INFO: renamed from: e */
    public static final C2709h f6794e;

    /* JADX INFO: renamed from: f */
    public static final C2709h f6795f;

    /* JADX INFO: renamed from: g */
    public static final C2709h f6796g;

    /* JADX INFO: renamed from: h */
    public static final C2709h f6797h;

    /* JADX INFO: renamed from: i */
    public static final C2709h f6798i;

    /* JADX INFO: renamed from: a */
    public final C2709h f6799a;

    /* JADX INFO: renamed from: b */
    public final C2709h f6800b;

    /* JADX INFO: renamed from: c */
    public final int f6801c;

    static {
        C2709h c2709h = C2709h.f8630g;
        f6793d = C2475a.m4416e(":");
        f6794e = C2475a.m4416e(":status");
        f6795f = C2475a.m4416e(":method");
        f6796g = C2475a.m4416e(":path");
        f6797h = C2475a.m4416e(":scheme");
        f6798i = C2475a.m4416e(":authority");
    }

    public C2041d(C2709h c2709h, C2709h c2709h2) {
        AbstractC1665j.m2985e(c2709h, "name");
        AbstractC1665j.m2985e(c2709h2, "value");
        this.f6799a = c2709h;
        this.f6800b = c2709h2;
        this.f6801c = c2709h2.mo4732a() + c2709h.mo4732a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2041d)) {
            return false;
        }
        C2041d c2041d = (C2041d) obj;
        return AbstractC1665j.m2981a(this.f6799a, c2041d.f6799a) && AbstractC1665j.m2981a(this.f6800b, c2041d.f6800b);
    }

    public final int hashCode() {
        return this.f6800b.hashCode() + (this.f6799a.hashCode() * 31);
    }

    public final String toString() {
        return this.f6799a.m4741j() + ": " + this.f6800b.m4741j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2041d(String str, String str2) {
        this(C2475a.m4416e(str), C2475a.m4416e(str2));
        C2709h c2709h = C2709h.f8630g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2041d(C2709h c2709h, String str) {
        this(c2709h, C2475a.m4416e(str));
        AbstractC1665j.m2985e(c2709h, "name");
        AbstractC1665j.m2985e(str, "value");
        C2709h c2709h2 = C2709h.f8630g;
    }
}
