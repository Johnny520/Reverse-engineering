package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class jg implements defpackage.hg {
    public defpackage.qb0 a;
    public boolean b;
    public boolean c;
    public final defpackage.qb0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public defpackage.sg i;
    public boolean j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;

    public jg(defpackage.qb0 r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r1 = 0
            r3.b = r1
            r3.c = r1
            r2 = 1
            r3.e = r2
            r3.h = r2
            r3.i = r0
            r3.j = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l = r0
            r3.d = r4
            return
    }

    @Override // defpackage.hg
    public final void a(defpackage.hg r8) {
            r7 = this;
            java.util.ArrayList r8 = r7.l
            int r0 = r8.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L17
            java.lang.Object r3 = r8.get(r2)
            int r2 = r2 + 1
            jg r3 = (defpackage.jg) r3
            boolean r3 = r3.j
            if (r3 != 0) goto L8
            goto L6b
        L17:
            r0 = 1
            r7.c = r0
            qb0 r2 = r7.a
            if (r2 == 0) goto L21
            r2.a(r7)
        L21:
            boolean r2 = r7.b
            if (r2 == 0) goto L2b
            qb0 r8 = r7.d
            r8.a(r7)
            return
        L2b:
            int r2 = r8.size()
            r3 = 0
            r4 = r3
            r3 = r1
        L32:
            if (r3 >= r2) goto L45
            java.lang.Object r5 = r8.get(r3)
            int r3 = r3 + 1
            jg r5 = (defpackage.jg) r5
            boolean r6 = r5 instanceof defpackage.sg
            if (r6 == 0) goto L41
            goto L32
        L41:
            int r1 = r1 + 1
            r4 = r5
            goto L32
        L45:
            if (r4 == 0) goto L64
            if (r1 != r0) goto L64
            boolean r8 = r4.j
            if (r8 == 0) goto L64
            sg r8 = r7.i
            if (r8 == 0) goto L5c
            boolean r0 = r8.j
            if (r0 == 0) goto L6b
            int r0 = r7.h
            int r8 = r8.g
            int r0 = r0 * r8
            r7.f = r0
        L5c:
            int r8 = r4.g
            int r0 = r7.f
            int r8 = r8 + r0
            r7.d(r8)
        L64:
            qb0 r8 = r7.a
            if (r8 == 0) goto L6b
            r8.a(r7)
        L6b:
            return
    }

    public final void b(defpackage.qb0 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.k
            r0.add(r2)
            boolean r0 = r1.j
            if (r0 == 0) goto Lc
            r2.a(r2)
        Lc:
            return
    }

    public final void c() {
            r1 = this;
            java.util.ArrayList r0 = r1.l
            r0.clear()
            java.util.ArrayList r0 = r1.k
            r0.clear()
            r0 = 0
            r1.j = r0
            r1.g = r0
            r1.c = r0
            r1.b = r0
            return
    }

    public void d(int r4) {
            r3 = this;
            boolean r0 = r3.j
            if (r0 == 0) goto L5
            goto L1f
        L5:
            r0 = 1
            r3.j = r0
            r3.g = r4
            java.util.ArrayList r4 = r3.k
            int r0 = r4.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            hg r2 = (defpackage.hg) r2
            r2.a(r2)
            goto L11
        L1f:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            qb0 r1 = r2.d
            pc r1 = r1.b
            java.lang.String r1 = r1.W
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r2.e
            switch(r1) {
                case 1: goto L30;
                case 2: goto L2d;
                case 3: goto L2a;
                case 4: goto L27;
                case 5: goto L24;
                case 6: goto L21;
                case 7: goto L1e;
                case 8: goto L1b;
                default: goto L18;
            }
        L18:
            java.lang.String r1 = "null"
            goto L32
        L1b:
            java.lang.String r1 = "BASELINE"
            goto L32
        L1e:
            java.lang.String r1 = "BOTTOM"
            goto L32
        L21:
            java.lang.String r1 = "TOP"
            goto L32
        L24:
            java.lang.String r1 = "RIGHT"
            goto L32
        L27:
            java.lang.String r1 = "LEFT"
            goto L32
        L2a:
            java.lang.String r1 = "VERTICAL_DIMENSION"
            goto L32
        L2d:
            java.lang.String r1 = "HORIZONTAL_DIMENSION"
            goto L32
        L30:
            java.lang.String r1 = "UNKNOWN"
        L32:
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            boolean r1 = r2.j
            if (r1 == 0) goto L45
            int r1 = r2.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L47
        L45:
            java.lang.String r1 = "unresolved"
        L47:
            r0.append(r1)
            java.lang.String r1 = ") <t="
            r0.append(r1)
            java.util.ArrayList r1 = r2.l
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ":d="
            r0.append(r1)
            java.util.ArrayList r1 = r2.k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
