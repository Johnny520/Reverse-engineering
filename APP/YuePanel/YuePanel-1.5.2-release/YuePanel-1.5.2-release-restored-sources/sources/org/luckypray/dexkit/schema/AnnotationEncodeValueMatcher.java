package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeValueMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m2699d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMatcher;", "", "()V", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class AnnotationEncodeValueMatcher {
    public static final byte AnnotationEncodeArrayMatcher = 12;
    public static final byte AnnotationMatcher = 13;
    public static final byte ClassMatcher = 9;

    @InterfaceC6399
    public static final Companion Companion = new Companion(null);
    public static final byte EncodeValueBoolean = 15;
    public static final byte EncodeValueByte = 1;
    public static final byte EncodeValueChar = 3;
    public static final byte EncodeValueDouble = 7;
    public static final byte EncodeValueFloat = 6;
    public static final byte EncodeValueInt = 4;
    public static final byte EncodeValueLong = 5;
    public static final byte EncodeValueNull = 14;
    public static final byte EncodeValueShort = 2;
    public static final byte FieldMatcher = 11;
    public static final byte MethodMatcher = 10;
    public static final byte NONE = 0;
    public static final byte StringMatcher = 8;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeValueMatcher$Companion */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۢۢۥۥ;", "AnnotationEncodeArrayMatcher", "B", "AnnotationMatcher", "ClassMatcher", "EncodeValueBoolean", "EncodeValueByte", "EncodeValueChar", "EncodeValueDouble", "EncodeValueFloat", "EncodeValueInt", "EncodeValueLong", "EncodeValueNull", "EncodeValueShort", "FieldMatcher", "MethodMatcher", "NONE", "StringMatcher", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationEncodeValueMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    private AnnotationEncodeValueMatcher() {
    }
}
