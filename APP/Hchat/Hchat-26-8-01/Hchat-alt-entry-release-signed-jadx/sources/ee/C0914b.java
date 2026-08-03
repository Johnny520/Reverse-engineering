package ee;

import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.stream.Collectors;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p302ud.C4305a;
import p302ud.C4320p;

/* JADX INFO: renamed from: ee.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0914b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2854a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap f2855b = new IdentityHashMap();

    /* JADX INFO: renamed from: c */
    public boolean f2856c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2225a(C4305a c4305a) {
        Iterator it = c4305a.f14351l.iterator();
        while (it.hasNext()) {
            m2226b(c4305a, (C4320p) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2226b(C4305a c4305a, C4320p c4320p) {
        this.f2854a.add(c4320p);
        this.f2855b.put(c4320p, c4305a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("{[", (String) this.f2854a.stream().map(new C0640b(16)).collect(Collectors.joining(", ")), "]", this.f2856c ? " complete" : HttpUrl.FRAGMENT_ENCODE_SET, "}");
    }
}
