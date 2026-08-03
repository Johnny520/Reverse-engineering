package org.luckypray.dexkit.query.matchers;

import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.C8048;
import Yue.C8053;
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
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nAnnotationEncodeArrayMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,462:1\n1#2:463\n1547#3:464\n1618#3,3:465\n1547#3:468\n1618#3,3:469\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher\n*L\n452#1:464\n452#1:465,3\n454#1:468\n454#1:469,3\n*E\n"})
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0014\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0001gB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0014J!\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u000fJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\r¢\u0006\u0004\b(\u0010\u000fJ\u0015\u0010*\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u0010\"\u001a\u000202¢\u0006\u0004\b3\u00104J+\u00103\u001a\u00020\u00002\u0006\u0010\"\u001a\u0002052\b\b\u0002\u0010\u000b\u001a\u0002062\b\b\u0002\u00108\u001a\u000207H\u0007¢\u0006\u0004\b3\u00109J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020:¢\u0006\u0004\b;\u0010<J+\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u0002052\b\b\u0002\u0010\u000b\u001a\u0002062\b\b\u0002\u00108\u001a\u000207H\u0007¢\u0006\u0004\b;\u00109J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020>¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\u00002\u0006\u0010\"\u001a\u000207¢\u0006\u0004\bI\u0010JJ&\u0010\u001b\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\b\u001b\u0010OJ&\u0010;\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\b;\u0010OJ&\u0010?\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\b?\u0010OJ&\u0010B\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\bB\u0010OJ&\u0010E\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\bE\u0010OJ\u0017\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020PH\u0014¢\u0006\u0004\bR\u0010SR4\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010T2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010T8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR*\u0010\u000b\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010_\u001a\u0004\u0018\u00010\u00102\b\u0010U\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006h"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "elements", "values", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "countMin", "countMax", "element", "add", "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "number", "addNumber", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "value", "addByte", "(B)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "addShort", "(S)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "addInt", "", "addLong", "(J)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "addFloat", "(F)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "addDouble", "(D)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "addString", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "addClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "className", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "addMethod", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "addEnum", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "addNull", "()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "addBool", "(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "encodeValuesMatcher", "Ljava/util/List;", "getEncodeValuesMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationEncodeArrayMatcher extends BaseMatcher implements IAnnotationEncodeValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private List<AnnotationEncodeValueMatcher> encodeValuesMatcher;

    @InterfaceC6399
    private MatchType matchType = MatchType.Contains;

    @InterfaceC6489
    private IntRange rangeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationEncodeArrayMatcher create() {
            return new AnnotationEncodeArrayMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher addClass$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationEncodeArrayMatcher.addClass(str, stringMatchType, z);
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher addString$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationEncodeArrayMatcher.addString(str, stringMatchType, z);
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher count$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return annotationEncodeArrayMatcher.count(i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationEncodeArrayMatcher create() {
        return INSTANCE.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher add(@InterfaceC6399 AnnotationEncodeValueMatcher element) {
        C5499.m17103(element, "element");
        List<AnnotationEncodeValueMatcher> arrayList = this.encodeValuesMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.encodeValuesMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(element);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addAnnotation(@InterfaceC6399 AnnotationMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.annotationValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addBool(boolean value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.boolValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addByte(byte value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.byteValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeArrayMatcher addClass(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return addClass$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addDouble(double value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.doubleValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addEnum(@InterfaceC6399 FieldMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.enumValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addFloat(float value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.floatValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addInt(int value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.intValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addLong(long value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.longValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addMethod(@InterfaceC6399 MethodMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.methodValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addNull() {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.nullValue();
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addNumber(@InterfaceC6399 Number number) {
        C5499.m17103(number, "number");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        if (number instanceof Byte) {
            annotationEncodeValueMatcher.byteValue(number.byteValue());
        } else if (number instanceof Short) {
            annotationEncodeValueMatcher.shortValue(number.shortValue());
        } else if (number instanceof Integer) {
            annotationEncodeValueMatcher.intValue(number.intValue());
        } else if (number instanceof Long) {
            annotationEncodeValueMatcher.longValue(number.longValue());
        } else if (number instanceof Float) {
            annotationEncodeValueMatcher.floatValue(number.floatValue());
        } else if (number instanceof Double) {
            annotationEncodeValueMatcher.doubleValue(number.doubleValue());
        }
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addShort(short value) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.shortValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeArrayMatcher addString(@InterfaceC6399 String str) {
        C5499.m17103(str, "value");
        return addString$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    @InterfaceC6399
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final AnnotationEncodeArrayMatcher setCount(int count) {
        this.rangeMatcher = new IntRange(count);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher countMax(int max) {
        this.rangeMatcher = new IntRange(0, max);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher countMin(int min) {
        this.rangeMatcher = new IntRange(min, Integer.MAX_VALUE);
        return this;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final List<AnnotationEncodeValueMatcher> getEncodeValuesMatcher() {
        return this.encodeValuesMatcher;
    }

    @InterfaceC6399
    public final MatchType getMatchType() {
        return this.matchType;
    }

    @InterfaceC6489
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iM31163createValuesTypeVectorVUfvBY;
        int iCreateValuesVector;
        C5499.m17103(fbb, "fbb");
        AnnotationEncodeArrayMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.INSTANCE;
        List<AnnotationEncodeValueMatcher> list = this.encodeValuesMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AnnotationEncodeValueType type = ((AnnotationEncodeValueMatcher) it.next()).getType();
                C5499.m17100(type);
                arrayList.add(C8048.m26188(type.getValue()));
            }
            iM31163createValuesTypeVectorVUfvBY = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.INSTANCE.m31163createValuesTypeVectorVUfvBY(fbb, C8053.m26267(arrayList));
        } else {
            iM31163createValuesTypeVectorVUfvBY = 0;
        }
        List<AnnotationEncodeValueMatcher> list2 = this.encodeValuesMatcher;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(C3881.m10756(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Object value = ((AnnotationEncodeValueMatcher) it2.next()).getValue();
                C5499.m17101(value, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseMatcher");
                arrayList2.add(Integer.valueOf(((BaseMatcher) value).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList2);
            iCreateValuesVector = iArrM11061 != null ? org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.INSTANCE.createValuesVector(fbb, iArrM11061) : 0;
        }
        byte value2 = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateAnnotationEncodeArrayMatcher = companion.createAnnotationEncodeArrayMatcher(fbb, iM31163createValuesTypeVectorVUfvBY, iCreateValuesVector, value2, intRange != null ? intRange.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateAnnotationEncodeArrayMatcher);
        return iCreateAnnotationEncodeArrayMatcher;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher matchType(@InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        C5499.m17103(matchType, "<set-?>");
        this.matchType = matchType;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher values(@InterfaceC6399 Collection<AnnotationEncodeValueMatcher> elements) {
        C5499.m17103(elements, "elements");
        this.encodeValuesMatcher = C3888.m11065(elements);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationEncodeArrayMatcher addAnnotation(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeArrayMatcher addClass(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return addClass$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationEncodeArrayMatcher addEnum(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        addEnum(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ AnnotationEncodeArrayMatcher addMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addMethod(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeArrayMatcher addString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "value");
        C5499.m17103(stringMatchType, "matchType");
        return addString$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher count(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = range;
        return this;
    }

    public final /* synthetic */ AnnotationEncodeArrayMatcher add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        init.invoke(annotationEncodeValueMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addClass(@InterfaceC6399 ClassMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher addString(@InterfaceC6399 StringMatcher value) {
        C5499.m17103(value, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(value);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher count(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = new IntRange(range);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeArrayMatcher addClass(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(new AnnotationEncodeArrayMatcher$addClass$2$1$1(className, matchType, ignoreCase));
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationEncodeArrayMatcher addString(@InterfaceC6399 String value, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(value, "value");
        C5499.m17103(matchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(value, matchType, ignoreCase);
        add(annotationEncodeValueMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher count(int min, int max) {
        this.rangeMatcher = new IntRange(min, max);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeArrayMatcher addClass(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        addClass(classMatcher);
        return this;
    }
}
