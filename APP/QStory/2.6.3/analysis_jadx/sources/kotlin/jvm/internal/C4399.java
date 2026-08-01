package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4399 implements InterfaceC4387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f12976;

    public C4399(Class cls) {
        cls.getClass();
        this.f12976 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4399) {
            return AbstractC4395.m8907(this.f12976, ((C4399) obj).f12976);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12976.hashCode();
    }

    public final String toString() {
        return this.f12976.toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.InterfaceC4387
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo8879() {
        return this.f12976;
    }
}
