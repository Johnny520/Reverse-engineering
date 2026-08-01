package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.AbstractC4384;
import p046.C6479;
import p253.AbstractC8189;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTarget {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ KotlinTarget[] $VALUES;
    private static final Set<KotlinTarget> ALL_TARGET_SET;
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST;
    private static final List<KotlinTarget> CLASS_LIST;
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST;
    public static final C6479 Companion;
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET;
    private static final List<KotlinTarget> ENUM_ENTRY_LIST;
    private static final List<KotlinTarget> ENUM_LIST;
    private static final List<KotlinTarget> FILE_LIST;
    private static final List<KotlinTarget> FUNCTION_LIST;
    private static final List<KotlinTarget> INTERFACE_LIST;
    private static final List<KotlinTarget> LOCAL_CLASS_LIST;
    private static final List<KotlinTarget> OBJECT_LIST;
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST;
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST;
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING;
    private static final HashMap<String, KotlinTarget> map;
    private final String description;
    private final boolean isDefault;
    public static final KotlinTarget CLASS = new KotlinTarget("CLASS", 0, "class", false, 2, null);
    public static final KotlinTarget ANNOTATION_CLASS = new KotlinTarget("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final KotlinTarget TYPE_PARAMETER = new KotlinTarget("TYPE_PARAMETER", 2, "type parameter", false);
    public static final KotlinTarget PROPERTY = new KotlinTarget("PROPERTY", 3, "property", false, 2, null);
    public static final KotlinTarget FIELD = new KotlinTarget("FIELD", 4, "field", false, 2, null);
    public static final KotlinTarget LOCAL_VARIABLE = new KotlinTarget("LOCAL_VARIABLE", 5, "local variable", false, 2, null);
    public static final KotlinTarget VALUE_PARAMETER = new KotlinTarget("VALUE_PARAMETER", 6, "value parameter", false, 2, null);
    public static final KotlinTarget CONSTRUCTOR = new KotlinTarget("CONSTRUCTOR", 7, "constructor", false, 2, null);
    public static final KotlinTarget FUNCTION = new KotlinTarget("FUNCTION", 8, "function", false, 2, null);
    public static final KotlinTarget PROPERTY_GETTER = new KotlinTarget("PROPERTY_GETTER", 9, "getter", false, 2, null);
    public static final KotlinTarget PROPERTY_SETTER = new KotlinTarget("PROPERTY_SETTER", 10, "setter", false, 2, null);
    public static final KotlinTarget TYPE = new KotlinTarget("TYPE", 11, "type usage", false);
    public static final KotlinTarget EXPRESSION = new KotlinTarget("EXPRESSION", 12, "expression", false);
    public static final KotlinTarget FILE = new KotlinTarget("FILE", 13, "file", false);
    public static final KotlinTarget TYPEALIAS = new KotlinTarget("TYPEALIAS", 14, "typealias", false);
    public static final KotlinTarget TYPE_PROJECTION = new KotlinTarget("TYPE_PROJECTION", 15, "type projection", false);
    public static final KotlinTarget STAR_PROJECTION = new KotlinTarget("STAR_PROJECTION", 16, "star projection", false);
    public static final KotlinTarget PROPERTY_PARAMETER = new KotlinTarget("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final KotlinTarget CLASS_ONLY = new KotlinTarget("CLASS_ONLY", 18, "class", false);
    public static final KotlinTarget OBJECT = new KotlinTarget("OBJECT", 19, "object", false);
    public static final KotlinTarget STANDALONE_OBJECT = new KotlinTarget("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final KotlinTarget COMPANION_OBJECT = new KotlinTarget("COMPANION_OBJECT", 21, "companion object", false);
    public static final KotlinTarget INTERFACE = new KotlinTarget("INTERFACE", 22, "interface", false);
    public static final KotlinTarget ENUM_CLASS = new KotlinTarget("ENUM_CLASS", 23, "enum class", false);
    public static final KotlinTarget ENUM_ENTRY = new KotlinTarget("ENUM_ENTRY", 24, "enum entry", false);
    public static final KotlinTarget LOCAL_CLASS = new KotlinTarget("LOCAL_CLASS", 25, "local class", false);
    public static final KotlinTarget LOCAL_FUNCTION = new KotlinTarget("LOCAL_FUNCTION", 26, "local function", false);
    public static final KotlinTarget MEMBER_FUNCTION = new KotlinTarget("MEMBER_FUNCTION", 27, "member function", false);
    public static final KotlinTarget TOP_LEVEL_FUNCTION = new KotlinTarget("TOP_LEVEL_FUNCTION", 28, "top level function", false);
    public static final KotlinTarget MEMBER_PROPERTY = new KotlinTarget("MEMBER_PROPERTY", 29, "member property", false);
    public static final KotlinTarget MEMBER_PROPERTY_WITH_BACKING_FIELD = new KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
    public static final KotlinTarget MEMBER_PROPERTY_WITH_DELEGATE = new KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
    public static final KotlinTarget MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY = new KotlinTarget("TOP_LEVEL_PROPERTY", 33, "top level property", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_DELEGATE = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
    public static final KotlinTarget BACKING_FIELD = new KotlinTarget("BACKING_FIELD", 37, "backing field", false, 2, null);
    public static final KotlinTarget INITIALIZER = new KotlinTarget("INITIALIZER", 38, "initializer", false);
    public static final KotlinTarget DESTRUCTURING_DECLARATION = new KotlinTarget("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
    public static final KotlinTarget LAMBDA_EXPRESSION = new KotlinTarget("LAMBDA_EXPRESSION", 40, "lambda expression", false);
    public static final KotlinTarget ANONYMOUS_FUNCTION = new KotlinTarget("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
    public static final KotlinTarget OBJECT_LITERAL = new KotlinTarget("OBJECT_LITERAL", 42, "object literal", false);

    private static final /* synthetic */ KotlinTarget[] $values() {
        return new KotlinTarget[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS, TYPE_PROJECTION, STAR_PROJECTION, PROPERTY_PARAMETER, CLASS_ONLY, OBJECT, STANDALONE_OBJECT, COMPANION_OBJECT, INTERFACE, ENUM_CLASS, ENUM_ENTRY, LOCAL_CLASS, LOCAL_FUNCTION, MEMBER_FUNCTION, TOP_LEVEL_FUNCTION, MEMBER_PROPERTY, MEMBER_PROPERTY_WITH_BACKING_FIELD, MEMBER_PROPERTY_WITH_DELEGATE, MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, TOP_LEVEL_PROPERTY, TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD, TOP_LEVEL_PROPERTY_WITH_DELEGATE, TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, BACKING_FIELD, INITIALIZER, DESTRUCTURING_DECLARATION, LAMBDA_EXPRESSION, ANONYMOUS_FUNCTION, OBJECT_LITERAL};
    }

    static {
        KotlinTarget[] kotlinTargetArr$values = $values();
        $VALUES = kotlinTargetArr$values;
        $ENTRIES = AbstractC4363.m8876(kotlinTargetArr$values);
        Companion = new C6479();
        map = new HashMap<>();
        for (KotlinTarget kotlinTarget : getEntries()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        InterfaceC4364 entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((KotlinTarget) obj).isDefault) {
                arrayList.add(obj);
            }
        }
        DEFAULT_TARGET_SET = AbstractC4343.m8800(arrayList);
        ALL_TARGET_SET = AbstractC4343.m8800(getEntries());
        KotlinTarget kotlinTarget2 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget3 = CLASS;
        ANNOTATION_CLASS_LIST = AbstractC8189.m13659(kotlinTarget2, kotlinTarget3);
        LOCAL_CLASS_LIST = AbstractC8189.m13659(LOCAL_CLASS, kotlinTarget3);
        CLASS_LIST = AbstractC8189.m13659(CLASS_ONLY, kotlinTarget3);
        KotlinTarget kotlinTarget4 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget5 = OBJECT;
        COMPANION_OBJECT_LIST = AbstractC8189.m13659(kotlinTarget4, kotlinTarget5, kotlinTarget3);
        OBJECT_LIST = AbstractC8189.m13659(STANDALONE_OBJECT, kotlinTarget5, kotlinTarget3);
        INTERFACE_LIST = AbstractC8189.m13659(INTERFACE, kotlinTarget3);
        ENUM_LIST = AbstractC8189.m13659(ENUM_CLASS, kotlinTarget3);
        KotlinTarget kotlinTarget6 = ENUM_ENTRY;
        KotlinTarget kotlinTarget7 = PROPERTY;
        KotlinTarget kotlinTarget8 = FIELD;
        ENUM_ENTRY_LIST = AbstractC8189.m13659(kotlinTarget6, kotlinTarget7, kotlinTarget8);
        KotlinTarget kotlinTarget9 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = AbstractC8189.m13660(kotlinTarget9);
        KotlinTarget kotlinTarget10 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = AbstractC8189.m13660(kotlinTarget10);
        FUNCTION_LIST = AbstractC8189.m13660(FUNCTION);
        KotlinTarget kotlinTarget11 = FILE;
        FILE_LIST = AbstractC8189.m13660(kotlinTarget11);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget12 = VALUE_PARAMETER;
        USE_SITE_MAPPING = AbstractC4338.m8777(new Pair(annotationUseSiteTarget, kotlinTarget12), new Pair(AnnotationUseSiteTarget.FIELD, kotlinTarget8), new Pair(AnnotationUseSiteTarget.PROPERTY, kotlinTarget7), new Pair(AnnotationUseSiteTarget.FILE, kotlinTarget11), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget10), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget9), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget12), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget12), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget8));
    }

    public /* synthetic */ KotlinTarget(String str, int i, String str2, boolean z, int i2, AbstractC4384 abstractC4384) {
        this(str, i, str2, (i2 & 2) != 0 ? true : z);
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) $VALUES.clone();
    }

    private KotlinTarget(String str, int i, String str2, boolean z) {
        this.description = str2;
        this.isDefault = z;
    }
}
