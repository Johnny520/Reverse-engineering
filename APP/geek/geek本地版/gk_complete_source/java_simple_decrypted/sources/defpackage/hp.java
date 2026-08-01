package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp extends fp {
    public static final hp d = null;

    static {
        d = new hp(1, 0, 1);
    }

    @Override // defpackage.fp
    public final boolean equals(Object r3) {
        if ((r3 instanceof hp) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        hp r32 = (hp) r3;
        int r0 = r32.a;
        if (this.a == r0) goto L11;
        return false;
    L11:
        if (this.b != r32.b) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((hp) r3).isEmpty() == false) goto L8;
        return true;
    }

    @Override // defpackage.fp
    public final int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.fp
    public final boolean isEmpty() {
        if (this.a <= this.b) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.fp
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
