package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFieldMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,762:1\n1#2:763\n1547#3:764\n1618#3,3:765\n1547#3:768\n1618#3,3:769\n1547#3:772\n1618#3,3:773\n*S KotlinDebug\n*F\n+ 1 FieldMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldMatcher\n*L\n751#1:764\n751#1:765,3\n753#1:768\n753#1:769,3\n755#1:772\n755#1:773,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010!\n\u0002\b\u0018\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u0002:\u0002\u0088\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00172\b\b\u0002\u0010\u0010\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001b\u001a\u00020\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ+\u0010\u001b\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010!\u001a\u00020\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b!\u0010\u001fJ+\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b!\u0010\u0013J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0017¢\u0006\u0004\b+\u0010,J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010.\u001a\u000200¢\u0006\u0004\b+\u00101J!\u0010+\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\u00172\b\b\u0002\u00103\u001a\u00020\u0017¢\u0006\u0004\b+\u00104J\u0015\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\b¢\u0006\u0004\b:\u0010\u000bJ\u0015\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u000205¢\u0006\u0004\b=\u00107J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u000208¢\u0006\u0004\b?\u0010;J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\b¢\u0006\u0004\b?\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000@¢\u0006\u0004\bB\u0010CJ!\u0010B\u001a\u00020\u00002\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000D\"\u00020\u0000¢\u0006\u0004\bB\u0010EJ\u0015\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000@¢\u0006\u0004\bI\u0010CJ!\u0010I\u001a\u00020\u00002\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000D\"\u00020\u0000¢\u0006\u0004\bI\u0010EJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010HJ\u001b\u0010K\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000@¢\u0006\u0004\bK\u0010CJ!\u0010K\u001a\u00020\u00002\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000D\"\u00020\u0000¢\u0006\u0004\bK\u0010EJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bL\u0010HJ\u0015\u0010M\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bM\u0010HJ&\u0010\u001b\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b\u001b\u0010RJ&\u0010!\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b!\u0010RJ&\u0010$\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b$\u0010RJ&\u0010(\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b(\u0010RJ&\u00106\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b6\u0010RJ&\u0010:\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b:\u0010RJ&\u0010=\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b=\u0010RJ&\u0010?\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b?\u0010RJ&\u0010B\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bB\u0010RJ&\u0010G\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bG\u0010RJ&\u0010I\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bI\u0010RJ&\u0010J\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bJ\u0010RJ&\u0010K\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bK\u0010RJ&\u0010L\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bL\u0010RJ&\u0010M\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bM\u0010RJ\u0017\u0010V\u001a\u00020\u00172\u0006\u0010U\u001a\u00020TH\u0014¢\u0006\u0004\bV\u0010WR(\u0010Y\u001a\u0004\u0018\u00010\f2\b\u0010X\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R(\u0010]\u001a\u0004\u0018\u00010\u00142\b\u0010X\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R(\u0010a\u001a\u0004\u0018\u00010\u001a2\b\u0010X\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR(\u0010e\u001a\u0004\u0018\u00010\u001a2\b\u0010X\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010dR(\u0010g\u001a\u0004\u0018\u00010#2\b\u0010X\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR(\u0010k\u001a\u0004\u0018\u0001052\b\u0010X\u001a\u0004\u0018\u0001058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR(\u0010o\u001a\u0004\u0018\u0001052\b\u0010X\u001a\u0004\u0018\u0001058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010l\u001a\u0004\bp\u0010nR4\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR4\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u0010uR4\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u0010s\u001a\u0004\by\u0010uR$\u0010\t\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010\nR$\u0010\r\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010|\"\u0004\b\u007f\u0010\nR(\u0010\u0015\u001a\u00020\u00172\u0006\u0010z\u001a\u00020\u00178G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u001b\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010|\"\u0005\b\u0085\u0001\u0010\nR&\u0010!\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010|\"\u0005\b\u0087\u0001\u0010\n¨\u0006\u0089\u0001"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "<init>", "()V", "Ljava/lang/reflect/Field;", "field", "(Ljava/lang/reflect/Field;)V", "", "descriptor", "(Ljava/lang/String;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "name", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "declaredClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "className", "type", "typeName", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "count", "annotationCount", "(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "readMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "readMethod", "addReadMethod", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "methodDescriptor", "writeMethods", "writeMethod", "addWriteMethod", "", "matchers", "allOf", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "", "([Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "matcher", "addAllOf", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "anyOf", "addAnyOf", "noneOf", "addNoneOf", "not", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/FieldMatcherList;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "nameMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "modifiersMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "classMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "typeMatcher", "getTypeMatcher", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getMethodsMatcher", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "getGetMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "putMethodsMatcher", "getPutMethodsMatcher", "", "allOfMatchers", "Ljava/util/List;", "getAllOfMatchers", "()Ljava/util/List;", "anyOfMatchers", "getAnyOfMatchers", "noneOfMatchers", "getNoneOfMatchers", "value", "getDescriptor", "()Ljava/lang/String;", "setDescriptor", "getName", "setName", "getModifiers", "()I", "setModifiers", "(I)V", "getDeclaredClass", "setDeclaredClass", "getType", "setType", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> allOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> anyOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher classMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.MethodsMatcher getMethodsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> noneOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.MethodsMatcher putMethodsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "field", "Ljava/lang/reflect/Field;", "descriptor", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.FieldMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>()
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.FieldMatcher create(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.FieldMatcher create(@Yue.InterfaceC4418 java.lang.reflect.Field r2) {
                r1 = this;
                java.lang.String r0 = "field"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.FieldMatcher.Companion = r0
            return
    }

    public FieldMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public FieldMatcher(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.descriptor(r2)
            return
    }

    public FieldMatcher(@Yue.InterfaceC4418 java.lang.reflect.Field r2) {
            r1 = this;
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getFieldDescriptor(r2)
            r1.descriptor(r2)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create() {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.create()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create(@Yue.InterfaceC4418 java.lang.reflect.Field r1) {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = r0.create(r1)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher modifiers$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher name$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher type$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addAllOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAllOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addAllOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.allOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.allOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addAnnotation(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotation"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Le:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addAnyOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnyOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addAnyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.anyOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.anyOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addNoneOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addNoneOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addNoneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.noneOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.noneOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addReadMethod(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "methodDescriptor"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.getMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r2.getMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "readMethod"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.getMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r1.getMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addWriteMethod(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "methodDescriptor"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.putMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r2.putMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "writeMethod"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.putMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r1.putMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher allOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.FieldMatcherList r0 = new org.luckypray.dexkit.query.FieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.allOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher allOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r3) {
            r2 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L16
            java.util.List r1 = Yue.C1219.m6540(r3)
        L16:
            r2.allOfMatchers = r1
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher allOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.allOf(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        L9:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        L9:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Le:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Le:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher annotations(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotations(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            Yue.C3329.m13906(r2, r0)
            r1.annotationsMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher anyOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.FieldMatcherList r0 = new org.luckypray.dexkit.query.FieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.anyOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher anyOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r3) {
            r2 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L16
            java.util.List r1 = Yue.C1219.m6540(r3)
        L16:
            r2.anyOfMatchers = r1
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher anyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.anyOf(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.declaredClass(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r1, r2, r3, r4, r5, r6)
            r7.classMatcher = r8
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r8 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.FieldMatcher r8 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.classMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "declaredClass"
            Yue.C3329.m13906(r2, r0)
            r1.classMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher descriptor(@Yue.InterfaceC4418 java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r14, r0)
            org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
            r0.<init>(r14)
            java.lang.String r2 = r0.getName()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r13
            name$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = r0.getClassName()
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r13
            declaredClass$default(r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = r0.getTypeName()
            type$default(r1, r2, r3, r4, r5, r6)
            return r13
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> getAllOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.allOfMatchers
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> getAnyOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.anyOfMatchers
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.ClassMatcher getClassMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.classMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDeclaredClass() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDescriptor() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getGetMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.getMethodsMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher getModifiersMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r1.modifiersMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getName() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getNameMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.nameMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> getNoneOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.noneOfMatchers
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getPutMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.putMethodsMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getType() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.ClassMatcher getTypeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.typeMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r15) {
            r14 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r15, r0)
            org.luckypray.dexkit.schema.-FieldMatcher$Companion r1 = org.luckypray.dexkit.schema.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r14.nameMatcher
            r2 = 0
            if (r0 == 0) goto L12
            int r0 = r0.build$dexkit_android_release(r15)
            r3 = r0
            goto L13
        L12:
            r3 = r2
        L13:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r14.modifiersMatcher
            if (r0 == 0) goto L1d
            int r0 = r0.build$dexkit_android_release(r15)
            r4 = r0
            goto L1e
        L1d:
            r4 = r2
        L1e:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r14.classMatcher
            if (r0 == 0) goto L28
            int r0 = r0.build$dexkit_android_release(r15)
            r5 = r0
            goto L29
        L28:
            r5 = r2
        L29:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r14.typeMatcher
            if (r0 == 0) goto L33
            int r0 = r0.build$dexkit_android_release(r15)
            r6 = r0
            goto L34
        L33:
            r6 = r2
        L34:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r14.annotationsMatcher
            if (r0 == 0) goto L3e
            int r0 = r0.build$dexkit_android_release(r15)
            r7 = r0
            goto L3f
        L3e:
            r7 = r2
        L3f:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r14.getMethodsMatcher
            if (r0 == 0) goto L49
            int r0 = r0.build$dexkit_android_release(r15)
            r8 = r0
            goto L4a
        L49:
            r8 = r2
        L4a:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r14.putMethodsMatcher
            if (r0 == 0) goto L54
            int r0 = r0.build$dexkit_android_release(r15)
            r9 = r0
            goto L55
        L54:
            r9 = r2
        L55:
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r14.allOfMatchers
            r10 = 10
            if (r0 == 0) goto L8b
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = Yue.C1210.m6231(r0, r10)
            r11.<init>(r12)
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L80
            java.lang.Object r12 = r0.next()
            org.luckypray.dexkit.query.matchers.FieldMatcher r12 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r12
            int r12 = r12.build$dexkit_android_release(r15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            goto L68
        L80:
            int[] r0 = Yue.C1219.m6536(r11)
            if (r0 == 0) goto L8b
            int r0 = r15.createVectorOfTables(r0)
            goto L8c
        L8b:
            r0 = r2
        L8c:
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r11 = r14.anyOfMatchers
            if (r11 == 0) goto Lc0
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = Yue.C1210.m6231(r11, r10)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L9d:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto Lb5
            java.lang.Object r13 = r11.next()
            org.luckypray.dexkit.query.matchers.FieldMatcher r13 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r13
            int r13 = r13.build$dexkit_android_release(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.add(r13)
            goto L9d
        Lb5:
            int[] r11 = Yue.C1219.m6536(r12)
            if (r11 == 0) goto Lc0
            int r11 = r15.createVectorOfTables(r11)
            goto Lc1
        Lc0:
            r11 = r2
        Lc1:
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r12 = r14.noneOfMatchers
            if (r12 == 0) goto Lf4
            java.util.ArrayList r13 = new java.util.ArrayList
            int r10 = Yue.C1210.m6231(r12, r10)
            r13.<init>(r10)
            java.util.Iterator r10 = r12.iterator()
        Ld2:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lea
            java.lang.Object r12 = r10.next()
            org.luckypray.dexkit.query.matchers.FieldMatcher r12 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r12
            int r12 = r12.build$dexkit_android_release(r15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.add(r12)
            goto Ld2
        Lea:
            int[] r10 = Yue.C1219.m6536(r13)
            if (r10 == 0) goto Lf4
            int r2 = r15.createVectorOfTables(r10)
        Lf4:
            r12 = r2
            r2 = r15
            r10 = r0
            int r0 = r1.createFieldMatcher(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = modifiers$default(r2, r3, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(int r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r0.<init>(r2, r3)
            r1.modifiersMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "modifiers"
            Yue.C3329.m13906(r2, r0)
            r1.modifiersMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.FieldMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.nameMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            r1.nameMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher noneOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.FieldMatcherList r0 = new org.luckypray.dexkit.query.FieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.noneOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher noneOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r3) {
            r2 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L16
            java.util.List r1 = Yue.C1219.m6540(r3)
        L16:
            r2.noneOfMatchers = r1
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher noneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.noneOf(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher not(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.not(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher not(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.addNoneOf(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher readMethods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.readMethods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher readMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "readMethods"
            Yue.C3329.m13906(r2, r0)
            r1.getMethodsMatcher = r2
            return r1
    }

    public final /* synthetic */ void setDeclaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            declaredClass$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setDescriptor(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.descriptor(r2)
            return
    }

    public final /* synthetic */ void setModifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            modifiers$default(r2, r3, r0, r1, r0)
            return
    }

    public final /* synthetic */ void setName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            name$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setType(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            type$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher type(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.type(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r1, r2, r3, r4, r5, r6)
            r7.typeMatcher = r8
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.FieldMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.typeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "type"
            Yue.C3329.m13906(r2, r0)
            r1.typeMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher writeMethods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.writeMethods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.FieldMatcher writeMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "writeMethods"
            Yue.C3329.m13906(r2, r0)
            r1.putMethodsMatcher = r2
            return r1
    }
}
