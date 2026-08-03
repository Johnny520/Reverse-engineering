package p036T0;

/* JADX INFO: renamed from: T0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0340c extends C0338a {

    /* JADX INFO: renamed from: d */
    public static final C0340c f664d = new C0340c(1, 0, 1);

    @Override // p036T0.C0338a
    public final boolean equals(Object obj) {
        if (obj instanceof C0340c) {
            if (!isEmpty() || !((C0340c) obj).isEmpty()) {
                C0340c c0340c = (C0340c) obj;
                if (this.f657a == c0340c.f657a) {
                    if (this.f658b == c0340c.f658b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p036T0.C0338a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f657a * 31) + this.f658b;
    }

    @Override // p036T0.C0338a
    public final boolean isEmpty() {
        return this.f657a > this.f658b;
    }

    @Override // p036T0.C0338a
    public final String toString() {
        return this.f657a + ".." + this.f658b;
    }
}
