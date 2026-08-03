package org.luckypray.dexkit.query.matchers;

import Yue.C4335;
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
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.AnnotationElementMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nAnnotationElementMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationElementMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationElementMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020$¢\u0006\u0004\b%\u0010&J+\u0010%\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010\nJ\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020'¢\u0006\u0004\b(\u0010)J+\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010\nJ\u0015\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u0010\r\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00002\u0006\u0010\r\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0000¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b9\u0010:J&\u0010\r\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b\r\u0010?J&\u0010(\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b(\u0010?J&\u0010,\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b,\u0010?J&\u0010/\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b/\u0010?J&\u00102\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b2\u0010?J&\u00105\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b5\u0010?J\u0017\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@H\u0014¢\u0006\u0004\bB\u0010CR(\u0010E\u001a\u0004\u0018\u00010$2\b\u0010D\u001a\u0004\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR(\u0010I\u001a\u0004\u0018\u00010\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\r\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "name", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "matcher", "value", "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "numberValue", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "byteValue", "(B)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "shortValue", "(S)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "intValue", "(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "longValue", "(J)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "floatValue", "(F)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "doubleValue", "(D)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "stringValue", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "classValue", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "className", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodValue", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "enumValue", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "arrayValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotationValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "nullValue", "()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "boolValue", "(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "nameMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "valueMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "getValueMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getValue", "setValue", "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationElementMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private StringMatcher nameMatcher;

    @InterfaceC6489
    private AnnotationEncodeValueMatcher valueMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationElementMatcher create() {
            return new AnnotationElementMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ AnnotationElementMatcher classValue$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationElementMatcher.classValue(str, stringMatchType, z);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationElementMatcher create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ AnnotationElementMatcher name$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationElementMatcher.name(str, stringMatchType, z);
    }

    public static /* synthetic */ AnnotationElementMatcher stringValue$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationElementMatcher.stringValue(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationElementMatcher annotationValue(@InterfaceC6399 AnnotationMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.annotationValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationElementMatcher arrayValue(@InterfaceC6399 AnnotationEncodeArrayMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.arrayValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher boolValue(boolean value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.boolValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher byteValue(byte value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.byteValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher classValue(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return classValue$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final AnnotationElementMatcher doubleValue(double value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.doubleValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationElementMatcher enumValue(@InterfaceC6399 FieldMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.enumValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher floatValue(float value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.floatValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getName() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final StringMatcher getNameMatcher() {
        return this.nameMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ AnnotationEncodeValueMatcher getValue() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final AnnotationEncodeValueMatcher getValueMatcher() {
        return this.valueMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        AnnotationEncodeValueType type;
        C5499.m17103(fbb, "fbb");
        AnnotationElementMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationElementMatcher.INSTANCE;
        StringMatcher stringMatcher = this.nameMatcher;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(fbb) : 0;
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = this.valueMatcher;
        byte value = (annotationEncodeValueMatcher == null || (type = annotationEncodeValueMatcher.getType()) == null) ? (byte) 0 : type.getValue();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher2 = this.valueMatcher;
        BaseMatcher baseMatcher = (BaseMatcher) (annotationEncodeValueMatcher2 != null ? annotationEncodeValueMatcher2.getValue() : null);
        int iM31160createAnnotationElementMatcherSpDDLgk = companion.m31160createAnnotationElementMatcherSpDDLgk(fbb, iBuild$dexkit_android_release, value, baseMatcher != null ? baseMatcher.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iM31160createAnnotationElementMatcherSpDDLgk);
        return iM31160createAnnotationElementMatcherSpDDLgk;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher intValue(int value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.intValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher longValue(long value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.longValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationElementMatcher methodValue(@InterfaceC6399 MethodMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.methodValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher name(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final AnnotationElementMatcher nullValue() {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.nullValue();
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher numberValue(@InterfaceC6399 Number value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        if (value instanceof Byte) {
            annotationEncodeValueMatcher.byteValue(value.byteValue());
        } else if (value instanceof Short) {
            annotationEncodeValueMatcher.shortValue(value.shortValue());
        } else if (value instanceof Integer) {
            annotationEncodeValueMatcher.intValue(value.intValue());
        } else if (value instanceof Long) {
            annotationEncodeValueMatcher.longValue(value.longValue());
        } else if (value instanceof Float) {
            annotationEncodeValueMatcher.floatValue(value.floatValue());
        } else if (value instanceof Double) {
            annotationEncodeValueMatcher.doubleValue(value.doubleValue());
        }
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final /* synthetic */ void setName(String str) {
        C5499.m17103(str, "value");
        name$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setValue(AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        C5499.m17103(annotationEncodeValueMatcher, "value");
        value(annotationEncodeValueMatcher);
    }

    @InterfaceC6399
    public final AnnotationElementMatcher shortValue(short value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.shortValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher stringValue(@InterfaceC6399 String str) {
        C5499.m17103(str, "value");
        return stringValue$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationElementMatcher value(@InterfaceC6399 AnnotationEncodeValueMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        this.valueMatcher = matcher;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationElementMatcher annotationValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        annotationValue(annotationMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationElementMatcher arrayValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher = new AnnotationEncodeArrayMatcher();
        init.invoke(annotationEncodeArrayMatcher);
        arrayValue(annotationEncodeArrayMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher classValue(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return classValue$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationElementMatcher enumValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        enumValue(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationElementMatcher methodValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        methodValue(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher name(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "name");
        C5499.m17103(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher stringValue(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "value");
        C5499.m17103(stringMatchType, "matchType");
        return stringValue$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationElementMatcher value(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        init.invoke(annotationEncodeValueMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher classValue(@InterfaceC6399 ClassMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher name(@InterfaceC6399 String name, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(name, "name");
        C5499.m17103(matchType, "matchType");
        this.nameMatcher = new StringMatcher(name, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementMatcher stringValue(@InterfaceC6399 StringMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(value);
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher classValue(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(new AnnotationElementMatcher$classValue$2$1$1(className, matchType, ignoreCase));
        value(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementMatcher stringValue(@InterfaceC6399 String value, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(value, "value");
        C5499.m17103(matchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(value, matchType, ignoreCase);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationElementMatcher classValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        classValue(classMatcher);
        return this;
    }
}
