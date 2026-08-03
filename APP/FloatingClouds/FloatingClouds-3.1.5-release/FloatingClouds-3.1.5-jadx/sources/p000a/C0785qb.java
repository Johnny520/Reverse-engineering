package p000a;

import java.util.List;

/* JADX INFO: renamed from: a.qb */
/* JADX INFO: loaded from: classes.dex */
public final class C0785qb implements InterfaceC0711md {

    /* JADX INFO: renamed from: a */
    public final String f3097a;

    /* JADX INFO: renamed from: b */
    public final String f3098b;

    /* JADX INFO: renamed from: c */
    public final List<String> f3099c;

    /* JADX INFO: renamed from: d */
    public final String f3100d;

    /* JADX INFO: renamed from: e */
    public final String f3101e;

    /* JADX INFO: renamed from: f */
    public final int f3102f = 80;

    /* JADX INFO: renamed from: g */
    public final boolean f3103g;

    public C0785qb(String str, String str2, List list, String str3, String str4, boolean z) {
        this.f3097a = str;
        this.f3098b = str2;
        this.f3099c = list;
        this.f3100d = str3;
        this.f3101e = str4;
        this.f3103g = z;
    }

    @Override // p000a.InterfaceC0711md
    /* JADX INFO: renamed from: a */
    public final String mo1424a() {
        return this.f3097a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0785qb)) {
            return false;
        }
        C0785qb c0785qb = (C0785qb) obj;
        return C0631i9.m1478a(this.f3097a, c0785qb.f3097a) && C0631i9.m1478a(this.f3098b, c0785qb.f3098b) && C0631i9.m1478a(this.f3099c, c0785qb.f3099c) && C0631i9.m1478a(this.f3100d, c0785qb.f3100d) && C0631i9.m1478a(this.f3101e, c0785qb.f3101e) && this.f3102f == c0785qb.f3102f && this.f3103g == c0785qb.f3103g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3103g) + ((Integer.hashCode(this.f3102f) + C0944z.m2222b(this.f3101e, C0944z.m2222b(this.f3100d, (this.f3099c.hashCode() + C0944z.m2222b(this.f3098b, this.f3097a.hashCode() * 31, 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "MethodRule(ruleId=" + this.f3097a + ", returnType=" + this.f3098b + ", paramTypes=" + this.f3099c + ", methodNameSubstring=" + this.f3100d + ", declaredClassRuleId=" + this.f3101e + ", priority=" + this.f3102f + ", searchSuperClasses=" + this.f3103g + ")";
    }
}
