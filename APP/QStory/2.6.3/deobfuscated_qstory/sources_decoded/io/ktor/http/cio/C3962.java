package io.ktor.http.cio;

import java.util.Map;
import p034.AbstractC6347;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3962 implements Map.Entry, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3961 f12193;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12194;

    public C3962(C3961 c3961, int i) {
        this.f12193 = c3961;
        this.f12194 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12193.f12192.m8379(this.f12194).toString();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return AbstractC6347.m11928(this.f12193.f12192.m8376(this.f12194).toString());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
