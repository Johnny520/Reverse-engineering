package yyds;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛲᛸᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0422 implements Iterable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2598 f2166;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C2598 f2168;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final WeakHashMap f2165 = new WeakHashMap();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f2167 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((yyds.C1702) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0422)) {
            return false;
        }
        C0422 c0422 = (C0422) obj;
        if (this.f2167 != c0422.f2167) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0422.iterator();
        while (true) {
            C1702 c1702 = (C1702) it;
            if (!c1702.hasNext()) {
                break;
            }
            C1702 c17022 = (C1702) it2;
            if (!c17022.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1702.next();
            Object next = c17022.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C1702 c1702 = (C1702) it;
            if (!c1702.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1702.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1702 c1702 = new C1702(this.f2166, this.f2168, 0);
        this.f2165.put(c1702, Boolean.FALSE);
        return c1702;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1702 c1702 = (C1702) it;
            if (!c1702.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1702.next()).toString());
            if (c1702.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2598 mo1181(Object obj) {
        C2598 c2598 = this.f2166;
        while (c2598 != null && !c2598.f12794.equals(obj)) {
            c2598 = c2598.f12793;
        }
        return c2598;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Object mo1182(Object obj) {
        C2598 c2598Mo1181 = mo1181(obj);
        if (c2598Mo1181 == null) {
            return null;
        }
        this.f2167--;
        WeakHashMap weakHashMap = this.f2165;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1214) it.next()).mo2473(c2598Mo1181);
            }
        }
        C2598 c2598 = c2598Mo1181.f12795;
        C2598 c25982 = c2598Mo1181.f12793;
        if (c2598 != null) {
            c2598.f12793 = c25982;
        } else {
            this.f2166 = c25982;
        }
        C2598 c25983 = c2598Mo1181.f12793;
        if (c25983 != null) {
            c25983.f12795 = c2598;
        } else {
            this.f2168 = c2598;
        }
        c2598Mo1181.f12793 = null;
        c2598Mo1181.f12795 = null;
        return c2598Mo1181.f12796;
    }
}
