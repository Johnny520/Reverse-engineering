package kotlinx.coroutines;

import kotlinx.coroutines.internal.C5362;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5447 extends AbstractC5449 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Object f15098;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5439 f15099;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5459 f15100;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5463 f15101;

    public C5447(C5459 c5459, C5463 c5463, C5439 c5439, Object obj) {
        this.f15100 = c5459;
        this.f15101 = c5463;
        this.f15099 = c5439;
        this.f15098 = obj;
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10464(Throwable th) {
        C5439 c5439 = this.f15099;
        C5439 c5439M10562 = C5459.m10562(c5439);
        C5459 c5459 = this.f15100;
        C5463 c5463 = this.f15101;
        Object obj = this.f15098;
        if (c5439M10562 == null || !c5459.m10573(c5463, c5439M10562, obj)) {
            c5463.f15122.m10390(new C5362(2), 2);
            C5439 c5439M105622 = C5459.m10562(c5439);
            if (c5439M105622 == null || !c5459.m10573(c5463, c5439M105622, obj)) {
                c5459.mo10379(c5459.m10566(c5463, obj));
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10465() {
        return false;
    }
}
