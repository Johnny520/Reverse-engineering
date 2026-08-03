package p000;

import java.util.ArrayList;
import java.util.Iterator;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: vd */
/* JADX INFO: loaded from: classes.dex */
public class C2628vd implements InterfaceC2542td {

    /* JADX INFO: renamed from: d */
    public final AbstractC1449gF f9113d;

    /* JADX INFO: renamed from: f */
    public int f9115f;

    /* JADX INFO: renamed from: g */
    public int f9116g;

    /* JADX INFO: renamed from: a */
    public AbstractC1449gF f9110a = null;

    /* JADX INFO: renamed from: b */
    public boolean f9111b = false;

    /* JADX INFO: renamed from: c */
    public boolean f9112c = false;

    /* JADX INFO: renamed from: e */
    public int f9114e = 1;

    /* JADX INFO: renamed from: h */
    public int f9117h = 1;

    /* JADX INFO: renamed from: i */
    public C0750Rd f9118i = null;

    /* JADX INFO: renamed from: j */
    public boolean f9119j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f9120k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f9121l = new ArrayList();

    public C2628vd(AbstractC1449gF abstractC1449gF) {
        this.f9113d = abstractC1449gF;
    }

    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td interfaceC2542td) {
        ArrayList<C2628vd> arrayList = this.f9121l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2628vd) it.next()).f9119j) {
                return;
            }
        }
        this.f9112c = true;
        AbstractC1449gF abstractC1449gF = this.f9110a;
        if (abstractC1449gF != null) {
            abstractC1449gF.mo1546a(this);
        }
        if (this.f9111b) {
            this.f9113d.mo1546a(this);
            return;
        }
        C2628vd c2628vd = null;
        int i = 0;
        for (C2628vd c2628vd2 : arrayList) {
            if (!(c2628vd2 instanceof C0750Rd)) {
                i++;
                c2628vd = c2628vd2;
            }
        }
        if (c2628vd != null && i == 1 && c2628vd.f9119j) {
            C0750Rd c0750Rd = this.f9118i;
            if (c0750Rd != null) {
                if (!c0750Rd.f9119j) {
                    return;
                } else {
                    this.f9115f = this.f9117h * c0750Rd.f9116g;
                }
            }
            mo1539d(c2628vd.f9116g + this.f9115f);
        }
        AbstractC1449gF abstractC1449gF2 = this.f9110a;
        if (abstractC1449gF2 != null) {
            abstractC1449gF2.mo1546a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5143b(AbstractC1449gF abstractC1449gF) {
        this.f9120k.add(abstractC1449gF);
        if (this.f9119j) {
            abstractC1449gF.mo1546a(abstractC1449gF);
        }
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
    public void mo1539d(int i) {
        if (this.f9119j) {
            return;
        }
        this.f9119j = true;
        this.f9116g = i;
        for (InterfaceC2542td interfaceC2542td : this.f9120k) {
            interfaceC2542td.mo1546a(interfaceC2542td);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9113d.f5058b.f8621h0);
        sb.append(":");
        switch (this.f9114e) {
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
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f9119j ? Integer.valueOf(this.f9116g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9121l.size());
        sb.append(":d=");
        sb.append(this.f9120k.size());
        sb.append(">");
        return sb.toString();
    }
}
