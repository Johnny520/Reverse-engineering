package p000;

/* JADX INFO: renamed from: e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1347e1 {

    /* JADX INFO: renamed from: a */
    public int f4841a;

    /* JADX INFO: renamed from: b */
    public int f4842b;

    /* JADX INFO: renamed from: c */
    public Object f4843c;

    /* JADX INFO: renamed from: d */
    public int f4844d;

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
    L35:
        return true;
    L6:
        if ((r4 instanceof C1347e1) == false) goto L36;
        C1347e1 r42 = (C1347e1) r4;
        int r1 = this.f4841a;
        if (r1 == r42.f4841a) goto L12;
        return false;
    L12:
        if (r1 != 8) goto L21;
        if (Math.abs(this.f4844d - this.f4842b) != 1) goto L21;
        if (this.f4844d != r42.f4842b) goto L21;
        if (this.f4842b == r42.f4844d) goto L35;
    L21:
        if (this.f4844d == r42.f4844d) goto L24;
        return false;
    L24:
        if (this.f4842b != r42.f4842b) goto L39;
        Object r12 = this.f4843c;
        if (r12 == null) goto L32;
        if (r12.equals(r42.f4843c) == true) goto L35;
        return false;
    L32:
        if (r42.f4843c == null) goto L35;
        return false;
    L39:
        return false;
    L36:
        return false;
    }

    public final int hashCode() {
        return (((this.f4841a * 31) + this.f4842b) * 31) + this.f4844d;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("[");
        int r1 = this.f4841a;
        if (r1 != 1) goto L5;
        String r12 = "add";
    L15:
        r0.append(r12);
        r0.append(",s:");
        r0.append(this.f4842b);
        r0.append("c:");
        r0.append(this.f4844d);
        r0.append(",p:");
        r0.append(this.f4843c);
        r0.append("]");
        return r0.toString();
    L5:
        if (r1 != 2) goto L7;
        r12 = "rm";
        goto L15
    L7:
        if (r1 != 4) goto L9;
        r12 = "up";
        goto L15
    L9:
        if (r1 == 8) goto L11;
        r12 = "??";
        goto L15
    L11:
        r12 = "mv";
        goto L15
    }
}
