package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: jg */
/* JADX INFO: loaded from: classes.dex */
public class C0373jg implements InterfaceC0297hg {

    /* JADX INFO: renamed from: d */
    public final qb0 f2624d;

    /* JADX INFO: renamed from: f */
    public int f2626f;

    /* JADX INFO: renamed from: g */
    public int f2627g;

    /* JADX INFO: renamed from: a */
    public qb0 f2621a = null;

    /* JADX INFO: renamed from: b */
    public boolean f2622b = false;

    /* JADX INFO: renamed from: c */
    public boolean f2623c = false;

    /* JADX INFO: renamed from: e */
    public int f2625e = 1;

    /* JADX INFO: renamed from: h */
    public int f2628h = 1;

    /* JADX INFO: renamed from: i */
    public C0707sg f2629i = null;

    /* JADX INFO: renamed from: j */
    public boolean f2630j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2631k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f2632l = new ArrayList();

    public C0373jg(qb0 qb0Var) {
        this.f2624d = qb0Var;
    }

    @Override // p000.InterfaceC0297hg
    /* JADX INFO: renamed from: a */
    public final void mo1357a(InterfaceC0297hg interfaceC0297hg) {
        ArrayList arrayList = this.f2632l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((C0373jg) obj).f2630j) {
                return;
            }
        }
        this.f2623c = true;
        qb0 qb0Var = this.f2621a;
        if (qb0Var != null) {
            qb0Var.mo1357a(this);
        }
        if (this.f2622b) {
            this.f2624d.mo1357a(this);
            return;
        }
        int size2 = arrayList.size();
        C0373jg c0373jg = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            C0373jg c0373jg2 = (C0373jg) obj2;
            if (!(c0373jg2 instanceof C0707sg)) {
                i++;
                c0373jg = c0373jg2;
            }
        }
        if (c0373jg != null && i == 1 && c0373jg.f2630j) {
            C0707sg c0707sg = this.f2629i;
            if (c0707sg != null) {
                if (!c0707sg.f2630j) {
                    return;
                } else {
                    this.f2626f = this.f2628h * c0707sg.f2627g;
                }
            }
            mo1597d(c0373jg.f2627g + this.f2626f);
        }
        qb0 qb0Var2 = this.f2621a;
        if (qb0Var2 != null) {
            qb0Var2.mo1357a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1595b(qb0 qb0Var) {
        this.f2631k.add(qb0Var);
        if (this.f2630j) {
            qb0Var.mo1357a(qb0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1596c() {
        this.f2632l.clear();
        this.f2631k.clear();
        this.f2630j = false;
        this.f2627g = 0;
        this.f2623c = false;
        this.f2622b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo1597d(int i) {
        if (this.f2630j) {
            return;
        }
        this.f2630j = true;
        this.f2627g = i;
        ArrayList arrayList = this.f2631k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            InterfaceC0297hg interfaceC0297hg = (InterfaceC0297hg) obj;
            interfaceC0297hg.mo1357a(interfaceC0297hg);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2624d.f4053b.f3846W);
        sb.append(":");
        switch (this.f2625e) {
            case Base64.NO_PADDING /* 1 */:
                str = "UNKNOWN";
                break;
            case Base64.NO_WRAP /* 2 */:
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
        sb.append(this.f2630j ? Integer.valueOf(this.f2627g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2632l.size());
        sb.append(":d=");
        sb.append(this.f2631k.size());
        sb.append(">");
        return sb.toString();
    }
}
