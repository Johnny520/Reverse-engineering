package io.ktor.http.cio;

import java.util.Map;
import p054.InterfaceC6566;
import p253.AbstractC8189;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3961 implements Map.Entry, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3960 f12189;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12190;

    public C3961(C3960 c3960, int i) {
        this.f12189 = c3960;
        this.f12190 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12189.f12188.m8389(this.f12190).toString();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return AbstractC8189.m13660(this.f12189.f12188.m8386(this.f12190).toString());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
