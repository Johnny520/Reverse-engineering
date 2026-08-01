package androidx.compose.runtime.snapshots;

import androidx.collection.C1123;
import java.util.Map;
import p070.InterfaceC7393;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2094 implements Map.Entry, InterfaceC7393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f4000;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2093 f4001;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f4002;

    public C2094(C2093 c2093) {
        this.f4001 = c2093;
        Map.Entry entry = c2093.f3995;
        entry.getClass();
        this.f4002 = entry.getKey();
        Map.Entry entry2 = c2093.f3995;
        entry2.getClass();
        this.f4000 = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4002;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4000;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2093 c2093 = this.f4001;
        C2112 c2112 = c2093.f3999;
        if (c2112.m2812().f4048 != c2093.f3998) {
            C1123.m1400();
            return null;
        }
        Object obj2 = this.f4000;
        c2112.put(this.f4002, obj);
        this.f4000 = obj;
        return obj2;
    }
}
