package kotlin.reflect.jvm.internal.impl.km;

import androidx.appcompat.widget.C0137;
import androidx.collection.C0276;
import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4512;
import kotlin.reflect.jvm.internal.impl.km.internal.C4511;
import p070.AbstractC6898;
import p070.C6900;
import p070.C6901;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4544 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C0137 f13249;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C0137 f13250;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C0137 f13251;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C0137 f13252;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C0137 f13253;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0137 f13254;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0137 f13255;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0325 f13256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0325 f13257;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0325 f13258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13259 = {new MutablePropertyReference1Impl(AbstractC4544.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/ReturnValueStatus;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new MutablePropertyReference1Impl(AbstractC4544.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C0137 f13260;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C0137 f13261;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C0137 f13262;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C0137 f13263;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C0325 f13264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C0325 f13265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C0137 f13266;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C0137 f13267;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C0137 f13268;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0137 f13269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C0325 f13270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C0325 f13271;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0325 f13272;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0325 f13273;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0137 f13274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0137 f13275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0325 f13276;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0137 f13277;

    static {
        C6901 c6901 = AbstractC6898.f18387;
        c6901.getClass();
        AbstractC4512.m9130(new C4511(c6901, 1));
        AbstractC4512.m9129(new C4511(c6901, 1));
        AbstractC4512.m9128(new C4511(c6901, 1));
        AbstractC4512.m9132(new C4511(c6901, 1));
        AbstractC4512.m9125(new C4511(c6901, 1));
        AbstractC4512.m9133(new C4511(c6901, 1));
        AbstractC4512.m9135(new C4511(c6901, 1));
        f13258 = AbstractC4512.m9126(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4548) obj).f13285);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4548) obj).f13285 = ((Number) obj2).intValue();
            }
        });
        f13257 = AbstractC4512.m9134(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4548) obj).f13285);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4548) obj).f13285 = ((Number) obj2).intValue();
            }
        });
        Attributes$kind$2 attributes$kind$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4548) obj).f13285);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4548) obj).f13285 = ((Number) obj2).intValue();
            }
        };
        C6900 c6900 = AbstractC6898.f18384;
        c6900.getClass();
        InterfaceC4364 entries = ClassKind.getEntries();
        InterfaceC4364 entries2 = ClassKind.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ClassKind) it.next()).getFlag$kotlin_metadata());
        }
        f13256 = new C0325(attributes$kind$2, c6900, entries, arrayList);
        C6901 c69012 = AbstractC6898.f18403;
        c69012.getClass();
        f13255 = AbstractC4512.m9130(new C4511(c69012, 1));
        C6901 c69013 = AbstractC6898.f18402;
        c69013.getClass();
        AbstractC4512.m9130(new C4511(c69013, 1));
        C6901 c69014 = AbstractC6898.f18406;
        c69014.getClass();
        AbstractC4512.m9130(new C4511(c69014, 1));
        C6901 c69015 = AbstractC6898.f18407;
        c69015.getClass();
        AbstractC4512.m9130(new C4511(c69015, 1));
        C6901 c69016 = AbstractC6898.f18404;
        c69016.getClass();
        f13254 = AbstractC4512.m9130(new C4511(c69016, 1));
        C6901 c69017 = AbstractC6898.f18405;
        c69017.getClass();
        AbstractC4512.m9130(new C4511(c69017, 1));
        C6901 c69018 = AbstractC6898.f18397;
        c69018.getClass();
        AbstractC4512.m9130(new C4511(c69018, 1));
        f13273 = AbstractC4512.m9134(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4529) obj).f13195);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4529) obj).f13195 = ((Number) obj2).intValue();
            }
        });
        C6901 c69019 = AbstractC6898.f18396;
        c69019.getClass();
        AbstractC4512.m9129(new C4511(c69019, 1));
        C6901 c690110 = AbstractC6898.f18400;
        c690110.getClass();
        AbstractC4512.m9129(new C4511(c690110, 1));
        Attributes$returnValueStatus$2 attributes$returnValueStatus$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4529) obj).f13195);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4529) obj).f13195 = ((Number) obj2).intValue();
            }
        };
        C6900 c69002 = AbstractC6898.f18401;
        c69002.getClass();
        AbstractC4512.m9131(attributes$returnValueStatus$2, c69002);
        AbstractC4512.m9127(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4537) obj).f13233);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4537) obj).f13233 = ((Number) obj2).intValue();
            }
        });
        f13272 = AbstractC4512.m9134(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4537) obj).f13233);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4537) obj).f13233 = ((Number) obj2).intValue();
            }
        });
        f13276 = AbstractC4512.m9126(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4537) obj).f13233);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4537) obj).f13233 = ((Number) obj2).intValue();
            }
        });
        C6901 c690111 = AbstractC6898.f18399;
        c690111.getClass();
        f13277 = AbstractC4512.m9128(new C4511(c690111, 1));
        C6901 c690112 = AbstractC6898.f18391;
        c690112.getClass();
        f13274 = AbstractC4512.m9128(new C4511(c690112, 1));
        C6901 c690113 = AbstractC6898.f18390;
        c690113.getClass();
        f13275 = AbstractC4512.m9128(new C4511(c690113, 1));
        C6901 c690114 = AbstractC6898.f18394;
        c690114.getClass();
        AbstractC4512.m9128(new C4511(c690114, 1));
        C6901 c690115 = AbstractC6898.f18395;
        c690115.getClass();
        f13267 = AbstractC4512.m9128(new C4511(c690115, 1));
        C6901 c690116 = AbstractC6898.f18392;
        c690116.getClass();
        f13266 = AbstractC4512.m9128(new C4511(c690116, 1));
        C6901 c690117 = AbstractC6898.f18393;
        c690117.getClass();
        AbstractC4512.m9128(new C4511(c690117, 1));
        C6901 c690118 = AbstractC6898.f18377;
        c690118.getClass();
        AbstractC4512.m9128(new C4511(c690118, 1));
        Attributes$returnValueStatus$6 attributes$returnValueStatus$6 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4537) obj).f13233);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4537) obj).f13233 = ((Number) obj2).intValue();
            }
        };
        C6900 c69003 = AbstractC6898.f18376;
        c69003.getClass();
        AbstractC4512.m9131(attributes$returnValueStatus$6, c69003);
        f13270 = AbstractC4512.m9134(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13214);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13214 = ((Number) obj2).intValue();
            }
        });
        f13271 = AbstractC4512.m9126(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13214);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13214 = ((Number) obj2).intValue();
            }
        });
        AbstractC4512.m9127(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$11
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13214);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13214 = ((Number) obj2).intValue();
            }
        });
        C6901 c690119 = AbstractC6898.f18375;
        c690119.getClass();
        f13268 = AbstractC4512.m9132(new C4511(c690119, 1));
        C6901 c690120 = AbstractC6898.f18372;
        c690120.getClass();
        f13269 = AbstractC4512.m9132(new C4511(c690120, 1));
        C6901 c690121 = AbstractC6898.f18383;
        c690121.getClass();
        f13261 = AbstractC4512.m9132(new C4511(c690121, 1));
        C6901 c690122 = AbstractC6898.f18382;
        c690122.getClass();
        AbstractC4512.m9132(new C4511(c690122, 1));
        C6901 c690123 = AbstractC6898.f18381;
        c690123.getClass();
        AbstractC4512.m9132(new C4511(c690123, 1));
        C6901 c690124 = AbstractC6898.f18380;
        c690124.getClass();
        f13260 = AbstractC4512.m9132(new C4511(c690124, 1));
        C6901 c690125 = AbstractC6898.f18379;
        c690125.getClass();
        AbstractC4512.m9132(new C4511(c690125, 1));
        Attributes$returnValueStatus$10 attributes$returnValueStatus$10 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$returnValueStatus$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13214);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13214 = ((Number) obj2).intValue();
            }
        };
        C6900 c69004 = AbstractC6898.f18378;
        c69004.getClass();
        AbstractC4512.m9131(attributes$returnValueStatus$10, c69004);
        f13264 = AbstractC4512.m9134(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$18
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4534) obj).f13207);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4534) obj).f13207 = ((Number) obj2).intValue();
            }
        });
        f13265 = AbstractC4512.m9126(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4534) obj).f13207);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4534) obj).f13207 = ((Number) obj2).intValue();
            }
        });
        C6901 c690126 = AbstractC6898.f18370;
        c690126.getClass();
        AbstractC4512.m9125(new C4511(c690126, 1));
        C6901 c690127 = AbstractC6898.f18366;
        c690127.getClass();
        f13262 = AbstractC4512.m9125(new C4511(c690127, 1));
        C6901 c690128 = AbstractC6898.f18367;
        c690128.getClass();
        f13263 = AbstractC4512.m9125(new C4511(c690128, 1));
        f13253 = AbstractC4512.m9136(new C4511(0, 1, 1));
        C6901 c690129 = AbstractC6898.f18389;
        f13252 = AbstractC4512.m9136(new C4511(c690129.f18409 + 1, c690129.f18408, 1));
        C6901 c690130 = AbstractC6898.f18388;
        f13251 = AbstractC4512.m9136(new C4511(c690130.f18409 + 1, c690130.f18408, 1));
        f13250 = new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isReified$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4523) obj).f13175);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4523) obj).f13175 = ((Number) obj2).intValue();
            }
        }, new C4511(0, 1, 1));
        AbstractC4512.m9134(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$22
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4524) obj).f13179);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4524) obj).f13179 = ((Number) obj2).intValue();
            }
        });
        C6901 c690131 = AbstractC6898.f18369;
        c690131.getClass();
        f13249 = AbstractC4512.m9133(new C4511(c690131, 1));
        C6901 c690132 = AbstractC6898.f18368;
        c690132.getClass();
        AbstractC4512.m9133(new C4511(c690132, 1));
        C6901 c690133 = AbstractC6898.f18371;
        c690133.getClass();
        AbstractC4512.m9133(new C4511(c690133, 1));
        Attributes$isNegated$2 attributes$isNegated$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNegated$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4527) obj).f13190);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4527) obj).f13190 = ((Number) obj2).intValue();
            }
        };
        C6901 c690134 = AbstractC6898.f18364;
        c690134.getClass();
        C4511 c4511 = new C4511(c690134, 1);
        attributes$isNegated$2.getClass();
        if (c4511.f13152 != 1) {
            C0276.m848(c4511, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            return;
        }
        Attributes$isNullCheckPredicate$2 attributes$isNullCheckPredicate$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNullCheckPredicate$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4527) obj).f13190);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4527) obj).f13190 = ((Number) obj2).intValue();
            }
        };
        C6901 c690135 = AbstractC6898.f18363;
        c690135.getClass();
        C4511 c45112 = new C4511(c690135, 1);
        attributes$isNullCheckPredicate$2.getClass();
        if (c45112.f13152 == 1) {
            return;
        }
        C0276.m848(c45112, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Visibility m9142(C4535 c4535) {
        c4535.getClass();
        return (Visibility) f13270.m959(c4535, f13259[33]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ClassKind m9143(C4548 c4548) {
        return (ClassKind) f13256.m959(c4548, f13259[9]);
    }
}
