package yyds;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛷᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1515 extends AbstractC2703 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList f7318;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f7319;

    public C1515(AbstractC2703 abstractC2703) {
        ArrayList arrayList = new ArrayList();
        this.f7318 = arrayList;
        arrayList.add(abstractC2703);
        arrayList.add(null);
        this.f7319 = 2;
    }

    public final String toString() {
        String str;
        int i = this.f7319;
        if (i == 1) {
            str = "&&";
        } else if (i == 2) {
            str = "!";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "||";
        }
        return AbstractC2104.m4014("(", AbstractC0902.m2014(AbstractC2104.m4014(" ", str, " "), "", this.f7318), ")");
    }

    @Override // yyds.InterfaceC0845
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo1922(C0864 c0864) {
        ArrayList arrayList = this.f7318;
        int i = this.f7319;
        if (i == 3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((AbstractC2703) it.next()).mo1922(c0864)) {
                    return true;
                }
            }
            return false;
        }
        if (i != 1) {
            return !((AbstractC2703) arrayList.get(0)).mo1922(c0864);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((AbstractC2703) it2.next()).mo1922(c0864)) {
                return false;
            }
        }
        return true;
    }

    public C1515(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f7318 = arrayList2;
        arrayList2.addAll(arrayList);
        this.f7319 = i;
    }
}
