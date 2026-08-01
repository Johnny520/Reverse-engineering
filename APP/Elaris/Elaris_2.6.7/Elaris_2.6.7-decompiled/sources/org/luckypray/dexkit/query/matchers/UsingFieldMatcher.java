package org.luckypray.dexkit.query.matchers;

import java.lang.reflect.Field;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.UsingFieldMatcher;
import org.luckypray.dexkit.wrap.DexField;
import p000.AbstractC0025b8;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.C0042c9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private FieldMatcher matcher;
    private UsingType usingType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UsingFieldMatcher(Field field, UsingType usingType) {
        field.getClass();
        usingType.getClass();
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(field);
        this.usingType = usingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UsingFieldMatcher annotationCount$default(UsingFieldMatcher usingFieldMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return usingFieldMatcher.annotationCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final UsingFieldMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UsingFieldMatcher declaredClass$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return usingFieldMatcher.declaredClass(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UsingFieldMatcher modifiers$default(UsingFieldMatcher usingFieldMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return usingFieldMatcher.modifiers(i, matchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UsingFieldMatcher name$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return usingFieldMatcher.name(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UsingFieldMatcher type$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return usingFieldMatcher.type(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        annotationMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addAnnotation(annotationMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher addReadMethods(String str) {
        str.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addReadMethod(new MethodMatcher(str));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher addWriteMethod(String str) {
        str.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addWriteMethod(new MethodMatcher(str));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher annotationCount(IntRange intRange) {
        intRange.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(intRange);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        annotationsMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher declaredClass(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.declaredClass(str, stringMatchType, z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher descriptor(String str) {
        str.getClass();
        DexField dexField = new DexField(str);
        name$default(this, dexField.getName(), null, false, 6, null);
        declaredClass$default(this, dexField.getClassName(), null, false, 6, null);
        type$default(this, dexField.getTypeName(), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ UsingFieldMatcher field(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        field(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getDeclaredClass() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getDescriptor() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher getMatcher() {
        return this.matcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int getModifiers() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getName() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getType() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingType getUsingType() {
        return this.usingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        c0038c5.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            throw new IllegalArgumentException("UsingFieldMatcher matcher not set");
        }
        UsingFieldMatcher.Companion companion = org.luckypray.dexkit.schema.UsingFieldMatcher.Companion;
        fieldMatcher.getClass();
        int iCreateUsingFieldMatcher = companion.createUsingFieldMatcher(c0038c5, fieldMatcher.build$dexkit_android_release(c0038c5), this.usingType.getValue());
        c0038c5.m108n(iCreateUsingFieldMatcher);
        return iCreateUsingFieldMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        accessFlagsMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.modifiers(accessFlagsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher name(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.name(str, stringMatchType, z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher readMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.readMethods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setDeclaredClass(String str) {
        str.getClass();
        declaredClass$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setDescriptor(String str) {
        str.getClass();
        descriptor(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setModifiers(int i) {
        modifiers$default(this, i, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setName(String str) {
        str.getClass();
        name$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setType(String str) {
        str.getClass();
        type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setUsingType(UsingType usingType) {
        usingType.getClass();
        this.usingType = usingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher type(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.type(str, stringMatchType, z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher usingType(UsingType usingType) {
        usingType.getClass();
        this.usingType = usingType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher writeMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.writeMethods(methodsMatcher);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final UsingFieldMatcher create() {
            return new UsingFieldMatcher();
        }

        private Companion() {
        }
    }

    public final UsingFieldMatcher field(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        this.matcher = fieldMatcher;
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher addAnnotation(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0482u5.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final UsingFieldMatcher annotationCount(int i) {
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(i);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher annotations(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0482u5.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    public final UsingFieldMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    public final /* synthetic */ UsingFieldMatcher readMethods(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0482u5.invoke(methodsMatcher);
        readMethods(methodsMatcher);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher writeMethods(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0482u5.invoke(methodsMatcher);
        writeMethods(methodsMatcher);
        return this;
    }

    public final UsingFieldMatcher modifiers(int i, MatchType matchType) {
        matchType.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.modifiers(i, matchType);
        return this;
    }

    public final UsingFieldMatcher annotationCount(AbstractC0025b8 abstractC0025b8) {
        abstractC0025b8.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(abstractC0025b8);
        return this;
    }

    public final UsingFieldMatcher declaredClass(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final UsingFieldMatcher name(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    public final UsingFieldMatcher type(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public final UsingFieldMatcher annotationCount(int i, int i2) {
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(i, i2);
        return this;
    }

    public final UsingFieldMatcher declaredClass(ClassMatcher classMatcher) {
        classMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.declaredClass(classMatcher);
        return this;
    }

    public final UsingFieldMatcher name(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.name(stringMatcher);
        return this;
    }

    public final UsingFieldMatcher type(ClassMatcher classMatcher) {
        classMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.type(classMatcher);
        return this;
    }

    public UsingFieldMatcher() {
        this.usingType = UsingType.Any;
    }

    public final UsingFieldMatcher addReadMethods(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addReadMethod(methodMatcher);
        return this;
    }

    public final UsingFieldMatcher addWriteMethod(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addWriteMethod(methodMatcher);
        return this;
    }

    public final UsingFieldMatcher declaredClass(Class<?> cls) {
        cls.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.declaredClass(cls);
        return this;
    }

    public final UsingFieldMatcher name(String str) {
        str.getClass();
        return name$default(this, str, null, false, 6, null);
    }

    public final UsingFieldMatcher type(Class<?> cls) {
        cls.getClass();
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.type(cls);
        return this;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.reflect.Field)
  (wrap:org.luckypray.dexkit.query.enums.UsingType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.UsingType:0x0004: SGET  A[WRAPPED] (LINE:26) org.luckypray.dexkit.query.enums.UsingType.Any org.luckypray.dexkit.query.enums.UsingType) : (r2v0 org.luckypray.dexkit.query.enums.UsingType))
 A[MD:(java.lang.reflect.Field, org.luckypray.dexkit.query.enums.UsingType):void (m)] (LINE:26) call: org.luckypray.dexkit.query.matchers.UsingFieldMatcher.<init>(java.lang.reflect.Field, org.luckypray.dexkit.query.enums.UsingType):void type: THIS */
    public /* synthetic */ UsingFieldMatcher(Field field, UsingType usingType, int i, AbstractC0431r2 abstractC0431r2) {
        this(field, (i & 2) != 0 ? UsingType.Any : usingType);
    }

    public final /* synthetic */ UsingFieldMatcher addReadMethods(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        addReadMethods(methodMatcher);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher addWriteMethod(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        addWriteMethod(methodMatcher);
        return this;
    }

    public UsingFieldMatcher(String str, UsingType usingType) {
        str.getClass();
        usingType.getClass();
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(str);
        this.usingType = usingType;
    }

    public final UsingFieldMatcher declaredClass(String str) {
        str.getClass();
        return declaredClass$default(this, str, null, false, 6, null);
    }

    public final UsingFieldMatcher type(String str) {
        str.getClass();
        return type$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ UsingFieldMatcher declaredClass(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher type(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:org.luckypray.dexkit.query.enums.UsingType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.UsingType:0x0004: SGET  A[WRAPPED] (LINE:31) org.luckypray.dexkit.query.enums.UsingType.Any org.luckypray.dexkit.query.enums.UsingType) : (r2v0 org.luckypray.dexkit.query.enums.UsingType))
 A[MD:(java.lang.String, org.luckypray.dexkit.query.enums.UsingType):void (m)] (LINE:31) call: org.luckypray.dexkit.query.matchers.UsingFieldMatcher.<init>(java.lang.String, org.luckypray.dexkit.query.enums.UsingType):void type: THIS */
    public /* synthetic */ UsingFieldMatcher(String str, UsingType usingType, int i, AbstractC0431r2 abstractC0431r2) {
        this(str, (i & 2) != 0 ? UsingType.Any : usingType);
    }
}
