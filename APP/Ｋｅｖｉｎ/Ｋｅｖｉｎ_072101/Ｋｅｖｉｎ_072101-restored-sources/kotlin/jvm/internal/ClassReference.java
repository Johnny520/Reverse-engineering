package kotlin.jvm.internal;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001OB\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010N\u001a\u000201H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010 \u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0015R\u001a\u0010\"\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u0015R\u001a\u0010$\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u001e\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R(\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0014\u001a\u0004\b6\u0010\u000bR\u0016\u00107\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020:0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u000bR \u0010=\u001a\b\u0012\u0004\u0012\u00020>0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010\u000bR\u001c\u0010A\u001a\u0004\u0018\u00010B8VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0014\u001a\u0004\bD\u0010E¨\u0006P"}, m115d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "Companion", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class ClassReference implements kotlin.reflect.KClass<java.lang.Object>, kotlin.jvm.internal.ClassBasedDeclarationContainer {
    public static final kotlin.jvm.internal.ClassReference.Companion Companion = null;
    private static final java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> FUNCTION_CLASSES = null;
    private static final java.util.HashMap<java.lang.String, java.lang.String> classFqNames = null;
    private static final java.util.HashMap<java.lang.String, java.lang.String> primitiveFqNames = null;
    private static final java.util.HashMap<java.lang.String, java.lang.String> primitiveWrapperFqNames = null;
    private static final java.util.Map<java.lang.String, java.lang.String> simpleNames = null;
    private final java.lang.Class<?> jClass;

    /* JADX INFO: compiled from: ClassReference.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m115d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "()V", "FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "classFqNames", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "getClassQualifiedName", "jClass", "getClassSimpleName", "isInstance", "", "value", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
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

        public final java.lang.String getClassQualifiedName(java.lang.Class<?> r5) {
                r4 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                boolean r0 = r5.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto L66
            Le:
                boolean r0 = r5.isLocalClass()
                if (r0 == 0) goto L15
                goto L66
            L15:
                boolean r0 = r5.isArray()
                if (r0 == 0) goto L51
                java.lang.Class r0 = r5.getComponentType()
                boolean r2 = r0.isPrimitive()
                if (r2 == 0) goto L4a
                java.util.HashMap r2 = kotlin.jvm.internal.ClassReference.access$getClassFqNames$cp()
                java.lang.String r3 = r0.getName()
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L4b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "Array"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L4b
            L4a:
            L4b:
                if (r1 != 0) goto L66
            L4e:
                java.lang.String r1 = "kotlin.Array"
                goto L66
            L51:
                java.util.HashMap r0 = kotlin.jvm.internal.ClassReference.access$getClassFqNames$cp()
                java.lang.String r1 = r5.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L66
                java.lang.String r1 = r5.getCanonicalName()
            L66:
                return r1
        }

        public final java.lang.String getClassSimpleName(java.lang.Class<?> r10) {
                r9 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                boolean r0 = r10.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Lf
                goto Lc3
            Lf:
                boolean r0 = r10.isLocalClass()
                if (r0 == 0) goto L74
                java.lang.String r0 = r10.getSimpleName()
                java.lang.reflect.Method r2 = r10.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L47
                r6 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = r2.getName()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r4)
                java.lang.String r7 = r7.toString()
                java.lang.String r2 = kotlin.text.StringsKt.substringAfter$default(r0, r7, r1, r3, r1)
                if (r2 != 0) goto L44
                goto L47
            L44:
                r1 = r2
                goto Lc3
            L47:
                java.lang.reflect.Constructor r2 = r10.getEnclosingConstructor()
                if (r2 == 0) goto L6b
                r6 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = r2.getName()
                java.lang.StringBuilder r5 = r5.append(r7)
                java.lang.StringBuilder r4 = r5.append(r4)
                java.lang.String r4 = r4.toString()
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r4, r1, r3, r1)
                goto Lc3
            L6b:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r4, r1, r3, r1)
                goto Lc3
            L74:
                boolean r0 = r10.isArray()
                if (r0 == 0) goto Lae
                java.lang.Class r0 = r10.getComponentType()
                boolean r2 = r0.isPrimitive()
                java.lang.String r3 = "Array"
                if (r2 == 0) goto La9
                java.util.Map r2 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r4 = r0.getName()
                java.lang.Object r2 = r2.get(r4)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto Laa
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                goto Laa
            La9:
            Laa:
                if (r1 != 0) goto Lc3
                r1 = r3
                goto Lc3
            Lae:
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r1 = r10.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lc3
                java.lang.String r1 = r10.getSimpleName()
            Lc3:
                return r1
        }

        public final boolean isInstance(java.lang.Object r4, java.lang.Class<?> r5) {
                r3 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getFUNCTION_CLASSES$cp()
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                java.lang.Object r0 = r0.get(r5)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L22
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r1 = 0
                boolean r2 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(r4, r0)
                return r2
            L22:
                boolean r0 = r5.isPrimitive()
                if (r0 == 0) goto L31
                kotlin.reflect.KClass r0 = kotlin.jvm.JvmClassMappingKt.getKotlinClass(r5)
                java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r0)
                goto L32
            L31:
                r0 = r5
            L32:
                boolean r1 = r0.isInstance(r4)
                return r1
        }
    }

    static {
            kotlin.jvm.internal.ClassReference$Companion r0 = new kotlin.jvm.internal.ClassReference$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.ClassReference.Companion = r0
            java.lang.Class<kotlin.jvm.functions.Function0> r2 = kotlin.jvm.functions.Function0.class
            java.lang.Class<kotlin.jvm.functions.Function1> r3 = kotlin.jvm.functions.Function1.class
            java.lang.Class<kotlin.jvm.functions.Function2> r4 = kotlin.jvm.functions.Function2.class
            java.lang.Class<kotlin.jvm.functions.Function3> r5 = kotlin.jvm.functions.Function3.class
            java.lang.Class<kotlin.jvm.functions.Function4> r6 = kotlin.jvm.functions.Function4.class
            java.lang.Class<kotlin.jvm.functions.Function5> r7 = kotlin.jvm.functions.Function5.class
            java.lang.Class<kotlin.jvm.functions.Function6> r8 = kotlin.jvm.functions.Function6.class
            java.lang.Class<kotlin.jvm.functions.Function7> r9 = kotlin.jvm.functions.Function7.class
            java.lang.Class<kotlin.jvm.functions.Function8> r10 = kotlin.jvm.functions.Function8.class
            java.lang.Class<kotlin.jvm.functions.Function9> r11 = kotlin.jvm.functions.Function9.class
            java.lang.Class<kotlin.jvm.functions.Function10> r12 = kotlin.jvm.functions.Function10.class
            java.lang.Class<kotlin.jvm.functions.Function11> r13 = kotlin.jvm.functions.Function11.class
            java.lang.Class<kotlin.jvm.functions.Function12> r14 = kotlin.jvm.functions.Function12.class
            java.lang.Class<kotlin.jvm.functions.Function13> r15 = kotlin.jvm.functions.Function13.class
            java.lang.Class<kotlin.jvm.functions.Function14> r16 = kotlin.jvm.functions.Function14.class
            java.lang.Class<kotlin.jvm.functions.Function15> r17 = kotlin.jvm.functions.Function15.class
            java.lang.Class<kotlin.jvm.functions.Function16> r18 = kotlin.jvm.functions.Function16.class
            java.lang.Class<kotlin.jvm.functions.Function17> r19 = kotlin.jvm.functions.Function17.class
            java.lang.Class<kotlin.jvm.functions.Function18> r20 = kotlin.jvm.functions.Function18.class
            java.lang.Class<kotlin.jvm.functions.Function19> r21 = kotlin.jvm.functions.Function19.class
            java.lang.Class<kotlin.jvm.functions.Function20> r22 = kotlin.jvm.functions.Function20.class
            java.lang.Class<kotlin.jvm.functions.Function21> r23 = kotlin.jvm.functions.Function21.class
            java.lang.Class<kotlin.jvm.functions.Function22> r24 = kotlin.jvm.functions.Function22.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = r0
            r5 = 0
            r6 = 0
            java.util.Iterator r7 = r4.iterator()
        L57:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L79
            java.lang.Object r8 = r7.next()
            int r9 = r6 + 1
            if (r6 >= 0) goto L68
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L68:
            r10 = r8
            java.lang.Class r10 = (java.lang.Class) r10
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            kotlin.Pair r6 = kotlin.TuplesKt.m122to(r10, r12)
            r3.add(r6)
            r6 = r9
            goto L57
        L79:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r3)
            kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r0
            r3 = 0
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "kotlin.Boolean"
            r2.put(r4, r5)
            java.lang.String r4 = "char"
            java.lang.String r6 = "kotlin.Char"
            r2.put(r4, r6)
            java.lang.String r4 = "byte"
            java.lang.String r7 = "kotlin.Byte"
            r2.put(r4, r7)
            java.lang.String r4 = "short"
            java.lang.String r8 = "kotlin.Short"
            r2.put(r4, r8)
            java.lang.String r4 = "int"
            java.lang.String r9 = "kotlin.Int"
            r2.put(r4, r9)
            java.lang.String r4 = "float"
            java.lang.String r10 = "kotlin.Float"
            r2.put(r4, r10)
            java.lang.String r4 = "long"
            java.lang.String r11 = "kotlin.Long"
            r2.put(r4, r11)
            java.lang.String r4 = "double"
            java.lang.String r12 = "kotlin.Double"
            r2.put(r4, r12)
            kotlin.jvm.internal.ClassReference.primitiveFqNames = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r0
            r3 = 0
            java.lang.String r4 = "java.lang.Boolean"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.Character"
            r2.put(r4, r6)
            java.lang.String r4 = "java.lang.Byte"
            r2.put(r4, r7)
            java.lang.String r4 = "java.lang.Short"
            r2.put(r4, r8)
            java.lang.String r4 = "java.lang.Integer"
            r2.put(r4, r9)
            java.lang.String r4 = "java.lang.Float"
            r2.put(r4, r10)
            java.lang.String r4 = "java.lang.Long"
            r2.put(r4, r11)
            java.lang.String r4 = "java.lang.Double"
            r2.put(r4, r12)
            kotlin.jvm.internal.ClassReference.primitiveWrapperFqNames = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r0
            r3 = 0
            java.lang.String r4 = "java.lang.Object"
            java.lang.String r5 = "kotlin.Any"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "kotlin.String"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.CharSequence"
            java.lang.String r5 = "kotlin.CharSequence"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.Throwable"
            java.lang.String r5 = "kotlin.Throwable"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.Cloneable"
            java.lang.String r5 = "kotlin.Cloneable"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.Number"
            java.lang.String r5 = "kotlin.Number"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.Comparable"
            java.lang.String r5 = "kotlin.Comparable"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.Enum"
            java.lang.String r5 = "kotlin.Enum"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.annotation.Annotation"
            java.lang.String r5 = "kotlin.Annotation"
            r2.put(r4, r5)
            java.lang.String r4 = "java.lang.Iterable"
            java.lang.String r5 = "kotlin.collections.Iterable"
            r2.put(r4, r5)
            java.lang.String r4 = "java.util.Iterator"
            java.lang.String r5 = "kotlin.collections.Iterator"
            r2.put(r4, r5)
            java.lang.String r4 = "java.util.Collection"
            java.lang.String r5 = "kotlin.collections.Collection"
            r2.put(r4, r5)
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "kotlin.collections.List"
            r2.put(r4, r5)
            java.lang.String r4 = "java.util.Set"
            java.lang.String r5 = "kotlin.collections.Set"
            r2.put(r4, r5)
            java.lang.String r4 = "java.util.ListIterator"
            java.lang.String r5 = "kotlin.collections.ListIterator"
            r2.put(r4, r5)
            java.lang.String r4 = "java.util.Map"
            java.lang.String r5 = "kotlin.collections.Map"
            r2.put(r4, r5)
            java.lang.String r4 = "java.util.Map$Entry"
            java.lang.String r5 = "kotlin.collections.Map.Entry"
            r2.put(r4, r5)
            java.lang.String r4 = "kotlin.jvm.internal.StringCompanionObject"
            java.lang.String r5 = "kotlin.String.Companion"
            r2.put(r4, r5)
            java.lang.String r4 = "kotlin.jvm.internal.EnumCompanionObject"
            java.lang.String r5 = "kotlin.Enum.Companion"
            r2.put(r4, r5)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = kotlin.jvm.internal.ClassReference.primitiveFqNames
            java.util.Map r4 = (java.util.Map) r4
            r2.putAll(r4)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = kotlin.jvm.internal.ClassReference.primitiveWrapperFqNames
            java.util.Map r4 = (java.util.Map) r4
            r2.putAll(r4)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = kotlin.jvm.internal.ClassReference.primitiveFqNames
            java.util.Collection r4 = r4.values()
            java.lang.String r5 = "primitiveFqNames.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L1a5:
            boolean r7 = r6.hasNext()
            r8 = 2
            r9 = 46
            if (r7 == 0) goto L1fe
            java.lang.Object r7 = r6.next()
            r10 = r2
            java.util.Map r10 = (java.util.Map) r10
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "kotlin.jvm.internal."
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r14 = "kotlinName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r14)
            java.lang.String r8 = kotlin.text.StringsKt.substringAfterLast$default(r11, r9, r1, r8, r1)
            java.lang.StringBuilder r8 = r13.append(r8)
            java.lang.String r9 = "CompanionObject"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r13 = ".Companion"
            java.lang.StringBuilder r9 = r9.append(r13)
            java.lang.String r9 = r9.toString()
            kotlin.Pair r8 = kotlin.TuplesKt.m122to(r8, r9)
            java.lang.Object r9 = r8.getFirst()
            java.lang.Object r8 = r8.getSecond()
            r10.put(r9, r8)
            goto L1a5
        L1fe:
            r4 = r2
            java.util.Map r4 = (java.util.Map) r4
            java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> r4 = kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L20b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L242
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.String r7 = r6.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "kotlin.Function"
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r10 = r10.toString()
            r2.put(r7, r10)
            goto L20b
        L242:
            kotlin.jvm.internal.ClassReference.classFqNames = r0
            java.util.HashMap<java.lang.String, java.lang.String> r0 = kotlin.jvm.internal.ClassReference.classFqNames
            java.util.Map r0 = (java.util.Map) r0
            r2 = 0
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = r0.size()
            int r4 = kotlin.collections.MapsKt.mapCapacity(r4)
            r3.<init>(r4)
            java.util.Map r3 = (java.util.Map) r3
            r4 = r0
            r5 = 0
            java.util.Set r6 = r4.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 0
            java.util.Iterator r10 = r6.iterator()
        L266:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L28a
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            r13 = 0
            java.lang.Object r12 = r12.getKey()
            r13 = r11
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            r14 = 0
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = kotlin.text.StringsKt.substringAfterLast$default(r13, r9, r1, r8, r1)
            r3.put(r12, r13)
            goto L266
        L28a:
            kotlin.jvm.internal.ClassReference.simpleNames = r3
            return
    }

    public ClassReference(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.jClass = r2
            return
    }

    public static final /* synthetic */ java.util.HashMap access$getClassFqNames$cp() {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = kotlin.jvm.internal.ClassReference.classFqNames
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getFUNCTION_CLASSES$cp() {
            java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> r0 = kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getSimpleNames$cp() {
            java.util.Map<java.lang.String, java.lang.String> r0 = kotlin.jvm.internal.ClassReference.simpleNames
            return r0
    }

    private final java.lang.Void error() {
            r1 = this;
            kotlin.jvm.KotlinReflectionNotSupportedError r0 = new kotlin.jvm.KotlinReflectionNotSupportedError
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void getSealedSubclasses$annotations() {
            return
    }

    public static /* synthetic */ void getSupertypes$annotations() {
            return
    }

    public static /* synthetic */ void getTypeParameters$annotations() {
            return
    }

    public static /* synthetic */ void getVisibility$annotations() {
            return
    }

    public static /* synthetic */ void isAbstract$annotations() {
            return
    }

    public static /* synthetic */ void isCompanion$annotations() {
            return
    }

    public static /* synthetic */ void isData$annotations() {
            return
    }

    public static /* synthetic */ void isFinal$annotations() {
            return
    }

    public static /* synthetic */ void isFun$annotations() {
            return
    }

    public static /* synthetic */ void isInner$annotations() {
            return
    }

    public static /* synthetic */ void isOpen$annotations() {
            return
    }

    public static /* synthetic */ void isSealed$annotations() {
            return
    }

    public static /* synthetic */ void isValue$annotations() {
            return
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.jvm.internal.ClassReference
            if (r0 == 0) goto L1a
            r0 = r2
            kotlin.reflect.KClass r0 = (kotlin.reflect.KClass) r0
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r0)
            r1 = r3
            kotlin.reflect.KClass r1 = (kotlin.reflect.KClass) r1
            java.lang.Class r1 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public java.util.Collection<kotlin.reflect.KFunction<java.lang.Object>> getConstructors() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public java.lang.Class<?> getJClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.jClass
            return r0
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public java.lang.Object getObjectInstance() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public java.lang.String getQualifiedName() {
            r2 = this;
            kotlin.jvm.internal.ClassReference$Companion r0 = kotlin.jvm.internal.ClassReference.Companion
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r0 = r0.getClassQualifiedName(r1)
            return r0
    }

    @Override // kotlin.reflect.KClass
    public java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> getSealedSubclasses() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public java.lang.String getSimpleName() {
            r2 = this;
            kotlin.jvm.internal.ClassReference$Companion r0 = kotlin.jvm.internal.ClassReference.Companion
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r0 = r0.getClassSimpleName(r1)
            return r0
    }

    @Override // kotlin.reflect.KClass
    public java.util.List<kotlin.reflect.KType> getSupertypes() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public kotlin.reflect.KVisibility getVisibility() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
            r1 = this;
            r0 = r1
            kotlin.reflect.KClass r0 = (kotlin.reflect.KClass) r0
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r0)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(java.lang.Object r3) {
            r2 = this;
            kotlin.jvm.internal.ClassReference$Companion r0 = kotlin.jvm.internal.ClassReference.Companion
            java.lang.Class r1 = r2.getJClass()
            boolean r0 = r0.isInstance(r3, r1)
            return r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
