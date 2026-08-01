package p172;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC5171;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8452 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8452 f20998 = new C8452(EmptySet.INSTANCE, AbstractC5171.m9335());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f20999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f21000;

    public C8452(EmptySet emptySet, Map map) {
        emptySet.getClass();
        this.f21000 = emptySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
        }
        this.f20999 = linkedHashMap;
    }
}
