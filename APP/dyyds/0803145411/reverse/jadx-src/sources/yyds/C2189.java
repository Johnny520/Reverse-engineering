package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲁᛲᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2189 extends AbstractC2026 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final List f10756;

    public C2189(C1205 c1205) {
        this.f10756 = Collections.singletonList(c1205);
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        C0989 c0989 = c1762.f8846;
        Object obj2 = c1762.f8845;
        c0989.f4503.getClass();
        if (obj instanceof Map) {
            if (m4181(obj, obj2, c0989, c1762)) {
                boolean zM3900 = m3900();
                C0706 c0706 = AbstractC1614.f8231;
                if (zM3900) {
                    c1762.m3503(str, c0706, obj);
                    return;
                } else {
                    m3899().mo827(str, c0706, obj, c1762);
                    return;
                }
            }
            return;
        }
        c0989.f4503.getClass();
        if (!(obj instanceof List)) {
            if (m3898()) {
                throw new C2569(String.format("Filter: %s can not be applied to primitives. Current context is: %s", toString(), obj));
            }
            return;
        }
        Iterator it = c0989.f4503.m379(obj).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (m4181(it.next(), obj2, c0989, c1762)) {
                m3901(i, str, obj, c1762);
            }
            i++;
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final String mo828() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.f10756.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("?");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo829() {
        return false;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean m4181(Object obj, Object obj2, C0989 c0989, C1762 c1762) {
        C0864 c0864 = new C0864(obj, obj2, c0989, c1762.f8850);
        Iterator it = this.f10756.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC0845) it.next()).mo1922(c0864)) {
                return false;
            }
        }
        return true;
    }

    public C2189(ArrayList arrayList) {
        this.f10756 = arrayList;
    }
}
