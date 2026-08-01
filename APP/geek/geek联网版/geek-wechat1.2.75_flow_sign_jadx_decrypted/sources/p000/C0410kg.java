package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: kg */
/* JADX INFO: loaded from: classes.dex */
public class C0410kg implements InterfaceC0333ig {

    /* JADX INFO: renamed from: d */
    public final vb0 f2830d;

    /* JADX INFO: renamed from: f */
    public int f2832f;

    /* JADX INFO: renamed from: g */
    public int f2833g;

    /* JADX INFO: renamed from: a */
    public vb0 f2827a = null;

    /* JADX INFO: renamed from: b */
    public boolean f2828b = false;

    /* JADX INFO: renamed from: c */
    public boolean f2829c = false;

    /* JADX INFO: renamed from: e */
    public int f2831e = 1;

    /* JADX INFO: renamed from: h */
    public int f2834h = 1;

    /* JADX INFO: renamed from: i */
    public C0780ug f2835i = null;

    /* JADX INFO: renamed from: j */
    public boolean f2836j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2837k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f2838l = new ArrayList();

    public C0410kg(vb0 vb0Var) {
        this.f2830d = vb0Var;
    }

    @Override // p000.InterfaceC0333ig
    /* JADX INFO: renamed from: a */
    public final void mo1212a(InterfaceC0333ig interfaceC0333ig) {
        ArrayList arrayList = this.f2838l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((C0410kg) obj).f2836j) {
                return;
            }
        }
        this.f2829c = true;
        vb0 vb0Var = this.f2827a;
        if (vb0Var != null) {
            vb0Var.mo1212a(this);
        }
        if (this.f2828b) {
            this.f2830d.mo1212a(this);
            return;
        }
        int size2 = arrayList.size();
        C0410kg c0410kg = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            C0410kg c0410kg2 = (C0410kg) obj2;
            if (!(c0410kg2 instanceof C0780ug)) {
                i++;
                c0410kg = c0410kg2;
            }
        }
        if (c0410kg != null && i == 1 && c0410kg.f2836j) {
            C0780ug c0780ug = this.f2835i;
            if (c0780ug != null) {
                if (!c0780ug.f2836j) {
                    return;
                } else {
                    this.f2832f = this.f2834h * c0780ug.f2833g;
                }
            }
            mo1684d(c0410kg.f2833g + this.f2832f);
        }
        vb0 vb0Var2 = this.f2827a;
        if (vb0Var2 != null) {
            vb0Var2.mo1212a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1682b(vb0 vb0Var) {
        this.f2837k.add(vb0Var);
        if (this.f2836j) {
            vb0Var.mo1212a(vb0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1683c() {
        this.f2838l.clear();
        this.f2837k.clear();
        this.f2836j = false;
        this.f2833g = 0;
        this.f2829c = false;
        this.f2828b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo1684d(int i) {
        if (this.f2836j) {
            return;
        }
        this.f2836j = true;
        this.f2833g = i;
        ArrayList arrayList = this.f2837k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            InterfaceC0333ig interfaceC0333ig = (InterfaceC0333ig) obj;
            interfaceC0333ig.mo1212a(interfaceC0333ig);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2830d.f4927b.f5393W);
        sb.append(":");
        switch (this.f2831e) {
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
        sb.append(this.f2836j ? Integer.valueOf(this.f2833g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2838l.size());
        sb.append(":d=");
        sb.append(this.f2837k.size());
        sb.append(">");
        return sb.toString();
    }
}
