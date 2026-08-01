package io.ktor.http.cio;

import java.util.Map;
import p050.AbstractC7176;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4794 implements Map.Entry, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4793 f12538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12539;

    public C4794(C4793 c4793, int i) {
        this.f12538 = c4793;
        this.f12539 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12538.f12537.m8938(this.f12539).toString();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return AbstractC7176.m12487(this.f12538.f12537.m8935(this.f12539).toString());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
