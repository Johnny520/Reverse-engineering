package org.luckypray.dexkit.query.matchers;

import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.EnumC0393;
import Yue.InterfaceC4372;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import com.google.flatbuffers.FlatBufferBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.RetentionPolicyType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.TargetElementType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher;
import org.luckypray.dexkit.schema.AnnotationMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nAnnotationMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n1547#2:489\n1618#2,3:490\n1547#2:497\n1618#2,3:498\n1547#2:505\n1618#2,3:506\n11328#3:493\n11663#3,3:494\n11328#3:501\n11663#3,3:502\n1#4:509\n*S KotlinDebug\n*F\n+ 1 AnnotationMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationMatcher\n*L\n341#1:489\n341#1:490,3\n369#1:497\n369#1:498,3\n482#1:505\n482#1:506,3\n357#1:493\n357#1:494,3\n381#1:501\n381#1:502,3\n*E\n"})
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0018\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001hB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0006\u001a\u00020\u00002\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0006\u0010\nJ+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0006\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b'\u0010+J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010*\u001a\u00020,¢\u0006\u0004\b'\u0010-J!\u0010'\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020%2\b\b\u0002\u0010/\u001a\u00020%¢\u0006\u0004\b'\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J1\u00102\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b2\u00104J!\u00102\u001a\u00020\u00002\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b05\"\u00020\u000b¢\u0006\u0004\b2\u00106J\u001b\u00107\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b7\u00108J!\u00107\u001a\u00020\u00002\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b05\"\u00020\u000b¢\u0006\u0004\b7\u00106J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J+\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b;\u0010\u0011J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000b¢\u0006\u0004\b=\u0010>J&\u0010\u0006\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b\u0006\u0010CJ&\u0010\u0013\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b\u0013\u0010CJ&\u0010\u001d\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b\u001d\u0010CJ&\u0010!\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b!\u0010CJ\u0017\u0010F\u001a\u00020%2\u0006\u0010E\u001a\u00020DH\u0014¢\u0006\u0004\bF\u0010GR(\u0010I\u001a\u0004\u0018\u00010\u00052\b\u0010H\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR(\u0010M\u001a\u0004\u0018\u00010\u00122\b\u0010H\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR4\u0010R\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010Q2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010Q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR.\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010H\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010[\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R$\u0010\u0006\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR0\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "type", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "targetElementTypes", "(Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "Lorg/luckypray/dexkit/query/enums/TargetElementType;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "policy", "(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "elements", "(Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "element", "addElement", "(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "elementMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "count", "elementCount", "(I)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "usingEqStrings", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "usingString", "addUsingString", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "addEqString", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "typeMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getTypeMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "targetElementTypesMatcher", "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "getTargetElementTypesMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "", "usingStringsMatcher", "Ljava/util/List;", "getUsingStringsMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "getPolicy", "()Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "setPolicy", "(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)V", "elementsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "getElementsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "value", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationMatcher extends BaseMatcher implements IAnnotationEncodeValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private AnnotationElementsMatcher elementsMatcher;

    @InterfaceC6489
    private RetentionPolicyType policy;

    @InterfaceC6489
    private TargetElementTypesMatcher targetElementTypesMatcher;

    @InterfaceC6489
    private ClassMatcher typeMatcher;

    @InterfaceC6489
    private List<StringMatcher> usingStringsMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationMatcher create() {
            return new AnnotationMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ AnnotationMatcher addUsingString$default(AnnotationMatcher annotationMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationMatcher.addUsingString(str, stringMatchType, z);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationMatcher create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ AnnotationMatcher elementCount$default(AnnotationMatcher annotationMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return annotationMatcher.elementCount(i, i2);
    }

    public static /* synthetic */ AnnotationMatcher targetElementTypes$default(AnnotationMatcher annotationMatcher, Collection collection, MatchType matchType, int i, Object obj) {
        if ((i & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return annotationMatcher.targetElementTypes(collection, matchType);
    }

    public static /* synthetic */ AnnotationMatcher type$default(AnnotationMatcher annotationMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationMatcher.type(str, stringMatchType, z);
    }

    public static /* synthetic */ AnnotationMatcher usingStrings$default(AnnotationMatcher annotationMatcher, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationMatcher.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationMatcher addElement(@InterfaceC6399 AnnotationElementMatcher element) {
        C5499.m17103(element, "element");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        C5499.m17101(annotationElementsMatcher, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher");
        annotationElementsMatcher.add(element);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher addEqString(@InterfaceC6399 String usingString) {
        C5499.m17103(usingString, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(new StringMatcher(usingString, StringMatchType.Equals, false));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher addUsingString(@InterfaceC6399 String str) {
        C5499.m17103(str, "usingString");
        return addUsingString$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationMatcher elementCount(int count) {
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        C5499.m17101(annotationElementsMatcher, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher");
        annotationElementsMatcher.setCount(count);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher elementMatchType(@InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        C5499.m17101(annotationElementsMatcher, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher");
        annotationElementsMatcher.matchType(matchType);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationMatcher elements(@InterfaceC6399 AnnotationElementsMatcher elements) {
        C5499.m17103(elements, "elements");
        this.elementsMatcher = elements;
        return this;
    }

    @InterfaceC6489
    public final AnnotationElementsMatcher getElementsMatcher() {
        return this.elementsMatcher;
    }

    @InterfaceC6489
    public final RetentionPolicyType getPolicy() {
        return this.policy;
    }

    @InterfaceC6489
    public final TargetElementTypesMatcher getTargetElementTypesMatcher() {
        return this.targetElementTypesMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getType() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getUsingStrings() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final List<StringMatcher> getUsingStringsMatcher() {
        return this.usingStringsMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateVectorOfTables;
        C5499.m17103(fbb, "fbb");
        AnnotationMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationMatcher.INSTANCE;
        ClassMatcher classMatcher = this.typeMatcher;
        int iBuild$dexkit_android_release = classMatcher != null ? classMatcher.build$dexkit_android_release(fbb) : 0;
        TargetElementTypesMatcher targetElementTypesMatcher = this.targetElementTypesMatcher;
        int iBuild$dexkit_android_release2 = targetElementTypesMatcher != null ? targetElementTypesMatcher.build$dexkit_android_release(fbb) : 0;
        RetentionPolicyType retentionPolicyType = this.policy;
        byte value = retentionPolicyType != null ? retentionPolicyType.getValue() : (byte) 0;
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        int iBuild$dexkit_android_release3 = annotationElementsMatcher != null ? annotationElementsMatcher.build$dexkit_android_release(fbb) : 0;
        List<StringMatcher> list = this.usingStringsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((StringMatcher) it.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        int iCreateAnnotationMatcher = companion.createAnnotationMatcher(fbb, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, value, iBuild$dexkit_android_release3, iCreateVectorOfTables);
        fbb.finish(iCreateAnnotationMatcher);
        return iCreateAnnotationMatcher;
    }

    @InterfaceC6399
    public final AnnotationMatcher policy(@InterfaceC6399 RetentionPolicyType policy) {
        C5499.m17103(policy, "policy");
        this.policy = policy;
        return this;
    }

    public final /* synthetic */ void setPolicy(RetentionPolicyType retentionPolicyType) {
        this.policy = retentionPolicyType;
    }

    public final /* synthetic */ void setType(String str) {
        C5499.m17103(str, "value");
        type$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setUsingStrings(Collection collection) {
        C5499.m17103(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationMatcher targetElementTypes(@InterfaceC6399 TargetElementTypesMatcher targetElementTypes) {
        C5499.m17103(targetElementTypes, "targetElementTypes");
        this.targetElementTypesMatcher = targetElementTypes;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher type(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationMatcher usingEqStrings(@InterfaceC6399 Collection<String> usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingStrings, 10));
        Iterator<T> it = usingStrings.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher usingStrings(@InterfaceC6399 Collection<String> collection) {
        C5499.m17103(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher addUsingString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "usingString");
        C5499.m17103(stringMatchType, "matchType");
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationMatcher elements(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationElementsMatcher annotationElementsMatcher = new AnnotationElementsMatcher();
        init.invoke(annotationElementsMatcher);
        elements(annotationElementsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final AnnotationMatcher targetElementTypes(@InterfaceC6399 Collection<? extends TargetElementType> targetElementTypes, @InterfaceC6399 MatchType matchType) {
        C5499.m17103(targetElementTypes, "targetElementTypes");
        C5499.m17103(matchType, "matchType");
        TargetElementTypesMatcher targetElementTypesMatcher = new TargetElementTypesMatcher();
        targetElementTypesMatcher.types(targetElementTypes);
        targetElementTypesMatcher.matchType(matchType);
        this.targetElementTypesMatcher = targetElementTypesMatcher;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher type(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher usingStrings(@InterfaceC6399 Collection<String> collection, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(collection, "usingStrings");
        C5499.m17103(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    public final /* synthetic */ AnnotationMatcher addElement(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        init.invoke(annotationElementMatcher);
        addElement(annotationElementMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher addUsingString(@InterfaceC6399 StringMatcher usingString) {
        C5499.m17103(usingString, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(usingString);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher elementCount(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        C5499.m17101(annotationElementsMatcher, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher");
        annotationElementsMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher type(@InterfaceC6399 ClassMatcher type) {
        C5499.m17103(type, "type");
        this.typeMatcher = type;
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher usingStrings(@InterfaceC6399 StringMatcherList usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        this.usingStringsMatcher = usingStrings;
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher type(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        ClassMatcher classMatcher = new ClassMatcher();
        String name = clazz.getName();
        C5499.m17102(name, "clazz.name");
        this.typeMatcher = ClassMatcher.className$default(classMatcher, name, null, false, 6, null);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher usingStrings(@InterfaceC6399 Collection<String> usingStrings, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingStrings, "usingStrings");
        C5499.m17103(matchType, "matchType");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingStrings, 10));
        Iterator<T> it = usingStrings.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), matchType, ignoreCase));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher addUsingString(@InterfaceC6399 String usingString, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingString, "usingString");
        C5499.m17103(matchType, "matchType");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(new StringMatcher(usingString, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher elementCount(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        C5499.m17101(annotationElementsMatcher, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher");
        annotationElementsMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationMatcher type(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        this.typeMatcher = new ClassMatcher().className(typeName, matchType, ignoreCase);
        return this;
    }

    public final /* synthetic */ AnnotationMatcher targetElementTypes(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        TargetElementTypesMatcher targetElementTypesMatcher = new TargetElementTypesMatcher();
        init.invoke(targetElementTypesMatcher);
        targetElementTypes(targetElementTypesMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationMatcher type(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher elementCount(int min, int max) {
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        C5499.m17101(annotationElementsMatcher, "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher");
        annotationElementsMatcher.count(min, max);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher usingEqStrings(@InterfaceC6399 String... usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(usingStrings.length);
        for (String str : usingStrings) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    @InterfaceC6399
    public final AnnotationMatcher usingStrings(@InterfaceC6399 String... usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(usingStrings.length);
        for (String str : usingStrings) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }
}
