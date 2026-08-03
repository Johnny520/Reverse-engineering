package p073o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.f */
/* JADX INFO: loaded from: classes.dex */
public class C1017f implements InterfaceC1015d {

    /* JADX INFO: renamed from: d */
    public final AbstractC1024m f3747d;

    /* JADX INFO: renamed from: f */
    public int f3749f;

    /* JADX INFO: renamed from: g */
    public int f3750g;

    /* JADX INFO: renamed from: a */
    public AbstractC1024m f3744a = null;

    /* JADX INFO: renamed from: b */
    public boolean f3745b = false;

    /* JADX INFO: renamed from: c */
    public boolean f3746c = false;

    /* JADX INFO: renamed from: e */
    public int f3748e = 1;

    /* JADX INFO: renamed from: h */
    public int f3751h = 1;

    /* JADX INFO: renamed from: i */
    public C1018g f3752i = null;

    /* JADX INFO: renamed from: j */
    public boolean f3753j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f3754k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f3755l = new ArrayList();

    public C1017f(AbstractC1024m abstractC1024m) {
        this.f3747d = abstractC1024m;
    }

    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d interfaceC1015d) {
        ArrayList<C1017f> arrayList = this.f3755l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1017f) it.next()).f3753j) {
                return;
            }
        }
        this.f3746c = true;
        AbstractC1024m abstractC1024m = this.f3744a;
        if (abstractC1024m != null) {
            abstractC1024m.mo2445a(this);
        }
        if (this.f3745b) {
            this.f3747d.mo2445a(this);
            return;
        }
        C1017f c1017f = null;
        int i2 = 0;
        for (C1017f c1017f2 : arrayList) {
            if (!(c1017f2 instanceof C1018g)) {
                i2++;
                c1017f = c1017f2;
            }
        }
        if (c1017f != null && i2 == 1 && c1017f.f3753j) {
            C1018g c1018g = this.f3752i;
            if (c1018g != null) {
                if (!c1018g.f3753j) {
                    return;
                } else {
                    this.f3749f = this.f3751h * c1018g.f3750g;
                }
            }
            mo2462d(c1017f.f3750g + this.f3749f);
        }
        AbstractC1024m abstractC1024m2 = this.f3744a;
        if (abstractC1024m2 != null) {
            abstractC1024m2.mo2445a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2460b(InterfaceC1015d interfaceC1015d) {
        this.f3754k.add(interfaceC1015d);
        if (this.f3753j) {
            interfaceC1015d.mo2445a(interfaceC1015d);
        }
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
    public void mo2462d(int i2) {
        if (this.f3753j) {
            return;
        }
        this.f3753j = true;
        this.f3750g = i2;
        for (InterfaceC1015d interfaceC1015d : this.f3754k) {
            interfaceC1015d.mo2445a(interfaceC1015d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3747d.f3763b.f3606W);
        sb.append(":");
        switch (this.f3748e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f3753j ? Integer.valueOf(this.f3750g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3755l.size());
        sb.append(":d=");
        sb.append(this.f3754k.size());
        sb.append(">");
        return sb.toString();
    }
}
