package p230pb;

import java.util.Collection;
import java.util.LinkedHashSet;
import p244qb.C6379j;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: pb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6059a {
    /* JADX INFO: renamed from: a */
    public static final Collection m24122a(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final C6379j m24123b(Iterable iterable) {
        iterable.getClass();
        C6379j c6379j = new C6379j();
        for (Object obj : iterable) {
            InterfaceC9913k interfaceC9913k = (InterfaceC9913k) obj;
            if (interfaceC9913k != null && interfaceC9913k != InterfaceC9913k.b.f33436b) {
                c6379j.add(obj);
            }
        }
        return c6379j;
    }
}
