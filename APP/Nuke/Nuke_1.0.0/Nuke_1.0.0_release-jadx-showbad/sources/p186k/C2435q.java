package p186k;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p191k4.C2475a;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2435q {

    /* JADX INFO: renamed from: a */
    public final int f7861a;

    /* JADX INFO: renamed from: b */
    public final C1753n f7862b;

    /* JADX INFO: renamed from: c */
    public final C2475a f7863c;

    /* JADX INFO: renamed from: d */
    public int f7864d;

    /* JADX INFO: renamed from: e */
    public int f7865e;

    /* JADX INFO: renamed from: f */
    public int f7866f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2435q(int i5) {
        this.f7861a = i5;
        if (i5 <= 0) {
            AbstractC2477a.m4422c("maxSize <= 0");
            throw null;
        }
        this.f7862b = new C1753n(11);
        this.f7863c = new C2475a(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m4326a(Object obj) {
        AbstractC1665j.m2985e(obj, "key");
        synchronized (this.f7863c) {
            C1753n c1753n = this.f7862b;
            c1753n.getClass();
            Object obj2 = ((LinkedHashMap) c1753n.f6028e).get(obj);
            if (obj2 != null) {
                this.f7865e++;
                return obj2;
            }
            this.f7866f++;
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4327b(Object obj, Object obj2) {
        Object objPut;
        AbstractC1665j.m2985e(obj, "key");
        synchronized (this.f7863c) {
            this.f7864d++;
            C1753n c1753n = this.f7862b;
            c1753n.getClass();
            objPut = ((LinkedHashMap) c1753n.f6028e).put(obj, obj2);
            if (objPut != null) {
                this.f7864d--;
            }
        }
        int i5 = this.f7861a;
        while (true) {
            synchronized (this.f7863c) {
                try {
                    if (this.f7864d < 0 || (((LinkedHashMap) this.f7862b.f6028e).isEmpty() && this.f7864d != 0)) {
                        break;
                    }
                    if (this.f7864d <= i5 || ((LinkedHashMap) this.f7862b.f6028e).isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((LinkedHashMap) this.f7862b.f6028e).entrySet();
                    AbstractC1665j.m2984d(setEntrySet, "<get-entries>(...)");
                    Set set = setEntrySet;
                    Object next = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C1753n c1753n2 = this.f7862b;
                    c1753n2.getClass();
                    AbstractC1665j.m2985e(key, "key");
                    ((LinkedHashMap) c1753n2.f6028e).remove(key);
                    int i6 = this.f7864d;
                    AbstractC1665j.m2985e(value, "value");
                    this.f7864d = i6 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        synchronized (this.f7863c) {
            try {
                int i5 = this.f7865e;
                int i6 = this.f7866f + i5;
                str = "LruCache[maxSize=" + this.f7861a + ",hits=" + this.f7865e + ",misses=" + this.f7866f + ",hitRate=" + (i6 != 0 ? (i5 * 100) / i6 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
