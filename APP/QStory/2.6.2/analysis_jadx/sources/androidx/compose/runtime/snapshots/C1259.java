package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import java.util.Map;
import p054.InterfaceC6563;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1259 implements Map.Entry, InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f3654;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1258 f3655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f3656;

    public C1259(C1258 c1258) {
        this.f3655 = c1258;
        Map.Entry entry = c1258.f3649;
        entry.getClass();
        this.f3656 = entry.getKey();
        Map.Entry entry2 = c1258.f3649;
        entry2.getClass();
        this.f3654 = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3656;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3654;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1258 c1258 = this.f3655;
        C1277 c1277 = c1258.f3653;
        if (c1277.m2242().f3702 != c1258.f3652) {
            C0276.m839();
            return null;
        }
        Object obj2 = this.f3654;
        c1277.put(this.f3656, obj);
        this.f3654 = obj;
        return obj2;
    }
}
