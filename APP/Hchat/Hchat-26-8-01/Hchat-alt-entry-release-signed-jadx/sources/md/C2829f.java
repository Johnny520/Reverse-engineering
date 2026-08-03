package md;

import ae.C0076g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p023b8.C0205c;
import p068eh.AbstractC0921a;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: md.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2829f {

    /* JADX INFO: renamed from: c */
    public static final Map f9218c;

    /* JADX INFO: renamed from: a */
    public final EnumSet f9219a = EnumSet.noneOf(EnumC2824a.class);

    /* JADX INFO: renamed from: b */
    public Map f9220b = f9218c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int length = EnumC2824a.values().length;
        if (length < 64) {
            f9218c = Collections.EMPTY_MAP;
        } else {
            C0086a.m452k(AbstractC0921a.m2249l(length, "Try to reduce flags count to 64 for use one long in EnumSet, now "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean mo6235a(EnumC2824a enumC2824a) {
        return this.f9219a.contains(enumC2824a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public boolean mo6236b(InterfaceC3124a interfaceC3124a) {
        return this.f9220b.containsKey(interfaceC3124a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public InterfaceC3125b mo6237c(InterfaceC3124a interfaceC3124a) {
        return (InterfaceC3125b) this.f9220b.get(interfaceC3124a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public List mo6238d(C2825b c2825b) {
        C2826c c2826c = (C2826c) mo6237c(c2825b);
        return c2826c == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(c2826c.f9213h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public List mo6239e() {
        EnumSet enumSet = this.f9219a;
        int size = this.f9220b.size() + enumSet.size();
        if (size == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC2824a) it.next()).toString());
        }
        Iterator it2 = this.f9220b.values().iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC3125b) it2.next()).mo2219d());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean mo6240f() {
        return this.f9219a.isEmpty() && this.f9220b.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void mo6241g(EnumC2824a enumC2824a) {
        this.f9219a.remove(enumC2824a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void mo6242h(InterfaceC3124a interfaceC3124a) {
        if (this.f9220b.isEmpty()) {
            return;
        }
        m6243i(new C0076g(interfaceC3124a, 11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m6243i(Consumer consumer) {
        synchronized (this) {
            try {
                Map map = this.f9220b;
                Map map2 = f9218c;
                if (map == map2) {
                    this.f9220b = new IdentityHashMap(2);
                }
                consumer.accept(this.f9220b);
                if (this.f9220b.isEmpty()) {
                    this.f9220b = map2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        List listMo6239e = mo6239e();
        if (listMo6239e.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        listMo6239e.sort(new C0205c(6));
        return AbstractC0921a.m2251n("A[", AbstractC5798s.m10516j(listMo6239e, ", "), "]");
    }
}
