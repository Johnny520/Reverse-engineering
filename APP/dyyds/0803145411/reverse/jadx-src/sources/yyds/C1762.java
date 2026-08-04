package yyds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛸᛴᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1762 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f8845;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0989 f8846;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f8847;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f8848;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f8849;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2623 f8851;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final HashMap f8850 = new HashMap();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f8844 = 0;

    static {
        new C2337();
    }

    public C1762(C2623 c2623, Object obj, C0989 c0989) {
        AbstractC0902.m2010(obj, "root can not be null");
        AbstractC0902.m2010(c0989, "configuration can not be null");
        this.f8851 = c2623;
        this.f8845 = obj;
        this.f8846 = c0989;
        C0052 c0052 = c0989.f4503;
        ((C0721) c0052.f551).getClass();
        this.f8847 = new C2288();
        ((C0721) c0052.f551).getClass();
        this.f8849 = new C2288();
        new ArrayList();
        this.f8848 = c0989.f4505.contains(EnumC0445.f2270);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3503(String str, AbstractC1614 abstractC1614, Object obj) {
        C0989 c0989 = this.f8846;
        c0989.f4503.m400(this.f8847, this.f8844, obj);
        c0989.f4503.m400(this.f8849, this.f8844, str);
        this.f8844++;
        Collection collection = c0989.f4506;
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            C0188.m794();
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList m3504() {
        ArrayList arrayList = new ArrayList();
        if (this.f8844 > 0) {
            Iterator it = this.f8846.f4503.m379(this.f8849).iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object m3505(boolean z) {
        C2771 c2771 = this.f8851.f12909;
        boolean zM3902 = c2771.m3902();
        Object obj = this.f8847;
        if (!zM3902) {
            return obj;
        }
        Object obj2 = null;
        if (this.f8844 == 0) {
            if (this.f8848) {
                return null;
            }
            throw new C1553("No results for path: " + c2771.toString());
        }
        C0989 c0989 = this.f8846;
        C0052 c0052 = c0989.f4503;
        C0052 c00522 = c0989.f4503;
        int iM408 = c0052.m408(obj);
        if (iM408 > 0) {
            c00522.getClass();
            obj2 = ((List) obj).get(iM408 - 1);
        }
        if (obj2 != null && z) {
            c00522.getClass();
        }
        return obj2;
    }
}
