package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class jg implements hg {
    public qb0 a;
    public boolean b;
    public boolean c;
    public final qb0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public sg i;
    public boolean j;
    public final ArrayList k;
    public final ArrayList l;

    public jg(qb0 r4) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = 1;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = r4;
    }

    @Override // defpackage.hg
    public final void a(hg r8) {
        ArrayList r82 = this.l;
        int r0 = r82.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L7;
        Object r3 = r82.get(r2);
        r2 = r2 + 1;
        if (((jg) r3).j == true) goto L3;
        return;
    L7:
        this.c = true;
        qb0 r22 = this.a;
        if (r22 == null) goto L11;
        r22.a(this);
    L11:
        if (this.b == false) goto L14;
        this.d.a(this);
        return;
    L14:
        int r23 = r82.size();
        jg r4 = null;
        int r32 = 0;
    L15:
        if (r32 >= r23) goto L20;
        Object r5 = r82.get(r32);
        r32 = r32 + 1;
        jg r52 = (jg) r5;
        if ((r52 instanceof sg) == true) goto L15;
        r1 = r1 + 1;
        r4 = r52;
        goto L15
    L20:
        if (r4 == null) goto L30;
        if (r1 != 1) goto L30;
        if (r4.j == false) goto L30;
        sg r83 = this.i;
        if (r83 != null) goto L27;
    L29:
        d(r4.g + this.f);
        goto L30
    L27:
        if (r83.j == false) goto L42;
        this.f = this.h * r83.g;
        goto L29
    L42:
        return;
    L30:
        qb0 r84 = this.a;
        if (r84 == null) goto L43;
        r84.a(this);
        return;
    }

    public final void b(qb0 r2) {
        this.k.add(r2);
        if (this.j == false) goto L6;
        r2.a(r2);
        return;
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int r4) {
        if (this.j == true) goto L8;
        this.j = true;
        this.g = r4;
        ArrayList r42 = this.k;
        int r0 = r42.size();
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L10;
        Object r2 = r42.get(r1);
        r1 = r1 + 1;
        hg r22 = (hg) r2;
        r22.a(r22);
        goto L6
    L10:
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.d.b.W);
        r0.append(":");
        switch(this.e) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        String r1 = "null";
    L13:
        r0.append(r1);
        r0.append("(");
        if (this.j == false) goto L16;
        Object r12 = Integer.valueOf(this.g);
    L17:
        r0.append(r12);
        r0.append(") <t=");
        r0.append(this.l.size());
        r0.append(":d=");
        r0.append(this.k.size());
        r0.append(">");
        return r0.toString();
    L16:
        r12 = "unresolved";
        goto L17
    L5:
        r1 = "BASELINE";
        goto L13
    L6:
        r1 = "BOTTOM";
        goto L13
    L7:
        r1 = "TOP";
        goto L13
    L8:
        r1 = "RIGHT";
        goto L13
    L9:
        r1 = "LEFT";
        goto L13
    L10:
        r1 = "VERTICAL_DIMENSION";
        goto L13
    L11:
        r1 = "HORIZONTAL_DIMENSION";
        goto L13
    L12:
        r1 = "UNKNOWN";
        goto L13
    }
}
