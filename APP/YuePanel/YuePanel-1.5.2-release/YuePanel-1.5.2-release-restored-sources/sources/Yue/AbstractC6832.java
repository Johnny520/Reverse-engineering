package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6832 extends AbstractC3648 implements InterfaceC5604 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f17733;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6832() {
        this.f17733 = false;
    }

    @Override // Yue.AbstractC3648
    public InterfaceC5584 compute() {
        return this.f17733 ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6832) {
            AbstractC6832 abstractC6832 = (AbstractC6832) obj;
            return getOwner().equals(abstractC6832.getOwner()) && getName().equals(abstractC6832.getName()) && getSignature().equals(abstractC6832.getSignature()) && C5499.m17094(getBoundReceiver(), abstractC6832.getBoundReceiver());
        }
        if (obj instanceof InterfaceC5604) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC5584 interfaceC5584Compute = compute();
        if (interfaceC5584Compute != this) {
            return interfaceC5584Compute.toString();
        }
        return "property " + getName() + C7071.f2662;
    }

    @Override // Yue.InterfaceC5604
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo17382() {
        return getReflected().mo17382();
    }

    @Override // Yue.InterfaceC5604
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public boolean mo17383() {
        return getReflected().mo17383();
    }

    /* JADX DEBUG: Method merged with bridge method: getReflected()LYue/ۥ۠ۦۢۡ; */
    @Override // Yue.AbstractC3648
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceC5604 getReflected() {
        if (this.f17733) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (InterfaceC5604) super.getReflected();
    }

    @InterfaceC7470(version = "1.1")
    public AbstractC6832(Object obj) {
        super(obj);
        this.f17733 = false;
    }

    @InterfaceC7470(version = "1.4")
    public AbstractC6832(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f17733 = (i & 2) == 2;
    }
}
