package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeValue, reason: invalid class name */
/* JADX INFO: compiled from: AnnotationEncodeValue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeValue;", "", "()V", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationEncodeValue {
    public static final byte AnnotationEncodeArray = 12;
    public static final byte AnnotationMeta = 13;
    public static final byte ClassMeta = 9;
    public static final org.luckypray.dexkit.schema.AnnotationEncodeValue.Companion Companion = null;
    public static final byte EncodeValueBoolean = 15;
    public static final byte EncodeValueByte = 1;
    public static final byte EncodeValueChar = 3;
    public static final byte EncodeValueDouble = 7;
    public static final byte EncodeValueFloat = 6;
    public static final byte EncodeValueInt = 4;
    public static final byte EncodeValueLong = 5;
    public static final byte EncodeValueNull = 14;
    public static final byte EncodeValueShort = 2;
    public static final byte EncodeValueString = 8;
    public static final byte FieldMeta = 11;
    public static final byte MethodMeta = 10;
    public static final byte NONE = 0;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeValue$Companion */
    /* JADX INFO: compiled from: AnnotationEncodeValue.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\b\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\t\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\n\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\f\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\r\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000e\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000f\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0010\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0011\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0012\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0013\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0014\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeValue$Companion;", "", "()V", "AnnotationEncodeArray", "Lkotlin/UByte;", "B", "AnnotationMeta", "ClassMeta", "EncodeValueBoolean", "EncodeValueByte", "EncodeValueChar", "EncodeValueDouble", "EncodeValueFloat", "EncodeValueInt", "EncodeValueLong", "EncodeValueNull", "EncodeValueShort", "EncodeValueString", "FieldMeta", "MethodMeta", "NONE", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-AnnotationEncodeValue$Companion r0 = new org.luckypray.dexkit.schema.-AnnotationEncodeValue$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.AnnotationEncodeValue.Companion = r0
            return
    }

    private AnnotationEncodeValue() {
            r0 = this;
            r0.<init>()
            return
    }
}
