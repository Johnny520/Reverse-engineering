package p020b5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import me.C2833a;
import p199nd.AbstractC2963b0;

/* JADX INFO: renamed from: b5.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0189h {

    /* JADX INFO: renamed from: a */
    public HashMap f474a = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m832a(AbstractC2963b0 abstractC2963b0, AbstractC2963b0 abstractC2963b02) {
        if (abstractC2963b0 == abstractC2963b02) {
            return;
        }
        ((Set) this.f474a.computeIfAbsent(abstractC2963b0, new C2833a(12))).add(abstractC2963b02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public C0187f m833b(C0187f c0187f) {
        HashMap map = this.f474a;
        C0187f c0187f2 = (C0187f) map.get(c0187f);
        if (c0187f2 != null) {
            return c0187f2;
        }
        map.put(c0187f, c0187f);
        return c0187f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m834c(BiConsumer biConsumer) {
        for (Map.Entry entry : this.f474a.entrySet()) {
            biConsumer.accept(entry.getKey(), (Set) entry.getValue());
        }
    }
}
