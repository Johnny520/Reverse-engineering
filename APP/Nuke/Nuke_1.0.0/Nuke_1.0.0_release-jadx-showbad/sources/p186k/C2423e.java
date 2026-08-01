package p186k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p224q2.C2921l;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: loaded from: classes.dex */
public class C2423e extends C2417N implements Map {

    /* JADX INFO: renamed from: g */
    public C2921l f7835g;

    /* JADX INFO: renamed from: h */
    public C2420b f7836h;

    /* JADX INFO: renamed from: i */
    public C2422d f7837i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        C2921l c2921l = this.f7835g;
        if (c2921l != null) {
            return c2921l;
        }
        C2921l c2921l2 = new C2921l(this, 2);
        this.f7835g = c2921l2;
        return c2921l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m4314k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        C2420b c2420b = this.f7836h;
        if (c2420b != null) {
            return c2420b;
        }
        C2420b c2420b2 = new C2420b(this);
        this.f7836h = c2420b2;
        return c2420b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m4315l(Collection collection) {
        int i5 = this.f7820f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i5 != this.f7820f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        m4300b(map.size() + this.f7820f);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        C2422d c2422d = this.f7837i;
        if (c2422d != null) {
            return c2422d;
        }
        C2422d c2422d2 = new C2422d(this);
        this.f7837i = c2422d2;
        return c2422d2;
    }
}
