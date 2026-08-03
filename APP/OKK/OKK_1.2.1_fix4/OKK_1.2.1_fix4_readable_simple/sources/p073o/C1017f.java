package p073o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.f */
/* JADX INFO: loaded from: classes.dex */
public class C1017f implements InterfaceC1015d {

    /* JADX INFO: renamed from: a */
    public AbstractC1024m f3744a;

    /* JADX INFO: renamed from: b */
    public boolean f3745b;

    /* JADX INFO: renamed from: c */
    public boolean f3746c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1024m f3747d;

    /* JADX INFO: renamed from: e */
    public int f3748e;

    /* JADX INFO: renamed from: f */
    public int f3749f;

    /* JADX INFO: renamed from: g */
    public int f3750g;

    /* JADX INFO: renamed from: h */
    public int f3751h;

    /* JADX INFO: renamed from: i */
    public C1018g f3752i;

    /* JADX INFO: renamed from: j */
    public boolean f3753j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f3754k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f3755l;

    public C1017f(AbstractC1024m r4) {
        this.f3744a = null;
        this.f3745b = false;
        this.f3746c = false;
        this.f3748e = 1;
        this.f3751h = 1;
        this.f3752i = null;
        this.f3753j = false;
        this.f3754k = new ArrayList();
        this.f3755l = new ArrayList();
        this.f3747d = r4;
    }

    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d r6) {
        ArrayList r62 = this.f3755l;
        Iterator r02 = r62.iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        if (((C1017f) r02.next()).f3753j == true) goto L4;
        return;
    L8:
        this.f3746c = true;
        AbstractC1024m r1 = this.f3744a;
        if (r1 == null) goto L12;
        r1.mo2445a(this);
    L12:
        if (this.f3745b == false) goto L15;
        this.f3747d.mo2445a(this);
        return;
    L15:
        Iterator r63 = r62.iterator();
        C1017f r12 = null;
        int r2 = 0;
    L17:
        if (r63.hasNext() == false) goto L22;
        C1017f r3 = (C1017f) r63.next();
        if ((r3 instanceof C1018g) == true) goto L17;
        r2 = r2 + 1;
        r12 = r3;
        goto L17
    L22:
        if (r12 == null) goto L33;
        if (r2 != 1) goto L33;
        if (r12.f3753j == false) goto L33;
        C1018g r64 = this.f3752i;
        if (r64 != null) goto L29;
    L32:
        mo2462d(r12.f3750g + this.f3749f);
        goto L33
    L29:
        if (r64.f3753j == false) goto L31;
        this.f3749f = this.f3751h * r64.f3750g;
        goto L32
    L31:
        return;
    L33:
        AbstractC1024m r65 = this.f3744a;
        if (r65 == null) goto L45;
        r65.mo2445a(this);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m2460b(InterfaceC1015d r2) {
        this.f3754k.add(r2);
        if (this.f3753j == false) goto L6;
        r2.mo2445a(r2);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m2461c() {
        this.f3755l.clear();
        this.f3754k.clear();
        this.f3753j = false;
        this.f3750g = 0;
        this.f3746c = false;
        this.f3745b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo2462d(int r2) {
        if (this.f3753j == false) goto L5;
        return;
    L5:
        this.f3753j = true;
        this.f3750g = r2;
        Iterator r22 = this.f3754k.iterator();
    L7:
        if (r22.hasNext() == false) goto L9;
        InterfaceC1015d r02 = (InterfaceC1015d) r22.next();
        r02.mo2445a(r02);
        goto L7
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(this.f3747d.f3763b.f3606W);
        r02.append(":");
        switch(this.f3748e) {
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
        r02.append(r1);
        r02.append("(");
        if (this.f3753j == false) goto L16;
        Object r12 = Integer.valueOf(this.f3750g);
    L17:
        r02.append(r12);
        r02.append(") <t=");
        r02.append(this.f3755l.size());
        r02.append(":d=");
        r02.append(this.f3754k.size());
        r02.append(">");
        return r02.toString();
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
