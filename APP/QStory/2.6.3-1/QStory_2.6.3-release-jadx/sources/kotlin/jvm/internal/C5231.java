package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5231 implements InterfaceC5219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f13321;

    public C5231(Class cls) {
        cls.getClass();
        this.f13321 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5231) {
            return AbstractC5227.m9466(this.f13321, ((C5231) obj).f13321);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13321.hashCode();
    }

    public final String toString() {
        return this.f13321.toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.InterfaceC5219
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo9438() {
        return this.f13321;
    }
}
