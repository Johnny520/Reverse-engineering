package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: vd */
/* JADX INFO: loaded from: classes.dex */
public class C2628vd implements InterfaceC2542td {

    /* JADX INFO: renamed from: a */
    public AbstractC1449gF f9110a;

    /* JADX INFO: renamed from: b */
    public boolean f9111b;

    /* JADX INFO: renamed from: c */
    public boolean f9112c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1449gF f9113d;

    /* JADX INFO: renamed from: e */
    public int f9114e;

    /* JADX INFO: renamed from: f */
    public int f9115f;

    /* JADX INFO: renamed from: g */
    public int f9116g;

    /* JADX INFO: renamed from: h */
    public int f9117h;

    /* JADX INFO: renamed from: i */
    public C0750Rd f9118i;

    /* JADX INFO: renamed from: j */
    public boolean f9119j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f9120k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f9121l;

    public C2628vd(AbstractC1449gF r4) {
        this.f9110a = null;
        this.f9111b = false;
        this.f9112c = false;
        this.f9114e = 1;
        this.f9117h = 1;
        this.f9118i = null;
        this.f9119j = false;
        this.f9120k = new ArrayList();
        this.f9121l = new ArrayList();
        this.f9113d = r4;
    }

    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td r6) {
        ArrayList r62 = this.f9121l;
        Iterator r0 = r62.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        if (((C2628vd) r0.next()).f9119j == true) goto L4;
        return;
    L8:
        this.f9112c = true;
        AbstractC1449gF r1 = this.f9110a;
        if (r1 == null) goto L12;
        r1.mo1546a(this);
    L12:
        if (this.f9111b == false) goto L15;
        this.f9113d.mo1546a(this);
        return;
    L15:
        Iterator r63 = r62.iterator();
        C2628vd r12 = null;
        int r2 = 0;
    L17:
        if (r63.hasNext() == false) goto L22;
        C2628vd r3 = (C2628vd) r63.next();
        if ((r3 instanceof C0750Rd) == true) goto L17;
        r2 = r2 + 1;
        r12 = r3;
        goto L17
    L22:
        if (r12 == null) goto L32;
        if (r2 != 1) goto L32;
        if (r12.f9119j == false) goto L32;
        C0750Rd r64 = this.f9118i;
        if (r64 != null) goto L29;
    L31:
        mo1539d(r12.f9116g + this.f9115f);
        goto L32
    L29:
        if (r64.f9119j == false) goto L44;
        this.f9115f = this.f9117h * r64.f9116g;
        goto L31
    L44:
        return;
    L32:
        AbstractC1449gF r65 = this.f9110a;
        if (r65 == null) goto L45;
        r65.mo1546a(this);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m5143b(AbstractC1449gF r2) {
        this.f9120k.add(r2);
        if (this.f9119j == false) goto L6;
        r2.mo1546a(r2);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m5144c() {
        this.f9121l.clear();
        this.f9120k.clear();
        this.f9119j = false;
        this.f9116g = 0;
        this.f9112c = false;
        this.f9111b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo1539d(int r2) {
        if (this.f9119j == true) goto L9;
        this.f9119j = true;
        this.f9116g = r2;
        Iterator r22 = this.f9120k.iterator();
    L7:
        if (r22.hasNext() == false) goto L11;
        InterfaceC2542td r0 = (InterfaceC2542td) r22.next();
        r0.mo1546a(r0);
        goto L7
    L11:
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.f9113d.f5058b.f8621h0);
        r0.append(":");
        switch(this.f9114e) {
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
        if (this.f9119j == false) goto L16;
        Object r12 = Integer.valueOf(this.f9116g);
    L17:
        r0.append(r12);
        r0.append(") <t=");
        r0.append(this.f9121l.size());
        r0.append(":d=");
        r0.append(this.f9120k.size());
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
