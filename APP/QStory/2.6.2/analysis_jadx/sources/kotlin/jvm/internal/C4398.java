package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4398 implements InterfaceC4386 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f12972;

    public C4398(Class cls) {
        cls.getClass();
        this.f12972 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4398) {
            return AbstractC4394.m8917(this.f12972, ((C4398) obj).f12972);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12972.hashCode();
    }

    public final String toString() {
        return this.f12972.toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.InterfaceC4386
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo8889() {
        return this.f12972;
    }
}
