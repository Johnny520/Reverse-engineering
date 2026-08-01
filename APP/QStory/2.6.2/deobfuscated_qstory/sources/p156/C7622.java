package p156;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4338;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7622 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7622 f20658 = new C7622(EmptySet.INSTANCE, AbstractC4338.m8781());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f20659;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f20660;

    public C7622(EmptySet emptySet, Map map) {
        emptySet.getClass();
        this.f20660 = emptySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
        }
        this.f20659 = linkedHashMap;
    }
}
