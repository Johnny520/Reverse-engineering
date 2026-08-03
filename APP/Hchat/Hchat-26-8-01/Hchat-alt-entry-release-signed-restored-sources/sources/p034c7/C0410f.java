package p034c7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p047d7.C0721d;
import p124i7.C1993c;
import p379z7.C6108d;
import p379z7.C6112h;

/* JADX INFO: renamed from: c7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0410f implements Comparator, Iterable {

    /* JADX INFO: renamed from: g */
    public final Object f1112g = new Object();

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f1113h;

    /* JADX INFO: renamed from: i */
    public AbstractC0409e[] f1114i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0410f(LinkedHashMap linkedHashMap) {
        this.f1113h = linkedHashMap;
        C1993c c1993c = null;
        for (AbstractC0409e abstractC0409e : linkedHashMap.values()) {
            if (abstractC0409e instanceof C1993c) {
                c1993c = (C1993c) abstractC0409e;
                if (!abstractC0409e.f1108a.startsWith("META-INF/")) {
                    break;
                }
            }
        }
        if (c1993c == null) {
            return;
        }
        C0406b c0406b = c1993c.f6735f;
        C0721d c0721dM1365a = c0406b.m1365a();
        c0721dM1365a.m1927N(c0721dM1365a.f2160p + 4);
        c0406b.m1365a().m1928O(4);
        c0406b.f1106a.m1928O(4);
        c0406b.m1365a().m1928O(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1369a(C0408d c0408d) {
        synchronized (this.f1112g) {
            String strM1368a = c0408d.m1368a();
            LinkedHashMap linkedHashMap = this.f1113h;
            linkedHashMap.remove(strM1368a);
            linkedHashMap.put(strM1368a, c0408d);
            this.f1114i = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC0409e m1370b(String str) {
        AbstractC0409e abstractC0409e;
        synchronized (this.f1112g) {
            abstractC0409e = (AbstractC0409e) this.f1113h.get(str);
        }
        return abstractC0409e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC0409e[] m1371c() {
        synchronized (this.f1112g) {
            try {
                AbstractC0409e[] abstractC0409eArr = this.f1114i;
                if (abstractC0409eArr != null) {
                    return abstractC0409eArr;
                }
                LinkedHashMap linkedHashMap = this.f1113h;
                AbstractC0409e[] abstractC0409eArr2 = new AbstractC0409e[linkedHashMap.size()];
                Iterator it = linkedHashMap.values().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    abstractC0409eArr2[i9] = (AbstractC0409e) it.next();
                    i9++;
                }
                this.f1114i = abstractC0409eArr2;
                return abstractC0409eArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC0409e abstractC0409e = (AbstractC0409e) obj;
        AbstractC0409e abstractC0409e2 = (AbstractC0409e) obj2;
        if (abstractC0409e == abstractC0409e2) {
            return 0;
        }
        if (abstractC0409e == null) {
            return 1;
        }
        if (abstractC0409e2 == null) {
            return -1;
        }
        return Integer.compare(abstractC0409e.f1111d, abstractC0409e2.f1111d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractC0409e[] abstractC0409eArrM1371c = m1371c();
        if (abstractC0409eArrM1371c.length != 0) {
            for (AbstractC0409e abstractC0409e : abstractC0409eArrM1371c) {
                if (abstractC0409e != null) {
                    return new C6108d(abstractC0409eArrM1371c, abstractC0409eArrM1371c.length, null);
                }
            }
        }
        return C6112h.f24664g;
    }
}
