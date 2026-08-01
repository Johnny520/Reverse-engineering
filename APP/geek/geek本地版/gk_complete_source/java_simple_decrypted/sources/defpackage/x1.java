package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object r4) {
        if (this == r4) goto L20;
        if (r4 != null) goto L7;
        return false;
    L7:
        if (x1.class != r4.getClass()) goto L30;
        x1 r42 = (x1) r4;
        int r1 = this.a;
        if (r1 == r42.a) goto L13;
        return false;
    L13:
        if (r1 != 8) goto L22;
        if (Math.abs(this.c - this.b) != 1) goto L22;
        if (this.c != r42.b) goto L22;
        if (this.b == r42.c) goto L20;
    L22:
        if (this.c == r42.c) goto L25;
        return false;
    L25:
        if (this.b != r42.b) goto L33;
        return true;
    L33:
        return false;
    L30:
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("[");
        int r1 = this.a;
        if (r1 != 1) goto L5;
        String r12 = "add";
    L15:
        r0.append(r12);
        r0.append(",s:");
        r0.append(this.b);
        r0.append("c:");
        r0.append(this.c);
        r0.append(",p:null]");
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
