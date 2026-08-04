package yyds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛱᲀᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0197 extends AbstractC2026 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f1163;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final List f1164;

    public C0197(List list, char c) {
        if (list.isEmpty()) {
            throw new C2569("Empty properties");
        }
        this.f1164 = list;
        this.f1163 = Character.toString(c);
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        C0989 c0989 = c1762.f8846;
        c0989.f4503.getClass();
        if (obj instanceof Map) {
            List list = this.f1164;
            if (list.size() == 1 || (m3900() && list.size() > 1)) {
                m3903(str, obj, c1762, list);
                return;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.set(0, (String) it.next());
                m3903(str, obj, c1762, arrayList);
            }
            return;
        }
        if (!m3898() || c0989.f4505.contains(EnumC0445.f2270)) {
            return;
        }
        String name = obj == null ? "null" : obj.getClass().getName();
        throw new C1553("Expected to find an object with property " + mo828() + " in path " + str + " but found '" + name + "'. This is not a json object according to the JsonProvider: '" + c0989.f4503.getClass().getName() + "'.");
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String mo828() {
        return "[" + AbstractC0902.m2014(",", this.f1163, this.f1164) + "]";
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean mo829() {
        List list = this.f1164;
        return list.size() == 1 || (m3900() && list.size() > 1);
    }
}
