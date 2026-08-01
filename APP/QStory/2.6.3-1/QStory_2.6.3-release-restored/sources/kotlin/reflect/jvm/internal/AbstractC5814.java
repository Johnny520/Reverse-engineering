package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3888;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5939;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5375;
import kotlin.reflect.jvm.internal.impl.p009km.Modality;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import lin.xposed.hook.javaplugin.C6385;
import p025.AbstractC7012;
import p063.InterfaceC7318;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5814 extends AbstractC5839 implements InterfaceC5907 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6016 f14722;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5368 f14723;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14724;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6016 f14725;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC6016 f14726;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6016 f14727;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC6016 f14728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5835 f14729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14730;

    public AbstractC5814(AbstractC5835 abstractC5835, String str, Object obj, C5368 c5368) {
        abstractC5835.getClass();
        str.getClass();
        c5368.getClass();
        this.f14729 = abstractC5835;
        this.f14730 = str;
        this.f14724 = obj;
        this.f14723 = c5368;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14727 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5813(this, 0));
        this.f14728 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5813(this, 1));
        this.f14725 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5813(this, 2));
        this.f14726 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5813(this, 3));
        this.f14722 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5813(this, 4));
    }

    public final boolean equals(Object obj) {
        InterfaceC5907 interfaceC5907M10623 = AbstractC5899.m10623(obj);
        return interfaceC5907M10623 != null && AbstractC5227.m9466(this.f14729, interfaceC5907M10623.mo10502()) && AbstractC5227.m9466(this.f14723.f13562, interfaceC5907M10623.getName()) && AbstractC5227.m9466(this.f14730, interfaceC5907M10623.getSignature()) && AbstractC5227.m9466(this.f14724, interfaceC5907M10623.mo10504());
    }

    @Override // kotlin.jvm.internal.InterfaceC5230
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC5220.m9446(this.f14729, this.f14730);
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        Annotation[] annotations;
        List listM9405;
        boolean zM14257 = AbstractC9019.m14257(this);
        C5368 c5368 = this.f14723;
        AbstractC5835 abstractC5835 = this.f14729;
        if (zM14257) {
            ArrayList<C5375> arrayList = c5368.f13570;
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
            for (C5375 c5375 : arrayList) {
                ClassLoader classLoader = abstractC5835.mo9438().getClassLoader();
                classLoader.getClass();
                arrayList2.add(AbstractC4765.m8858(c5375, classLoader));
            }
            return arrayList2;
        }
        if (!(abstractC5835 instanceof C5824)) {
            C6385.m11431(this, "Annotations are only supported for top-level properties for now: ");
            return null;
        }
        c5368.getClass();
        C5348 c5348 = AbstractC3888.m7266(c5368).f19285;
        if (c5348 == null) {
            return EmptyList.INSTANCE;
        }
        Method methodM10536 = abstractC5835.m10536(c5348.f13506, c5348.f13505);
        if (methodM10536 != null && (annotations = methodM10536.getAnnotations()) != null && (listM9405 = AbstractC5179.m9405(annotations)) != null) {
            return AbstractC5899.m10625(listM9405);
        }
        C5043.m9154(this, "No synthetic method found: ");
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return this.f14723.f13562;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getParameters() {
        return (List) this.f14728.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final InterfaceC5919 getReturnType() {
        return (InterfaceC5919) this.f14725.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5907
    public final String getSignature() {
        return this.f14730;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getTypeParameters() {
        return ((C5902) this.f14726.getValue()).f14958;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final KVisibility getVisibility() {
        return AbstractC4765.m8851(AbstractC5377.m9691(this.f14723));
    }

    public final int hashCode() {
        return this.f14730.hashCode() + AbstractC7012.m12131(this.f14729.hashCode() * 31, 31, this.f14723.f13562);
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final boolean isConst() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5368 c5368 = this.f14723;
        c5368.getClass();
        return AbstractC5377.f13618.m1137(c5368, AbstractC5377.f13608[37]);
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final boolean isLateinit() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5368 c5368 = this.f14723;
        c5368.getClass();
        return AbstractC5377.f13610.m1137(c5368, AbstractC5377.f13608[38]);
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
        C5901.m10645(sb, this.f14723.f13562);
        sb.append(": ");
        sb.append(C5901.m10641(getReturnType(), false));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7318 mo10498() {
        mo10519().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5907
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Field mo10499() {
        return (Field) this.f14722.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7318 mo10500() {
        return mo10519().mo10500();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo10520() {
        return (List) this.f14727.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract AbstractC5811 mo10519();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5835 mo10502() {
        return this.f14729;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5839
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo10528() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5368 c5368 = this.f14723;
        c5368.getClass();
        return (Modality) AbstractC5377.f13620.m1520(c5368, AbstractC5377.f13608[34]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Member m10529() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5368 c5368 = this.f14723;
        c5368.getClass();
        if (!AbstractC5377.f13609.m1137(c5368, AbstractC5377.f13608[41])) {
            return null;
        }
        C5348 c5348 = AbstractC3888.m7266(c5368).f19284;
        if (c5348 == null) {
            return mo10499();
        }
        return this.f14729.m10536(c5348.f13506, c5348.f13505);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo10504() {
        return this.f14724;
    }
}
