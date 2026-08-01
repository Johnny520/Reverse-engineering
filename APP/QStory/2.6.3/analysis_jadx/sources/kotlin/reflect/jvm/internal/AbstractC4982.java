package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4543;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4516;
import lin.xposed.hook.javaplugin.C5554;
import p009.AbstractC6183;
import p047.InterfaceC6489;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4982 extends AbstractC5007 implements InterfaceC5075 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5184 f14377;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4536 f14378;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5184 f14380;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC5184 f14381;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5184 f14382;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5184 f14383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5003 f14384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14385;

    public AbstractC4982(AbstractC5003 abstractC5003, String str, Object obj, C4536 c4536) {
        abstractC5003.getClass();
        str.getClass();
        c4536.getClass();
        this.f14384 = abstractC5003;
        this.f14385 = str;
        this.f14379 = obj;
        this.f14378 = c4536;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14382 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4981(this, 0));
        this.f14383 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4981(this, 1));
        this.f14380 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4981(this, 2));
        this.f14381 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4981(this, 3));
        this.f14377 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4981(this, 4));
    }

    public final boolean equals(Object obj) {
        InterfaceC5075 interfaceC5075M10064 = AbstractC5067.m10064(obj);
        return interfaceC5075M10064 != null && AbstractC4395.m8907(this.f14384, interfaceC5075M10064.mo9943()) && AbstractC4395.m8907(this.f14378.f13217, interfaceC5075M10064.getName()) && AbstractC4395.m8907(this.f14385, interfaceC5075M10064.getSignature()) && AbstractC4395.m8907(this.f14379, interfaceC5075M10064.mo9945());
    }

    @Override // kotlin.jvm.internal.InterfaceC4398
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4388.m8887(this.f14384, this.f14385);
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        Annotation[] annotations;
        List listM8846;
        boolean zM13698 = AbstractC8190.m13698(this);
        C4536 c4536 = this.f14378;
        AbstractC5003 abstractC5003 = this.f14384;
        if (zM13698) {
            ArrayList<C4543> arrayList = c4536.f13225;
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
            for (C4543 c4543 : arrayList) {
                ClassLoader classLoader = abstractC5003.mo8879().getClassLoader();
                classLoader.getClass();
                arrayList2.add(AbstractC3933.m8299(c4543, classLoader));
            }
            return arrayList2;
        }
        if (!(abstractC5003 instanceof C4992)) {
            C5554.m10872(this, "Annotations are only supported for top-level properties for now: ");
            return null;
        }
        c4536.getClass();
        C4516 c4516 = AbstractC3056.m6706(c4536).f18940;
        if (c4516 == null) {
            return EmptyList.INSTANCE;
        }
        Method methodM9977 = abstractC5003.m9977(c4516.f13161, c4516.f13160);
        if (methodM9977 != null && (annotations = methodM9977.getAnnotations()) != null && (listM8846 = AbstractC4347.m8846(annotations)) != null) {
            return AbstractC5067.m10066(listM8846);
        }
        C4211.m8595(this, "No synthetic method found: ");
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return this.f14378.f13217;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getParameters() {
        return (List) this.f14383.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final InterfaceC5087 getReturnType() {
        return (InterfaceC5087) this.f14380.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5075
    public final String getSignature() {
        return this.f14385;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getTypeParameters() {
        return ((C5070) this.f14381.getValue()).f14613;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final KVisibility getVisibility() {
        return AbstractC3933.m8292(AbstractC4545.m9132(this.f14378));
    }

    public final int hashCode() {
        return this.f14385.hashCode() + AbstractC6183.m11572(this.f14384.hashCode() * 31, 31, this.f14378.f13217);
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final boolean isConst() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4536 c4536 = this.f14378;
        c4536.getClass();
        return AbstractC4545.f13273.m577(c4536, AbstractC4545.f13263[37]);
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final boolean isLateinit() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4536 c4536 = this.f14378;
        c4536.getClass();
        return AbstractC4545.f13265.m577(c4536, AbstractC4545.f13263[38]);
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
        C5069.m10086(sb, this.f14378.f13217);
        sb.append(": ");
        sb.append(C5069.m10082(getReturnType(), false));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6489 mo9939() {
        mo9960().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5075
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Field mo9940() {
        return (Field) this.f14377.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6489 mo9941() {
        return mo9960().mo9941();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo9961() {
        return (List) this.f14382.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract AbstractC4979 mo9960();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5003 mo9943() {
        return this.f14384;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo9969() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4536 c4536 = this.f14378;
        c4536.getClass();
        return (Modality) AbstractC4545.f13275.m960(c4536, AbstractC4545.f13263[34]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Member m9970() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4536 c4536 = this.f14378;
        c4536.getClass();
        if (!AbstractC4545.f13264.m577(c4536, AbstractC4545.f13263[41])) {
            return null;
        }
        C4516 c4516 = AbstractC3056.m6706(c4536).f18939;
        if (c4516 == null) {
            return mo9940();
        }
        return this.f14384.m9977(c4516.f13161, c4516.f13160);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9945() {
        return this.f14379;
    }
}
