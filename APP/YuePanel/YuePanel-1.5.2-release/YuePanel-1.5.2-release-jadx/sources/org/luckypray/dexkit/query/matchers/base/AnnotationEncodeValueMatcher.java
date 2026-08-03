package org.luckypray.dexkit.query.matchers.base;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher;
import org.luckypray.dexkit.query.matchers.AnnotationMatcher;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.EncodeValueBoolean;
import org.luckypray.dexkit.query.matchers.EncodeValueByte;
import org.luckypray.dexkit.query.matchers.EncodeValueChar;
import org.luckypray.dexkit.query.matchers.EncodeValueDouble;
import org.luckypray.dexkit.query.matchers.EncodeValueFloat;
import org.luckypray.dexkit.query.matchers.EncodeValueInt;
import org.luckypray.dexkit.query.matchers.EncodeValueLong;
import org.luckypray.dexkit.query.matchers.EncodeValueNull;
import org.luckypray.dexkit.query.matchers.EncodeValueShort;
import org.luckypray.dexkit.query.matchers.FieldMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 J2\u00020\u0001:\u0001JB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\"¢\u0006\u0004\b#\u0010$J+\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b#\u0010*J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000204¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000207¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0000¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020(¢\u0006\u0004\b<\u0010=J&\u0010,\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b,\u0010BJ&\u0010/\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b/\u0010BJ&\u00102\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b2\u0010BJ&\u00105\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b5\u0010BJ&\u00108\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b8\u0010BR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010FR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010C\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "value", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "type", "(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V", "", "number", "numberValue", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "byteValue", "(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "shortValue", "(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "charValue", "(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "intValue", "(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "longValue", "(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "floatValue", "(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "doubleValue", "(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "stringValue", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "classValue", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodValue", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "enumValue", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "arrayValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotationValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "nullValue", "()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "boolValue", "(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "<set-?>", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "getValue", "()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "getType", "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationEncodeValueMatcher implements QueryComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private AnnotationEncodeValueType type;

    @InterfaceC6489
    private IAnnotationEncodeValue value;

    @InterfaceC6211(m2698d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\"H\u0007J$\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\rH\u0007J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020(H\u0007¨\u0006)"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "number", "", "createAnnotation", "value", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "createArray", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "createBoolean", "", "createByte", "", "createChar", "", "createClass", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "createDouble", "", "createEnum", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "createFloat", "", "createInt", "", "createLong", "", "createMethod", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "createNull", "createShort", "", "createString", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public static /* synthetic */ AnnotationEncodeValueMatcher createString$default(Companion companion, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                stringMatchType = StringMatchType.Contains;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.createString(str, stringMatchType, z);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher create(@InterfaceC6399 Number number) {
            C5499.m17103(number, "number");
            return new AnnotationEncodeValueMatcher().numberValue(number);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createAnnotation(@InterfaceC6399 AnnotationMatcher annotationMatcher) {
            C5499.m17103(annotationMatcher, "value");
            return new AnnotationEncodeValueMatcher(annotationMatcher, AnnotationEncodeValueType.AnnotationValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createArray(@InterfaceC6399 AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
            C5499.m17103(annotationEncodeArrayMatcher, "value");
            return new AnnotationEncodeValueMatcher(annotationEncodeArrayMatcher, AnnotationEncodeValueType.ArrayValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createBoolean(boolean z) {
            return new AnnotationEncodeValueMatcher(new EncodeValueBoolean(z), AnnotationEncodeValueType.BoolValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createByte(byte b) {
            return new AnnotationEncodeValueMatcher(new EncodeValueByte(b), AnnotationEncodeValueType.ByteValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createChar(char c) {
            return new AnnotationEncodeValueMatcher(new EncodeValueChar(c), AnnotationEncodeValueType.CharValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createClass(@InterfaceC6399 ClassMatcher classMatcher) {
            C5499.m17103(classMatcher, "value");
            return new AnnotationEncodeValueMatcher(classMatcher, AnnotationEncodeValueType.TypeValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createDouble(double d) {
            return new AnnotationEncodeValueMatcher(new EncodeValueDouble(d), AnnotationEncodeValueType.DoubleValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createEnum(@InterfaceC6399 FieldMatcher fieldMatcher) {
            C5499.m17103(fieldMatcher, "value");
            return new AnnotationEncodeValueMatcher(fieldMatcher, AnnotationEncodeValueType.EnumValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createFloat(float f) {
            return new AnnotationEncodeValueMatcher(new EncodeValueFloat(f), AnnotationEncodeValueType.FloatValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createInt(int i) {
            return new AnnotationEncodeValueMatcher(new EncodeValueInt(i), AnnotationEncodeValueType.IntValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createLong(long j) {
            return new AnnotationEncodeValueMatcher(new EncodeValueLong(j), AnnotationEncodeValueType.LongValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createMethod(@InterfaceC6399 MethodMatcher methodMatcher) {
            C5499.m17103(methodMatcher, "value");
            return new AnnotationEncodeValueMatcher(methodMatcher, AnnotationEncodeValueType.MethodValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createNull() {
            return new AnnotationEncodeValueMatcher(new EncodeValueNull(), AnnotationEncodeValueType.NullValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createShort(short s) {
            return new AnnotationEncodeValueMatcher(new EncodeValueShort(s), AnnotationEncodeValueType.ShortValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        public final AnnotationEncodeValueMatcher createString(@InterfaceC6399 String str) {
            C5499.m17103(str, "value");
            return createString$default(this, str, null, false, 6, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        public final AnnotationEncodeValueMatcher createString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
            C5499.m17103(str, "value");
            C5499.m17103(stringMatchType, "matchType");
            return createString$default(this, str, stringMatchType, false, 4, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeValueMatcher createString(@InterfaceC6399 StringMatcher stringMatcher) {
            C5499.m17103(stringMatcher, "value");
            return new AnnotationEncodeValueMatcher(stringMatcher, AnnotationEncodeValueType.StringValue, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        public final AnnotationEncodeValueMatcher createString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType, boolean z) {
            C5499.m17103(str, "value");
            C5499.m17103(stringMatchType, "matchType");
            return new AnnotationEncodeValueMatcher(new StringMatcher(str, stringMatchType, z), AnnotationEncodeValueType.StringValue, null);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.query.base.IAnnotationEncodeValue)
  (r2v0 org.luckypray.dexkit.query.enums.AnnotationEncodeValueType)
 A[MD:(org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.<init>(org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AnnotationEncodeValueMatcher(IAnnotationEncodeValue iAnnotationEncodeValue, AnnotationEncodeValueType annotationEncodeValueType, C4335 c4335) {
        this(iAnnotationEncodeValue, annotationEncodeValueType);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher create(@InterfaceC6399 Number number) {
        return INSTANCE.create(number);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createAnnotation(@InterfaceC6399 AnnotationMatcher annotationMatcher) {
        return INSTANCE.createAnnotation(annotationMatcher);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createArray(@InterfaceC6399 AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
        return INSTANCE.createArray(annotationEncodeArrayMatcher);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createBoolean(boolean z) {
        return INSTANCE.createBoolean(z);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createByte(byte b) {
        return INSTANCE.createByte(b);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createChar(char c) {
        return INSTANCE.createChar(c);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createClass(@InterfaceC6399 ClassMatcher classMatcher) {
        return INSTANCE.createClass(classMatcher);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createDouble(double d) {
        return INSTANCE.createDouble(d);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createEnum(@InterfaceC6399 FieldMatcher fieldMatcher) {
        return INSTANCE.createEnum(fieldMatcher);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createFloat(float f) {
        return INSTANCE.createFloat(f);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createInt(int i) {
        return INSTANCE.createInt(i);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createLong(long j) {
        return INSTANCE.createLong(j);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createMethod(@InterfaceC6399 MethodMatcher methodMatcher) {
        return INSTANCE.createMethod(methodMatcher);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createNull() {
        return INSTANCE.createNull();
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createShort(short s) {
        return INSTANCE.createShort(s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    public static final AnnotationEncodeValueMatcher createString(@InterfaceC6399 String str) {
        return INSTANCE.createString(str);
    }

    public static /* synthetic */ AnnotationEncodeValueMatcher stringValue$default(AnnotationEncodeValueMatcher annotationEncodeValueMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationEncodeValueMatcher.stringValue(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeValueMatcher annotationValue(@InterfaceC6399 AnnotationMatcher value) {
        C5499.m17103(value, "value");
        this.value = value;
        this.type = AnnotationEncodeValueType.AnnotationValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeValueMatcher arrayValue(@InterfaceC6399 AnnotationEncodeArrayMatcher value) {
        C5499.m17103(value, "value");
        this.value = value;
        this.type = AnnotationEncodeValueType.ArrayValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher boolValue(boolean value) {
        this.value = new EncodeValueBoolean(value);
        this.type = AnnotationEncodeValueType.BoolValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher byteValue(byte value) {
        this.value = new EncodeValueByte(value);
        this.type = AnnotationEncodeValueType.ByteValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher charValue(char value) {
        this.value = new EncodeValueChar(value);
        this.type = AnnotationEncodeValueType.CharValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeValueMatcher classValue(@InterfaceC6399 ClassMatcher value) {
        C5499.m17103(value, "value");
        this.value = value;
        this.type = AnnotationEncodeValueType.TypeValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher doubleValue(double value) {
        this.value = new EncodeValueDouble(value);
        this.type = AnnotationEncodeValueType.DoubleValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeValueMatcher enumValue(@InterfaceC6399 FieldMatcher value) {
        C5499.m17103(value, "value");
        this.value = value;
        this.type = AnnotationEncodeValueType.EnumValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher floatValue(float value) {
        this.value = new EncodeValueFloat(value);
        this.type = AnnotationEncodeValueType.FloatValue;
        return this;
    }

    @InterfaceC6489
    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    @InterfaceC6489
    public final IAnnotationEncodeValue getValue() {
        return this.value;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher intValue(int value) {
        this.value = new EncodeValueInt(value);
        this.type = AnnotationEncodeValueType.IntValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher longValue(long value) {
        this.value = new EncodeValueLong(value);
        this.type = AnnotationEncodeValueType.LongValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeValueMatcher methodValue(@InterfaceC6399 MethodMatcher value) {
        C5499.m17103(value, "value");
        this.value = value;
        this.type = AnnotationEncodeValueType.MethodValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher nullValue() {
        this.value = new EncodeValueNull();
        this.type = AnnotationEncodeValueType.NullValue;
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher numberValue(@InterfaceC6399 Number number) {
        C5499.m17103(number, "number");
        if (number instanceof Byte) {
            byteValue(number.byteValue());
        } else if (number instanceof Short) {
            shortValue(number.shortValue());
        } else if (number instanceof Integer) {
            intValue(number.intValue());
        } else if (number instanceof Long) {
            longValue(number.longValue());
        } else if (number instanceof Float) {
            floatValue(number.floatValue());
        } else if (number instanceof Double) {
            doubleValue(number.doubleValue());
        }
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher shortValue(short value) {
        this.value = new EncodeValueShort(value);
        this.type = AnnotationEncodeValueType.ShortValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeValueMatcher stringValue(@InterfaceC6399 String str) {
        C5499.m17103(str, "value");
        return stringValue$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AnnotationEncodeValueMatcher() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    public static final AnnotationEncodeValueMatcher createString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        return INSTANCE.createString(str, stringMatchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeValueMatcher stringValue(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "value");
        C5499.m17103(stringMatchType, "matchType");
        return stringValue$default(this, str, stringMatchType, false, 4, null);
    }

    private AnnotationEncodeValueMatcher(IAnnotationEncodeValue iAnnotationEncodeValue, AnnotationEncodeValueType annotationEncodeValueType) {
        this.value = iAnnotationEncodeValue;
        this.type = annotationEncodeValueType;
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    public static final AnnotationEncodeValueMatcher createString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType, boolean z) {
        return INSTANCE.createString(str, stringMatchType, z);
    }

    public final /* synthetic */ AnnotationEncodeValueMatcher annotationValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        annotationValue(annotationMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeValueMatcher arrayValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher = new AnnotationEncodeArrayMatcher();
        init.invoke(annotationEncodeArrayMatcher);
        arrayValue(annotationEncodeArrayMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeValueMatcher classValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        classValue(classMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeValueMatcher enumValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        enumValue(fieldMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeValueMatcher methodValue(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        methodValue(methodMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMatcher stringValue(@InterfaceC6399 StringMatcher value) {
        C5499.m17103(value, "value");
        this.value = value;
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeValueMatcher createString(@InterfaceC6399 StringMatcher stringMatcher) {
        return INSTANCE.createString(stringMatcher);
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeValueMatcher stringValue(@InterfaceC6399 String value, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(value, "value");
        C5499.m17103(matchType, "matchType");
        this.value = new StringMatcher(value, matchType, ignoreCase);
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }
}
