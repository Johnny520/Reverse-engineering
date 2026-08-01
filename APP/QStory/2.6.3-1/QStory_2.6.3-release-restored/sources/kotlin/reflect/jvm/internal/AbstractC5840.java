package kotlin.reflect.jvm.internal;

import androidx.compose.p001ui.C2958;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.InterfaceC5215;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import lin.xposed.hook.javaplugin.C6385;
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

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5840 extends AbstractC5839 implements InterfaceC5215, InterfaceC7372, InterfaceC7387, InterfaceC7371, InterfaceC7370, InterfaceC7369, InterfaceC7368, InterfaceC7367, InterfaceC7385, InterfaceC7384, InterfaceC7388, InterfaceC7389, InterfaceC7386, InterfaceC7383, InterfaceC7379, InterfaceC7378, InterfaceC7382, InterfaceC7380, InterfaceC7381, InterfaceC7374, InterfaceC7373, InterfaceC7376, InterfaceC7377, InterfaceC7375, InterfaceC5926, InterfaceC5893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f14775;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14776;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6016 f14777;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6016 f14778;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC6016 f14779;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5835 f14780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14781;

    public AbstractC5840(AbstractC5835 abstractC5835, String str, Object obj) {
        this.f14780 = abstractC5835;
        this.f14781 = str;
        this.f14776 = obj;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14775 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5841(this, 0));
        this.f14778 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5841(this, 1));
        this.f14779 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5841(this, 2));
        this.f14777 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5841(this, 3));
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
        return interfaceC5893 != null && AbstractC5227.m9466(this.f14780, interfaceC5893.mo10502()) && AbstractC5227.m9466(getName(), interfaceC5893.getName()) && AbstractC5227.m9466(this.f14781, interfaceC5893.getSignature()) && AbstractC5227.m9466(this.f14776, interfaceC5893.mo10504());
    }

    @Override // kotlin.jvm.internal.InterfaceC5230
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC5220.m9446(this.f14780, this.f14781);
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        Member memberMo12555 = mo10500().mo12555();
        AnnotatedElement annotatedElement = memberMo12555 instanceof AnnotatedElement ? (AnnotatedElement) memberMo12555 : null;
        if (annotatedElement == null) {
            return EmptyList.INSTANCE;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return AbstractC5899.m10625(AbstractC5179.m9405(annotations));
    }

    @Override // kotlin.jvm.internal.InterfaceC5215
    public final int getArity() {
        InterfaceC7318 interfaceC7318Mo10500 = mo10500();
        interfaceC7318Mo10500.getClass();
        return interfaceC7318Mo10500.getParameterTypes().size();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getParameters() {
        return (List) this.f14778.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5893
    public final String getSignature() {
        return this.f14781;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getTypeParameters() {
        return mo10524().f14958;
    }

    public final int hashCode() {
        return this.f14781.hashCode() + ((getName().hashCode() + (this.f14780.hashCode() * 31)) * 31);
    }

    @Override // p068.InterfaceC7377
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(C2958.f6621, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public final String toString() {
        return C5901.m10643(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract List mo10523();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract C5902 mo10524();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract C5348 mo10525();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract C5366 mo10526();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7318 mo10498() {
        return (InterfaceC7318) this.f14777.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7318 mo10500() {
        return (InterfaceC7318) this.f14779.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo10520() {
        return (List) this.f14775.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract List mo10527();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC7333 m10545(Method method, boolean z) {
        if (!AbstractC5894.m10601(this)) {
            return new C7324(6, 2, method, false);
        }
        if (this.f14780 instanceof C5824) {
            return new C7332(method, z, AbstractC5894.m10608(this));
        }
        C6385.m11431(this, "Only top-level functions are supported for now: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5835 mo10502() {
        return this.f14780;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7323 m10546(Constructor constructor, boolean z) {
        List parameters;
        if (!z && (this instanceof C5838)) {
            C5838 c5838 = (C5838) this;
            if (c5838.getVisibility() != KVisibility.PRIVATE && ((parameters = c5838.getParameters()) == null || !parameters.isEmpty())) {
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    InterfaceC5925 interfaceC5925M10651 = AbstractC5913.m10651(((InterfaceC5940) it.next()).getType());
                    if (interfaceC5925M10651.mo9443() && !interfaceC5925M10651.equals(AbstractC5228.f13320.mo9476(Result.class))) {
                        return AbstractC5894.m10601(this) ? new C7317(constructor, AbstractC5894.m10608(this), 0) : new C7336(constructor, 0);
                    }
                }
            }
        }
        return AbstractC5894.m10601(this) ? new C7317(constructor, AbstractC5894.m10608(this), 1) : new C7336(constructor, 1);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo10504() {
        return this.f14776;
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
}
