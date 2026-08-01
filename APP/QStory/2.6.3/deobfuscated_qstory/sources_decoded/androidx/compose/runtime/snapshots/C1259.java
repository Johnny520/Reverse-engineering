package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import java.util.Map;
import p054.InterfaceC6564;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1259 implements Map.Entry, InterfaceC6564 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f3655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1258 f3656;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f3657;

    public C1259(C1258 c1258) {
        this.f3656 = c1258;
        Map.Entry entry = c1258.f3650;
        entry.getClass();
        this.f3657 = entry.getKey();
        Map.Entry entry2 = c1258.f3650;
        entry2.getClass();
        this.f3655 = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3657;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3655;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1258 c1258 = this.f3656;
        C1277 c1277 = c1258.f3654;
        if (c1277.m2252().f3703 != c1258.f3653) {
            C0276.m840();
            return null;
        }
        Object obj2 = this.f3655;
        c1277.put(this.f3657, obj);
        this.f3655 = obj;
        return obj2;
    }
}
