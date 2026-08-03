package p000a;

/* JADX INFO: renamed from: a.wa */
/* JADX INFO: loaded from: classes.dex */
public final class C0898wa {

    /* JADX INFO: renamed from: a */
    public final String f3499a;

    /* JADX INFO: renamed from: b */
    public final C0574f9 f3500b;

    public C0898wa(String str, C0574f9 c0574f9) {
        this.f3499a = str;
        this.f3500b = c0574f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0898wa)) {
            return false;
        }
        C0898wa c0898wa = (C0898wa) obj;
        return C0631i9.m1478a(this.f3499a, c0898wa.f3499a) && C0631i9.m1478a(this.f3500b, c0898wa.f3500b);
    }

    public final int hashCode() {
        return this.f3500b.hashCode() + (this.f3499a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f3499a + ", range=" + this.f3500b + ')';
    }
}
