package kotlinx.coroutines;

import kotlinx.coroutines.internal.C5363;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5448 extends AbstractC5450 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Object f15098;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5440 f15099;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5460 f15100;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5464 f15101;

    public C5448(C5460 c5460, C5464 c5464, C5440 c5440, Object obj) {
        this.f15100 = c5460;
        this.f15101 = c5464;
        this.f15099 = c5440;
        this.f15098 = obj;
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10468(Throwable th) {
        C5440 c5440 = this.f15099;
        C5440 c5440M10566 = C5460.m10566(c5440);
        C5460 c5460 = this.f15100;
        C5464 c5464 = this.f15101;
        Object obj = this.f15098;
        if (c5440M10566 == null || !c5460.m10576(c5464, c5440M10566, obj)) {
            c5464.f15122.m10394(new C5363(2), 2);
            C5440 c5440M105662 = C5460.m10566(c5440);
            if (c5440M105662 == null || !c5460.m10576(c5464, c5440M105662, obj)) {
                c5460.mo10383(c5460.m10568(c5464, obj));
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10469() {
        return false;
    }
}
