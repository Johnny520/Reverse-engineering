package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4210;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4542;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4515;
import lin.xposed.hook.javaplugin.C5553;
import p007.AbstractC6136;
import p033.AbstractC6325;
import p047.InterfaceC6488;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4981 extends AbstractC5006 implements InterfaceC5074 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5183 f14375;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4535 f14376;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14377;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5183 f14378;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC5183 f14379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5183 f14380;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5183 f14381;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5002 f14382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14383;

    public AbstractC4981(AbstractC5002 abstractC5002, String str, Object obj, C4535 c4535) {
        abstractC5002.getClass();
        str.getClass();
        c4535.getClass();
        this.f14382 = abstractC5002;
        this.f14383 = str;
        this.f14377 = obj;
        this.f14376 = c4535;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14380 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4980(this, 0));
        this.f14381 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4980(this, 1));
        this.f14378 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4980(this, 2));
        this.f14379 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4980(this, 3));
        this.f14375 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4980(this, 4));
    }

    public final boolean equals(Object obj) {
        InterfaceC5074 interfaceC5074M10060 = AbstractC5066.m10060(obj);
        return interfaceC5074M10060 != null && AbstractC4394.m8917(this.f14382, interfaceC5074M10060.mo9946()) && AbstractC4394.m8917(this.f14376.f13213, interfaceC5074M10060.getName()) && AbstractC4394.m8917(this.f14383, interfaceC5074M10060.getSignature()) && AbstractC4394.m8917(this.f14377, interfaceC5074M10060.mo9948());
    }

    @Override // kotlin.jvm.internal.InterfaceC4397
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4387.m8897(this.f14382, this.f14383);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        Annotation[] annotations;
        List listM8850;
        boolean zM6675 = AbstractC3056.m6675(this);
        C4535 c4535 = this.f14376;
        AbstractC5002 abstractC5002 = this.f14382;
        if (zM6675) {
            ArrayList<C4542> arrayList = c4535.f13221;
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
            for (C4542 c4542 : arrayList) {
                ClassLoader classLoader = abstractC5002.mo8889().getClassLoader();
                classLoader.getClass();
                arrayList2.add(AbstractC6325.m11845(c4542, classLoader));
            }
            return arrayList2;
        }
        if (!(abstractC5002 instanceof C4991)) {
            C5553.m10815(this, "Annotations are only supported for top-level properties for now: ");
            return null;
        }
        c4535.getClass();
        C4515 c4515 = AbstractC8174.m13610(c4535).f18945;
        if (c4515 == null) {
            return EmptyList.INSTANCE;
        }
        Method methodM9980 = abstractC5002.m9980(c4515.f13157, c4515.f13156);
        if (methodM9980 != null && (annotations = methodM9980.getAnnotations()) != null && (listM8850 = AbstractC4346.m8850(annotations)) != null) {
            return AbstractC5066.m10062(listM8850);
        }
        C4210.m8605(this, "No synthetic method found: ");
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        return this.f14376.f13213;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getParameters() {
        return (List) this.f14381.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final InterfaceC5086 getReturnType() {
        return (InterfaceC5086) this.f14378.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5074
    public final String getSignature() {
        return this.f14383;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        return ((C5069) this.f14379.getValue()).f14613;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final KVisibility getVisibility() {
        return AbstractC6325.m11843(AbstractC4544.m9142(this.f14376));
    }

    public final int hashCode() {
        return this.f14383.hashCode() + AbstractC6136.m11539(this.f14382.hashCode() * 31, 31, this.f14376.f13213);
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final boolean isConst() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4535 c4535 = this.f14376;
        c4535.getClass();
        return AbstractC4544.f13269.m576(c4535, AbstractC4544.f13259[37]);
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final boolean isLateinit() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4535 c4535 = this.f14376;
        c4535.getClass();
        return AbstractC4544.f13261.m576(c4535, AbstractC4544.f13259[38]);
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
        C5068.m10082(sb, this.f14376.f13213);
        sb.append(": ");
        sb.append(C5068.m10078(getReturnType(), false));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6488 mo9942() {
        mo9963().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5074
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Field mo9943() {
        return (Field) this.f14375.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6488 mo9944() {
        return mo9963().mo9944();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo9964() {
        return (List) this.f14380.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract AbstractC4978 mo9963();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5002 mo9946() {
        return this.f14382;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5006
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo9972() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4535 c4535 = this.f14376;
        c4535.getClass();
        return (Modality) AbstractC4544.f13271.m959(c4535, AbstractC4544.f13259[34]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Member m9973() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4535 c4535 = this.f14376;
        c4535.getClass();
        if (!AbstractC4544.f13260.m576(c4535, AbstractC4544.f13259[41])) {
            return null;
        }
        C4515 c4515 = AbstractC8174.m13610(c4535).f18944;
        if (c4515 == null) {
            return mo9943();
        }
        return this.f14382.m9980(c4515.f13157, c4515.f13156);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9948() {
        return this.f14377;
    }
}
