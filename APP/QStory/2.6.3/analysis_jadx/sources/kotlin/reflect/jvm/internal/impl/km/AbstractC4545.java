package kotlin.reflect.jvm.internal.impl.km;

import androidx.appcompat.widget.C0137;
import androidx.collection.C0276;
import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4345;
import kotlin.enums.InterfaceC4365;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4513;
import kotlin.reflect.jvm.internal.impl.km.internal.C4512;
import p070.AbstractC6899;
import p070.C6901;
import p070.C6902;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4545 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C0137 f13253;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C0137 f13254;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C0137 f13255;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C0137 f13256;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C0137 f13257;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0137 f13258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0137 f13259;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0325 f13260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0325 f13261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0325 f13262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13263 = {new MutablePropertyReference1Impl(AbstractC4545.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new MutablePropertyReference1Impl(AbstractC4545.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C0137 f13264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C0137 f13265;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C0137 f13266;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C0137 f13267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C0325 f13268;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C0325 f13269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C0137 f13270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C0137 f13271;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C0137 f13272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0137 f13273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C0325 f13274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C0325 f13275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0325 f13276;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0325 f13277;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0137 f13278;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0137 f13279;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0325 f13280;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0137 f13281;

    static {
        C6902 c6902 = AbstractC6899.f18382;
        c6902.getClass();
        AbstractC4513.m9120(new C4512(c6902, 1));
        AbstractC4513.m9119(new C4512(c6902, 1));
        AbstractC4513.m9118(new C4512(c6902, 1));
        AbstractC4513.m9122(new C4512(c6902, 1));
        AbstractC4513.m9115(new C4512(c6902, 1));
        AbstractC4513.m9123(new C4512(c6902, 1));
        AbstractC4513.m9125(new C4512(c6902, 1));
        f13262 = AbstractC4513.m9116(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4549) obj).f13289);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4549) obj).f13289 = ((Number) obj2).intValue();
            }
        });
        f13261 = AbstractC4513.m9124(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4549) obj).f13289);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4549) obj).f13289 = ((Number) obj2).intValue();
            }
        });
        Attributes$kind$2 attributes$kind$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4549) obj).f13289);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4549) obj).f13289 = ((Number) obj2).intValue();
            }
        };
        C6901 c6901 = AbstractC6899.f18379;
        c6901.getClass();
        InterfaceC4365 entries = ClassKind.getEntries();
        InterfaceC4365 entries2 = ClassKind.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ClassKind) it.next()).getFlag$kotlin_metadata());
        }
        f13260 = new C0325(attributes$kind$2, c6901, entries, arrayList);
        C6902 c69022 = AbstractC6899.f18398;
        c69022.getClass();
        f13259 = AbstractC4513.m9120(new C4512(c69022, 1));
        C6902 c69023 = AbstractC6899.f18397;
        c69023.getClass();
        AbstractC4513.m9120(new C4512(c69023, 1));
        C6902 c69024 = AbstractC6899.f18401;
        c69024.getClass();
        AbstractC4513.m9120(new C4512(c69024, 1));
        C6902 c69025 = AbstractC6899.f18402;
        c69025.getClass();
        AbstractC4513.m9120(new C4512(c69025, 1));
        C6902 c69026 = AbstractC6899.f18399;
        c69026.getClass();
        f13258 = AbstractC4513.m9120(new C4512(c69026, 1));
        C6902 c69027 = AbstractC6899.f18400;
        c69027.getClass();
        AbstractC4513.m9120(new C4512(c69027, 1));
        C6902 c69028 = AbstractC6899.f18392;
        c69028.getClass();
        AbstractC4513.m9120(new C4512(c69028, 1));
        f13277 = AbstractC4513.m9124(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4530) obj).f13199);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4530) obj).f13199 = ((Number) obj2).intValue();
            }
        });
        C6902 c69029 = AbstractC6899.f18391;
        c69029.getClass();
        AbstractC4513.m9119(new C4512(c69029, 1));
        C6902 c690210 = AbstractC6899.f18395;
        c690210.getClass();
        AbstractC4513.m9119(new C4512(c690210, 1));
        Attributes$returnValueStatus$2 attributes$returnValueStatus$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4530) obj).f13199);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4530) obj).f13199 = ((Number) obj2).intValue();
            }
        };
        C6901 c69012 = AbstractC6899.f18396;
        c69012.getClass();
        AbstractC4513.m9121(attributes$returnValueStatus$2, c69012);
        AbstractC4513.m9117(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4538) obj).f13237);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4538) obj).f13237 = ((Number) obj2).intValue();
            }
        });
        f13276 = AbstractC4513.m9124(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4538) obj).f13237);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4538) obj).f13237 = ((Number) obj2).intValue();
            }
        });
        f13280 = AbstractC4513.m9116(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4538) obj).f13237);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4538) obj).f13237 = ((Number) obj2).intValue();
            }
        });
        C6902 c690211 = AbstractC6899.f18394;
        c690211.getClass();
        f13281 = AbstractC4513.m9118(new C4512(c690211, 1));
        C6902 c690212 = AbstractC6899.f18386;
        c690212.getClass();
        f13278 = AbstractC4513.m9118(new C4512(c690212, 1));
        C6902 c690213 = AbstractC6899.f18385;
        c690213.getClass();
        f13279 = AbstractC4513.m9118(new C4512(c690213, 1));
        C6902 c690214 = AbstractC6899.f18389;
        c690214.getClass();
        AbstractC4513.m9118(new C4512(c690214, 1));
        C6902 c690215 = AbstractC6899.f18390;
        c690215.getClass();
        f13271 = AbstractC4513.m9118(new C4512(c690215, 1));
        C6902 c690216 = AbstractC6899.f18387;
        c690216.getClass();
        f13270 = AbstractC4513.m9118(new C4512(c690216, 1));
        C6902 c690217 = AbstractC6899.f18388;
        c690217.getClass();
        AbstractC4513.m9118(new C4512(c690217, 1));
        C6902 c690218 = AbstractC6899.f18372;
        c690218.getClass();
        AbstractC4513.m9118(new C4512(c690218, 1));
        Attributes$returnValueStatus$6 attributes$returnValueStatus$6 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4538) obj).f13237);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4538) obj).f13237 = ((Number) obj2).intValue();
            }
        };
        C6901 c69013 = AbstractC6899.f18371;
        c69013.getClass();
        AbstractC4513.m9121(attributes$returnValueStatus$6, c69013);
        f13274 = AbstractC4513.m9124(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4536) obj).f13218);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4536) obj).f13218 = ((Number) obj2).intValue();
            }
        });
        f13275 = AbstractC4513.m9116(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4536) obj).f13218);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4536) obj).f13218 = ((Number) obj2).intValue();
            }
        });
        AbstractC4513.m9117(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$11
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4536) obj).f13218);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4536) obj).f13218 = ((Number) obj2).intValue();
            }
        });
        C6902 c690219 = AbstractC6899.f18370;
        c690219.getClass();
        f13272 = AbstractC4513.m9122(new C4512(c690219, 1));
        C6902 c690220 = AbstractC6899.f18367;
        c690220.getClass();
        f13273 = AbstractC4513.m9122(new C4512(c690220, 1));
        C6902 c690221 = AbstractC6899.f18378;
        c690221.getClass();
        f13265 = AbstractC4513.m9122(new C4512(c690221, 1));
        C6902 c690222 = AbstractC6899.f18377;
        c690222.getClass();
        AbstractC4513.m9122(new C4512(c690222, 1));
        C6902 c690223 = AbstractC6899.f18376;
        c690223.getClass();
        AbstractC4513.m9122(new C4512(c690223, 1));
        C6902 c690224 = AbstractC6899.f18375;
        c690224.getClass();
        f13264 = AbstractC4513.m9122(new C4512(c690224, 1));
        C6902 c690225 = AbstractC6899.f18374;
        c690225.getClass();
        AbstractC4513.m9122(new C4512(c690225, 1));
        Attributes$returnValueStatus$10 attributes$returnValueStatus$10 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4536) obj).f13218);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4536) obj).f13218 = ((Number) obj2).intValue();
            }
        };
        C6901 c69014 = AbstractC6899.f18373;
        c69014.getClass();
        AbstractC4513.m9121(attributes$returnValueStatus$10, c69014);
        f13268 = AbstractC4513.m9124(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$18
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13211);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13211 = ((Number) obj2).intValue();
            }
        });
        f13269 = AbstractC4513.m9116(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13211);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13211 = ((Number) obj2).intValue();
            }
        });
        C6902 c690226 = AbstractC6899.f18365;
        c690226.getClass();
        AbstractC4513.m9115(new C4512(c690226, 1));
        C6902 c690227 = AbstractC6899.f18361;
        c690227.getClass();
        f13266 = AbstractC4513.m9115(new C4512(c690227, 1));
        C6902 c690228 = AbstractC6899.f18362;
        c690228.getClass();
        f13267 = AbstractC4513.m9115(new C4512(c690228, 1));
        f13257 = AbstractC4513.m9126(new C4512(0, 1, 1));
        C6902 c690229 = AbstractC6899.f18384;
        f13256 = AbstractC4513.m9126(new C4512(c690229.f18404 + 1, c690229.f18403, 1));
        C6902 c690230 = AbstractC6899.f18383;
        f13255 = AbstractC4513.m9126(new C4512(c690230.f18404 + 1, c690230.f18403, 1));
        f13254 = new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isReified$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4524) obj).f13179);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4524) obj).f13179 = ((Number) obj2).intValue();
            }
        }, new C4512(0, 1, 1));
        AbstractC4513.m9124(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$22
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4525) obj).f13183);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4525) obj).f13183 = ((Number) obj2).intValue();
            }
        });
        C6902 c690231 = AbstractC6899.f18364;
        c690231.getClass();
        f13253 = AbstractC4513.m9123(new C4512(c690231, 1));
        C6902 c690232 = AbstractC6899.f18363;
        c690232.getClass();
        AbstractC4513.m9123(new C4512(c690232, 1));
        C6902 c690233 = AbstractC6899.f18366;
        c690233.getClass();
        AbstractC4513.m9123(new C4512(c690233, 1));
        Attributes$isNegated$2 attributes$isNegated$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNegated$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4528) obj).f13194);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4528) obj).f13194 = ((Number) obj2).intValue();
            }
        };
        C6902 c690234 = AbstractC6899.f18359;
        c690234.getClass();
        C4512 c4512 = new C4512(c690234, 1);
        attributes$isNegated$2.getClass();
        if (c4512.f13156 != 1) {
            C0276.m849(c4512, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            return;
        }
        Attributes$isNullCheckPredicate$2 attributes$isNullCheckPredicate$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNullCheckPredicate$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4528) obj).f13194);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4528) obj).f13194 = ((Number) obj2).intValue();
            }
        };
        C6902 c690235 = AbstractC6899.f18358;
        c690235.getClass();
        C4512 c45122 = new C4512(c690235, 1);
        attributes$isNullCheckPredicate$2.getClass();
        if (c45122.f13156 == 1) {
            return;
        }
        C0276.m849(c45122, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Visibility m9132(C4536 c4536) {
        c4536.getClass();
        return (Visibility) f13274.m960(c4536, f13263[33]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ClassKind m9133(C4549 c4549) {
        return (ClassKind) f13260.m960(c4549, f13263[9]);
    }
}
