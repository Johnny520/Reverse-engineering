package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.types.C4937;
import p007.AbstractC6136;
import p047.InterfaceC6488;
import p070.InterfaceC6907;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4941 extends AbstractC5023 implements InterfaceC5074 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f14299 = {new PropertyReference1Impl(AbstractC4941.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C5068 f14300 = new C5068();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final Object f14301 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5073 f14302;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f14303;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Object f14304;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String f14305;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5002 f14306;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f14307;

    public AbstractC4941(AbstractC5002 abstractC5002, String str, String str2, InterfaceC4472 interfaceC4472, Object obj, C5050 c5050) {
        super(c5050);
        this.f14306 = abstractC5002;
        this.f14307 = str;
        this.f14305 = str2;
        this.f14304 = obj;
        this.f14303 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C4953(this, 0));
        this.f14302 = AbstractC3055.m6635(interfaceC4472, new C4953(this, 1));
    }

    public final boolean equals(Object obj) {
        InterfaceC5074 interfaceC5074M10060 = AbstractC5066.m10060(obj);
        return interfaceC5074M10060 != null && AbstractC4394.m8917(this.f14306, interfaceC5074M10060.mo9946()) && AbstractC4394.m8917(this.f14307, interfaceC5074M10060.getName()) && AbstractC4394.m8917(this.f14305, interfaceC5074M10060.getSignature()) && AbstractC4394.m8917(this.f14304, interfaceC5074M10060.mo9948());
    }

    @Override // kotlin.jvm.internal.InterfaceC4397
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4387.m8897(this.f14306, this.f14305);
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        return this.f14307;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5074
    public final String getSignature() {
        return this.f14305;
    }

    public final int hashCode() {
        return this.f14305.hashCode() + AbstractC6136.m11539(this.f14306.hashCode() * 31, 31, this.f14307);
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final boolean isConst() {
        return mo9945().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final boolean isLateinit() {
        return mo9945().mo9007();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isSuspend() {
        return false;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        C5068.m10083(sb, this);
        sb.append(this instanceof InterfaceC5106 ? "var " : "val ");
        C5068.m10081(sb, this);
        C5068.m10082(sb, this.f14307);
        sb.append(": ");
        sb.append(C5068.m10078(getReturnType(), false));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract AbstractC4962 mo9939();

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4472 mo9945() {
        InterfaceC5087 interfaceC5087 = f14299[0];
        Object objInvoke = this.f14302.invoke();
        objInvoke.getClass();
        return (InterfaceC4472) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Member m9941() {
        if (!mo9945().mo9032()) {
            return null;
        }
        C4687 c4687 = AbstractC5067.f14609;
        AbstractC8189 abstractC8189M10076 = AbstractC5067.m10076(mo9945());
        if (abstractC8189M10076 instanceof C5048) {
            C5048 c5048 = (C5048) abstractC8189M10076;
            InterfaceC6907 interfaceC6907 = c5048.f14564;
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = c5048.f14565;
            if (jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) {
                JvmProtoBuf$JvmMethodSignature delegateMethod = jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return this.f14306.m9980(interfaceC6907.getString(delegateMethod.getName()), interfaceC6907.getString(delegateMethod.getDesc()));
            }
        }
        return mo9943();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6488 mo9942() {
        mo9939().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5074
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Field mo9943() {
        return (Field) this.f14303.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6488 mo9944() {
        return mo9939().mo9944();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC5002 mo9946() {
        return this.f14306;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4937 mo9947() {
        AbstractC4881 returnType = mo9945().getReturnType();
        returnType.getClass();
        return new C4937(returnType, AbstractC3056.m6675(this) ? null : new C4953(this, 2), false);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object mo9948() {
        return this.f14304;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC4941(AbstractC5002 abstractC5002, InterfaceC4472 interfaceC4472, C5050 c5050) {
        abstractC5002.getClass();
        interfaceC4472.getClass();
        c5050.getClass();
        String strM9345 = interfaceC4472.getName().m9345();
        strM9345.getClass();
        this(abstractC5002, strM9345, AbstractC5067.m10076(interfaceC4472).mo10004(), interfaceC4472, CallableReference.NO_RECEIVER, c5050);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC4941(AbstractC5002 abstractC5002, String str, String str2, Object obj) {
        this(abstractC5002, str, str2, null, obj, C5050.f14573);
        str.getClass();
        str2.getClass();
    }
}
