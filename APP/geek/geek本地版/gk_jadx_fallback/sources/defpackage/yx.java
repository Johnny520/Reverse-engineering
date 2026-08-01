package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx implements java.lang.Comparable {
    public defpackage.a40 a;
    public final /* synthetic */ defpackage.zx b;

    public yx(defpackage.zx r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            a40 r2 = (defpackage.a40) r2
            a40 r0 = r1.a
            int r0 = r0.b
            int r2 = r2.b
            int r0 = r0 - r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            a40 r0 = r3.a
            java.lang.String r1 = "[ "
            if (r0 == 0) goto L28
            r0 = 0
        L7:
            r2 = 9
            if (r0 >= r2) goto L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            a40 r1 = r3.a
            float[] r1 = r1.h
            r1 = r1[r0]
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r0 = r0 + 1
            goto L7
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "] "
            r0.append(r1)
            a40 r1 = r3.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
