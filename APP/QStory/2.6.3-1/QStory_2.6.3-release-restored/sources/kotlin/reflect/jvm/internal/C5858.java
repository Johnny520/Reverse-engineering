package kotlin.reflect.jvm.internal;

import androidx.compose.p001ui.C2958;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.InterfaceC5215;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.C5770;
import p063.AbstractC7323;
import p063.AbstractC7333;
import p063.C7317;
import p063.C7324;
import p063.C7332;
import p063.C7336;
import p063.InterfaceC7318;
import p068.InterfaceC7367;
import p068.InterfaceC7368;
import p068.InterfaceC7369;
import p068.InterfaceC7370;
import p068.InterfaceC7371;
import p068.InterfaceC7372;
import p068.InterfaceC7373;
import p068.InterfaceC7374;
import p068.InterfaceC7375;
import p068.InterfaceC7376;
import p068.InterfaceC7377;
import p068.InterfaceC7378;
import p068.InterfaceC7379;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7382;
import p068.InterfaceC7383;
import p068.InterfaceC7384;
import p068.InterfaceC7385;
import p068.InterfaceC7386;
import p068.InterfaceC7387;
import p068.InterfaceC7388;
import p068.InterfaceC7389;
import p082.AbstractC7699;
import p082.AbstractC7708;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7838;
import p095.C7835;
import p095.C7847;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5858 extends AbstractC5856 implements InterfaceC5215, InterfaceC7372, InterfaceC7387, InterfaceC7371, InterfaceC7370, InterfaceC7369, InterfaceC7368, InterfaceC7367, InterfaceC7385, InterfaceC7384, InterfaceC7388, InterfaceC7389, InterfaceC7386, InterfaceC7383, InterfaceC7379, InterfaceC7378, InterfaceC7382, InterfaceC7380, InterfaceC7381, InterfaceC7374, InterfaceC7373, InterfaceC7376, InterfaceC7377, InterfaceC7375, InterfaceC5926, InterfaceC5893 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14838 = {new PropertyReference1Impl(C5858.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f14839;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f14840;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5906 f14841;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f14842;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5835 f14843;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f14844;

    public C5858(AbstractC5835 abstractC5835, String str, String str2, InterfaceC5316 interfaceC5316, Object obj, C5883 c5883) {
        super(c5883);
        this.f14843 = abstractC5835;
        this.f14844 = str2;
        this.f14842 = obj;
        int i = 0;
        this.f14841 = C9496.m14937(interfaceC5316, new C5860(this, i, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14840 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5861(this, i));
        this.f14839 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5861(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        InterfaceC5893 interfaceC5893;
        C5519 c5519 = AbstractC5899.f14953;
        if (obj instanceof InterfaceC5893) {
            interfaceC5893 = (InterfaceC5893) obj;
        } else if (obj instanceof FunctionReference) {
            InterfaceC5926 interfaceC5926Compute = ((FunctionReference) obj).compute();
            interfaceC5893 = interfaceC5926Compute instanceof InterfaceC5893 ? (InterfaceC5893) interfaceC5926Compute : null;
        }
        return interfaceC5893 != null && AbstractC5227.m9466(this.f14843, interfaceC5893.mo10502()) && getName().equals(interfaceC5893.getName()) && AbstractC5227.m9466(this.f14844, interfaceC5893.getSignature()) && AbstractC5227.m9466(this.f14842, interfaceC5893.mo10504());
    }

    @Override // kotlin.jvm.internal.InterfaceC5230
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC5220.m9446(this.f14843, this.f14844);
    }

    @Override // kotlin.jvm.internal.InterfaceC5215
    public final int getArity() {
        InterfaceC7318 interfaceC7318Mo10500 = mo10500();
        interfaceC7318Mo10500.getClass();
        return interfaceC7318Mo10500.getParameterTypes().size();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        String strM9894 = ((AbstractC7838) mo10501()).getName().m9894();
        strM9894.getClass();
        return strM9894;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5893
    public final String getSignature() {
        return this.f14844;
    }

    public final int hashCode() {
        return this.f14844.hashCode() + ((getName().hashCode() + (this.f14843.hashCode() * 31)) * 31);
    }

    @Override // p068.InterfaceC7377
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(C2958.f6621, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isExternal() {
        return this.f14834.f14922 || mo10501().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInfix() {
        return this.f14834.f14928 || mo10501().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInline() {
        return this.f14834.f14927 || mo10501().isInline();
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isOperator() {
        return this.f14834.f14921 || mo10501().isOperator();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isSuspend() {
        return mo10501().isSuspend();
    }

    public final String toString() {
        return C5901.m10643(this);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC5316 mo10501() {
        InterfaceC5920 interfaceC5920 = f14838[0];
        Object objInvoke = this.f14841.invoke();
        objInvoke.getClass();
        return (InterfaceC5316) objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC7333 m10552(Method method, boolean z) {
        Object objM10608;
        if (!AbstractC5894.m10601(this)) {
            return new C7324(6, 2, method, false);
        }
        C7835 c7835Mo9593 = mo10501().mo9593();
        if (c7835Mo9593 != null) {
            AbstractC5714 type = c7835Mo9593.getType();
            int i = AbstractC7708.f18668;
            InterfaceC5309 interfaceC5309Mo9770 = type.mo10281().mo9770();
            if (interfaceC5309Mo9770 != null ? AbstractC7708.m12715(interfaceC5309Mo9770) : false) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) AbstractC5179.m9387(parameterTypes);
                objM10608 = (cls == null || !cls.isInterface()) ? AbstractC5894.m10608(this) : this.f14842;
            }
        }
        return new C7332(method, z, objM10608);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC7323 m10553(Constructor constructor, InterfaceC5316 interfaceC5316, boolean z) {
        if (!z) {
            C7847 c7847 = interfaceC5316 instanceof C7847 ? (C7847) interfaceC5316 : null;
            if (c7847 != null && !AbstractC5321.m9626(c7847.getVisibility())) {
                AbstractC7818 abstractC7818M12923 = c7847.m12923();
                abstractC7818M12923.getClass();
                if (!AbstractC7708.m12714(abstractC7818M12923) && !AbstractC7699.m12670(c7847.m12923())) {
                    List listMo9594 = c7847.mo9594();
                    listMo9594.getClass();
                    if (!listMo9594.isEmpty()) {
                        Iterator it = listMo9594.iterator();
                        while (it.hasNext()) {
                            AbstractC5714 type = ((AbstractC7806) ((InterfaceC5288) it.next())).getType();
                            type.getClass();
                            if (AbstractC5894.m10586(type)) {
                                return AbstractC5894.m10601(this) ? new C7317(constructor, AbstractC5894.m10608(this), 0) : new C7336(constructor, 0);
                            }
                        }
                    }
                }
            }
        }
        return AbstractC5894.m10601(this) ? new C7317(constructor, AbstractC5894.m10608(this), 1) : new C7336(constructor, 1);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5856 mo10506(C5883 c5883) {
        return new C5858(this.f14843, mo10501(), c5883);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7318 mo10498() {
        return (InterfaceC7318) this.f14839.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7318 mo10500() {
        return (InterfaceC7318) this.f14840.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5835 mo10502() {
        return this.f14843;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C5770 mo10503() {
        AbstractC5714 returnType = mo10501().getReturnType();
        returnType.getClass();
        return new C5770(returnType, new C5861(this, 2), false);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo10504() {
        return this.f14842;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // p068.InterfaceC7374
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // p068.InterfaceC7373
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // p068.InterfaceC7376
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        return call(new Object[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C5858(AbstractC5835 abstractC5835, InterfaceC5316 interfaceC5316, C5883 c5883) {
        abstractC5835.getClass();
        interfaceC5316.getClass();
        c5883.getClass();
        String strM9894 = ((AbstractC7838) interfaceC5316).getName().m9894();
        strM9894.getClass();
        this(abstractC5835, strM9894, AbstractC5900.m10638(interfaceC5316).mo10554(), interfaceC5316, CallableReference.NO_RECEIVER, c5883);
    }

    public C5858(AbstractC5835 abstractC5835, InterfaceC5316 interfaceC5316) {
        this(abstractC5835, interfaceC5316, C5883.f14920);
    }
}
