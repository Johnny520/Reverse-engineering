package kotlin.reflect.jvm.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5939;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.C5770;
import p025.AbstractC7012;
import p050.AbstractC7173;
import p063.InterfaceC7318;
import p086.InterfaceC7737;
import p269.AbstractC9019;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5774 extends AbstractC5856 implements InterfaceC5907 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14646 = {new PropertyReference1Impl(AbstractC5774.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C5901 f14647 = new C5901();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final Object f14648 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5906 f14649;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f14650;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Object f14651;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String f14652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5835 f14653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f14654;

    public AbstractC5774(AbstractC5835 abstractC5835, String str, String str2, InterfaceC5305 interfaceC5305, Object obj, C5883 c5883) {
        super(c5883);
        this.f14653 = abstractC5835;
        this.f14654 = str;
        this.f14652 = str2;
        this.f14651 = obj;
        this.f14650 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5786(this, 0));
        this.f14649 = C9496.m14937(interfaceC5305, new C5786(this, 1));
    }

    public final boolean equals(Object obj) {
        InterfaceC5907 interfaceC5907M10623 = AbstractC5899.m10623(obj);
        return interfaceC5907M10623 != null && AbstractC5227.m9466(this.f14653, interfaceC5907M10623.mo10502()) && AbstractC5227.m9466(this.f14654, interfaceC5907M10623.getName()) && AbstractC5227.m9466(this.f14652, interfaceC5907M10623.getSignature()) && AbstractC5227.m9466(this.f14651, interfaceC5907M10623.mo10504());
    }

    @Override // kotlin.jvm.internal.InterfaceC5230
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC5220.m9446(this.f14653, this.f14652);
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return this.f14654;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5907
    public final String getSignature() {
        return this.f14652;
    }

    public final int hashCode() {
        return this.f14652.hashCode() + AbstractC7012.m12131(this.f14653.hashCode() * 31, 31, this.f14654);
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final boolean isConst() {
        return mo10501().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final boolean isLateinit() {
        return mo10501().mo9556();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isSuspend() {
        return false;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        C5901.m10646(sb, this);
        sb.append(this instanceof InterfaceC5939 ? "var " : "val ");
        C5901.m10644(sb, this);
        C5901.m10645(sb, this.f14654);
        sb.append(": ");
        sb.append(C5901.m10641(getReturnType(), false));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract AbstractC5795 mo10495();

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC5305 mo10501() {
        InterfaceC5920 interfaceC5920 = f14646[0];
        Object objInvoke = this.f14649.invoke();
        objInvoke.getClass();
        return (InterfaceC5305) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Member m10497() {
        if (!mo10501().mo9581()) {
            return null;
        }
        C5520 c5520 = AbstractC5900.f14954;
        AbstractC7173 abstractC7173M10639 = AbstractC5900.m10639(mo10501());
        if (abstractC7173M10639 instanceof C5881) {
            C5881 c5881 = (C5881) abstractC7173M10639;
            InterfaceC7737 interfaceC7737 = c5881.f14912;
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = c5881.f14913;
            if (jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) {
                JvmProtoBuf$JvmMethodSignature delegateMethod = jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return this.f14653.m10536(interfaceC7737.getString(delegateMethod.getName()), interfaceC7737.getString(delegateMethod.getDesc()));
            }
        }
        return mo10499();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7318 mo10498() {
        mo10495().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5907
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Field mo10499() {
        return (Field) this.f14650.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7318 mo10500() {
        return mo10495().mo10500();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC5835 mo10502() {
        return this.f14653;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5770 mo10503() {
        AbstractC5714 returnType = mo10501().getReturnType();
        returnType.getClass();
        return new C5770(returnType, AbstractC9019.m14257(this) ? null : new C5786(this, 2), false);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object mo10504() {
        return this.f14651;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5774(AbstractC5835 abstractC5835, InterfaceC5305 interfaceC5305, C5883 c5883) {
        abstractC5835.getClass();
        interfaceC5305.getClass();
        c5883.getClass();
        String strM9894 = interfaceC5305.getName().m9894();
        strM9894.getClass();
        this(abstractC5835, strM9894, AbstractC5900.m10639(interfaceC5305).mo10560(), interfaceC5305, CallableReference.NO_RECEIVER, c5883);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC5774(AbstractC5835 abstractC5835, String str, String str2, Object obj) {
        this(abstractC5835, str, str2, null, obj, C5883.f14920);
        str.getClass();
        str2.getClass();
    }
}
