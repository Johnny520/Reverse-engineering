package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.appcompat.widget.C0984;
import androidx.collection.C1123;
import androidx.compose.animation.core.C1171;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5177;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.p009km.internal.AbstractC5345;
import kotlin.reflect.jvm.internal.impl.p009km.internal.C5344;
import p086.AbstractC7728;
import p086.C7730;
import p086.C7731;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5377 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C0984 f13598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C0984 f13599;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C0984 f13600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C0984 f13601;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C0984 f13602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0984 f13603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0984 f13604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1171 f13605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1171 f13606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1171 f13607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13608 = {new MutablePropertyReference1Impl(AbstractC5377.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new MutablePropertyReference1Impl(AbstractC5377.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C0984 f13609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C0984 f13610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C0984 f13611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C0984 f13612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1171 f13613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1171 f13614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C0984 f13615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C0984 f13616;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C0984 f13617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0984 f13618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C1171 f13619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1171 f13620;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1171 f13621;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1171 f13622;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0984 f13623;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0984 f13624;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1171 f13625;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0984 f13626;

    static {
        C7731 c7731 = AbstractC7728.f18727;
        c7731.getClass();
        AbstractC5345.m9679(new C5344(c7731, 1));
        AbstractC5345.m9678(new C5344(c7731, 1));
        AbstractC5345.m9677(new C5344(c7731, 1));
        AbstractC5345.m9681(new C5344(c7731, 1));
        AbstractC5345.m9674(new C5344(c7731, 1));
        AbstractC5345.m9682(new C5344(c7731, 1));
        AbstractC5345.m9684(new C5344(c7731, 1));
        f13607 = AbstractC5345.m9675(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5381) obj).f13634);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5381) obj).f13634 = ((Number) obj2).intValue();
            }
        });
        f13606 = AbstractC5345.m9683(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5381) obj).f13634);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5381) obj).f13634 = ((Number) obj2).intValue();
            }
        });
        Attributes$kind$2 attributes$kind$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5381) obj).f13634);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5381) obj).f13634 = ((Number) obj2).intValue();
            }
        };
        C7730 c7730 = AbstractC7728.f18724;
        c7730.getClass();
        InterfaceC5197 entries = ClassKind.getEntries();
        InterfaceC5197 entries2 = ClassKind.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ClassKind) it.next()).getFlag$kotlin_metadata());
        }
        f13605 = new C1171(attributes$kind$2, c7730, entries, arrayList);
        C7731 c77312 = AbstractC7728.f18743;
        c77312.getClass();
        f13604 = AbstractC5345.m9679(new C5344(c77312, 1));
        C7731 c77313 = AbstractC7728.f18742;
        c77313.getClass();
        AbstractC5345.m9679(new C5344(c77313, 1));
        C7731 c77314 = AbstractC7728.f18746;
        c77314.getClass();
        AbstractC5345.m9679(new C5344(c77314, 1));
        C7731 c77315 = AbstractC7728.f18747;
        c77315.getClass();
        AbstractC5345.m9679(new C5344(c77315, 1));
        C7731 c77316 = AbstractC7728.f18744;
        c77316.getClass();
        f13603 = AbstractC5345.m9679(new C5344(c77316, 1));
        C7731 c77317 = AbstractC7728.f18745;
        c77317.getClass();
        AbstractC5345.m9679(new C5344(c77317, 1));
        C7731 c77318 = AbstractC7728.f18737;
        c77318.getClass();
        AbstractC5345.m9679(new C5344(c77318, 1));
        f13622 = AbstractC5345.m9683(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5362) obj).f13544);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5362) obj).f13544 = ((Number) obj2).intValue();
            }
        });
        C7731 c77319 = AbstractC7728.f18736;
        c77319.getClass();
        AbstractC5345.m9678(new C5344(c77319, 1));
        C7731 c773110 = AbstractC7728.f18740;
        c773110.getClass();
        AbstractC5345.m9678(new C5344(c773110, 1));
        Attributes$returnValueStatus$2 attributes$returnValueStatus$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5362) obj).f13544);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5362) obj).f13544 = ((Number) obj2).intValue();
            }
        };
        C7730 c77302 = AbstractC7728.f18741;
        c77302.getClass();
        AbstractC5345.m9680(attributes$returnValueStatus$2, c77302);
        AbstractC5345.m9676(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5370) obj).f13582);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5370) obj).f13582 = ((Number) obj2).intValue();
            }
        });
        f13621 = AbstractC5345.m9683(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5370) obj).f13582);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5370) obj).f13582 = ((Number) obj2).intValue();
            }
        });
        f13625 = AbstractC5345.m9675(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5370) obj).f13582);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5370) obj).f13582 = ((Number) obj2).intValue();
            }
        });
        C7731 c773111 = AbstractC7728.f18739;
        c773111.getClass();
        f13626 = AbstractC5345.m9677(new C5344(c773111, 1));
        C7731 c773112 = AbstractC7728.f18731;
        c773112.getClass();
        f13623 = AbstractC5345.m9677(new C5344(c773112, 1));
        C7731 c773113 = AbstractC7728.f18730;
        c773113.getClass();
        f13624 = AbstractC5345.m9677(new C5344(c773113, 1));
        C7731 c773114 = AbstractC7728.f18734;
        c773114.getClass();
        AbstractC5345.m9677(new C5344(c773114, 1));
        C7731 c773115 = AbstractC7728.f18735;
        c773115.getClass();
        f13616 = AbstractC5345.m9677(new C5344(c773115, 1));
        C7731 c773116 = AbstractC7728.f18732;
        c773116.getClass();
        f13615 = AbstractC5345.m9677(new C5344(c773116, 1));
        C7731 c773117 = AbstractC7728.f18733;
        c773117.getClass();
        AbstractC5345.m9677(new C5344(c773117, 1));
        C7731 c773118 = AbstractC7728.f18717;
        c773118.getClass();
        AbstractC5345.m9677(new C5344(c773118, 1));
        Attributes$returnValueStatus$6 attributes$returnValueStatus$6 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5370) obj).f13582);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5370) obj).f13582 = ((Number) obj2).intValue();
            }
        };
        C7730 c77303 = AbstractC7728.f18716;
        c77303.getClass();
        AbstractC5345.m9680(attributes$returnValueStatus$6, c77303);
        f13619 = AbstractC5345.m9683(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5368) obj).f13563);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5368) obj).f13563 = ((Number) obj2).intValue();
            }
        });
        f13620 = AbstractC5345.m9675(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5368) obj).f13563);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5368) obj).f13563 = ((Number) obj2).intValue();
            }
        });
        AbstractC5345.m9676(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$11
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5368) obj).f13563);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5368) obj).f13563 = ((Number) obj2).intValue();
            }
        });
        C7731 c773119 = AbstractC7728.f18715;
        c773119.getClass();
        f13617 = AbstractC5345.m9681(new C5344(c773119, 1));
        C7731 c773120 = AbstractC7728.f18712;
        c773120.getClass();
        f13618 = AbstractC5345.m9681(new C5344(c773120, 1));
        C7731 c773121 = AbstractC7728.f18723;
        c773121.getClass();
        f13610 = AbstractC5345.m9681(new C5344(c773121, 1));
        C7731 c773122 = AbstractC7728.f18722;
        c773122.getClass();
        AbstractC5345.m9681(new C5344(c773122, 1));
        C7731 c773123 = AbstractC7728.f18721;
        c773123.getClass();
        AbstractC5345.m9681(new C5344(c773123, 1));
        C7731 c773124 = AbstractC7728.f18720;
        c773124.getClass();
        f13609 = AbstractC5345.m9681(new C5344(c773124, 1));
        C7731 c773125 = AbstractC7728.f18719;
        c773125.getClass();
        AbstractC5345.m9681(new C5344(c773125, 1));
        Attributes$returnValueStatus$10 attributes$returnValueStatus$10 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5368) obj).f13563);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5368) obj).f13563 = ((Number) obj2).intValue();
            }
        };
        C7730 c77304 = AbstractC7728.f18718;
        c77304.getClass();
        AbstractC5345.m9680(attributes$returnValueStatus$10, c77304);
        f13613 = AbstractC5345.m9683(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$18
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5367) obj).f13556);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5367) obj).f13556 = ((Number) obj2).intValue();
            }
        });
        f13614 = AbstractC5345.m9675(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5367) obj).f13556);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5367) obj).f13556 = ((Number) obj2).intValue();
            }
        });
        C7731 c773126 = AbstractC7728.f18710;
        c773126.getClass();
        AbstractC5345.m9674(new C5344(c773126, 1));
        C7731 c773127 = AbstractC7728.f18706;
        c773127.getClass();
        f13611 = AbstractC5345.m9674(new C5344(c773127, 1));
        C7731 c773128 = AbstractC7728.f18707;
        c773128.getClass();
        f13612 = AbstractC5345.m9674(new C5344(c773128, 1));
        f13602 = AbstractC5345.m9685(new C5344(0, 1, 1));
        C7731 c773129 = AbstractC7728.f18729;
        f13601 = AbstractC5345.m9685(new C5344(c773129.f18749 + 1, c773129.f18748, 1));
        C7731 c773130 = AbstractC7728.f18728;
        f13600 = AbstractC5345.m9685(new C5344(c773130.f18749 + 1, c773130.f18748, 1));
        f13599 = new C0984(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isReified$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5356) obj).f13524);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5356) obj).f13524 = ((Number) obj2).intValue();
            }
        }, new C5344(0, 1, 1));
        AbstractC5345.m9683(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$22
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5357) obj).f13528);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5357) obj).f13528 = ((Number) obj2).intValue();
            }
        });
        C7731 c773131 = AbstractC7728.f18709;
        c773131.getClass();
        f13598 = AbstractC5345.m9682(new C5344(c773131, 1));
        C7731 c773132 = AbstractC7728.f18708;
        c773132.getClass();
        AbstractC5345.m9682(new C5344(c773132, 1));
        C7731 c773133 = AbstractC7728.f18711;
        c773133.getClass();
        AbstractC5345.m9682(new C5344(c773133, 1));
        Attributes$isNegated$2 attributes$isNegated$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNegated$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5360) obj).f13539);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5360) obj).f13539 = ((Number) obj2).intValue();
            }
        };
        C7731 c773134 = AbstractC7728.f18704;
        c773134.getClass();
        C5344 c5344 = new C5344(c773134, 1);
        attributes$isNegated$2.getClass();
        if (c5344.f13501 != 1) {
            C1123.m1409(c5344, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            return;
        }
        Attributes$isNullCheckPredicate$2 attributes$isNullCheckPredicate$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNullCheckPredicate$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5360) obj).f13539);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5360) obj).f13539 = ((Number) obj2).intValue();
            }
        };
        C7731 c773135 = AbstractC7728.f18703;
        c773135.getClass();
        C5344 c53442 = new C5344(c773135, 1);
        attributes$isNullCheckPredicate$2.getClass();
        if (c53442.f13501 == 1) {
            return;
        }
        C1123.m1409(c53442, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Visibility m9691(C5368 c5368) {
        c5368.getClass();
        return (Visibility) f13619.m1520(c5368, f13608[33]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ClassKind m9692(C5381 c5381) {
        return (ClassKind) f13605.m1520(c5381, f13608[9]);
    }
}
