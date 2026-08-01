package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4756 extends AbstractC4755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4749 f13899;

    public C4756(C4749 c4749) {
        this.f13899 = c4749;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4756) && this.f13899.equals(((C4756) obj).f13899);
    }

    public final int hashCode() {
        return this.f13899.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f13899 + ')';
    }
}
