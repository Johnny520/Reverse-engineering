package p176i1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: i1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2307w {

    /* JADX INFO: renamed from: a */
    public final boolean f7506a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f7507b = true;

    /* JADX INFO: renamed from: c */
    public final EnumC2284E f7508c = EnumC2284E.f7440d;

    /* JADX INFO: renamed from: d */
    public final boolean f7509d = true;

    /* JADX INFO: renamed from: e */
    public final boolean f7510e = true;

    /* JADX INFO: renamed from: f */
    public final String f7511f = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2307w)) {
            return false;
        }
        C2307w c2307w = (C2307w) obj;
        return this.f7506a == c2307w.f7506a && this.f7507b == c2307w.f7507b && this.f7508c == c2307w.f7508c && this.f7509d == c2307w.f7509d && this.f7510e == c2307w.f7510e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7510e) + AbstractC0231b.m395f((this.f7508c.hashCode() + AbstractC0231b.m395f(Boolean.hashCode(this.f7506a) * 31, 31, this.f7507b)) * 31, 31, this.f7509d);
    }
}
