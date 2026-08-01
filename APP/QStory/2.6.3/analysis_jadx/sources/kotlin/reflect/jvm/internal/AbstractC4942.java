package kotlin.reflect.jvm.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.types.C4938;
import p009.AbstractC6183;
import p034.AbstractC6344;
import p047.InterfaceC6489;
import p070.InterfaceC6908;
import p253.AbstractC8190;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4942 extends AbstractC5024 implements InterfaceC5075 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f14301 = {new PropertyReference1Impl(AbstractC4942.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C5069 f14302 = new C5069();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final Object f14303 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5074 f14304;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f14305;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Object f14306;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String f14307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5003 f14308;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f14309;

    public AbstractC4942(AbstractC5003 abstractC5003, String str, String str2, InterfaceC4473 interfaceC4473, Object obj, C5051 c5051) {
        super(c5051);
        this.f14308 = abstractC5003;
        this.f14309 = str;
        this.f14307 = str2;
        this.f14306 = obj;
        this.f14305 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C4954(this, 0));
        this.f14304 = C8667.m14378(interfaceC4473, new C4954(this, 1));
    }

    public final boolean equals(Object obj) {
        InterfaceC5075 interfaceC5075M10064 = AbstractC5067.m10064(obj);
        return interfaceC5075M10064 != null && AbstractC4395.m8907(this.f14308, interfaceC5075M10064.mo9943()) && AbstractC4395.m8907(this.f14309, interfaceC5075M10064.getName()) && AbstractC4395.m8907(this.f14307, interfaceC5075M10064.getSignature()) && AbstractC4395.m8907(this.f14306, interfaceC5075M10064.mo9945());
    }

    @Override // kotlin.jvm.internal.InterfaceC4398
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4388.m8887(this.f14308, this.f14307);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return this.f14309;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5075
    public final String getSignature() {
        return this.f14307;
    }

    public final int hashCode() {
        return this.f14307.hashCode() + AbstractC6183.m11572(this.f14308.hashCode() * 31, 31, this.f14309);
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final boolean isConst() {
        return mo9942().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final boolean isLateinit() {
        return mo9942().mo8997();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isSuspend() {
        return false;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        C5069.m10087(sb, this);
        sb.append(this instanceof InterfaceC5107 ? "var " : "val ");
        C5069.m10085(sb, this);
        C5069.m10086(sb, this.f14309);
        sb.append(": ");
        sb.append(C5069.m10082(getReturnType(), false));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract AbstractC4963 mo9936();

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4473 mo9942() {
        InterfaceC5088 interfaceC5088 = f14301[0];
        Object objInvoke = this.f14304.invoke();
        objInvoke.getClass();
        return (InterfaceC4473) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Member m9938() {
        if (!mo9942().mo9022()) {
            return null;
        }
        C4688 c4688 = AbstractC5068.f14609;
        AbstractC6344 abstractC6344M10080 = AbstractC5068.m10080(mo9942());
        if (abstractC6344M10080 instanceof C5049) {
            C5049 c5049 = (C5049) abstractC6344M10080;
            InterfaceC6908 interfaceC6908 = c5049.f14567;
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = c5049.f14568;
            if (jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) {
                JvmProtoBuf$JvmMethodSignature delegateMethod = jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return this.f14308.m9977(interfaceC6908.getString(delegateMethod.getName()), interfaceC6908.getString(delegateMethod.getDesc()));
            }
        }
        return mo9940();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6489 mo9939() {
        mo9936().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5075
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Field mo9940() {
        return (Field) this.f14305.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6489 mo9941() {
        return mo9936().mo9941();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC5003 mo9943() {
        return this.f14308;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4938 mo9944() {
        AbstractC4882 returnType = mo9942().getReturnType();
        returnType.getClass();
        return new C4938(returnType, AbstractC8190.m13698(this) ? null : new C4954(this, 2), false);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object mo9945() {
        return this.f14306;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC4942(AbstractC5003 abstractC5003, InterfaceC4473 interfaceC4473, C5051 c5051) {
        abstractC5003.getClass();
        interfaceC4473.getClass();
        c5051.getClass();
        String strM9335 = interfaceC4473.getName().m9335();
        strM9335.getClass();
        this(abstractC5003, strM9335, AbstractC5068.m10080(interfaceC4473).mo10001(), interfaceC4473, CallableReference.NO_RECEIVER, c5051);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC4942(AbstractC5003 abstractC5003, String str, String str2, Object obj) {
        this(abstractC5003, str, str2, null, obj, C5051.f14575);
        str.getClass();
        str2.getClass();
    }
}
