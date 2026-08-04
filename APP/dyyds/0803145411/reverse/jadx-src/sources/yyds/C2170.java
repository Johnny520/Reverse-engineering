package yyds;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲁᛱᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2170 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final LinkedHashMap f10639 = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long f10640;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public long f10641;

    public C2170(long j) {
        this.f10640 = j;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final synchronized void m4133(long j) {
        while (this.f10641 > j) {
            Iterator it = this.f10639.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C2689 c2689 = (C2689) entry.getValue();
            this.f10641 -= (long) c2689.f13223;
            Object key = entry.getKey();
            it.remove();
            mo1478(key, c2689.f13222);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final synchronized Object m4134(Object obj) {
        C2689 c2689;
        c2689 = (C2689) this.f10639.get(obj);
        return c2689 != null ? c2689.f13222 : null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public int mo1477(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo1478(Object obj, Object obj2) {
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final synchronized Object m4135(Object obj, Object obj2) {
        int iMo1477 = mo1477(obj2);
        long j = iMo1477;
        if (j >= this.f10640) {
            mo1478(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f10641 += j;
        }
        C2689 c2689 = (C2689) this.f10639.put(obj, obj2 == null ? null : new C2689(iMo1477, obj2));
        if (c2689 != null) {
            this.f10641 -= (long) c2689.f13223;
            if (!c2689.f13222.equals(obj2)) {
                mo1478(obj, c2689.f13222);
            }
        }
        m4133(this.f10640);
        return c2689 != null ? c2689.f13222 : null;
    }
}
