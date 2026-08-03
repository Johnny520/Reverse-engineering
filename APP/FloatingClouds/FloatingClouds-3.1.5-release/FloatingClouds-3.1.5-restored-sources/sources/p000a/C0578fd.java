package p000a;

/* JADX INFO: renamed from: a.fd */
/* JADX INFO: loaded from: classes.dex */
public final class C0578fd {

    /* JADX INFO: renamed from: a */
    public final int f2145a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f2146b;

    public C0578fd(int i, ClassLoader classLoader) {
        C0631i9.m1482e(classLoader, "classLoader");
        this.f2145a = i;
        this.f2146b = classLoader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0578fd)) {
            return false;
        }
        C0578fd c0578fd = (C0578fd) obj;
        return this.f2145a == c0578fd.f2145a && C0631i9.m1478a(this.f2146b, c0578fd.f2146b);
    }

    public final int hashCode() {
        return EnumC0022B2.f66a.hashCode() + ((this.f2146b.hashCode() + (Integer.hashCode(this.f2145a) * 31)) * 31);
    }

    public final String toString() {
        return "ResolveContext(versionCode=" + this.f2145a + ", classLoader=" + this.f2146b + ", cacheMode=" + EnumC0022B2.f66a + ")";
    }
}
