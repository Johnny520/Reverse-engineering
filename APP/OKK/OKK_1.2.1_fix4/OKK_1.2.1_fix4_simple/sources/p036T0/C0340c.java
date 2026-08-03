package p036T0;

/* JADX INFO: renamed from: T0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0340c extends C0338a {

    /* JADX INFO: renamed from: d */
    public static final C0340c f664d = null;

    static {
        f664d = new C0340c(1, 0, 1);
    }

    @Override // p036T0.C0338a
    public final boolean equals(Object r3) {
        if ((r3 instanceof C0340c) == true) goto L5;
    L13:
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C0340c r32 = (C0340c) r3;
        int r02 = r32.f657a;
        if (this.f657a != r02) goto L13;
        int r33 = r32.f658b;
        if (this.f658b != r33) goto L13;
    L12:
        return true;
    L7:
        if (((C0340c) r3).isEmpty() == true) goto L12;
        goto L8
    }

    @Override // p036T0.C0338a
    public final int hashCode() {
        if (isEmpty() == false) goto L6;
        return -1;
    L6:
        return (this.f657a * 31) + this.f658b;
    }

    @Override // p036T0.C0338a
    public final boolean isEmpty() {
        if (this.f657a <= this.f658b) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // p036T0.C0338a
    public final String toString() {
        return this.f657a + ".." + this.f658b;
    }
}
