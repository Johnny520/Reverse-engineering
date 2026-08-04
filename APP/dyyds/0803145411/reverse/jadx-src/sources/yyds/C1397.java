package yyds;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛶᛸᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1397 implements InterfaceC2299 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f6517;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f6522;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final AbstractC1413 f6523;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractC1413 f6515 = null;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f6516 = false;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f6521 = false;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f6514 = 1;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6512 = 1;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0136 f6513 = null;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f6520 = false;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ArrayList f6518 = new ArrayList();

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final ArrayList f6519 = new ArrayList();

    public C1397(AbstractC1413 abstractC1413) {
        this.f6523 = abstractC1413;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6523.f6690.f4387);
        sb.append(":");
        switch (this.f6514) {
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
        sb.append(this.f6520 ? Integer.valueOf(this.f6517) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6519.size());
        sb.append(":d=");
        sb.append(this.f6518.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // yyds.InterfaceC2299
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1395(InterfaceC2299 interfaceC2299) {
        ArrayList<C1397> arrayList = this.f6519;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1397) it.next()).f6520) {
                return;
            }
        }
        this.f6521 = true;
        AbstractC1413 abstractC1413 = this.f6515;
        if (abstractC1413 != null) {
            abstractC1413.mo1395(this);
        }
        if (this.f6516) {
            this.f6523.mo1395(this);
            return;
        }
        C1397 c1397 = null;
        int i = 0;
        for (C1397 c13972 : arrayList) {
            if (!(c13972 instanceof C0136)) {
                i++;
                c1397 = c13972;
            }
        }
        if (c1397 != null && i == 1 && c1397.f6520) {
            C0136 c0136 = this.f6513;
            if (c0136 != null) {
                if (!c0136.f6520) {
                    return;
                } else {
                    this.f6522 = this.f6512 * c0136.f6517;
                }
            }
            mo612(c1397.f6517 + this.f6522);
        }
        AbstractC1413 abstractC14132 = this.f6515;
        if (abstractC14132 != null) {
            abstractC14132.mo1395(this);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2809(AbstractC1413 abstractC1413) {
        this.f6518.add(abstractC1413);
        if (this.f6520) {
            abstractC1413.mo1395(abstractC1413);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2810() {
        this.f6519.clear();
        this.f6518.clear();
        this.f6520 = false;
        this.f6517 = 0;
        this.f6521 = false;
        this.f6516 = false;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public void mo612(int i) {
        if (this.f6520) {
            return;
        }
        this.f6520 = true;
        this.f6517 = i;
        for (InterfaceC2299 interfaceC2299 : this.f6518) {
            interfaceC2299.mo1395(interfaceC2299);
        }
    }
}
