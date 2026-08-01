package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zs0 extends AbstractC0647qc implements u40 {

    /* JADX INFO: renamed from: d */
    public final boolean f7991d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zs0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f7991d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getReflected()Lm40; */
    @Override // p000.AbstractC0647qc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final u40 getReflected() {
        if (this.f7991d) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        m40 m40VarCompute = compute();
        if (m40VarCompute != this) {
            return (u40) m40VarCompute;
        }
        throw new C0096cl("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0647qc
    public final m40 compute() {
        return this.f7991d ? this : super.compute();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zs0) {
            zs0 zs0Var = (zs0) obj;
            return getOwner().equals(zs0Var.getOwner()) && getName().equals(zs0Var.getName()) && getSignature().equals(zs0Var.getSignature()) && p30.m3002l(getBoundReceiver(), zs0Var.getBoundReceiver());
        }
        if (obj instanceof u40) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        m40 m40VarCompute = compute();
        if (m40VarCompute != this) {
            return m40VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
