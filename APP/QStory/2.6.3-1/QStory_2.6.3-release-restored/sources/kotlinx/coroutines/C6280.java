package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6195;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6280 extends AbstractC6282 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Object f15443;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6272 f15444;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6292 f15445;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6296 f15446;

    public C6280(C6292 c6292, C6296 c6296, C6272 c6272, Object obj) {
        this.f15445 = c6292;
        this.f15446 = c6296;
        this.f15444 = c6272;
        this.f15443 = obj;
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11027(Throwable th) {
        C6272 c6272 = this.f15444;
        C6272 c6272M11125 = C6292.m11125(c6272);
        C6292 c6292 = this.f15445;
        C6296 c6296 = this.f15446;
        Object obj = this.f15443;
        if (c6272M11125 == null || !c6292.m11135(c6296, c6272M11125, obj)) {
            c6296.f15467.m10953(new C6195(2), 2);
            C6272 c6272M111252 = C6292.m11125(c6272);
            if (c6272M111252 == null || !c6292.m11135(c6296, c6272M111252, obj)) {
                c6292.mo10942(c6292.m11127(c6296, obj));
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo11028() {
        return false;
    }
}
