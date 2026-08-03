package p000a;

/* JADX INFO: renamed from: a.Yf */
/* JADX INFO: loaded from: classes.dex */
public final class C0449Yf {

    /* JADX INFO: renamed from: a */
    public final C0799r6 f1693a;

    /* JADX INFO: renamed from: b */
    public final EnumC0856u6 f1694b;

    public C0449Yf(C0799r6 c0799r6, EnumC0856u6 enumC0856u6) {
        this.f1693a = c0799r6;
        this.f1694b = enumC0856u6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0449Yf)) {
            return false;
        }
        C0449Yf c0449Yf = (C0449Yf) obj;
        return C0631i9.m1478a(this.f1693a, c0449Yf.f1693a) && this.f1694b == c0449Yf.f1694b;
    }

    public final int hashCode() {
        return this.f1694b.hashCode() + (this.f1693a.f3141d.hashCode() * 31);
    }

    public final String toString() {
        return "UsingFieldData(field=" + this.f1693a + ", usingType=" + this.f1694b + ")";
    }
}
